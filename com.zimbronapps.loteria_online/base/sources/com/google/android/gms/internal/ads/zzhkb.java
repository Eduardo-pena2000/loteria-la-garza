package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhkb {
    private static final zzhkb zza = new zzhkb();
    private static final zzhka zzb = new zzhka(null);
    private final AtomicReference zzc = new AtomicReference();

    public static zzhkb zza() {
        return zza;
    }

    public final zzhjt zzb() {
        zzhjt zzhjtVar = (zzhjt) this.zzc.get();
        return zzhjtVar == null ? zzb : zzhjtVar;
    }
}
