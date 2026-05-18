package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhjr {
    public static final zzhjr zza = new zzhjq().zza();
    private final Map zzb;

    public /* synthetic */ zzhjr(Map map, byte[] bArr) {
        this.zzb = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzhjr) {
            return this.zzb.equals(((zzhjr) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final String toString() {
        return this.zzb.toString();
    }

    public final boolean zza() {
        return this.zzb.isEmpty();
    }
}
