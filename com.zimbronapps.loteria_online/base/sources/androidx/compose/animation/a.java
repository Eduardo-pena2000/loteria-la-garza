package androidx.compose.animation;

import Ca.I;
import M0.A;
import M0.C;
import Qa.l;
import Qa.p;
import Qa.q;
import Qa.r;
import androidx.compose.animation.d;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.i;
import androidx.compose.ui.layout.q;
import b0.X;
import b0.Y;
import b0.b0;
import b0.g1;
import b0.m;
import b0.w;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import l0.E;
import w.P;
import y.B;
import y.k;
import z.I0;
import z.h0;
import z.j;
import z.o0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class a {

    public static final class a extends u implements l {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public final k invoke(androidx.compose.animation.c cVar) {
            return a.e(androidx.compose.animation.e.m(j.j(220, 90, null, 4, null), 0.0f, 2, null).c(androidx.compose.animation.e.q(j.j(220, 90, null, 4, null), 0.92f, 0L, 4, null)), androidx.compose.animation.e.o(j.j(90, 0, null, 6, null), 0.0f, 2, null));
        }
    }

    public static final class b extends u implements l {
        public static final b a = new b();

        public b() {
            super(1);
        }

        public final Object invoke(Object obj) {
            return obj;
        }
    }

    public static final class c extends u implements p {
        public final /* synthetic */ Object a;
        public final /* synthetic */ androidx.compose.ui.e b;
        public final /* synthetic */ l c;
        public final /* synthetic */ o0.e d;
        public final /* synthetic */ String e;
        public final /* synthetic */ l f;
        public final /* synthetic */ r g;
        public final /* synthetic */ int h;
        public final /* synthetic */ int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Object obj, androidx.compose.ui.e eVar, l lVar, o0.e eVar2, String str, l lVar2, r rVar, int i, int i2) {
            super(2);
            this.a = obj;
            this.b = eVar;
            this.c = lVar;
            this.d = eVar2;
            this.e = str;
            this.f = lVar2;
            this.g = rVar;
            this.h = i;
            this.i = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            a.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, mVar, g1.a(this.h | 1), this.i);
        }
    }

    public static final class d extends u implements l {
        public static final d a = new d();

        public d() {
            super(1);
        }

        public final k invoke(androidx.compose.animation.c cVar) {
            return a.e(androidx.compose.animation.e.m(j.j(220, 90, null, 4, null), 0.0f, 2, null).c(androidx.compose.animation.e.q(j.j(220, 90, null, 4, null), 0.92f, 0L, 4, null)), androidx.compose.animation.e.o(j.j(90, 0, null, 6, null), 0.0f, 2, null));
        }
    }

    public static final class e extends u implements l {
        public static final e a = new e();

        public e() {
            super(1);
        }

        public final Object invoke(Object obj) {
            return obj;
        }
    }

    public static final class f extends u implements p {
        public final /* synthetic */ o0 a;
        public final /* synthetic */ Object b;
        public final /* synthetic */ l c;
        public final /* synthetic */ androidx.compose.animation.d d;
        public final /* synthetic */ E e;
        public final /* synthetic */ r f;

        public static final class a extends u implements q {
            public final /* synthetic */ k a;

            public static final class a extends u implements l {
                public final /* synthetic */ androidx.compose.ui.layout.q a;
                public final /* synthetic */ k b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(androidx.compose.ui.layout.q qVar, k kVar) {
                    super(1);
                    this.a = qVar;
                    this.b = kVar;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((q.a) obj);
                    return I.a;
                }

                public final void invoke(q.a aVar) {
                    aVar.K(this.a, 0, 0, this.b.d());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k kVar) {
                super(3);
                this.a = kVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke-3p2s80s((androidx.compose.ui.layout.l) obj, (A) obj2, ((n1.b) obj3).r());
            }

            public final C invoke-3p2s80s(androidx.compose.ui.layout.l lVar, A a2, long j) {
                androidx.compose.ui.layout.q C0 = a2.C0(j);
                return androidx.compose.ui.layout.l.O0(lVar, C0.W0(), C0.P0(), null, new a(C0, this.a), 4, null);
            }
        }

        public static final class b extends u implements l {
            public final /* synthetic */ Object a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Object obj) {
                super(1);
                this.a = obj;
            }

            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(t.c(obj, this.a));
            }
        }

        public static final class c extends u implements p {
            public final /* synthetic */ androidx.compose.animation.g a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(androidx.compose.animation.g gVar) {
                super(2);
                this.a = gVar;
            }

            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(y.m mVar, y.m mVar2) {
                y.m mVar3 = y.m.PostExit;
                return Boolean.valueOf(mVar == mVar3 && mVar2 == mVar3 && !this.a.b().d());
            }
        }

        public static final class d extends u implements Qa.q {
            public final /* synthetic */ E a;
            public final /* synthetic */ Object b;
            public final /* synthetic */ androidx.compose.animation.d c;
            public final /* synthetic */ r d;

            public static final class a extends u implements l {
                public final /* synthetic */ E a;
                public final /* synthetic */ Object b;
                public final /* synthetic */ androidx.compose.animation.d c;

                public static final class a implements X {
                    public final /* synthetic */ E a;
                    public final /* synthetic */ Object b;
                    public final /* synthetic */ androidx.compose.animation.d c;

                    public a(E e, Object obj, androidx.compose.animation.d dVar) {
                        this.a = e;
                        this.b = obj;
                        this.c = dVar;
                    }

                    public void dispose() {
                        this.a.remove(this.b);
                        this.c.h().u(this.b);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(E e, Object obj, androidx.compose.animation.d dVar) {
                    super(1);
                    this.a = e;
                    this.b = obj;
                    this.c = dVar;
                }

                public final X invoke(Y y) {
                    return new a(this.a, this.b, this.c);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(E e, Object obj, androidx.compose.animation.d dVar, r rVar) {
                super(3);
                this.a = e;
                this.b = obj;
                this.c = dVar;
                this.d = rVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((y.f) obj, (m) obj2, ((Number) obj3).intValue());
                return I.a;
            }

            public final void invoke(y.f fVar, m mVar, int i) {
                if ((i & 6) == 0) {
                    i |= (i & 8) == 0 ? mVar.U(fVar) : mVar.E(fVar) ? 4 : 2;
                }
                if ((i & 19) == 18 && mVar.j()) {
                    mVar.M();
                    return;
                }
                if (w.L()) {
                    w.U(-616195562, i, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:793)");
                }
                boolean U = mVar.U(this.a) | mVar.E(this.b) | mVar.E(this.c);
                E e = this.a;
                Object obj = this.b;
                androidx.compose.animation.d dVar = this.c;
                Object C = mVar.C();
                if (U || C == m.a.a()) {
                    C = new a(e, obj, dVar);
                    mVar.t(C);
                }
                b0.a(fVar, (l) C, mVar, i & 14);
                P h = this.c.h();
                Object obj2 = this.b;
                t.e(fVar, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                h.x(obj2, ((y.g) fVar).a());
                Object C2 = mVar.C();
                if (C2 == m.a.a()) {
                    C2 = new y.c(fVar);
                    mVar.t(C2);
                }
                this.d.invoke((y.c) C2, this.b, mVar, 0);
                if (w.L()) {
                    w.T();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(o0 o0Var, Object obj, l lVar, androidx.compose.animation.d dVar, E e, r rVar) {
            super(2);
            this.a = o0Var;
            this.b = obj;
            this.c = lVar;
            this.d = dVar;
            this.e = e;
            this.f = rVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            if ((i & 3) == 2 && mVar.j()) {
                mVar.M();
                return;
            }
            if (w.L()) {
                w.U(885640742, i, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:757)");
            }
            l lVar = this.c;
            androidx.compose.animation.d dVar = this.d;
            Object C = mVar.C();
            m.a aVar = m.a;
            if (C == aVar.a()) {
                C = (k) lVar.invoke(dVar);
                mVar.t(C);
            }
            k kVar = (k) C;
            boolean a2 = mVar.a(t.c(this.a.m().a(), this.b));
            o0 o0Var = this.a;
            Object obj = this.b;
            l lVar2 = this.c;
            androidx.compose.animation.d dVar2 = this.d;
            Object C2 = mVar.C();
            if (a2 || C2 == aVar.a()) {
                C2 = t.c(o0Var.m().a(), obj) ? androidx.compose.animation.g.a.a() : ((k) lVar2.invoke(dVar2)).a();
                mVar.t(C2);
            }
            androidx.compose.animation.g gVar = (androidx.compose.animation.g) C2;
            Object obj2 = this.b;
            o0 o0Var2 = this.a;
            Object C3 = mVar.C();
            if (C3 == aVar.a()) {
                C3 = new d.a(t.c(obj2, o0Var2.o()));
                mVar.t(C3);
            }
            d.a aVar2 = (d.a) C3;
            androidx.compose.animation.f c2 = kVar.c();
            e.a aVar3 = androidx.compose.ui.e.a;
            boolean E = mVar.E(kVar);
            Object C4 = mVar.C();
            if (E || C4 == aVar.a()) {
                C4 = new a(kVar);
                mVar.t(C4);
            }
            androidx.compose.ui.e a3 = i.a(aVar3, (Qa.q) C4);
            aVar2.f(t.c(this.b, this.a.o()));
            androidx.compose.ui.e then = a3.then(aVar2);
            o0 o0Var3 = this.a;
            boolean E2 = mVar.E(this.b);
            Object obj3 = this.b;
            Object C5 = mVar.C();
            if (E2 || C5 == aVar.a()) {
                C5 = new b(obj3);
                mVar.t(C5);
            }
            l lVar3 = (l) C5;
            boolean U = mVar.U(gVar);
            Object C6 = mVar.C();
            if (U || C6 == aVar.a()) {
                C6 = new c(gVar);
                mVar.t(C6);
            }
            y.e.a(o0Var3, lVar3, then, c2, gVar, (p) C6, null, j0.i.d(-616195562, true, new d(this.e, this.b, this.d, this.f), mVar, 54), mVar, 12582912, 64);
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class g extends u implements p {
        public final /* synthetic */ o0 a;
        public final /* synthetic */ androidx.compose.ui.e b;
        public final /* synthetic */ l c;
        public final /* synthetic */ o0.e d;
        public final /* synthetic */ l e;
        public final /* synthetic */ r f;
        public final /* synthetic */ int g;
        public final /* synthetic */ int h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(o0 o0Var, androidx.compose.ui.e eVar, l lVar, o0.e eVar2, l lVar2, r rVar, int i, int i2) {
            super(2);
            this.a = o0Var;
            this.b = eVar;
            this.c = lVar;
            this.d = eVar2;
            this.e = lVar2;
            this.f = rVar;
            this.g = i;
            this.h = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            a.b(this.a, this.b, this.c, this.d, this.e, this.f, mVar, g1.a(this.g | 1), this.h);
        }
    }

    public static final class h extends u implements p {
        public static final h a = new h();

        public h() {
            super(2);
        }

        public final h0 a(long j, long j2) {
            return j.h(0.0f, 400.0f, n1.r.b(I0.d(n1.r.b)), 1, null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((n1.r) obj).j(), ((n1.r) obj2).j());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.lang.Object r18, androidx.compose.ui.e r19, Qa.l r20, o0.e r21, java.lang.String r22, Qa.l r23, Qa.r r24, b0.m r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.a.a(java.lang.Object, androidx.compose.ui.e, Qa.l, o0.e, java.lang.String, Qa.l, Qa.r, b0.m, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x023c A[LOOP:2: B:142:0x023a->B:143:0x023c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(z.o0 r20, androidx.compose.ui.e r21, Qa.l r22, o0.e r23, Qa.l r24, Qa.r r25, b0.m r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 942
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.a.b(z.o0, androidx.compose.ui.e, Qa.l, o0.e, Qa.l, Qa.r, b0.m, int, int):void");
    }

    public static final y.A c(boolean z, p pVar) {
        return new B(z, pVar);
    }

    public static /* synthetic */ y.A d(boolean z, p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            pVar = h.a;
        }
        return c(z, pVar);
    }

    public static final k e(androidx.compose.animation.f fVar, androidx.compose.animation.g gVar) {
        return new k(fVar, gVar, 0.0f, null, 12, null);
    }
}
