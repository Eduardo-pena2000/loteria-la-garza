package I0;

import android.os.Build;
import android.view.MotionEvent;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class q {
    public final List a;
    public final g b;
    public final int c;
    public final int d;
    public final int e;
    public int f;

    public q(List list, g gVar) {
        MotionEvent e;
        this.a = list;
        this.b = gVar;
        this.c = (Build.VERSION.SDK_INT < 29 || (e = e()) == null) ? 0 : p.a(e);
        MotionEvent e2 = e();
        this.d = o.a(e2 != null ? e2.getButtonState() : 0);
        MotionEvent e3 = e();
        this.e = P.b(e3 != null ? e3.getMetaState() : 0);
        this.f = a();
    }

    public final int a() {
        MotionEvent e = e();
        if (e != null) {
            int actionMasked = e.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                        }
                        return u.a.d();
                    }
                    return u.a.c();
                }
                return u.a.e();
            }
            return u.a.d();
        }
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C c = (C) list.get(i);
            if (r.d(c)) {
                return u.a.e();
            }
            if (r.b(c)) {
                return u.a.d();
            }
        }
        return u.a.c();
    }

    public final int b() {
        return this.d;
    }

    public final List c() {
        return this.a;
    }

    public final g d() {
        return this.b;
    }

    public final MotionEvent e() {
        g gVar = this.b;
        if (gVar != null) {
            return gVar.c();
        }
        return null;
    }

    public final int f() {
        return this.f;
    }

    public final void g(int i) {
        this.f = i;
    }

    public q(List list) {
        this(list, null);
    }
}
