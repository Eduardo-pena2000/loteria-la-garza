package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhnc {
    public static final /* synthetic */ int zza = 0;
    private static final zzhye zzb;
    private static final zzhkn zzc;
    private static final zzhkk zzd;
    private static final zzhji zze;
    private static final zzhjf zzf;

    static {
        zzhye zza2 = zzhln.zza("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzb = zza2;
        zzc = zzhkn.zzd(zzhnb.zza, zzhlw.class, zzhlc.class);
        zzd = zzhkk.zzd(zzhmy.zza, zza2, zzhlc.class);
        zze = zzhji.zzd(zzhmz.zza, zzhlp.class, zzhlb.class);
        zzf = zzhjf.zzd(zzhna.zza, zza2, zzhlb.class);
    }

    public static void zza(zzhkg zzhkgVar) throws GeneralSecurityException {
        zzhkgVar.zzd(zzc);
        zzhkgVar.zze(zzd);
        zzhkgVar.zzb(zze);
        zzhkgVar.zzc(zzf);
    }

    public static /* synthetic */ zzhlc zzb(zzhlw zzhlwVar) {
        zzhqe zze2 = zzhqf.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzhnx zzd2 = zzhny.zzd();
        zzd2.zzb(zzh(zzhlwVar));
        zzd2.zza(zzhlwVar.zzc());
        zze2.zzb(((zzhny) zzd2.zzbm()).zzaM());
        zze2.zzc(zzf(zzhlwVar.zzf()));
        return zzhlc.zza((zzhqf) zze2.zzbm());
    }

    public static /* synthetic */ zzhlw zzc(zzhlc zzhlcVar) {
        if (!zzhlcVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzhlcVar.zzc().zza())));
        }
        try {
            zzhny zzc2 = zzhny.zzc(zzhlcVar.zzc().zzb(), zzibb.zza());
            zzhlu zzb2 = zzhlw.zzb();
            zzb2.zza(zzc2.zza());
            zzb2.zzb(zzc2.zzb().zza());
            zzb2.zzc(zzg(zzhlcVar.zzc().zzc()));
            return zzb2.zzd();
        } catch (zzicg e) {
            throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e);
        }
    }

    public static /* synthetic */ zzhlb zzd(zzhlp zzhlpVar, zzhbt zzhbtVar) {
        zzhnv zze2 = zzhnw.zze();
        zze2.zzb(zzh(zzhlpVar.zzf()));
        byte[] zzc2 = zzhlpVar.zzd().zzc(zzhbtVar);
        zze2.zza(zzian.zzs(zzc2, 0, zzc2.length));
        return zzhlb.zza("type.googleapis.com/google.crypto.tink.AesCmacKey", ((zzhnw) zze2.zzbm()).zzaM(), zzhqb.zzb, zzf(zzhlpVar.zzf().zzf()), zzhlpVar.zzb());
    }

    public static /* synthetic */ zzhlp zze(zzhlb zzhlbVar, zzhbt zzhbtVar) {
        if (!zzhlbVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
        try {
            zzhnw zzd2 = zzhnw.zzd(zzhlbVar.zzb(), zzibb.zza());
            if (zzd2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhlu zzb2 = zzhlw.zzb();
            zzb2.zza(zzd2.zzb().zzc());
            zzb2.zzb(zzd2.zzc().zza());
            zzb2.zzc(zzg(zzhlbVar.zzd()));
            zzhlw zzd3 = zzb2.zzd();
            zzhlo zzc2 = zzhlp.zzc();
            zzc2.zza(zzd3);
            zzc2.zzb(zzhyg.zza(zzd2.zzb().zzy(), zzhbtVar));
            zzc2.zzc(zzhlbVar.zze());
            return zzc2.zzd();
        } catch (zzicg | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    private static zzhqy zzf(zzhlv zzhlvVar) throws GeneralSecurityException {
        if (zzhlv.zza.equals(zzhlvVar)) {
            return zzhqy.zzb;
        }
        if (zzhlv.zzb.equals(zzhlvVar)) {
            return zzhqy.zze;
        }
        if (zzhlv.zzd.equals(zzhlvVar)) {
            return zzhqy.zzd;
        }
        if (zzhlv.zzc.equals(zzhlvVar)) {
            return zzhqy.zzc;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzhlvVar)));
    }

    private static zzhlv zzg(zzhqy zzhqyVar) throws GeneralSecurityException {
        int ordinal = zzhqyVar.ordinal();
        if (ordinal == 1) {
            return zzhlv.zza;
        }
        if (ordinal == 2) {
            return zzhlv.zzc;
        }
        if (ordinal == 3) {
            return zzhlv.zzd;
        }
        if (ordinal == 4) {
            return zzhlv.zzb;
        }
        int zza2 = zzhqyVar.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 34);
        sb.append("Unable to parse OutputPrefixType: ");
        sb.append(zza2);
        throw new GeneralSecurityException(sb.toString());
    }

    private static zzhoa zzh(zzhlw zzhlwVar) {
        zzhnz zzb2 = zzhoa.zzb();
        zzb2.zza(zzhlwVar.zzd());
        return (zzhoa) zzb2.zzbm();
    }
}
