package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzft implements zzao {
    public final int zza;

    public zzft(int i) {
        this.zza = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzft) && this.zza == ((zzft) obj).zza;
    }

    public final int hashCode() {
        return this.zza;
    }

    public final String toString() {
        int i = this.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 19);
        sb.append("Mp4AlternateGroup: ");
        sb.append(i);
        return sb.toString();
    }
}
