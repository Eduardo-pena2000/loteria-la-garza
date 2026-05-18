package jb;

import Ca.I;
import Ca.o;
import Wa.n;
import cb.T;
import hb.D;
import hb.y;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class a implements Executor, Closeable {
    public static final a h = new a(null);
    public static final /* synthetic */ AtomicLongFieldUpdater i = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater j = AtomicLongFieldUpdater.newUpdater(a.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater k = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated$volatile");
    public static final D l = new D("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;
    public final int a;
    public final int b;
    public final long c;
    private volatile /* synthetic */ long controlState$volatile;
    public final String d;
    public final jb.d e;
    public final jb.d f;
    public final y g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {
        public static final d a = new d("CPU_ACQUIRED", 0);
        public static final d b = new d("BLOCKING", 1);
        public static final d c = new d("PARKING", 2);
        public static final d d = new d("DORMANT", 3);
        public static final d e = new d("TERMINATED", 4);
        public static final /* synthetic */ d[] f;
        public static final /* synthetic */ Ja.a g;

        static {
            d[] a2 = a();
            f = a2;
            g = Ja.b.a(a2);
        }

        public d(String str, int i) {
        }

        public static final /* synthetic */ d[] a() {
            return new d[]{a, b, c, d, e};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f.clone();
        }
    }

    public a(int i2, int i3, long j2, String str) {
        this.a = i2;
        this.b = i3;
        this.c = j2;
        this.d = str;
        if (i2 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i2 + " should be at least 1").toString());
        }
        if (i3 < i2) {
            throw new IllegalArgumentException(("Max pool size " + i3 + " should be greater than or equals to core pool size " + i2).toString());
        }
        if (i3 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i3 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j2 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j2 + " must be positive").toString());
        }
        this.e = new jb.d();
        this.f = new jb.d();
        this.g = new y((i2 + 1) * 2);
        this.controlState$volatile = i2 << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ boolean G(a aVar, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = o().get(aVar);
        }
        return aVar.E(j2);
    }

    public static final /* synthetic */ AtomicLongFieldUpdater a() {
        return o();
    }

    public static /* synthetic */ void m(a aVar, Runnable runnable, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        aVar.k(runnable, z, z2);
    }

    public static final /* synthetic */ AtomicLongFieldUpdater o() {
        return j;
    }

    public static final /* synthetic */ AtomicLongFieldUpdater r() {
        return i;
    }

    public static final /* synthetic */ AtomicIntegerFieldUpdater s() {
        return k;
    }

    public final void A(long j2, boolean z) {
        if (z || J() || E(j2)) {
            return;
        }
        J();
    }

    public final void B() {
        if (J() || G(this, 0L, 1, null)) {
            return;
        }
        J();
    }

    public final h C(c cVar, h hVar, boolean z) {
        if (cVar == null) {
            return hVar;
        }
        d dVar = cVar.c;
        if (dVar == d.e) {
            return hVar;
        }
        if (!hVar.b && dVar == d.b) {
            return hVar;
        }
        cVar.g = true;
        return cVar.a.a(hVar, z);
    }

    public final boolean E(long j2) {
        if (n.e(((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21)), 0) < this.a) {
            int d2 = d();
            if (d2 == 1 && this.a > 1) {
                d();
            }
            if (d2 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean J() {
        c u;
        do {
            u = u();
            if (u == null) {
                return false;
            }
        } while (!c.h().compareAndSet(u, -1, 0));
        LockSupport.unpark(u);
        return true;
    }

    public final boolean b(h hVar) {
        return hVar.b ? this.f.a(hVar) : this.e.a(hVar);
    }

    public void close() {
        z(10000L);
    }

    public final int d() {
        synchronized (this.g) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                long j2 = o().get(this);
                int i2 = (int) (j2 & 2097151);
                int e = n.e(i2 - ((int) ((j2 & 4398044413952L) >> 21)), 0);
                if (e >= this.a) {
                    return 0;
                }
                if (i2 >= this.b) {
                    return 0;
                }
                int i3 = ((int) (a().get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.g.b(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                c cVar = new c(this, i3);
                this.g.c(i3, cVar);
                if (i3 != ((int) (2097151 & o().incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = e + 1;
                cVar.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void execute(Runnable runnable) {
        m(this, runnable, false, false, 6, null);
    }

    public final h f(Runnable runnable, boolean z) {
        long a2 = j.f.a();
        if (!(runnable instanceof h)) {
            return j.b(runnable, a2, z);
        }
        h hVar = (h) runnable;
        hVar.a = a2;
        hVar.b = z;
        return hVar;
    }

    public final c h() {
        Thread currentThread = Thread.currentThread();
        c cVar = currentThread instanceof c ? (c) currentThread : null;
        if (cVar == null || !t.c(c.a(cVar), this)) {
            return null;
        }
        return cVar;
    }

    public final boolean isTerminated() {
        return s().get(this) != 0;
    }

    public final void k(Runnable runnable, boolean z, boolean z2) {
        cb.c.a();
        h f = f(runnable, z);
        boolean z3 = f.b;
        long addAndGet = z3 ? o().addAndGet(this, 2097152L) : 0L;
        c h2 = h();
        h C = C(h2, f, z2);
        if (C != null && !b(C)) {
            throw new RejectedExecutionException(this.d + " was terminated");
        }
        boolean z4 = z2 && h2 != null;
        if (z3) {
            A(addAndGet, z4);
        } else {
            if (z4) {
                return;
            }
            B();
        }
    }

    public final int t(c cVar) {
        Object g = cVar.g();
        while (g != l) {
            if (g == null) {
                return 0;
            }
            c cVar2 = (c) g;
            int f = cVar2.f();
            if (f != 0) {
                return f;
            }
            g = cVar2.g();
        }
        return -1;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int a2 = this.g.a();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 1; i7 < a2; i7++) {
            c cVar = (c) this.g.b(i7);
            if (cVar != null) {
                int i8 = cVar.a.i();
                int i9 = b.a[cVar.c.ordinal()];
                if (i9 == 1) {
                    i4++;
                } else if (i9 == 2) {
                    i3++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i8);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i9 == 3) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i8);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i9 == 4) {
                    i5++;
                    if (i8 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i8);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (i9 != 5) {
                        throw new o();
                    }
                    i6++;
                }
            }
        }
        long j2 = o().get(this);
        return this.d + '@' + T.b(this) + "[Pool Size {core = " + this.a + ", max = " + this.b + "}, Worker States {CPU = " + i2 + ", blocking = " + i3 + ", parked = " + i4 + ", dormant = " + i5 + ", terminated = " + i6 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.e.c() + ", global blocking queue size = " + this.f.c() + ", Control State {created workers= " + ((int) (2097151 & j2)) + ", blocking tasks = " + ((int) ((4398044413952L & j2) >> 21)) + ", CPUs acquired = " + (this.a - ((int) ((9223367638808264704L & j2) >> 42))) + "}]";
    }

    public final c u() {
        AtomicLongFieldUpdater r = r();
        while (true) {
            long j2 = r.get(this);
            c cVar = (c) this.g.b((int) (2097151 & j2));
            if (cVar == null) {
                return null;
            }
            long j3 = (2097152 + j2) & (-2097152);
            int t = t(cVar);
            if (t >= 0 && r().compareAndSet(this, j2, t | j3)) {
                cVar.o(l);
                return cVar;
            }
        }
    }

    public final boolean v(c cVar) {
        long j2;
        int f;
        if (cVar.g() != l) {
            return false;
        }
        AtomicLongFieldUpdater r = r();
        do {
            j2 = r.get(this);
            f = cVar.f();
            cVar.o(this.g.b((int) (2097151 & j2)));
        } while (!r().compareAndSet(this, j2, ((2097152 + j2) & (-2097152)) | f));
        return true;
    }

    public final void x(c cVar, int i2, int i3) {
        AtomicLongFieldUpdater r = r();
        while (true) {
            long j2 = r.get(this);
            int i4 = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & (-2097152);
            if (i4 == i2) {
                i4 = i3 == 0 ? t(cVar) : i3;
            }
            if (i4 >= 0 && r().compareAndSet(this, j2, j3 | i4)) {
                return;
            }
        }
    }

    public final void y(h hVar) {
        try {
            hVar.run();
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(long r8) {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = s()
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r7, r1, r2)
            if (r0 != 0) goto Ld
            return
        Ld:
            jb.a$c r0 = r7.h()
            hb.y r1 = r7.g
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = a()     // Catch: java.lang.Throwable -> L8f
            long r3 = r3.get(r7)     // Catch: java.lang.Throwable -> L8f
            r5 = 2097151(0x1fffff, double:1.0361303E-317)
            long r3 = r3 & r5
            int r3 = (int) r3
            monitor-exit(r1)
            if (r2 > r3) goto L4d
            r1 = r2
        L25:
            hb.y r4 = r7.g
            java.lang.Object r4 = r4.b(r1)
            kotlin.jvm.internal.t.d(r4)
            jb.a$c r4 = (jb.a.c) r4
            if (r4 == r0) goto L48
        L32:
            java.lang.Thread$State r5 = r4.getState()
            java.lang.Thread$State r6 = java.lang.Thread.State.TERMINATED
            if (r5 == r6) goto L41
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r4.join(r8)
            goto L32
        L41:
            jb.l r4 = r4.a
            jb.d r5 = r7.f
            r4.j(r5)
        L48:
            if (r1 == r3) goto L4d
            int r1 = r1 + 1
            goto L25
        L4d:
            jb.d r8 = r7.f
            r8.b()
            jb.d r8 = r7.e
            r8.b()
        L57:
            if (r0 == 0) goto L5f
            jb.h r8 = r0.e(r2)
            if (r8 != 0) goto L8b
        L5f:
            jb.d r8 = r7.e
            java.lang.Object r8 = r8.e()
            jb.h r8 = (jb.h) r8
            if (r8 != 0) goto L8b
            jb.d r8 = r7.f
            java.lang.Object r8 = r8.e()
            jb.h r8 = (jb.h) r8
            if (r8 != 0) goto L8b
            if (r0 == 0) goto L7a
            jb.a$d r8 = jb.a.d.e
            r0.r(r8)
        L7a:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = r()
            r0 = 0
            r8.set(r7, r0)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = o()
            r8.set(r7, r0)
            return
        L8b:
            r7.y(r8)
            goto L57
        L8f:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: jb.a.z(long):void");
    }

    public final class c extends Thread {
        public static final /* synthetic */ AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl$volatile");
        public final l a;
        public final O b;
        public d c;
        public long d;
        public long e;
        public int f;
        public boolean g;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        public c() {
            setDaemon(true);
            setContextClassLoader(a.this.getClass().getClassLoader());
            this.a = new l();
            this.b = new O();
            this.c = d.d;
            this.nextParkedWorker = a.l;
            int nanoTime = (int) System.nanoTime();
            this.f = nanoTime == 0 ? 42 : nanoTime;
        }

        public static final /* synthetic */ a a(c cVar) {
            return a.this;
        }

        public static final /* synthetic */ AtomicIntegerFieldUpdater h() {
            return i;
        }

        public final void b(h hVar) {
            this.d = 0L;
            if (this.c == d.c) {
                this.c = d.b;
            }
            if (!hVar.b) {
                a.this.y(hVar);
                return;
            }
            if (r(d.b)) {
                a.this.B();
            }
            a.this.y(hVar);
            a.a().addAndGet(a.this, -2097152L);
            if (this.c != d.e) {
                this.c = d.d;
            }
        }

        public final h c(boolean z) {
            h l;
            h l2;
            if (z) {
                boolean z2 = j(a.this.a * 2) == 0;
                if (z2 && (l2 = l()) != null) {
                    return l2;
                }
                h k = this.a.k();
                if (k != null) {
                    return k;
                }
                if (!z2 && (l = l()) != null) {
                    return l;
                }
            } else {
                h l3 = l();
                if (l3 != null) {
                    return l3;
                }
            }
            return s(3);
        }

        public final h d() {
            h l = this.a.l();
            if (l != null) {
                return l;
            }
            h hVar = (h) a.this.f.e();
            return hVar == null ? s(1) : hVar;
        }

        public final h e(boolean z) {
            return p() ? c(z) : d();
        }

        public final int f() {
            return this.indexInArray;
        }

        public final Object g() {
            return this.nextParkedWorker;
        }

        public final boolean i() {
            return this.nextParkedWorker != a.l;
        }

        public final int j(int i2) {
            int i3 = this.f;
            int i4 = i3 ^ (i3 << 13);
            int i5 = i4 ^ (i4 >> 17);
            int i6 = i5 ^ (i5 << 5);
            this.f = i6;
            int i7 = i2 - 1;
            return (i7 & i2) == 0 ? i6 & i7 : (i6 & Integer.MAX_VALUE) % i2;
        }

        public final void k() {
            if (this.d == 0) {
                this.d = System.nanoTime() + a.this.c;
            }
            LockSupport.parkNanos(a.this.c);
            if (System.nanoTime() - this.d >= 0) {
                this.d = 0L;
                t();
            }
        }

        public final h l() {
            if (j(2) == 0) {
                h hVar = (h) a.this.e.e();
                return hVar != null ? hVar : (h) a.this.f.e();
            }
            h hVar2 = (h) a.this.f.e();
            return hVar2 != null ? hVar2 : (h) a.this.e.e();
        }

        public final void m() {
            loop0: while (true) {
                boolean z = false;
                while (!a.this.isTerminated() && this.c != d.e) {
                    h e = e(this.g);
                    if (e != null) {
                        this.e = 0L;
                        b(e);
                    } else {
                        this.g = false;
                        if (this.e == 0) {
                            q();
                        } else if (z) {
                            r(d.c);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.e);
                            this.e = 0L;
                        } else {
                            z = true;
                        }
                    }
                }
            }
            r(d.e);
        }

        public final void n(int i2) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.this.d);
            sb.append("-worker-");
            sb.append(i2 == 0 ? "TERMINATED" : String.valueOf(i2));
            setName(sb.toString());
            this.indexInArray = i2;
        }

        public final void o(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean p() {
            long j;
            if (this.c == d.a) {
                return true;
            }
            a aVar = a.this;
            AtomicLongFieldUpdater a = a.a();
            do {
                j = a.get(aVar);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    return false;
                }
            } while (!a.a().compareAndSet(aVar, j, j - 4398046511104L));
            this.c = d.a;
            return true;
        }

        public final void q() {
            if (!i()) {
                a.this.v(this);
                return;
            }
            h().set(this, -1);
            while (i() && h().get(this) == -1 && !a.this.isTerminated() && this.c != d.e) {
                r(d.c);
                Thread.interrupted();
                k();
            }
        }

        public final boolean r(d dVar) {
            d dVar2 = this.c;
            boolean z = dVar2 == d.a;
            if (z) {
                a.a().addAndGet(a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.c = dVar;
            }
            return z;
        }

        public void run() {
            m();
        }

        public final h s(int i2) {
            int i3 = (int) (a.a().get(a.this) & 2097151);
            if (i3 < 2) {
                return null;
            }
            int j = j(i3);
            a aVar = a.this;
            long j2 = Long.MAX_VALUE;
            for (int i4 = 0; i4 < i3; i4++) {
                j++;
                if (j > i3) {
                    j = 1;
                }
                c cVar = (c) aVar.g.b(j);
                if (cVar != null && cVar != this) {
                    long r = cVar.a.r(i2, this.b);
                    if (r == -1) {
                        O o = this.b;
                        h hVar = (h) o.a;
                        o.a = null;
                        return hVar;
                    }
                    if (r > 0) {
                        j2 = Math.min(j2, r);
                    }
                }
            }
            if (j2 == Long.MAX_VALUE) {
                j2 = 0;
            }
            this.e = j2;
            return null;
        }

        public final void t() {
            a aVar = a.this;
            synchronized (aVar.g) {
                try {
                    if (aVar.isTerminated()) {
                        return;
                    }
                    if (((int) (a.a().get(aVar) & 2097151)) <= aVar.a) {
                        return;
                    }
                    if (h().compareAndSet(this, -1, 1)) {
                        int i2 = this.indexInArray;
                        n(0);
                        aVar.x(this, i2, 0);
                        int andDecrement = (int) (a.a().getAndDecrement(aVar) & 2097151);
                        if (andDecrement != i2) {
                            Object b = aVar.g.b(andDecrement);
                            t.d(b);
                            c cVar = (c) b;
                            aVar.g.c(i2, cVar);
                            cVar.n(i2);
                            aVar.x(cVar, andDecrement, i2);
                        }
                        aVar.g.c(andDecrement, null);
                        I i3 = I.a;
                        this.c = d.e;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public c(a aVar, int i2) {
            this();
            n(i2);
        }
    }
}
