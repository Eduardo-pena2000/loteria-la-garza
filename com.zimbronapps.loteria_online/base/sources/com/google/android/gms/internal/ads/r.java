package com.google.android.gms.internal.ads;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract /* synthetic */ class r {
    public static /* bridge */ /* synthetic */ AudioFocusRequest.Builder a(AudioFocusRequest.Builder builder, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        return builder.setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler);
    }
}
