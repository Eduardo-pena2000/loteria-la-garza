package P0;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class t1 {
    public final d0.c a = new d0.c(new Reference[16], 0);
    public final ReferenceQueue b = new ReferenceQueue();

    public final void a() {
        Reference poll;
        do {
            poll = this.b.poll();
            if (poll != null) {
                this.a.s(poll);
            }
        } while (poll != null);
    }

    public final Object b() {
        a();
        while (this.a.m() != 0) {
            Object obj = ((Reference) this.a.u(r0.m() - 1)).get();
            if (obj != null) {
                return obj;
            }
        }
        return null;
    }

    public final void c(Object obj) {
        a();
        this.a.b(new WeakReference(obj, this.b));
    }
}
