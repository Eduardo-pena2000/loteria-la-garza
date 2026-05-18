package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzdzb extends zzdzf {
    private final long zza;
    private final int zzb;

    public /* synthetic */ zzdzb(long j, int i, byte[] bArr) {
        this.zza = j;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzdzf) {
            zzdzf zzdzfVar = (zzdzf) obj;
            if (this.zza == zzdzfVar.zza() && this.zzb == zzdzfVar.zzb()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.zza;
        return ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.zzb;
    }

    public final String toString() {
        long j = this.zza;
        int length = String.valueOf(j).length();
        int i = this.zzb;
        StringBuilder sb = new StringBuilder(length + 34 + String.valueOf(i).length() + 1);
        sb.append("OnDeviceStorageKey{id=");
        sb.append(j);
        sb.append(", eventType=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }

    public final long zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzb;
    }
}
