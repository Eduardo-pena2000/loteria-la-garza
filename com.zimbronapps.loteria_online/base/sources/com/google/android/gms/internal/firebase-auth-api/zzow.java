package com.google.android.gms.internal.firebase-auth-api;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzow {
    private static final zzow zza = new zzow();
    private static final zzov zzb = new zzov(null);
    private final AtomicReference zzc = new AtomicReference();

    public static zzow zzb() {
        return zza;
    }

    public final zzol zza() {
        zzol zzolVar = (zzol) this.zzc.get();
        return zzolVar == null ? zzb : zzolVar;
    }
}
