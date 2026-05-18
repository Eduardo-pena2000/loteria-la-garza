package I;

import I.i;
import M0.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class j implements N0.j, M0.c {
    public static final b g = new b(null);
    public static final a h = new a();
    public final l b;
    public final i c;
    public final boolean d;
    public final n1.t e;
    public final C.q f;

    public static final class a implements c.a {
        public final boolean a;

        public boolean a() {
            return this.a;
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.k kVar) {
            this();
        }

        public b() {
        }
    }

    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[n1.t.values().length];
            try {
                iArr[n1.t.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n1.t.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public static final class d implements c.a {
        public final /* synthetic */ kotlin.jvm.internal.O b;
        public final /* synthetic */ int c;

        public d(kotlin.jvm.internal.O o, int i) {
            this.b = o;
            this.c = i;
        }

        public boolean a() {
            return j.f(j.this, (i.a) this.b.a, this.c);
        }
    }

    public j(l lVar, i iVar, boolean z, n1.t tVar, C.q qVar) {
        this.b = lVar;
        this.c = iVar;
        this.d = z;
        this.e = tVar;
        this.f = qVar;
    }

    public static final /* synthetic */ boolean f(j jVar, i.a aVar, int i) {
        return jVar.j(aVar, i);
    }

    public Object b(int i, Qa.l lVar) {
        if (this.b.c() <= 0 || !this.b.e()) {
            return lVar.invoke(h);
        }
        int g2 = k(i) ? this.b.g() : this.b.f();
        kotlin.jvm.internal.O o = new kotlin.jvm.internal.O();
        o.a = this.c.a(g2, g2);
        Object obj = null;
        while (obj == null && j((i.a) o.a, i)) {
            i.a h2 = h((i.a) o.a, i);
            this.c.e((i.a) o.a);
            o.a = h2;
            this.b.d();
            obj = lVar.invoke(new d(o, i));
        }
        this.c.e((i.a) o.a);
        this.b.d();
        return obj;
    }

    public N0.l getKey() {
        return M0.d.a();
    }

    public final i.a h(i.a aVar, int i) {
        int b2 = aVar.b();
        int a2 = aVar.a();
        if (k(i)) {
            a2++;
        } else {
            b2--;
        }
        return this.c.a(b2, a2);
    }

    public final boolean j(i.a aVar, int i) {
        if (l(i)) {
            return false;
        }
        if (k(i)) {
            if (aVar.a() >= this.b.c() - 1) {
                return false;
            }
        } else if (aVar.b() <= 0) {
            return false;
        }
        return true;
    }

    public final boolean k(int i) {
        c.b.a aVar = c.b.a;
        if (c.b.h(i, aVar.c())) {
            return false;
        }
        if (!c.b.h(i, aVar.b())) {
            if (c.b.h(i, aVar.a())) {
                return this.d;
            }
            if (c.b.h(i, aVar.d())) {
                if (this.d) {
                    return false;
                }
            } else if (c.b.h(i, aVar.e())) {
                int i2 = c.a[this.e.ordinal()];
                if (i2 == 1) {
                    return this.d;
                }
                if (i2 != 2) {
                    throw new Ca.o();
                }
                if (this.d) {
                    return false;
                }
            } else {
                if (!c.b.h(i, aVar.f())) {
                    k.a();
                    throw new Ca.i();
                }
                int i3 = c.a[this.e.ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        return this.d;
                    }
                    throw new Ca.o();
                }
                if (this.d) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean l(int i) {
        c.b.a aVar = c.b.a;
        if (!(c.b.h(i, aVar.a()) ? true : c.b.h(i, aVar.d()))) {
            if (!(c.b.h(i, aVar.e()) ? true : c.b.h(i, aVar.f()))) {
                if (!(c.b.h(i, aVar.c()) ? true : c.b.h(i, aVar.b()))) {
                    k.a();
                    throw new Ca.i();
                }
            } else if (this.f == C.q.Vertical) {
                return true;
            }
        } else if (this.f == C.q.Horizontal) {
            return true;
        }
        return false;
    }

    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public M0.c getValue() {
        return this;
    }
}
