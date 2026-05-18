package f1;

import Z0.T0;
import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import v0.g1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class e {
    public final I0.h a;
    public final v b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public U j;
    public T0 k;
    public J l;
    public u0.h n;
    public u0.h o;
    public final Object c = new Object();
    public Qa.l m = b.a;
    public final CursorAnchorInfo.Builder p = new CursorAnchorInfo.Builder();
    public final float[] q = g1.c(null, 1, null);
    public final Matrix r = new Matrix();

    public e(I0.h hVar, v vVar) {
        this.a = hVar;
        this.b = vVar;
    }

    public final void a() {
        synchronized (this.c) {
            this.j = null;
            this.l = null;
            this.k = null;
            this.m = a.a;
            this.n = null;
            this.o = null;
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
            this.m.invoke(g1.a(this.q));
            this.a.n(this.q);
            v0.P.a(this.r, this.q);
            v vVar = this.b;
            CursorAnchorInfo.Builder builder = this.p;
            U u = this.j;
            kotlin.jvm.internal.t.d(u);
            J j = this.l;
            kotlin.jvm.internal.t.d(j);
            T0 t0 = this.k;
            kotlin.jvm.internal.t.d(t0);
            Matrix matrix = this.r;
            u0.h hVar = this.n;
            kotlin.jvm.internal.t.d(hVar);
            u0.h hVar2 = this.o;
            kotlin.jvm.internal.t.d(hVar2);
            vVar.e(d.b(builder, u, j, t0, matrix, hVar, hVar2, this.f, this.g, this.h, this.i));
            this.e = false;
        }
    }

    public final void d(U u, J j, T0 t0, Qa.l lVar, u0.h hVar, u0.h hVar2) {
        synchronized (this.c) {
            try {
                this.j = u;
                this.l = j;
                this.k = t0;
                this.m = lVar;
                this.n = hVar;
                this.o = hVar2;
                if (this.e || this.d) {
                    c();
                }
                Ca.I i = Ca.I.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final class a extends kotlin.jvm.internal.u implements Qa.l {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((g1) obj).p());
            return Ca.I.a;
        }

        public final void a(float[] fArr) {
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.l {
        public static final b a = new b();

        public b() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((g1) obj).p());
            return Ca.I.a;
        }

        public final void a(float[] fArr) {
        }
    }
}
