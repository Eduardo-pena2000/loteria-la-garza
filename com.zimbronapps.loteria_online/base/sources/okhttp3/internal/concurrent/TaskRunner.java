package okhttp3.internal.concurrent;

import Ca.I;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import okhttp3.internal.Util;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TaskRunner {
    public static final Companion h = new Companion(null);
    public static final TaskRunner i = new TaskRunner(new RealBackend(Util.N(t.o(Util.i, " TaskRunner"), true)));
    public static final Logger j;
    public final Backend a;
    public int b;
    public boolean c;
    public long d;
    public final List e;
    public final List f;
    public final Runnable g;

    public interface Backend {
        void a(TaskRunner taskRunner);

        void b(TaskRunner taskRunner, long j);

        void execute(Runnable runnable);

        long nanoTime();
    }

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final Logger a() {
            return TaskRunner.a();
        }

        private Companion() {
        }
    }

    public static final class RealBackend implements Backend {
        public final ThreadPoolExecutor a;

        public RealBackend(ThreadFactory threadFactory) {
            t.g(threadFactory, "threadFactory");
            this.a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        public void a(TaskRunner taskRunner) {
            t.g(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        public void b(TaskRunner taskRunner, long j) {
            t.g(taskRunner, "taskRunner");
            long j2 = j / 1000000;
            long j3 = j - (1000000 * j2);
            if (j2 > 0 || j > 0) {
                taskRunner.wait(j2, (int) j3);
            }
        }

        public void execute(Runnable runnable) {
            t.g(runnable, "runnable");
            this.a.execute(runnable);
        }

        public long nanoTime() {
            return System.nanoTime();
        }
    }

    static {
        Logger logger = Logger.getLogger(TaskRunner.class.getName());
        t.f(logger, "getLogger(TaskRunner::class.java.name)");
        j = logger;
    }

    public TaskRunner(Backend backend) {
        t.g(backend, "backend");
        this.a = backend;
        this.b = 10000;
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new TaskRunner$runnable$1(this);
    }

    public static final /* synthetic */ Logger a() {
        return j;
    }

    public static final /* synthetic */ void b(TaskRunner taskRunner, Task task) {
        taskRunner.j(task);
    }

    public final void c(Task task, long j2) {
        if (Util.h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        TaskQueue d = task.d();
        t.d(d);
        if (d.c() != task) {
            throw new IllegalStateException("Check failed.");
        }
        boolean d2 = d.d();
        d.m(false);
        d.l(null);
        this.e.remove(d);
        if (j2 != -1 && !d2 && !d.g()) {
            d.k(task, j2, true);
        }
        if (d.e().isEmpty()) {
            return;
        }
        this.f.add(d);
    }

    public final Task d() {
        boolean z;
        if (Util.h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        while (!this.f.isEmpty()) {
            long nanoTime = this.a.nanoTime();
            Iterator it = this.f.iterator();
            long j2 = Long.MAX_VALUE;
            Task task = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                Task task2 = (Task) ((TaskQueue) it.next()).e().get(0);
                long max = Math.max(0L, task2.c() - nanoTime);
                if (max > 0) {
                    j2 = Math.min(max, j2);
                } else {
                    if (task != null) {
                        z = true;
                        break;
                    }
                    task = task2;
                }
            }
            if (task != null) {
                e(task);
                if (z || (!this.c && !this.f.isEmpty())) {
                    this.a.execute(this.g);
                }
                return task;
            }
            if (this.c) {
                if (j2 < this.d - nanoTime) {
                    this.a.a(this);
                }
                return null;
            }
            this.c = true;
            this.d = nanoTime + j2;
            try {
                try {
                    this.a.b(this, j2);
                } catch (InterruptedException unused) {
                    f();
                }
            } finally {
                this.c = false;
            }
        }
        return null;
    }

    public final void e(Task task) {
        if (Util.h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        task.g(-1L);
        TaskQueue d = task.d();
        t.d(d);
        d.e().remove(task);
        this.f.remove(d);
        d.l(task);
        this.e.add(d);
    }

    public final void f() {
        int size = this.e.size() - 1;
        if (size >= 0) {
            while (true) {
                int i2 = size - 1;
                ((TaskQueue) this.e.get(size)).b();
                if (i2 < 0) {
                    break;
                } else {
                    size = i2;
                }
            }
        }
        int size2 = this.f.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i3 = size2 - 1;
            TaskQueue taskQueue = (TaskQueue) this.f.get(size2);
            taskQueue.b();
            if (taskQueue.e().isEmpty()) {
                this.f.remove(size2);
            }
            if (i3 < 0) {
                return;
            } else {
                size2 = i3;
            }
        }
    }

    public final Backend g() {
        return this.a;
    }

    public final void h(TaskQueue taskQueue) {
        t.g(taskQueue, "taskQueue");
        if (Util.h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (taskQueue.c() == null) {
            if (taskQueue.e().isEmpty()) {
                this.f.remove(taskQueue);
            } else {
                Util.c(this.f, taskQueue);
            }
        }
        if (this.c) {
            this.a.a(this);
        } else {
            this.a.execute(this.g);
        }
    }

    public final TaskQueue i() {
        int i2;
        synchronized (this) {
            i2 = this.b;
            this.b = i2 + 1;
        }
        return new TaskQueue(this, t.o("Q", Integer.valueOf(i2)));
    }

    public final void j(Task task) {
        if (Util.h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(task.b());
        try {
            long f = task.f();
            synchronized (this) {
                c(task, f);
                I i2 = I.a;
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (this) {
                c(task, -1L);
                I i3 = I.a;
                currentThread.setName(name);
                throw th;
            }
        }
    }
}
