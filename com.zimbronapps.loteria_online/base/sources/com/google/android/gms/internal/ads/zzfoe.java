package com.google.android.gms.internal.ads;

import S5.c1;
import S5.l2;
import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public interface zzfoe {
    static zzfoe zzn(Context context, int i) {
        boolean booleanValue;
        if (zzfor.zza()) {
            int i2 = i - 2;
            if (i2 == 20 || i2 == 21) {
                booleanValue = ((Boolean) zzbix.zze.zze()).booleanValue();
            } else if (i2 != 110) {
                switch (i2) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        booleanValue = ((Boolean) zzbix.zzc.zze()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        booleanValue = ((Boolean) zzbix.zzd.zze()).booleanValue();
                        break;
                    case 5:
                        booleanValue = ((Boolean) zzbix.zzb.zze()).booleanValue();
                        break;
                }
            } else {
                booleanValue = ((Boolean) S5.D.c().zzd(zzbhe.zzkm)).booleanValue();
            }
            if (booleanValue) {
                return new zzfog(context, i);
            }
        }
        return new zzfph();
    }

    static zzfoe zzo(Context context, int i, int i2, l2 l2Var) {
        zzfoe zzn = zzn(context, i);
        if (zzn instanceof zzfog) {
            zzn.zza();
            zzn.zzp(i2);
            zzn.zzf(b6.c.d(l2Var.m));
            String str = l2Var.p;
            if (zzfon.zza(str)) {
                zzn.zze(str);
            }
        }
        return zzn;
    }

    zzfoe zza();

    boolean zzb();

    zzfoe zzc();

    zzfoe zzd(boolean z);

    zzfoe zze(String str);

    zzfoe zzf(zzfot zzfotVar);

    zzfoe zzg(zzfjb zzfjbVar);

    zzfoe zzh(c1 c1Var);

    zzfoe zzi(String str);

    zzfoe zzj(Throwable th);

    zzfoe zzk(String str);

    boolean zzl();

    zzfoh zzm();

    zzfoe zzp(int i);
}
