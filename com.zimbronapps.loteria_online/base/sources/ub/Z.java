package ub;

import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class z {
    public final Map a = y.a(16);

    public static final class a {
    }

    public final Object a(qb.e descriptor, a key) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        kotlin.jvm.internal.t.g(key, "key");
        Map map = (Map) this.a.get(descriptor);
        Object obj = map != null ? map.get(key) : null;
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public final Object b(qb.e descriptor, a key, Qa.a defaultValue) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        kotlin.jvm.internal.t.g(key, "key");
        kotlin.jvm.internal.t.g(defaultValue, "defaultValue");
        Object a2 = a(descriptor, key);
        if (a2 != null) {
            return a2;
        }
        Object invoke = defaultValue.invoke();
        c(descriptor, key, invoke);
        return invoke;
    }

    public final void c(qb.e descriptor, a key, Object value) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        kotlin.jvm.internal.t.g(key, "key");
        kotlin.jvm.internal.t.g(value, "value");
        Map map = this.a;
        Object obj = map.get(descriptor);
        if (obj == null) {
            obj = y.a(2);
            map.put(descriptor, obj);
        }
        ((Map) obj).put(key, value);
    }
}
