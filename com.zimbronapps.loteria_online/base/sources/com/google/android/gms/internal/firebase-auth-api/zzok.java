package com.google.android.gms.internal.firebase-auth-api;

import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzok {
    public static final zzok zza = new zzoj().zza();
    private final Map zzb;

    public /* synthetic */ zzok(Map map, zzom zzomVar) {
        this(map);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzok) {
            return this.zzb.equals(((zzok) obj).zzb);
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

    private zzok(Map map) {
        this.zzb = map;
    }
}
