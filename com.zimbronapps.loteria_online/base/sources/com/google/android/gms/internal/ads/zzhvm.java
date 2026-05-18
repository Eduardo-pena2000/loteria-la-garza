package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhvm {
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

    static {
        zzhye zza2 = zzhln.zza("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
        zzb = zza2;
        zzhye zza3 = zzhln.zza("type.googleapis.com/google.crypto.tink.Ed25519PublicKey");
        zzc = zza3;
        zzd = zzhkn.zzd(zzhvl.zza, zzhsq.class, zzhlc.class);
        zze = zzhkk.zzd(zzhvg.zza, zza2, zzhlc.class);
        zzf = zzhji.zzd(zzhvh.zza, zzhsx.class, zzhlb.class);
        zzg = zzhjf.zzd(zzhvi.zza, zza3, zzhlb.class);
        zzh = zzhji.zzd(zzhvj.zza, zzhsr.class, zzhlb.class);
        zzi = zzhjf.zzd(zzhvk.zza, zza2, zzhlb.class);
        zzhit zza4 = zzhiu.zza();
        zza4.zza(zzhqy.RAW, zzhsp.zzd);
        zza4.zza(zzhqy.TINK, zzhsp.zza);
        zza4.zza(zzhqy.CRUNCHY, zzhsp.zzb);
        zza4.zza(zzhqy.LEGACY, zzhsp.zzc);
        zzj = zza4.zzb();
    }

    public static void zza(zzhkg zzhkgVar) throws GeneralSecurityException {
        zzhkgVar.zzd(zzd);
        zzhkgVar.zze(zze);
        zzhkgVar.zzb(zzf);
        zzhkgVar.zzc(zzg);
        zzhkgVar.zzb(zzh);
        zzhkgVar.zzc(zzi);
    }

    public static /* synthetic */ zzhlc zzb(zzhsq zzhsqVar) {
        zzhqe zze2 = zzhqf.zze();
        zze2.zza("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
        zze2.zzb(zzhpn.zzc().zzaM());
        zze2.zzc((zzhqy) zzj.zzb(zzhsqVar.zzc()));
        return zzhlc.zza((zzhqf) zze2.zzbm());
    }

    public static /* synthetic */ zzhsq zzc(zzhlc zzhlcVar) {
        if (!zzhlcVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parseParameters: ".concat(String.valueOf(zzhlcVar.zzc().zza())));
        }
        try {
            if (zzhpn.zzb(zzhlcVar.zzc().zzb(), zzibb.zza()).zza() == 0) {
                return zzhsq.zzb((zzhsp) zzj.zzc(zzhlcVar.zzc().zzc()));
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzicg e) {
            throw new GeneralSecurityException("Parsing Ed25519Parameters failed: ", e);
        }
    }

    public static /* synthetic */ zzhlb zzd(zzhsx zzhsxVar, zzhbt zzhbtVar) {
        return zzhlb.zza("type.googleapis.com/google.crypto.tink.Ed25519PublicKey", zzh(zzhsxVar).zzaM(), zzhqb.ASYMMETRIC_PUBLIC, (zzhqy) zzj.zzb(zzhsxVar.zzf().zzc()), zzhsxVar.zzb());
    }

    public static /* synthetic */ zzhsx zze(zzhlb zzhlbVar, zzhbt zzhbtVar) {
        if (!zzhlbVar.zzg().equals("type.googleapis.com/google.crypto.tink.Ed25519PublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePublicKey: ".concat(String.valueOf(zzhlbVar.zzg())));
        }
        try {
            zzhpr zzc2 = zzhpr.zzc(zzhlbVar.zzb(), zzibb.zza());
            if (zzc2.zza() == 0) {
                return zzhsx.zzc((zzhsp) zzj.zzc(zzhlbVar.zzd()), zzhye.zza(zzc2.zzb().zzy()), zzhlbVar.zze());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzicg unused) {
            throw new GeneralSecurityException("Parsing Ed25519PublicKey failed");
        }
    }

    public static /* synthetic */ zzhlb zzf(zzhsr zzhsrVar, zzhbt zzhbtVar) {
        zzhpo zze2 = zzhpp.zze();
        zze2.zzb(zzh(zzhsrVar.zze()));
        byte[] zzc2 = zzhsrVar.zzf().zzc(zzhbtVar);
        zze2.zza(zzian.zzs(zzc2, 0, zzc2.length));
        return zzhlb.zza("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", ((zzhpp) zze2.zzbm()).zzaM(), zzhqb.ASYMMETRIC_PRIVATE, (zzhqy) zzj.zzb(zzhsrVar.zzd().zzc()), zzhsrVar.zze().zzb());
    }

    public static /* synthetic */ zzhsr zzg(zzhlb zzhlbVar, zzhbt zzhbtVar) {
        if (!zzhlbVar.zzg().equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(zzhlbVar.zzg())));
        }
        try {
            zzhpp zzd2 = zzhpp.zzd(zzhlbVar.zzb(), zzibb.zza());
            if (zzd2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhpr zzc2 = zzd2.zzc();
            if (zzc2.zza() == 0) {
                return zzhsr.zzc(zzhsx.zzc((zzhsp) zzj.zzc(zzhlbVar.zzd()), zzhye.zza(zzc2.zzb().zzy()), zzhlbVar.zze()), zzhyg.zza(zzd2.zzb().zzy(), zzhbtVar));
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzicg unused) {
            throw new GeneralSecurityException("Parsing Ed25519PrivateKey failed");
        }
    }

    private static zzhpr zzh(zzhsx zzhsxVar) {
        zzhpq zzd2 = zzhpr.zzd();
        byte[] zzc2 = zzhsxVar.zzd().zzc();
        zzd2.zza(zzian.zzs(zzc2, 0, zzc2.length));
        return (zzhpr) zzd2.zzbm();
    }
}
