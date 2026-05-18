package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbjw {
    private static final AtomicReference zza = new AtomicReference();
    private static final AtomicReference zzb = new AtomicReference();

    static {
        new AtomicBoolean();
    }

    public static zzbju zza() {
        return (zzbju) zza.get();
    }

    public static zzbjv zzb() {
        return (zzbjv) zzb.get();
    }

    public static void zzc(zzbju zzbjuVar) {
        zza.set(zzbjuVar);
    }
}
