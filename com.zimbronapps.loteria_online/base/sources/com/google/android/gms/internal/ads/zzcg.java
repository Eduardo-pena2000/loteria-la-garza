package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzcg implements AudioManager.OnAudioFocusChangeListener {
    private final Handler zza;
    private final AudioManager.OnAudioFocusChangeListener zzb;

    public zzcg(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.zzb = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        String str = zzfj.zza;
        this.zza = new Handler(looper, (Handler.Callback) null);
    }

    public final void onAudioFocusChange(int i) {
        zzfj.zzd(this.zza, new zzcf(this, i));
    }

    public final /* synthetic */ void zza(int i) {
        this.zzb.onAudioFocusChange(i);
    }
}
