package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgec {
    private final zzika zza;
    private final zzika zzb;
    private final zzika zzc;
    private final ExecutorService zzd;
    private final zzgoe zze;

    public zzgec(zzika zzikaVar, zzika zzikaVar2, zzika zzikaVar3, ExecutorService executorService, zzgoe zzgoeVar) {
        this.zza = zzikaVar;
        this.zzb = zzikaVar2;
        this.zzc = zzikaVar3;
        this.zzd = executorService;
        this.zze = zzgoeVar;
    }

    private final x7.e zze(int i) {
        return (zzgzg) zzgzo.zzj(zzgzg.zzw(zzgzo.zzd(new zzgdy(this, i), this.zzd)), zzgdz.zza, zzhaf.zza());
    }

    public final /* synthetic */ zzgoe zza() {
        return this.zze;
    }

    public final x7.e zzb(int i, boolean z) {
        x7.e zze = zze(i);
        return (!z || i == 2) ? zze : (zzgzg) zzgzo.zzj((zzgzg) zzgzo.zzg(zzgzg.zzw(zze), Throwable.class, zzgeb.zza, zzhaf.zza()), new zzgdx(this), zzhaf.zza());
    }

    public final /* synthetic */ zzgdv zzc(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return (zzgdv) this.zza.zzb();
        }
        if (i2 == 2) {
            return (zzgdv) this.zzb.zzb();
        }
        if (i2 == 3) {
            return (zzgdv) this.zzc.zzb();
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ x7.e zzd(int i) {
        return zze(2);
    }
}
