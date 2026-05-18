package b0;

import Ga.i;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface t0 extends i.b {
    public static final b M8 = b.a;

    public static final class a {
        public static Object a(t0 t0Var, Object obj, Qa.p pVar) {
            return i.b.a.a(t0Var, obj, pVar);
        }

        public static i.b b(t0 t0Var, i.c cVar) {
            return i.b.a.b(t0Var, cVar);
        }

        public static Ga.i c(t0 t0Var, i.c cVar) {
            return i.b.a.c(t0Var, cVar);
        }

        public static Ga.i d(t0 t0Var, Ga.i iVar) {
            return i.b.a.d(t0Var, iVar);
        }
    }

    public static final class b implements i.c {
        public static final /* synthetic */ b a = new b();
    }

    default i.c getKey() {
        return M8;
    }

    Object k(Qa.l lVar, Ga.e eVar);
}
