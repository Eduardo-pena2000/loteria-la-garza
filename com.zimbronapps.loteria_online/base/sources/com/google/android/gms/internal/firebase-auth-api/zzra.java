package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzrh;
import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzra extends zzrk {
    private final zzrh zza;
    private final zzaal zzb;
    private final zzaaj zzc;
    private final Integer zzd;

    public static class zza {
        private zzrh zza;
        private zzaal zzb;
        private Integer zzc;

        public /* synthetic */ zza(zzrc zzrcVar) {
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

        public final zza zza(zzrh zzrhVar) {
            this.zza = zzrhVar;
            return this;
        }

        public final zzra zza() throws GeneralSecurityException {
            zzaaj zza;
            zzrh zzrhVar = this.zza;
            if (zzrhVar != null && this.zzb != null) {
                if (zzrhVar.zzc() == this.zzb.zza()) {
                    if (this.zza.zza() && this.zzc == null) {
                        throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                    }
                    if (!this.zza.zza() && this.zzc != null) {
                        throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                    }
                    if (this.zza.zzf() == zzrh.zzc.zzd) {
                        zza = zzpe.zza;
                    } else if (this.zza.zzf() != zzrh.zzc.zzc && this.zza.zzf() != zzrh.zzc.zzb) {
                        if (this.zza.zzf() == zzrh.zzc.zza) {
                            zza = zzpe.zzb(this.zzc.intValue());
                        } else {
                            throw new IllegalStateException("Unknown HmacParameters.Variant: " + String.valueOf(this.zza.zzf()));
                        }
                    } else {
                        zza = zzpe.zza(this.zzc.intValue());
                    }
                    return new zzra(this.zza, this.zzb, zza, this.zzc, null);
                }
                throw new GeneralSecurityException("Key size mismatch");
            }
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
    }

    public /* synthetic */ zzra(zzrh zzrhVar, zzaal zzaalVar, zzaaj zzaajVar, Integer num, zzrc zzrcVar) {
        this(zzrhVar, zzaalVar, zzaajVar, num);
    }

    public static zza zzc() {
        return new zza(null);
    }

    public final /* synthetic */ zzcb zza() {
        return (zzrh) zzd();
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

    private zzra(zzrh zzrhVar, zzaal zzaalVar, zzaaj zzaajVar, Integer num) {
        this.zza = zzrhVar;
        this.zzb = zzaalVar;
        this.zzc = zzaajVar;
        this.zzd = num;
    }
}
