package Yb;

import java.io.Serializable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class a implements Wb.c, Serializable {
    public abstract void A(Xb.b bVar, Wb.g gVar, String str, Object[] objArr, Throwable th);

    public final void B(Xb.b bVar, Wb.g gVar, String str, Throwable th) {
        A(bVar, gVar, str, null, th);
    }

    public final void C(Xb.b bVar, Wb.g gVar, String str, Object obj) {
        A(bVar, gVar, str, new Object[]{obj}, null);
    }

    public void b(String str, Object obj, Object obj2) {
        if (c()) {
            y(Xb.b.DEBUG, null, str, obj, obj2);
        }
    }

    public void d(String str, Object obj, Object obj2) {
        if (h()) {
            y(Xb.b.TRACE, null, str, obj, obj2);
        }
    }

    public void debug(String str) {
        if (c()) {
            B(Xb.b.DEBUG, null, str, null);
        }
    }

    public void e(String str, Object... objArr) {
        if (a()) {
            z(Xb.b.WARN, null, str, objArr);
        }
    }

    public void error(String str, Throwable th) {
        if (r()) {
            B(Xb.b.ERROR, null, str, th);
        }
    }

    public void g(String str, Object obj, Object obj2) {
        if (a()) {
            y(Xb.b.WARN, null, str, obj, obj2);
        }
    }

    public void i(String str, Object... objArr) {
        if (r()) {
            z(Xb.b.ERROR, null, str, objArr);
        }
    }

    public void info(String str) {
        if (f()) {
            B(Xb.b.INFO, null, str, null);
        }
    }

    public void j(String str, Object... objArr) {
        if (c()) {
            z(Xb.b.DEBUG, null, str, objArr);
        }
    }

    public void k(String str, Throwable th) {
        if (a()) {
            B(Xb.b.WARN, null, str, th);
        }
    }

    public void n(String str, Object obj, Object obj2) {
        if (f()) {
            y(Xb.b.INFO, null, str, obj, obj2);
        }
    }

    public void o(String str, Object obj) {
        if (f()) {
            C(Xb.b.INFO, null, str, obj);
        }
    }

    public void p(String str, Object obj) {
        if (a()) {
            C(Xb.b.WARN, null, str, obj);
        }
    }

    public void q(String str, Object obj) {
        if (h()) {
            C(Xb.b.TRACE, null, str, obj);
        }
    }

    public void s(String str, Object obj, Object obj2) {
        if (r()) {
            y(Xb.b.ERROR, null, str, obj, obj2);
        }
    }

    public void t(String str, Object obj) {
        if (c()) {
            C(Xb.b.DEBUG, null, str, obj);
        }
    }

    public void u(String str, Object obj) {
        if (r()) {
            C(Xb.b.ERROR, null, str, obj);
        }
    }

    public void v(String str, Throwable th) {
        if (c()) {
            B(Xb.b.DEBUG, null, str, th);
        }
    }

    public void w(String str) {
        if (a()) {
            B(Xb.b.WARN, null, str, null);
        }
    }

    public void x(String str) {
        if (h()) {
            B(Xb.b.TRACE, null, str, null);
        }
    }

    public final void y(Xb.b bVar, Wb.g gVar, String str, Object obj, Object obj2) {
        if (obj2 instanceof Throwable) {
            A(bVar, gVar, str, new Object[]{obj}, (Throwable) obj2);
        } else {
            A(bVar, gVar, str, new Object[]{obj, obj2}, null);
        }
    }

    public final void z(Xb.b bVar, Wb.g gVar, String str, Object[] objArr) {
        Throwable a = e.a(objArr);
        if (a != null) {
            A(bVar, gVar, str, e.b(objArr), a);
        } else {
            A(bVar, gVar, str, objArr, null);
        }
    }
}
