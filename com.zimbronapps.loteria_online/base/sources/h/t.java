package H;

import F.c;
import I.M;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.ui.layout.q;
import b0.C0;
import cb.O;
import java.util.ArrayList;
import java.util.List;
import v0.Z0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class t {

    public static final class a extends kotlin.jvm.internal.u implements Qa.l {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((q.a) obj);
            return Ca.I.a;
        }

        public final void invoke(q.a aVar) {
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ List a;
        public final /* synthetic */ C0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List list, C0 c0) {
            super(1);
            this.a = list;
            this.b = c0;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((q.a) obj);
            return Ca.I.a;
        }

        public final void invoke(q.a aVar) {
            List list = this.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((v) list.get(i)).t(aVar);
            }
            M.a(this.b);
        }
    }

    public static final void a(List list, Object[] objArr) {
        for (Object obj : objArr) {
            list.add(obj);
        }
    }

    public static final List b(List list, List list2, List list3, int i, int i2, int i3, int i4, int i5, boolean z, c.m mVar, c.e eVar, boolean z2, n1.d dVar) {
        int i6 = z ? i2 : i;
        boolean z3 = i3 < Math.min(i6, i4);
        if (z3 && i5 != 0) {
            throw new IllegalStateException("non-zero firstLineScrollOffset");
        }
        int size = list.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += ((x) list.get(i8)).b().length;
        }
        ArrayList arrayList = new ArrayList(i7);
        if (!z3) {
            int size2 = list2.size() - 1;
            if (size2 >= 0) {
                int i9 = i5;
                while (true) {
                    int i10 = size2 - 1;
                    v vVar = (v) list2.get(size2);
                    i9 -= vVar.j();
                    vVar.i(i9, 0, i, i2);
                    arrayList.add(vVar);
                    if (i10 < 0) {
                        break;
                    }
                    size2 = i10;
                }
            }
            int size3 = list.size();
            int i11 = i5;
            for (int i12 = 0; i12 < size3; i12++) {
                x xVar = (x) list.get(i12);
                a(arrayList, xVar.f(i11, i, i2));
                i11 += xVar.d();
            }
            int size4 = list3.size();
            for (int i13 = 0; i13 < size4; i13++) {
                v vVar2 = (v) list3.get(i13);
                vVar2.i(i11, 0, i, i2);
                arrayList.add(vVar2);
                i11 += vVar2.j();
            }
        } else {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                throw new IllegalArgumentException("no items");
            }
            int size5 = list.size();
            int[] iArr = new int[size5];
            for (int i14 = 0; i14 < size5; i14++) {
                iArr[i14] = ((x) list.get(c(i14, z2, size5))).c();
            }
            int[] iArr2 = new int[size5];
            for (int i15 = 0; i15 < size5; i15++) {
                iArr2[i15] = 0;
            }
            if (z) {
                if (mVar == null) {
                    throw new IllegalArgumentException("null verticalArrangement");
                }
                mVar.b(dVar, i6, iArr, iArr2);
            } else {
                if (eVar == null) {
                    throw new IllegalArgumentException("null horizontalArrangement");
                }
                eVar.c(dVar, i6, iArr, n1.t.a, iArr2);
            }
            Wa.g W = Da.r.W(iArr2);
            if (z2) {
                W = Wa.n.u(W);
            }
            int f = W.f();
            int g = W.g();
            int h = W.h();
            if ((h > 0 && f <= g) || (h < 0 && g <= f)) {
                while (true) {
                    int i16 = iArr2[f];
                    x xVar2 = (x) list.get(c(f, z2, size5));
                    if (z2) {
                        i16 = (i6 - i16) - xVar2.c();
                    }
                    a(arrayList, xVar2.f(i16, i, i2));
                    if (f == g) {
                        break;
                    }
                    f += h;
                }
            }
        }
        return arrayList;
    }

    public static final int c(int i, boolean z, int i2) {
        return !z ? i : (i2 - i) - 1;
    }

    public static final u d(int i, y yVar, w wVar, int i2, int i3, int i4, int i5, int i6, int i7, float f, long j, boolean z, c.m mVar, c.e eVar, boolean z2, n1.d dVar, LazyLayoutItemAnimator lazyLayoutItemAnimator, int i8, List list, O o, C0 c0, Z0 z0, Qa.l lVar, Qa.q qVar) {
        boolean z3;
        int i9;
        int i10;
        x xVar;
        int i11;
        x xVar2;
        int i12;
        int i13;
        int i14;
        List list2;
        int i15;
        int i16;
        float f2;
        v[] b2;
        v vVar;
        int i17;
        int i18;
        if (i3 < 0) {
            throw new IllegalArgumentException("negative beforeContentPadding");
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("negative afterContentPadding");
        }
        if (i <= 0) {
            int n = n1.b.n(j);
            int m = n1.b.m(j);
            lazyLayoutItemAnimator.l(0, n, m, new ArrayList(), wVar.e(), wVar, z, false, i8, false, 0, 0, o, z0);
            long h = lazyLayoutItemAnimator.h();
            if (!n1.r.e(h, n1.r.b.a())) {
                n = n1.c.g(j, n1.r.g(h));
                m = n1.c.f(j, n1.r.f(h));
            }
            return new u(null, 0, false, 0.0f, (M0.C) qVar.invoke(Integer.valueOf(n), Integer.valueOf(m), a.a), false, o, dVar, i8, lVar, Da.v.n(), -i3, i2 + i4, 0, z2, z ? C.q.Vertical : C.q.Horizontal, i4, i5);
        }
        int round = Math.round(f);
        int i19 = i7 - round;
        if (i6 == 0 && i19 < 0) {
            round += i19;
            i19 = 0;
        }
        Da.m mVar2 = new Da.m();
        int i20 = -i3;
        int i21 = (i5 < 0 ? i5 : 0) + i20;
        int i22 = i19 + i21;
        int i23 = i6;
        while (i22 < 0 && i23 > 0) {
            i23--;
            x c = yVar.c(i23);
            mVar2.add(0, c);
            i22 += c.d();
        }
        if (i22 < i21) {
            round += i22;
            i22 = i21;
        }
        int i24 = i22 - i21;
        int i25 = i2 + i4;
        int i26 = i23;
        int e = Wa.n.e(i25, 0);
        int i27 = i26;
        int i28 = i24;
        int i29 = -i24;
        int i30 = 0;
        boolean z4 = false;
        while (true) {
            z3 = true;
            if (i30 >= mVar2.size()) {
                break;
            }
            if (i29 >= e) {
                mVar2.remove(i30);
                z4 = true;
            } else {
                i27++;
                i29 += ((x) mVar2.get(i30)).d();
                i30++;
            }
        }
        int i31 = i29;
        boolean z5 = z4;
        int i32 = i27;
        int i33 = i26;
        while (i32 < i && (i31 < e || i31 <= 0 || mVar2.isEmpty())) {
            int i34 = e;
            x c2 = yVar.c(i32);
            if (c2.e()) {
                break;
            }
            i31 += c2.d();
            if (i31 <= i21) {
                i17 = i21;
                i18 = i33;
                if (((v) Da.r.D0(c2.b())).getIndex() != i - 1) {
                    i28 -= c2.d();
                    i33 = i32 + 1;
                    z5 = true;
                }
                i32++;
                e = i34;
                i21 = i17;
            } else {
                i17 = i21;
                i18 = i33;
            }
            mVar2.add(c2);
            i33 = i18;
            i32++;
            e = i34;
            i21 = i17;
        }
        int i35 = i33;
        if (i31 < i2) {
            int i36 = i2 - i31;
            int i37 = i31 + i36;
            int i38 = i35;
            i10 = i28 - i36;
            while (i10 < i3 && i38 > 0) {
                int i39 = i38 - 1;
                x c3 = yVar.c(i39);
                mVar2.add(0, c3);
                i10 += c3.d();
                i38 = i39;
            }
            round += i36;
            if (i10 < 0) {
                round += i10;
                i9 = i37 + i10;
                i10 = 0;
            } else {
                i9 = i37;
            }
        } else {
            i9 = i31;
            i10 = i28;
        }
        float f3 = (Sa.c.a(Math.round(f)) != Sa.c.a(round) || Math.abs(Math.round(f)) < Math.abs(round)) ? f : round;
        if (i10 < 0) {
            throw new IllegalArgumentException("negative initial offset");
        }
        int i40 = -i10;
        x xVar3 = (x) mVar2.first();
        v vVar2 = (v) Da.r.V(xVar3.b());
        int index = vVar2 != null ? vVar2.getIndex() : 0;
        x xVar4 = (x) mVar2.k();
        if (xVar4 == null || (b2 = xVar4.b()) == null || (vVar = (v) Da.r.F0(b2)) == null) {
            xVar = xVar3;
            i11 = 0;
        } else {
            xVar = xVar3;
            i11 = vVar.getIndex();
        }
        int size = list.size();
        ArrayList arrayList = null;
        int i41 = i10;
        ArrayList arrayList2 = null;
        int i42 = 0;
        while (i42 < size) {
            int i43 = size;
            int intValue = ((Number) list.get(i42)).intValue();
            if (intValue < 0 || intValue >= index) {
                i16 = index;
                f2 = f3;
            } else {
                i16 = index;
                int d = yVar.d(intValue);
                f2 = f3;
                v c4 = wVar.c(intValue, 0, d, yVar.a(0, d));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                ArrayList arrayList3 = arrayList2;
                arrayList3.add(c4);
                arrayList2 = arrayList3;
            }
            i42++;
            size = i43;
            index = i16;
            f3 = f2;
        }
        int i44 = index;
        float f4 = f3;
        if (arrayList2 == null) {
            arrayList2 = Da.v.n();
        }
        ArrayList arrayList4 = arrayList2;
        int size2 = list.size();
        int i45 = 0;
        while (i45 < size2) {
            int intValue2 = ((Number) list.get(i45)).intValue();
            if (i11 + 1 > intValue2 || intValue2 >= i) {
                i15 = i11;
            } else {
                int d2 = yVar.d(intValue2);
                i15 = i11;
                v c5 = wVar.c(intValue2, 0, d2, yVar.a(0, d2));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                ArrayList arrayList5 = arrayList;
                arrayList5.add(c5);
                arrayList = arrayList5;
            }
            i45++;
            i11 = i15;
        }
        int i46 = i11;
        if (arrayList == null) {
            arrayList = Da.v.n();
        }
        ArrayList arrayList6 = arrayList;
        if (i3 > 0 || i5 < 0) {
            int size3 = mVar2.size();
            x xVar5 = xVar;
            int i47 = 0;
            int i48 = i41;
            while (i47 < size3) {
                int d3 = ((x) mVar2.get(i47)).d();
                if (i48 == 0 || d3 > i48 || i47 == Da.v.p(mVar2)) {
                    break;
                }
                i48 -= d3;
                i47++;
                xVar5 = (x) mVar2.get(i47);
            }
            xVar2 = xVar5;
            i12 = i48;
        } else {
            xVar2 = xVar;
            i12 = i41;
        }
        int l = z ? n1.b.l(j) : n1.c.g(j, i9);
        int f5 = z ? n1.c.f(j, i9) : n1.b.k(j);
        int i49 = i44;
        List b3 = b(mVar2, arrayList4, arrayList6, l, f5, i9, i2, i40, z, mVar, eVar, z2, dVar);
        int i50 = i9;
        lazyLayoutItemAnimator.l((int) f4, l, f5, b3, wVar.e(), wVar, z, false, i8, false, i12, i50, o, z0);
        long h2 = lazyLayoutItemAnimator.h();
        if (n1.r.e(h2, n1.r.b.a())) {
            i13 = l;
            i14 = f5;
        } else {
            int i51 = z ? f5 : l;
            i13 = n1.c.g(j, Math.max(l, n1.r.g(h2)));
            i14 = n1.c.f(j, Math.max(f5, n1.r.f(h2)));
            int i52 = z ? i14 : i13;
            if (i52 != i51) {
                int size4 = b3.size();
                for (int i53 = 0; i53 < size4; i53++) {
                    ((v) b3.get(i53)).v(i52);
                }
            }
        }
        if (i46 == i - 1 && i50 <= i2) {
            z3 = false;
        }
        M0.C c6 = (M0.C) qVar.invoke(Integer.valueOf(i13), Integer.valueOf(i14), new b(b3, c0));
        if (arrayList4.isEmpty() && arrayList6.isEmpty()) {
            list2 = b3;
        } else {
            List arrayList7 = new ArrayList(b3.size());
            int size5 = b3.size();
            int i54 = 0;
            while (i54 < size5) {
                Object obj = b3.get(i54);
                int index2 = ((v) obj).getIndex();
                int i55 = i49;
                if (i55 <= index2 && index2 <= i46) {
                    arrayList7.add(obj);
                }
                i54++;
                i49 = i55;
            }
            list2 = arrayList7;
        }
        return new u(xVar2, i12, z3, f4, c6, z5, o, dVar, i8, lVar, list2, i20, i25, i, z2, z ? C.q.Vertical : C.q.Horizontal, i4, i5);
    }
}
