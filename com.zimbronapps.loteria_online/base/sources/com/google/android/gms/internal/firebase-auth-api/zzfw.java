package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzfz;
import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzfw extends zzcw {
    private final zzfz zza;
    private final zzaal zzb;
    private final zzaaj zzc;
    private final Integer zzd;

    private zzfw(zzfz zzfzVar, zzaal zzaalVar, zzaaj zzaajVar, Integer num) {
        this.zza = zzfzVar;
        this.zzb = zzaalVar;
        this.zzc = zzaajVar;
        this.zzd = num;
    }

    public final /* synthetic */ zzcb zza() {
        return (zzfz) zza();
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

    public static zzfw zza(zzfz zzfzVar, zzaal zzaalVar, Integer num) throws GeneralSecurityException {
        zzaaj zzb;
        zzfz.zza zzc = zzfzVar.zzc();
        zzfz.zza zzaVar = zzfz.zza.zzb;
        if (zzc != zzaVar && num == null) {
            throw new GeneralSecurityException("For given Variant " + String.valueOf(zzfzVar.zzc()) + " the value of idRequirement must be non-null");
        }
        if (zzfzVar.zzc() == zzaVar && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzaalVar.zza() != 32) {
            throw new GeneralSecurityException("XAesGcmKey key must be constructed with key of length 32 bytes, not " + zzaalVar.zza());
        }
        if (zzfzVar.zzc() == zzaVar) {
            zzb = zzpe.zza;
        } else {
            if (zzfzVar.zzc() != zzfz.zza.zza) {
                throw new IllegalStateException("Unknown Variant: " + String.valueOf(zzfzVar.zzc()));
            }
            zzb = zzpe.zzb(num.intValue());
        }
        return new zzfw(zzfzVar, zzaalVar, zzb, num);
    }
}
