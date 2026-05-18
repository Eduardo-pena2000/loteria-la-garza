package com.google.android.gms.internal.ads;

import android.media.AudioRouting;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzrt implements AudioRouting.OnRoutingChangedListener {
    private final /* synthetic */ zzru zza;

    public /* synthetic */ zzrt(zzru zzruVar) {
        this.zza = zzruVar;
    }

    public final /* synthetic */ void onRoutingChanged(AudioRouting audioRouting) {
        this.zza.zza(audioRouting);
    }
}
