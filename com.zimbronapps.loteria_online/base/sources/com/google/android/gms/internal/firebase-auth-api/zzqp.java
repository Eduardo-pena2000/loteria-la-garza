package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzqu;
import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzqp extends zzrk {
    private final zzqu zza;
    private final zzaal zzb;
    private final zzaaj zzc;
    private final Integer zzd;

    public static class zza {
        private zzqu zza;
        private zzaal zzb;
        private Integer zzc;

        public /* synthetic */ zza(zzqr zzqrVar) {
            this();
        }

        public final zza zza(zzaal zzaalVar) throws GeneralSecurityException {
            this.zzb = zzaalVar;
            return this;
        }

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
        }

        public final zza zza(Integer num) {
            this.zzc = num;
            return this;
        }

        public final zza zza(zzqu zzquVar) {
            this.zza = zzquVar;
            return this;
        }

        public final zzqp zza() throws GeneralSecurityException {
            zzaaj zza;
            zzqu zzquVar = this.zza;
            if (zzquVar != null && this.zzb != null) {
                if (zzquVar.zzc() == this.zzb.zza()) {
                    if (this.zza.zza() && this.zzc == null) {
                        throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                    }
                    if (!this.zza.zza() && this.zzc != null) {
                        throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                    }
                    if (this.zza.zze() == zzqu.zza.zzd) {
                        zza = zzpe.zza;
                    } else if (this.zza.zze() != zzqu.zza.zzc && this.zza.zze() != zzqu.zza.zzb) {
                        if (this.zza.zze() == zzqu.zza.zza) {
                            zza = zzpe.zzb(this.zzc.intValue());
                        } else {
                            throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + String.valueOf(this.zza.zze()));
                        }
                    } else {
                        zza = zzpe.zza(this.zzc.intValue());
                    }
                    return new zzqp(this.zza, this.zzb, zza, this.zzc, null);
                }
                throw new GeneralSecurityException("Key size mismatch");
            }
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
    }

    public /* synthetic */ zzqp(zzqu zzquVar, zzaal zzaalVar, zzaaj zzaajVar, Integer num, zzqr zzqrVar) {
        this(zzquVar, zzaalVar, zzaajVar, num);
    }

    public static zza zzc() {
        return new zza(null);
    }

    public final /* synthetic */ zzcb zza() {
        return (zzqu) zzd();
    }

    public final Integer zzb() {
        return this.zzd;
    }

    public final /* synthetic */ zzrn zzd() {
        return this.zza;
    }

    public final zzaaj zze() {
        return this.zzc;
    }

    public final zzaal zzf() {
        return this.zzb;
    }

    private zzqp(zzqu zzquVar, zzaal zzaalVar, zzaaj zzaajVar, Integer num) {
        this.zza = zzquVar;
        this.zzb = zzaalVar;
        this.zzc = zzaajVar;
        this.zzd = num;
    }
}
