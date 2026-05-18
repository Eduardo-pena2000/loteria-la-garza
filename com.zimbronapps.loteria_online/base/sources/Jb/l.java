package jb;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.O;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class l {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "lastScheduledTask$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(l.class, "producerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(l.class, "consumerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(l.class, "blockingTasksInBuffer$volatile");
    public final AtomicReferenceArray a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public static final /* synthetic */ AtomicIntegerFieldUpdater d() {
        return e;
    }

    public static final /* synthetic */ AtomicIntegerFieldUpdater f() {
        return d;
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater g() {
        return b;
    }

    public static final /* synthetic */ AtomicIntegerFieldUpdater h() {
        return c;
    }

    public final h a(h hVar, boolean z) {
        if (z) {
            return b(hVar);
        }
        h hVar2 = (h) g().getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return b(hVar2);
    }

    public final h b(h hVar) {
        if (e() == 127) {
            return hVar;
        }
        if (hVar.b) {
            d().incrementAndGet(this);
        }
        int i = h().get(this) & 127;
        while (this.a.get(i) != null) {
            Thread.yield();
        }
        this.a.lazySet(i, hVar);
        h().incrementAndGet(this);
        return null;
    }

    public final void c(h hVar) {
        if (hVar == null || !hVar.b) {
            return;
        }
        d().decrementAndGet(this);
    }

    public final int e() {
        return h().get(this) - f().get(this);
    }

    public final int i() {
        return g().get(this) != null ? e() + 1 : e();
    }

    public final void j(d dVar) {
        h hVar = (h) g().getAndSet(this, (Object) null);
        if (hVar != null) {
            dVar.a(hVar);
        }
        while (n(dVar)) {
        }
    }

    public final h k() {
        h hVar = (h) g().getAndSet(this, (Object) null);
        return hVar == null ? m() : hVar;
    }

    public final h l() {
        return o(true);
    }

    public final h m() {
        h hVar;
        while (true) {
            int i = f().get(this);
            if (i - h().get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (f().compareAndSet(this, i, i + 1) && (hVar = (h) this.a.getAndSet(i2, (Object) null)) != null) {
                c(hVar);
                return hVar;
            }
        }
    }

    public final boolean n(d dVar) {
        h m = m();
        if (m == null) {
            return false;
        }
        dVar.a(m);
        return true;
    }

    public final h o(boolean z) {
        h hVar;
        do {
            hVar = (h) g().get(this);
            if (hVar == null || hVar.b != z) {
                int i = f().get(this);
                int i2 = h().get(this);
                while (i != i2) {
                    if (z && d().get(this) == 0) {
                        return null;
                    }
                    i2--;
                    h q = q(i2, z);
                    if (q != null) {
                        return q;
                    }
                }
                return null;
            }
        } while (!s1.b.a(g(), this, hVar, (Object) null));
        return hVar;
    }

    public final h p(int i) {
        int i2 = f().get(this);
        int i3 = h().get(this);
        boolean z = i == 1;
        while (i2 != i3) {
            if (z && d().get(this) == 0) {
                return null;
            }
            int i4 = i2 + 1;
            h q = q(i2, z);
            if (q != null) {
                return q;
            }
            i2 = i4;
        }
        return null;
    }

    public final h q(int i, boolean z) {
        int i2 = i & 127;
        h hVar = (h) this.a.get(i2);
        if (hVar == null || hVar.b != z || !eb.l.a(this.a, i2, hVar, null)) {
            return null;
        }
        if (z) {
            d().decrementAndGet(this);
        }
        return hVar;
    }

    public final long r(int i, O o) {
        h m = i == 3 ? m() : p(i);
        if (m == null) {
            return s(i, o);
        }
        o.a = m;
        return -1L;
    }

    public final long s(int i, O o) {
        h hVar;
        do {
            hVar = (h) g().get(this);
            if (hVar == null) {
                return -2L;
            }
            if (((hVar.b ? 1 : 2) & i) == 0) {
                return -2L;
            }
            long a = j.f.a() - hVar.a;
            long j = j.b;
            if (a < j) {
                return j - a;
            }
        } while (!s1.b.a(g(), this, hVar, (Object) null));
        o.a = hVar;
        return -1L;
    }
}
