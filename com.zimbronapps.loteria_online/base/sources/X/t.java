package X;

import X.w;
import androidx.compose.ui.layout.q;
import b0.B1;
import b0.g1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class T {
    public static final float a = n1.h.g(16);

    public static final class a extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ Z.e a;
        public final /* synthetic */ F.e0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Z.e eVar, F.e0 e0Var) {
            super(1);
            this.a = eVar;
            this.b = e0Var;
        }

        public final void a(F.e0 e0Var) {
            this.a.f(F.g0.d(this.b, e0Var));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((F.e0) obj);
            return Ca.I.a;
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ int a;
        public final /* synthetic */ Qa.p b;
        public final /* synthetic */ Qa.q c;
        public final /* synthetic */ Qa.p d;
        public final /* synthetic */ Qa.p e;
        public final /* synthetic */ Z.e f;
        public final /* synthetic */ Qa.p g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, Qa.p pVar, Qa.q qVar, Qa.p pVar2, Qa.p pVar3, Z.e eVar, Qa.p pVar4) {
            super(2);
            this.a = i;
            this.b = pVar;
            this.c = qVar;
            this.d = pVar2;
            this.e = pVar3;
            this.f = eVar;
            this.g = pVar4;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return Ca.I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            if ((i & 3) == 2 && mVar.j()) {
                mVar.M();
                return;
            }
            if (b0.w.L()) {
                b0.w.U(-1979205334, i, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:105)");
            }
            T.c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, mVar, 0);
            if (b0.w.L()) {
                b0.w.T();
            }
        }
    }

    public static final class c extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ androidx.compose.ui.e a;
        public final /* synthetic */ Qa.p b;
        public final /* synthetic */ Qa.p c;
        public final /* synthetic */ Qa.p d;
        public final /* synthetic */ Qa.p e;
        public final /* synthetic */ int f;
        public final /* synthetic */ long g;
        public final /* synthetic */ long h;
        public final /* synthetic */ F.e0 i;
        public final /* synthetic */ Qa.q j;
        public final /* synthetic */ int k;
        public final /* synthetic */ int l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(androidx.compose.ui.e eVar, Qa.p pVar, Qa.p pVar2, Qa.p pVar3, Qa.p pVar4, int i, long j, long j2, F.e0 e0Var, Qa.q qVar, int i2, int i3) {
            super(2);
            this.a = eVar;
            this.b = pVar;
            this.c = pVar2;
            this.d = pVar3;
            this.e = pVar4;
            this.f = i;
            this.g = j;
            this.h = j2;
            this.i = e0Var;
            this.j = qVar;
            this.k = i2;
            this.l = i3;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return Ca.I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            T.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, mVar, g1.a(this.k | 1), this.l);
        }
    }

    public static final class d extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ Qa.p a;
        public final /* synthetic */ Qa.p b;
        public final /* synthetic */ Qa.p c;
        public final /* synthetic */ int d;
        public final /* synthetic */ F.e0 e;
        public final /* synthetic */ Qa.p f;
        public final /* synthetic */ Qa.q g;

        public static final class a extends kotlin.jvm.internal.u implements Qa.l {
            public final /* synthetic */ List a;
            public final /* synthetic */ List b;
            public final /* synthetic */ List c;
            public final /* synthetic */ List d;
            public final /* synthetic */ v e;
            public final /* synthetic */ int f;
            public final /* synthetic */ int g;
            public final /* synthetic */ F.e0 h;
            public final /* synthetic */ M0.S i;
            public final /* synthetic */ int j;
            public final /* synthetic */ int k;
            public final /* synthetic */ Integer l;
            public final /* synthetic */ List m;
            public final /* synthetic */ Integer n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List list, List list2, List list3, List list4, v vVar, int i, int i2, F.e0 e0Var, M0.S s, int i3, int i4, Integer num, List list5, Integer num2) {
                super(1);
                this.a = list;
                this.b = list2;
                this.c = list3;
                this.d = list4;
                this.e = vVar;
                this.f = i;
                this.g = i2;
                this.h = e0Var;
                this.i = s;
                this.j = i3;
                this.k = i4;
                this.l = num;
                this.m = list5;
                this.n = num2;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((q.a) obj);
                return Ca.I.a;
            }

            public final void invoke(q.a aVar) {
                List list = this.a;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    q.a.P(aVar, (androidx.compose.ui.layout.q) list.get(i), 0, 0, 0.0f, 4, null);
                }
                List list2 = this.b;
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    q.a.P(aVar, (androidx.compose.ui.layout.q) list2.get(i2), 0, 0, 0.0f, 4, null);
                }
                List list3 = this.c;
                int i3 = this.f;
                int i4 = this.g;
                F.e0 e0Var = this.h;
                M0.S s = this.i;
                int i5 = this.j;
                int i6 = this.k;
                int size3 = list3.size();
                for (int i7 = 0; i7 < size3; i7++) {
                    q.a.P(aVar, (androidx.compose.ui.layout.q) list3.get(i7), ((i3 - i4) / 2) + e0Var.b(s, s.getLayoutDirection()), i5 - i6, 0.0f, 4, null);
                }
                List list4 = this.d;
                int i8 = this.j;
                Integer num = this.l;
                int size4 = list4.size();
                for (int i9 = 0; i9 < size4; i9++) {
                    q.a.P(aVar, (androidx.compose.ui.layout.q) list4.get(i9), 0, i8 - (num != null ? num.intValue() : 0), 0.0f, 4, null);
                }
                v vVar = this.e;
                if (vVar != null) {
                    List list5 = this.m;
                    int i10 = this.j;
                    Integer num2 = this.n;
                    int size5 = list5.size();
                    for (int i11 = 0; i11 < size5; i11++) {
                        androidx.compose.ui.layout.q qVar = (androidx.compose.ui.layout.q) list5.get(i11);
                        int b = vVar.b();
                        kotlin.jvm.internal.t.d(num2);
                        q.a.P(aVar, qVar, b, i10 - num2.intValue(), 0.0f, 4, null);
                    }
                }
            }
        }

        public static final class b extends kotlin.jvm.internal.u implements Qa.p {
            public final /* synthetic */ F.e0 a;
            public final /* synthetic */ M0.S b;
            public final /* synthetic */ List c;
            public final /* synthetic */ int d;
            public final /* synthetic */ List e;
            public final /* synthetic */ Integer f;
            public final /* synthetic */ Qa.q g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(F.e0 e0Var, M0.S s, List list, int i, List list2, Integer num, Qa.q qVar) {
                super(2);
                this.a = e0Var;
                this.b = s;
                this.c = list;
                this.d = i;
                this.e = list2;
                this.f = num;
                this.g = qVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((b0.m) obj, ((Number) obj2).intValue());
                return Ca.I.a;
            }

            public final void invoke(b0.m mVar, int i) {
                Integer num;
                if ((i & 3) == 2 && mVar.j()) {
                    mVar.M();
                    return;
                }
                if (b0.w.L()) {
                    b0.w.U(-1213360416, i, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:238)");
                }
                F.L c = F.g0.c(this.a, this.b);
                this.g.invoke(androidx.compose.foundation.layout.f.d(androidx.compose.foundation.layout.f.g(c, this.b.getLayoutDirection()), this.c.isEmpty() ? c.d() : this.b.A(this.d), androidx.compose.foundation.layout.f.f(c, this.b.getLayoutDirection()), (this.e.isEmpty() || (num = this.f) == null) ? c.a() : this.b.A(num.intValue())), mVar, 0);
                if (b0.w.L()) {
                    b0.w.T();
                }
            }
        }

        public static final class c extends kotlin.jvm.internal.u implements Qa.p {
            public final /* synthetic */ Qa.p a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Qa.p pVar) {
                super(2);
                this.a = pVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((b0.m) obj, ((Number) obj2).intValue());
                return Ca.I.a;
            }

            public final void invoke(b0.m mVar, int i) {
                if ((i & 3) == 2 && mVar.j()) {
                    mVar.M();
                    return;
                }
                if (b0.w.L()) {
                    b0.w.U(-2146438447, i, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:209)");
                }
                this.a.invoke(mVar, 0);
                if (b0.w.L()) {
                    b0.w.T();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Qa.p pVar, Qa.p pVar2, Qa.p pVar3, int i, F.e0 e0Var, Qa.p pVar4, Qa.q qVar) {
            super(2);
            this.a = pVar;
            this.b = pVar2;
            this.c = pVar3;
            this.d = i;
            this.e = e0Var;
            this.f = pVar4;
            this.g = qVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke-0kLqBqw((M0.S) obj, ((n1.b) obj2).r());
        }

        public final M0.C invoke-0kLqBqw(M0.S s, long j) {
            Object obj;
            Object obj2;
            Object obj3;
            v vVar;
            Object obj4;
            Integer num;
            int a2;
            int c2;
            Object obj5;
            Object obj6;
            int i;
            int s0;
            int l = n1.b.l(j);
            int k = n1.b.k(j);
            long d = n1.b.d(j, 0, 0, 0, 0, 10, null);
            List Y = s.Y(U.a, this.a);
            ArrayList arrayList = new ArrayList(Y.size());
            int size = Y.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((M0.A) Y.get(i2)).C0(d));
            }
            if (arrayList.isEmpty()) {
                obj = null;
            } else {
                obj = arrayList.get(0);
                int P0 = ((androidx.compose.ui.layout.q) obj).P0();
                int p = Da.v.p(arrayList);
                if (1 <= p) {
                    int i3 = 1;
                    while (true) {
                        Object obj7 = arrayList.get(i3);
                        int P02 = ((androidx.compose.ui.layout.q) obj7).P0();
                        if (P0 < P02) {
                            obj = obj7;
                            P0 = P02;
                        }
                        if (i3 == p) {
                            break;
                        }
                        i3++;
                    }
                }
            }
            androidx.compose.ui.layout.q qVar = (androidx.compose.ui.layout.q) obj;
            int P03 = qVar != null ? qVar.P0() : 0;
            List Y2 = s.Y(U.c, this.b);
            F.e0 e0Var = this.e;
            ArrayList arrayList2 = new ArrayList(Y2.size());
            int size2 = Y2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                arrayList2.add(((M0.A) Y2.get(i4)).C0(n1.c.j(d, (-e0Var.b(s, s.getLayoutDirection())) - e0Var.a(s, s.getLayoutDirection()), -e0Var.c(s))));
            }
            if (arrayList2.isEmpty()) {
                obj2 = null;
            } else {
                obj2 = arrayList2.get(0);
                int P04 = ((androidx.compose.ui.layout.q) obj2).P0();
                int p2 = Da.v.p(arrayList2);
                if (1 <= p2) {
                    Object obj8 = obj2;
                    int i5 = P04;
                    int i6 = 1;
                    while (true) {
                        Object obj9 = arrayList2.get(i6);
                        int P05 = ((androidx.compose.ui.layout.q) obj9).P0();
                        if (i5 < P05) {
                            obj8 = obj9;
                            i5 = P05;
                        }
                        if (i6 == p2) {
                            break;
                        }
                        i6++;
                    }
                    obj2 = obj8;
                }
            }
            androidx.compose.ui.layout.q qVar2 = (androidx.compose.ui.layout.q) obj2;
            int P06 = qVar2 != null ? qVar2.P0() : 0;
            if (arrayList2.isEmpty()) {
                obj3 = null;
            } else {
                obj3 = arrayList2.get(0);
                int W0 = ((androidx.compose.ui.layout.q) obj3).W0();
                int p3 = Da.v.p(arrayList2);
                if (1 <= p3) {
                    Object obj10 = obj3;
                    int i7 = W0;
                    int i8 = 1;
                    while (true) {
                        Object obj11 = arrayList2.get(i8);
                        int W02 = ((androidx.compose.ui.layout.q) obj11).W0();
                        if (i7 < W02) {
                            obj10 = obj11;
                            i7 = W02;
                        }
                        if (i8 == p3) {
                            break;
                        }
                        i8++;
                    }
                    obj3 = obj10;
                }
            }
            androidx.compose.ui.layout.q qVar3 = (androidx.compose.ui.layout.q) obj3;
            int W03 = qVar3 != null ? qVar3.W0() : 0;
            List Y3 = s.Y(U.d, this.c);
            F.e0 e0Var2 = this.e;
            ArrayList arrayList3 = new ArrayList(Y3.size());
            int size3 = Y3.size();
            int i9 = 0;
            while (i9 < size3) {
                List list = Y3;
                int i10 = size3;
                F.e0 e0Var3 = e0Var2;
                androidx.compose.ui.layout.q C0 = ((M0.A) Y3.get(i9)).C0(n1.c.j(d, (-e0Var2.b(s, s.getLayoutDirection())) - e0Var2.a(s, s.getLayoutDirection()), -e0Var2.c(s)));
                if (C0.P0() == 0 || C0.W0() == 0) {
                    C0 = null;
                }
                if (C0 != null) {
                    arrayList3.add(C0);
                }
                i9++;
                e0Var2 = e0Var3;
                Y3 = list;
                size3 = i10;
            }
            if (arrayList3.isEmpty()) {
                vVar = null;
            } else {
                if (arrayList3.isEmpty()) {
                    obj5 = null;
                } else {
                    obj5 = arrayList3.get(0);
                    int W04 = ((androidx.compose.ui.layout.q) obj5).W0();
                    int p4 = Da.v.p(arrayList3);
                    if (1 <= p4) {
                        Object obj12 = obj5;
                        int i11 = W04;
                        int i12 = 1;
                        while (true) {
                            Object obj13 = arrayList3.get(i12);
                            int W05 = ((androidx.compose.ui.layout.q) obj13).W0();
                            if (i11 < W05) {
                                obj12 = obj13;
                                i11 = W05;
                            }
                            if (i12 == p4) {
                                break;
                            }
                            i12++;
                        }
                        obj5 = obj12;
                    }
                }
                kotlin.jvm.internal.t.d(obj5);
                int W06 = ((androidx.compose.ui.layout.q) obj5).W0();
                if (arrayList3.isEmpty()) {
                    obj6 = null;
                } else {
                    obj6 = arrayList3.get(0);
                    int P07 = ((androidx.compose.ui.layout.q) obj6).P0();
                    int p5 = Da.v.p(arrayList3);
                    if (1 <= p5) {
                        Object obj14 = obj6;
                        int i13 = P07;
                        int i14 = 1;
                        while (true) {
                            Object obj15 = arrayList3.get(i14);
                            Object obj16 = obj14;
                            int P08 = ((androidx.compose.ui.layout.q) obj15).P0();
                            if (i13 < P08) {
                                i13 = P08;
                                obj14 = obj15;
                            } else {
                                obj14 = obj16;
                            }
                            if (i14 == p5) {
                                break;
                            }
                            i14++;
                        }
                        obj6 = obj14;
                    }
                }
                kotlin.jvm.internal.t.d(obj6);
                int P09 = ((androidx.compose.ui.layout.q) obj6).P0();
                int i15 = this.d;
                w.a aVar = w.a;
                if (!w.e(i15, aVar.c())) {
                    if (!(w.e(i15, aVar.a()) ? true : w.e(i15, aVar.b()))) {
                        i = (l - W06) / 2;
                    } else if (s.getLayoutDirection() == n1.t.a) {
                        s0 = s.s0(T.d());
                        i = (l - s0) - W06;
                    } else {
                        i = s.s0(T.d());
                    }
                    vVar = new v(i, W06, P09);
                } else if (s.getLayoutDirection() == n1.t.a) {
                    i = s.s0(T.d());
                    vVar = new v(i, W06, P09);
                } else {
                    s0 = s.s0(T.d());
                    i = (l - s0) - W06;
                    vVar = new v(i, W06, P09);
                }
            }
            List Y4 = s.Y(U.e, j0.i.b(-2146438447, true, new c(this.f)));
            ArrayList arrayList4 = new ArrayList(Y4.size());
            int size4 = Y4.size();
            for (int i16 = 0; i16 < size4; i16++) {
                arrayList4.add(((M0.A) Y4.get(i16)).C0(d));
            }
            if (arrayList4.isEmpty()) {
                obj4 = null;
            } else {
                obj4 = arrayList4.get(0);
                int P010 = ((androidx.compose.ui.layout.q) obj4).P0();
                int p6 = Da.v.p(arrayList4);
                if (1 <= p6) {
                    int i17 = 1;
                    while (true) {
                        Object obj17 = arrayList4.get(i17);
                        int P011 = ((androidx.compose.ui.layout.q) obj17).P0();
                        if (P010 < P011) {
                            P010 = P011;
                            obj4 = obj17;
                        }
                        if (i17 == p6) {
                            break;
                        }
                        i17++;
                    }
                }
            }
            androidx.compose.ui.layout.q qVar4 = (androidx.compose.ui.layout.q) obj4;
            Integer valueOf = qVar4 != null ? Integer.valueOf(qVar4.P0()) : null;
            if (vVar != null) {
                int i18 = this.d;
                F.e0 e0Var4 = this.e;
                if (valueOf == null || w.e(i18, w.a.b())) {
                    a2 = vVar.a() + s.s0(T.d());
                    c2 = e0Var4.c(s);
                } else {
                    a2 = valueOf.intValue() + vVar.a();
                    c2 = s.s0(T.d());
                }
                num = Integer.valueOf(a2 + c2);
            } else {
                num = null;
            }
            int intValue = P06 != 0 ? P06 + (num != null ? num.intValue() : valueOf != null ? valueOf.intValue() : this.e.c(s)) : 0;
            int i19 = W03;
            List Y5 = s.Y(U.b, j0.i.b(-1213360416, true, new b(this.e, s, arrayList, P03, arrayList4, valueOf, this.g)));
            ArrayList arrayList5 = new ArrayList(Y5.size());
            int size5 = Y5.size();
            for (int i20 = 0; i20 < size5; i20++) {
                arrayList5.add(((M0.A) Y5.get(i20)).C0(d));
            }
            return androidx.compose.ui.layout.l.O0(s, l, k, null, new a(arrayList5, arrayList, arrayList2, arrayList4, vVar, l, i19, this.e, s, k, intValue, valueOf, arrayList3, num), 4, null);
        }
    }

    public static final class e extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ int a;
        public final /* synthetic */ Qa.p b;
        public final /* synthetic */ Qa.q c;
        public final /* synthetic */ Qa.p d;
        public final /* synthetic */ Qa.p e;
        public final /* synthetic */ F.e0 f;
        public final /* synthetic */ Qa.p g;
        public final /* synthetic */ int h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i, Qa.p pVar, Qa.q qVar, Qa.p pVar2, Qa.p pVar3, F.e0 e0Var, Qa.p pVar4, int i2) {
            super(2);
            this.a = i;
            this.b = pVar;
            this.c = qVar;
            this.d = pVar2;
            this.e = pVar3;
            this.f = e0Var;
            this.g = pVar4;
            this.h = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return Ca.I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            T.c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, mVar, g1.a(this.h | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x025e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(androidx.compose.ui.e r29, Qa.p r30, Qa.p r31, Qa.p r32, Qa.p r33, int r34, long r35, long r37, F.e0 r39, Qa.q r40, b0.m r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 738
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T.a(androidx.compose.ui.e, Qa.p, Qa.p, Qa.p, Qa.p, int, long, long, F.e0, Qa.q, b0.m, int, int):void");
    }

    public static final void b(int i, Qa.p pVar, Qa.q qVar, Qa.p pVar2, Qa.p pVar3, F.e0 e0Var, Qa.p pVar4, b0.m mVar, int i2) {
        int i3;
        int i4;
        b0.m i5 = mVar.i(-975511942);
        if ((i2 & 6) == 0) {
            i3 = (i5.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= i5.E(pVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= i5.E(qVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= i5.E(pVar2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= i5.E(pVar3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= i5.U(e0Var) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= i5.E(pVar4) ? 1048576 : 524288;
        }
        if ((i3 & 599187) == 599186 && i5.j()) {
            i5.M();
        } else {
            if (b0.w.L()) {
                b0.w.U(-975511942, i3, -1, "androidx.compose.material3.ScaffoldLayout (Scaffold.kt:138)");
            }
            boolean z = ((i3 & 112) == 32) | ((i3 & 7168) == 2048) | ((458752 & i3) == 131072) | ((57344 & i3) == 16384) | ((i3 & 14) == 4) | ((3670016 & i3) == 1048576) | ((i3 & 896) == 256);
            Object C = i5.C();
            if (z || C == b0.m.a.a()) {
                i4 = 1;
                C = new d(pVar, pVar2, pVar3, i, e0Var, pVar4, qVar);
                i5.t(C);
            } else {
                i4 = 1;
            }
            androidx.compose.ui.layout.y.a(null, (Qa.p) C, i5, 0, i4);
            if (b0.w.L()) {
                b0.w.T();
            }
        }
        B1 l = i5.l();
        if (l != null) {
            l.a(new e(i, pVar, qVar, pVar2, pVar3, e0Var, pVar4, i2));
        }
    }

    public static final /* synthetic */ void c(int i, Qa.p pVar, Qa.q qVar, Qa.p pVar2, Qa.p pVar3, F.e0 e0Var, Qa.p pVar4, b0.m mVar, int i2) {
        b(i, pVar, qVar, pVar2, pVar3, e0Var, pVar4, mVar, i2);
    }

    public static final /* synthetic */ float d() {
        return a;
    }
}
