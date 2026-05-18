package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzdx;
import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzds extends zzcw {
    private final zzdx zza;
    private final zzaal zzb;
    private final zzaaj zzc;
    private final Integer zzd;

    public static class zza {
        private zzdx zza;
        private zzaal zzb;
        private Integer zzc;

        public /* synthetic */ zza(zzdu zzduVar) {
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

        public final zza zza(zzdx zzdxVar) {
            this.zza = zzdxVar;
            return this;
        }

        public final zzds zza() throws GeneralSecurityException {
            zzaaj zzb;
            zzdx zzdxVar = this.zza;
            if (zzdxVar != null && this.zzb != null) {
                if (zzdxVar.zzc() == this.zzb.zza()) {
                    if (this.zza.zza() && this.zzc == null) {
                        throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                    }
                    if (!this.zza.zza() && this.zzc != null) {
                        throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                    }
                    if (this.zza.zzf() == zzdx.zza.zzc) {
                        zzb = zzpe.zza;
                    } else if (this.zza.zzf() == zzdx.zza.zzb) {
                        zzb = zzpe.zza(this.zzc.intValue());
                    } else if (this.zza.zzf() == zzdx.zza.zza) {
                        zzb = zzpe.zzb(this.zzc.intValue());
                    } else {
                        throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + String.valueOf(this.zza.zzf()));
                    }
                    return new zzds(this.zza, this.zzb, zzb, this.zzc, null);
                }
                throw new GeneralSecurityException("Key size mismatch");
            }
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
    }

    public /* synthetic */ zzds(zzdx zzdxVar, zzaal zzaalVar, zzaaj zzaajVar, Integer num, zzdu zzduVar) {
        this(zzdxVar, zzaalVar, zzaajVar, num);
    }

    public static zza zze() {
        return new zza(null);
    }

    public final /* synthetic */ zzcb zza() {
        return (zzdx) zza();
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

    private zzds(zzdx zzdxVar, zzaal zzaalVar, zzaaj zzaajVar, Integer num) {
        this.zza = zzdxVar;
        this.zzb = zzaalVar;
        this.zzc = zzaajVar;
        this.zzd = num;
    }
}
