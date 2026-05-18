package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhvd {
    public static final /* synthetic */ int zza = 0;
    private static final zzhye zzb;
    private static final zzhye zzc;
    private static final zzhkn zzd;
    private static final zzhkk zze;
    private static final zzhji zzf;
    private static final zzhjf zzg;
    private static final zzhji zzh;
    private static final zzhjf zzi;

    static {
        zzhye zza2 = zzhln.zza("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
        zzb = zza2;
        zzhye zza3 = zzhln.zza("type.googleapis.com/google.crypto.tink.EcdsaPublicKey");
        zzc = zza3;
        zzd = zzhkn.zzd(zzhvc.zza, zzhsg.class, zzhlc.class);
        zze = zzhkk.zzd(zzhux.zza, zza2, zzhlc.class);
        zzf = zzhji.zzd(zzhuy.zza, zzhsk.class, zzhlb.class);
        zzg = zzhjf.zzd(zzhuz.zza, zza3, zzhlb.class);
        zzh = zzhji.zzd(zzhva.zza, zzhsi.class, zzhlb.class);
        zzi = zzhjf.zzd(zzhvb.zza, zza2, zzhlb.class);
    }

    public static void zza(zzhkg zzhkgVar) throws GeneralSecurityException {
        zzhkgVar.zzd(zzd);
        zzhkgVar.zze(zze);
        zzhkgVar.zzb(zzf);
        zzhkgVar.zzc(zzg);
        zzhkgVar.zzb(zzh);
        zzhkgVar.zzc(zzi);
    }

    public static /* synthetic */ zzhlc zzb(zzhsg zzhsgVar) {
        zzhqe zze2 = zzhqf.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
        zzhpd zzc2 = zzhpe.zzc();
        zzc2.zza(zzl(zzhsgVar));
        zze2.zzb(((zzhpe) zzc2.zzbm()).zzaM());
        zze2.zzc(zzh(zzhsgVar.zzf()));
        return zzhlc.zza((zzhqf) zze2.zzbm());
    }

    public static /* synthetic */ zzhsg zzc(zzhlc zzhlcVar) {
        if (!zzhlcVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parseParameters: ".concat(String.valueOf(zzhlcVar.zzc().zza())));
        }
        try {
            zzhpe zzb2 = zzhpe.zzb(zzhlcVar.zzc().zzb(), zzibb.zza());
            zzhsb zzb3 = zzhsg.zzb();
            zzb3.zzc(zzi(zzb2.zza().zza()));
            zzb3.zza(zzo(zzb2.zza().zzh()));
            zzb3.zzb(zzn(zzb2.zza().zzg()));
            zzb3.zzd(zzj(zzhlcVar.zzc().zzc()));
            return zzb3.zze();
        } catch (zzicg e) {
            throw new GeneralSecurityException("Parsing EcdsaParameters failed: ", e);
        }
    }

    public static /* synthetic */ zzhlb zzd(zzhsk zzhskVar, zzhbt zzhbtVar) {
        return zzhlb.zza("type.googleapis.com/google.crypto.tink.EcdsaPublicKey", zzm(zzhskVar).zzaM(), zzhqb.ASYMMETRIC_PUBLIC, zzh(zzhskVar.zzf().zzf()), zzhskVar.zzb());
    }

    public static /* synthetic */ zzhsk zze(zzhlb zzhlbVar, zzhbt zzhbtVar) {
        if (!zzhlbVar.zzg().equals("type.googleapis.com/google.crypto.tink.EcdsaPublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(zzhlbVar.zzg())));
        }
        try {
            zzhpk zze2 = zzhpk.zze(zzhlbVar.zzb(), zzibb.zza());
            if (zze2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhsb zzb2 = zzhsg.zzb();
            zzb2.zzc(zzi(zze2.zzb().zza()));
            zzb2.zza(zzo(zze2.zzb().zzh()));
            zzb2.zzb(zzn(zze2.zzb().zzg()));
            zzb2.zzd(zzj(zzhlbVar.zzd()));
            zzhsg zze3 = zzb2.zze();
            zzhsj zzc2 = zzhsk.zzc();
            zzc2.zza(zze3);
            zzc2.zzb(new ECPoint(new BigInteger(1, zze2.zzc().zzy()), new BigInteger(1, zze2.zzd().zzy())));
            zzc2.zzc(zzhlbVar.zze());
            return zzc2.zzd();
        } catch (zzicg | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
        }
    }

    public static /* synthetic */ zzhlb zzf(zzhsi zzhsiVar, zzhbt zzhbtVar) {
        int zzk = zzk(zzhsiVar.zzd().zzd());
        zzhph zze2 = zzhpi.zze();
        zze2.zza(zzm(zzhsiVar.zze()));
        byte[] zzb2 = zzhig.zzb(zzhsiVar.zzf().zzb(zzhbtVar), zzk);
        zzian zzianVar = zzian.zza;
        zze2.zzb(zzian.zzs(zzb2, 0, zzb2.length));
        return zzhlb.zza("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", ((zzhpi) zze2.zzbm()).zzaM(), zzhqb.ASYMMETRIC_PRIVATE, zzh(zzhsiVar.zzd().zzf()), zzhsiVar.zze().zzb());
    }

    public static /* synthetic */ zzhsi zzg(zzhlb zzhlbVar, zzhbt zzhbtVar) {
        if (!zzhlbVar.zzg().equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(zzhlbVar.zzg())));
        }
        try {
            zzhpi zzd2 = zzhpi.zzd(zzhlbVar.zzb(), zzibb.zza());
            if (zzd2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhpk zzb2 = zzd2.zzb();
            if (zzb2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhsb zzb3 = zzhsg.zzb();
            zzb3.zzc(zzi(zzb2.zzb().zza()));
            zzb3.zza(zzo(zzb2.zzb().zzh()));
            zzb3.zzb(zzn(zzb2.zzb().zzg()));
            zzb3.zzd(zzj(zzhlbVar.zzd()));
            zzhsg zze2 = zzb3.zze();
            zzhsj zzc2 = zzhsk.zzc();
            zzc2.zza(zze2);
            zzc2.zzb(new ECPoint(new BigInteger(1, zzb2.zzc().zzy()), new BigInteger(1, zzb2.zzd().zzy())));
            zzc2.zzc(zzhlbVar.zze());
            zzhsk zzd3 = zzc2.zzd();
            zzhsh zzc3 = zzhsi.zzc();
            zzc3.zza(zzd3);
            zzc3.zzb(zzhyf.zza(new BigInteger(1, zzd2.zzc().zzy()), zzhbtVar));
            return zzc3.zzc();
        } catch (zzicg | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
        }
    }

    private static zzhqy zzh(zzhsf zzhsfVar) throws GeneralSecurityException {
        if (zzhsf.zza.equals(zzhsfVar)) {
            return zzhqy.TINK;
        }
        if (zzhsf.zzb.equals(zzhsfVar)) {
            return zzhqy.CRUNCHY;
        }
        if (zzhsf.zzd.equals(zzhsfVar)) {
            return zzhqy.RAW;
        }
        if (zzhsf.zzc.equals(zzhsfVar)) {
            return zzhqy.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzhsfVar.toString()));
    }

    private static zzhsd zzi(zzhpt zzhptVar) throws GeneralSecurityException {
        int ordinal = zzhptVar.ordinal();
        if (ordinal == 2) {
            return zzhsd.zzb;
        }
        if (ordinal == 3) {
            return zzhsd.zza;
        }
        if (ordinal == 4) {
            return zzhsd.zzc;
        }
        int zza2 = zzhptVar.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 26);
        sb.append("Unable to parse HashType: ");
        sb.append(zza2);
        throw new GeneralSecurityException(sb.toString());
    }

    private static zzhsf zzj(zzhqy zzhqyVar) throws GeneralSecurityException {
        int ordinal = zzhqyVar.ordinal();
        if (ordinal == 1) {
            return zzhsf.zza;
        }
        if (ordinal == 2) {
            return zzhsf.zzc;
        }
        if (ordinal == 3) {
            return zzhsf.zzd;
        }
        if (ordinal == 4) {
            return zzhsf.zzb;
        }
        int zza2 = zzhqyVar.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 34);
        sb.append("Unable to parse OutputPrefixType: ");
        sb.append(zza2);
        throw new GeneralSecurityException(sb.toString());
    }

    private static int zzk(zzhsc zzhscVar) throws GeneralSecurityException {
        if (zzhsc.zza.equals(zzhscVar)) {
            return 33;
        }
        if (zzhsc.zzb.equals(zzhscVar)) {
            return 49;
        }
        if (zzhsc.zzc.equals(zzhscVar)) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType ".concat(zzhscVar.toString()));
    }

    private static zzhpg zzl(zzhsg zzhsgVar) throws GeneralSecurityException {
        zzhpt zzhptVar;
        int i;
        zzhpf zzb2 = zzhpg.zzb();
        zzhsd zze2 = zzhsgVar.zze();
        if (zzhsd.zza.equals(zze2)) {
            zzhptVar = zzhpt.SHA256;
        } else if (zzhsd.zzb.equals(zze2)) {
            zzhptVar = zzhpt.SHA384;
        } else {
            if (!zzhsd.zzc.equals(zze2)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(zze2.toString()));
            }
            zzhptVar = zzhpt.SHA512;
        }
        zzb2.zza(zzhptVar);
        zzhsc zzd2 = zzhsgVar.zzd();
        int i2 = 4;
        if (zzhsc.zza.equals(zzd2)) {
            i = 4;
        } else if (zzhsc.zzb.equals(zzd2)) {
            i = 5;
        } else {
            if (!zzhsc.zzc.equals(zzd2)) {
                throw new GeneralSecurityException("Unable to serialize CurveType ".concat(zzd2.toString()));
            }
            i = 6;
        }
        zzb2.zzb(i);
        zzhse zzc2 = zzhsgVar.zzc();
        if (zzhse.zza.equals(zzc2)) {
            i2 = 3;
        } else if (!zzhse.zzb.equals(zzc2)) {
            throw new GeneralSecurityException("Unable to serialize SignatureEncoding ".concat(zzc2.toString()));
        }
        zzb2.zzc(i2);
        return (zzhpg) zzb2.zzbm();
    }

    private static zzhpk zzm(zzhsk zzhskVar) throws GeneralSecurityException {
        int zzk = zzk(zzhskVar.zzf().zzd());
        ECPoint zzd2 = zzhskVar.zzd();
        zzhpj zzg2 = zzhpk.zzg();
        zzg2.zza(zzl(zzhskVar.zzf()));
        byte[] zzb2 = zzhig.zzb(zzd2.getAffineX(), zzk);
        zzian zzianVar = zzian.zza;
        zzg2.zzb(zzian.zzs(zzb2, 0, zzb2.length));
        byte[] zzb3 = zzhig.zzb(zzd2.getAffineY(), zzk);
        zzg2.zzc(zzian.zzs(zzb3, 0, zzb3.length));
        return (zzhpk) zzg2.zzbm();
    }

    private static zzhsc zzn(int i) throws GeneralSecurityException {
        int i2 = i - 2;
        if (i2 == 2) {
            return zzhsc.zza;
        }
        if (i2 == 3) {
            return zzhsc.zzb;
        }
        if (i2 == 4) {
            return zzhsc.zzc;
        }
        int zza2 = zzhps.zza(i);
        StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 35);
        sb.append("Unable to parse EllipticCurveType: ");
        sb.append(zza2);
        throw new GeneralSecurityException(sb.toString());
    }

    private static zzhse zzo(int i) throws GeneralSecurityException {
        int i2 = i - 2;
        if (i2 == 1) {
            return zzhse.zza;
        }
        if (i2 == 2) {
            return zzhse.zzb;
        }
        int zza2 = zzhpl.zza(i);
        StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 40);
        sb.append("Unable to parse EcdsaSignatureEncoding: ");
        sb.append(zza2);
        throw new GeneralSecurityException(sb.toString());
    }
}
