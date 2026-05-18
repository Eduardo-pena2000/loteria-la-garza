package A;

import A.f0;
import android.view.View;
import android.widget.Magnifier;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class g0 implements e0 {
    public static final g0 b = new g0();
    public static final boolean c = true;

    public static final class a extends f0.a {
        public a(Magnifier magnifier) {
            super(magnifier);
        }

        public void b(long j, long j2, float f) {
            if (!Float.isNaN(f)) {
                d().setZoom(f);
            }
            if (u0.g.b(j2)) {
                d().show(u0.f.m(j), u0.f.n(j), u0.f.m(j2), u0.f.n(j2));
            } else {
                d().show(u0.f.m(j), u0.f.n(j));
            }
        }
    }

    public boolean b() {
        return c;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public a a(View view, boolean z, long j, float f, float f2, boolean z2, n1.d dVar, float f3) {
        if (z) {
            return new a(new Magnifier(view));
        }
        long w1 = dVar.w1(j);
        float j1 = dVar.j1(f);
        float j12 = dVar.j1(f2);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (w1 != 9205357640488583168L) {
            builder.setSize(Sa.c.d(u0.l.i(w1)), Sa.c.d(u0.l.g(w1)));
        }
        if (!Float.isNaN(j1)) {
            builder.setCornerRadius(j1);
        }
        if (!Float.isNaN(j12)) {
            builder.setElevation(j12);
        }
        if (!Float.isNaN(f3)) {
            builder.setInitialZoom(f3);
        }
        builder.setClippingEnabled(z2);
        return new a(builder.build());
    }
}
