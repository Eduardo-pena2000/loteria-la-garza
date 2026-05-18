package hb;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class b {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public b(b bVar) {
        this._prev$volatile = bVar;
    }

    public static final /* synthetic */ Object a(b bVar) {
        return bVar.g();
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater i() {
        return a;
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater j() {
        return b;
    }

    public final void b() {
        j().set(this, (Object) null);
    }

    public final b c() {
        b h = h();
        while (h != null && h.k()) {
            h = (b) j().get(h);
        }
        return h;
    }

    public final b e() {
        b f = f();
        kotlin.jvm.internal.t.d(f);
        while (f.k()) {
            b f2 = f.f();
            if (f2 == null) {
                return f;
            }
            f = f2;
        }
        return f;
    }

    public final b f() {
        Object a2 = a(this);
        if (a2 == a.a()) {
            return null;
        }
        return (b) a2;
    }

    public final Object g() {
        return i().get(this);
    }

    public final b h() {
        return (b) j().get(this);
    }

    public abstract boolean k();

    public final boolean l() {
        return f() == null;
    }

    public final boolean m() {
        return s1.b.a(i(), this, (Object) null, a.a());
    }

    public final void n() {
        Object obj;
        if (l()) {
            return;
        }
        while (true) {
            b c = c();
            b e = e();
            AtomicReferenceFieldUpdater j = j();
            do {
                obj = j.get(e);
            } while (!s1.b.a(j, e, obj, ((b) obj) == null ? null : c));
            if (c != null) {
                i().set(c, e);
            }
            if (!e.k() || e.l()) {
                if (c == null || !c.k()) {
                    return;
                }
            }
        }
    }

    public final boolean o(b bVar) {
        return s1.b.a(i(), this, (Object) null, bVar);
    }
}
