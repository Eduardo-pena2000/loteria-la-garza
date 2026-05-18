package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzgxi implements Closeable {
    private static final zzgxh zzc = zzgxh.zza;
    private final Deque zza = new ArrayDeque(4);
    private Throwable zzb;

    public zzgxi(zzgxh zzgxhVar) {
    }

    public static zzgxi zza() {
        return new zzgxi(zzc);
    }

    public final void close() throws IOException {
        Throwable th = this.zzb;
        while (true) {
            Deque deque = this.zza;
            if (deque.isEmpty()) {
                break;
            }
            Closeable closeable = (Closeable) deque.removeFirst();
            try {
                closeable.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else if (th != th2) {
                    try {
                        th.addSuppressed(th2);
                    } catch (Throwable unused) {
                        zzgxg.zza.logp(Level.WARNING, "com.google.common.io.Closer", "<init>", "Suppressing exception thrown when closing ".concat(String.valueOf(closeable)), th2);
                    }
                }
            }
        }
        if (this.zzb != null || th == null) {
            return;
        }
        zzgrz.zza(th, IOException.class);
        zzgrz.zzb(th);
        throw new AssertionError(th);
    }

    public final Closeable zzb(Closeable closeable) {
        this.zza.addFirst(closeable);
        return closeable;
    }

    public final RuntimeException zzc(Throwable th) throws IOException {
        this.zzb = th;
        zzgrz.zza(th, IOException.class);
        zzgrz.zzb(th);
        throw new RuntimeException(th);
    }
}
