package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfro {
    private final Object zza;
    private final long zzb;
    private final E6.f zzc;
    private final long zzd = ((Long) S5.D.c().zzd(zzbhe.zzW)).longValue() * 1000;
    private final double zze;
    private final int zzf;

    public zzfro(Object obj, E6.f fVar, double d, int i) {
        this.zza = obj;
        this.zzc = fVar;
        this.zzb = fVar.a();
        this.zze = d;
        this.zzf = i;
    }

    public final Object zza() {
        return this.zza;
    }

    public final boolean zzb() {
        return this.zzc.a() >= this.zzb + this.zzd;
    }

    public final long zzc() {
        return (this.zzd + Math.min(Math.max(((Long) S5.D.c().zzd(zzbhe.zzF)).longValue(), -900000L), 10000L)) - (this.zzc.a() - this.zzb);
    }

    public final long zzd() {
        return this.zzb;
    }

    public final double zze() {
        return this.zze;
    }

    public final int zzf() {
        return this.zzf;
    }
}
