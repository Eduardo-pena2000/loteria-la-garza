package com.google.android.gms.internal.firebase-auth-api;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzago extends zzaie {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final zzahg zzd;
    private final String zze;

    public /* synthetic */ zzago(String str, String str2, String str3, zzahg zzahgVar, String str4, zzagq zzagqVar) {
        this(str, str2, str3, zzahgVar, str4);
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzaie) {
            zzaie zzaieVar = (zzaie) obj;
            if (this.zza.equals(zzaieVar.zzd()) && ((str = this.zzb) != null ? str.equals(zzaieVar.zze()) : zzaieVar.zze() == null) && this.zzc.equals(zzaieVar.zzf()) && this.zzd.equals(zzaieVar.zzb()) && this.zze.equals(zzaieVar.zzc())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        String str = this.zzb;
        return ((((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.zzc.hashCode()) * 1000003) ^ this.zzd.hashCode()) * 1000003) ^ this.zze.hashCode();
    }

    public final String toString() {
        return "RevokeTokenRequest{providerId=" + this.zza + ", tenantId=" + this.zzb + ", token=" + this.zzc + ", tokenType=" + String.valueOf(this.zzd) + ", idToken=" + this.zze + "}";
    }

    public final zzahg zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zze;
    }

    public final String zzd() {
        return this.zza;
    }

    public final String zze() {
        return this.zzb;
    }

    public final String zzf() {
        return this.zzc;
    }

    private zzago(String str, String str2, String str3, zzahg zzahgVar, String str4) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = zzahgVar;
        this.zze = str4;
    }
}
