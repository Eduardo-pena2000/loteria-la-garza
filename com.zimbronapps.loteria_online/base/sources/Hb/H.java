package hb;

import cb.T;
import cb.Y0;
import cb.b0;
import cb.k0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class h extends b0 implements Ia.e, Ga.e {
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final cb.K d;
    public final Ga.e e;
    public Object f;
    public final Object g;

    public h(cb.K k, Ga.e eVar) {
        super(-1);
        this.d = k;
        this.e = eVar;
        this.f = i.a();
        this.g = K.g(getContext());
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater n() {
        return h;
    }

    public Ia.e getCallerFrame() {
        Ga.e eVar = this.e;
        if (eVar instanceof Ia.e) {
            return (Ia.e) eVar;
        }
        return null;
    }

    public Ga.i getContext() {
        return this.e.getContext();
    }

    public Object h() {
        Object obj = this.f;
        this.f = i.a();
        return obj;
    }

    public final void i() {
        while (n().get(this) == i.b) {
        }
    }

    public final cb.p k() {
        AtomicReferenceFieldUpdater n = n();
        while (true) {
            Object obj = n.get(this);
            if (obj == null) {
                n().set(this, i.b);
                return null;
            }
            if (obj instanceof cb.p) {
                if (s1.b.a(n(), this, obj, i.b)) {
                    return (cb.p) obj;
                }
            } else if (obj != i.b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void l(Ga.i iVar, Object obj) {
        this.f = obj;
        this.c = 1;
        this.d.y(iVar, this);
    }

    public final cb.p m() {
        Object obj = n().get(this);
        if (obj instanceof cb.p) {
            return (cb.p) obj;
        }
        return null;
    }

    public final boolean o() {
        return n().get(this) != null;
    }

    public final boolean r(Throwable th) {
        AtomicReferenceFieldUpdater n = n();
        while (true) {
            Object obj = n.get(this);
            D d = i.b;
            if (kotlin.jvm.internal.t.c(obj, d)) {
                if (s1.b.a(n(), this, d, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (s1.b.a(n(), this, obj, (Object) null)) {
                    return false;
                }
            }
        }
    }

    public void resumeWith(Object obj) {
        Object b = cb.E.b(obj);
        if (this.d.z(getContext())) {
            this.f = b;
            this.c = 0;
            this.d.x(getContext(), this);
            return;
        }
        k0 b2 = Y0.a.b();
        if (b2.P()) {
            this.f = b;
            this.c = 0;
            b2.L(this);
            return;
        }
        b2.N(true);
        try {
            Ga.i context = getContext();
            Object i = K.i(context, this.g);
            try {
                this.e.resumeWith(obj);
                Ca.I i2 = Ca.I.a;
                while (b2.V()) {
                }
            } finally {
                K.f(context, i);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final void s() {
        i();
        cb.p m = m();
        if (m != null) {
            m.r();
        }
    }

    public final Throwable t(cb.n nVar) {
        D d;
        AtomicReferenceFieldUpdater n = n();
        do {
            Object obj = n.get(this);
            d = i.b;
            if (obj != d) {
                if (obj instanceof Throwable) {
                    if (s1.b.a(n(), this, obj, (Object) null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!s1.b.a(n(), this, d, nVar));
        return null;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.d + ", " + T.c(this.e) + ']';
    }

    public Ga.e c() {
        return this;
    }
}
