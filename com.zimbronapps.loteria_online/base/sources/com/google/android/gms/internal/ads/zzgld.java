package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgld implements zzgky {
    private final zzgct zza;
    private final zzgct zzb;
    private final zzgct zzc;
    private final zzgct zzd;
    private final zzika zze;
    private final zzika zzf;
    private final File zzg;
    private final ExecutorService zzh;
    private final zzgoe zzi;

    public zzgld(zzgct zzgctVar, zzgct zzgctVar2, zzika zzikaVar, zzgct zzgctVar3, zzgct zzgctVar4, zzika zzikaVar2, File file, ExecutorService executorService, zzgoe zzgoeVar) {
        this.zza = zzgctVar;
        this.zzc = zzgctVar2;
        this.zze = zzikaVar;
        this.zzb = zzgctVar3;
        this.zzd = zzgctVar4;
        this.zzf = zzikaVar2;
        this.zzg = file;
        this.zzh = executorService;
        this.zzi = zzgoeVar;
    }

    private final x7.e zzj(byte[] bArr) {
        x7.e zzc = this.zzd.zzc(bArr);
        this.zzi.zze(15305, zzc);
        return zzc;
    }

    private final x7.e zzk(zzgdu zzgduVar) {
        x7.e zzc = this.zzb.zzc(zzgduVar);
        this.zzi.zze(15303, zzc);
        return zzc;
    }

    public final x7.e zza() {
        return zzgzo.zzd(new zzglc(this), this.zzh);
    }

    public final x7.e zzb() {
        x7.e zzb = this.zza.zzb();
        this.zzi.zze(15302, zzb);
        return zzb;
    }

    public final x7.e zzc(zzgdu zzgduVar, byte[] bArr, byte[] bArr2) {
        x7.e zzc = ((zzgct) this.zzf.zzb()).zzc(bArr);
        this.zzi.zze(15307, zzc);
        return (zzgzg) zzgzo.zzj(zzgzg.zzw(zzgzo.zzl(zzc, zzj(bArr2))), new zzglb(this, zzgduVar), zzhaf.zza());
    }

    public final x7.e zzd(zzgdu zzgduVar, byte[] bArr) {
        return (zzgzg) zzgzo.zzj(zzgzg.zzw(zzj(bArr)), new zzgla(this, zzgduVar), zzhaf.zza());
    }

    public final x7.e zze() {
        zzgzg zzgzgVar = (zzgzg) zzgzo.zzk(zzgzg.zzw(this.zza.zzb()), new zzgkz(this), zzhaf.zza());
        this.zzi.zze(15314, zzgzgVar);
        return zzgzgVar;
    }

    public final /* synthetic */ boolean zzf() {
        try {
            zzgct zzgctVar = this.zzb;
            File zza = zzgctVar.zza();
            if (zza.exists()) {
                File zza2 = ((zzgct) this.zzf.zzb()).zza();
                File zza3 = ((zzgct) this.zze.zzb()).zza();
                try {
                    if (zza2.exists()) {
                        File parentFile = zza3.getParentFile();
                        if (parentFile != null) {
                            zzfws.zze(parentFile);
                        }
                        zzgxm.zzb(zza3);
                        zzgxm.zzc(zza2, zza3);
                    }
                    File zza4 = this.zzd.zza();
                    File zza5 = this.zzc.zza();
                    try {
                        if (zza4.exists()) {
                            zzgxm.zzb(zza5);
                            zzgxm.zzc(zza4, zza5);
                        }
                        File zza6 = this.zza.zza();
                        try {
                            if (zza.exists()) {
                                zzgxm.zzb(zza6);
                                zzgxm.zzc(zza, zza6);
                            }
                            this.zzb.zza().delete();
                            ((zzgct) this.zzf.zzb()).zza().delete();
                            this.zzd.zza().delete();
                            return true;
                        } catch (IOException | SecurityException e) {
                            this.zzi.zzd(15313, e);
                            zzgctVar = this.zzb;
                        }
                    } catch (IOException | SecurityException e2) {
                        this.zzi.zzd(15312, e2);
                        zzgctVar = this.zzb;
                    }
                } catch (IOException e3) {
                    e = e3;
                    this.zzi.zzd(15311, e);
                    zzgctVar = this.zzb;
                    zzgctVar.zza().delete();
                    ((zzgct) this.zzf.zzb()).zza().delete();
                    this.zzd.zza().delete();
                    return false;
                } catch (SecurityException e4) {
                    e = e4;
                    this.zzi.zzd(15311, e);
                    zzgctVar = this.zzb;
                    zzgctVar.zza().delete();
                    ((zzgct) this.zzf.zzb()).zza().delete();
                    this.zzd.zza().delete();
                    return false;
                }
            }
            zzgctVar.zza().delete();
            ((zzgct) this.zzf.zzb()).zza().delete();
            this.zzd.zza().delete();
            return false;
        } catch (Throwable th) {
            this.zzb.zza().delete();
            ((zzgct) this.zzf.zzb()).zza().delete();
            this.zzd.zza().delete();
            throw th;
        }
    }

    public final /* synthetic */ zzfwq zzg(zzgdu zzgduVar) {
        if (zzgduVar == null || zzgduVar.equals(zzgdu.zzg())) {
            return null;
        }
        zzbcp zza = zzgduVar.zza();
        File zza2 = ((zzgct) this.zze.zzb()).zza();
        zzgct zzgctVar = this.zzc;
        return new zzfwq(zza, zza2, zzgctVar.zza(), this.zzg);
    }

    public final /* synthetic */ x7.e zzh(zzgdu zzgduVar, Void r2) {
        return zzk(zzgduVar);
    }

    public final /* synthetic */ x7.e zzi(zzgdu zzgduVar, List list) {
        return zzk(zzgduVar);
    }
}
