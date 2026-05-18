package com.google.android.gms.internal.fido;

import java.io.Closeable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzfm implements Closeable {
    private static final ThreadLocal zza = new zzfl();
    private int zzb = 0;

    public static int zza() {
        return ((zzfm) zza.get()).zzb;
    }

    public final void close() {
        int i = this.zzb;
        if (i <= 0) {
            throw new AssertionError("Mismatched calls to RecursionDepth (possible error in core library)");
        }
        this.zzb = i - 1;
    }
}
