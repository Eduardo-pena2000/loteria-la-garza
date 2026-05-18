package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcmc {
    private final W5.a zza;
    private final Context zzb;
    private final long zzc;
    private final WeakReference zzd;

    public /* synthetic */ zzcmc(zzcmb zzcmbVar, byte[] bArr) {
        this.zza = zzcmbVar.zzd();
        this.zzb = zzcmbVar.zze();
        this.zzd = zzcmbVar.zzg();
        this.zzc = zzcmbVar.zzf();
    }

    public static int zzj() {
        return ((Integer) S5.D.c().zzd(zzbhe.zzT)).intValue();
    }

    public final Context zza() {
        return this.zzb;
    }

    public final Context zzb() {
        return this.zzb;
    }

    public final WeakReference zzc() {
        return this.zzd;
    }

    public final W5.a zzd() {
        return this.zza;
    }

    public final String zze() {
        return R5.t.g().R(this.zzb, this.zza.a);
    }

    public final zzclz zzf() {
        return new zzclz(this.zzb, this.zza);
    }

    public final R5.k zzg() {
        return new R5.k(this.zzb, this.zza);
    }

    public final zzbjy zzh() {
        return new zzbjy(this.zzb);
    }

    public final long zzi() {
        return this.zzc;
    }
}
