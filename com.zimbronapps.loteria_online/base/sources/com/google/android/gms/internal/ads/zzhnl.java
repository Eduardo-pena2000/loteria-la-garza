package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhnl {
    public static final /* synthetic */ int zza = 0;
    private static final zzhye zzb;
    private static final zzhiu zzc;
    private static final zzhiu zzd;
    private static final zzhkn zze;
    private static final zzhkk zzf;
    private static final zzhji zzg;
    private static final zzhjf zzh;

    static {
        zzhye zza2 = zzhln.zza("type.googleapis.com/google.crypto.tink.HmacKey");
        zzb = zza2;
        zzhit zza3 = zzhiu.zza();
        zza3.zza(zzhqy.zzd, zzhmj.zzd);
        zza3.zza(zzhqy.zzb, zzhmj.zza);
        zza3.zza(zzhqy.zzc, zzhmj.zzc);
        zza3.zza(zzhqy.zze, zzhmj.zzb);
        zzc = zza3.zzb();
        zzhit zza4 = zzhiu.zza();
        zza4.zza(zzhpt.zzb, zzhmi.zza);
        zza4.zza(zzhpt.zzf, zzhmi.zzb);
        zza4.zza(zzhpt.zzd, zzhmi.zzc);
        zza4.zza(zzhpt.zzc, zzhmi.zzd);
        zza4.zza(zzhpt.zze, zzhmi.zze);
        zzd = zza4.zzb();
        zze = zzhkn.zzd(zzhnk.zza, zzhmk.class, zzhlc.class);
        zzf = zzhkk.zzd(zzhnh.zza, zza2, zzhlc.class);
        zzg = zzhji.zzd(zzhni.zza, zzhmb.class, zzhlb.class);
        zzh = zzhjf.zzd(zzhnj.zza, zza2, zzhlb.class);
    }

    public static void zza(zzhkg zzhkgVar) throws GeneralSecurityException {
        zzhkgVar.zzd(zze);
        zzhkgVar.zze(zzf);
        zzhkgVar.zzb(zzg);
        zzhkgVar.zzc(zzh);
    }

    public static /* synthetic */ zzhlc zzb(zzhmk zzhmkVar) {
        zzhqe zze2 = zzhqf.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.HmacKey");
        zzhpw zze3 = zzhpx.zze();
        zze3.zza(zzf(zzhmkVar));
        zze3.zzb(zzhmkVar.zzc());
        zze2.zzb(((zzhpx) zze3.zzbm()).zzaM());
        zze2.zzc((zzhqy) zzc.zzb(zzhmkVar.zzf()));
        return zzhlc.zza((zzhqf) zze2.zzbm());
    }

    public static /* synthetic */ zzhmk zzc(zzhlc zzhlcVar) {
        if (!zzhlcVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzhlcVar.zzc().zza())));
        }
        try {
            zzhpx zzd2 = zzhpx.zzd(zzhlcVar.zzc().zzb(), zzibb.zza());
            if (zzd2.zzc() != 0) {
                int zzc2 = zzd2.zzc();
                StringBuilder sb = new StringBuilder(String.valueOf(zzc2).length() + 47);
                sb.append("Parsing HmacParameters failed: unknown Version ");
                sb.append(zzc2);
                throw new GeneralSecurityException(sb.toString());
            }
            zzhmh zzb2 = zzhmk.zzb();
            zzb2.zza(zzd2.zzb());
            zzb2.zzb(zzd2.zza().zzb());
            zzb2.zzd((zzhmi) zzd.zzc(zzd2.zza().zza()));
            zzb2.zzc((zzhmj) zzc.zzc(zzhlcVar.zzc().zzc()));
            return zzb2.zze();
        } catch (zzicg e) {
            throw new GeneralSecurityException("Parsing HmacParameters failed: ", e);
        }
    }

    public static /* synthetic */ zzhlb zzd(zzhmb zzhmbVar, zzhbt zzhbtVar) {
        zzhpu zze2 = zzhpv.zze();
        zze2.zza(zzf(zzhmbVar.zzf()));
        byte[] zzc2 = zzhmbVar.zzd().zzc(zzhbtVar);
        zze2.zzb(zzian.zzs(zzc2, 0, zzc2.length));
        return zzhlb.zza("type.googleapis.com/google.crypto.tink.HmacKey", ((zzhpv) zze2.zzbm()).zzaM(), zzhqb.zzb, (zzhqy) zzc.zzb(zzhmbVar.zzf().zzf()), zzhmbVar.zzb());
    }

    public static /* synthetic */ zzhmb zze(zzhlb zzhlbVar, zzhbt zzhbtVar) {
        if (!zzhlbVar.zzg().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            zzhpv zzd2 = zzhpv.zzd(zzhlbVar.zzb(), zzibb.zza());
            if (zzd2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhmh zzb2 = zzhmk.zzb();
            zzb2.zza(zzd2.zzc().zzc());
            zzb2.zzb(zzd2.zzb().zzb());
            zzb2.zzd((zzhmi) zzd.zzc(zzd2.zzb().zza()));
            zzb2.zzc((zzhmj) zzc.zzc(zzhlbVar.zzd()));
            zzhmk zze2 = zzb2.zze();
            zzhma zzc2 = zzhmb.zzc();
            zzc2.zza(zze2);
            zzc2.zzb(zzhyg.zza(zzd2.zzc().zzy(), zzhbtVar));
            zzc2.zzc(zzhlbVar.zze());
            return zzc2.zzd();
        } catch (zzicg | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    private static zzhpz zzf(zzhmk zzhmkVar) throws GeneralSecurityException {
        zzhpy zzc2 = zzhpz.zzc();
        zzc2.zzb(zzhmkVar.zzd());
        zzc2.zza((zzhpt) zzd.zzb(zzhmkVar.zzg()));
        return (zzhpz) zzc2.zzbm();
    }
}
