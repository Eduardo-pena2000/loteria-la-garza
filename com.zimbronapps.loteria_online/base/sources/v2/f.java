package V2;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract /* synthetic */ class f {
    public static /* bridge */ /* synthetic */ boolean a(AudioFormat audioFormat, AudioAttributes audioAttributes) {
        return AudioTrack.isDirectPlaybackSupported(audioFormat, audioAttributes);
    }
}
