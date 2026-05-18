package L7;

import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public interface d {
    default Object a(Class cls) {
        return f(E.b(cls));
    }

    l8.b b(E e);

    default Set c(E e) {
        return (Set) g(e).get();
    }

    default Set d(Class cls) {
        return c(E.b(cls));
    }

    default l8.b e(Class cls) {
        return b(E.b(cls));
    }

    default Object f(E e) {
        l8.b b = b(e);
        if (b == null) {
            return null;
        }
        return b.get();
    }

    l8.b g(E e);

    l8.a h(E e);

    default l8.a i(Class cls) {
        return h(E.b(cls));
    }
}
