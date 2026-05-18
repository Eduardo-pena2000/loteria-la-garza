package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzeg;
import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzdz extends zzcw {
    private final zzeg zza;
    private final zzaal zzb;
    private final zzaaj zzc;
    private final Integer zzd;

    public static class zza {
        private zzeg zza;
        private zzaal zzb;
        private Integer zzc;

        public /* synthetic */ zza(zzeb zzebVar) {
            this();
        }

        public final zza zza(Integer num) {
            this.zzc = num;
            return this;
        }

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
        }

        public final zza zza(zzaal zzaalVar) {
            this.zzb = zzaalVar;
            return this;
        }

        public final zza zza(zzeg zzegVar) {
            this.zza = zzegVar;
            return this;
        }

        public final zzdz zza() throws GeneralSecurityException {
            zzaaj zzb;
            zzeg zzegVar = this.zza;
            if (zzegVar != null && this.zzb != null) {
                if (zzegVar.zzb() == this.zzb.zza()) {
                    if (this.zza.zza() && this.zzc == null) {
                        throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                    }
                    if (!this.zza.zza() && this.zzc != null) {
                        throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                    }
                    if (this.zza.zzd() == zzeg.zzb.zzc) {
                        zzb = zzpe.zza;
                    } else if (this.zza.zzd() == zzeg.zzb.zzb) {
                        zzb = zzpe.zza(this.zzc.intValue());
                    } else if (this.zza.zzd() == zzeg.zzb.zza) {
                        zzb = zzpe.zzb(this.zzc.intValue());
                    } else {
                        throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: " + String.valueOf(this.zza.zzd()));
                    }
                    return new zzdz(this.zza, this.zzb, zzb, this.zzc, null);
                }
                throw new GeneralSecurityException("Key size mismatch");
            }
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
    }

    public /* synthetic */ zzdz(zzeg zzegVar, zzaal zzaalVar, zzaaj zzaajVar, Integer num, zzeb zzebVar) {
        this(zzegVar, zzaalVar, zzaajVar, num);
    }

    public static zza zze() {
        return new zza(null);
    }

    public final /* synthetic */ zzcb zza() {
        return (zzeg) zza();
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

    public final zzaal zzf() {
        return this.zzb;
    }

    private zzdz(zzeg zzegVar, zzaal zzaalVar, zzaaj zzaajVar, Integer num) {
        this.zza = zzegVar;
        this.zzb = zzaalVar;
        this.zzc = zzaajVar;
        this.zzd = num;
    }
}
