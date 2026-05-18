package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhcl implements zzhla {
    private static final zzhcl zza = new zzhcl();
    private static final zzhku zzb = zzhku.zzd(zzhcj.zza, zzhjo.class, zzhas.class);

    public static void zzc() throws GeneralSecurityException {
        zzhkd.zza().zzc(zza);
        zzhkd.zza().zzb(zzb);
    }

    public static void zzd(zzhkv zzhkvVar) throws GeneralSecurityException {
        zzhkvVar.zzb(zza);
    }

    public final Class zza() {
        return zzhas.class;
    }

    public final Class zzb() {
        return zzhas.class;
    }

    public final /* bridge */ /* synthetic */ Object zze(zzhjj zzhjjVar, zzhjr zzhjrVar, zzhkz zzhkzVar) throws GeneralSecurityException {
        zzhjs zzhjsVar;
        zzhjs zzhjsVar2;
        zzhye zzd;
        zzhkp zzhkpVar = new zzhkp();
        for (int i = 0; i < zzhjjVar.zzd(); i++) {
            zzhbi zze = ((zzhbk) zzhjjVar).zze(i);
            if (zze.zzb().equals(zzhbb.zza)) {
                zzhaz zza2 = zze.zza();
                if (zza2 instanceof zzhcg) {
                    zzd = ((zzhcg) zza2).zzc();
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
                zzhkpVar.zza(zzd, new zzhci((zzhas) zzhkzVar.zza(zze), zze.zzc()));
            }
        }
        if (zzhjrVar.zza()) {
            zzhjsVar = zzhjv.zza;
            zzhjsVar2 = zzhjsVar;
        } else {
            zzhjt zzb2 = zzhkb.zza().zzb();
            zzhjs zza3 = zzb2.zza(zzhjjVar, zzhjrVar, "aead", "encrypt");
            zzhjsVar2 = zzb2.zza(zzhjjVar, zzhjrVar, "aead", "decrypt");
            zzhjsVar = zza3;
        }
        zzhbk zzhbkVar = (zzhbk) zzhjjVar;
        return new zzhck(new zzhci((zzhas) zzhkzVar.zza(zzhbkVar.zzc()), zzhbkVar.zzc().zzc()), zzhkpVar.zzb(), zzhjsVar, zzhjsVar2, null);
    }
}
