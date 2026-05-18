package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzikh implements zzikg, zzika {
    private static final zzikh zza = new zzikh(null);
    private final Object zzb;

    private zzikh(Object obj) {
        this.zzb = obj;
    }

    public static zzikg zza(Object obj) {
        zziko.zza(obj, "instance cannot be null");
        return new zzikh(obj);
    }

    public static zzikg zzc(Object obj) {
        return obj == null ? zza : new zzikh(obj);
    }

    public final Object zzb() {
        return this.zzb;
    }
}
