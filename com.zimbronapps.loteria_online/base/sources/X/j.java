package X;

import androidx.compose.ui.layout.q;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class J implements M0.B {
    public final Qa.l a;
    public final boolean b;
    public final float c;
    public final F.L d;

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
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ androidx.compose.ui.layout.q c;
        public final /* synthetic */ androidx.compose.ui.layout.q d;
        public final /* synthetic */ androidx.compose.ui.layout.q e;
        public final /* synthetic */ androidx.compose.ui.layout.q f;
        public final /* synthetic */ androidx.compose.ui.layout.q g;
        public final /* synthetic */ androidx.compose.ui.layout.q h;
        public final /* synthetic */ androidx.compose.ui.layout.q i;
        public final /* synthetic */ androidx.compose.ui.layout.q j;
        public final /* synthetic */ androidx.compose.ui.layout.q k;
        public final /* synthetic */ J l;
        public final /* synthetic */ androidx.compose.ui.layout.l m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i, int i2, androidx.compose.ui.layout.q qVar, androidx.compose.ui.layout.q qVar2, androidx.compose.ui.layout.q qVar3, androidx.compose.ui.layout.q qVar4, androidx.compose.ui.layout.q qVar5, androidx.compose.ui.layout.q qVar6, androidx.compose.ui.layout.q qVar7, androidx.compose.ui.layout.q qVar8, androidx.compose.ui.layout.q qVar9, J j, androidx.compose.ui.layout.l lVar) {
            super(1);
            this.a = i;
            this.b = i2;
            this.c = qVar;
            this.d = qVar2;
            this.e = qVar3;
            this.f = qVar4;
            this.g = qVar5;
            this.h = qVar6;
            this.i = qVar7;
            this.j = qVar8;
            this.k = qVar9;
            this.l = j;
            this.m = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((q.a) obj);
            return Ca.I.a;
        }

        public final void invoke(q.a aVar) {
            I.f(aVar, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, J.a(this.l), J.c(this.l), this.m.getDensity(), this.m.getLayoutDirection(), J.b(this.l));
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

    public J(Qa.l lVar, boolean z, float f, F.L l) {
        this.a = lVar;
        this.b = z;
        this.c = f;
        this.d = l;
    }

    public static final /* synthetic */ float a(J j) {
        return j.c;
    }

    public static final /* synthetic */ F.L b(J j) {
        return j.d;
    }

    public static final /* synthetic */ boolean c(J j) {
        return j.b;
    }

    public final int d(M0.m mVar, List list, int i, Qa.p pVar) {
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
            i2 = I.g(i, lVar.B0(Integer.MAX_VALUE));
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
            i2 = I.g(i2, lVar2.B0(Integer.MAX_VALUE));
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
        int intValue = lVar3 != null ? ((Number) pVar.invoke(lVar3, Integer.valueOf(p1.b.c(i2, i, this.c)))).intValue() : 0;
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
            i5 = ((Number) pVar.invoke(lVar4, Integer.valueOf(i2))).intValue();
            i2 = I.g(i2, lVar4.B0(Integer.MAX_VALUE));
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
            int intValue2 = ((Number) pVar.invoke(lVar5, Integer.valueOf(i2))).intValue();
            i2 = I.g(i2, lVar5.B0(Integer.MAX_VALUE));
            i6 = intValue2;
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
                    Object obj9 = list.get(i14);
                    if (kotlin.jvm.internal.t.c(Z.j.l((M0.l) obj9), "Supporting")) {
                        obj7 = obj9;
                        break;
                    }
                    i14++;
                }
                M0.l lVar7 = (M0.l) obj7;
                return I.c(i3, i4, i5, i6, intValue3, intValue, intValue4, lVar7 != null ? ((Number) pVar.invoke(lVar7, Integer.valueOf(i))).intValue() : 0, this.c, Z.j.s(), mVar.getDensity(), this.d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final int e(M0.m mVar, List list, int i, Qa.p pVar) {
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
                    if (kotlin.jvm.internal.t.c(Z.j.l((M0.l) obj4), "Leading")) {
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
                    if (kotlin.jvm.internal.t.c(Z.j.l((M0.l) obj5), "Prefix")) {
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
                    if (kotlin.jvm.internal.t.c(Z.j.l((M0.l) obj6), "Suffix")) {
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
                return I.d(intValue4, intValue3, intValue5, intValue6, intValue, intValue2, lVar6 != null ? ((Number) pVar.invoke(lVar6, Integer.valueOf(i))).intValue() : 0, this.c, Z.j.s(), mVar.getDensity(), this.d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public int maxIntrinsicHeight(M0.m mVar, List list, int i) {
        return d(mVar, list, i, a.a);
    }

    public int maxIntrinsicWidth(M0.m mVar, List list, int i) {
        return e(mVar, list, i, b.a);
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
        int s0 = lVar.s0(this.d.a());
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
            if (kotlin.jvm.internal.t.c(androidx.compose.ui.layout.h.a((M0.A) obj4), "Suffix")) {
                break;
            }
            i4++;
        }
        M0.A a5 = (M0.A) obj4;
        androidx.compose.ui.layout.q C04 = a5 != null ? a5.C0(n1.c.k(d2, -v3, 0, 2, null)) : null;
        int v4 = v3 + Z.j.v(C04);
        int max4 = Math.max(max3, Z.j.t(C04));
        int s02 = lVar.s0(this.d.b(lVar.getLayoutDirection())) + lVar.s0(this.d.c(lVar.getLayoutDirection()));
        int i5 = -v4;
        int i6 = -s0;
        long j2 = n1.c.j(d2, p1.b.c(i5 - s02, -s02, this.c), i6);
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
        this.a.invoke(u0.l.c(C05 != null ? u0.m.a(C05.W0(), C05.P0()) : u0.l.b.b()));
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
        int max5 = Math.max(Z.j.t(C05) / 2, lVar.s0(this.d.d()));
        long d3 = n1.b.d(n1.c.j(j, i5, (i6 - max5) - q0), 0, 0, 0, 0, 11, null);
        int size7 = list.size();
        int i11 = 0;
        while (i11 < size7) {
            int i12 = size7;
            M0.A a8 = (M0.A) list2.get(i11);
            int i13 = i11;
            if (kotlin.jvm.internal.t.c(androidx.compose.ui.layout.h.a(a8), "TextField")) {
                androidx.compose.ui.layout.q C06 = a8.C0(d3);
                long d4 = n1.b.d(d3, 0, 0, 0, 0, 14, null);
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
                androidx.compose.ui.layout.q C07 = a9 != null ? a9.C0(d4) : null;
                int max6 = Math.max(max4, Math.max(Z.j.t(C06), Z.j.t(C07)) + max5 + s0);
                int d5 = I.d(Z.j.v(C0), Z.j.v(C02), Z.j.v(C03), Z.j.v(C04), C06.W0(), Z.j.v(C05), Z.j.v(C07), this.c, j, lVar.getDensity(), this.d);
                androidx.compose.ui.layout.q C08 = a7 != null ? a7.C0(n1.b.d(n1.c.k(d2, 0, -max6, 1, null), 0, d5, 0, 0, 9, null)) : null;
                int t = Z.j.t(C08);
                int c2 = I.c(Z.j.t(C0), Z.j.t(C02), Z.j.t(C03), Z.j.t(C04), C06.P0(), Z.j.t(C05), Z.j.t(C07), Z.j.t(C08), this.c, j, lVar.getDensity(), this.d);
                int i16 = c2 - t;
                int size9 = list.size();
                for (int i17 = 0; i17 < size9; i17++) {
                    M0.A a10 = (M0.A) list.get(i17);
                    if (kotlin.jvm.internal.t.c(androidx.compose.ui.layout.h.a(a10), "Container")) {
                        return androidx.compose.ui.layout.l.O0(lVar, d5, c2, null, new c(c2, d5, C0, C02, C03, C04, C06, C05, C07, a10.C0(n1.c.a(d5 != Integer.MAX_VALUE ? d5 : 0, d5, i16 != Integer.MAX_VALUE ? i16 : 0, i16)), C08, this, lVar), 4, null);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i11 = i13 + 1;
            size7 = i12;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public int minIntrinsicHeight(M0.m mVar, List list, int i) {
        return d(mVar, list, i, d.a);
    }

    public int minIntrinsicWidth(M0.m mVar, List list, int i) {
        return e(mVar, list, i, e.a);
    }
}
