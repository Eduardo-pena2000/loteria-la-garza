package fb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract /* synthetic */ class h {

    public static final class a implements e {
        public final /* synthetic */ Object a;

        public a(Object obj) {
            this.a = obj;
        }

        public Object collect(f fVar, Ga.e eVar) {
            Object emit = fVar.emit(this.a, eVar);
            return emit == Ha.c.f() ? emit : Ca.I.a;
        }
    }

    public static final e a(Qa.p pVar) {
        return new b(pVar, null, 0, null, 14, null);
    }

    public static final e b(Qa.p pVar) {
        return new c(pVar, null, 0, null, 14, null);
    }

    public static final e c(Qa.p pVar) {
        return new C(pVar);
    }

    public static final e d(Object obj) {
        return new a(obj);
    }
}
