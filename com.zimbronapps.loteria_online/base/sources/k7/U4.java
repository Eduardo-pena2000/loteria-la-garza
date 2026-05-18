package k7;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class u4 implements Runnable {
    public final /* synthetic */ AtomicReference a;
    public final /* synthetic */ b5 b;

    public u4(b5 b5Var, AtomicReference atomicReference) {
        this.a = atomicReference;
        Objects.requireNonNull(b5Var);
        this.b = b5Var;
    }

    public final void run() {
        AtomicReference atomicReference = this.a;
        synchronized (atomicReference) {
            try {
                try {
                    b5 b5Var = this.b;
                    atomicReference.set(Boolean.valueOf(b5Var.a.w().H(b5Var.a.L().q(), f2.b0)));
                } finally {
                    this.a.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
