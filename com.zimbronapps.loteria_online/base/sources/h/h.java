package H;

import F.L;
import F.c;
import b0.g1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class h {

    public static final class a extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ H.b a;
        public final /* synthetic */ androidx.compose.ui.e b;
        public final /* synthetic */ I c;
        public final /* synthetic */ L d;
        public final /* synthetic */ boolean e;
        public final /* synthetic */ c.m f;
        public final /* synthetic */ c.e g;
        public final /* synthetic */ C.n h;
        public final /* synthetic */ boolean i;
        public final /* synthetic */ Qa.l j;
        public final /* synthetic */ int k;
        public final /* synthetic */ int l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(H.b bVar, androidx.compose.ui.e eVar, I i, L l, boolean z, c.m mVar, c.e eVar2, C.n nVar, boolean z2, Qa.l lVar, int i2, int i3) {
            super(2);
            this.a = bVar;
            this.b = eVar;
            this.c = i;
            this.d = l;
            this.e = z;
            this.f = mVar;
            this.g = eVar2;
            this.h = nVar;
            this.i = z2;
            this.j = lVar;
            this.k = i2;
            this.l = i3;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return Ca.I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            h.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, mVar, g1.a(this.k | 1), this.l);
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ L a;
        public final /* synthetic */ H.b b;
        public final /* synthetic */ c.e c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(L l, H.b bVar, c.e eVar) {
            super(2);
            this.a = l;
            this.b = bVar;
            this.c = eVar;
        }

        public final E a(n1.d dVar, long j) {
            if (n1.b.l(j) == Integer.MAX_VALUE) {
                throw new IllegalArgumentException("LazyVerticalGrid's width should be bound by parent.");
            }
            L l = this.a;
            n1.t tVar = n1.t.a;
            int l2 = n1.b.l(j) - dVar.s0(n1.h.g(androidx.compose.foundation.layout.f.g(l, tVar) + androidx.compose.foundation.layout.f.f(this.a, tVar)));
            H.b bVar = this.b;
            c.e eVar = this.c;
            int[] K0 = Da.D.K0(bVar.a(dVar, l2, dVar.s0(eVar.a())));
            int[] iArr = new int[K0.length];
            eVar.c(dVar, l2, K0, tVar, iArr);
            return new E(K0, iArr);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((n1.d) obj, ((n1.b) obj2).r());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(H.b r28, androidx.compose.ui.e r29, H.I r30, F.L r31, boolean r32, F.c.m r33, F.c.e r34, C.n r35, boolean r36, Qa.l r37, b0.m r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 619
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: H.h.a(H.b, androidx.compose.ui.e, H.I, F.L, boolean, F.c$m, F.c$e, C.n, boolean, Qa.l, b0.m, int, int):void");
    }

    public static final /* synthetic */ List b(int i, int i2, int i3) {
        return c(i, i2, i3);
    }

    public static final List c(int i, int i2, int i3) {
        int i4 = i - (i3 * (i2 - 1));
        int i5 = i4 / i2;
        int i6 = i4 % i2;
        ArrayList arrayList = new ArrayList(i2);
        int i7 = 0;
        while (i7 < i2) {
            arrayList.add(Integer.valueOf((i7 < i6 ? 1 : 0) + i5));
            i7++;
        }
        return arrayList;
    }

    public static final F d(H.b bVar, c.e eVar, L l, b0.m mVar, int i) {
        if (b0.w.L()) {
            b0.w.U(1632454918, i, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:148)");
        }
        boolean z = ((((i & 14) ^ 6) > 4 && mVar.U(bVar)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && mVar.U(eVar)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && mVar.U(l)) || (i & 384) == 256);
        Object C = mVar.C();
        if (z || C == b0.m.a.a()) {
            C = new d(new b(l, bVar, eVar));
            mVar.t(C);
        }
        F f = (F) C;
        if (b0.w.L()) {
            b0.w.T();
        }
        return f;
    }
}
