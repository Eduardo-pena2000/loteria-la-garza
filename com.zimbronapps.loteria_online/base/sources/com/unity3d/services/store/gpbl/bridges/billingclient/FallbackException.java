package com.unity3d.services.store.gpbl.bridges.billingclient;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class FallbackException extends Exception {
    private final int detectedVersion;

    public FallbackException(int i) {
        this.detectedVersion = i;
    }

    public final int getDetectedVersion() {
        return this.detectedVersion;
    }
}
