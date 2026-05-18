package ub;

import Ca.s;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class j {
    public static final int a;

    static {
        Object b;
        try {
            s.a aVar = Ca.s.b;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            kotlin.jvm.internal.t.f(property, "getProperty(...)");
            b = Ca.s.b(Za.A.p(property));
        } catch (Throwable th) {
            s.a aVar2 = Ca.s.b;
            b = Ca.s.b(Ca.t.a(th));
        }
        if (Ca.s.g(b)) {
            b = null;
        }
        Integer num = (Integer) b;
        a = num != null ? num.intValue() : 2097152;
    }

    public static final /* synthetic */ int a() {
        return a;
    }
}
