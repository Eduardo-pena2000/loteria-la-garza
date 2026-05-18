package A;

import P0.O0;
import android.graphics.Canvas;
import android.widget.EdgeEffect;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class t extends O0 implements s0.j {
    public final b c;
    public final B d;
    public final Z e;

    public t(b bVar, B b, Z z, Qa.l lVar) {
        super(lVar);
        this.c = bVar;
        this.d = b;
        this.e = z;
    }

    public final boolean b(x0.f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        return j(180.0f, u0.g.a(-u0.l.i(fVar.e()), (-u0.l.g(fVar.e())) + fVar.j1(this.e.a().a())), edgeEffect, canvas);
    }

    public void draw(x0.c cVar) {
        this.c.r(cVar.e());
        if (u0.l.k(cVar.e())) {
            cVar.B1();
            return;
        }
        cVar.B1();
        this.c.j().getValue();
        Canvas d = v0.E.d(cVar.m1().f());
        B b = this.d;
        boolean f = b.r() ? f(cVar, b.h(), d) : false;
        if (b.y()) {
            f = i(cVar, b.l(), d) || f;
        }
        if (b.u()) {
            f = h(cVar, b.j(), d) || f;
        }
        if (b.o()) {
            f = b(cVar, b.f(), d) || f;
        }
        if (f) {
            this.c.k();
        }
    }

    public final boolean f(x0.f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        return j(270.0f, u0.g.a(-u0.l.g(fVar.e()), fVar.j1(this.e.a().b(fVar.getLayoutDirection()))), edgeEffect, canvas);
    }

    public final boolean h(x0.f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        return j(90.0f, u0.g.a(0.0f, (-Sa.c.d(u0.l.i(fVar.e()))) + fVar.j1(this.e.a().c(fVar.getLayoutDirection()))), edgeEffect, canvas);
    }

    public final boolean i(x0.f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        return j(0.0f, u0.g.a(0.0f, fVar.j1(this.e.a().d())), edgeEffect, canvas);
    }

    public final boolean j(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(f);
        canvas.translate(u0.f.m(j), u0.f.n(j));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }
}
