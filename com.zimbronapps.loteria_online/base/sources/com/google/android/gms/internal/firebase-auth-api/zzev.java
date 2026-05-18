package com.google.android.gms.internal.firebase-auth-api;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzev extends zzcy {
    private final String zza;
    private final zza zzb;

    public static final class zza {
        public static final zza zza = new zza("TINK");
        public static final zza zzb = new zza("NO_PREFIX");
        private final String zzc;

        private zza(String str) {
            this.zzc = str;
        }

        public final String toString() {
            return this.zzc;
        }
    }

    private zzev(String str, zza zzaVar) {
        this.zza = str;
        this.zzb = zzaVar;
    }

    public static zzev zza(String str, zza zzaVar) {
        return new zzev(str, zzaVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzev)) {
            return false;
        }
        zzev zzevVar = (zzev) obj;
        return zzevVar.zza.equals(this.zza) && zzevVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{zzev.class, this.zza, this.zzb});
    }

    public final String toString() {
        return "LegacyKmsAead Parameters (keyUri: " + this.zza + ", variant: " + String.valueOf(this.zzb) + ")";
    }

    public final zza zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zza;
    }

    public final boolean zza() {
        return this.zzb != zza.zzb;
    }
}
