package l0;

import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b extends d {

    public static final class a implements Qa.l {
        public final /* synthetic */ Qa.l a;
        public final /* synthetic */ Qa.l b;

        public a(Qa.l lVar, Qa.l lVar2) {
            this.a = lVar;
            this.b = lVar2;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke(p pVar) {
            long n;
            synchronized (v.O()) {
                n = v.n();
                v.A(v.n() + 1);
            }
            return new d(n, pVar, this.a, this.b);
        }
    }

    public static final class b implements Qa.l {
        public final /* synthetic */ Qa.l a;

        public b(Qa.l lVar) {
            this.a = lVar;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i invoke(p pVar) {
            long n;
            synchronized (v.O()) {
                n = v.n();
                v.A(v.n() + 1);
            }
            return new i(n, pVar, this.a);
        }
    }

    public b(long j, p pVar) {
        super(j, pVar, null, new l0.a());
    }

    public static /* synthetic */ Ca.I U(Object obj) {
        return V(obj);
    }

    public static final Ca.I V(Object obj) {
        synchronized (v.O()) {
            List l = v.l();
            int size = l.size();
            for (int i = 0; i < size; i++) {
                ((Qa.l) l.get(i)).invoke(obj);
            }
        }
        return Ca.I.a;
    }

    public m C() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }

    public d R(Qa.l lVar, Qa.l lVar2) {
        Qa.l lVar3;
        Map map;
        e0.e a2 = m0.b.a();
        if (a2 != null) {
            Ca.q e = m0.b.e(a2, null, false, lVar, lVar2);
            m0.a aVar = (m0.a) e.c();
            Qa.l a3 = aVar.a();
            Qa.l b2 = aVar.b();
            map = (Map) e.d();
            lVar = a3;
            lVar3 = b2;
        } else {
            lVar3 = lVar2;
            map = null;
        }
        d dVar = (d) v.C(new a(lVar, lVar3));
        if (a2 != null) {
            m0.b.b(a2, null, dVar, map);
        }
        return dVar;
    }

    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public Void m(l lVar) {
        H.b();
        throw new Ca.i();
    }

    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public Void n(l lVar) {
        H.b();
        throw new Ca.i();
    }

    public void d() {
        synchronized (v.O()) {
            q();
            Ca.I i = Ca.I.a;
        }
    }

    public void o() {
        v.f();
    }

    public l x(Qa.l lVar) {
        Map map;
        e0.e a2 = m0.b.a();
        if (a2 != null) {
            Ca.q e = m0.b.e(a2, null, true, lVar, null);
            m0.a aVar = (m0.a) e.c();
            Qa.l a3 = aVar.a();
            aVar.b();
            map = (Map) e.d();
            lVar = a3;
        } else {
            map = null;
        }
        i iVar = (i) v.C(new b(lVar));
        if (a2 != null) {
            m0.b.b(a2, null, iVar, map);
        }
        return iVar;
    }
}
