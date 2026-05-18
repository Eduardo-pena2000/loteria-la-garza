package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzdi;
import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzdd extends zzcw {
    private final zzdi zza;
    private final zzaal zzb;
    private final zzaal zzc;
    private final zzaaj zzd;
    private final Integer zze;

    public static class zza {
        private zzdi zza;
        private zzaal zzb;
        private zzaal zzc;
        private Integer zzd;

        public /* synthetic */ zza(zzdf zzdfVar) {
            this();
        }

        public final zza zza(zzaal zzaalVar) {
            this.zzb = zzaalVar;
            return this;
        }

        public final zza zzb(zzaal zzaalVar) {
            this.zzc = zzaalVar;
            return this;
        }

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
            this.zzd = null;
        }

        public final zza zza(Integer num) {
            this.zzd = num;
            return this;
        }

        public final zza zza(zzdi zzdiVar) {
            this.zza = zzdiVar;
            return this;
        }

        public final zzdd zza() throws GeneralSecurityException {
            zzaaj zzb;
            zzdi zzdiVar = this.zza;
            if (zzdiVar != null) {
                if (this.zzb != null && this.zzc != null) {
                    if (zzdiVar.zzb() == this.zzb.zza()) {
                        if (this.zza.zzc() == this.zzc.zza()) {
                            if (this.zza.zza() && this.zzd == null) {
                                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                            }
                            if (!this.zza.zza() && this.zzd != null) {
                                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                            }
                            if (this.zza.zzh() == zzdi.zzc.zzc) {
                                zzb = zzpe.zza;
                            } else if (this.zza.zzh() == zzdi.zzc.zzb) {
                                zzb = zzpe.zza(this.zzd.intValue());
                            } else if (this.zza.zzh() == zzdi.zzc.zza) {
                                zzb = zzpe.zzb(this.zzd.intValue());
                            } else {
                                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: " + String.valueOf(this.zza.zzh()));
                            }
                            return new zzdd(this.zza, this.zzb, this.zzc, zzb, this.zzd, null);
                        }
                        throw new GeneralSecurityException("HMAC key size mismatch");
                    }
                    throw new GeneralSecurityException("AES key size mismatch");
                }
                throw new GeneralSecurityException("Cannot build without key material");
            }
            throw new GeneralSecurityException("Cannot build without parameters");
        }
    }

    public /* synthetic */ zzdd(zzdi zzdiVar, zzaal zzaalVar, zzaal zzaalVar2, zzaaj zzaajVar, Integer num, zzdf zzdfVar) {
        this(zzdiVar, zzaalVar, zzaalVar2, zzaajVar, num);
    }

    public static zza zze() {
        return new zza(null);
    }

    public final /* synthetic */ zzcb zza() {
        return (zzdi) zza();
    }

    public final Integer zzb() {
        return this.zze;
    }

    public final /* synthetic */ zzcy zzc() {
        return this.zza;
    }

    public final zzaaj zzd() {
        return this.zzd;
    }

    public final zzaal zzf() {
        return this.zzb;
    }

    public final zzaal zzg() {
        return this.zzc;
    }

    private zzdd(zzdi zzdiVar, zzaal zzaalVar, zzaal zzaalVar2, zzaaj zzaajVar, Integer num) {
        this.zza = zzdiVar;
        this.zzb = zzaalVar;
        this.zzc = zzaalVar2;
        this.zzd = zzaajVar;
        this.zze = num;
    }
}
