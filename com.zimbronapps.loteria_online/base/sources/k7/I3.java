package k7;

import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class i3 extends U3 {
    public static final AtomicLong k = new AtomicLong(Long.MIN_VALUE);
    public h3 c;
    public h3 d;
    public final PriorityBlockingQueue e;
    public final BlockingQueue f;
    public final Thread.UncaughtExceptionHandler g;
    public final Thread.UncaughtExceptionHandler h;
    public final Object i;
    public final Semaphore j;

    public i3(q3 q3Var) {
        super(q3Var);
        this.i = new Object();
        this.j = new Semaphore(2);
        this.e = new PriorityBlockingQueue();
        this.f = new LinkedBlockingQueue();
        this.g = new f3(this, "Thread death: Uncaught exception on worker thread");
        this.h = new f3(this, "Thread death: Uncaught exception on network thread");
    }

    public static /* synthetic */ AtomicLong E() {
        return k;
    }

    public final /* synthetic */ void A(h3 h3Var) {
        this.d = null;
    }

    public final /* synthetic */ Object B() {
        return this.i;
    }

    public final /* synthetic */ Semaphore C() {
        return this.j;
    }

    public final /* synthetic */ boolean D() {
        return false;
    }

    public final void F(g3 g3Var) {
        synchronized (this.i) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.e;
                priorityBlockingQueue.add(g3Var);
                h3 h3Var = this.c;
                if (h3Var == null) {
                    h3 h3Var2 = new h3(this, "Measurement Worker", priorityBlockingQueue);
                    this.c = h3Var2;
                    h3Var2.setUncaughtExceptionHandler(this.g);
                    this.c.start();
                } else {
                    h3Var.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        if (Thread.currentThread() != this.d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public final void h() {
        if (Thread.currentThread() != this.c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final boolean i() {
        return false;
    }

    public final void o() {
        if (Thread.currentThread() == this.c) {
            throw new IllegalStateException("Call not expected from worker thread");
        }
    }

    public final boolean p() {
        return Thread.currentThread() == this.c;
    }

    public final boolean q() {
        return Thread.currentThread() == this.d;
    }

    public final Future r(Callable callable) {
        l();
        com.google.android.gms.common.internal.t.l(callable);
        g3 g3Var = new g3(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.c) {
            if (!this.e.isEmpty()) {
                this.a.a().r().a("Callable skipped the worker queue.");
            }
            g3Var.run();
        } else {
            F(g3Var);
        }
        return g3Var;
    }

    public final Future s(Callable callable) {
        l();
        com.google.android.gms.common.internal.t.l(callable);
        g3 g3Var = new g3(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.c) {
            g3Var.run();
        } else {
            F(g3Var);
        }
        return g3Var;
    }

    public final void t(Runnable runnable) {
        l();
        com.google.android.gms.common.internal.t.l(runnable);
        F(new g3(this, runnable, false, "Task exception on worker thread"));
    }

    public final Object u(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            this.a.b().t(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                A2 r = this.a.a().r();
                StringBuilder sb = new StringBuilder(str.length() + 24);
                sb.append("Interrupted waiting for ");
                sb.append(str);
                r.a(sb.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            this.a.a().r().a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final void v(Runnable runnable) {
        l();
        com.google.android.gms.common.internal.t.l(runnable);
        F(new g3(this, runnable, true, "Task exception on worker thread"));
    }

    public final void w(Runnable runnable) {
        l();
        com.google.android.gms.common.internal.t.l(runnable);
        g3 g3Var = new g3(this, runnable, false, "Task exception on network thread");
        synchronized (this.i) {
            try {
                BlockingQueue blockingQueue = this.f;
                blockingQueue.add(g3Var);
                h3 h3Var = this.d;
                if (h3Var == null) {
                    h3 h3Var2 = new h3(this, "Measurement Network", blockingQueue);
                    this.d = h3Var2;
                    h3Var2.setUncaughtExceptionHandler(this.h);
                    this.d.start();
                } else {
                    h3Var.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ h3 x() {
        return this.c;
    }

    public final /* synthetic */ void y(h3 h3Var) {
        this.c = null;
    }

    public final /* synthetic */ h3 z() {
        return this.d;
    }
}
