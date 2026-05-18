package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhmr implements zzhla {
    private static final zzhmr zza = new zzhmr();
    private static final zzhku zzb = zzhku.zzd(zzhmo.zza, zzhjo.class, zzhbo.class);

    public static void zzc() throws GeneralSecurityException {
        zzhkd.zza().zzc(zza);
        zzhkd.zza().zzb(zzb);
    }

    public final Class zza() {
        return zzhbo.class;
    }

    public final Class zzb() {
        return zzhbo.class;
    }

    public final /* bridge */ /* synthetic */ Object zze(zzhjj zzhjjVar, zzhjr zzhjrVar, zzhkz zzhkzVar) throws GeneralSecurityException {
        zzhjs zzhjsVar;
        zzhjs zzhjsVar2;
        zzhye zzd;
        zzhkp zzhkpVar = new zzhkp();
        for (int i = 0; i < zzhjjVar.zzd(); i++) {
            zzhbi zze = ((zzhbk) zzhjjVar).zze(i);
            if (zze.zzb().equals(zzhbb.zza)) {
                zzhbo zzhboVar = (zzhbo) zzhkzVar.zza(zze);
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
                zzhkpVar.zza(zzd, new zzhmp(zzhboVar, zze.zzc()));
            }
        }
        if (zzhjrVar.zza()) {
            zzhjsVar = zzhjv.zza;
            zzhjsVar2 = zzhjsVar;
        } else {
            zzhjt zzb2 = zzhkb.zza().zzb();
            zzhjs zza3 = zzb2.zza(zzhjjVar, zzhjrVar, "mac", "compute");
            zzhjsVar2 = zzb2.zza(zzhjjVar, zzhjrVar, "mac", "verify");
            zzhjsVar = zza3;
        }
        zzhbk zzhbkVar = (zzhbk) zzhjjVar;
        return new zzhmq(new zzhmp((zzhbo) zzhkzVar.zza(zzhbkVar.zzc()), zzhbkVar.zzc().zzc()), zzhkpVar.zzb(), zzhjsVar, zzhjsVar2, null);
    }
}
