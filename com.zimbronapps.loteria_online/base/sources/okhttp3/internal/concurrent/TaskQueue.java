package okhttp3.internal.concurrent;

import Ca.I;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.jvm.internal.t;
import okhttp3.internal.Util;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TaskQueue {
    public final TaskRunner a;
    public final String b;
    public boolean c;
    public Task d;
    public final List e;
    public boolean f;

    public static final class AwaitIdleTask extends Task {
        public final CountDownLatch e;

        public AwaitIdleTask() {
            super(t.o(Util.i, " awaitIdle"), false);
            this.e = new CountDownLatch(1);
        }

        public long f() {
            this.e.countDown();
            return -1L;
        }
    }

    public TaskQueue(TaskRunner taskRunner, String name) {
        t.g(taskRunner, "taskRunner");
        t.g(name, "name");
        this.a = taskRunner;
        this.b = name;
        this.e = new ArrayList();
    }

    public static /* synthetic */ void j(TaskQueue taskQueue, Task task, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        taskQueue.i(task, j);
    }

    public final void a() {
        if (Util.h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.a) {
            try {
                if (b()) {
                    h().h(this);
                }
                I i = I.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        Task task = this.d;
        if (task != null) {
            t.d(task);
            if (task.a()) {
                this.f = true;
            }
        }
        int size = this.e.size() - 1;
        boolean z = false;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                if (((Task) this.e.get(size)).a()) {
                    Task task2 = (Task) this.e.get(size);
                    if (TaskRunner.h.a().isLoggable(Level.FINE)) {
                        TaskLoggerKt.a(task2, this, "canceled");
                    }
                    this.e.remove(size);
                    z = true;
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
        }
        return z;
    }

    public final Task c() {
        return this.d;
    }

    public final boolean d() {
        return this.f;
    }

    public final List e() {
        return this.e;
    }

    public final String f() {
        return this.b;
    }

    public final boolean g() {
        return this.c;
    }

    public final TaskRunner h() {
        return this.a;
    }

    public final void i(Task task, long j) {
        t.g(task, "task");
        synchronized (this.a) {
            if (!g()) {
                if (k(task, j, false)) {
                    h().h(this);
                }
                I i = I.a;
            } else if (task.a()) {
                if (TaskRunner.h.a().isLoggable(Level.FINE)) {
                    TaskLoggerKt.a(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (TaskRunner.h.a().isLoggable(Level.FINE)) {
                    TaskLoggerKt.a(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean k(Task task, long j, boolean z) {
        t.g(task, "task");
        task.e(this);
        long nanoTime = this.a.g().nanoTime();
        long j2 = nanoTime + j;
        int indexOf = this.e.indexOf(task);
        if (indexOf != -1) {
            if (task.c() <= j2) {
                if (TaskRunner.h.a().isLoggable(Level.FINE)) {
                    TaskLoggerKt.a(task, this, "already scheduled");
                }
                return false;
            }
            this.e.remove(indexOf);
        }
        task.g(j2);
        if (TaskRunner.h.a().isLoggable(Level.FINE)) {
            TaskLoggerKt.a(task, this, z ? t.o("run again after ", TaskLoggerKt.b(j2 - nanoTime)) : t.o("scheduled after ", TaskLoggerKt.b(j2 - nanoTime)));
        }
        Iterator it = this.e.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((Task) it.next()).c() - nanoTime > j) {
                break;
            }
            i++;
        }
        if (i == -1) {
            i = this.e.size();
        }
        this.e.add(i, task);
        return i == 0;
    }

    public final void l(Task task) {
        this.d = task;
    }

    public final void m(boolean z) {
        this.f = z;
    }

    public final void n(boolean z) {
        this.c = z;
    }

    public final void o() {
        if (Util.h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.a) {
            try {
                n(true);
                if (b()) {
                    h().h(this);
                }
                I i = I.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return this.b;
    }
}
