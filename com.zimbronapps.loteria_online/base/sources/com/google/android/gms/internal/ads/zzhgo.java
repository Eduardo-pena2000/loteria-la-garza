package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhgo {
    public static final /* synthetic */ int zza = 0;
    private static final zzhye zzb;
    private static final zzhkn zzc;
    private static final zzhkk zzd;
    private static final zzhji zze;
    private static final zzhjf zzf;

    static {
        zzhye zza2 = zzhln.zza("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzb = zza2;
        zzc = zzhkn.zzd(zzhgn.zza, zzhdm.class, zzhlc.class);
        zzd = zzhkk.zzd(zzhgk.zza, zza2, zzhlc.class);
        zze = zzhji.zzd(zzhgl.zza, zzhdf.class, zzhlb.class);
        zzf = zzhjf.zzd(zzhgm.zza, zza2, zzhlb.class);
    }

    public static void zza(zzhkg zzhkgVar) throws GeneralSecurityException {
        zzhkgVar.zzd(zzc);
        zzhkgVar.zze(zzd);
        zzhkgVar.zzb(zze);
        zzhkgVar.zzc(zzf);
    }

    public static /* synthetic */ zzhlc zzb(zzhdm zzhdmVar) {
        zzhqe zze2 = zzhqf.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzhot zzd2 = zzhou.zzd();
        zzd2.zza(zzhdmVar.zzc());
        zze2.zzb(((zzhou) zzd2.zzbm()).zzaM());
        zze2.zzc(zzf(zzhdmVar.zzd()));
        return zzhlc.zza((zzhqf) zze2.zzbm());
    }

    public static /* synthetic */ zzhdm zzc(zzhlc zzhlcVar) {
        if (!zzhlcVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(zzhlcVar.zzc().zza())));
        }
        try {
            zzhou zzc2 = zzhou.zzc(zzhlcVar.zzc().zzb(), zzibb.zza());
            if (zzc2.zzb() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            zzhdk zzb2 = zzhdm.zzb();
            zzb2.zza(zzc2.zza());
            zzb2.zzb(12);
            zzb2.zzc(16);
            zzb2.zzd(zzg(zzhlcVar.zzc().zzc()));
            return zzb2.zze();
        } catch (zzicg e) {
            throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e);
        }
    }

    public static /* synthetic */ zzhlb zzd(zzhdf zzhdfVar, zzhbt zzhbtVar) {
        zzhor zzd2 = zzhos.zzd();
        byte[] zzc2 = zzhdfVar.zze().zzc(zzhbtVar);
        zzd2.zza(zzian.zzs(zzc2, 0, zzc2.length));
        return zzhlb.zza("type.googleapis.com/google.crypto.tink.AesGcmKey", ((zzhos) zzd2.zzbm()).zzaM(), zzhqb.zzb, zzf(zzhdfVar.zzf().zzd()), zzhdfVar.zzb());
    }

    public static /* synthetic */ zzhdf zze(zzhlb zzhlbVar, zzhbt zzhbtVar) {
        if (!zzhlbVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
        try {
            zzhos zzc2 = zzhos.zzc(zzhlbVar.zzb(), zzibb.zza());
            if (zzc2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhdk zzb2 = zzhdm.zzb();
            zzb2.zza(zzc2.zzb().zzc());
            zzb2.zzb(12);
            zzb2.zzc(16);
            zzb2.zzd(zzg(zzhlbVar.zzd()));
            zzhdm zze2 = zzb2.zze();
            zzhde zzd2 = zzhdf.zzd();
            zzd2.zza(zze2);
            zzd2.zzb(zzhyg.zza(zzc2.zzb().zzy(), zzhbtVar));
            zzd2.zzc(zzhlbVar.zze());
            return zzd2.zzd();
        } catch (zzicg unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    private static zzhqy zzf(zzhdl zzhdlVar) throws GeneralSecurityException {
        if (zzhdl.zza.equals(zzhdlVar)) {
            return zzhqy.zzb;
        }
        if (zzhdl.zzb.equals(zzhdlVar)) {
            return zzhqy.zze;
        }
        if (zzhdl.zzc.equals(zzhdlVar)) {
            return zzhqy.zzd;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzhdlVar)));
    }

    private static zzhdl zzg(zzhqy zzhqyVar) throws GeneralSecurityException {
        int ordinal = zzhqyVar.ordinal();
        if (ordinal == 1) {
            return zzhdl.zza;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return zzhdl.zzc;
            }
            if (ordinal != 4) {
                int zza2 = zzhqyVar.zza();
                StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(zza2);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return zzhdl.zzb;
    }
}
