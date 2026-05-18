package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzem;
import com.google.android.gms.internal.firebase-auth-api.zzwx;
import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzhj {
    private static final zzaaj zza;
    private static final zzph zzb;
    private static final zzpd zzc;
    private static final zznx zzd;
    private static final zznt zze;

    static {
        zzaaj zzb2 = zzqn.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zza = zzb2;
        zzb = zzph.zza(new zzhm(), zzem.class, zzqe.class);
        zzc = zzpd.zza(new zzhl(), zzb2, zzqe.class);
        zzd = zznx.zza(new zzho(), zzej.class, zzqb.class);
        zze = zznt.zza(new zzhn(), zzb2, zzqb.class);
    }

    public static /* synthetic */ zzej zza(zzqb zzqbVar, zzch zzchVar) {
        return zzb(zzqbVar, zzchVar);
    }

    private static zzej zzb(zzqb zzqbVar, zzch zzchVar) throws GeneralSecurityException {
        if (!zzqbVar.zzf().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            zzuv zza2 = zzuv.zza(zzqbVar.zzd(), zzaku.zza());
            if (zza2.zza() == 0) {
                return zzej.zza(zza(zzqbVar.zzb()), zzaal.zza(zza2.zzd().zzd(), zzch.zza(zzchVar)), zzqbVar.zze());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzall unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    public static /* synthetic */ zzem zza(zzqe zzqeVar) {
        return zzb(zzqeVar);
    }

    private static zzem.zza zza(zzxz zzxzVar) throws GeneralSecurityException {
        int i = zzhq.zza[zzxzVar.ordinal()];
        if (i == 1) {
            return zzem.zza.zza;
        }
        if (i == 2 || i == 3) {
            return zzem.zza.zzb;
        }
        if (i == 4) {
            return zzem.zza.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzxzVar.zza());
    }

    public static /* synthetic */ zzqb zza(zzej zzejVar, zzch zzchVar) {
        return zzqb.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((zzuv) ((zzalf) zzuv.zzb().zza(zzajv.zza(zzejVar.zze().zza(zzch.zza(zzchVar)))).zze())).zzj(), zzwx.zzb.SYMMETRIC, zza(((zzem) ((zzcy) zzejVar.zza())).zzb()), zzejVar.zzb());
    }

    private static zzem zzb(zzqe zzqeVar) throws GeneralSecurityException {
        if (zzqeVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            try {
                zzuy.zza(zzqeVar.zza().zze(), zzaku.zza());
                return zzem.zza(zza(zzqeVar.zza().zzd()));
            } catch (zzall e) {
                throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: " + zzqeVar.zza().zzf());
    }

    public static /* synthetic */ zzqe zza(zzem zzemVar) {
        return zzqe.zzb((zzxb) ((zzalf) zzxb.zza().zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key").zza(zzuy.zzb().zzj()).zza(zza(zzemVar.zzb())).zze()));
    }

    private static zzxz zza(zzem.zza zzaVar) throws GeneralSecurityException {
        if (zzem.zza.zza.equals(zzaVar)) {
            return zzxz.TINK;
        }
        if (zzem.zza.zzb.equals(zzaVar)) {
            return zzxz.CRUNCHY;
        }
        if (zzem.zza.zzc.equals(zzaVar)) {
            return zzxz.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + String.valueOf(zzaVar));
    }

    public static void zza() throws GeneralSecurityException {
        zzoz zza2 = zzoz.zza();
        zza2.zza(zzb);
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
    }
}
