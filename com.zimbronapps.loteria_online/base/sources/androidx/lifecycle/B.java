package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b {
    public final AtomicReference a;

    public b(Object obj) {
        this.a = new AtomicReference(obj);
    }

    public final boolean a(Object obj, Object obj2) {
        return z.Y.a(this.a, obj, obj2);
    }

    public final Object b() {
        return this.a.get();
    }
}
