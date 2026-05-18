package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdpi {
    private final zzdxz zza;

    public zzdpi(zzdxz zzdxzVar) {
        this.zza = zzdxzVar;
    }

    public final void zza(View view, zzfir zzfirVar) {
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzos)).booleanValue() || view == null) {
            return;
        }
        String str = true != V5.c.a(view) ? "0" : "1";
        zzdxy zza = this.zza.zza();
        zza.zzc("action", "hcp");
        zza.zzc("hcp", str);
        zza.zzb(zzfirVar);
        zza.zzd();
    }
}
