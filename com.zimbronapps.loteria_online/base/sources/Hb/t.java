package hb;

import cb.L0;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class t {
    public static final u a(Throwable th, String str) {
        if (th != null) {
            throw th;
        }
        d();
        throw new Ca.i();
    }

    public static /* synthetic */ u b(Throwable th, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return a(th, str);
    }

    public static final boolean c(L0 l0) {
        return l0.E() instanceof u;
    }

    public static final Void d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final L0 e(r rVar, List list) {
        try {
            return rVar.b(list);
        } catch (Throwable th) {
            return a(th, rVar.a());
        }
    }
}
