package Z0;

import Z0.e;
import d1.u;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class q implements y {
    public final e a;
    public final List b;
    public final Ca.l c;
    public final Ca.l d;
    public final List e;

    public q(e eVar, Y0 y0, List list, n1.d dVar, u.b bVar) {
        this.a = eVar;
        this.b = list;
        Ca.n nVar = Ca.n.c;
        this.c = Ca.m.a(nVar, new o(this));
        this.d = Ca.m.a(nVar, new p(this));
        B N = y0.N();
        List k = g.k(eVar, N);
        ArrayList arrayList = new ArrayList(k.size());
        int size = k.size();
        for (int i = 0; i < size; i++) {
            e.d dVar2 = (e.d) k.get(i);
            e d = g.d(eVar, dVar2.h(), dVar2.f());
            B f = f(this, (B) dVar2.g(), N);
            String j = d.j();
            Y0 J = y0.J(f);
            List b = d.b();
            if (b == null) {
                b = Da.v.n();
            }
            arrayList.add(new x(z.b(j, J, b, dVar, bVar, r.a(i(), dVar2.h(), dVar2.f())), dVar2.h(), dVar2.f()));
        }
        this.e = arrayList;
    }

    public static /* synthetic */ float d(q qVar) {
        return j(qVar);
    }

    public static /* synthetic */ float e(q qVar) {
        return k(qVar);
    }

    public static final /* synthetic */ B f(q qVar, B b, B b2) {
        return qVar.l(b, b2);
    }

    public static final float j(q qVar) {
        Object obj;
        y b;
        List list = qVar.e;
        if (list.isEmpty()) {
            obj = null;
        } else {
            Object obj2 = list.get(0);
            float a = ((x) obj2).b().a();
            int p = Da.v.p(list);
            int i = 1;
            if (1 <= p) {
                while (true) {
                    Object obj3 = list.get(i);
                    float a2 = ((x) obj3).b().a();
                    if (Float.compare(a, a2) < 0) {
                        obj2 = obj3;
                        a = a2;
                    }
                    if (i == p) {
                        break;
                    }
                    i++;
                }
            }
            obj = obj2;
        }
        x xVar = (x) obj;
        if (xVar == null || (b = xVar.b()) == null) {
            return 0.0f;
        }
        return b.a();
    }

    public static final float k(q qVar) {
        Object obj;
        y b;
        List list = qVar.e;
        if (list.isEmpty()) {
            obj = null;
        } else {
            Object obj2 = list.get(0);
            float b2 = ((x) obj2).b().b();
            int p = Da.v.p(list);
            int i = 1;
            if (1 <= p) {
                while (true) {
                    Object obj3 = list.get(i);
                    float b3 = ((x) obj3).b().b();
                    if (Float.compare(b2, b3) < 0) {
                        obj2 = obj3;
                        b2 = b3;
                    }
                    if (i == p) {
                        break;
                    }
                    i++;
                }
            }
            obj = obj2;
        }
        x xVar = (x) obj;
        if (xVar == null || (b = xVar.b()) == null) {
            return 0.0f;
        }
        return b.b();
    }

    public float a() {
        return ((Number) this.d.getValue()).floatValue();
    }

    public float b() {
        return ((Number) this.c.getValue()).floatValue();
    }

    public boolean c() {
        List list = this.e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((x) list.get(i)).b().c()) {
                return true;
            }
        }
        return false;
    }

    public final e g() {
        return this.a;
    }

    public final List h() {
        return this.e;
    }

    public final List i() {
        return this.b;
    }

    public final B l(B b, B b2) {
        return !l1.l.j(b.i(), l1.l.b.f()) ? b : B.b(b, 0, b2.i(), 0L, null, null, null, 0, 0, null, 509, null);
    }
}
