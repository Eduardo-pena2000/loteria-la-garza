package V2;

import android.media.AudioAttributes;
import android.media.AudioManager;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract /* synthetic */ class g {
    public static /* bridge */ /* synthetic */ List a(AudioManager audioManager, AudioAttributes audioAttributes) {
        return audioManager.getAudioDevicesForAttributes(audioAttributes);
    }
}
