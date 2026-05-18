package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzhiy extends zzhys {
    public static final zzhyl zzb(zzhzq zzhzqVar) throws IOException {
        String str;
        int zzm = zzhzqVar.zzm();
        zzhyl zze = zze(zzhzqVar, zzm);
        if (zze == null) {
            return zzd(zzhzqVar, zzm);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (zzhzqVar.zzf()) {
                if (zze instanceof zzhyn) {
                    str = zzhzqVar.zzh();
                    if (!zzhja.zza(str)) {
                        throw new IOException("illegal characters in string");
                    }
                } else {
                    str = null;
                }
                int zzm2 = zzhzqVar.zzm();
                zzhyl zze2 = zze(zzhzqVar, zzm2);
                zzhyl zzd = zze2 == null ? zzd(zzhzqVar, zzm2) : zze2;
                if (zze instanceof zzhyk) {
                    ((zzhyk) zze).zza(zzd);
                } else {
                    zzhyn zzhynVar = (zzhyn) zze;
                    if (zzhynVar.zzc(str)) {
                        throw new IOException("duplicate key: ".concat(String.valueOf(str)));
                    }
                    zzhynVar.zza(str, zzd);
                }
                if (zze2 != null) {
                    arrayDeque.addLast(zze);
                    if (arrayDeque.size() > 100) {
                        throw new IOException("too many recursions");
                    }
                    zze = zzd;
                } else {
                    continue;
                }
            } else {
                if (zze instanceof zzhyk) {
                    zzhzqVar.zzc();
                } else {
                    zzhzqVar.zze();
                }
                if (arrayDeque.isEmpty()) {
                    return zze;
                }
                zze = (zzhyl) arrayDeque.removeLast();
            }
        }
    }

    private static final zzhyl zzd(zzhzq zzhzqVar, int i) throws IOException {
        int i2 = i - 1;
        if (i2 == 5) {
            String zzi = zzhzqVar.zzi();
            if (zzhja.zza(zzi)) {
                return new zzhyp(zzi);
            }
            throw new IOException("illegal characters in string");
        }
        if (i2 == 6) {
            return new zzhyp(new zzhiz(zzhzqVar.zzi()));
        }
        if (i2 == 7) {
            return new zzhyp(Boolean.valueOf(zzhzqVar.zzj()));
        }
        if (i2 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(zzhzr.zza(i)));
        }
        zzhzqVar.zzk();
        return zzhym.zza;
    }

    private static final zzhyl zze(zzhzq zzhzqVar, int i) throws IOException {
        int i2 = i - 1;
        if (i2 == 0) {
            zzhzqVar.zzb();
            return new zzhyk();
        }
        if (i2 != 2) {
            return null;
        }
        zzhzqVar.zzd();
        return new zzhyn();
    }

    public final /* bridge */ /* synthetic */ void zza(zzhzs zzhzsVar, Object obj) throws IOException {
        throw null;
    }
}
