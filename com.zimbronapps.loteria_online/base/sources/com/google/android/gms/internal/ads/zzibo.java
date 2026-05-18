package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzibo implements zzibf {
    final int zza;
    final zzies zzb;
    final boolean zzc;
    final boolean zzd;

    public zzibo(zzibw zzibwVar, int i, zzies zziesVar, boolean z, boolean z2) {
        this.zza = i;
        this.zzb = zziesVar;
        this.zzc = z;
        this.zzd = z2;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return this.zza - ((zzibo) obj).zza;
    }

    public final int zza() {
        return this.zza;
    }

    public final zzies zzb() {
        return this.zzb;
    }

    public final zziet zzc() {
        return this.zzb.zza();
    }

    public final boolean zzd() {
        return this.zzc;
    }

    public final boolean zze() {
        return this.zzd;
    }
}
