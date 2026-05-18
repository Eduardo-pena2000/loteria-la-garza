package y0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import n1.r;
import v0.j0;
import v0.k0;
import v0.r0;
import v0.s0;
import v0.u1;
import y0.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class f implements d {
    public static boolean H;
    public float A;
    public boolean B;
    public boolean C;
    public boolean D;
    public u1 E;
    public boolean F;
    public final long b;
    public final k0 c;
    public final x0.a d;
    public final RenderNode e;
    public long f;
    public Paint g;
    public Matrix h;
    public boolean i;
    public long j;
    public int k;
    public int l;
    public androidx.compose.ui.graphics.d m;
    public float n;
    public boolean o;
    public long p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public long v;
    public long w;
    public float x;
    public float y;
    public float z;
    public static final a G = new a(null);
    public static final AtomicBoolean I = new AtomicBoolean(true);

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public a() {
        }
    }

    public f(View view, long j, k0 k0Var, x0.a aVar) {
        this.b = j;
        this.c = k0Var;
        this.d = aVar;
        RenderNode create = RenderNode.create("Compose", view);
        this.e = create;
        r.a aVar2 = n1.r.b;
        this.f = aVar2.a();
        this.j = aVar2.a();
        if (I.getAndSet(false)) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            Y(create);
            T();
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
        }
        if (H) {
            throw new NoClassDefFoundError();
        }
        create.setClipToBounds(false);
        b.a aVar3 = b.a;
        S(aVar3.a());
        this.k = aVar3.a();
        this.l = androidx.compose.ui.graphics.c.b.B();
        this.n = 1.0f;
        this.p = u0.f.b.b();
        this.q = 1.0f;
        this.r = 1.0f;
        r0.a aVar4 = r0.b;
        this.v = aVar4.a();
        this.w = aVar4.a();
        this.A = 8.0f;
        this.F = true;
    }

    public long A() {
        return this.v;
    }

    public long B() {
        return this.w;
    }

    public float C() {
        return this.t;
    }

    public void D(u1 u1Var) {
        this.E = u1Var;
    }

    public float E() {
        return this.s;
    }

    public float F() {
        return this.x;
    }

    public void G(float f) {
        this.s = f;
        this.e.setTranslationX(f);
    }

    public float H() {
        return this.r;
    }

    public void I(n1.d dVar, n1.t tVar, c cVar, Qa.l lVar) {
        Canvas start = this.e.start(Math.max((int) (this.f >> 32), (int) (this.j >> 32)), Math.max((int) (this.f & 4294967295L), (int) (this.j & 4294967295L)));
        try {
            k0 k0Var = this.c;
            Canvas a2 = k0Var.a().a();
            k0Var.a().y(start);
            v0.D a3 = k0Var.a();
            x0.a aVar = this.d;
            long d = n1.s.d(this.f);
            n1.d density = aVar.m1().getDensity();
            n1.t layoutDirection = aVar.m1().getLayoutDirection();
            j0 f = aVar.m1().f();
            long e = aVar.m1().e();
            c h = aVar.m1().h();
            x0.d m1 = aVar.m1();
            m1.b(dVar);
            m1.a(tVar);
            m1.c(a3);
            m1.g(d);
            m1.i(cVar);
            a3.s();
            try {
                lVar.invoke(aVar);
                a3.k();
                x0.d m12 = aVar.m1();
                m12.b(density);
                m12.a(layoutDirection);
                m12.c(f);
                m12.g(e);
                m12.i(h);
                k0Var.a().y(a2);
                this.e.end(start);
                L(false);
            } catch (Throwable th) {
                a3.k();
                x0.d m13 = aVar.m1();
                m13.b(density);
                m13.a(layoutDirection);
                m13.c(f);
                m13.g(e);
                m13.i(h);
                throw th;
            }
        } catch (Throwable th2) {
            this.e.end(start);
            throw th2;
        }
    }

    public Matrix J() {
        Matrix matrix = this.h;
        if (matrix == null) {
            matrix = new Matrix();
            this.h = matrix;
        }
        this.e.getMatrix(matrix);
        return matrix;
    }

    public void L(boolean z) {
        this.F = z;
    }

    public void M(Outline outline, long j) {
        this.j = j;
        this.e.setOutline(outline);
        this.i = outline != null;
        R();
    }

    public void N(long j) {
        this.p = j;
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.o = true;
            this.e.setPivotX(((int) (this.f >> 32)) / 2.0f);
            this.e.setPivotY(((int) (4294967295L & this.f)) / 2.0f);
        } else {
            this.o = false;
            this.e.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.e.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    public void O(j0 j0Var) {
        DisplayListCanvas d = v0.E.d(j0Var);
        kotlin.jvm.internal.t.e(d, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        d.drawRenderNode(this.e);
    }

    public void P(int i) {
        this.k = i;
        X();
    }

    public float Q() {
        return this.u;
    }

    public final void R() {
        boolean z = false;
        boolean z2 = U() && !this.i;
        if (U() && this.i) {
            z = true;
        }
        if (z2 != this.C) {
            this.C = z2;
            this.e.setClipToBounds(z2);
        }
        if (z != this.D) {
            this.D = z;
            this.e.setClipToOutline(z);
        }
    }

    public final void S(int i) {
        RenderNode renderNode = this.e;
        b.a aVar = b.a;
        if (b.e(i, aVar.c())) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.g);
            renderNode.setHasOverlappingRendering(true);
        } else if (b.e(i, aVar.b())) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.g);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.g);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void T() {
        N.a.a(this.e);
    }

    public boolean U() {
        return this.B;
    }

    public final Paint V() {
        Paint paint = this.g;
        if (paint != null) {
            return paint;
        }
        Paint paint2 = new Paint();
        this.g = paint2;
        return paint2;
    }

    public final boolean W() {
        return (!b.e(q(), b.a.c()) && androidx.compose.ui.graphics.c.G(j(), androidx.compose.ui.graphics.c.b.B()) && g() == null) ? false : true;
    }

    public final void X() {
        if (W()) {
            S(b.a.c());
        } else {
            S(q());
        }
    }

    public final void Y(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT >= 28) {
            O o = O.a;
            o.c(renderNode, o.a(renderNode));
            o.d(renderNode, o.b(renderNode));
        }
    }

    public float a() {
        return this.n;
    }

    public void b(int i) {
        if (androidx.compose.ui.graphics.c.G(this.l, i)) {
            return;
        }
        this.l = i;
        V().setXfermode(new PorterDuffXfermode(androidx.compose.ui.graphics.a.b(i)));
        X();
    }

    public void c(androidx.compose.ui.graphics.d dVar) {
        this.m = dVar;
        if (dVar == null) {
            X();
            return;
        }
        S(b.a.c());
        RenderNode renderNode = this.e;
        Paint V = V();
        V.setColorFilter(v0.F.b(dVar));
        renderNode.setLayerPaint(V);
    }

    public void d(float f) {
        this.n = f;
        this.e.setAlpha(f);
    }

    public u1 e() {
        return this.E;
    }

    public void f(float f) {
        this.t = f;
        this.e.setTranslationY(f);
    }

    public androidx.compose.ui.graphics.d g() {
        return this.m;
    }

    public float h() {
        return this.y;
    }

    public float i() {
        return this.z;
    }

    public int j() {
        return this.l;
    }

    public void k(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.v = j;
            O.a.c(this.e, s0.k(j));
        }
    }

    public void l(float f) {
        this.q = f;
        this.e.setScaleX(f);
    }

    public float m() {
        return this.A;
    }

    public void n(boolean z) {
        this.B = z;
        R();
    }

    public void o(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.w = j;
            O.a.d(this.e, s0.k(j));
        }
    }

    public void p() {
        T();
    }

    public int q() {
        return this.k;
    }

    public void r(float f) {
        this.A = f;
        this.e.setCameraDistance(-f);
    }

    public void s(float f) {
        this.x = f;
        this.e.setRotationX(f);
    }

    public void t(float f) {
        this.y = f;
        this.e.setRotationY(f);
    }

    public float u() {
        return this.q;
    }

    public void v(float f) {
        this.u = f;
        this.e.setElevation(f);
    }

    public void w(float f) {
        this.z = f;
        this.e.setRotation(f);
    }

    public void x(int i, int i2, long j) {
        int i3 = (int) (j >> 32);
        int i4 = (int) (4294967295L & j);
        this.e.setLeftTopRightBottom(i, i2, i + i3, i2 + i4);
        if (n1.r.e(this.f, j)) {
            return;
        }
        if (this.o) {
            this.e.setPivotX(i3 / 2.0f);
            this.e.setPivotY(i4 / 2.0f);
        }
        this.f = j;
    }

    public void y(float f) {
        this.r = f;
        this.e.setScaleY(f);
    }

    public boolean z() {
        return this.e.isValid();
    }

    public /* synthetic */ f(View view, long j, k0 k0Var, x0.a aVar, int i, kotlin.jvm.internal.k kVar) {
        this(view, j, (i & 4) != 0 ? new k0() : k0Var, (i & 8) != 0 ? new x0.a() : aVar);
    }
}
