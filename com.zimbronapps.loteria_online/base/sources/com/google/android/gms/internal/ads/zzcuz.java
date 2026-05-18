package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcuz implements zzdbz {
    private final zzcjl zza;
    private final zzdxz zzb;
    private final zzfir zzc;

    public zzcuz(zzcjl zzcjlVar, zzdxz zzdxzVar, zzfir zzfirVar) {
        this.zza = zzcjlVar;
        this.zzb = zzdxzVar;
        this.zzc = zzfirVar;
    }

    public final void zzdr() {
        zzcjl zzcjlVar;
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzos)).booleanValue() || (zzcjlVar = this.zza) == null) {
            return;
        }
        String str = true != V5.c.a(zzcjlVar.zzE()) ? "0" : "1";
        zzdxy zza = this.zzb.zza();
        zza.zzc("action", "hcp");
        zza.zzc("hcp", str);
        zza.zzb(this.zzc);
        zza.zzd();
    }
}
