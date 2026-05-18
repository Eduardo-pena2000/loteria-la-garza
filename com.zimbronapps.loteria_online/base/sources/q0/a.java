package Q0;

import Da.D;
import Da.v;
import U1.v;
import W0.b;
import W0.m;
import W0.n;
import W0.t;
import W0.y;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.u;
import u0.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class a {

    public static final class a extends u implements Qa.a {
        public static final a a = new a();

        public a() {
            super(0);
        }

        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final boolean a(List list) {
        List list2;
        long u;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() <= 1) {
            list2 = v.n();
        } else {
            List arrayList = new ArrayList();
            Object obj = list.get(0);
            int p = v.p(list);
            int i = 0;
            while (i < p) {
                i++;
                Object obj2 = list.get(i);
                t tVar = (t) obj2;
                t tVar2 = (t) obj;
                arrayList.add(f.d(f.e((Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (tVar2.k().g() >> 32)) - Float.intBitsToFloat((int) (tVar.k().g() >> 32)))) << 32) | (Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (tVar2.k().g() & 4294967295L)) - Float.intBitsToFloat((int) (tVar.k().g() & 4294967295L)))) & 4294967295L))));
                obj = obj2;
            }
            list2 = arrayList;
        }
        if (list2.size() == 1) {
            u = ((f) D.f0(list2)).u();
        } else {
            if (list2.isEmpty()) {
                p1.a.f("Empty collection can't be reduced.");
            }
            Object f0 = D.f0(list2);
            int p2 = v.p(list2);
            if (1 <= p2) {
                int i2 = 1;
                while (true) {
                    f0 = f.d(f.q(((f) f0).u(), ((f) list2.get(i2)).u()));
                    if (i2 == p2) {
                        break;
                    }
                    i2++;
                }
            }
            u = ((f) f0).u();
        }
        return Float.intBitsToFloat((int) (4294967295L & u)) < Float.intBitsToFloat((int) (u >> 32));
    }

    public static final boolean b(t tVar) {
        m p = tVar.p();
        y yVar = y.a;
        return (n.a(p, yVar.a()) == null && n.a(tVar.p(), yVar.E()) == null) ? false : true;
    }

    public static final boolean c(b bVar) {
        return bVar.b() < 0 || bVar.a() < 0;
    }

    public static final void d(t tVar, U1.v vVar) {
        m p = tVar.p();
        y yVar = y.a;
        b bVar = (b) n.a(p, yVar.a());
        if (bVar != null) {
            vVar.i0(f(bVar));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (n.a(tVar.p(), yVar.E()) != null) {
            List v = tVar.v();
            int size = v.size();
            for (int i = 0; i < size; i++) {
                t tVar2 = (t) v.get(i);
                if (tVar2.p().e(y.a.F())) {
                    arrayList.add(tVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean a2 = a(arrayList);
        vVar.i0(v.e.a(a2 ? 1 : arrayList.size(), a2 ? arrayList.size() : 1, false, 0));
    }

    public static final void e(t tVar, U1.v vVar) {
        m p = tVar.p();
        y yVar = y.a;
        android.support.v4.media.session.b.a(n.a(p, yVar.b()));
        t t = tVar.t();
        if (t == null || n.a(t.p(), yVar.E()) == null) {
            return;
        }
        b bVar = (b) n.a(t.p(), yVar.a());
        if ((bVar == null || !c(bVar)) && tVar.p().e(yVar.F())) {
            ArrayList arrayList = new ArrayList();
            List v = t.v();
            int size = v.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                t tVar2 = (t) v.get(i2);
                if (tVar2.p().e(y.a.F())) {
                    arrayList.add(tVar2);
                    if (tVar2.s().A0() < tVar.s().A0()) {
                        i++;
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            boolean a2 = a(arrayList);
            v.f a3 = v.f.a(a2 ? 0 : i, 1, a2 ? i : 0, 1, false, ((Boolean) tVar.p().k(y.a.F(), a.a)).booleanValue());
            if (a3 != null) {
                vVar.j0(a3);
            }
        }
    }

    public static final v.e f(b bVar) {
        return v.e.a(bVar.b(), bVar.a(), false, 0);
    }
}
