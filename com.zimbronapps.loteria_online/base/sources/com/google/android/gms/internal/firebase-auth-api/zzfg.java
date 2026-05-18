package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzfc;
import com.google.android.gms.internal.firebase-auth-api.zzwx;
import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzfg {
    private static final zzaaj zza;
    private static final zzph zzb;
    private static final zzpd zzc;
    private static final zznx zzd;
    private static final zznt zze;

    static {
        zzaaj zzb2 = zzqn.zzb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zza = zzb2;
        zzb = zzph.zza(new zzff(), zzfc.class, zzqe.class);
        zzc = zzpd.zza(new zzfi(), zzb2, zzqe.class);
        zzd = zznx.zza(new zzfh(), zzfd.class, zzqb.class);
        zze = zznt.zza(new zzfk(), zzb2, zzqb.class);
    }

    public static /* synthetic */ zzfc zza(zzqe zzqeVar) {
        return zzb(zzqeVar);
    }

    private static zzfd zzb(zzqb zzqbVar, zzch zzchVar) throws GeneralSecurityException {
        if (!zzqbVar.zzf().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
        }
        try {
            zzxt zza2 = zzxt.zza(zzqbVar.zzd(), zzaku.zza());
            if (zza2.zza() == 0) {
                return zzfd.zza(zza(zza2.zzd(), zzqbVar.zzb()), zzqbVar.zze());
            }
            throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got " + String.valueOf(zza2));
        } catch (zzall e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e);
        }
    }

    public static /* synthetic */ zzfd zza(zzqb zzqbVar, zzch zzchVar) {
        return zzb(zzqbVar, zzchVar);
    }

    private static zzfc zza(zzxw zzxwVar, zzxz zzxzVar) throws GeneralSecurityException {
        zzfc.zza zzaVar;
        zzfc.zzc zzcVar;
        zzcb zza2 = zzcj.zza(((zzxb) ((zzalf) zzxb.zza().zza(zzxwVar.zza().zzf()).zza(zzxwVar.zza().zze()).zza(zzxz.RAW).zze())).zzk());
        if (zza2 instanceof zzdx) {
            zzaVar = zzfc.zza.zza;
        } else if (zza2 instanceof zzem) {
            zzaVar = zzfc.zza.zzc;
        } else if (zza2 instanceof zzge) {
            zzaVar = zzfc.zza.zzb;
        } else if (zza2 instanceof zzdi) {
            zzaVar = zzfc.zza.zzd;
        } else if (zza2 instanceof zzdq) {
            zzaVar = zzfc.zza.zze;
        } else if (zza2 instanceof zzeg) {
            zzaVar = zzfc.zza.zzf;
        } else {
            throw new GeneralSecurityException("Unsupported DEK parameters when parsing " + String.valueOf(zza2));
        }
        zzfc.zzb zzbVar = new zzfc.zzb(null);
        int i = zzfj.zza[zzxzVar.ordinal()];
        if (i == 1) {
            zzcVar = zzfc.zzc.zza;
        } else if (i == 2) {
            zzcVar = zzfc.zzc.zzb;
        } else {
            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzxzVar.zza());
        }
        return zzbVar.zza(zzcVar).zza(zzxwVar.zze()).zza((zzcy) zza2).zza(zzaVar).zza();
    }

    private static zzfc zzb(zzqe zzqeVar) throws GeneralSecurityException {
        if (zzqeVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            try {
                return zza(zzxw.zza(zzqeVar.zza().zze(), zzaku.zza()), zzqeVar.zza().zzd());
            } catch (zzall e) {
                throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: " + zzqeVar.zza().zzf());
    }

    private static zzxw zzb(zzfc zzfcVar) throws GeneralSecurityException {
        try {
            return (zzxw) ((zzalf) zzxw.zzb().zza(zzfcVar.zzd()).zza(zzxb.zza(zzcj.zza(zzfcVar.zzb()), zzaku.zza())).zze());
        } catch (zzall e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    public static /* synthetic */ zzqb zza(zzfd zzfdVar, zzch zzchVar) {
        return zzqb.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((zzxt) ((zzalf) zzxt.zzb().zza(zzb((zzfc) ((zzcy) zzfdVar.zza()))).zze())).zzj(), zzwx.zzb.REMOTE, zza(((zzfc) ((zzcy) zzfdVar.zza())).zzc()), zzfdVar.zzb());
    }

    public static /* synthetic */ zzqe zza(zzfc zzfcVar) {
        return zzqe.zzb((zzxb) ((zzalf) zzxb.zza().zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey").zza(zzb(zzfcVar).zzj()).zza(zza(zzfcVar.zzc())).zze()));
    }

    private static zzxz zza(zzfc.zzc zzcVar) throws GeneralSecurityException {
        if (zzfc.zzc.zza.equals(zzcVar)) {
            return zzxz.TINK;
        }
        if (zzfc.zzc.zzb.equals(zzcVar)) {
            return zzxz.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + String.valueOf(zzcVar));
    }

    public static void zza() throws GeneralSecurityException {
        zzoz zza2 = zzoz.zza();
        zza2.zza(zzb);
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
    }
}
