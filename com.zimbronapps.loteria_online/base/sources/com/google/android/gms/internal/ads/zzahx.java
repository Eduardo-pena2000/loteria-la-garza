package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzahx implements zzao {
    public final long zza;

    public zzahx(long j) {
        this.zza = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzahx.class == obj.getClass() && this.zza == ((zzahx) obj).zza;
    }

    public final int hashCode() {
        return Long.hashCode(this.zza) + 527;
    }

    public final String toString() {
        long j = this.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 38);
        sb.append("ThumbnailMetadata: presentationTimeUs=");
        sb.append(j);
        return sb.toString();
    }
}
