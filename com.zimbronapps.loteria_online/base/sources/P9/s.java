package p9;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract /* synthetic */ class s {
    public static /* bridge */ /* synthetic */ boolean a(AudioManager audioManager, AudioDeviceInfo audioDeviceInfo) {
        return audioManager.setCommunicationDevice(audioDeviceInfo);
    }
}
