package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhlz implements zzhla {
    private static final zzhlz zza = new zzhlz();

    private zzhlz() {
    }

    public static void zzc() throws GeneralSecurityException {
        zzhkd.zza().zzc(zza);
    }

    public final Class zza() {
        return zzhlx.class;
    }

    public final Class zzb() {
        return zzhlx.class;
    }

    public final /* bridge */ /* synthetic */ Object zze(zzhjj zzhjjVar, zzhjr zzhjrVar, zzhkz zzhkzVar) throws GeneralSecurityException {
        zzhye zzd;
        zzhbi zzc = ((zzhbk) zzhjjVar).zzc();
        zzhkp zzhkpVar = new zzhkp();
        for (int i = 0; i < zzhjjVar.zzd(); i++) {
            zzhbi zze = ((zzhbk) zzhjjVar).zze(i);
            if (zze.zzb().equals(zzhbb.zza)) {
                zzhlx zzhlxVar = (zzhlx) zzhkzVar.zza(zze);
                zzhaz zza2 = zze.zza();
                if (zza2 instanceof zzhmm) {
                    zzd = ((zzhmm) zza2).zze();
                } else {
                    if (!(zza2 instanceof zzhjo)) {
                        String name = zza2.getClass().getName();
                        String valueOf = String.valueOf(zza2.zza());
                        StringBuilder sb = new StringBuilder(name.length() + 59 + valueOf.length());
                        sb.append("Cannot get output prefix for key of class ");
                        sb.append(name);
                        sb.append(" with parameters ");
                        sb.append(valueOf);
                        throw new GeneralSecurityException(sb.toString());
                    }
                    zzd = ((zzhjo) zza2).zzd();
                }
                zzhkpVar.zza(zzd, zzhlxVar);
            }
        }
        return new zzhly(zzhkpVar.zzb(), (zzhlx) zzhkzVar.zza(zzc), null);
    }
}
