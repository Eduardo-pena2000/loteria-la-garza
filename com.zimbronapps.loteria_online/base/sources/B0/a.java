package b0;

import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class a implements d {
    public static final int d = 8;
    public final Object a;
    public final ArrayList b = g2.c(null, 1, null);
    public Object c;

    public a(Object obj) {
        this.a = obj;
        this.c = obj;
    }

    public Object a() {
        return this.c;
    }

    public final void clear() {
        g2.a(this.b);
        n(this.a);
        m();
    }

    public void h(Object obj) {
        g2.j(this.b, a());
        n(obj);
    }

    public void k() {
        n(g2.i(this.b));
    }

    public final Object l() {
        return this.a;
    }

    public abstract void m();

    public void n(Object obj) {
        this.c = obj;
    }
}
