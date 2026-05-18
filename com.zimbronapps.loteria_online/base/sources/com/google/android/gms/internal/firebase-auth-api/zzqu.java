package com.google.android.gms.internal.firebase-auth-api;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzqu extends zzrn {
    private final int zza;
    private final int zzb;
    private final zza zzc;

    public static final class zza {
        public static final zza zza = new zza("TINK");
        public static final zza zzb = new zza("CRUNCHY");
        public static final zza zzc = new zza("LEGACY");
        public static final zza zzd = new zza("NO_PREFIX");
        private final String zze;

        private zza(String str) {
            this.zze = str;
        }

        public final String toString() {
            return this.zze;
        }
    }

    public static final class zzb {
        private Integer zza;
        private Integer zzb;
        private zza zzc;

        public /* synthetic */ zzb(zzqx zzqxVar) {
            this();
        }

        public final zzb zza(int i) throws GeneralSecurityException {
            if (i != 16 && i != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", new Object[]{Integer.valueOf(i << 3)}));
            }
            this.zza = Integer.valueOf(i);
            return this;
        }

        public final zzb zzb(int i) throws GeneralSecurityException {
            if (i >= 10 && 16 >= i) {
                this.zzb = Integer.valueOf(i);
                return this;
            }
            throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i);
        }

        private zzb() {
            this.zza = null;
            this.zzb = null;
            this.zzc = zza.zzd;
        }

        public final zzb zza(zza zzaVar) {
            this.zzc = zzaVar;
            return this;
        }

        public final zzqu zza() throws GeneralSecurityException {
            Integer num = this.zza;
            if (num != null) {
                if (this.zzb != null) {
                    if (this.zzc != null) {
                        return new zzqu(num.intValue(), this.zzb.intValue(), this.zzc, null);
                    }
                    throw new GeneralSecurityException("variant not set");
                }
                throw new GeneralSecurityException("tag size not set");
            }
            throw new GeneralSecurityException("key size not set");
        }
    }

    public /* synthetic */ zzqu(int i, int i2, zza zzaVar, zzqx zzqxVar) {
        this(i, i2, zzaVar);
    }

    public static zzb zzd() {
        return new zzb(null);
    }

    private final int zzf() {
        int i;
        zza zzaVar = this.zzc;
        if (zzaVar == zza.zzd) {
            return this.zzb;
        }
        if (zzaVar == zza.zza) {
            i = this.zzb;
        } else if (zzaVar == zza.zzb) {
            i = this.zzb;
        } else {
            if (zzaVar != zza.zzc) {
                throw new IllegalStateException("Unknown variant");
            }
            i = this.zzb;
        }
        return i + 5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzqu)) {
            return false;
        }
        zzqu zzquVar = (zzqu) obj;
        return zzquVar.zza == this.zza && zzquVar.zzf() == zzf() && zzquVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{zzqu.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc});
    }

    public final String toString() {
        return "AES-CMAC Parameters (variant: " + String.valueOf(this.zzc) + ", " + this.zzb + "-byte tags, and " + this.zza + "-byte key)";
    }

    public final boolean zza() {
        return this.zzc != zza.zzd;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zza zze() {
        return this.zzc;
    }

    private zzqu(int i, int i2, zza zzaVar) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = zzaVar;
    }
}
