package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfy implements zzao {
    public final long zza;
    public final long zzb;
    public final long zzc;

    public zzfy(long j, long j2, long j3) {
        this.zza = j;
        this.zzb = j2;
        this.zzc = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfy)) {
            return false;
        }
        zzfy zzfyVar = (zzfy) obj;
        return this.zza == zzfyVar.zza && this.zzb == zzfyVar.zzb && this.zzc == zzfyVar.zzc;
    }

    public final int hashCode() {
        return ((((Long.hashCode(this.zza) + 527) * 31) + Long.hashCode(this.zzb)) * 31) + Long.hashCode(this.zzc);
    }

    public final String toString() {
        long j = this.zza;
        int length = String.valueOf(j).length();
        long j2 = this.zzb;
        int length2 = String.valueOf(j2).length();
        long j3 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 48 + length2 + 12 + String.valueOf(j3).length());
        sb.append("Mp4Timestamp: creation time=");
        sb.append(j);
        sb.append(", modification time=");
        sb.append(j2);
        sb.append(", timescale=");
        sb.append(j3);
        return sb.toString();
    }
}
