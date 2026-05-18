package X;

import androidx.compose.ui.layout.q;
import b0.g1;
import b0.h2;
import v0.G1;
import z.S;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class L {
    public static final float a;
    public static final androidx.compose.ui.e b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final z.x f;
    public static final z.x g;
    public static final z.x h;
    public static final z.x i;
    public static final z.x j;

    public static final class a extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ long a;
        public final /* synthetic */ x0.k b;
        public final /* synthetic */ h2 c;
        public final /* synthetic */ h2 d;
        public final /* synthetic */ h2 e;
        public final /* synthetic */ h2 f;
        public final /* synthetic */ float g;
        public final /* synthetic */ long h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, x0.k kVar, h2 h2Var, h2 h2Var2, h2 h2Var3, h2 h2Var4, float f, long j2) {
            super(1);
            this.a = j;
            this.b = kVar;
            this.c = h2Var;
            this.d = h2Var2;
            this.e = h2Var3;
            this.f = h2Var4;
            this.g = f;
            this.h = j2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((x0.f) obj);
            return Ca.I.a;
        }

        public final void invoke(x0.f fVar) {
            L.b(fVar, this.a, this.b);
            L.c(fVar, ((Number) this.e.getValue()).floatValue() + (((((Number) this.c.getValue()).floatValue() * 216.0f) % 360.0f) - 90.0f) + ((Number) this.f.getValue()).floatValue(), this.g, Math.abs(((Number) this.d.getValue()).floatValue() - ((Number) this.e.getValue()).floatValue()), this.h, this.b);
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ androidx.compose.ui.e a;
        public final /* synthetic */ long b;
        public final /* synthetic */ float c;
        public final /* synthetic */ long d;
        public final /* synthetic */ int e;
        public final /* synthetic */ int f;
        public final /* synthetic */ int g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.compose.ui.e eVar, long j, float f, long j2, int i, int i2, int i3) {
            super(2);
            this.a = eVar;
            this.b = j;
            this.c = f;
            this.d = j2;
            this.e = i;
            this.f = i2;
            this.g = i3;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return Ca.I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            L.a(this.a, this.b, this.c, this.d, this.e, mVar, g1.a(this.f | 1), this.g);
        }
    }

    public static final class c extends kotlin.jvm.internal.u implements Qa.l {
        public static final c a = new c();

        public c() {
            super(1);
        }

        public final void a(S.b bVar) {
            bVar.d(1332);
            bVar.e(bVar.f(Float.valueOf(0.0f), 0), L.d());
            bVar.f(Float.valueOf(290.0f), 666);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((S.b) obj);
            return Ca.I.a;
        }
    }

    public static final class d extends kotlin.jvm.internal.u implements Qa.l {
        public static final d a = new d();

        public d() {
            super(1);
        }

        public final void a(S.b bVar) {
            bVar.d(1332);
            bVar.e(bVar.f(Float.valueOf(0.0f), 666), L.d());
            bVar.f(Float.valueOf(290.0f), bVar.b());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((S.b) obj);
            return Ca.I.a;
        }
    }

    public static final class e extends kotlin.jvm.internal.u implements Qa.q {
        public static final e a = new e();

        public static final class a extends kotlin.jvm.internal.u implements Qa.l {
            public final /* synthetic */ androidx.compose.ui.layout.q a;
            public final /* synthetic */ int b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(androidx.compose.ui.layout.q qVar, int i) {
                super(1);
                this.a = qVar;
                this.b = i;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((q.a) obj);
                return Ca.I.a;
            }

            public final void invoke(q.a aVar) {
                q.a.P(aVar, this.a, 0, -this.b, 0.0f, 4, null);
            }
        }

        public e() {
            super(3);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke-3p2s80s((androidx.compose.ui.layout.l) obj, (M0.A) obj2, ((n1.b) obj3).r());
        }

        public final M0.C invoke-3p2s80s(androidx.compose.ui.layout.l lVar, M0.A a2, long j) {
            int s0 = lVar.s0(L.e());
            int i = s0 * 2;
            androidx.compose.ui.layout.q C0 = a2.C0(n1.c.j(j, 0, i));
            return androidx.compose.ui.layout.l.O0(lVar, C0.W0(), C0.P0() - i, null, new a(C0, s0), 4, null);
        }
    }

    public static final class f extends kotlin.jvm.internal.u implements Qa.l {
        public static final f a = new f();

        public f() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((W0.D) obj);
            return Ca.I.a;
        }

        public final void invoke(W0.D d) {
        }
    }

    static {
        float g2 = n1.h.g(10);
        a = g2;
        b = androidx.compose.foundation.layout.f.k(W0.s.e(androidx.compose.ui.layout.i.a(androidx.compose.ui.e.a, e.a), true, f.a), 0.0f, g2, 1, null);
        c = n1.h.g(240);
        a0.k kVar = a0.k.a;
        d = kVar.e();
        e = n1.h.g(kVar.c() - n1.h.g(kVar.e() * 2));
        f = new z.x(0.2f, 0.0f, 0.8f, 1.0f);
        g = new z.x(0.4f, 0.0f, 1.0f, 1.0f);
        h = new z.x(0.0f, 0.0f, 0.65f, 1.0f);
        i = new z.x(0.1f, 0.0f, 0.45f, 1.0f);
        j = new z.x(0.4f, 0.0f, 0.2f, 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(androidx.compose.ui.e r36, long r37, float r39, long r40, int r42, b0.m r43, int r44, int r45) {
        /*
            Method dump skipped, instructions count: 793
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L.a(androidx.compose.ui.e, long, float, long, int, b0.m, int, int):void");
    }

    public static final /* synthetic */ void b(x0.f fVar, long j2, x0.k kVar) {
        g(fVar, j2, kVar);
    }

    public static final /* synthetic */ void c(x0.f fVar, float f2, float f3, float f4, long j2, x0.k kVar) {
        h(fVar, f2, f3, f4, j2, kVar);
    }

    public static final /* synthetic */ z.x d() {
        return j;
    }

    public static final /* synthetic */ float e() {
        return a;
    }

    public static final void f(x0.f fVar, float f2, float f3, long j2, x0.k kVar) {
        float f4 = 2;
        float f5 = kVar.f() / f4;
        float i2 = u0.l.i(fVar.e()) - (f4 * f5);
        x0.f.C1(fVar, j2, f2, f3, false, u0.g.a(f5, f5), u0.m.a(i2, i2), 0.0f, kVar, null, 0, 832, null);
    }

    public static final void g(x0.f fVar, long j2, x0.k kVar) {
        f(fVar, 0.0f, 360.0f, j2, kVar);
    }

    public static final void h(x0.f fVar, float f2, float f3, float f4, long j2, x0.k kVar) {
        f(fVar, f2 + (G1.e(kVar.b(), G1.a.a()) ? 0.0f : ((f3 / n1.h.g(e / 2)) * 57.29578f) / 2.0f), Math.max(f4, 0.1f), j2, kVar);
    }
}
