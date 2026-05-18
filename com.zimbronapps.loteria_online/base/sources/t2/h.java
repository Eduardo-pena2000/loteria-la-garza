package T2;

import android.media.AudioFocusRequest;
import android.media.AudioManager;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract /* synthetic */ class h {
    public static /* bridge */ /* synthetic */ AudioFocusRequest.Builder a(AudioFocusRequest.Builder builder, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        return builder.setOnAudioFocusChangeListener(onAudioFocusChangeListener);
    }
}
