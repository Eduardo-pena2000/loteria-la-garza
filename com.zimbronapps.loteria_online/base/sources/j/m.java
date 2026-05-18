package J;

import Ca.I;
import F.L;
import b0.g1;
import cb.O;
import cb.Q;
import o0.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class m {

    public static final class a extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ C a;
        public final /* synthetic */ androidx.compose.ui.e b;
        public final /* synthetic */ L c;
        public final /* synthetic */ g d;
        public final /* synthetic */ int e;
        public final /* synthetic */ float f;
        public final /* synthetic */ e.c g;
        public final /* synthetic */ C.C h;
        public final /* synthetic */ boolean i;
        public final /* synthetic */ boolean j;
        public final /* synthetic */ Qa.l k;
        public final /* synthetic */ H0.a l;
        public final /* synthetic */ D.k m;
        public final /* synthetic */ Qa.r n;
        public final /* synthetic */ int o;
        public final /* synthetic */ int p;
        public final /* synthetic */ int q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C c, androidx.compose.ui.e eVar, L l, g gVar, int i, float f, e.c cVar, C.C c2, boolean z, boolean z2, Qa.l lVar, H0.a aVar, D.k kVar, Qa.r rVar, int i2, int i3, int i4) {
            super(2);
            this.a = c;
            this.b = eVar;
            this.c = l;
            this.d = gVar;
            this.e = i;
            this.f = f;
            this.g = cVar;
            this.h = c2;
            this.i = z;
            this.j = z2;
            this.k = lVar;
            this.l = aVar;
            this.m = kVar;
            this.n = rVar;
            this.o = i2;
            this.p = i3;
            this.q = i4;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            m.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, mVar, g1.a(this.o | 1), g1.a(this.p), this.q);
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ C b;
        public final /* synthetic */ O c;

        public static final class a extends kotlin.jvm.internal.u implements Qa.a {
            public final /* synthetic */ C a;
            public final /* synthetic */ O b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C c, O o) {
                super(0);
                this.a = c;
                this.b = o;
            }

            public final Boolean invoke() {
                return Boolean.valueOf(m.b(this.a, this.b));
            }
        }

        public static final class b extends kotlin.jvm.internal.u implements Qa.a {
            public final /* synthetic */ C a;
            public final /* synthetic */ O b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C c, O o) {
                super(0);
                this.a = c;
                this.b = o;
            }

            public final Boolean invoke() {
                return Boolean.valueOf(m.c(this.a, this.b));
            }
        }

        public static final class c extends kotlin.jvm.internal.u implements Qa.a {
            public final /* synthetic */ C a;
            public final /* synthetic */ O b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(C c, O o) {
                super(0);
                this.a = c;
                this.b = o;
            }

            public final Boolean invoke() {
                return Boolean.valueOf(m.b(this.a, this.b));
            }
        }

        public static final class d extends kotlin.jvm.internal.u implements Qa.a {
            public final /* synthetic */ C a;
            public final /* synthetic */ O b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(C c, O o) {
                super(0);
                this.a = c;
                this.b = o;
            }

            public final Boolean invoke() {
                return Boolean.valueOf(m.c(this.a, this.b));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z, C c2, O o) {
            super(1);
            this.a = z;
            this.b = c2;
            this.c = o;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((W0.D) obj);
            return I.a;
        }

        public final void invoke(W0.D d2) {
            if (this.a) {
                W0.B.F(d2, null, new a(this.b, this.c), 1, null);
                W0.B.z(d2, null, new b(this.b, this.c), 1, null);
            } else {
                W0.B.B(d2, null, new c(this.b, this.c), 1, null);
                W0.B.D(d2, null, new d(this.b, this.c), 1, null);
            }
        }
    }

    public static final class c extends Ia.l implements Qa.p {
        public int a;
        public final /* synthetic */ C b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C c, Ga.e eVar) {
            super(2, eVar);
            this.b = c;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            return new c(this.b, eVar);
        }

        public final Object invoke(O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                Ca.t.b(obj);
                C c = this.b;
                this.a = 1;
                if (D.f(c, this) == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Ca.t.b(obj);
            }
            return I.a;
        }
    }

    public static final class d extends Ia.l implements Qa.p {
        public int a;
        public final /* synthetic */ C b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C c, Ga.e eVar) {
            super(2, eVar);
            this.b = c;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            return new d(this.b, eVar);
        }

        public final Object invoke(O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                Ca.t.b(obj);
                C c = this.b;
                this.a = 1;
                if (D.e(c, this) == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Ca.t.b(obj);
            }
            return I.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0249  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(J.C r35, androidx.compose.ui.e r36, F.L r37, J.g r38, int r39, float r40, o0.e.c r41, C.C r42, boolean r43, boolean r44, Qa.l r45, H0.a r46, D.k r47, Qa.r r48, b0.m r49, int r50, int r51, int r52) {
        /*
            Method dump skipped, instructions count: 952
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: J.m.a(J.C, androidx.compose.ui.e, F.L, J.g, int, float, o0.e$c, C.C, boolean, boolean, Qa.l, H0.a, D.k, Qa.r, b0.m, int, int, int):void");
    }

    public static final /* synthetic */ boolean b(C c2, O o) {
        return f(c2, o);
    }

    public static final /* synthetic */ boolean c(C c2, O o) {
        return g(c2, o);
    }

    public static final int d(D.k kVar, int i, int i2, int i3, int i4, int i5, int i6, float f, int i7) {
        return Sa.c.d(kVar.a(i, i2, i4, i5, i6, i7) - (f * (i2 + i3)));
    }

    public static final androidx.compose.ui.e e(androidx.compose.ui.e eVar, C c2, boolean z, O o, boolean z2) {
        return z2 ? eVar.then(W0.s.f(androidx.compose.ui.e.a, false, new b(z, c2, o), 1, null)) : eVar.then(androidx.compose.ui.e.a);
    }

    public static final boolean f(C c2, O o) {
        if (!c2.b()) {
            return false;
        }
        cb.i.d(o, (Ga.i) null, (Q) null, new c(c2, null), 3, (Object) null);
        return true;
    }

    public static final boolean g(C c2, O o) {
        if (!c2.d()) {
            return false;
        }
        cb.i.d(o, (Ga.i) null, (Q) null, new d(c2, null), 3, (Object) null);
        return true;
    }
}
