package Q;

import Z0.T0;
import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import v0.g1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class p0 {
    public final Qa.l a;
    public final l0 b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public f1.U j;
    public T0 k;
    public f1.J l;
    public u0.h m;
    public u0.h n;
    public final Object c = new Object();
    public final CursorAnchorInfo.Builder o = new CursorAnchorInfo.Builder();
    public final float[] p = g1.c(null, 1, null);
    public final Matrix q = new Matrix();

    public p0(Qa.l lVar, l0 l0Var) {
        this.a = lVar;
        this.b = l0Var;
    }

    public final void a() {
        synchronized (this.c) {
            this.j = null;
            this.l = null;
            this.k = null;
            this.m = null;
            this.n = null;
            Ca.I i = Ca.I.a;
        }
    }

    public final void b(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        synchronized (this.c) {
            try {
                this.f = z3;
                this.g = z4;
                this.h = z5;
                this.i = z6;
                if (z) {
                    this.e = true;
                    if (this.j != null) {
                        c();
                    }
                }
                this.d = z2;
                Ca.I i = Ca.I.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        if (this.b.isActive()) {
            g1.h(this.p);
            this.a.invoke(g1.a(this.p));
            float[] fArr = this.p;
            u0.h hVar = this.n;
            kotlin.jvm.internal.t.d(hVar);
            float f = -hVar.i();
            u0.h hVar2 = this.n;
            kotlin.jvm.internal.t.d(hVar2);
            g1.n(fArr, f, -hVar2.l(), 0.0f);
            v0.P.a(this.q, this.p);
            l0 l0Var = this.b;
            CursorAnchorInfo.Builder builder = this.o;
            f1.U u = this.j;
            kotlin.jvm.internal.t.d(u);
            f1.J j = this.l;
            kotlin.jvm.internal.t.d(j);
            T0 t0 = this.k;
            kotlin.jvm.internal.t.d(t0);
            Matrix matrix = this.q;
            u0.h hVar3 = this.m;
            kotlin.jvm.internal.t.d(hVar3);
            u0.h hVar4 = this.n;
            kotlin.jvm.internal.t.d(hVar4);
            l0Var.e(o0.b(builder, u, j, t0, matrix, hVar3, hVar4, this.f, this.g, this.h, this.i));
            this.e = false;
        }
    }

    public final void d(f1.U u, f1.J j, T0 t0, u0.h hVar, u0.h hVar2) {
        synchronized (this.c) {
            try {
                this.j = u;
                this.l = j;
                this.k = t0;
                this.m = hVar;
                this.n = hVar2;
                if (this.e || this.d) {
                    c();
                }
                Ca.I i = Ca.I.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
