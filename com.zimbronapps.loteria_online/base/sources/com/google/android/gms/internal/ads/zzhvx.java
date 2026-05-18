package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhvx {
    public static final /* synthetic */ int zza = 0;
    private static final zzhye zzb;
    private static final zzhye zzc;
    private static final zzhkn zzd;
    private static final zzhkk zze;
    private static final zzhji zzf;
    private static final zzhjf zzg;
    private static final zzhji zzh;
    private static final zzhjf zzi;
    private static final zzhiu zzj;
    private static final zzhiu zzk;

    static {
        zzhye zza2 = zzhln.zza("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
        zzb = zza2;
        zzhye zza3 = zzhln.zza("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey");
        zzc = zza3;
        zzd = zzhkn.zzd(zzhvw.zza, zzhty.class, zzhlc.class);
        zze = zzhkk.zzd(zzhvr.zza, zza2, zzhlc.class);
        zzf = zzhji.zzd(zzhvs.zza, zzhuc.class, zzhlb.class);
        zzg = zzhjf.zzd(zzhvt.zza, zza3, zzhlb.class);
        zzh = zzhji.zzd(zzhvu.zza, zzhua.class, zzhlb.class);
        zzi = zzhjf.zzd(zzhvv.zza, zza2, zzhlb.class);
        zzhit zza4 = zzhiu.zza();
        zza4.zza(zzhqy.RAW, zzhtx.zzd);
        zza4.zza(zzhqy.TINK, zzhtx.zza);
        zza4.zza(zzhqy.CRUNCHY, zzhtx.zzb);
        zza4.zza(zzhqy.LEGACY, zzhtx.zzc);
        zzj = zza4.zzb();
        zzhit zza5 = zzhiu.zza();
        zza5.zza(zzhpt.SHA256, zzhtw.zza);
        zza5.zza(zzhpt.SHA384, zzhtw.zzb);
        zza5.zza(zzhpt.SHA512, zzhtw.zzc);
        zzk = zza5.zzb();
    }

    public static void zza(zzhkg zzhkgVar) throws GeneralSecurityException {
        zzhkgVar.zzd(zzd);
        zzhkgVar.zze(zze);
        zzhkgVar.zzb(zzf);
        zzhkgVar.zzc(zzg);
        zzhkgVar.zzb(zzh);
        zzhkgVar.zzc(zzi);
    }

    public static /* synthetic */ zzhlc zzb(zzhty zzhtyVar) {
        zzhqe zze2 = zzhqf.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
        zzhrb zze3 = zzhrc.zze();
        zze3.zza(zzh(zzhtyVar));
        zze3.zzb(zzhtyVar.zzc());
        byte[] zza2 = zzhig.zza(zzhtyVar.zzd());
        zzian zzianVar = zzian.zza;
        zze3.zzc(zzian.zzs(zza2, 0, zza2.length));
        zze2.zzb(((zzhrc) zze3.zzbm()).zzaM());
        zze2.zzc((zzhqy) zzj.zzb(zzhtyVar.zze()));
        return zzhlc.zza((zzhqf) zze2.zzbm());
    }

    public static /* synthetic */ zzhty zzc(zzhlc zzhlcVar) {
        if (!zzhlcVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parseParameters: ".concat(String.valueOf(zzhlcVar.zzc().zza())));
        }
        try {
            zzhrc zzd2 = zzhrc.zzd(zzhlcVar.zzc().zzb(), zzibb.zza());
            zzhtv zzb2 = zzhty.zzb();
            zzb2.zzd((zzhtw) zzk.zzc(zzd2.zza().zza()));
            zzb2.zzb(new BigInteger(1, zzd2.zzc().zzy()));
            zzb2.zza(zzd2.zzb());
            zzb2.zzc((zzhtx) zzj.zzc(zzhlcVar.zzc().zzc()));
            return zzb2.zze();
        } catch (zzicg e) {
            throw new GeneralSecurityException("Parsing RsaSsaPkcs1Parameters failed: ", e);
        }
    }

    public static /* synthetic */ zzhlb zzd(zzhuc zzhucVar, zzhbt zzhbtVar) {
        return zzhlb.zza("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey", zzi(zzhucVar).zzaM(), zzhqb.ASYMMETRIC_PUBLIC, (zzhqy) zzj.zzb(zzhucVar.zzf().zze()), zzhucVar.zzb());
    }

    public static /* synthetic */ zzhuc zze(zzhlb zzhlbVar, zzhbt zzhbtVar) {
        if (!zzhlbVar.zzg().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePublicKey: ".concat(String.valueOf(zzhlbVar.zzg())));
        }
        try {
            zzhri zze2 = zzhri.zze(zzhlbVar.zzb(), zzibb.zza());
            if (zze2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, zze2.zzc().zzy());
            int bitLength = bigInteger.bitLength();
            zzhtv zzb2 = zzhty.zzb();
            zzb2.zzd((zzhtw) zzk.zzc(zze2.zzb().zza()));
            zzb2.zzb(new BigInteger(1, zze2.zzd().zzy()));
            zzb2.zza(bitLength);
            zzb2.zzc((zzhtx) zzj.zzc(zzhlbVar.zzd()));
            zzhty zze3 = zzb2.zze();
            zzhub zzc2 = zzhuc.zzc();
            zzc2.zza(zze3);
            zzc2.zzb(bigInteger);
            zzc2.zzc(zzhlbVar.zze());
            return zzc2.zzd();
        } catch (zzicg | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPkcs1PublicKey failed");
        }
    }

    public static /* synthetic */ zzhlb zzf(zzhua zzhuaVar, zzhbt zzhbtVar) {
        zzhrf zzk2 = zzhrg.zzk();
        zzk2.zza(0);
        zzk2.zzb(zzi(zzhuaVar.zze()));
        byte[] zza2 = zzhig.zza(zzhuaVar.zzi().zzb(zzhbtVar));
        zzian zzianVar = zzian.zza;
        zzk2.zzc(zzian.zzs(zza2, 0, zza2.length));
        byte[] zza3 = zzhig.zza(zzhuaVar.zzf().zzb(zzhbtVar));
        zzk2.zzd(zzian.zzs(zza3, 0, zza3.length));
        byte[] zza4 = zzhig.zza(zzhuaVar.zzh().zzb(zzhbtVar));
        zzk2.zze(zzian.zzs(zza4, 0, zza4.length));
        byte[] zza5 = zzhig.zza(zzhuaVar.zzj().zzb(zzhbtVar));
        zzk2.zzf(zzian.zzs(zza5, 0, zza5.length));
        byte[] zza6 = zzhig.zza(zzhuaVar.zzk().zzb(zzhbtVar));
        zzk2.zzg(zzian.zzs(zza6, 0, zza6.length));
        byte[] zza7 = zzhig.zza(zzhuaVar.zzl().zzb(zzhbtVar));
        zzk2.zzh(zzian.zzs(zza7, 0, zza7.length));
        return zzhlb.zza("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", ((zzhrg) zzk2.zzbm()).zzaM(), zzhqb.ASYMMETRIC_PRIVATE, (zzhqy) zzj.zzb(zzhuaVar.zzd().zze()), zzhuaVar.zze().zzb());
    }

    public static /* synthetic */ zzhua zzg(zzhlb zzhlbVar, zzhbt zzhbtVar) {
        if (!zzhlbVar.zzg().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(zzhlbVar.zzg())));
        }
        try {
            zzhrg zzj2 = zzhrg.zzj(zzhlbVar.zzb(), zzibb.zza());
            if (zzj2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhri zzb2 = zzj2.zzb();
            if (zzb2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, zzb2.zzc().zzy());
            int bitLength = bigInteger.bitLength();
            BigInteger bigInteger2 = new BigInteger(1, zzb2.zzd().zzy());
            zzhtv zzb3 = zzhty.zzb();
            zzb3.zzd((zzhtw) zzk.zzc(zzb2.zzb().zza()));
            zzb3.zzb(bigInteger2);
            zzb3.zza(bitLength);
            zzb3.zzc((zzhtx) zzj.zzc(zzhlbVar.zzd()));
            zzhty zze2 = zzb3.zze();
            zzhub zzc2 = zzhuc.zzc();
            zzc2.zza(zze2);
            zzc2.zzb(bigInteger);
            zzc2.zzc(zzhlbVar.zze());
            zzhuc zzd2 = zzc2.zzd();
            zzhtz zzc3 = zzhua.zzc();
            zzc3.zza(zzd2);
            zzc3.zzb(zzj(zzj2.zzd(), zzhbtVar), zzj(zzj2.zze(), zzhbtVar));
            zzc3.zzc(zzj(zzj2.zzc(), zzhbtVar));
            zzc3.zzd(zzj(zzj2.zzg(), zzhbtVar), zzj(zzj2.zzh(), zzhbtVar));
            zzc3.zze(zzj(zzj2.zzi(), zzhbtVar));
            return zzc3.zzf();
        } catch (zzicg | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPkcs1PrivateKey failed");
        }
    }

    private static zzhre zzh(zzhty zzhtyVar) throws GeneralSecurityException {
        zzhrd zzb2 = zzhre.zzb();
        zzb2.zza((zzhpt) zzk.zzb(zzhtyVar.zzf()));
        return (zzhre) zzb2.zzbm();
    }

    private static zzhri zzi(zzhuc zzhucVar) throws GeneralSecurityException {
        zzhrh zzg2 = zzhri.zzg();
        zzg2.zza(zzh(zzhucVar.zzf()));
        byte[] zza2 = zzhig.zza(zzhucVar.zzd());
        zzian zzianVar = zzian.zza;
        zzg2.zzb(zzian.zzs(zza2, 0, zza2.length));
        byte[] zza3 = zzhig.zza(zzhucVar.zzf().zzd());
        zzg2.zzc(zzian.zzs(zza3, 0, zza3.length));
        return (zzhri) zzg2.zzbm();
    }

    private static zzhyf zzj(zzian zzianVar, zzhbt zzhbtVar) {
        return zzhyf.zza(new BigInteger(1, zzianVar.zzy()), zzhbtVar);
    }
}
