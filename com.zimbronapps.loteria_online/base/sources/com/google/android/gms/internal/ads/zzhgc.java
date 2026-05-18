package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhgc {
    public static final /* synthetic */ int zza = 0;
    private static final zzhye zzb;
    private static final zzhkn zzc;
    private static final zzhkk zzd;
    private static final zzhji zze;
    private static final zzhjf zzf;

    static {
        zzhye zza2 = zzhln.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzb = zza2;
        zzc = zzhkn.zzd(zzhgb.zza, zzhcv.class, zzhlc.class);
        zzd = zzhkk.zzd(zzhfy.zza, zza2, zzhlc.class);
        zze = zzhji.zzd(zzhfz.zza, zzhcn.class, zzhlb.class);
        zzf = zzhjf.zzd(zzhga.zza, zza2, zzhlb.class);
    }

    public static void zza(zzhkg zzhkgVar) throws GeneralSecurityException {
        zzhkgVar.zzd(zzc);
        zzhkgVar.zze(zzd);
        zzhkgVar.zzb(zze);
        zzhkgVar.zzc(zzf);
    }

    public static /* synthetic */ zzhlc zzb(zzhcv zzhcvVar) {
        zzhqe zze2 = zzhqf.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzhod zzd2 = zzhoe.zzd();
        zzhoh zzc2 = zzhoi.zzc();
        zzhoj zzb2 = zzhok.zzb();
        zzb2.zza(zzhcvVar.zzf());
        zzc2.zza((zzhok) zzb2.zzbm());
        zzc2.zzb(zzhcvVar.zzc());
        zzd2.zza((zzhoi) zzc2.zzbm());
        zzhpw zze3 = zzhpx.zze();
        zze3.zza(zzi(zzhcvVar));
        zze3.zzb(zzhcvVar.zzd());
        zzd2.zzb((zzhpx) zze3.zzbm());
        zze2.zzb(((zzhoe) zzd2.zzbm()).zzaM());
        zze2.zzc(zzf(zzhcvVar.zzg()));
        return zzhlc.zza((zzhqf) zze2.zzbm());
    }

    public static /* synthetic */ zzhcv zzc(zzhlc zzhlcVar) {
        if (!zzhlcVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzhlcVar.zzc().zza())));
        }
        try {
            zzhoe zzc2 = zzhoe.zzc(zzhlcVar.zzc().zzb(), zzibb.zza());
            if (zzc2.zzb().zzc() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhcs zzb2 = zzhcv.zzb();
            zzb2.zza(zzc2.zza().zzb());
            zzb2.zzb(zzc2.zzb().zzb());
            zzb2.zzc(zzc2.zza().zza().zza());
            zzb2.zzd(zzc2.zzb().zza().zzb());
            zzb2.zzf(zzh(zzc2.zzb().zza().zza()));
            zzb2.zze(zzg(zzhlcVar.zzc().zzc()));
            return zzb2.zzg();
        } catch (zzicg e) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e);
        }
    }

    public static /* synthetic */ zzhlb zzd(zzhcn zzhcnVar, zzhbt zzhbtVar) {
        zzhob zze2 = zzhoc.zze();
        zzhof zzd2 = zzhog.zzd();
        zzhoj zzb2 = zzhok.zzb();
        zzb2.zza(zzhcnVar.zzg().zzf());
        zzd2.zza((zzhok) zzb2.zzbm());
        byte[] zzc2 = zzhcnVar.zze().zzc(zzhbtVar);
        zzd2.zzb(zzian.zzs(zzc2, 0, zzc2.length));
        zze2.zza((zzhog) zzd2.zzbm());
        zzhpu zze3 = zzhpv.zze();
        zze3.zza(zzi(zzhcnVar.zzg()));
        byte[] zzc3 = zzhcnVar.zzf().zzc(zzhbtVar);
        zze3.zzb(zzian.zzs(zzc3, 0, zzc3.length));
        zze2.zzb((zzhpv) zze3.zzbm());
        return zzhlb.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((zzhoc) zze2.zzbm()).zzaM(), zzhqb.zzb, zzf(zzhcnVar.zzg().zzg()), zzhcnVar.zzb());
    }

    public static /* synthetic */ zzhcn zze(zzhlb zzhlbVar, zzhbt zzhbtVar) {
        if (!zzhlbVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
        try {
            zzhoc zzd2 = zzhoc.zzd(zzhlbVar.zzb(), zzibb.zza());
            if (zzd2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zzd2.zzb().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
            }
            if (zzd2.zzc().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
            }
            zzhcs zzb2 = zzhcv.zzb();
            zzb2.zza(zzd2.zzb().zzc().zzc());
            zzb2.zzb(zzd2.zzc().zzc().zzc());
            zzb2.zzc(zzd2.zzb().zzb().zza());
            zzb2.zzd(zzd2.zzc().zzb().zzb());
            zzb2.zzf(zzh(zzd2.zzc().zzb().zza()));
            zzb2.zze(zzg(zzhlbVar.zzd()));
            zzhcv zzg = zzb2.zzg();
            zzhcm zzd3 = zzhcn.zzd();
            zzd3.zza(zzg);
            zzd3.zzb(zzhyg.zza(zzd2.zzb().zzc().zzy(), zzhbtVar));
            zzd3.zzc(zzhyg.zza(zzd2.zzc().zzc().zzy(), zzhbtVar));
            zzd3.zzd(zzhlbVar.zze());
            return zzd3.zze();
        } catch (zzicg unused) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
        }
    }

    private static zzhqy zzf(zzhcu zzhcuVar) throws GeneralSecurityException {
        if (zzhcu.zza.equals(zzhcuVar)) {
            return zzhqy.zzb;
        }
        if (zzhcu.zzb.equals(zzhcuVar)) {
            return zzhqy.zze;
        }
        if (zzhcu.zzc.equals(zzhcuVar)) {
            return zzhqy.zzd;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzhcuVar)));
    }

    private static zzhcu zzg(zzhqy zzhqyVar) throws GeneralSecurityException {
        int ordinal = zzhqyVar.ordinal();
        if (ordinal == 1) {
            return zzhcu.zza;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return zzhcu.zzc;
            }
            if (ordinal != 4) {
                int zza2 = zzhqyVar.zza();
                StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(zza2);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return zzhcu.zzb;
    }

    private static zzhct zzh(zzhpt zzhptVar) throws GeneralSecurityException {
        int ordinal = zzhptVar.ordinal();
        if (ordinal == 1) {
            return zzhct.zza;
        }
        if (ordinal == 2) {
            return zzhct.zzd;
        }
        if (ordinal == 3) {
            return zzhct.zzc;
        }
        if (ordinal == 4) {
            return zzhct.zze;
        }
        if (ordinal == 5) {
            return zzhct.zzb;
        }
        int zza2 = zzhptVar.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 26);
        sb.append("Unable to parse HashType: ");
        sb.append(zza2);
        throw new GeneralSecurityException(sb.toString());
    }

    private static zzhpz zzi(zzhcv zzhcvVar) throws GeneralSecurityException {
        zzhpt zzhptVar;
        zzhpy zzc2 = zzhpz.zzc();
        zzc2.zzb(zzhcvVar.zze());
        zzhct zzh = zzhcvVar.zzh();
        if (zzhct.zza.equals(zzh)) {
            zzhptVar = zzhpt.zzb;
        } else if (zzhct.zzb.equals(zzh)) {
            zzhptVar = zzhpt.zzf;
        } else if (zzhct.zzc.equals(zzh)) {
            zzhptVar = zzhpt.zzd;
        } else if (zzhct.zzd.equals(zzh)) {
            zzhptVar = zzhpt.zzc;
        } else {
            if (!zzhct.zze.equals(zzh)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(zzh)));
            }
            zzhptVar = zzhpt.zze;
        }
        zzc2.zza(zzhptVar);
        return (zzhpz) zzc2.zzbm();
    }
}
