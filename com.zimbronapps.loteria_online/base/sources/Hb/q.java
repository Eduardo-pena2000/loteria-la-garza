package hb;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class q {
    public static final a e = new a(null);
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater g = AtomicLongFieldUpdater.newUpdater(q.class, "_state$volatile");
    public static final D h = new D("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final int a(long j) {
            return (j & 2305843009213693952L) != 0 ? 2 : 1;
        }

        public final long b(long j, int i) {
            return d(j, 1073741823L) | i;
        }

        public final long c(long j, int i) {
            return d(j, 1152921503533105152L) | (i << 30);
        }

        public final long d(long j, long j2) {
            return j & (~j2);
        }

        public a() {
        }
    }

    public static final class b {
        public final int a;

        public b(int i) {
            this.a = i;
        }
    }

    public q(int i, boolean z) {
        this.a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater h() {
        return f;
    }

    public static final /* synthetic */ AtomicLongFieldUpdater i() {
        return g;
    }

    public final int a(Object obj) {
        AtomicLongFieldUpdater i = i();
        while (true) {
            long j = i.get(this);
            if ((3458764513820540928L & j) != 0) {
                return e.a(j);
            }
            int i2 = (int) (1073741823 & j);
            int i3 = (int) ((1152921503533105152L & j) >> 30);
            int i4 = this.c;
            if (((i3 + 2) & i4) == (i2 & i4)) {
                return 1;
            }
            if (!this.b && f().get(i3 & i4) != null) {
                int i5 = this.a;
                if (i5 < 1024 || ((i3 - i2) & 1073741823) > (i5 >> 1)) {
                    break;
                }
            } else if (i().compareAndSet(this, j, e.c(j, (i3 + 1) & 1073741823))) {
                f().set(i3 & i4, obj);
                q qVar = this;
                while ((i().get(qVar) & 1152921504606846976L) != 0 && (qVar = qVar.l().e(i3, obj)) != null) {
                }
                return 0;
            }
        }
        return 1;
    }

    public final q b(long j) {
        q qVar = new q(this.a * 2, this.b);
        int i = (int) (1073741823 & j);
        int i2 = (int) ((1152921503533105152L & j) >> 30);
        while (true) {
            int i3 = this.c;
            if ((i & i3) == (i3 & i2)) {
                i().set(qVar, e.d(j, 1152921504606846976L));
                return qVar;
            }
            Object obj = f().get(this.c & i);
            if (obj == null) {
                obj = new b(i);
            }
            qVar.f().set(qVar.c & i, obj);
            i++;
        }
    }

    public final q c(long j) {
        AtomicReferenceFieldUpdater h2 = h();
        while (true) {
            q qVar = (q) h2.get(this);
            if (qVar != null) {
                return qVar;
            }
            s1.b.a(h(), this, (Object) null, b(j));
        }
    }

    public final boolean d() {
        long j;
        AtomicLongFieldUpdater i = i();
        do {
            j = i.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!i.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    public final q e(int i, Object obj) {
        Object obj2 = f().get(this.c & i);
        if (!(obj2 instanceof b) || ((b) obj2).a != i) {
            return null;
        }
        f().set(i & this.c, obj);
        return this;
    }

    public final /* synthetic */ AtomicReferenceArray f() {
        return this.d;
    }

    public final int g() {
        long j = i().get(this);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    public final boolean j() {
        long j = i().get(this);
        return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    public final long k() {
        long j;
        long j2;
        AtomicLongFieldUpdater i = i();
        do {
            j = i.get(this);
            if ((j & 1152921504606846976L) != 0) {
                return j;
            }
            j2 = j | 1152921504606846976L;
        } while (!i.compareAndSet(this, j, j2));
        return j2;
    }

    public final q l() {
        return c(k());
    }

    public final Object m() {
        AtomicLongFieldUpdater i = i();
        while (true) {
            long j = i.get(this);
            if ((1152921504606846976L & j) != 0) {
                return h;
            }
            int i2 = (int) (1073741823 & j);
            int i3 = this.c;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i3) == (i3 & i2)) {
                return null;
            }
            Object obj = f().get(this.c & i2);
            if (obj == null) {
                if (this.b) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i4 = (i2 + 1) & 1073741823;
                if (i().compareAndSet(this, j, e.b(j, i4))) {
                    f().set(this.c & i2, (Object) null);
                    return obj;
                }
                if (this.b) {
                    q qVar = this;
                    do {
                        qVar = qVar.n(i2, i4);
                    } while (qVar != null);
                    return obj;
                }
            }
        }
    }

    public final q n(int i, int i2) {
        long j;
        int i3;
        AtomicLongFieldUpdater i4 = i();
        do {
            j = i4.get(this);
            i3 = (int) (1073741823 & j);
            if ((1152921504606846976L & j) != 0) {
                return l();
            }
        } while (!i().compareAndSet(this, j, e.b(j, i2)));
        f().set(this.c & i3, (Object) null);
        return null;
    }
}
