package okhttp3.internal.connection;

import Ca.I;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.platform.Platform;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class RealConnectionPool {
    public static final Companion f = new Companion(null);
    public final int a;
    public final long b;
    public final TaskQueue c;
    public final RealConnectionPool$cleanupTask$1 d;
    public final ConcurrentLinkedQueue e;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public RealConnectionPool(TaskRunner taskRunner, int i, long j, TimeUnit timeUnit) {
        t.g(taskRunner, "taskRunner");
        t.g(timeUnit, "timeUnit");
        this.a = i;
        this.b = timeUnit.toNanos(j);
        this.c = taskRunner.i();
        this.d = new RealConnectionPool$cleanupTask$1(this, t.o(Util.i, " ConnectionPool"));
        this.e = new ConcurrentLinkedQueue();
        if (j <= 0) {
            throw new IllegalArgumentException(t.o("keepAliveDuration <= 0: ", Long.valueOf(j)).toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002d A[Catch: all -> 0x002b, TryCatch #0 {all -> 0x002b, blocks: (B:21:0x0024, B:9:0x0033, B:7:0x002d, B:12:0x0037), top: B:20:0x0024 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(okhttp3.Address r4, okhttp3.internal.connection.RealCall r5, java.util.List r6, boolean r7) {
        /*
            r3 = this;
            java.lang.String r0 = "address"
            kotlin.jvm.internal.t.g(r4, r0)
            java.lang.String r0 = "call"
            kotlin.jvm.internal.t.g(r5, r0)
            java.util.concurrent.ConcurrentLinkedQueue r0 = r3.e
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r0.next()
            okhttp3.internal.connection.RealConnection r1 = (okhttp3.internal.connection.RealConnection) r1
            java.lang.String r2 = "connection"
            kotlin.jvm.internal.t.f(r1, r2)
            monitor-enter(r1)
            if (r7 == 0) goto L2d
            boolean r2 = r1.v()     // Catch: java.lang.Throwable -> L2b
            if (r2 != 0) goto L2d
            goto L33
        L2b:
            r4 = move-exception
            goto L3d
        L2d:
            boolean r2 = r1.t(r4, r6)     // Catch: java.lang.Throwable -> L2b
            if (r2 != 0) goto L37
        L33:
            Ca.I r2 = Ca.I.a     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r1)
            goto L10
        L37:
            r5.c(r1)     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r1)
            r4 = 1
            return r4
        L3d:
            monitor-exit(r1)
            throw r4
        L3f:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnectionPool.a(okhttp3.Address, okhttp3.internal.connection.RealCall, java.util.List, boolean):boolean");
    }

    public final long b(long j) {
        Iterator it = this.e.iterator();
        int i = 0;
        long j2 = Long.MIN_VALUE;
        RealConnection realConnection = null;
        int i2 = 0;
        while (it.hasNext()) {
            RealConnection connection = (RealConnection) it.next();
            t.f(connection, "connection");
            synchronized (connection) {
                if (d(connection, j) > 0) {
                    i2++;
                } else {
                    i++;
                    long o = j - connection.o();
                    if (o > j2) {
                        realConnection = connection;
                        j2 = o;
                    }
                    I i3 = I.a;
                }
            }
        }
        long j3 = this.b;
        if (j2 < j3 && i <= this.a) {
            if (i > 0) {
                return j3 - j2;
            }
            if (i2 > 0) {
                return j3;
            }
            return -1L;
        }
        t.d(realConnection);
        synchronized (realConnection) {
            if (!realConnection.n().isEmpty()) {
                return 0L;
            }
            if (realConnection.o() + j2 != j) {
                return 0L;
            }
            realConnection.D(true);
            this.e.remove(realConnection);
            Util.n(realConnection.E());
            if (this.e.isEmpty()) {
                this.c.a();
            }
            return 0L;
        }
    }

    public final boolean c(RealConnection connection) {
        t.g(connection, "connection");
        if (Util.h && !Thread.holdsLock(connection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
        }
        if (!connection.p() && this.a != 0) {
            TaskQueue.j(this.c, this.d, 0L, 2, null);
            return false;
        }
        connection.D(true);
        this.e.remove(connection);
        if (this.e.isEmpty()) {
            this.c.a();
        }
        return true;
    }

    public final int d(RealConnection realConnection, long j) {
        if (Util.h && !Thread.holdsLock(realConnection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + realConnection);
        }
        List n = realConnection.n();
        int i = 0;
        while (i < n.size()) {
            RealCall.CallReference callReference = (Reference) n.get(i);
            if (callReference.get() != null) {
                i++;
            } else {
                Platform.a.g().m("A connection to " + realConnection.A().a().l() + " was leaked. Did you forget to close a response body?", callReference.a());
                n.remove(i);
                realConnection.D(true);
                if (n.isEmpty()) {
                    realConnection.C(j - this.b);
                    return 0;
                }
            }
        }
        return n.size();
    }

    public final void e(RealConnection connection) {
        t.g(connection, "connection");
        if (!Util.h || Thread.holdsLock(connection)) {
            this.e.add(connection);
            TaskQueue.j(this.c, this.d, 0L, 2, null);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }
}
