package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzalh implements zzafy {
    final /* synthetic */ zzali zza;

    public /* synthetic */ zzalh(zzali zzaliVar, byte[] bArr) {
        Objects.requireNonNull(zzaliVar);
        this.zza = zzaliVar;
    }

    public final long zza() {
        zzali zzaliVar = this.zza;
        return zzaliVar.zzf().zzh(zzaliVar.zzg());
    }

    public final boolean zzb() {
        return true;
    }

    public final zzafw zzc(long j) {
        zzali zzaliVar = this.zza;
        long zzd = zzaliVar.zzd() + BigInteger.valueOf(zzaliVar.zzf().zzi(j)).multiply(BigInteger.valueOf(zzaliVar.zze() - zzaliVar.zzd())).divide(BigInteger.valueOf(zzaliVar.zzg())).longValue();
        String str = zzfj.zza;
        zzafz zzafzVar = new zzafz(j, Math.max(zzaliVar.zzd(), Math.min(zzd - 30000, zzaliVar.zze() - 1)));
        return new zzafw(zzafzVar, zzafzVar);
    }
}
