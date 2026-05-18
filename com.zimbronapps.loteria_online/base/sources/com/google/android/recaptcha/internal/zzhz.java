package com.google.android.recaptcha.internal;

import Ca.A;
import Da.D;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzhz implements zzhx {
    private final zzhy zza;

    public zzhz(zzhy zzhyVar, zzhw zzhwVar) {
        this.zza = zzhyVar;
    }

    private final zztz zzb(String str, List list) throws zzce {
        if (str.length() == 0) {
            throw new zzce(3, 17, null);
        }
        try {
            zzhv zzhvVar = new zzhv(this.zza.zza(D.M0(list)), 255L, zzhv.zzb());
            StringBuilder sb = new StringBuilder(str.length());
            for (int i = 0; i < str.length(); i++) {
                sb.append((char) A.b(A.b(str.charAt(i)) ^ A.b((int) zzhvVar.zza())));
            }
            return zztz.zzg(zzkh.zzh().zzj(sb.toString()));
        } catch (Exception e) {
            throw new zzce(3, 18, e);
        }
    }

    public final zztz zza(zzub zzubVar) throws zzce {
        zzjh zzb = zzjh.zzb();
        zztz zzb2 = zzb(zzubVar.zzj(), zzubVar.zzk());
        zzb.zzf();
        long zza = zzb.zza(TimeUnit.MICROSECONDS);
        int i = zzbk.zza;
        zzbk.zza(zzbl.zzh.zza(), zza);
        return zzb2;
    }
}
