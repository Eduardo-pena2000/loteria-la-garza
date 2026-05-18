package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhfa {
    public static final /* synthetic */ int zza = 0;
    private static final zzhye zzb;
    private static final zzhkn zzc;
    private static final zzhkk zzd;
    private static final zzhji zze;
    private static final zzhjf zzf;

    static {
        zzhye zza2 = zzhln.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zzb = zza2;
        zzc = zzhkn.zzd(zzhez.zza, zzhev.class, zzhlc.class);
        zzd = zzhkk.zzd(zzhew.zza, zza2, zzhlc.class);
        zze = zzhji.zzd(zzhex.zza, zzher.class, zzhlb.class);
        zzf = zzhjf.zzd(zzhey.zza, zza2, zzhlb.class);
    }

    public static void zza(zzhkg zzhkgVar) throws GeneralSecurityException {
        zzhkgVar.zzd(zzc);
        zzhkgVar.zze(zzd);
        zzhkgVar.zzb(zze);
        zzhkgVar.zzc(zzf);
    }

    public static /* synthetic */ zzhlc zzb(zzhev zzhevVar) {
        zzhqe zze2 = zzhqf.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zze2.zzb(zzg(zzhevVar).zzaM());
        zze2.zzc(zzf(zzhevVar.zzc()));
        return zzhlc.zza((zzhqf) zze2.zzbm());
    }

    public static /* synthetic */ zzhev zzc(zzhlc zzhlcVar) {
        if (!zzhlcVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzhlcVar.zzc().zza())));
        }
        try {
            return zzh(zzhqx.zzc(zzhlcVar.zzc().zzb(), zzibb.zza()), zzhlcVar.zzc().zzc());
        } catch (zzicg e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    public static /* synthetic */ zzhlb zzd(zzher zzherVar, zzhbt zzhbtVar) {
        zzhqu zzd2 = zzhqv.zzd();
        zzd2.zza(zzg(zzherVar.zze()));
        return zzhlb.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((zzhqv) zzd2.zzbm()).zzaM(), zzhqb.zze, zzf(zzherVar.zze().zzc()), zzherVar.zzb());
    }

    public static /* synthetic */ zzher zze(zzhlb zzhlbVar, zzhbt zzhbtVar) {
        if (!zzhlbVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
        }
        try {
            zzhqv zzc2 = zzhqv.zzc(zzhlbVar.zzb(), zzibb.zza());
            if (zzc2.zza() == 0) {
                return zzher.zzd(zzh(zzc2.zzb(), zzhlbVar.zzd()), zzhlbVar.zze());
            }
            String valueOf = String.valueOf(zzc2);
            StringBuilder sb = new StringBuilder(valueOf.length() + 58);
            sb.append("KmsEnvelopeAeadKeys are only accepted with version 0, got ");
            sb.append(valueOf);
            throw new GeneralSecurityException(sb.toString());
        } catch (zzicg e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e);
        }
    }

    private static zzhqy zzf(zzheu zzheuVar) throws GeneralSecurityException {
        if (zzheu.zza.equals(zzheuVar)) {
            return zzhqy.zzb;
        }
        if (zzheu.zzb.equals(zzheuVar)) {
            return zzhqy.zzd;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzheuVar)));
    }

    private static zzhqx zzg(zzhev zzhevVar) throws GeneralSecurityException {
        try {
            zzhqf zzd2 = zzhqf.zzd(zzhbv.zza(zzhevVar.zzd()), zzibb.zza());
            zzhqw zzd3 = zzhqx.zzd();
            zzd3.zza(zzhevVar.zzb());
            zzd3.zzb(zzd2);
            return (zzhqx) zzd3.zzbm();
        } catch (zzicg e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    private static zzhev zzh(zzhqx zzhqxVar, zzhqy zzhqyVar) throws GeneralSecurityException {
        zzhet zzhetVar;
        zzheu zzheuVar;
        zzhqe zze2 = zzhqf.zze();
        zze2.zza(zzhqxVar.zzb().zza());
        zze2.zzb(zzhqxVar.zzb().zzb());
        zze2.zzc(zzhqy.zzd);
        zzhbp zzb2 = zzhbv.zzb(((zzhqf) zze2.zzbm()).zzaN());
        if (zzb2 instanceof zzhdm) {
            zzhetVar = zzhet.zza;
        } else if (zzb2 instanceof zzheb) {
            zzhetVar = zzhet.zzc;
        } else if (zzb2 instanceof zzhfx) {
            zzhetVar = zzhet.zzb;
        } else if (zzb2 instanceof zzhcv) {
            zzhetVar = zzhet.zzd;
        } else if (zzb2 instanceof zzhdd) {
            zzhetVar = zzhet.zze;
        } else {
            if (!(zzb2 instanceof zzhdv)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(zzb2.toString()));
            }
            zzhetVar = zzhet.zzf;
        }
        zzhes zzhesVar = new zzhes(null);
        int ordinal = zzhqyVar.ordinal();
        if (ordinal == 1) {
            zzheuVar = zzheu.zza;
        } else {
            if (ordinal != 3) {
                int zza2 = zzhqyVar.zza();
                StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(zza2);
                throw new GeneralSecurityException(sb.toString());
            }
            zzheuVar = zzheu.zzb;
        }
        zzhesVar.zza(zzheuVar);
        zzhesVar.zzb(zzhqxVar.zza());
        zzhesVar.zzd((zzhch) zzb2);
        zzhesVar.zzc(zzhetVar);
        return zzhesVar.zze();
    }
}
