package j0;

import Ca.I;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class r {
    public final AtomicReference a = new AtomicReference(s.a());
    public final Object b = new Object();
    public Object c;

    public final Object a() {
        long a = w.a();
        return a == v.a() ? this.c : ((u) this.a.get()).b(a);
    }

    public final void b(Object obj) {
        long a = w.a();
        if (a == v.a()) {
            this.c = obj;
            return;
        }
        synchronized (this.b) {
            u uVar = (u) this.a.get();
            if (uVar.d(a, obj)) {
                return;
            }
            this.a.set(uVar.c(a, obj));
            I i = I.a;
        }
    }
}
