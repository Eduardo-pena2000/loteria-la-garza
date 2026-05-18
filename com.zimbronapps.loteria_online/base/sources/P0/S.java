package P0;

import android.content.res.Resources;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class s {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Y0.a.values().length];
            try {
                iArr[Y0.a.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Y0.a.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Y0.a.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.l {
        public static final b a = new b();

        public b() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Boolean invoke(O0.J r3) {
            /*
                r2 = this;
                W0.m r3 = r3.c()
                if (r3 == 0) goto L1a
                boolean r0 = r3.p()
                r1 = 1
                if (r0 != r1) goto L1a
                W0.y r0 = W0.y.a
                W0.C r0 = r0.g()
                boolean r3 = r3.e(r0)
                if (r3 == 0) goto L1a
                goto L1b
            L1a:
                r1 = 0
            L1b:
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: P0.s.b.invoke(O0.J):java.lang.Boolean");
        }
    }

    public static final class c extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ w.o a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(w.o oVar) {
            super(1);
            this.a = oVar;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(W0.t tVar) {
            return Boolean.valueOf(this.a.b(tVar.q()));
        }
    }

    public static final class d extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ Resources a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Resources resources) {
            super(1);
            this.a = resources;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(W0.t tVar) {
            return Boolean.valueOf(s.i(tVar, this.a));
        }
    }

    public static final /* synthetic */ boolean a(W0.a aVar, Object obj) {
        return l(aVar, obj);
    }

    public static final /* synthetic */ boolean b(W0.t tVar) {
        return n(tVar);
    }

    public static final /* synthetic */ boolean c(W0.t tVar) {
        return o(tVar);
    }

    public static final /* synthetic */ O0.J d(O0.J j, Qa.l lVar) {
        return p(j, lVar);
    }

    public static final /* synthetic */ boolean e(W0.t tVar) {
        return q(tVar);
    }

    public static final /* synthetic */ String f(W0.t tVar, Resources resources) {
        return r(tVar, resources);
    }

    public static final /* synthetic */ Z0.e g(W0.t tVar) {
        return s(tVar);
    }

    public static final /* synthetic */ boolean h(W0.t tVar) {
        return t(tVar);
    }

    public static final /* synthetic */ boolean i(W0.t tVar, Resources resources) {
        return u(tVar, resources);
    }

    public static final /* synthetic */ boolean j(W0.t tVar, W0.m mVar) {
        return v(tVar, mVar);
    }

    public static final /* synthetic */ void k(w.o oVar, w.D d2, w.D d3, Resources resources) {
        w(oVar, d2, d3, resources);
    }

    public static final boolean l(W0.a aVar, Object obj) {
        if (aVar == obj) {
            return true;
        }
        if (!(obj instanceof W0.a)) {
            return false;
        }
        W0.a aVar2 = (W0.a) obj;
        if (!kotlin.jvm.internal.t.c(aVar.b(), aVar2.b())) {
            return false;
        }
        if (aVar.a() != null || aVar2.a() == null) {
            return aVar.a() == null || aVar2.a() != null;
        }
        return false;
    }

    public static final String m(W0.t tVar, Resources resources) {
        Collection collection;
        CharSequence charSequence;
        W0.m p = tVar.b().p();
        W0.y yVar = W0.y.a;
        Collection collection2 = (Collection) W0.n.a(p, yVar.d());
        if ((collection2 == null || collection2.isEmpty()) && (((collection = (Collection) W0.n.a(p, yVar.J())) == null || collection.isEmpty()) && ((charSequence = (CharSequence) W0.n.a(p, yVar.g())) == null || charSequence.length() == 0))) {
            return resources.getString(o0.m.h);
        }
        return null;
    }

    public static final boolean n(W0.t tVar) {
        return !tVar.p().e(W0.y.a.f());
    }

    public static final boolean o(W0.t tVar) {
        W0.m y = tVar.y();
        W0.y yVar = W0.y.a;
        if (y.e(yVar.g()) && !kotlin.jvm.internal.t.c(W0.n.a(tVar.y(), yVar.i()), Boolean.TRUE)) {
            return true;
        }
        O0.J p = p(tVar.s(), b.a);
        if (p != null) {
            W0.m c2 = p.c();
            if (!(c2 != null ? kotlin.jvm.internal.t.c(W0.n.a(c2, yVar.i()), Boolean.TRUE) : false)) {
                return true;
            }
        }
        return false;
    }

    public static final O0.J p(O0.J j, Qa.l lVar) {
        for (O0.J z0 = j.z0(); z0 != null; z0 = z0.z0()) {
            if (((Boolean) lVar.invoke(z0)).booleanValue()) {
                return z0;
            }
        }
        return null;
    }

    public static final boolean q(W0.t tVar) {
        W0.m y = tVar.y();
        W0.y yVar = W0.y.a;
        Y0.a aVar = (Y0.a) W0.n.a(y, yVar.M());
        W0.h hVar = (W0.h) W0.n.a(tVar.y(), yVar.D());
        boolean z = aVar != null;
        if (((Boolean) W0.n.a(tVar.y(), yVar.F())) != null) {
            return hVar != null ? W0.h.m(hVar.p(), W0.h.b.h()) : false ? z : true;
        }
        return z;
    }

    public static final String r(W0.t tVar, Resources resources) {
        W0.m y = tVar.y();
        W0.y yVar = W0.y.a;
        Object a2 = W0.n.a(y, yVar.H());
        Y0.a aVar = (Y0.a) W0.n.a(tVar.y(), yVar.M());
        W0.h hVar = (W0.h) W0.n.a(tVar.y(), yVar.D());
        if (aVar != null) {
            int i = a.a[aVar.ordinal()];
            if (i == 1) {
                if ((hVar == null ? false : W0.h.m(hVar.p(), W0.h.b.g())) && a2 == null) {
                    a2 = resources.getString(o0.m.j);
                }
            } else if (i == 2) {
                if ((hVar == null ? false : W0.h.m(hVar.p(), W0.h.b.g())) && a2 == null) {
                    a2 = resources.getString(o0.m.i);
                }
            } else {
                if (i != 3) {
                    throw new Ca.o();
                }
                if (a2 == null) {
                    a2 = resources.getString(o0.m.e);
                }
            }
        }
        Boolean bool = (Boolean) W0.n.a(tVar.y(), yVar.F());
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (!(hVar == null ? false : W0.h.m(hVar.p(), W0.h.b.h())) && a2 == null) {
                a2 = booleanValue ? resources.getString(o0.m.g) : resources.getString(o0.m.f);
            }
        }
        W0.g gVar = (W0.g) W0.n.a(tVar.y(), yVar.C());
        if (gVar != null) {
            if (gVar != W0.g.d.a()) {
                if (a2 == null) {
                    Wa.e c2 = gVar.c();
                    float b2 = ((c2.e().floatValue() - c2.b().floatValue()) > 0.0f ? 1 : ((c2.e().floatValue() - c2.b().floatValue()) == 0.0f ? 0 : -1)) == 0 ? 0.0f : (gVar.b() - c2.b().floatValue()) / (c2.e().floatValue() - c2.b().floatValue());
                    if (b2 < 0.0f) {
                        b2 = 0.0f;
                    }
                    if (b2 > 1.0f) {
                        b2 = 1.0f;
                    }
                    if (!(b2 == 0.0f)) {
                        r5 = (b2 == 1.0f ? 1 : 0) != 0 ? 100 : Wa.n.m(Math.round(b2 * 100), 1, 99);
                    }
                    a2 = resources.getString(o0.m.m, new Object[]{Integer.valueOf(r5)});
                }
            } else if (a2 == null) {
                a2 = resources.getString(o0.m.d);
            }
        }
        if (tVar.y().e(yVar.g())) {
            a2 = m(tVar, resources);
        }
        return (String) a2;
    }

    public static final Z0.e s(W0.t tVar) {
        W0.m y = tVar.y();
        W0.y yVar = W0.y.a;
        Z0.e eVar = (Z0.e) W0.n.a(y, yVar.g());
        List list = (List) W0.n.a(tVar.y(), yVar.J());
        return eVar == null ? list != null ? (Z0.e) Da.D.h0(list) : null : eVar;
    }

    public static final boolean t(W0.t tVar) {
        return tVar.r().getLayoutDirection() == n1.t.b;
    }

    public static final boolean u(W0.t tVar, Resources resources) {
        List list = (List) W0.n.a(tVar.y(), W0.y.a.d());
        boolean z = ((list != null ? (String) Da.D.h0(list) : null) == null && s(tVar) == null && r(tVar, resources) == null && !q(tVar)) ? false : true;
        if (!W0.x.c(tVar)) {
            if (tVar.y().p()) {
                return true;
            }
            if (tVar.C() && z) {
                return true;
            }
        }
        return false;
    }

    public static final boolean v(W0.t tVar, W0.m mVar) {
        Iterator it = mVar.iterator();
        while (it.hasNext()) {
            if (!tVar.p().e((W0.C) ((Map.Entry) it.next()).getKey())) {
                return true;
            }
        }
        return false;
    }

    public static final void w(w.o oVar, w.D d2, w.D d3, Resources resources) {
        d2.i();
        d3.i();
        W0.v vVar = (W0.v) oVar.c(-1);
        W0.t b2 = vVar != null ? vVar.b() : null;
        kotlin.jvm.internal.t.d(b2);
        List f = W0.H.f(b2, new c(oVar), new d(resources), Da.u.e(b2));
        int p = Da.v.p(f);
        int i = 1;
        if (1 > p) {
            return;
        }
        while (true) {
            int q = ((W0.t) f.get(i - 1)).q();
            int q2 = ((W0.t) f.get(i)).q();
            d2.r(q, q2);
            d3.r(q2, q);
            if (i == p) {
                return;
            } else {
                i++;
            }
        }
    }
}
