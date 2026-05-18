package androidx.compose.foundation;

import A.U;
import C.y;
import C.z;
import Ca.I;
import E.l;
import E.m;
import Qa.p;
import Wa.n;
import b0.A0;
import b0.J1;
import b0.U1;
import b0.h2;
import k0.v;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.u;
import l0.l;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class f implements y {
    public static final c i = new c(null);
    public static final v j = k0.y.e(a.a, b.a);
    public final A0 a;
    public float e;
    public final A0 b = J1.a(0);
    public final m c = l.a();
    public A0 d = J1.a(Integer.MAX_VALUE);
    public final y f = z.a(new f());
    public final h2 g = U1.c(new e());
    public final h2 h = U1.c(new d());

    public static final class a extends u implements p {
        public static final a a = new a();

        public a() {
            super(2);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(k0.z zVar, f fVar) {
            return Integer.valueOf(fVar.m());
        }
    }

    public static final class b extends u implements Qa.l {
        public static final b a = new b();

        public b() {
            super(1);
        }

        public final f a(int i) {
            return new f(i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public static final class c {
        public /* synthetic */ c(k kVar) {
            this();
        }

        public final v a() {
            return f.h();
        }

        public c() {
        }
    }

    public static final class d extends u implements Qa.a {
        public d() {
            super(0);
        }

        public final Boolean invoke() {
            return Boolean.valueOf(f.this.m() > 0);
        }
    }

    public static final class e extends u implements Qa.a {
        public e() {
            super(0);
        }

        public final Boolean invoke() {
            return Boolean.valueOf(f.this.m() < f.this.l());
        }
    }

    public static final class f extends u implements Qa.l {
        public f() {
            super(1);
        }

        public final Float a(float f) {
            float m = f.this.m() + f + f.g(f.this);
            float l = n.l(m, 0.0f, f.this.l());
            boolean z = m == l;
            float m2 = l - f.this.m();
            int round = Math.round(m2);
            f fVar = f.this;
            f.j(fVar, fVar.m() + round);
            f.i(f.this, m2 - round);
            if (!z) {
                f = m2;
            }
            return Float.valueOf(f);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).floatValue());
        }
    }

    public f(int i2) {
        this.a = J1.a(i2);
    }

    public static final /* synthetic */ float g(f fVar) {
        return fVar.e;
    }

    public static final /* synthetic */ v h() {
        return j;
    }

    public static final /* synthetic */ void i(f fVar, float f2) {
        fVar.e = f2;
    }

    public static final /* synthetic */ void j(f fVar, int i2) {
        fVar.o(i2);
    }

    public boolean a() {
        return this.f.a();
    }

    public boolean b() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    public Object c(U u, p pVar, Ga.e eVar) {
        Object c2 = this.f.c(u, pVar, eVar);
        return c2 == Ha.c.f() ? c2 : I.a;
    }

    public boolean d() {
        return ((Boolean) this.g.getValue()).booleanValue();
    }

    public float e(float f2) {
        return this.f.e(f2);
    }

    public final m k() {
        return this.c;
    }

    public final int l() {
        return this.d.getIntValue();
    }

    public final int m() {
        return this.a.getIntValue();
    }

    public final void n(int i2) {
        this.d.j(i2);
        l.a aVar = l0.l.e;
        l0.l d2 = aVar.d();
        Qa.l g = d2 != null ? d2.g() : null;
        l0.l e2 = aVar.e(d2);
        try {
            if (m() > i2) {
                o(i2);
            }
            I i3 = I.a;
            aVar.l(d2, e2, g);
        } catch (Throwable th) {
            aVar.l(d2, e2, g);
            throw th;
        }
    }

    public final void o(int i2) {
        this.a.j(i2);
    }

    public final void p(int i2) {
        this.b.j(i2);
    }
}
