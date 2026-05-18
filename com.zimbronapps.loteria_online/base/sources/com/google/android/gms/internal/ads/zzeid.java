package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeid implements zzfnv {
    private final zzehr zza;
    private final zzehv zzb;

    public zzeid(zzehr zzehrVar, zzehv zzehvVar) {
        this.zza = zzehrVar;
        this.zzb = zzehvVar;
    }

    public final void zzdK(zzfno zzfnoVar, String str) {
    }

    public final void zzdL(zzfno zzfnoVar, String str) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzhf)).booleanValue()) {
            if (zzfno.RENDERER == zzfnoVar) {
                this.zza.zzg(R5.t.o().b());
                return;
            }
            if (zzfno.PRELOADED_LOADER == zzfnoVar || zzfno.SERVER_TRANSACTION == zzfnoVar) {
                zzehr zzehrVar = this.zza;
                zzehrVar.zza(R5.t.o().b());
                zzehv zzehvVar = this.zzb;
                zzehvVar.zza.zza(new zzehu(zzehvVar, zzehrVar.zzb()));
            }
        }
    }

    public final void zzdM(zzfno zzfnoVar, String str, Throwable th) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzhf)).booleanValue() && zzfno.RENDERER == zzfnoVar) {
            zzehr zzehrVar = this.zza;
            if (zzehrVar.zzh() != 0) {
                zzehrVar.zzi(R5.t.o().b() - zzehrVar.zzh());
            }
        }
    }

    public final void zzdN(zzfno zzfnoVar, String str) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzhf)).booleanValue() && zzfno.RENDERER == zzfnoVar) {
            zzehr zzehrVar = this.zza;
            if (zzehrVar.zzh() != 0) {
                zzehrVar.zzi(R5.t.o().b() - zzehrVar.zzh());
            }
        }
    }
}
