package e5;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import cb.B0;
import f5.c;
import j5.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class p {
    public final T4.d a;
    public final t b;
    public final j5.n c;

    public p(T4.d dVar, t tVar, j5.r rVar) {
        this.a = dVar;
        this.b = tVar;
        this.c = j5.f.a(rVar);
    }

    public final boolean a(m mVar) {
        return !j5.a.d(mVar.f()) || this.c.a();
    }

    public final f b(h hVar, Throwable th) {
        Drawable t;
        if (th instanceof k) {
            t = hVar.u();
            if (t == null) {
                t = hVar.t();
            }
        } else {
            t = hVar.t();
        }
        return new f(t, hVar, th);
    }

    public final boolean c(h hVar, Bitmap.Config config) {
        if (!j5.a.d(config)) {
            return true;
        }
        if (!hVar.h()) {
            return false;
        }
        hVar.M();
        return true;
    }

    public final boolean d(h hVar, f5.h hVar2) {
        if (j5.a.d(hVar.j())) {
            return c(hVar, hVar.j()) && this.c.b(hVar2);
        }
        return true;
    }

    public final boolean e(h hVar) {
        return hVar.O().isEmpty() || Da.r.O(j5.j.n(), hVar.j());
    }

    public final m f(h hVar, f5.h hVar2) {
        Bitmap.Config j = (e(hVar) && d(hVar, hVar2)) ? hVar.j() : Bitmap.Config.ARGB_8888;
        b D = this.b.b() ? hVar.D() : b.DISABLED;
        f5.c b = hVar2.b();
        c.b bVar = c.b.a;
        return new m(hVar.l(), j, hVar.k(), hVar2, (kotlin.jvm.internal.t.c(b, bVar) || kotlin.jvm.internal.t.c(hVar2.a(), bVar)) ? f5.g.b : hVar.J(), j5.i.a(hVar), hVar.i() && hVar.O().isEmpty() && j != Bitmap.Config.ALPHA_8, hVar.I(), hVar.r(), hVar.x(), hVar.L(), hVar.E(), hVar.C(), hVar.s(), D);
    }

    public final o g(h hVar, B0 b0) {
        androidx.lifecycle.k z = hVar.z();
        hVar.M();
        return new a(z, b0);
    }
}
