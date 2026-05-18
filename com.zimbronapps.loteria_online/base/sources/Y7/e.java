package Y7;

import O7.g;
import R7.E;
import R7.S;
import R7.a0;
import android.os.SystemClock;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import w5.f;
import w5.i;
import z5.l;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class e {
    public final double a;
    public final double b;
    public final long c;
    public final long d;
    public final int e;
    public final BlockingQueue f;
    public final ThreadPoolExecutor g;
    public final i h;
    public final S i;
    public int j;
    public long k;

    public final class b implements Runnable {
        public final E a;
        public final TaskCompletionSource b;

        public /* synthetic */ b(e eVar, E e, TaskCompletionSource taskCompletionSource, a aVar) {
            this(e, taskCompletionSource);
        }

        public void run() {
            e.c(e.this, this.a, this.b);
            e.d(e.this).e();
            double e = e.e(e.this);
            g.f().b("Delay for: " + String.format(Locale.US, "%.2f", new Object[]{Double.valueOf(e / 1000.0d)}) + " s for report: " + this.a.d());
            e.f(e);
        }

        public b(E e, TaskCompletionSource taskCompletionSource) {
            this.a = e;
            this.b = taskCompletionSource;
        }
    }

    public e(i iVar, Z7.d dVar, S s) {
        this(dVar.f, dVar.g, dVar.h * 1000, iVar, s);
    }

    public static /* synthetic */ void a(e eVar, TaskCompletionSource taskCompletionSource, boolean z, E e, Exception exc) {
        eVar.n(taskCompletionSource, z, e, exc);
    }

    public static /* synthetic */ void b(e eVar, CountDownLatch countDownLatch) {
        eVar.m(countDownLatch);
    }

    public static /* synthetic */ void c(e eVar, E e, TaskCompletionSource taskCompletionSource) {
        eVar.p(e, taskCompletionSource);
    }

    public static /* synthetic */ S d(e eVar) {
        return eVar.i;
    }

    public static /* synthetic */ double e(e eVar) {
        return eVar.g();
    }

    public static /* synthetic */ void f(double d) {
        q(d);
    }

    public static void q(double d) {
        try {
            Thread.sleep((long) d);
        } catch (InterruptedException unused) {
        }
    }

    public final double g() {
        return Math.min(3600000.0d, (60000.0d / this.a) * Math.pow(this.b, h()));
    }

    public final int h() {
        if (this.k == 0) {
            this.k = o();
        }
        int o = (int) ((o() - this.k) / this.c);
        int min = l() ? Math.min(100, this.j + o) : Math.max(0, this.j - o);
        if (this.j != min) {
            this.j = min;
            this.k = o();
        }
        return min;
    }

    public TaskCompletionSource i(E e, boolean z) {
        synchronized (this.f) {
            try {
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                if (!z) {
                    p(e, taskCompletionSource);
                    return taskCompletionSource;
                }
                this.i.d();
                if (!k()) {
                    h();
                    g.f().b("Dropping report due to queue being full: " + e.d());
                    this.i.c();
                    taskCompletionSource.trySetResult(e);
                    return taskCompletionSource;
                }
                g.f().b("Enqueueing report: " + e.d());
                g.f().b("Queue size: " + this.f.size());
                this.g.execute(new b(this, e, taskCompletionSource, null));
                g.f().b("Closing task for report: " + e.d());
                taskCompletionSource.trySetResult(e);
                return taskCompletionSource;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new d(this, countDownLatch)).start();
        a0.c(countDownLatch, 2L, TimeUnit.SECONDS);
    }

    public final boolean k() {
        return this.f.size() < this.e;
    }

    public final boolean l() {
        return this.f.size() == this.e;
    }

    public final /* synthetic */ void m(CountDownLatch countDownLatch) {
        try {
            l.a(this.h, f.c);
        } catch (Exception unused) {
        }
        countDownLatch.countDown();
    }

    public final /* synthetic */ void n(TaskCompletionSource taskCompletionSource, boolean z, E e, Exception exc) {
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (z) {
            j();
        }
        taskCompletionSource.trySetResult(e);
    }

    public final long o() {
        return System.currentTimeMillis();
    }

    public final void p(E e, TaskCompletionSource taskCompletionSource) {
        g.f().b("Sending report through Google DataTransport: " + e.d());
        this.h.a(w5.d.h(e.b()), new c(this, taskCompletionSource, SystemClock.elapsedRealtime() - this.d < 2000, e));
    }

    public e(double d, double d2, long j, i iVar, S s) {
        this.a = d;
        this.b = d2;
        this.c = j;
        this.h = iVar;
        this.i = s;
        this.d = SystemClock.elapsedRealtime();
        int i = (int) d;
        this.e = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.f = arrayBlockingQueue;
        this.g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.j = 0;
        this.k = 0L;
    }
}
