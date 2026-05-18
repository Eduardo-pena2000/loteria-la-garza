package I0;

import android.view.MotionEvent;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class g {
    public final w.x a;
    public final E b;
    public boolean c;

    public g(w.x xVar, E e) {
        this.a = xVar;
        this.b = e;
    }

    public final boolean a(long j) {
        Object obj;
        List b = this.b.b();
        int size = b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = b.get(i);
            if (B.d(((F) obj).d(), j)) {
                break;
            }
            i++;
        }
        F f = (F) obj;
        if (f != null) {
            return f.a();
        }
        return false;
    }

    public final w.x b() {
        return this.a;
    }

    public final MotionEvent c() {
        return this.b.a();
    }

    public final boolean d() {
        return this.c;
    }

    public final void e(boolean z) {
        this.c = z;
    }
}
