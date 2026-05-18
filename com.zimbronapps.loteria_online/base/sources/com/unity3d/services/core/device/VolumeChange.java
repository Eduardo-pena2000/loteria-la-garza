package com.unity3d.services.core.device;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface VolumeChange {
    void clearAllListeners();

    void registerListener(VolumeChangeListener volumeChangeListener);

    void startObserving();

    void stopObserving();

    void unregisterListener(VolumeChangeListener volumeChangeListener);
}
