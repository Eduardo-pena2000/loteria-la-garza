package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzheq {
    public static final /* synthetic */ int zza = 0;
    private static final zzhye zzb;
    private static final zzhkn zzc;
    private static final zzhkk zzd;
    private static final zzhji zze;
    private static final zzhjf zzf;

    static {
        zzhye zza2 = zzhln.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zzb = zza2;
        zzc = zzhkn.zzd(zzhep.zza, zzhel.class, zzhlc.class);
        zzd = zzhkk.zzd(zzhem.zza, zza2, zzhlc.class);
        zze = zzhji.zzd(zzhen.zza, zzhej.class, zzhlb.class);
        zzf = zzhjf.zzd(zzheo.zza, zza2, zzhlb.class);
    }

    public static void zza(zzhkg zzhkgVar) throws GeneralSecurityException {
        zzhkgVar.zzd(zzc);
        zzhkgVar.zze(zzd);
        zzhkgVar.zzb(zze);
        zzhkgVar.zzc(zzf);
    }

    public static /* synthetic */ zzhlc zzb(zzhel zzhelVar) {
        zzhqe zze2 = zzhqf.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zzhqs zzc2 = zzhqt.zzc();
        zzc2.zza(zzhelVar.zzc());
        zze2.zzb(((zzhqt) zzc2.zzbm()).zzaM());
        zze2.zzc(zzf(zzhelVar.zzd()));
        return zzhlc.zza((zzhqf) zze2.zzbm());
    }

    public static /* synthetic */ zzhel zzc(zzhlc zzhlcVar) {
        if (!zzhlcVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzhlcVar.zzc().zza())));
        }
        try {
            return zzhel.zzb(zzhqt.zzb(zzhlcVar.zzc().zzb(), zzibb.zza()).zza(), zzg(zzhlcVar.zzc().zzc()));
        } catch (zzicg e) {
            throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e);
        }
    }

    public static /* synthetic */ zzhlb zzd(zzhej zzhejVar, zzhbt zzhbtVar) {
        zzhqq zzd2 = zzhqr.zzd();
        zzhqs zzc2 = zzhqt.zzc();
        zzc2.zza(zzhejVar.zze().zzc());
        zzd2.zza((zzhqt) zzc2.zzbm());
        return zzhlb.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((zzhqr) zzd2.zzbm()).zzaM(), zzhqb.zze, zzf(zzhejVar.zze().zzd()), zzhejVar.zzb());
    }

    public static /* synthetic */ zzhej zze(zzhlb zzhlbVar, zzhbt zzhbtVar) {
        if (!zzhlbVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        }
        try {
            zzhqr zzc2 = zzhqr.zzc(zzhlbVar.zzb(), zzibb.zza());
            if (zzc2.zza() == 0) {
                return zzhej.zzd(zzhel.zzb(zzc2.zzb().zza(), zzg(zzhlbVar.zzd())), zzhlbVar.zze());
            }
            String valueOf = String.valueOf(zzc2);
            StringBuilder sb = new StringBuilder(valueOf.length() + 49);
            sb.append("KmsAeadKey are only accepted with version 0, got ");
            sb.append(valueOf);
            throw new GeneralSecurityException(sb.toString());
        } catch (zzicg e) {
            throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e);
        }
    }

    private static zzhqy zzf(zzhek zzhekVar) throws GeneralSecurityException {
        if (zzhek.zza.equals(zzhekVar)) {
            return zzhqy.zzb;
        }
        if (zzhek.zzb.equals(zzhekVar)) {
            return zzhqy.zzd;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzhekVar.toString()));
    }

    private static zzhek zzg(zzhqy zzhqyVar) throws GeneralSecurityException {
        int ordinal = zzhqyVar.ordinal();
        if (ordinal == 1) {
            return zzhek.zza;
        }
        if (ordinal == 3) {
            return zzhek.zzb;
        }
        int zza2 = zzhqyVar.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 34);
        sb.append("Unable to parse OutputPrefixType: ");
        sb.append(zza2);
        throw new GeneralSecurityException(sb.toString());
    }
}
