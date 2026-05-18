package J;

import Ca.I;
import F.c;
import I.M;
import androidx.compose.ui.layout.q;
import b0.C0;
import cb.O;
import java.util.ArrayList;
import java.util.List;
import o0.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class s {

    public static final class a extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ List a;
        public final /* synthetic */ C0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List list, C0 c0) {
            super(1);
            this.a = list;
            this.b = c0;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((q.a) obj);
            return I.a;
        }

        public final void invoke(q.a aVar) {
            List list = this.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((e) list.get(i)).h(aVar);
            }
            M.a(this.b);
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.l {
        public static final b a = new b();

        public b() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((q.a) obj);
            return I.a;
        }

        public final void invoke(q.a aVar) {
        }
    }

    public static final class c extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ I.v a;
        public final /* synthetic */ long b;
        public final /* synthetic */ r c;
        public final /* synthetic */ long d;
        public final /* synthetic */ C.q e;
        public final /* synthetic */ e.b f;
        public final /* synthetic */ e.c g;
        public final /* synthetic */ boolean h;
        public final /* synthetic */ int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(I.v vVar, long j, r rVar, long j2, C.q qVar, e.b bVar, e.c cVar, boolean z, int i) {
            super(1);
            this.a = vVar;
            this.b = j;
            this.c = rVar;
            this.d = j2;
            this.e = qVar;
            this.f = bVar;
            this.g = cVar;
            this.h = z;
            this.i = i;
        }

        public final e a(int i) {
            I.v vVar = this.a;
            return s.a(vVar, i, this.b, this.c, this.d, this.e, this.f, this.g, vVar.getLayoutDirection(), this.h, this.i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public static final class d extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ I.v a;
        public final /* synthetic */ long b;
        public final /* synthetic */ r c;
        public final /* synthetic */ long d;
        public final /* synthetic */ C.q e;
        public final /* synthetic */ e.b f;
        public final /* synthetic */ e.c g;
        public final /* synthetic */ boolean h;
        public final /* synthetic */ int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(I.v vVar, long j, r rVar, long j2, C.q qVar, e.b bVar, e.c cVar, boolean z, int i) {
            super(1);
            this.a = vVar;
            this.b = j;
            this.c = rVar;
            this.d = j2;
            this.e = qVar;
            this.f = bVar;
            this.g = cVar;
            this.h = z;
            this.i = i;
        }

        public final e a(int i) {
            I.v vVar = this.a;
            return s.a(vVar, i, this.b, this.c, this.d, this.e, this.f, this.g, vVar.getLayoutDirection(), this.h, this.i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public static final /* synthetic */ e a(I.v vVar, int i, long j, r rVar, long j2, C.q qVar, e.b bVar, e.c cVar, n1.t tVar, boolean z, int i2) {
        return g(vVar, i, j, rVar, j2, qVar, bVar, cVar, tVar, z, i2);
    }

    public static final e b(int i, List list, int i2, int i3, int i4, D.k kVar, int i5) {
        Object obj;
        if (list.isEmpty()) {
            obj = null;
        } else {
            Object obj2 = list.get(0);
            e eVar = (e) obj2;
            float f = -Math.abs(D.l.a(i, i2, i3, i4, eVar.a(), eVar.getIndex(), kVar, i5));
            int p = Da.v.p(list);
            int i6 = 1;
            if (1 <= p) {
                while (true) {
                    Object obj3 = list.get(i6);
                    e eVar2 = (e) obj3;
                    float f2 = -Math.abs(D.l.a(i, i2, i3, i4, eVar2.a(), eVar2.getIndex(), kVar, i5));
                    if (Float.compare(f, f2) < 0) {
                        obj2 = obj3;
                        f = f2;
                    }
                    if (i6 == p) {
                        break;
                    }
                    i6++;
                }
            }
            obj = obj2;
        }
        return (e) obj;
    }

    public static final List c(I.v vVar, List list, List list2, List list3, int i, int i2, int i3, int i4, int i5, C.q qVar, boolean z, n1.d dVar, int i6, int i7) {
        int i8;
        int i9;
        int i10 = i5;
        int i11 = i7 + i6;
        if (qVar == C.q.Vertical) {
            i8 = i4;
            i9 = i2;
        } else {
            i8 = i4;
            i9 = i;
        }
        boolean z2 = i3 < Math.min(i9, i8);
        if (z2 && i10 != 0) {
            throw new IllegalStateException(("non-zero pagesScrollOffset=" + i10).toString());
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (!z2) {
            int size = list2.size();
            int i12 = i10;
            for (int i13 = 0; i13 < size; i13++) {
                e eVar = (e) list2.get(i13);
                i12 -= i11;
                eVar.i(i12, i, i2);
                arrayList.add(eVar);
            }
            int size2 = list.size();
            for (int i14 = 0; i14 < size2; i14++) {
                e eVar2 = (e) list.get(i14);
                eVar2.i(i10, i, i2);
                arrayList.add(eVar2);
                i10 += i11;
            }
            int size3 = list3.size();
            for (int i15 = 0; i15 < size3; i15++) {
                e eVar3 = (e) list3.get(i15);
                eVar3.i(i10, i, i2);
                arrayList.add(eVar3);
                i10 += i11;
            }
        } else {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                throw new IllegalArgumentException("No extra pages");
            }
            int size4 = list.size();
            int[] iArr = new int[size4];
            for (int i16 = 0; i16 < size4; i16++) {
                iArr[i16] = i7;
            }
            int[] iArr2 = new int[size4];
            for (int i17 = 0; i17 < size4; i17++) {
                iArr2[i17] = 0;
            }
            c.f d2 = c.a.a.d(vVar.A(i6));
            if (qVar == C.q.Vertical) {
                d2.b(dVar, i9, iArr, iArr2);
            } else {
                d2.c(dVar, i9, iArr, n1.t.a, iArr2);
            }
            Wa.g W = Da.r.W(iArr2);
            if (z) {
                W = Wa.n.u(W);
            }
            int f = W.f();
            int g = W.g();
            int h = W.h();
            if ((h > 0 && f <= g) || (h < 0 && g <= f)) {
                while (true) {
                    int i18 = iArr2[f];
                    e eVar4 = (e) list.get(d(f, z, size4));
                    if (z) {
                        i18 = (i9 - i18) - eVar4.g();
                    }
                    eVar4.i(i18, i, i2);
                    arrayList.add(eVar4);
                    if (f == g) {
                        break;
                    }
                    f += h;
                }
            }
        }
        return arrayList;
    }

    public static final int d(int i, boolean z, int i2) {
        return !z ? i : (i2 - i) - 1;
    }

    public static final List e(int i, int i2, int i3, List list, Qa.l lVar) {
        int min = Math.min(i3 + i, i2 - 1);
        int i4 = i + 1;
        ArrayList arrayList = null;
        if (i4 <= min) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lVar.invoke(Integer.valueOf(i4)));
                if (i4 == min) {
                    break;
                }
                i4++;
            }
        }
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            int intValue = ((Number) list.get(i5)).intValue();
            if (min + 1 <= intValue && intValue < i2) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lVar.invoke(Integer.valueOf(intValue)));
            }
        }
        return arrayList == null ? Da.v.n() : arrayList;
    }

    public static final List f(int i, int i2, List list, Qa.l lVar) {
        int max = Math.max(0, i - i2);
        int i3 = i - 1;
        ArrayList arrayList = null;
        if (max <= i3) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lVar.invoke(Integer.valueOf(i3)));
                if (i3 == max) {
                    break;
                }
                i3--;
            }
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            int intValue = ((Number) list.get(i4)).intValue();
            if (intValue < max) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lVar.invoke(Integer.valueOf(intValue)));
            }
        }
        return arrayList == null ? Da.v.n() : arrayList;
    }

    public static final e g(I.v vVar, int i, long j, r rVar, long j2, C.q qVar, e.b bVar, e.c cVar, n1.t tVar, boolean z, int i2) {
        return new e(i, i2, vVar.a0(i, j), j2, rVar.d(i), qVar, bVar, cVar, tVar, z, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final u h(I.v vVar, int i, r rVar, int i2, int i3, int i4, int i5, int i6, int i7, long j, C.q qVar, e.c cVar, e.b bVar, boolean z, long j2, int i8, int i9, List list, D.k kVar, C0 c0, O o, Qa.q qVar2) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        e eVar;
        int i15;
        long j3;
        int i16;
        List list2;
        List arrayList;
        List arrayList2;
        if (i3 < 0) {
            throw new IllegalArgumentException("negative beforeContentPadding");
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("negative afterContentPadding");
        }
        int i17 = 0;
        int e = Wa.n.e(i8 + i5, 0);
        if (i <= 0) {
            return new u(Da.v.n(), i8, i5, i4, qVar, -i3, i2 + i4, false, i9, null, null, 0.0f, 0, false, kVar, (M0.C) qVar2.invoke(Integer.valueOf(n1.b.n(j)), Integer.valueOf(n1.b.m(j)), b.a), false, null, null, o, 393216, null);
        }
        C.q qVar3 = C.q.Vertical;
        long b2 = n1.c.b(0, qVar == qVar3 ? n1.b.l(j) : i8, 0, qVar != qVar3 ? n1.b.k(j) : i8, 5, null);
        int i18 = i6;
        int i19 = i7;
        while (i18 > 0 && i19 > 0) {
            i18--;
            i19 -= e;
        }
        int i20 = i19 * (-1);
        if (i18 >= i) {
            i18 = i - 1;
            i20 = 0;
        }
        Da.m mVar = new Da.m();
        int i21 = -i3;
        int i22 = (i5 < 0 ? i5 : 0) + i21;
        int i23 = i20 + i22;
        int i24 = 0;
        while (i23 < 0 && i18 > 0) {
            int i25 = i18 - 1;
            Da.m mVar2 = mVar;
            int i26 = i17;
            int i27 = e;
            e g = g(vVar, i25, b2, rVar, j2, qVar, bVar, cVar, vVar.getLayoutDirection(), z, i8);
            mVar2.add(i26, g);
            i24 = Math.max(i24, g.c());
            i23 += i27;
            i18 = i25;
            i22 = i22;
            mVar = mVar2;
            i17 = i26;
            e = i27;
            i21 = i21;
        }
        int i28 = i23;
        int i29 = i21;
        int i30 = i22;
        Da.m mVar3 = mVar;
        int i31 = i17;
        int i32 = e;
        int i33 = (i28 < i30 ? i30 : i28) - i30;
        int i34 = i2 + i4;
        int e2 = Wa.n.e(i34, i31);
        int i35 = -i33;
        int i36 = i31;
        int i37 = i36;
        int i38 = i18;
        while (i36 < mVar3.size()) {
            if (i35 >= e2) {
                mVar3.remove(i36);
                i37 = 1;
            } else {
                i38++;
                i35 += i32;
                i36++;
            }
        }
        int i39 = i18;
        int i40 = i33;
        int i41 = i37;
        int i42 = i38;
        int i43 = i35;
        while (i42 < i && (i43 < e2 || i43 <= 0 || mVar3.isEmpty())) {
            int i44 = i34;
            int i45 = i42;
            int i46 = i39;
            int i47 = e2;
            int i48 = i43;
            int i49 = i32;
            e g2 = g(vVar, i42, b2, rVar, j2, qVar, bVar, cVar, vVar.getLayoutDirection(), z, i8);
            int i50 = i - 1;
            i43 = (i45 == i50 ? i8 : i49) + i48;
            if (i43 > i30 || i45 == i50) {
                i24 = Math.max(i24, g2.c());
                mVar3.add(g2);
                i39 = i46;
            } else {
                i40 -= i49;
                i39 = i45 + 1;
                i41 = 1;
            }
            i42 = i45 + 1;
            i34 = i44;
            i32 = i49;
            e2 = i47;
        }
        int i51 = i39;
        int i52 = i34;
        int i53 = i42;
        int i54 = i43;
        int i55 = i32;
        if (i54 < i2) {
            int i56 = i2 - i54;
            int i57 = i40 - i56;
            int i58 = i56 + i54;
            int i59 = i3;
            i14 = i51;
            int i60 = i55;
            int i61 = i57;
            while (i61 < i59 && i14 > 0) {
                i14--;
                int i62 = i60;
                e g3 = g(vVar, i14, b2, rVar, j2, qVar, bVar, cVar, vVar.getLayoutDirection(), z, i8);
                mVar3.add(0, g3);
                i24 = Math.max(i24, g3.c());
                i61 += i62;
                i59 = i3;
                i60 = i62;
            }
            i10 = i60;
            i11 = 0;
            if (i61 < 0) {
                i12 = i58 + i61;
                i13 = 0;
            } else {
                i13 = i61;
                i12 = i58;
            }
        } else {
            i10 = i55;
            i11 = 0;
            i12 = i54;
            i13 = i40;
            i14 = i51;
        }
        if (i13 < 0) {
            throw new IllegalArgumentException("invalid currentFirstPageScrollOffset");
        }
        int i63 = -i13;
        e eVar2 = (e) mVar3.first();
        if (i3 > 0 || i5 < 0) {
            int size = mVar3.size();
            int i64 = i13;
            int i65 = i11;
            while (i65 < size && i64 != 0 && i10 <= i64 && i65 != Da.v.p(mVar3)) {
                i64 -= i10;
                i65++;
                eVar2 = (e) mVar3.get(i65);
            }
            eVar = eVar2;
            i15 = i64;
        } else {
            i15 = i13;
            eVar = eVar2;
        }
        int i66 = i24;
        e eVar3 = eVar;
        int i67 = i11;
        List f = f(i14, i9, list, new d(vVar, b2, rVar, j2, qVar, bVar, cVar, z, i8));
        int size2 = f.size();
        int i68 = i66;
        for (int i69 = i67; i69 < size2; i69++) {
            i68 = Math.max(i68, ((e) f.get(i69)).c());
        }
        int i70 = i10;
        List e3 = e(((e) mVar3.last()).getIndex(), i, i9, list, new c(vVar, b2, rVar, j2, qVar, bVar, cVar, z, i8));
        int size3 = e3.size();
        int i71 = i68;
        for (int i72 = i67; i72 < size3; i72++) {
            i71 = Math.max(i71, ((e) e3.get(i72)).c());
        }
        int i73 = (kotlin.jvm.internal.t.c(eVar3, mVar3.first()) && f.isEmpty() && e3.isEmpty()) ? 1 : i67;
        C.q qVar4 = C.q.Vertical;
        if (qVar == qVar4) {
            j3 = j;
            i16 = i71;
        } else {
            j3 = j;
            i16 = i12;
        }
        int g4 = n1.c.g(j3, i16);
        if (qVar == qVar4) {
            i71 = i12;
        }
        int f2 = n1.c.f(j3, i71);
        List c2 = c(vVar, mVar3, f, e3, g4, f2, i12, i2, i63, qVar, z, vVar, i5, i8);
        if (i73 != 0) {
            list2 = c2;
        } else {
            List arrayList3 = new ArrayList(c2.size());
            int size4 = c2.size();
            for (int i74 = i67; i74 < size4; i74++) {
                Object obj = c2.get(i74);
                e eVar4 = (e) obj;
                if (eVar4.getIndex() >= ((e) mVar3.first()).getIndex() && eVar4.getIndex() <= ((e) mVar3.last()).getIndex()) {
                    arrayList3.add(obj);
                }
            }
            list2 = arrayList3;
        }
        if (f.isEmpty()) {
            arrayList = Da.v.n();
        } else {
            arrayList = new ArrayList(c2.size());
            int size5 = c2.size();
            for (int i75 = i67; i75 < size5; i75++) {
                Object obj2 = c2.get(i75);
                if (((e) obj2).getIndex() < ((e) mVar3.first()).getIndex()) {
                    arrayList.add(obj2);
                }
            }
        }
        List list3 = arrayList;
        if (e3.isEmpty()) {
            arrayList2 = Da.v.n();
        } else {
            arrayList2 = new ArrayList(c2.size());
            int size6 = c2.size();
            for (int i76 = i67; i76 < size6; i76++) {
                Object obj3 = c2.get(i76);
                if (((e) obj3).getIndex() > ((e) mVar3.last()).getIndex()) {
                    arrayList2.add(obj3);
                }
            }
        }
        List list4 = arrayList2;
        int i77 = i12;
        e b3 = b(qVar == C.q.Vertical ? f2 : g4, list2, i3, i4, i70, kVar, i);
        return new u(list2, i8, i5, i4, qVar, i29, i52, z, i9, eVar3, b3, i70 == 0 ? 0.0f : Wa.n.l((kVar.a(i2, i8, i3, i4, b3 != null ? b3.getIndex() : i67, i) - (b3 != null ? b3.a() : i67)) / i70, -0.5f, 0.5f), i15, (i53 < i || i77 > i2) ? 1 : i67, kVar, (M0.C) qVar2.invoke(Integer.valueOf(g4), Integer.valueOf(f2), new a(c2, c0)), i41, list3, list4, o);
    }
}
