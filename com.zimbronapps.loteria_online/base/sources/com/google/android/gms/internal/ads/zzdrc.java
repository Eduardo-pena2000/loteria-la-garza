package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzdrc implements zzchc {
    private final /* synthetic */ zzcen zza;

    public /* synthetic */ zzdrc(zzcen zzcenVar) {
        this.zza = zzcenVar;
    }

    public final /* synthetic */ void zza(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("mediaUrl", str);
        this.zza.zzc(bundle);
    }
}
