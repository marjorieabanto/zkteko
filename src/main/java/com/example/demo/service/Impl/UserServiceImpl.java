package com.example.demo.service.Impl;

import com.example.demo.model.Fingerprint;
import com.example.demo.model.User;
import com.example.demo.repository.FingerPrintRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import com.zkteco.biometric.FingerprintSensorEx;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    public final UserRepository userRepository;


    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;

    }

    @Override
    public User createUser(User user, String fingerprintBase64) {

        return null;
    }

    @Override
    public User getUserByFingerprint(String fingerprint) {
        return null;
    }

    @Override
    public Boolean deleteUserByFingerprint(String fingerprint) {
        return null;
    }

    @Override
    public Boolean validateUserByFingerprint(String fingerprint) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> fetchById(long id) {
        return userRepository.findById(id);
    }

}
