package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzem;
import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzej extends zzcw {
    private final zzem zza;
    private final zzaal zzb;
    private final zzaaj zzc;
    private final Integer zzd;

    private zzej(zzem zzemVar, zzaal zzaalVar, zzaaj zzaajVar, Integer num) {
        this.zza = zzemVar;
        this.zzb = zzaalVar;
        this.zzc = zzaajVar;
        this.zzd = num;
    }

    public final /* synthetic */ zzcb zza() {
        return (zzem) zza();
    }

    public final Integer zzb() {
        return this.zzd;
    }

    public final /* synthetic */ zzcy zzc() {
        return this.zza;
    }

    public final zzaaj zzd() {
        return this.zzc;
    }

    public final zzaal zze() {
        return this.zzb;
    }

    public static zzej zza(zzem.zza zzaVar, zzaal zzaalVar, Integer num) throws GeneralSecurityException {
        zzaaj zzb;
        zzem.zza zzaVar2 = zzem.zza.zzc;
        if (zzaVar != zzaVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + String.valueOf(zzaVar) + " the value of idRequirement must be non-null");
        }
        if (zzaVar == zzaVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzaalVar.zza() != 32) {
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + zzaalVar.zza());
        }
        zzem zza = zzem.zza(zzaVar);
        if (zza.zzb() == zzaVar2) {
            zzb = zzpe.zza;
        } else if (zza.zzb() == zzem.zza.zzb) {
            zzb = zzpe.zza(num.intValue());
        } else {
            if (zza.zzb() != zzem.zza.zza) {
                throw new IllegalStateException("Unknown Variant: " + String.valueOf(zza.zzb()));
            }
            zzb = zzpe.zzb(num.intValue());
        }
        return new zzej(zza, zzaalVar, zzb, num);
    }
}
