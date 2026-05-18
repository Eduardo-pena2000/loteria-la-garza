package com.google.android.gms.internal.firebase-auth-api;

import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzjm implements zzpz {
    private static final zzjm zza = new zzjm();
    private static final zzps zzb = zzps.zza(new zzjl(), zzof.class, zzbe.class);

    public static void zzc() throws GeneralSecurityException {
        zzpa.zza().zza(zza);
        zzpa.zza().zza(zzb);
    }

    public final Class zza() {
        return zzbe.class;
    }

    public final Class zzb() {
        return zzbe.class;
    }

    public final /* synthetic */ Object zza(zzob zzobVar, zzok zzokVar, zzqc zzqcVar) throws GeneralSecurityException {
        zzoo zzooVar;
        zzoo zzooVar2;
        zzaaj zzc;
        zzpn zzpnVar = new zzpn();
        for (int i = 0; i < zzobVar.zza(); i++) {
            zzoa zza2 = zzobVar.zza(i);
            if (zza2.zzc().equals(zzbk.zza)) {
                zzbe zzbeVar = (zzbe) zzqcVar.zza(zza2);
                zzbi zzb2 = zza2.zzb();
                if (zzb2 instanceof zzjk) {
                    zzc = ((zzjk) zzb2).zze();
                } else {
                    if (!(zzb2 instanceof zzof)) {
                        throw new GeneralSecurityException("Cannot get output prefix for key of class " + zzb2.getClass().getName() + " with parameters " + String.valueOf(zzb2.zza()));
                    }
                    zzc = ((zzof) zzb2).zzc();
                }
                zzpnVar.zza(zzc, new zzjo(zzbeVar, zza2.zza()));
            }
        }
        if (zzokVar.zza()) {
            zzooVar = zzon.zza;
            zzooVar2 = zzooVar;
        } else {
            zzol zza3 = zzow.zzb().zza();
            zzooVar = zza3.zza(zzobVar, zzokVar, "daead", "encrypt");
            zzooVar2 = zza3.zza(zzobVar, zzokVar, "daead", "decrypt");
        }
        return new zzjn(new zzjo((zzbe) zzqcVar.zza(zzobVar.zzc()), zzobVar.zzc().zza()), zzpnVar.zza(), zzooVar, zzooVar2);
    }
}
