package com.google.android.gms.internal.firebase-auth-api;

import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzrm implements zzpz {
    private static final zzrm zza = new zzrm();
    private static final zzps zzb = zzps.zza(new zzrp(), zzof.class, zzcc.class);

    public static void zzc() throws GeneralSecurityException {
        zzpa.zza().zza(zza);
        zzpa.zza().zza(zzb);
    }

    public final Class zza() {
        return zzcc.class;
    }

    public final Class zzb() {
        return zzcc.class;
    }

    public final /* synthetic */ Object zza(zzob zzobVar, zzok zzokVar, zzqc zzqcVar) throws GeneralSecurityException {
        zzoo zzooVar;
        zzoo zzooVar2;
        zzaaj zzc;
        zzpn zzpnVar = new zzpn();
        for (int i = 0; i < zzobVar.zza(); i++) {
            zzoa zza2 = zzobVar.zza(i);
            if (zza2.zzc().equals(zzbk.zza)) {
                zzcc zzccVar = (zzcc) zzqcVar.zza(zza2);
                zzbi zzb2 = zza2.zzb();
                if (zzb2 instanceof zzrk) {
                    zzc = ((zzrk) zzb2).zze();
                } else {
                    if (!(zzb2 instanceof zzof)) {
                        throw new GeneralSecurityException("Cannot get output prefix for key of class " + zzb2.getClass().getName() + " with parameters " + String.valueOf(zzb2.zza()));
                    }
                    zzc = ((zzof) zzb2).zzc();
                }
                zzpnVar.zza(zzc, new zzro(zzccVar, zza2.zza()));
            }
        }
        if (zzokVar.zza()) {
            zzooVar = zzon.zza;
            zzooVar2 = zzooVar;
        } else {
            zzol zza3 = zzow.zzb().zza();
            zzoo zza4 = zza3.zza(zzobVar, zzokVar, "mac", "compute");
            zzooVar2 = zza3.zza(zzobVar, zzokVar, "mac", "verify");
            zzooVar = zza4;
        }
        return new zzrr(new zzro((zzcc) zzqcVar.zza(zzobVar.zzc()), zzobVar.zzc().zza()), zzpnVar.zza(), zzooVar, zzooVar2, null);
    }
}
