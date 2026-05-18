package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzkb;
import com.google.android.gms.internal.firebase-auth-api.zzvn;
import com.google.android.gms.internal.firebase-auth-api.zzvt;
import com.google.android.gms.internal.firebase-auth-api.zzwx;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzlq {
    private static final zzaaj zza;
    private static final zzaaj zzb;
    private static final zzph zzc;
    private static final zzpd zzd;
    private static final zznx zze;
    private static final zznt zzf;
    private static final zznx zzg;
    private static final zznt zzh;
    private static final zznl zzi;
    private static final zznl zzj;
    private static final zznl zzk;
    private static final zznl zzl;

    static {
        zzaaj zzb2 = zzqn.zzb("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        zza = zzb2;
        zzaaj zzb3 = zzqn.zzb("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
        zzb = zzb3;
        zzc = zzph.zza(new zzlt(), zzkb.class, zzqe.class);
        zzd = zzpd.zza(new zzls(), zzb2, zzqe.class);
        zze = zznx.zza(new zzlv(), zzkh.class, zzqb.class);
        zzf = zznt.zza(new zzlu(), zzb3, zzqb.class);
        zzg = zznx.zza(new zzlx(), zzke.class, zzqb.class);
        zzh = zznt.zza(new zzlw(), zzb2, zzqb.class);
        zznk zza2 = zznl.zza().zza(zzxz.RAW, zzkb.zzd.zzc).zza(zzxz.TINK, zzkb.zzd.zza);
        zzxz zzxzVar = zzxz.LEGACY;
        zzkb.zzd zzdVar = zzkb.zzd.zzb;
        zzi = zza2.zza(zzxzVar, zzdVar).zza(zzxz.CRUNCHY, zzdVar).zza();
        zzj = zznl.zza().zza(zzvy.SHA1, zzkb.zzb.zza).zza(zzvy.SHA224, zzkb.zzb.zzb).zza(zzvy.SHA256, zzkb.zzb.zzc).zza(zzvy.SHA384, zzkb.zzb.zzd).zza(zzvy.SHA512, zzkb.zzb.zze).zza();
        zzk = zznl.zza().zza(zzvw.NIST_P256, zzkb.zzc.zza).zza(zzvw.NIST_P384, zzkb.zzc.zzb).zza(zzvw.NIST_P521, zzkb.zzc.zzc).zza(zzvw.CURVE25519, zzkb.zzc.zzd).zza();
        zzl = zznl.zza().zza(zzvb.UNCOMPRESSED, zzkb.zze.zzb).zza(zzvb.COMPRESSED, zzkb.zze.zza).zza(zzvb.DO_NOT_USE_CRUNCHY_UNCOMPRESSED, zzkb.zze.zzc).zza();
    }

    public static /* synthetic */ zzkb zza(zzqe zzqeVar) {
        return zzb(zzqeVar);
    }

    public static /* synthetic */ zzkh zzb(zzqb zzqbVar, zzch zzchVar) {
        return zzd(zzqbVar, zzchVar);
    }

    private static zzke zzc(zzqb zzqbVar, zzch zzchVar) throws GeneralSecurityException {
        if (!zzqbVar.zzf().equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EciesProtoSerialization.parsePrivateKey: " + zzqbVar.zzf());
        }
        try {
            zzvn zza2 = zzvn.zza(zzqbVar.zzd(), zzaku.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzvq zzd2 = zza2.zzd();
            if (zzd2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzkb zza3 = zza(zzqbVar.zzb(), zzd2.zzb());
            return zza3.zzd().equals(zzkb.zzc.zzd) ? zzke.zza(zzkh.zza(zza3, zzaaj.zza(zzd2.zzf().zzd()), zzqbVar.zze()), zzaal.zza(zza2.zze().zzd(), zzch.zza(zzchVar))) : zzke.zza(zzkh.zza(zza3, new ECPoint(zzne.zza(zzd2.zzf().zzd()), zzne.zza(zzd2.zzg().zzd())), zzqbVar.zze()), zzaam.zza(zzne.zza(zza2.zze().zzd()), zzch.zza(zzchVar)));
        } catch (zzall | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
        }
    }

    private static zzkh zzd(zzqb zzqbVar, zzch zzchVar) throws GeneralSecurityException {
        if (!zzqbVar.zzf().equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EciesProtoSerialization.parsePublicKey: " + zzqbVar.zzf());
        }
        try {
            zzvq zza2 = zzvq.zza(zzqbVar.zzd(), zzaku.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzkb zza3 = zza(zzqbVar.zzb(), zza2.zzb());
            if (!zza3.zzd().equals(zzkb.zzc.zzd)) {
                return zzkh.zza(zza3, new ECPoint(zzne.zza(zza2.zzf().zzd()), zzne.zza(zza2.zzg().zzd())), zzqbVar.zze());
            }
            if (zza2.zzg().zzb() == 0) {
                return zzkh.zza(zza3, zzaaj.zza(zza2.zzf().zzd()), zzqbVar.zze());
            }
            throw new GeneralSecurityException("Y must be empty for X25519 points");
        } catch (zzall | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
        }
    }

    public static /* synthetic */ zzke zza(zzqb zzqbVar, zzch zzchVar) {
        return zzc(zzqbVar, zzchVar);
    }

    private static zzkb zzb(zzqe zzqeVar) throws GeneralSecurityException {
        if (zzqeVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
            try {
                return zza(zzqeVar.zza().zzd(), zzvh.zza(zzqeVar.zza().zze(), zzaku.zza()).zzc());
            } catch (zzall e) {
                throw new GeneralSecurityException("Parsing EciesParameters failed: ", e);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to EciesProtoSerialization.parseParameters: " + zzqeVar.zza().zzf());
    }

    private static int zza(zzkb.zzc zzcVar) throws GeneralSecurityException {
        if (zzkb.zzc.zza.equals(zzcVar)) {
            return 33;
        }
        if (zzkb.zzc.zzb.equals(zzcVar)) {
            return 49;
        }
        if (zzkb.zzc.zzc.equals(zzcVar)) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType " + String.valueOf(zzcVar));
    }

    private static zzkb zza(zzxz zzxzVar, zzvk zzvkVar) throws GeneralSecurityException {
        zzkb.zza zza2 = zzkb.zzc().zza((zzkb.zzd) zzi.zza((Enum) zzxzVar)).zza((zzkb.zzc) zzk.zza((Enum) zzvkVar.zzf().zzd())).zza((zzkb.zzb) zzj.zza((Enum) zzvkVar.zzf().zze())).zza(zzcj.zza(((zzxb) ((zzalf) zzxb.zza().zza(zzvkVar.zzb().zzd().zzf()).zza(zzxz.RAW).zza(zzvkVar.zzb().zzd().zze()).zze())).zzk())).zza(zzaaj.zza(zzvkVar.zzf().zzf().zzd()));
        if (!zzvkVar.zzf().zzd().equals(zzvw.CURVE25519)) {
            zza2.zza((zzkb.zze) zzl.zza((Enum) zzvkVar.zza()));
        } else if (!zzvkVar.zza().equals(zzvb.COMPRESSED)) {
            throw new GeneralSecurityException("For CURVE25519 EcPointFormat must be compressed");
        }
        return zza2.zza();
    }

    private static zzvk zzb(zzkb zzkbVar) throws GeneralSecurityException {
        zzvt.zza zza2 = zzvt.zza().zza((zzvw) zzk.zza(zzkbVar.zzd())).zza((zzvy) zzj.zza(zzkbVar.zze()));
        if (zzkbVar.zzh() != null && zzkbVar.zzh().zza() > 0) {
            zza2.zza(zzajv.zza(zzkbVar.zzh().zzb()));
        }
        zzvt zzvtVar = (zzvt) ((zzalf) zza2.zze());
        try {
            zzxb zza3 = zzxb.zza(zzcj.zza(zzkbVar.zzb()), zzaku.zza());
            zzve zzveVar = (zzve) ((zzalf) zzve.zza().zza((zzxb) ((zzalf) zzxb.zza().zza(zza3.zzf()).zza(zzxz.TINK).zza(zza3.zze()).zze())).zze());
            zzkb.zze zzf2 = zzkbVar.zzf();
            if (zzf2 == null) {
                zzf2 = zzkb.zze.zza;
            }
            return (zzvk) ((zzalf) zzvk.zzc().zza(zzvtVar).zza(zzveVar).zza((zzvb) zzl.zza(zzf2)).zze());
        } catch (zzall e) {
            throw new GeneralSecurityException("Parsing EciesParameters failed: ", e);
        }
    }

    public static /* synthetic */ zzqb zza(zzke zzkeVar, zzch zzchVar) {
        zzvn.zza zza2 = zzvn.zzb().zza(0).zza(zza((zzkh) ((zzli) zzkeVar.zzc())));
        if (((zzkb) ((zzlg) zzkeVar.zza())).zzd().equals(zzkb.zzc.zzd)) {
            zza2.zza(zzajv.zza(zzkeVar.zzg().zza(zzch.zza(zzchVar))));
        } else {
            zza2.zza(zzajv.zza(zzne.zza(zzkeVar.zzf().zza(zzch.zza(zzchVar)), zza(((zzkb) ((zzlg) zzkeVar.zza())).zzd()))));
        }
        return zzqb.zza("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", ((zzvn) ((zzalf) zza2.zze())).zzj(), zzwx.zzb.ASYMMETRIC_PRIVATE, (zzxz) zzi.zza(((zzkb) ((zzlg) zzkeVar.zza())).zzg()), zzkeVar.zzb());
    }

    public static /* synthetic */ zzqb zza(zzkh zzkhVar, zzch zzchVar) {
        return zzqb.zza("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", zza(zzkhVar).zzj(), zzwx.zzb.ASYMMETRIC_PUBLIC, (zzxz) zzi.zza(((zzkb) ((zzlg) zzkhVar.zza())).zzg()), zzkhVar.zzb());
    }

    public static /* synthetic */ zzqe zza(zzkb zzkbVar) {
        return zzqe.zzb((zzxb) ((zzalf) zzxb.zza().zza("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey").zza(((zzvh) ((zzalf) zzvh.zza().zza(zzb(zzkbVar)).zze())).zzj()).zza((zzxz) zzi.zza(zzkbVar.zzg())).zze()));
    }

    private static zzvq zza(zzkh zzkhVar) throws GeneralSecurityException {
        if (((zzkb) ((zzlg) zzkhVar.zza())).zzd().equals(zzkb.zzc.zzd)) {
            return (zzvq) ((zzalf) zzvq.zzc().zza(0).zza(zzb((zzkb) ((zzlg) zzkhVar.zza()))).zza(zzajv.zza(zzkhVar.zze().zzb())).zzb(zzajv.zza).zze());
        }
        int zza2 = zza(((zzkb) ((zzlg) zzkhVar.zza())).zzd());
        ECPoint zzf2 = zzkhVar.zzf();
        if (zzf2 != null) {
            return (zzvq) ((zzalf) zzvq.zzc().zza(0).zza(zzb((zzkb) ((zzlg) zzkhVar.zza()))).zza(zzajv.zza(zzne.zza(zzf2.getAffineX(), zza2))).zzb(zzajv.zza(zzne.zza(zzf2.getAffineY(), zza2))).zze());
        }
        throw new GeneralSecurityException("NistCurvePoint was null for NIST curve");
    }

    public static void zza() throws GeneralSecurityException {
        zzoz zza2 = zzoz.zza();
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
        zza2.zza(zzf);
        zza2.zza(zzg);
        zza2.zza(zzh);
    }
}
