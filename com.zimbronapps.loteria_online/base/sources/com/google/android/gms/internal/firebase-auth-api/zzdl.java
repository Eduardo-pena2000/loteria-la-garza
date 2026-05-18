package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzdq;
import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzdl extends zzcw {
    private final zzdq zza;
    private final zzaal zzb;
    private final zzaaj zzc;
    private final Integer zzd;

    public static class zza {
        private zzdq zza;
        private zzaal zzb;
        private Integer zzc;

        public /* synthetic */ zza(zzdn zzdnVar) {
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

        public final zza zza(zzdq zzdqVar) {
            this.zza = zzdqVar;
            return this;
        }

        public final zzdl zza() throws GeneralSecurityException {
            zzaaj zzb;
            zzdq zzdqVar = this.zza;
            if (zzdqVar != null && this.zzb != null) {
                if (zzdqVar.zzc() == this.zzb.zza()) {
                    if (this.zza.zza() && this.zzc == null) {
                        throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                    }
                    if (!this.zza.zza() && this.zzc != null) {
                        throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                    }
                    if (this.zza.zzf() == zzdq.zzb.zzc) {
                        zzb = zzpe.zza;
                    } else if (this.zza.zzf() == zzdq.zzb.zzb) {
                        zzb = zzpe.zza(this.zzc.intValue());
                    } else if (this.zza.zzf() == zzdq.zzb.zza) {
                        zzb = zzpe.zzb(this.zzc.intValue());
                    } else {
                        throw new IllegalStateException("Unknown AesEaxParameters.Variant: " + String.valueOf(this.zza.zzf()));
                    }
                    return new zzdl(this.zza, this.zzb, zzb, this.zzc, null);
                }
                throw new GeneralSecurityException("Key size mismatch");
            }
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
    }

    public /* synthetic */ zzdl(zzdq zzdqVar, zzaal zzaalVar, zzaaj zzaajVar, Integer num, zzdn zzdnVar) {
        this(zzdqVar, zzaalVar, zzaajVar, num);
    }

    public static zza zze() {
        return new zza(null);
    }

    public final /* synthetic */ zzcb zza() {
        return (zzdq) zza();
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

    private zzdl(zzdq zzdqVar, zzaal zzaalVar, zzaaj zzaajVar, Integer num) {
        this.zza = zzdqVar;
        this.zzb = zzaalVar;
        this.zzc = zzaajVar;
        this.zzd = num;
    }
}
