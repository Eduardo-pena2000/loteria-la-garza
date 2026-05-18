package cb;

import Ca.s;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class T {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(Ga.e eVar) {
        Object b;
        if (eVar instanceof hb.h) {
            return ((hb.h) eVar).toString();
        }
        try {
            s.a aVar = Ca.s.b;
            b = Ca.s.b(eVar + '@' + b(eVar));
        } catch (Throwable th) {
            s.a aVar2 = Ca.s.b;
            b = Ca.s.b(Ca.t.a(th));
        }
        if (Ca.s.e(b) != null) {
            b = eVar.getClass().getName() + '@' + b(eVar);
        }
        return (String) b;
    }
}
