package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgkn implements zzgkg {
    private final Context zza;
    private final zzika zzb;
    private final zzgkx zzc;
    private final zzgoe zzd;
    private final ExecutorService zze;
    private final zzgje zzf;
    private final zzfvh zzg;

    public zzgkn(Context context, zzika zzikaVar, zzgkx zzgkxVar, zzgoe zzgoeVar, ExecutorService executorService, zzgje zzgjeVar, zzfvh zzfvhVar) {
        this.zza = context;
        this.zzb = zzikaVar;
        this.zzc = zzgkxVar;
        this.zzd = zzgoeVar;
        this.zze = executorService;
        this.zzf = zzgjeVar;
        this.zzg = zzfvhVar;
    }

    public static /* synthetic */ zzgds zze(zzgkh zzgkhVar) {
        return zzf(5);
    }

    private static zzgds zzf(int i) {
        zzgdr zzd = zzgds.zzd();
        zzd.zze(i);
        return (zzgds) zzd.zzbu();
    }

    public final x7.e zza() {
        zzika zzikaVar = this.zzb;
        Objects.requireNonNull(zzikaVar);
        zzgki zzgkiVar = new zzgki(zzikaVar);
        ExecutorService executorService = this.zze;
        zzgzg zzgzgVar = (zzgzg) zzgzo.zzg((zzgzg) zzgzo.zzk((zzgzg) zzgzo.zzj((zzgzg) zzgzo.zzk(zzgzg.zzw(zzgzo.zzd(zzgkiVar, executorService)), new zzgkm(this), zzhaf.zza()), new zzgkj(this), zzhaf.zza()), new zzgkk(this), executorService), zzgkh.class, zzgkl.zza, zzhaf.zza());
        this.zzd.zze(15202, zzgzgVar);
        return zzgzgVar;
    }

    public final /* synthetic */ int zzb(zzbch zzbchVar) {
        if (zzfwe.zza(zzbchVar)) {
            return 0;
        }
        this.zzd.zzc(15204, zzbchVar.name());
        throw new zzgkh(null);
    }

    public final /* synthetic */ x7.e zzc(Integer num) {
        return this.zzc.zzb();
    }

    public final /* synthetic */ zzgds zzd(zzgdu zzgduVar) {
        String zza = zzgduVar.zza().zza();
        String zzb = zzgduVar.zza().zzb();
        zzgoc zza2 = this.zzd.zza(15203);
        try {
            zza2.zza();
            zzfwv zza3 = zzfvq.zza(this.zza, 1, (zzbch) this.zzb.zzb(), zza, zzb, "1", this.zzg);
            zza2.zzc();
            int i = 2;
            if (zza3.zzc == 2) {
                this.zzd.zzb(15208);
                return zzf(4);
            }
            byte[] bArr = zza3.zzb;
            if (bArr == null || bArr.length == 0) {
                this.zzd.zzb(5010);
                return zzf(8);
            }
            try {
                zzbcj zze = zzbcj.zze(bArr, zzibb.zzb());
                if (zze.zza().zza().isEmpty() || zze.zza().zzb().isEmpty() || zze.zzc().zzy().length == 0) {
                    this.zzd.zzb(15207);
                } else {
                    if (zzgduVar.equals(zzgdu.zzg()) || !TextUtils.equals(zzgduVar.zza().zza(), zze.zza().zza()) || !TextUtils.equals(zzgduVar.zza().zzb(), zze.zza().zzb())) {
                        int i2 = zza3.zzc;
                        if (i2 == 4) {
                            if (!this.zzf.zza(zze.zzb().zzy())) {
                                this.zzd.zzb(15206);
                                return zzf(12);
                            }
                            i2 = 4;
                        }
                        zzgdr zzd = zzgds.zzd();
                        if (i2 == 2) {
                            i = 4;
                        } else if (i2 != 3) {
                            i = i2 != 4 ? i2 != 6 ? 1 : 5 : 3;
                        }
                        zzd.zze(i);
                        zzgdt zze2 = zzgdu.zze();
                        zze2.zza(zze.zza());
                        zze2.zzc((zzbch) this.zzb.zzb());
                        zzd.zza((zzgdu) zze2.zzbu());
                        zzd.zzd(zze.zzb());
                        zzd.zzc(zze.zzc());
                        return (zzgds) zzd.zzbu();
                    }
                    this.zzd.zzb(15209);
                }
                return zzf(11);
            } catch (NullPointerException unused) {
                this.zzd.zzb(15210);
                return zzf(10);
            } catch (zzicg e) {
                this.zzd.zzd(15205, e);
                return zzf(9);
            }
        } catch (Throwable th) {
            try {
                zza2.zzb(th);
                throw th;
            } catch (Throwable th2) {
                zza2.zzc();
                throw th2;
            }
        }
    }
}
