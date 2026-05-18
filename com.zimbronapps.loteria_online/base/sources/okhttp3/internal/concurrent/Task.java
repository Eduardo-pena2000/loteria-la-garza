package okhttp3.internal.concurrent;

import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class Task {
    public final String a;
    public final boolean b;
    public TaskQueue c;
    public long d;

    public Task(String name, boolean z) {
        t.g(name, "name");
        this.a = name;
        this.b = z;
        this.d = -1L;
    }

    public final boolean a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final long c() {
        return this.d;
    }

    public final TaskQueue d() {
        return this.c;
    }

    public final void e(TaskQueue queue) {
        t.g(queue, "queue");
        TaskQueue taskQueue = this.c;
        if (taskQueue == queue) {
            return;
        }
        if (taskQueue != null) {
            throw new IllegalStateException("task is in multiple queues");
        }
        this.c = queue;
    }

    public abstract long f();

    public final void g(long j) {
        this.d = j;
    }

    public String toString() {
        return this.a;
    }

    public /* synthetic */ Task(String str, boolean z, int i, k kVar) {
        this(str, (i & 2) != 0 ? true : z);
    }
}
