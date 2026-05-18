package A;

import P0.O0;
import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.widget.EdgeEffect;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class z extends O0 implements s0.j {
    public final b c;
    public final B d;
    public RenderNode e;

    public z(b bVar, B b, Qa.l lVar) {
        super(lVar);
        this.c = bVar;
        this.d = b;
    }

    public final boolean b(EdgeEffect edgeEffect, Canvas canvas) {
        return j(180.0f, edgeEffect, canvas);
    }

    public void draw(x0.c cVar) {
        boolean z;
        float f;
        float f2;
        this.c.r(cVar.e());
        if (u0.l.k(cVar.e())) {
            cVar.B1();
            return;
        }
        this.c.j().getValue();
        float j1 = cVar.j1(o.b());
        Canvas d = v0.E.d(cVar.m1().f());
        B b = this.d;
        boolean m = m();
        boolean l = l();
        if (m && l) {
            v.a(k(), 0, 0, d.getWidth(), d.getHeight());
        } else if (m) {
            v.a(k(), 0, 0, d.getWidth() + (Sa.c.d(j1) * 2), d.getHeight());
        } else {
            if (!l) {
                cVar.B1();
                return;
            }
            v.a(k(), 0, 0, d.getWidth(), d.getHeight() + (Sa.c.d(j1) * 2));
        }
        RecordingCanvas a = w.a(k());
        if (b.s()) {
            EdgeEffect i = b.i();
            h(i, a);
            i.finish();
        }
        if (b.r()) {
            EdgeEffect h = b.h();
            z = f(h, a);
            if (b.t()) {
                float n = u0.f.n(this.c.i());
                A a2 = A.a;
                a2.d(b.i(), a2.b(h), 1 - n);
            }
        } else {
            z = false;
        }
        if (b.z()) {
            EdgeEffect m2 = b.m();
            b(m2, a);
            m2.finish();
        }
        if (b.y()) {
            EdgeEffect l2 = b.l();
            z = i(l2, a) || z;
            if (b.A()) {
                float m3 = u0.f.m(this.c.i());
                A a3 = A.a;
                a3.d(b.m(), a3.b(l2), m3);
            }
        }
        if (b.v()) {
            EdgeEffect k = b.k();
            f(k, a);
            k.finish();
        }
        if (b.u()) {
            EdgeEffect j = b.j();
            z = h(j, a) || z;
            if (b.w()) {
                float n2 = u0.f.n(this.c.i());
                A a4 = A.a;
                a4.d(b.k(), a4.b(j), n2);
            }
        }
        if (b.p()) {
            EdgeEffect g = b.g();
            i(g, a);
            g.finish();
        }
        if (b.o()) {
            EdgeEffect f3 = b.f();
            boolean z2 = b(f3, a) || z;
            if (b.q()) {
                float m4 = u0.f.m(this.c.i());
                A a5 = A.a;
                a5.d(b.g(), a5.b(f3), 1 - m4);
            }
            z = z2;
        }
        if (z) {
            this.c.k();
        }
        float f4 = l ? 0.0f : j1;
        if (m) {
            j1 = 0.0f;
        }
        n1.t layoutDirection = cVar.getLayoutDirection();
        v0.j0 b2 = v0.E.b(a);
        long e = cVar.e();
        n1.d density = cVar.m1().getDensity();
        n1.t layoutDirection2 = cVar.m1().getLayoutDirection();
        v0.j0 f5 = cVar.m1().f();
        long e2 = cVar.m1().e();
        y0.c h2 = cVar.m1().h();
        x0.d m1 = cVar.m1();
        m1.b(cVar);
        m1.a(layoutDirection);
        m1.c(b2);
        m1.g(e);
        m1.i(null);
        b2.s();
        try {
            cVar.m1().d().d(f4, j1);
            try {
                cVar.B1();
                b2.k();
                x0.d m12 = cVar.m1();
                m12.b(density);
                m12.a(layoutDirection2);
                m12.c(f5);
                m12.g(e2);
                m12.i(h2);
                x.a(k());
                int save = d.save();
                d.translate(f, f2);
                y.a(d, k());
                d.restoreToCount(save);
            } finally {
                cVar.m1().d().d(-f4, -j1);
            }
        } catch (Throwable th) {
            b2.k();
            x0.d m13 = cVar.m1();
            m13.b(density);
            m13.a(layoutDirection2);
            m13.c(f5);
            m13.g(e2);
            m13.i(h2);
            throw th;
        }
    }

    public final boolean f(EdgeEffect edgeEffect, Canvas canvas) {
        return j(270.0f, edgeEffect, canvas);
    }

    public final boolean h(EdgeEffect edgeEffect, Canvas canvas) {
        return j(90.0f, edgeEffect, canvas);
    }

    public final boolean i(EdgeEffect edgeEffect, Canvas canvas) {
        return j(0.0f, edgeEffect, canvas);
    }

    public final boolean j(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int save = canvas.save();
        canvas.rotate(f);
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public final RenderNode k() {
        RenderNode renderNode = this.e;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode a = u.a("AndroidEdgeEffectOverscrollEffect");
        this.e = a;
        return a;
    }

    public final boolean l() {
        B b = this.d;
        return b.r() || b.s() || b.u() || b.v();
    }

    public final boolean m() {
        B b = this.d;
        return b.y() || b.z() || b.o() || b.p();
    }
}
