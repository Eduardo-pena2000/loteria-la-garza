package F;

import T1.A0;
import T1.n0;
import android.os.Build;
import android.view.View;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class y extends n0.b implements Runnable, T1.H, View.OnAttachStateChangeListener {
    public final f0 c;
    public boolean d;
    public boolean e;
    public A0 f;

    public y(f0 f0Var) {
        super(!f0Var.c() ? 1 : 0);
        this.c = f0Var;
    }

    public A0 a(View view, A0 a0) {
        this.f = a0;
        this.c.l(a0);
        if (this.d) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.e) {
            this.c.k(a0);
            f0.j(this.c, a0, 0, 2, null);
        }
        return this.c.c() ? A0.b : a0;
    }

    public void c(n0 n0Var) {
        this.d = false;
        this.e = false;
        A0 a0 = this.f;
        if (n0Var.b() != 0 && a0 != null) {
            this.c.k(a0);
            this.c.l(a0);
            f0.j(this.c, a0, 0, 2, null);
        }
        this.f = null;
        super.c(n0Var);
    }

    public void d(n0 n0Var) {
        this.d = true;
        this.e = true;
        super.d(n0Var);
    }

    public A0 e(A0 a0, List list) {
        f0.j(this.c, a0, 0, 2, null);
        return this.c.c() ? A0.b : a0;
    }

    public n0.a f(n0 n0Var, n0.a aVar) {
        this.d = false;
        return super.f(n0Var, aVar);
    }

    public void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    public void run() {
        if (this.d) {
            this.d = false;
            this.e = false;
            A0 a0 = this.f;
            if (a0 != null) {
                this.c.k(a0);
                f0.j(this.c, a0, 0, 2, null);
                this.f = null;
            }
        }
    }

    public void onViewDetachedFromWindow(View view) {
    }
}
