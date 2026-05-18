package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzjf;
import com.google.android.gms.internal.firebase-auth-api.zzwx;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzjs {
    private static final zzaaj zza;
    private static final zzph zzb;
    private static final zzpd zzc;
    private static final zznx zzd;
    private static final zznt zze;
    private static final Map zzf;
    private static final Map zzg;

    static {
        zzaaj zzb2 = zzqn.zzb("type.googleapis.com/google.crypto.tink.AesSivKey");
        zza = zzb2;
        zzb = zzph.zza(new zzjr(), zzjf.class, zzqe.class);
        zzc = zzpd.zza(new zzju(), zzb2, zzqe.class);
        zzd = zznx.zza(new zzjt(), zzja.class, zzqb.class);
        zze = zznt.zza(new zzjw(), zzb2, zzqb.class);
        HashMap hashMap = new HashMap();
        zzjf.zza zzaVar = zzjf.zza.zzc;
        zzxz zzxzVar = zzxz.RAW;
        hashMap.put(zzaVar, zzxzVar);
        zzjf.zza zzaVar2 = zzjf.zza.zza;
        zzxz zzxzVar2 = zzxz.TINK;
        hashMap.put(zzaVar2, zzxzVar2);
        zzjf.zza zzaVar3 = zzjf.zza.zzb;
        zzxz zzxzVar3 = zzxz.CRUNCHY;
        hashMap.put(zzaVar3, zzxzVar3);
        zzf = Collections.unmodifiableMap(hashMap);
        EnumMap enumMap = new EnumMap(zzxz.class);
        enumMap.put(zzxzVar, zzaVar);
        enumMap.put(zzxzVar2, zzaVar2);
        enumMap.put(zzxzVar3, zzaVar3);
        enumMap.put(zzxz.LEGACY, zzaVar3);
        zzg = Collections.unmodifiableMap(enumMap);
    }

    public static /* synthetic */ zzja zza(zzqb zzqbVar, zzch zzchVar) {
        return zzb(zzqbVar, zzchVar);
    }

    private static zzja zzb(zzqb zzqbVar, zzch zzchVar) throws GeneralSecurityException {
        if (!zzqbVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters");
        }
        try {
            zzup zza2 = zzup.zza(zzqbVar.zzd(), zzaku.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zzja.zzc().zza(zzjf.zzc().zza(zza2.zzd().zzb()).zza(zza(zzqbVar.zzb())).zza()).zza(zzaal.zza(zza2.zzd().zzd(), zzch.zza(zzchVar))).zza(zzqbVar.zze()).zza();
        } catch (zzall unused) {
            throw new GeneralSecurityException("Parsing AesSivKey failed");
        }
    }

    public static /* synthetic */ zzjf zza(zzqe zzqeVar) {
        return zzb(zzqeVar);
    }

    private static zzjf.zza zza(zzxz zzxzVar) throws GeneralSecurityException {
        Map map = zzg;
        if (map.containsKey(zzxzVar)) {
            return (zzjf.zza) map.get(zzxzVar);
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzxzVar.zza());
    }

    public static /* synthetic */ zzqb zza(zzja zzjaVar, zzch zzchVar) {
        return zzqb.zza("type.googleapis.com/google.crypto.tink.AesSivKey", ((zzup) ((zzalf) zzup.zzb().zza(zzajv.zza(zzjaVar.zzf().zza(zzch.zza(zzchVar)))).zze())).zzj(), zzwx.zzb.SYMMETRIC, zza(((zzjf) ((zzjj) zzjaVar.zza())).zzd()), zzjaVar.zzb());
    }

    public static /* synthetic */ zzqe zza(zzjf zzjfVar) {
        return zzqe.zzb((zzxb) ((zzalf) zzxb.zza().zza("type.googleapis.com/google.crypto.tink.AesSivKey").zza(((zzus) ((zzalf) zzus.zzc().zza(zzjfVar.zzb()).zze())).zzj()).zza(zza(zzjfVar.zzd())).zze()));
    }

    private static zzjf zzb(zzqe zzqeVar) throws GeneralSecurityException {
        if (zzqeVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
            try {
                zzus zza2 = zzus.zza(zzqeVar.zza().zze(), zzaku.zza());
                if (zza2.zzb() == 0) {
                    return zzjf.zzc().zza(zza2.zza()).zza(zza(zzqeVar.zza().zzd())).zza();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzall e) {
                throw new GeneralSecurityException("Parsing AesSivParameters failed: ", e);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters: " + zzqeVar.zza().zzf());
    }

    private static zzxz zza(zzjf.zza zzaVar) throws GeneralSecurityException {
        Map map = zzf;
        if (map.containsKey(zzaVar)) {
            return (zzxz) map.get(zzaVar);
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + String.valueOf(zzaVar));
    }

    public static void zza() throws GeneralSecurityException {
        zzoz zza2 = zzoz.zza();
        zza2.zza(zzb);
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
    }
}
