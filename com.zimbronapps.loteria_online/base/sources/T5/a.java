package t5;

import A0.c;
import Ca.l;
import Ca.m;
import Ca.o;
import Wa.n;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.graphics.d;
import b0.C0;
import b0.T1;
import b0.U1;
import b0.v1;
import kotlin.jvm.internal.u;
import n1.t;
import v0.E;
import v0.F;
import v0.j0;
import x0.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class a extends c implements v1 {
    public final Drawable g;
    public final C0 h;
    public final C0 i;
    public final l j;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public static final class b extends u implements Qa.a {

        public static final class a implements Drawable.Callback {
            public final /* synthetic */ a a;

            public a(a aVar) {
                this.a = aVar;
            }

            public void invalidateDrawable(Drawable drawable) {
                kotlin.jvm.internal.t.g(drawable, "d");
                a aVar = this.a;
                a.o(aVar, a.n(aVar) + 1);
                a aVar2 = this.a;
                a.p(aVar2, t5.b.a(aVar2.s()));
            }

            public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
                kotlin.jvm.internal.t.g(drawable, "d");
                kotlin.jvm.internal.t.g(runnable, "what");
                t5.b.b().postAtTime(runnable, j);
            }

            public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                kotlin.jvm.internal.t.g(drawable, "d");
                kotlin.jvm.internal.t.g(runnable, "what");
                t5.b.b().removeCallbacks(runnable);
            }
        }

        public b() {
            super(0);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a invoke() {
            return new a(a.this);
        }
    }

    public a(Drawable drawable) {
        kotlin.jvm.internal.t.g(drawable, "drawable");
        this.g = drawable;
        this.h = U1.i(0, (T1) null, 2, (Object) null);
        this.i = U1.i(u0.l.c(t5.b.a(drawable)), (T1) null, 2, (Object) null);
        this.j = m.b(new b());
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    public static final /* synthetic */ int n(a aVar) {
        return aVar.r();
    }

    public static final /* synthetic */ void o(a aVar, int i) {
        aVar.u(i);
    }

    public static final /* synthetic */ void p(a aVar, long j) {
        aVar.v(j);
    }

    public boolean a(float f) {
        this.g.setAlpha(n.m(Sa.c.d(f * 255), 0, 255));
        return true;
    }

    public boolean b(d dVar) {
        this.g.setColorFilter(dVar != null ? F.b(dVar) : null);
        return true;
    }

    public void c() {
        this.g.setCallback(q());
        this.g.setVisible(true, true);
        Animatable animatable = this.g;
        if (animatable instanceof Animatable) {
            animatable.start();
        }
    }

    public boolean d(t tVar) {
        kotlin.jvm.internal.t.g(tVar, "layoutDirection");
        Drawable drawable = this.g;
        int i = a.a[tVar.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            throw new o();
        }
        return drawable.setLayoutDirection(i2);
    }

    public void e() {
        g();
    }

    public void g() {
        Animatable animatable = this.g;
        if (animatable instanceof Animatable) {
            animatable.stop();
        }
        this.g.setVisible(false, false);
        this.g.setCallback((Drawable.Callback) null);
    }

    public long k() {
        return t();
    }

    public void m(f fVar) {
        kotlin.jvm.internal.t.g(fVar, "<this>");
        j0 f = fVar.m1().f();
        r();
        this.g.setBounds(0, 0, Sa.c.d(u0.l.i(fVar.e())), Sa.c.d(u0.l.g(fVar.e())));
        try {
            f.s();
            this.g.draw(E.d(f));
        } finally {
            f.k();
        }
    }

    public final Drawable.Callback q() {
        return (Drawable.Callback) this.j.getValue();
    }

    public final int r() {
        return ((Number) this.h.getValue()).intValue();
    }

    public final Drawable s() {
        return this.g;
    }

    public final long t() {
        return ((u0.l) this.i.getValue()).m();
    }

    public final void u(int i) {
        this.h.setValue(Integer.valueOf(i));
    }

    public final void v(long j) {
        this.i.setValue(u0.l.c(j));
    }
}
