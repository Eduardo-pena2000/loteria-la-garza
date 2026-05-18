package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzkg;
import com.google.android.gms.internal.firebase-auth-api.zzwx;
import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzkl {
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
        zzaaj zzb2 = zzqn.zzb("type.googleapis.com/google.crypto.tink.HpkePrivateKey");
        zza = zzb2;
        zzaaj zzb3 = zzqn.zzb("type.googleapis.com/google.crypto.tink.HpkePublicKey");
        zzb = zzb3;
        zzc = zzph.zza(new zzkk(), zzkg.class, zzqe.class);
        zzd = zzpd.zza(new zzkn(), zzb2, zzqe.class);
        zze = zznx.zza(new zzkm(), zzkq.class, zzqb.class);
        zzf = zznt.zza(new zzkp(), zzb3, zzqb.class);
        zzg = zznx.zza(new zzko(), zzki.class, zzqb.class);
        zzh = zznt.zza(new zzkr(), zzb2, zzqb.class);
        zznk zza2 = zznl.zza().zza(zzxz.RAW, zzkg.zze.zzc).zza(zzxz.TINK, zzkg.zze.zza);
        zzxz zzxzVar = zzxz.LEGACY;
        zzkg.zze zzeVar = zzkg.zze.zzb;
        zzi = zza2.zza(zzxzVar, zzeVar).zza(zzxz.CRUNCHY, zzeVar).zza();
        zzj = zznl.zza().zza(zzwm.DHKEM_P256_HKDF_SHA256, zzkg.zzf.zza).zza(zzwm.DHKEM_P384_HKDF_SHA384, zzkg.zzf.zzb).zza(zzwm.DHKEM_P521_HKDF_SHA512, zzkg.zzf.zzc).zza(zzwm.DHKEM_X25519_HKDF_SHA256, zzkg.zzf.zzd).zza();
        zzk = zznl.zza().zza(zzwj.HKDF_SHA256, zzkg.zzc.zza).zza(zzwj.HKDF_SHA384, zzkg.zzc.zzb).zza(zzwj.HKDF_SHA512, zzkg.zzc.zzc).zza();
        zzl = zznl.zza().zza(zzwk.AES_128_GCM, zzkg.zzb.zza).zza(zzwk.AES_256_GCM, zzkg.zzb.zzb).zza(zzwk.CHACHA20_POLY1305, zzkg.zzb.zzc).zza();
    }

    public static /* synthetic */ zzkg zza(zzqe zzqeVar) {
        return zzb(zzqeVar);
    }

    public static /* synthetic */ zzkq zzb(zzqb zzqbVar, zzch zzchVar) {
        return zzd(zzqbVar, zzchVar);
    }

    private static zzki zzc(zzqb zzqbVar, zzch zzchVar) throws GeneralSecurityException {
        if (!zzqbVar.zzf().equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HpkeProtoSerialization.parsePrivateKey: " + zzqbVar.zzf());
        }
        try {
            zzwr zza2 = zzwr.zza(zzqbVar.zzd(), zzaku.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzwu zzd2 = zza2.zzd();
            if (zzd2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzkg zza3 = zza(zzqbVar.zzb(), zzd2.zzb());
            return zzki.zza(zzkq.zza(zza3, zza(zza3.zze(), zzd2.zzf().zzd()), zzqbVar.zze()), zzaal.zza(zzne.zza(zzne.zza(zza2.zze().zzd()), zzmk.zza(zza3.zze())), zzch.zza(zzchVar)));
        } catch (zzall unused) {
            throw new GeneralSecurityException("Parsing HpkePrivateKey failed");
        }
    }

    private static zzkq zzd(zzqb zzqbVar, zzch zzchVar) throws GeneralSecurityException {
        if (!zzqbVar.zzf().equals("type.googleapis.com/google.crypto.tink.HpkePublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HpkeProtoSerialization.parsePublicKey: " + zzqbVar.zzf());
        }
        try {
            zzwu zza2 = zzwu.zza(zzqbVar.zzd(), zzaku.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzkg zza3 = zza(zzqbVar.zzb(), zza2.zzb());
            return zzkq.zza(zza3, zza(zza3.zze(), zza2.zzf().zzd()), zzqbVar.zze());
        } catch (zzall unused) {
            throw new GeneralSecurityException("Parsing HpkePublicKey failed");
        }
    }

    public static /* synthetic */ zzki zza(zzqb zzqbVar, zzch zzchVar) {
        return zzc(zzqbVar, zzchVar);
    }

    private static zzkg zzb(zzqe zzqeVar) throws GeneralSecurityException {
        if (zzqeVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
            try {
                return zza(zzqeVar.zza().zzd(), zzwl.zza(zzqeVar.zza().zze(), zzaku.zza()).zzc());
            } catch (zzall e) {
                throw new GeneralSecurityException("Parsing HpkeParameters failed: ", e);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to HpkeProtoSerialization.parseParameters: " + zzqeVar.zza().zzf());
    }

    private static zzkg zza(zzxz zzxzVar, zzwo zzwoVar) throws GeneralSecurityException {
        return zzkg.zzc().zza((zzkg.zze) zzi.zza((Enum) zzxzVar)).zza((zzkg.zzf) zzj.zza((Enum) zzwoVar.zzc())).zza((zzkg.zzc) zzk.zza((Enum) zzwoVar.zzb())).zza((zzkg.zzb) zzl.zza((Enum) zzwoVar.zza())).zza();
    }

    public static /* synthetic */ zzqb zza(zzki zzkiVar, zzch zzchVar) {
        return zzqb.zza("type.googleapis.com/google.crypto.tink.HpkePrivateKey", ((zzwr) ((zzalf) zzwr.zzb().zza(0).zza(zza((zzkq) ((zzli) zzkiVar.zzc()))).zza(zzajv.zza(zzkiVar.zzf().zza(zzch.zza(zzchVar)))).zze())).zzj(), zzwx.zzb.ASYMMETRIC_PRIVATE, (zzxz) zzi.zza(((zzkg) ((zzlg) zzkiVar.zza())).zzf()), zzkiVar.zzb());
    }

    private static zzwo zzb(zzkg zzkgVar) throws GeneralSecurityException {
        return (zzwo) ((zzalf) zzwo.zzd().zza((zzwm) zzj.zza(zzkgVar.zze())).zza((zzwj) zzk.zza(zzkgVar.zzd())).zza((zzwk) zzl.zza(zzkgVar.zzb())).zze());
    }

    public static /* synthetic */ zzqb zza(zzkq zzkqVar, zzch zzchVar) {
        return zzqb.zza("type.googleapis.com/google.crypto.tink.HpkePublicKey", zza(zzkqVar).zzj(), zzwx.zzb.ASYMMETRIC_PUBLIC, (zzxz) zzi.zza(((zzkg) ((zzlg) zzkqVar.zza())).zzf()), zzkqVar.zzb());
    }

    public static /* synthetic */ zzqe zza(zzkg zzkgVar) {
        return zzqe.zzb((zzxb) ((zzalf) zzxb.zza().zza("type.googleapis.com/google.crypto.tink.HpkePrivateKey").zza(((zzwl) ((zzalf) zzwl.zza().zza(zzb(zzkgVar)).zze())).zzj()).zza((zzxz) zzi.zza(zzkgVar.zzf())).zze()));
    }

    private static zzwu zza(zzkq zzkqVar) throws GeneralSecurityException {
        return (zzwu) ((zzalf) zzwu.zzc().zza(0).zza(zzb((zzkg) ((zzlg) zzkqVar.zza()))).zza(zzajv.zza(zzkqVar.zze().zzb())).zze());
    }

    private static zzaaj zza(zzkg.zzf zzfVar, byte[] bArr) throws GeneralSecurityException {
        return zzaaj.zza(zzne.zza(zzne.zza(bArr), zzmk.zzb(zzfVar)));
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
