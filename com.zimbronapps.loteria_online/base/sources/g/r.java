package G;

import Ca.I;
import F.c;
import I.M;
import androidx.compose.ui.layout.q;
import b0.C0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class r {

    public static final class a extends kotlin.jvm.internal.u implements Qa.l {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((q.a) obj);
            return I.a;
        }

        public final void invoke(q.a aVar) {
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ List a;
        public final /* synthetic */ t b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ C0 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List list, t tVar, boolean z, C0 c0) {
            super(1);
            this.a = list;
            this.b = tVar;
            this.c = z;
            this.d = c0;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((q.a) obj);
            return I.a;
        }

        public final void invoke(q.a aVar) {
            List list = this.a;
            t tVar = this.b;
            boolean z = this.c;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                t tVar2 = (t) list.get(i);
                if (tVar2 != tVar) {
                    tVar2.q(aVar, z);
                }
            }
            t tVar3 = this.b;
            if (tVar3 != null) {
                tVar3.q(aVar, this.c);
            }
            M.a(this.d);
        }
    }

    public static final List a(List list, List list2, List list3, int i, int i2, int i3, int i4, int i5, boolean z, c.m mVar, c.e eVar, boolean z2, n1.d dVar) {
        int i6 = z ? i2 : i;
        boolean z3 = i3 < Math.min(i6, i4);
        if (z3 && i5 != 0) {
            throw new IllegalStateException("non-zero itemsScrollOffset");
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (!z3) {
            int size = list2.size();
            int i7 = i5;
            for (int i8 = 0; i8 < size; i8++) {
                t tVar = (t) list2.get(i8);
                i7 -= tVar.j();
                tVar.r(i7, i, i2);
                arrayList.add(tVar);
            }
            int size2 = list.size();
            int i9 = i5;
            for (int i10 = 0; i10 < size2; i10++) {
                t tVar2 = (t) list.get(i10);
                tVar2.r(i9, i, i2);
                arrayList.add(tVar2);
                i9 += tVar2.j();
            }
            int size3 = list3.size();
            for (int i11 = 0; i11 < size3; i11++) {
                t tVar3 = (t) list3.get(i11);
                tVar3.r(i9, i, i2);
                arrayList.add(tVar3);
                i9 += tVar3.j();
            }
        } else {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                throw new IllegalArgumentException("no extra items");
            }
            int size4 = list.size();
            int[] iArr = new int[size4];
            for (int i12 = 0; i12 < size4; i12++) {
                iArr[i12] = ((t) list.get(b(i12, z2, size4))).getSize();
            }
            int[] iArr2 = new int[size4];
            for (int i13 = 0; i13 < size4; i13++) {
                iArr2[i13] = 0;
            }
            if (z) {
                if (mVar == null) {
                    throw new IllegalArgumentException("null verticalArrangement when isVertical == true");
                }
                mVar.b(dVar, i6, iArr, iArr2);
            } else {
                if (eVar == null) {
                    throw new IllegalArgumentException("null horizontalArrangement when isVertical == false");
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
                    int i14 = iArr2[f];
                    t tVar4 = (t) list.get(b(f, z2, size4));
                    if (z2) {
                        i14 = (i6 - i14) - tVar4.getSize();
                    }
                    tVar4.r(i14, i, i2);
                    arrayList.add(tVar4);
                    if (f == g) {
                        break;
                    }
                    f += h;
                }
            }
        }
        return arrayList;
    }

    public static final int b(int i, boolean z, int i2) {
        return !z ? i : (i2 - i) - 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
    
        r5 = (G.l) r5.get(r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.List c(java.util.List r18, G.u r19, int r20, int r21, java.util.List r22, float r23, boolean r24, G.q r25) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: G.r.c(java.util.List, G.u, int, int, java.util.List, float, boolean, G.q):java.util.List");
    }

    public static final List d(int i, u uVar, int i2, List list) {
        int max = Math.max(0, i - i2);
        int i3 = i - 1;
        ArrayList arrayList = null;
        if (max <= i3) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(u.e(uVar, i3, 0L, 2, null));
                if (i3 == max) {
                    break;
                }
                i3--;
            }
        }
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i4 = size - 1;
                int intValue = ((Number) list.get(size)).intValue();
                if (intValue < max) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(u.e(uVar, intValue, 0L, 2, null));
                }
                if (i4 < 0) {
                    break;
                }
                size = i4;
            }
        }
        return arrayList == null ? Da.v.n() : arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x037d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final G.s e(int r40, G.u r41, int r42, int r43, int r44, int r45, int r46, int r47, float r48, long r49, boolean r51, java.util.List r52, F.c.m r53, F.c.e r54, boolean r55, n1.d r56, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator r57, int r58, java.util.List r59, boolean r60, boolean r61, G.q r62, cb.O r63, b0.C0 r64, v0.Z0 r65, Qa.q r66) {
        /*
            Method dump skipped, instructions count: 1107
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: G.r.e(int, G.u, int, int, int, int, int, int, float, long, boolean, java.util.List, F.c$m, F.c$e, boolean, n1.d, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator, int, java.util.List, boolean, boolean, G.q, cb.O, b0.C0, v0.Z0, Qa.q):G.s");
    }
}
