package s0;

import v0.Z0;
import w.L;
import w.W;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class o implements Z0 {
    public L a;
    public Z0 b;

    public void a(y0.c cVar) {
        Z0 z0 = this.b;
        if (z0 != null) {
            z0.a(cVar);
        }
    }

    public y0.c b() {
        Z0 z0 = this.b;
        if (!(z0 != null)) {
            L0.a.b("GraphicsContext not provided");
        }
        y0.c b = z0.b();
        L l = this.a;
        if (l == null) {
            this.a = W.c(b);
        } else {
            l.k(b);
        }
        return b;
    }

    public final Z0 c() {
        return this.b;
    }

    public final void d() {
        L l = this.a;
        if (l != null) {
            Object[] objArr = l.a;
            int i = l.b;
            for (int i2 = 0; i2 < i; i2++) {
                a((y0.c) objArr[i2]);
            }
            l.n();
        }
    }

    public final void e(Z0 z0) {
        d();
        this.b = z0;
    }
}
