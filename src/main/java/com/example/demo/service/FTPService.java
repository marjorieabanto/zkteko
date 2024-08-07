package com.example.demo.service;
import com.example.demo.model.Ftp;
import org.apache.commons.net.PrintCommandListener;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

@Service
public class FTPService {

    @Autowired
    private Ftp ftpConfig;

    public boolean checkFTPConnection() {
        FTPClient ftpClient = new FTPClient();
        try {
            ftpClient.connect(ftpConfig.getHost(), ftpConfig.getPort());
            boolean login = ftpClient.login(ftpConfig.getUsername(), ftpConfig.getPassword());
            ftpClient.logout();
            ftpClient.disconnect();
            return login;
        } catch (IOException ex) {
            ex.printStackTrace();
            return false;
        } finally {
            if (ftpClient.isConnected()) {
                try {
                    ftpClient.disconnect();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public void uploadFile(File file) throws IOException {
        FTPClient ftpClient = new FTPClient();
        try {
            ftpClient.connect(ftpConfig.getHost(), ftpConfig.getPort());
            ftpClient.login(ftpConfig.getUsername(), ftpConfig.getPassword());
            ftpClient.enterLocalPassiveMode();
            ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);

            // Log commands and replies for debugging
            ftpClient.addProtocolCommandListener(new PrintCommandListener(new PrintWriter(System.out)));

            String remoteFilePath = "/OCUPACIONAL/huellas/" + file.getName();
            try (FileInputStream fis = new FileInputStream(file)) {
                boolean done = ftpClient.storeFile(remoteFilePath, fis);
                if (done) {
                    System.out.println("File uploaded successfully.");
                } else {
                    System.out.println("File upload failed.");
                }
            }

            // List files in the remote directory to verify the upload
            FTPFile[] files = ftpClient.listFiles("/OCUPACIONAL/huellas");
            for (FTPFile ftpFile : files) {
                System.out.println("File: " + ftpFile.getName());
            }
        } finally {
            if (ftpClient.isConnected()) {
                ftpClient.logout();
                ftpClient.disconnect();
            }
        }
    }
}
