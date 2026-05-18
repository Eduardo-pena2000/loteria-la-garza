package com.google.android.gms.internal.firebase-auth-api;

import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzkz implements zzpz {
    private static final zzkz zza = new zzkz();
    private static final zzps zzb = zzps.zza(new zzky(), zzof.class, zzbd.class);

    public static void zzc() throws GeneralSecurityException {
        zzpa.zza().zza(zza);
        zzpa.zza().zza(zzb);
    }

    public final Class zza() {
        return zzbd.class;
    }

    public final Class zzb() {
        return zzbd.class;
    }

    public final /* synthetic */ Object zza(zzob zzobVar, zzok zzokVar, zzqc zzqcVar) throws GeneralSecurityException {
        zzaaj zzc;
        zzpn zzpnVar = new zzpn();
        for (int i = 0; i < zzobVar.zza(); i++) {
            zzoa zza2 = zzobVar.zza(i);
            if (zza2.zzc().equals(zzbk.zza)) {
                zzbd zzbdVar = (zzbd) zzqcVar.zza(zza2);
                zzbi zzb2 = zza2.zzb();
                if (zzb2 instanceof zzlj) {
                    zzc = ((zzlj) zzb2).zzh();
                } else {
                    if (!(zzb2 instanceof zzof)) {
                        throw new GeneralSecurityException("Cannot get output prefix for key of class " + zzb2.getClass().getName() + " with parameters " + String.valueOf(zzb2.zza()));
                    }
                    zzc = ((zzof) zzb2).zzc();
                }
                zzpnVar.zza(zzc, new zzlb(zzbdVar, zza2.zza()));
            }
        }
        return new zzla(zzpnVar.zza(), !zzokVar.zza() ? zzow.zzb().zza().zza(zzobVar, zzokVar, "hybrid_decrypt", "decrypt") : zzon.zza);
    }

    public static void zza(zzpy zzpyVar) throws GeneralSecurityException {
        zzpyVar.zza(zza);
    }
}
