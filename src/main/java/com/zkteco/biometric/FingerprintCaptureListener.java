//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.zkteco.biometric;

public interface FingerprintCaptureListener {
    void captureOK(byte[] var1);

    void captureError(int var1);

    void extractOK(byte[] var1);
}
