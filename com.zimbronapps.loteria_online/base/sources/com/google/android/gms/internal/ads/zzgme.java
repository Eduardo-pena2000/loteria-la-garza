package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgme implements zzgky {
    private final zzgjd zza;
    private final ExecutorService zzb;
    private final zzgoe zzc;

    public zzgme(zzgjd zzgjdVar, ExecutorService executorService, zzgoe zzgoeVar) {
        this.zza = zzgjdVar;
        this.zzb = executorService;
        this.zzc = zzgoeVar;
    }

    public final x7.e zza() {
        return zzgzo.zza(Boolean.TRUE);
    }

    public final x7.e zzb() {
        x7.e zzd = zzgzo.zzd(new zzgmd(this), this.zzb);
        this.zzc.zze(15302, zzd);
        return zzd;
    }

    public final x7.e zzc(zzgdu zzgduVar, byte[] bArr, byte[] bArr2) {
        x7.e zzd = zzgzo.zzd(new zzgmc(this, zzgduVar, bArr, bArr2), this.zzb);
        this.zzc.zze(15321, zzd);
        return zzd;
    }

    public final x7.e zzd(zzgdu zzgduVar, byte[] bArr) {
        x7.e zzd = zzgzo.zzd(new zzgmb(this, zzgduVar, bArr), this.zzb);
        this.zzc.zze(15305, zzd);
        return zzd;
    }

    public final x7.e zze() {
        x7.e zzd = zzgzo.zzd(new zzgma(this), this.zzb);
        this.zzc.zze(15314, zzd);
        return zzd;
    }

    public final /* synthetic */ zzgdu zzf() {
        zzgdu zzc = this.zza.zzc(1);
        return zzc == null ? zzgdu.zzg() : zzc;
    }

    public final /* synthetic */ zzfwq zzg() {
        return this.zza.zzb(1);
    }

    public final /* synthetic */ Void zzh(zzgdu zzgduVar, byte[] bArr) {
        this.zza.zza(zzgduVar, null, bArr);
        return null;
    }

    public final /* synthetic */ Void zzi(zzgdu zzgduVar, byte[] bArr, byte[] bArr2) {
        this.zza.zza(zzgduVar, bArr, bArr2);
        return null;
    }
}
