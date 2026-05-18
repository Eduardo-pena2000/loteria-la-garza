package o;

import T1.i0;
import T1.j0;
import T1.k0;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class h {
    public Interpolator c;
    public j0 d;
    public boolean e;
    public long b = -1;
    public final k0 f = new a();
    public final ArrayList a = new ArrayList();

    public class a extends k0 {
        public boolean a = false;
        public int b = 0;

        public a() {
        }

        public void b(View view) {
            int i = this.b + 1;
            this.b = i;
            if (i == h.this.a.size()) {
                j0 j0Var = h.this.d;
                if (j0Var != null) {
                    j0Var.b(null);
                }
                d();
            }
        }

        public void c(View view) {
            if (this.a) {
                return;
            }
            this.a = true;
            j0 j0Var = h.this.d;
            if (j0Var != null) {
                j0Var.c(null);
            }
        }

        public void d() {
            this.b = 0;
            this.a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.e) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((i0) it.next()).c();
            }
            this.e = false;
        }
    }

    public void b() {
        this.e = false;
    }

    public h c(i0 i0Var) {
        if (!this.e) {
            this.a.add(i0Var);
        }
        return this;
    }

    public h d(i0 i0Var, i0 i0Var2) {
        this.a.add(i0Var);
        i0Var2.j(i0Var.d());
        this.a.add(i0Var2);
        return this;
    }

    public h e(long j) {
        if (!this.e) {
            this.b = j;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.e) {
            this.c = interpolator;
        }
        return this;
    }

    public h g(j0 j0Var) {
        if (!this.e) {
            this.d = j0Var;
        }
        return this;
    }

    public void h() {
        if (this.e) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            i0 i0Var = (i0) it.next();
            long j = this.b;
            if (j >= 0) {
                i0Var.f(j);
            }
            Interpolator interpolator = this.c;
            if (interpolator != null) {
                i0Var.g(interpolator);
            }
            if (this.d != null) {
                i0Var.h(this.f);
            }
            i0Var.l();
        }
        this.e = true;
    }
}
