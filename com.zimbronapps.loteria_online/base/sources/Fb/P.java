package fb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract /* synthetic */ class p {
    public static final Qa.l a = new n();
    public static final Qa.p b = new o();

    public static /* synthetic */ boolean a(Object obj, Object obj2) {
        return c(obj, obj2);
    }

    public static /* synthetic */ Object b(Object obj) {
        return d(obj);
    }

    public static final boolean c(Object obj, Object obj2) {
        return kotlin.jvm.internal.t.c(obj, obj2);
    }

    public static final e e(e eVar) {
        return eVar instanceof N ? eVar : f(eVar, a, b);
    }

    public static final e f(e eVar, Qa.l lVar, Qa.p pVar) {
        if (eVar instanceof d) {
            d dVar = (d) eVar;
            if (dVar.b == lVar && dVar.c == pVar) {
                return eVar;
            }
        }
        return new d(eVar, lVar, pVar);
    }

    public static final Object d(Object obj) {
        return obj;
    }
}
