package com.google.android.gms.internal.firebase-auth-api;

import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzqz implements zzpz {
    private static final zzqz zza = new zzqz();

    private zzqz() {
    }

    public static void zzc() throws GeneralSecurityException {
        zzpa.zza().zza(zza);
    }

    public final Class zza() {
        return zzqw.class;
    }

    public final Class zzb() {
        return zzqw.class;
    }

    public final /* synthetic */ Object zza(zzob zzobVar, zzok zzokVar, zzqc zzqcVar) throws GeneralSecurityException {
        zzaaj zzc;
        zzoa zzc2 = zzobVar.zzc();
        if (zzc2 == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        zzpn zzpnVar = new zzpn();
        for (int i = 0; i < zzobVar.zza(); i++) {
            zzoa zza2 = zzobVar.zza(i);
            if (zza2.zzc().equals(zzbk.zza)) {
                zzqw zzqwVar = (zzqw) zzqcVar.zza(zza2);
                zzbi zzb = zza2.zzb();
                if (zzb instanceof zzrk) {
                    zzc = ((zzrk) zzb).zze();
                } else {
                    if (!(zzb instanceof zzof)) {
                        throw new GeneralSecurityException("Cannot get output prefix for key of class " + zzb.getClass().getName() + " with parameters " + String.valueOf(zzb.zza()));
                    }
                    zzc = ((zzof) zzb).zzc();
                }
                zzpnVar.zza(zzc, zzqwVar);
            }
        }
        return new zzqy(zzpnVar.zza(), (zzqw) zzqcVar.zza(zzc2), null);
    }
}
