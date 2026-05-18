package com.google.android.gms.internal.ads;

import android.media.AudioManager;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzca implements AudioManager.OnAudioFocusChangeListener {
    private final /* synthetic */ zzcd zza;

    public /* synthetic */ zzca(zzcd zzcdVar) {
        this.zza = zzcdVar;
    }

    public final /* synthetic */ void onAudioFocusChange(int i) {
        this.zza.zze(i);
    }
}
