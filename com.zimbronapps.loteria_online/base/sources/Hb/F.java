package hb;

import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class f {
    public static final void a(Ga.i iVar, Throwable th) {
        Iterator it = e.a().iterator();
        while (it.hasNext()) {
            try {
                ((cb.L) it.next()).handleException(iVar, th);
            } catch (Throwable th2) {
                e.b(cb.M.b(th, th2));
            }
        }
        try {
            Ca.g.a(th, new g(iVar));
        } catch (Throwable unused) {
        }
        e.b(th);
    }
}
