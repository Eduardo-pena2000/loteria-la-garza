package i1;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import b0.h2;
import l1.k;
import v0.A1;
import v0.C1;
import v0.Q;
import v0.h0;
import v0.k1;
import v0.l1;
import v0.r0;
import v0.s0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class i extends TextPaint {
    public k1 a;
    public l1.k b;
    public int c;
    public C1 d;
    public r0 e;
    public h0 f;
    public h2 g;
    public u0.l h;
    public x0.g i;

    public i(int i, float f) {
        super(i);
        ((TextPaint) this).density = f;
        this.b = l1.k.b.c();
        this.c = x0.f.a9.a();
        this.d = C1.d.a();
    }

    public static /* synthetic */ Shader a(h0 h0Var, long j) {
        return g(h0Var, j);
    }

    public static final Shader g(h0 h0Var, long j) {
        return ((A1) h0Var).createShader-uvyYCjk(j);
    }

    public final void b() {
        this.g = null;
        this.f = null;
        this.h = null;
        setShader((Shader) null);
    }

    public final int c() {
        return this.c;
    }

    public final k1 d() {
        k1 k1Var = this.a;
        if (k1Var != null) {
            return k1Var;
        }
        k1 b = Q.b(this);
        this.a = b;
        return b;
    }

    public final void e(int i) {
        if (androidx.compose.ui.graphics.c.G(i, this.c)) {
            return;
        }
        d().b(i);
        this.c = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(v0.h0 r5, long r6, float r8) {
        /*
            r4 = this;
            if (r5 != 0) goto L6
            r4.b()
            goto L6d
        L6:
            boolean r0 = r5 instanceof v0.F1
            if (r0 == 0) goto L18
            v0.F1 r5 = (v0.F1) r5
            long r5 = r5.a()
            long r5 = l1.m.c(r5, r8)
            r4.h(r5)
            goto L6d
        L18:
            boolean r0 = r5 instanceof v0.A1
            if (r0 == 0) goto L6e
            v0.h0 r0 = r4.f
            boolean r0 = kotlin.jvm.internal.t.c(r0, r5)
            r1 = 0
            if (r0 == 0) goto L35
            u0.l r0 = r4.h
            if (r0 != 0) goto L2b
            r0 = r1
            goto L33
        L2b:
            long r2 = r0.m()
            boolean r0 = u0.l.f(r2, r6)
        L33:
            if (r0 != 0) goto L54
        L35:
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 == 0) goto L3f
            r1 = 1
        L3f:
            if (r1 == 0) goto L54
            r4.f = r5
            u0.l r0 = u0.l.c(r6)
            r4.h = r0
            i1.h r0 = new i1.h
            r0.<init>(r5, r6)
            b0.h2 r5 = b0.U1.c(r0)
            r4.g = r5
        L54:
            v0.k1 r5 = r4.d()
            b0.h2 r6 = r4.g
            r7 = 0
            if (r6 == 0) goto L64
            java.lang.Object r6 = r6.getValue()
            android.graphics.Shader r6 = (android.graphics.Shader) r6
            goto L65
        L64:
            r6 = r7
        L65:
            r5.u(r6)
            r4.e = r7
            i1.j.a(r4, r8)
        L6d:
            return
        L6e:
            Ca.o r5 = new Ca.o
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.i.f(v0.h0, long, float):void");
    }

    public final void h(long j) {
        r0 r0Var = this.e;
        if (r0Var == null ? false : r0.s(r0Var.A(), j)) {
            return;
        }
        if (j != 16) {
            this.e = r0.m(j);
            setColor(s0.k(j));
            b();
        }
    }

    public final void i(x0.g gVar) {
        if (gVar == null || kotlin.jvm.internal.t.c(this.i, gVar)) {
            return;
        }
        this.i = gVar;
        if (kotlin.jvm.internal.t.c(gVar, x0.j.a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(gVar instanceof x0.k)) {
            throw new Ca.o();
        }
        d().z(l1.a.b());
        x0.k kVar = (x0.k) gVar;
        d().A(kVar.f());
        d().w(kVar.d());
        d().o(kVar.c());
        d().l(kVar.b());
        k1 d = d();
        kVar.e();
        d.y(null);
    }

    public final void j(C1 c1) {
        if (c1 == null || kotlin.jvm.internal.t.c(this.d, c1)) {
            return;
        }
        this.d = c1;
        if (kotlin.jvm.internal.t.c(c1, C1.d.a())) {
            clearShadowLayer();
        } else {
            setShadowLayer(j1.e.b(this.d.b()), Float.intBitsToFloat((int) (this.d.d() >> 32)), Float.intBitsToFloat((int) (this.d.d() & 4294967295L)), s0.k(this.d.c()));
        }
    }

    public final void k(l1.k kVar) {
        if (kVar == null || kotlin.jvm.internal.t.c(this.b, kVar)) {
            return;
        }
        this.b = kVar;
        k.a aVar = l1.k.b;
        setUnderlineText(kVar.d(aVar.d()));
        setStrikeThruText(this.b.d(aVar.b()));
    }
}
