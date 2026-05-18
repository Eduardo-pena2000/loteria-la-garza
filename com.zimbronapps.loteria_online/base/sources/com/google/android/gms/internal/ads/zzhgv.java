package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhgv {
    public static final /* synthetic */ int zza = 0;
    private static final zzhye zzb;
    private static final zzhkn zzc;
    private static final zzhkk zzd;
    private static final zzhji zze;
    private static final zzhjf zzf;

    static {
        zzhye zza2 = zzhln.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzb = zza2;
        zzc = zzhkn.zzd(zzhgu.zza, zzhdv.class, zzhlc.class);
        zzd = zzhkk.zzd(zzhgr.zza, zza2, zzhlc.class);
        zze = zzhji.zzd(zzhgs.zza, zzhdo.class, zzhlb.class);
        zzf = zzhjf.zzd(zzhgt.zza, zza2, zzhlb.class);
    }

    public static void zza(zzhkg zzhkgVar) throws GeneralSecurityException {
        zzhkgVar.zzd(zzc);
        zzhkgVar.zze(zzd);
        zzhkgVar.zzb(zze);
        zzhkgVar.zzc(zzf);
    }

    public static /* synthetic */ zzhlc zzb(zzhdv zzhdvVar) {
        zzhqe zze2 = zzhqf.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzhox zzd2 = zzhoy.zzd();
        zzd2.zza(zzhdvVar.zzc());
        zze2.zzb(((zzhoy) zzd2.zzbm()).zzaM());
        zze2.zzc(zzf(zzhdvVar.zzd()));
        return zzhlc.zza((zzhqf) zze2.zzbm());
    }

    public static /* synthetic */ zzhdv zzc(zzhlc zzhlcVar) {
        if (!zzhlcVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(zzhlcVar.zzc().zza())));
        }
        try {
            zzhoy zzc2 = zzhoy.zzc(zzhlcVar.zzc().zzb(), zzibb.zza());
            if (zzc2.zzb() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            zzhdt zzb2 = zzhdv.zzb();
            zzb2.zza(zzc2.zza());
            zzb2.zzb(zzg(zzhlcVar.zzc().zzc()));
            return zzb2.zzc();
        } catch (zzicg e) {
            throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e);
        }
    }

    public static /* synthetic */ zzhlb zzd(zzhdo zzhdoVar, zzhbt zzhbtVar) {
        zzhov zzd2 = zzhow.zzd();
        byte[] zzc2 = zzhdoVar.zze().zzc(zzhbtVar);
        zzd2.zza(zzian.zzs(zzc2, 0, zzc2.length));
        return zzhlb.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((zzhow) zzd2.zzbm()).zzaM(), zzhqb.zzb, zzf(zzhdoVar.zzf().zzd()), zzhdoVar.zzb());
    }

    public static /* synthetic */ zzhdo zze(zzhlb zzhlbVar, zzhbt zzhbtVar) {
        if (!zzhlbVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
        try {
            zzhow zzc2 = zzhow.zzc(zzhlbVar.zzb(), zzibb.zza());
            if (zzc2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhdt zzb2 = zzhdv.zzb();
            zzb2.zza(zzc2.zzb().zzc());
            zzb2.zzb(zzg(zzhlbVar.zzd()));
            zzhdv zzc3 = zzb2.zzc();
            zzhdn zzd2 = zzhdo.zzd();
            zzd2.zza(zzc3);
            zzd2.zzb(zzhyg.zza(zzc2.zzb().zzy(), zzhbtVar));
            zzd2.zzc(zzhlbVar.zze());
            return zzd2.zzd();
        } catch (zzicg unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    private static zzhqy zzf(zzhdu zzhduVar) throws GeneralSecurityException {
        if (zzhdu.zza.equals(zzhduVar)) {
            return zzhqy.zzb;
        }
        if (zzhdu.zzb.equals(zzhduVar)) {
            return zzhqy.zze;
        }
        if (zzhdu.zzc.equals(zzhduVar)) {
            return zzhqy.zzd;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzhduVar)));
    }

    private static zzhdu zzg(zzhqy zzhqyVar) throws GeneralSecurityException {
        int ordinal = zzhqyVar.ordinal();
        if (ordinal == 1) {
            return zzhdu.zza;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return zzhdu.zzc;
            }
            if (ordinal != 4) {
                int zza2 = zzhqyVar.zza();
                StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(zza2);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return zzhdu.zzb;
    }
}
