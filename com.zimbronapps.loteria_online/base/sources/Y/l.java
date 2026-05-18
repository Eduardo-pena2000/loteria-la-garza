package y;

import Ca.I;
import O0.g;
import androidx.compose.ui.e;
import b0.g1;
import b0.h2;
import b0.m2;
import z.o0;
import z.p0;
import z.s0;
import z.u0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class l {

    public static final class a extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ Object a;
        public final /* synthetic */ androidx.compose.ui.e b;
        public final /* synthetic */ z.G c;
        public final /* synthetic */ String d;
        public final /* synthetic */ Qa.q e;
        public final /* synthetic */ int f;
        public final /* synthetic */ int g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, androidx.compose.ui.e eVar, z.G g, String str, Qa.q qVar, int i, int i2) {
            super(2);
            this.a = obj;
            this.b = eVar;
            this.c = g;
            this.d = str;
            this.e = qVar;
            this.f = i;
            this.g = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            l.a(this.a, this.b, this.c, this.d, this.e, mVar, g1.a(this.f | 1), this.g);
        }
    }

    public static final class c extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ o0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(o0 o0Var) {
            super(1);
            this.a = o0Var;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(!kotlin.jvm.internal.t.c(obj, this.a.o()));
        }
    }

    public static final class d extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ o0 a;
        public final /* synthetic */ z.G b;
        public final /* synthetic */ Object c;
        public final /* synthetic */ Qa.q d;

        public static final class a extends kotlin.jvm.internal.u implements Qa.l {
            public final /* synthetic */ h2 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(h2 h2Var) {
                super(1);
                this.a = h2Var;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((androidx.compose.ui.graphics.g) obj);
                return I.a;
            }

            public final void invoke(androidx.compose.ui.graphics.g gVar) {
                gVar.d(d.a(this.a));
            }
        }

        public static final class b extends kotlin.jvm.internal.u implements Qa.q {
            public final /* synthetic */ z.G a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(z.G g) {
                super(3);
                this.a = g;
            }

            public final z.G a(o0.b bVar, b0.m mVar, int i) {
                mVar.V(438406499);
                if (b0.w.L()) {
                    b0.w.U(438406499, i, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:128)");
                }
                z.G g = this.a;
                if (b0.w.L()) {
                    b0.w.T();
                }
                mVar.P();
                return g;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return a((o0.b) obj, (b0.m) obj2, ((Number) obj3).intValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(o0 o0Var, z.G g, Object obj, Qa.q qVar) {
            super(2);
            this.a = o0Var;
            this.b = g;
            this.c = obj;
            this.d = qVar;
        }

        public static final /* synthetic */ float a(h2 h2Var) {
            return b(h2Var);
        }

        public static final float b(h2 h2Var) {
            return ((Number) h2Var.getValue()).floatValue();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            if ((i & 3) == 2 && mVar.j()) {
                mVar.M();
                return;
            }
            if (b0.w.L()) {
                b0.w.U(-1426421288, i, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous> (Crossfade.kt:127)");
            }
            o0 o0Var = this.a;
            b bVar = new b(this.b);
            Object obj = this.c;
            s0 b2 = u0.b(kotlin.jvm.internal.m.a);
            Object h = o0Var.h();
            mVar.V(-438678252);
            if (b0.w.L()) {
                b0.w.U(-438678252, 0, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:129)");
            }
            float f = kotlin.jvm.internal.t.c(h, obj) ? 1.0f : 0.0f;
            if (b0.w.L()) {
                b0.w.T();
            }
            mVar.P();
            Float valueOf = Float.valueOf(f);
            Object o = o0Var.o();
            mVar.V(-438678252);
            if (b0.w.L()) {
                b0.w.U(-438678252, 0, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:129)");
            }
            float f2 = kotlin.jvm.internal.t.c(o, obj) ? 1.0f : 0.0f;
            if (b0.w.L()) {
                b0.w.T();
            }
            mVar.P();
            h2 c = p0.c(o0Var, valueOf, Float.valueOf(f2), (z.G) bVar.invoke(o0Var.m(), mVar, 0), b2, "FloatAnimation", mVar, 0);
            e.a aVar = androidx.compose.ui.e.a;
            boolean U = mVar.U(c);
            Object C = mVar.C();
            if (U || C == b0.m.a.a()) {
                C = new a(c);
                mVar.t(C);
            }
            androidx.compose.ui.e a2 = androidx.compose.ui.graphics.f.a(aVar, (Qa.l) C);
            Qa.q qVar = this.d;
            Object obj2 = this.c;
            M0.B h2 = F.f.h(o0.e.a.o(), false);
            int a3 = b0.h.a(mVar, 0);
            b0.I r = mVar.r();
            androidx.compose.ui.e f3 = androidx.compose.ui.c.f(mVar, a2);
            g.a aVar2 = O0.g.E8;
            Qa.a a4 = aVar2.a();
            if (mVar.k() == null) {
                b0.h.d();
            }
            mVar.I();
            if (mVar.f()) {
                mVar.p(a4);
            } else {
                mVar.s();
            }
            b0.m b3 = m2.b(mVar);
            m2.e(b3, h2, aVar2.e());
            m2.e(b3, r, aVar2.g());
            Qa.p b4 = aVar2.b();
            if (b3.f() || !kotlin.jvm.internal.t.c(b3.C(), Integer.valueOf(a3))) {
                b3.t(Integer.valueOf(a3));
                b3.J(Integer.valueOf(a3), b4);
            }
            m2.e(b3, f3, aVar2.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            qVar.invoke(obj2, mVar, 0);
            mVar.v();
            if (b0.w.L()) {
                b0.w.T();
            }
        }
    }

    public static final class e extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ o0 a;
        public final /* synthetic */ androidx.compose.ui.e b;
        public final /* synthetic */ z.G c;
        public final /* synthetic */ Qa.l d;
        public final /* synthetic */ Qa.q e;
        public final /* synthetic */ int f;
        public final /* synthetic */ int g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(o0 o0Var, androidx.compose.ui.e eVar, z.G g, Qa.l lVar, Qa.q qVar, int i, int i2) {
            super(2);
            this.a = o0Var;
            this.b = eVar;
            this.c = g;
            this.d = lVar;
            this.e = qVar;
            this.f = i;
            this.g = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            l.b(this.a, this.b, this.c, this.d, this.e, mVar, g1.a(this.f | 1), this.g);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.lang.Object r17, androidx.compose.ui.e r18, z.G r19, java.lang.String r20, Qa.q r21, b0.m r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y.l.a(java.lang.Object, androidx.compose.ui.e, z.G, java.lang.String, Qa.q, b0.m, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x020d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(z.o0 r17, androidx.compose.ui.e r18, z.G r19, Qa.l r20, Qa.q r21, b0.m r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 705
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y.l.b(z.o0, androidx.compose.ui.e, z.G, Qa.l, Qa.q, b0.m, int, int):void");
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.l {
        public static final b a = new b();

        public b() {
            super(1);
        }

        public final Object invoke(Object obj) {
            return obj;
        }
    }
}
