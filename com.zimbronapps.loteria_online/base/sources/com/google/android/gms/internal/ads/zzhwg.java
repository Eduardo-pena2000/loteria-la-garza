package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhwg {
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
        zzhye zza2 = zzhln.zza("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
        zzb = zza2;
        zzhye zza3 = zzhln.zza("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey");
        zzc = zza3;
        zzd = zzhkn.zzd(zzhwf.zza, zzhuk.class, zzhlc.class);
        zze = zzhkk.zzd(zzhwa.zza, zza2, zzhlc.class);
        zzf = zzhji.zzd(zzhwb.zza, zzhuo.class, zzhlb.class);
        zzg = zzhjf.zzd(zzhwc.zza, zza3, zzhlb.class);
        zzh = zzhji.zzd(zzhwd.zza, zzhum.class, zzhlb.class);
        zzi = zzhjf.zzd(zzhwe.zza, zza2, zzhlb.class);
        zzhit zza4 = zzhiu.zza();
        zza4.zza(zzhqy.RAW, zzhuj.zzd);
        zza4.zza(zzhqy.TINK, zzhuj.zza);
        zza4.zza(zzhqy.CRUNCHY, zzhuj.zzb);
        zza4.zza(zzhqy.LEGACY, zzhuj.zzc);
        zzj = zza4.zzb();
        zzhit zza5 = zzhiu.zza();
        zza5.zza(zzhpt.SHA256, zzhui.zza);
        zza5.zza(zzhpt.SHA384, zzhui.zzb);
        zza5.zza(zzhpt.SHA512, zzhui.zzc);
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

    public static /* synthetic */ zzhlc zzb(zzhuk zzhukVar) {
        zzhqe zze2 = zzhqf.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
        zzhrj zze3 = zzhrk.zze();
        zze3.zza(zzh(zzhukVar));
        zze3.zzb(zzhukVar.zzc());
        byte[] zza2 = zzhig.zza(zzhukVar.zzd());
        zzian zzianVar = zzian.zza;
        zze3.zzc(zzian.zzs(zza2, 0, zza2.length));
        zze2.zzb(((zzhrk) zze3.zzbm()).zzaM());
        zze2.zzc((zzhqy) zzj.zzb(zzhukVar.zze()));
        return zzhlc.zza((zzhqf) zze2.zzbm());
    }

    public static /* synthetic */ zzhuk zzc(zzhlc zzhlcVar) {
        if (!zzhlcVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parseParameters: ".concat(String.valueOf(zzhlcVar.zzc().zza())));
        }
        try {
            zzhrk zzd2 = zzhrk.zzd(zzhlcVar.zzc().zzb(), zzibb.zza());
            zzhuh zzb2 = zzhuk.zzb();
            zzhiu zzhiuVar = zzk;
            zzb2.zzd((zzhui) zzhiuVar.zzc(zzd2.zza().zza()));
            zzb2.zze((zzhui) zzhiuVar.zzc(zzd2.zza().zzb()));
            zzb2.zzb(new BigInteger(1, zzd2.zzc().zzy()));
            zzb2.zza(zzd2.zzb());
            zzb2.zzf(zzd2.zza().zzc());
            zzb2.zzc((zzhuj) zzj.zzc(zzhlcVar.zzc().zzc()));
            return zzb2.zzg();
        } catch (zzicg e) {
            throw new GeneralSecurityException("Parsing RsaSsaPssParameters failed: ", e);
        }
    }

    public static /* synthetic */ zzhlb zzd(zzhuo zzhuoVar, zzhbt zzhbtVar) {
        return zzhlb.zza("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey", zzi(zzhuoVar).zzaM(), zzhqb.ASYMMETRIC_PUBLIC, (zzhqy) zzj.zzb(zzhuoVar.zzf().zze()), zzhuoVar.zzb());
    }

    public static /* synthetic */ zzhuo zze(zzhlb zzhlbVar, zzhbt zzhbtVar) {
        if (!zzhlbVar.zzg().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePublicKey: ".concat(String.valueOf(zzhlbVar.zzg())));
        }
        try {
            zzhrq zze2 = zzhrq.zze(zzhlbVar.zzb(), zzibb.zza());
            if (zze2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, zze2.zzc().zzy());
            int bitLength = bigInteger.bitLength();
            zzhuh zzb2 = zzhuk.zzb();
            zzhiu zzhiuVar = zzk;
            zzb2.zzd((zzhui) zzhiuVar.zzc(zze2.zzb().zza()));
            zzb2.zze((zzhui) zzhiuVar.zzc(zze2.zzb().zzb()));
            zzb2.zzb(new BigInteger(1, zze2.zzd().zzy()));
            zzb2.zza(bitLength);
            zzb2.zzf(zze2.zzb().zzc());
            zzb2.zzc((zzhuj) zzj.zzc(zzhlbVar.zzd()));
            zzhuk zzg2 = zzb2.zzg();
            zzhun zzc2 = zzhuo.zzc();
            zzc2.zza(zzg2);
            zzc2.zzb(bigInteger);
            zzc2.zzc(zzhlbVar.zze());
            return zzc2.zzd();
        } catch (zzicg | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPssPublicKey failed");
        }
    }

    public static /* synthetic */ zzhlb zzf(zzhum zzhumVar, zzhbt zzhbtVar) {
        zzhrn zzk2 = zzhro.zzk();
        zzk2.zza(0);
        zzk2.zzb(zzi(zzhumVar.zze()));
        byte[] zza2 = zzhig.zza(zzhumVar.zzi().zzb(zzhbtVar));
        zzian zzianVar = zzian.zza;
        zzk2.zzc(zzian.zzs(zza2, 0, zza2.length));
        byte[] zza3 = zzhig.zza(zzhumVar.zzf().zzb(zzhbtVar));
        zzk2.zzd(zzian.zzs(zza3, 0, zza3.length));
        byte[] zza4 = zzhig.zza(zzhumVar.zzh().zzb(zzhbtVar));
        zzk2.zze(zzian.zzs(zza4, 0, zza4.length));
        byte[] zza5 = zzhig.zza(zzhumVar.zzj().zzb(zzhbtVar));
        zzk2.zzf(zzian.zzs(zza5, 0, zza5.length));
        byte[] zza6 = zzhig.zza(zzhumVar.zzk().zzb(zzhbtVar));
        zzk2.zzg(zzian.zzs(zza6, 0, zza6.length));
        byte[] zza7 = zzhig.zza(zzhumVar.zzl().zzb(zzhbtVar));
        zzk2.zzh(zzian.zzs(zza7, 0, zza7.length));
        return zzhlb.zza("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", ((zzhro) zzk2.zzbm()).zzaM(), zzhqb.ASYMMETRIC_PRIVATE, (zzhqy) zzj.zzb(zzhumVar.zzd().zze()), zzhumVar.zze().zzb());
    }

    public static /* synthetic */ zzhum zzg(zzhlb zzhlbVar, zzhbt zzhbtVar) {
        if (!zzhlbVar.zzg().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePrivateKey: ".concat(String.valueOf(zzhlbVar.zzg())));
        }
        try {
            zzhro zzj2 = zzhro.zzj(zzhlbVar.zzb(), zzibb.zza());
            if (zzj2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhrq zzb2 = zzj2.zzb();
            if (zzb2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, zzb2.zzc().zzy());
            int bitLength = bigInteger.bitLength();
            BigInteger bigInteger2 = new BigInteger(1, zzb2.zzd().zzy());
            zzhuh zzb3 = zzhuk.zzb();
            zzhiu zzhiuVar = zzk;
            zzb3.zzd((zzhui) zzhiuVar.zzc(zzb2.zzb().zza()));
            zzb3.zze((zzhui) zzhiuVar.zzc(zzb2.zzb().zzb()));
            zzb3.zzb(bigInteger2);
            zzb3.zza(bitLength);
            zzb3.zzf(zzb2.zzb().zzc());
            zzb3.zzc((zzhuj) zzj.zzc(zzhlbVar.zzd()));
            zzhuk zzg2 = zzb3.zzg();
            zzhun zzc2 = zzhuo.zzc();
            zzc2.zza(zzg2);
            zzc2.zzb(bigInteger);
            zzc2.zzc(zzhlbVar.zze());
            zzhuo zzd2 = zzc2.zzd();
            zzhul zzc3 = zzhum.zzc();
            zzc3.zza(zzd2);
            zzc3.zzb(zzj(zzj2.zzd(), zzhbtVar), zzj(zzj2.zze(), zzhbtVar));
            zzc3.zzc(zzj(zzj2.zzc(), zzhbtVar));
            zzc3.zzd(zzj(zzj2.zzg(), zzhbtVar), zzj(zzj2.zzh(), zzhbtVar));
            zzc3.zze(zzj(zzj2.zzi(), zzhbtVar));
            return zzc3.zzf();
        } catch (zzicg | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPssPrivateKey failed");
        }
    }

    private static zzhrm zzh(zzhuk zzhukVar) throws GeneralSecurityException {
        zzhrl zzd2 = zzhrm.zzd();
        zzhiu zzhiuVar = zzk;
        zzd2.zza((zzhpt) zzhiuVar.zzb(zzhukVar.zzf()));
        zzd2.zzb((zzhpt) zzhiuVar.zzb(zzhukVar.zzg()));
        zzd2.zzc(zzhukVar.zzh());
        return (zzhrm) zzd2.zzbm();
    }

    private static zzhrq zzi(zzhuo zzhuoVar) throws GeneralSecurityException {
        zzhrp zzg2 = zzhrq.zzg();
        zzg2.zzb(zzh(zzhuoVar.zzf()));
        byte[] zza2 = zzhig.zza(zzhuoVar.zzd());
        zzian zzianVar = zzian.zza;
        zzg2.zzc(zzian.zzs(zza2, 0, zza2.length));
        byte[] zza3 = zzhig.zza(zzhuoVar.zzf().zzd());
        zzg2.zzd(zzian.zzs(zza3, 0, zza3.length));
        zzg2.zza(0);
        return (zzhrq) zzg2.zzbm();
    }

    private static zzhyf zzj(zzian zzianVar, zzhbt zzhbtVar) {
        return zzhyf.zza(new BigInteger(1, zzianVar.zzy()), zzhbtVar);
    }
}
