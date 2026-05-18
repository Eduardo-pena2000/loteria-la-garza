package X;

import androidx.compose.ui.layout.q;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class l0 implements M0.B {
    public final boolean a;
    public final float b;
    public final F.L c;

    public static final class a extends kotlin.jvm.internal.u implements Qa.p {
        public static final a a = new a();

        public a() {
            super(2);
        }

        public final Integer a(M0.l lVar, int i) {
            return Integer.valueOf(lVar.J(i));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((M0.l) obj, ((Number) obj2).intValue());
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.p {
        public static final b a = new b();

        public b() {
            super(2);
        }

        public final Integer a(M0.l lVar, int i) {
            return Integer.valueOf(lVar.B0(i));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((M0.l) obj, ((Number) obj2).intValue());
        }
    }

    public static final class c extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ androidx.compose.ui.layout.q a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ androidx.compose.ui.layout.q d;
        public final /* synthetic */ androidx.compose.ui.layout.q e;
        public final /* synthetic */ androidx.compose.ui.layout.q f;
        public final /* synthetic */ androidx.compose.ui.layout.q g;
        public final /* synthetic */ androidx.compose.ui.layout.q h;
        public final /* synthetic */ androidx.compose.ui.layout.q i;
        public final /* synthetic */ androidx.compose.ui.layout.q j;
        public final /* synthetic */ androidx.compose.ui.layout.q k;
        public final /* synthetic */ l0 l;
        public final /* synthetic */ int m;
        public final /* synthetic */ androidx.compose.ui.layout.l n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(androidx.compose.ui.layout.q qVar, int i, int i2, androidx.compose.ui.layout.q qVar2, androidx.compose.ui.layout.q qVar3, androidx.compose.ui.layout.q qVar4, androidx.compose.ui.layout.q qVar5, androidx.compose.ui.layout.q qVar6, androidx.compose.ui.layout.q qVar7, androidx.compose.ui.layout.q qVar8, androidx.compose.ui.layout.q qVar9, l0 l0Var, int i3, androidx.compose.ui.layout.l lVar) {
            super(1);
            this.a = qVar;
            this.b = i;
            this.c = i2;
            this.d = qVar2;
            this.e = qVar3;
            this.f = qVar4;
            this.g = qVar5;
            this.h = qVar6;
            this.i = qVar7;
            this.j = qVar8;
            this.k = qVar9;
            this.l = l0Var;
            this.m = i3;
            this.n = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((q.a) obj);
            return Ca.I.a;
        }

        public final void invoke(q.a aVar) {
            androidx.compose.ui.layout.q qVar = this.a;
            if (qVar == null) {
                k0.e(aVar, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, l0.c(this.l), this.n.getDensity(), l0.b(this.l));
                return;
            }
            int i = this.b;
            int i2 = this.c;
            androidx.compose.ui.layout.q qVar2 = this.d;
            androidx.compose.ui.layout.q qVar3 = this.e;
            androidx.compose.ui.layout.q qVar4 = this.f;
            androidx.compose.ui.layout.q qVar5 = this.g;
            androidx.compose.ui.layout.q qVar6 = this.h;
            androidx.compose.ui.layout.q qVar7 = this.i;
            androidx.compose.ui.layout.q qVar8 = this.j;
            androidx.compose.ui.layout.q qVar9 = this.k;
            boolean c = l0.c(this.l);
            int i3 = this.m;
            k0.d(aVar, i, i2, qVar2, qVar, qVar3, qVar4, qVar5, qVar6, qVar7, qVar8, qVar9, c, i3, this.a.P0() + i3, l0.a(this.l), this.n.getDensity());
        }
    }

    public static final class d extends kotlin.jvm.internal.u implements Qa.p {
        public static final d a = new d();

        public d() {
            super(2);
        }

        public final Integer a(M0.l lVar, int i) {
            return Integer.valueOf(lVar.q0(i));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((M0.l) obj, ((Number) obj2).intValue());
        }
    }

    public static final class e extends kotlin.jvm.internal.u implements Qa.p {
        public static final e a = new e();

        public e() {
            super(2);
        }

        public final Integer a(M0.l lVar, int i) {
            return Integer.valueOf(lVar.A0(i));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((M0.l) obj, ((Number) obj2).intValue());
        }
    }

    public l0(boolean z, float f, F.L l) {
        this.a = z;
        this.b = f;
        this.c = l;
    }

    public static final /* synthetic */ float a(l0 l0Var) {
        return l0Var.b;
    }

    public static final /* synthetic */ F.L b(l0 l0Var) {
        return l0Var.c;
    }

    public static final /* synthetic */ boolean c(l0 l0Var) {
        return l0Var.a;
    }

    private final int d(M0.m mVar, List list, int i, Qa.p pVar) {
        Object obj;
        int i2;
        int i3;
        Object obj2;
        int i4;
        Object obj3;
        Object obj4;
        int i5;
        Object obj5;
        int i6;
        Object obj6;
        Object obj7;
        int size = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i7);
            if (kotlin.jvm.internal.t.c(Z.j.l((M0.l) obj), "Leading")) {
                break;
            }
            i7++;
        }
        M0.l lVar = (M0.l) obj;
        if (lVar != null) {
            i2 = k0.f(i, lVar.B0(Integer.MAX_VALUE));
            i3 = ((Number) pVar.invoke(lVar, Integer.valueOf(i))).intValue();
        } else {
            i2 = i;
            i3 = 0;
        }
        int size2 = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i8);
            if (kotlin.jvm.internal.t.c(Z.j.l((M0.l) obj2), "Trailing")) {
                break;
            }
            i8++;
        }
        M0.l lVar2 = (M0.l) obj2;
        if (lVar2 != null) {
            i2 = k0.f(i2, lVar2.B0(Integer.MAX_VALUE));
            i4 = ((Number) pVar.invoke(lVar2, Integer.valueOf(i))).intValue();
        } else {
            i4 = 0;
        }
        int size3 = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i9);
            if (kotlin.jvm.internal.t.c(Z.j.l((M0.l) obj3), "Label")) {
                break;
            }
            i9++;
        }
        M0.l lVar3 = (M0.l) obj3;
        int intValue = lVar3 != null ? ((Number) pVar.invoke(lVar3, Integer.valueOf(i2))).intValue() : 0;
        int size4 = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i10);
            if (kotlin.jvm.internal.t.c(Z.j.l((M0.l) obj4), "Prefix")) {
                break;
            }
            i10++;
        }
        M0.l lVar4 = (M0.l) obj4;
        if (lVar4 != null) {
            int intValue2 = ((Number) pVar.invoke(lVar4, Integer.valueOf(i2))).intValue();
            i2 = k0.f(i2, lVar4.B0(Integer.MAX_VALUE));
            i5 = intValue2;
        } else {
            i5 = 0;
        }
        int size5 = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i11);
            if (kotlin.jvm.internal.t.c(Z.j.l((M0.l) obj5), "Suffix")) {
                break;
            }
            i11++;
        }
        M0.l lVar5 = (M0.l) obj5;
        if (lVar5 != null) {
            i6 = ((Number) pVar.invoke(lVar5, Integer.valueOf(i2))).intValue();
            i2 = k0.f(i2, lVar5.B0(Integer.MAX_VALUE));
        } else {
            i6 = 0;
        }
        int size6 = list.size();
        for (int i12 = 0; i12 < size6; i12++) {
            Object obj8 = list.get(i12);
            if (kotlin.jvm.internal.t.c(Z.j.l((M0.l) obj8), "TextField")) {
                int intValue3 = ((Number) pVar.invoke(obj8, Integer.valueOf(i2))).intValue();
                int size7 = list.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i13);
                    if (kotlin.jvm.internal.t.c(Z.j.l((M0.l) obj6), "Hint")) {
                        break;
                    }
                    i13++;
                }
                M0.l lVar6 = (M0.l) obj6;
                int intValue4 = lVar6 != null ? ((Number) pVar.invoke(lVar6, Integer.valueOf(i2))).intValue() : 0;
                int size8 = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i14);
                    if (kotlin.jvm.internal.t.c(Z.j.l((M0.l) obj7), "Supporting")) {
                        break;
                    }
                    i14++;
                }
                M0.l lVar7 = (M0.l) obj7;
                return k0.b(intValue3, intValue, i3, i4, i5, i6, intValue4, lVar7 != null ? ((Number) pVar.invoke(lVar7, Integer.valueOf(i))).intValue() : 0, this.b, Z.j.s(), mVar.getDensity(), this.c);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final int e(List list, int i, Qa.p pVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj7 = list.get(i2);
            if (kotlin.jvm.internal.t.c(Z.j.l((M0.l) obj7), "TextField")) {
                int intValue = ((Number) pVar.invoke(obj7, Integer.valueOf(i))).intValue();
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    obj = null;
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i3);
                    if (kotlin.jvm.internal.t.c(Z.j.l((M0.l) obj2), "Label")) {
                        break;
                    }
                    i3++;
                }
                M0.l lVar = (M0.l) obj2;
                int intValue2 = lVar != null ? ((Number) pVar.invoke(lVar, Integer.valueOf(i))).intValue() : 0;
                int size3 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i4);
                    if (kotlin.jvm.internal.t.c(Z.j.l((M0.l) obj3), "Trailing")) {
                        break;
                    }
                    i4++;
                }
                M0.l lVar2 = (M0.l) obj3;
                int intValue3 = lVar2 != null ? ((Number) pVar.invoke(lVar2, Integer.valueOf(i))).intValue() : 0;
                int size4 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i5);
                    if (kotlin.jvm.internal.t.c(Z.j.l((M0.l) obj4), "Prefix")) {
                        break;
                    }
                    i5++;
                }
                M0.l lVar3 = (M0.l) obj4;
                int intValue4 = lVar3 != null ? ((Number) pVar.invoke(lVar3, Integer.valueOf(i))).intValue() : 0;
                int size5 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i6);
                    if (kotlin.jvm.internal.t.c(Z.j.l((M0.l) obj5), "Suffix")) {
                        break;
                    }
                    i6++;
                }
                M0.l lVar4 = (M0.l) obj5;
                int intValue5 = lVar4 != null ? ((Number) pVar.invoke(lVar4, Integer.valueOf(i))).intValue() : 0;
                int size6 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i7);
                    if (kotlin.jvm.internal.t.c(Z.j.l((M0.l) obj6), "Leading")) {
                        break;
                    }
                    i7++;
                }
                M0.l lVar5 = (M0.l) obj6;
                int intValue6 = lVar5 != null ? ((Number) pVar.invoke(lVar5, Integer.valueOf(i))).intValue() : 0;
                int size7 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        break;
                    }
                    Object obj8 = list.get(i8);
                    if (kotlin.jvm.internal.t.c(Z.j.l((M0.l) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                    i8++;
                }
                M0.l lVar6 = (M0.l) obj;
                return k0.c(intValue6, intValue3, intValue4, intValue5, intValue, intValue2, lVar6 != null ? ((Number) pVar.invoke(lVar6, Integer.valueOf(i))).intValue() : 0, Z.j.s());
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public int maxIntrinsicHeight(M0.m mVar, List list, int i) {
        return d(mVar, list, i, a.a);
    }

    public int maxIntrinsicWidth(M0.m mVar, List list, int i) {
        return e(list, i, b.a);
    }

    public M0.C measure-3p2s80s(androidx.compose.ui.layout.l lVar, List list, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        List list2 = list;
        int s0 = lVar.s0(this.c.d());
        int s02 = lVar.s0(this.c.a());
        long d2 = n1.b.d(j, 0, 0, 0, 0, 10, null);
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i);
            if (kotlin.jvm.internal.t.c(androidx.compose.ui.layout.h.a((M0.A) obj), "Leading")) {
                break;
            }
            i++;
        }
        M0.A a2 = (M0.A) obj;
        androidx.compose.ui.layout.q C0 = a2 != null ? a2.C0(d2) : null;
        int v = Z.j.v(C0);
        int max = Math.max(0, Z.j.t(C0));
        int size2 = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list2.get(i2);
            if (kotlin.jvm.internal.t.c(androidx.compose.ui.layout.h.a((M0.A) obj2), "Trailing")) {
                break;
            }
            i2++;
        }
        M0.A a3 = (M0.A) obj2;
        androidx.compose.ui.layout.q C02 = a3 != null ? a3.C0(n1.c.k(d2, -v, 0, 2, null)) : null;
        int v2 = v + Z.j.v(C02);
        int max2 = Math.max(max, Z.j.t(C02));
        int size3 = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list2.get(i3);
            if (kotlin.jvm.internal.t.c(androidx.compose.ui.layout.h.a((M0.A) obj3), "Prefix")) {
                break;
            }
            i3++;
        }
        M0.A a4 = (M0.A) obj3;
        androidx.compose.ui.layout.q C03 = a4 != null ? a4.C0(n1.c.k(d2, -v2, 0, 2, null)) : null;
        int v3 = v2 + Z.j.v(C03);
        int max3 = Math.max(max2, Z.j.t(C03));
        int size4 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list2.get(i4);
            int i5 = size4;
            if (kotlin.jvm.internal.t.c(androidx.compose.ui.layout.h.a((M0.A) obj4), "Suffix")) {
                break;
            }
            i4++;
            size4 = i5;
        }
        M0.A a5 = (M0.A) obj4;
        androidx.compose.ui.layout.q C04 = a5 != null ? a5.C0(n1.c.k(d2, -v3, 0, 2, null)) : null;
        int v4 = v3 + Z.j.v(C04);
        int max4 = Math.max(max3, Z.j.t(C04));
        int i6 = -v4;
        long j2 = n1.c.j(d2, i6, -s02);
        int size5 = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size5) {
                obj5 = null;
                break;
            }
            Object obj8 = list2.get(i7);
            int i8 = size5;
            if (kotlin.jvm.internal.t.c(androidx.compose.ui.layout.h.a((M0.A) obj8), "Label")) {
                obj5 = obj8;
                break;
            }
            i7++;
            size5 = i8;
        }
        M0.A a6 = (M0.A) obj5;
        androidx.compose.ui.layout.q C05 = a6 != null ? a6.C0(j2) : null;
        int size6 = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size6) {
                obj6 = null;
                break;
            }
            obj6 = list2.get(i9);
            int i10 = size6;
            if (kotlin.jvm.internal.t.c(androidx.compose.ui.layout.h.a((M0.A) obj6), "Supporting")) {
                break;
            }
            i9++;
            size6 = i10;
        }
        M0.A a7 = (M0.A) obj6;
        int q0 = a7 != null ? a7.q0(n1.b.n(j)) : 0;
        int t = Z.j.t(C05) + s0;
        long j3 = n1.c.j(n1.b.d(j, 0, 0, 0, 0, 11, null), i6, ((-t) - s02) - q0);
        int size7 = list.size();
        int i11 = 0;
        while (i11 < size7) {
            int i12 = size7;
            M0.A a8 = (M0.A) list2.get(i11);
            int i13 = i11;
            if (kotlin.jvm.internal.t.c(androidx.compose.ui.layout.h.a(a8), "TextField")) {
                androidx.compose.ui.layout.q C06 = a8.C0(j3);
                long d3 = n1.b.d(j3, 0, 0, 0, 0, 14, null);
                int size8 = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list2.get(i14);
                    int i15 = size8;
                    if (kotlin.jvm.internal.t.c(androidx.compose.ui.layout.h.a((M0.A) obj7), "Hint")) {
                        break;
                    }
                    i14++;
                    list2 = list;
                    size8 = i15;
                }
                M0.A a9 = (M0.A) obj7;
                androidx.compose.ui.layout.q C07 = a9 != null ? a9.C0(d3) : null;
                int max5 = Math.max(max4, Math.max(Z.j.t(C06), Z.j.t(C07)) + t + s02);
                int c2 = k0.c(Z.j.v(C0), Z.j.v(C02), Z.j.v(C03), Z.j.v(C04), C06.W0(), Z.j.v(C05), Z.j.v(C07), j);
                androidx.compose.ui.layout.q C08 = a7 != null ? a7.C0(n1.b.d(n1.c.k(d2, 0, -max5, 1, null), 0, c2, 0, 0, 9, null)) : null;
                int t2 = Z.j.t(C08);
                int b2 = k0.b(C06.P0(), Z.j.t(C05), Z.j.t(C0), Z.j.t(C02), Z.j.t(C03), Z.j.t(C04), Z.j.t(C07), Z.j.t(C08), this.b, j, lVar.getDensity(), this.c);
                int i16 = b2 - t2;
                int size9 = list.size();
                for (int i17 = 0; i17 < size9; i17++) {
                    M0.A a10 = (M0.A) list.get(i17);
                    if (kotlin.jvm.internal.t.c(androidx.compose.ui.layout.h.a(a10), "Container")) {
                        return androidx.compose.ui.layout.l.O0(lVar, c2, b2, null, new c(C05, c2, b2, C06, C07, C0, C02, C03, C04, a10.C0(n1.c.a(c2 != Integer.MAX_VALUE ? c2 : 0, c2, i16 != Integer.MAX_VALUE ? i16 : 0, i16)), C08, this, s0, lVar), 4, null);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i11 = i13 + 1;
            size7 = i12;
            list2 = list;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public int minIntrinsicHeight(M0.m mVar, List list, int i) {
        return d(mVar, list, i, d.a);
    }

    public int minIntrinsicWidth(M0.m mVar, List list, int i) {
        return e(list, i, e.a);
    }
}
