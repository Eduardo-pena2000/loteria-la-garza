package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzrh;
import com.google.android.gms.internal.firebase-auth-api.zzwx;
import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzsj {
    private static final zzaaj zza;
    private static final zznl zzb;
    private static final zznl zzc;
    private static final zzph zzd;
    private static final zzpd zze;
    private static final zznx zzf;
    private static final zznt zzg;

    static {
        zzaaj zzb2 = zzqn.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        zza = zzb2;
        zzb = zznl.zza().zza(zzxz.zzd, zzrh.zzc.zzd).zza(zzxz.zzb, zzrh.zzc.zza).zza(zzxz.zzc, zzrh.zzc.zzc).zza(zzxz.zze, zzrh.zzc.zzb).zza();
        zzc = zznl.zza().zza(zzvy.zza, zzrh.zza.zza).zza(zzvy.zze, zzrh.zza.zzb).zza(zzvy.zzc, zzrh.zza.zzc).zza(zzvy.zzb, zzrh.zza.zzd).zza(zzvy.zzd, zzrh.zza.zze).zza();
        zzd = zzph.zza(new zzsi(), zzrh.class, zzqe.class);
        zze = zzpd.zza(new zzsl(), zzb2, zzqe.class);
        zzf = zznx.zza(new zzsk(), zzra.class, zzqb.class);
        zzg = zznt.zza(new zzsn(), zzb2, zzqb.class);
    }

    public static /* synthetic */ zzra zza(zzqb zzqbVar, zzch zzchVar) {
        return zzb(zzqbVar, zzchVar);
    }

    private static zzra zzb(zzqb zzqbVar, zzch zzchVar) throws GeneralSecurityException {
        if (!zzqbVar.zzf().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            zzwb zza2 = zzwb.zza(zzqbVar.zzd(), zzaku.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zzra.zzc().zza(zzrh.zzd().zza(zza2.zzf().zzb()).zzb(zza2.zze().zza()).zza((zzrh.zza) zzc.zza((Enum) zza2.zze().zzb())).zza((zzrh.zzc) zzb.zza((Enum) zzqbVar.zzb())).zza()).zza(zzaal.zza(zza2.zzf().zzd(), zzch.zza(zzchVar))).zza(zzqbVar.zze()).zza();
        } catch (zzall | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    public static /* synthetic */ zzrh zza(zzqe zzqeVar) {
        return zzb(zzqeVar);
    }

    public static /* synthetic */ zzqb zza(zzra zzraVar, zzch zzchVar) {
        return zzqb.zza("type.googleapis.com/google.crypto.tink.HmacKey", ((zzwb) ((zzalf) zzwb.zzb().zza(zzb((zzrh) ((zzrn) zzraVar.zza()))).zza(zzajv.zza(zzraVar.zzf().zza(zzch.zza(zzchVar)))).zze())).zzj(), zzwx.zzb.zzb, (zzxz) zzb.zza(((zzrh) ((zzrn) zzraVar.zza())).zzf()), zzraVar.zzb());
    }

    public static /* synthetic */ zzqe zza(zzrh zzrhVar) {
        return zzqe.zzb((zzxb) ((zzalf) zzxb.zza().zza("type.googleapis.com/google.crypto.tink.HmacKey").zza(((zzwe) ((zzalf) zzwe.zzc().zza(zzb(zzrhVar)).zza(zzrhVar.zzc()).zze())).zzj()).zza((zzxz) zzb.zza(zzrhVar.zzf())).zze()));
    }

    private static zzrh zzb(zzqe zzqeVar) throws GeneralSecurityException {
        if (zzqeVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            try {
                zzwe zza2 = zzwe.zza(zzqeVar.zza().zze(), zzaku.zza());
                if (zza2.zzb() == 0) {
                    return zzrh.zzd().zza(zza2.zza()).zzb(zza2.zzf().zza()).zza((zzrh.zza) zzc.zza((Enum) zza2.zzf().zzb())).zza((zzrh.zzc) zzb.zza((Enum) zzqeVar.zza().zzd())).zza();
                }
                throw new GeneralSecurityException("Parsing HmacParameters failed: unknown Version " + zza2.zzb());
            } catch (zzall e) {
                throw new GeneralSecurityException("Parsing HmacParameters failed: ", e);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: " + zzqeVar.zza().zzf());
    }

    public static void zza() throws GeneralSecurityException {
        zzoz zza2 = zzoz.zza();
        zza2.zza(zzd);
        zza2.zza(zze);
        zza2.zza(zzf);
        zza2.zza(zzg);
    }

    private static zzwh zzb(zzrh zzrhVar) throws GeneralSecurityException {
        return (zzwh) ((zzalf) zzwh.zzc().zza(zzrhVar.zzb()).zza((zzvy) zzc.zza(zzrhVar.zze())).zze());
    }
}
