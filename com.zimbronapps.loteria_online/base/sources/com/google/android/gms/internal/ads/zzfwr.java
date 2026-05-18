package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfwr {
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final zzbch zzd;

    public zzfwr(Context context, zzbch zzbchVar) {
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzfws.zzd(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzfws.zzd(dir2, true);
        this.zza = dir2;
        this.zzd = zzbchVar;
    }

    private final File zzd() {
        File file = new File(this.zzb, Integer.toString(this.zzd.zza()));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zze() {
        int zza = this.zzd.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(zza).length() + 6);
        sb.append("FBAMTD");
        sb.append(zza);
        return sb.toString();
    }

    private final String zzf() {
        int zza = this.zzd.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(zza).length() + 6);
        sb.append("LATMTD");
        sb.append(zza);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zza(com.google.android.gms.internal.ads.zzbcj r9, com.google.android.gms.internal.ads.zzfwx r10) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfwr.zza(com.google.android.gms.internal.ads.zzbcj, com.google.android.gms.internal.ads.zzfwx):boolean");
    }

    public final zzfwq zzb(int i) {
        zzbcp zzc = zzc(1);
        if (zzc == null) {
            return null;
        }
        String zza = zzc.zza();
        File zza2 = zzfws.zza(zza, "pcam.jar", zzd());
        if (!zza2.exists()) {
            zza2 = zzfws.zza(zza, "pcam", zzd());
        }
        return new zzfwq(zzc, zza2, zzfws.zza(zza, "pcbc", zzd()), zzfws.zza(zza, "pcopt", zzd()));
    }

    public final zzbcp zzc(int i) {
        String string = i == 1 ? this.zzc.getString(zzf(), (String) null) : this.zzc.getString(zze(), (String) null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] d = E6.l.d(string);
            zzian zzianVar = zzian.zza;
            zzbcp zzg = zzbcp.zzg(zzian.zzs(d, 0, d.length));
            String zza = zzg.zza();
            File zza2 = zzfws.zza(zza, "pcam.jar", zzd());
            if (!zza2.exists()) {
                zza2 = zzfws.zza(zza, "pcam", zzd());
            }
            File zza3 = zzfws.zza(zza, "pcbc", zzd());
            if (zza2.exists()) {
                if (zza3.exists()) {
                    return zzg;
                }
            }
        } catch (zzicg unused) {
        }
        return null;
    }
}
