package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzjf;
import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzja extends zzjk {
    private final zzjf zza;
    private final zzaal zzb;
    private final zzaaj zzc;
    private final Integer zzd;

    public static class zza {
        private zzjf zza;
        private zzaal zzb;
        private Integer zzc;

        public /* synthetic */ zza(zzjc zzjcVar) {
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

        public final zza zza(zzjf zzjfVar) {
            this.zza = zzjfVar;
            return this;
        }

        public final zzja zza() throws GeneralSecurityException {
            zzaaj zzb;
            zzjf zzjfVar = this.zza;
            if (zzjfVar != null && this.zzb != null) {
                if (zzjfVar.zzb() == this.zzb.zza()) {
                    if (this.zza.zza() && this.zzc == null) {
                        throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                    }
                    if (!this.zza.zza() && this.zzc != null) {
                        throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                    }
                    if (this.zza.zzd() == zzjf.zza.zzc) {
                        zzb = zzpe.zza;
                    } else if (this.zza.zzd() == zzjf.zza.zzb) {
                        zzb = zzpe.zza(this.zzc.intValue());
                    } else if (this.zza.zzd() == zzjf.zza.zza) {
                        zzb = zzpe.zzb(this.zzc.intValue());
                    } else {
                        throw new IllegalStateException("Unknown AesSivParameters.Variant: " + String.valueOf(this.zza.zzd()));
                    }
                    return new zzja(this.zza, this.zzb, zzb, this.zzc, null);
                }
                throw new GeneralSecurityException("Key size mismatch");
            }
            throw new IllegalArgumentException("Cannot build without parameters and/or key material");
        }
    }

    public /* synthetic */ zzja(zzjf zzjfVar, zzaal zzaalVar, zzaaj zzaajVar, Integer num, zzjc zzjcVar) {
        this(zzjfVar, zzaalVar, zzaajVar, num);
    }

    public static zza zzc() {
        return new zza(null);
    }

    public final /* synthetic */ zzcb zza() {
        return (zzjf) zzd();
    }

    public final Integer zzb() {
        return this.zzd;
    }

    public final /* synthetic */ zzjj zzd() {
        return this.zza;
    }

    public final zzaaj zze() {
        return this.zzc;
    }

    public final zzaal zzf() {
        return this.zzb;
    }

    private zzja(zzjf zzjfVar, zzaal zzaalVar, zzaaj zzaajVar, Integer num) {
        this.zza = zzjfVar;
        this.zzb = zzaalVar;
        this.zzc = zzaajVar;
        this.zzd = num;
    }
}
