package cb;

import cb.l0;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class U extends l0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final U h;
    public static final long i;

    static {
        Long l;
        U u = new U();
        h = u;
        k0.O(u, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        i = timeUnit.toNanos(l.longValue());
    }

    public final boolean A0() {
        int i2 = debugStatus;
        return i2 == 2 || i2 == 3;
    }

    public final synchronized boolean B0() {
        if (A0()) {
            return false;
        }
        debugStatus = 1;
        kotlin.jvm.internal.t.e(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    public final void E0() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public Thread X() {
        Thread thread = _thread;
        return thread == null ? y0() : thread;
    }

    public void Y(long j, l0.c cVar) {
        E0();
    }

    public void d0(Runnable runnable) {
        if (z0()) {
            E0();
        }
        super.d0(runnable);
    }

    public void run() {
        boolean l0;
        Y0.a.d(this);
        c.a();
        try {
            if (!B0()) {
                if (l0) {
                    return;
                } else {
                    return;
                }
            }
            long j = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long T = T();
                if (T == Long.MAX_VALUE) {
                    c.a();
                    long nanoTime = System.nanoTime();
                    if (j == Long.MAX_VALUE) {
                        j = i + nanoTime;
                    }
                    long j2 = j - nanoTime;
                    if (j2 <= 0) {
                        _thread = null;
                        x0();
                        c.a();
                        if (l0()) {
                            return;
                        }
                        X();
                        return;
                    }
                    T = Wa.n.j(T, j2);
                } else {
                    j = Long.MAX_VALUE;
                }
                if (T > 0) {
                    if (A0()) {
                        _thread = null;
                        x0();
                        c.a();
                        if (l0()) {
                            return;
                        }
                        X();
                        return;
                    }
                    c.a();
                    LockSupport.parkNanos(this, T);
                }
            }
        } finally {
            _thread = null;
            x0();
            c.a();
            if (!l0()) {
                X();
            }
        }
    }

    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    public String toString() {
        return "DefaultExecutor";
    }

    public g0 v(long j, Runnable runnable, Ga.i iVar) {
        return t0(j, runnable);
    }

    public final synchronized void x0() {
        if (A0()) {
            debugStatus = 3;
            p0();
            kotlin.jvm.internal.t.e(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final synchronized Thread y0() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setContextClassLoader(h.getClass().getClassLoader());
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    public final boolean z0() {
        return debugStatus == 4;
    }
}
