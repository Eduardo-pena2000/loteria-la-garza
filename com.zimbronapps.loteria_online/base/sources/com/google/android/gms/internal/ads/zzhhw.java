package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhhw {
    public static final /* synthetic */ int zza = 0;
    private static final zzhye zzb;
    private static final zzhkn zzc;
    private static final zzhkk zzd;
    private static final zzhji zze;
    private static final zzhjf zzf;

    static {
        zzhye zza2 = zzhln.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zzb = zza2;
        zzc = zzhkn.zzd(zzhhv.zza, zzhfx.class, zzhlc.class);
        zzd = zzhkk.zzd(zzhhs.zza, zza2, zzhlc.class);
        zze = zzhji.zzd(zzhht.zza, zzhfr.class, zzhlb.class);
        zzf = zzhjf.zzd(zzhhu.zza, zza2, zzhlb.class);
    }

    public static void zza(zzhkg zzhkgVar) throws GeneralSecurityException {
        zzhkgVar.zzd(zzc);
        zzhkgVar.zze(zzd);
        zzhkgVar.zzb(zze);
        zzhkgVar.zzc(zzf);
    }

    public static /* synthetic */ zzhlc zzb(zzhfx zzhfxVar) {
        zzhqe zze2 = zzhqf.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zze2.zzb(zzhsa.zzc().zzaM());
        zze2.zzc(zzf(zzhfxVar.zzc()));
        return zzhlc.zza((zzhqf) zze2.zzbm());
    }

    public static /* synthetic */ zzhfx zzc(zzhlc zzhlcVar) {
        if (!zzhlcVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(zzhlcVar.zzc().zza())));
        }
        try {
            if (zzhsa.zzb(zzhlcVar.zzc().zzb(), zzibb.zza()).zza() == 0) {
                return zzhfx.zzb(zzg(zzhlcVar.zzc().zzc()));
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (zzicg e) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e);
        }
    }

    public static /* synthetic */ zzhlb zzd(zzhfr zzhfrVar, zzhbt zzhbtVar) {
        zzhrx zzd2 = zzhry.zzd();
        byte[] zzc2 = zzhfrVar.zze().zzc(zzhbtVar);
        zzd2.zza(zzian.zzs(zzc2, 0, zzc2.length));
        return zzhlb.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((zzhry) zzd2.zzbm()).zzaM(), zzhqb.zzb, zzf(zzhfrVar.zzf().zzc()), zzhfrVar.zzb());
    }

    public static /* synthetic */ zzhfr zze(zzhlb zzhlbVar, zzhbt zzhbtVar) {
        if (!zzhlbVar.zzg().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            zzhry zzc2 = zzhry.zzc(zzhlbVar.zzb(), zzibb.zza());
            if (zzc2.zza() == 0) {
                return zzhfr.zzd(zzg(zzhlbVar.zzd()), zzhyg.zza(zzc2.zzb().zzy(), zzhbtVar), zzhlbVar.zze());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzicg unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    private static zzhqy zzf(zzhfw zzhfwVar) throws GeneralSecurityException {
        if (zzhfw.zza.equals(zzhfwVar)) {
            return zzhqy.zzb;
        }
        if (zzhfw.zzb.equals(zzhfwVar)) {
            return zzhqy.zze;
        }
        if (zzhfw.zzc.equals(zzhfwVar)) {
            return zzhqy.zzd;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzhfwVar.toString()));
    }

    private static zzhfw zzg(zzhqy zzhqyVar) throws GeneralSecurityException {
        int ordinal = zzhqyVar.ordinal();
        if (ordinal == 1) {
            return zzhfw.zza;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return zzhfw.zzc;
            }
            if (ordinal != 4) {
                int zza2 = zzhqyVar.zza();
                StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(zza2);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return zzhfw.zzb;
    }
}
