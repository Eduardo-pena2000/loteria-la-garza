package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhhb {
    public static final /* synthetic */ int zza = 0;
    private static final zzhye zzb;
    private static final zzhkn zzc;
    private static final zzhkk zzd;
    private static final zzhji zze;
    private static final zzhjf zzf;

    static {
        zzhye zza2 = zzhln.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zzb = zza2;
        zzc = zzhkn.zzd(zzhha.zza, zzheb.class, zzhlc.class);
        zzd = zzhkk.zzd(zzhgx.zza, zza2, zzhlc.class);
        zze = zzhji.zzd(zzhgy.zza, zzhdw.class, zzhlb.class);
        zzf = zzhjf.zzd(zzhgz.zza, zza2, zzhlb.class);
    }

    public static void zza(zzhkg zzhkgVar) throws GeneralSecurityException {
        zzhkgVar.zzd(zzc);
        zzhkgVar.zze(zzd);
        zzhkgVar.zzb(zze);
        zzhkgVar.zzc(zzf);
    }

    public static /* synthetic */ zzhlc zzb(zzheb zzhebVar) {
        zzhqe zze2 = zzhqf.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zze2.zzb(zzhpc.zzb().zzaM());
        zze2.zzc(zzf(zzhebVar.zzc()));
        return zzhlc.zza((zzhqf) zze2.zzbm());
    }

    public static /* synthetic */ zzheb zzc(zzhlc zzhlcVar) {
        if (!zzhlcVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(zzhlcVar.zzc().zza())));
        }
        try {
            zzhpc.zza(zzhlcVar.zzc().zzb(), zzibb.zza());
            return zzheb.zzb(zzg(zzhlcVar.zzc().zzc()));
        } catch (zzicg e) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e);
        }
    }

    public static /* synthetic */ zzhlb zzd(zzhdw zzhdwVar, zzhbt zzhbtVar) {
        zzhoz zzd2 = zzhpa.zzd();
        byte[] zzc2 = zzhdwVar.zze().zzc(zzhbtVar);
        zzd2.zza(zzian.zzs(zzc2, 0, zzc2.length));
        return zzhlb.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((zzhpa) zzd2.zzbm()).zzaM(), zzhqb.zzb, zzf(zzhdwVar.zzf().zzc()), zzhdwVar.zzb());
    }

    public static /* synthetic */ zzhdw zze(zzhlb zzhlbVar, zzhbt zzhbtVar) {
        if (!zzhlbVar.zzg().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            zzhpa zzc2 = zzhpa.zzc(zzhlbVar.zzb(), zzibb.zza());
            if (zzc2.zza() == 0) {
                return zzhdw.zzd(zzg(zzhlbVar.zzd()), zzhyg.zza(zzc2.zzb().zzy(), zzhbtVar), zzhlbVar.zze());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzicg unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    private static zzhqy zzf(zzhea zzheaVar) throws GeneralSecurityException {
        if (zzhea.zza.equals(zzheaVar)) {
            return zzhqy.zzb;
        }
        if (zzhea.zzb.equals(zzheaVar)) {
            return zzhqy.zze;
        }
        if (zzhea.zzc.equals(zzheaVar)) {
            return zzhqy.zzd;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzheaVar.toString()));
    }

    private static zzhea zzg(zzhqy zzhqyVar) throws GeneralSecurityException {
        int ordinal = zzhqyVar.ordinal();
        if (ordinal == 1) {
            return zzhea.zza;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return zzhea.zzc;
            }
            if (ordinal != 4) {
                int zza2 = zzhqyVar.zza();
                StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(zza2);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return zzhea.zzb;
    }
}
