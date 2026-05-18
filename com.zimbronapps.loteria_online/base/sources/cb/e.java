package cb;

import Ca.s;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class E {
    public static final Object a(Object obj, Ga.e eVar) {
        if (!(obj instanceof C)) {
            return Ca.s.b(obj);
        }
        s.a aVar = Ca.s.b;
        return Ca.s.b(Ca.t.a(((C) obj).a));
    }

    public static final Object b(Object obj) {
        Throwable e = Ca.s.e(obj);
        return e == null ? obj : new C(e, false, 2, null);
    }

    public static final Object c(Object obj, n nVar) {
        Throwable e = Ca.s.e(obj);
        return e == null ? obj : new C(e, false, 2, null);
    }
}
