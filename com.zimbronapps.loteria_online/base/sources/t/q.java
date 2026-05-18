package T;

import T.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface q {
    public static final a a = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final q b = new l();
        public static final q c = new m();
        public static final q d = new n();
        public static final q e = new o();
        public static final q f = new p();

        public static final class a implements c {
            public static final a a = new a();

            public final long a(j jVar, int i) {
                return N.C.c(jVar.c(), i);
            }
        }

        public static final class b implements c {
            public static final b a = new b();

            public final long a(j jVar, int i) {
                return jVar.k().C(i);
            }
        }

        public static /* synthetic */ k a(w wVar) {
            return j(wVar);
        }

        public static /* synthetic */ k b(w wVar) {
            return i(wVar);
        }

        public static /* synthetic */ k c(w wVar) {
            return g(wVar);
        }

        public static /* synthetic */ k d(w wVar) {
            return h(wVar);
        }

        public static /* synthetic */ k e(w wVar) {
            return f(wVar);
        }

        public static final k f(w wVar) {
            return r.h(b.a(wVar), wVar);
        }

        public static final k g(w wVar) {
            k.a c2;
            k.a c3;
            k.a e2;
            k.a aVar;
            k g = wVar.g();
            if (g == null) {
                return d.a(wVar);
            }
            if (wVar.a()) {
                c2 = g.e();
                c3 = r.c(wVar, wVar.i(), c2);
                aVar = g.c();
                e2 = c3;
            } else {
                c2 = g.c();
                c3 = r.c(wVar, wVar.h(), c2);
                e2 = g.e();
                aVar = c3;
            }
            if (kotlin.jvm.internal.t.c(c3, c2)) {
                return g;
            }
            return r.h(new k(e2, aVar, wVar.e() == e.CROSSED || (wVar.e() == e.COLLAPSED && e2.c() > aVar.c())), wVar);
        }

        public static final k h(w wVar) {
            return new k(wVar.i().a(wVar.i().g()), wVar.h().a(wVar.h().e()), wVar.e() == e.CROSSED);
        }

        public static final k i(w wVar) {
            return r.a(wVar, a.a);
        }

        public static final k j(w wVar) {
            return r.a(wVar, b.a);
        }

        public final q k() {
            return f;
        }

        public final q l() {
            return b;
        }

        public final q m() {
            return e;
        }

        public final q n() {
            return d;
        }
    }

    k a(w wVar);
}
