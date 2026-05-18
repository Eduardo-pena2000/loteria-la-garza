package j3;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.Spatializer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract /* synthetic */ class u {
    public static /* bridge */ /* synthetic */ boolean a(Spatializer spatializer, AudioAttributes audioAttributes, AudioFormat audioFormat) {
        return spatializer.canBeSpatialized(audioAttributes, audioFormat);
    }
}
