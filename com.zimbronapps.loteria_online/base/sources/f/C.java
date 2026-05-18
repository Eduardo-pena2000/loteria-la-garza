package F;

import o0.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c {
    public static final c a = new c();
    public static final e b = new k();
    public static final e c = new d();
    public static final m d = new l();
    public static final m e = new b();
    public static final f f = new c();
    public static final f g = new i();
    public static final f h = new h();
    public static final f i = new g();

    public static final class a {
        public static final a a = new a();
        public static final e b = new b();
        public static final e c = new a();
        public static final e d = new c();
        public static final e e = new e();
        public static final e f = new f();
        public static final e g = new d();

        public static final class a implements e {
            public void c(n1.d dVar, int i, int[] iArr, n1.t tVar, int[] iArr2) {
                c.a.i(i, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#Center";
            }
        }

        public static final class b implements e {
            public void c(n1.d dVar, int i, int[] iArr, n1.t tVar, int[] iArr2) {
                c.a.j(iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#Left";
            }
        }

        public static final class c implements e {
            public void c(n1.d dVar, int i, int[] iArr, n1.t tVar, int[] iArr2) {
                c.a.k(i, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#Right";
            }
        }

        public static final class d implements e {
            public void c(n1.d dVar, int i, int[] iArr, n1.t tVar, int[] iArr2) {
                c.a.l(i, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceAround";
            }
        }

        public static final class e implements e {
            public void c(n1.d dVar, int i, int[] iArr, n1.t tVar, int[] iArr2) {
                c.a.m(i, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceBetween";
            }
        }

        public static final class f implements e {
            public void c(n1.d dVar, int i, int[] iArr, n1.t tVar, int[] iArr2) {
                c.a.n(i, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceEvenly";
            }
        }

        public final e a() {
            return b;
        }

        public final e b() {
            return d;
        }

        public final e c() {
            return f;
        }

        public final f d(float f2) {
            return new j(f2, false, null, null);
        }
    }

    public static final class b implements m {
        public void b(n1.d dVar, int i, int[] iArr, int[] iArr2) {
            c.a.k(i, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Bottom";
        }
    }

    public static final class c implements f {
        public final float a = n1.h.g(0);

        public float a() {
            return this.a;
        }

        public void b(n1.d dVar, int i, int[] iArr, int[] iArr2) {
            c.a.i(i, iArr, iArr2, false);
        }

        public void c(n1.d dVar, int i, int[] iArr, n1.t tVar, int[] iArr2) {
            if (tVar == n1.t.a) {
                c.a.i(i, iArr, iArr2, false);
            } else {
                c.a.i(i, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#Center";
        }
    }

    public static final class d implements e {
        public void c(n1.d dVar, int i, int[] iArr, n1.t tVar, int[] iArr2) {
            if (tVar == n1.t.a) {
                c.a.k(i, iArr, iArr2, false);
            } else {
                c.a.j(iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#End";
        }
    }

    public interface e {
        default float a() {
            return n1.h.g(0);
        }

        void c(n1.d dVar, int i, int[] iArr, n1.t tVar, int[] iArr2);
    }

    public interface f extends e, m {
    }

    public static final class g implements f {
        public final float a = n1.h.g(0);

        public float a() {
            return this.a;
        }

        public void b(n1.d dVar, int i, int[] iArr, int[] iArr2) {
            c.a.l(i, iArr, iArr2, false);
        }

        public void c(n1.d dVar, int i, int[] iArr, n1.t tVar, int[] iArr2) {
            if (tVar == n1.t.a) {
                c.a.l(i, iArr, iArr2, false);
            } else {
                c.a.l(i, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#SpaceAround";
        }
    }

    public static final class h implements f {
        public final float a = n1.h.g(0);

        public float a() {
            return this.a;
        }

        public void b(n1.d dVar, int i, int[] iArr, int[] iArr2) {
            c.a.m(i, iArr, iArr2, false);
        }

        public void c(n1.d dVar, int i, int[] iArr, n1.t tVar, int[] iArr2) {
            if (tVar == n1.t.a) {
                c.a.m(i, iArr, iArr2, false);
            } else {
                c.a.m(i, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#SpaceBetween";
        }
    }

    public static final class i implements f {
        public final float a = n1.h.g(0);

        public float a() {
            return this.a;
        }

        public void b(n1.d dVar, int i, int[] iArr, int[] iArr2) {
            c.a.n(i, iArr, iArr2, false);
        }

        public void c(n1.d dVar, int i, int[] iArr, n1.t tVar, int[] iArr2) {
            if (tVar == n1.t.a) {
                c.a.n(i, iArr, iArr2, false);
            } else {
                c.a.n(i, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#SpaceEvenly";
        }
    }

    public static final class j implements f {
        public final float a;
        public final boolean b;
        public final Qa.p c;
        public final float d;

        public /* synthetic */ j(float f, boolean z, Qa.p pVar, kotlin.jvm.internal.k kVar) {
            this(f, z, pVar);
        }

        public float a() {
            return this.d;
        }

        public void b(n1.d dVar, int i, int[] iArr, int[] iArr2) {
            c(dVar, i, iArr, n1.t.a, iArr2);
        }

        public void c(n1.d dVar, int i, int[] iArr, n1.t tVar, int[] iArr2) {
            int i2;
            int i3;
            if (iArr.length == 0) {
                return;
            }
            int s0 = dVar.s0(this.a);
            boolean z = this.b && tVar == n1.t.b;
            c cVar = c.a;
            if (z) {
                int length = iArr.length - 1;
                i2 = 0;
                i3 = 0;
                while (-1 < length) {
                    int i4 = iArr[length];
                    int min = Math.min(i2, i - i4);
                    iArr2[length] = min;
                    int min2 = Math.min(s0, (i - min) - i4);
                    int i5 = iArr2[length] + i4 + min2;
                    length--;
                    i3 = min2;
                    i2 = i5;
                }
            } else {
                int length2 = iArr.length;
                int i6 = 0;
                i2 = 0;
                i3 = 0;
                int i7 = 0;
                while (i6 < length2) {
                    int i8 = iArr[i6];
                    int min3 = Math.min(i2, i - i8);
                    iArr2[i7] = min3;
                    int min4 = Math.min(s0, (i - min3) - i8);
                    int i9 = iArr2[i7] + i8 + min4;
                    i6++;
                    i7++;
                    i3 = min4;
                    i2 = i9;
                }
            }
            int i10 = i2 - i3;
            Qa.p pVar = this.c;
            if (pVar == null || i10 >= i) {
                return;
            }
            int intValue = ((Number) pVar.invoke(Integer.valueOf(i - i10), tVar)).intValue();
            int length3 = iArr2.length;
            for (int i11 = 0; i11 < length3; i11++) {
                iArr2[i11] = iArr2[i11] + intValue;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return n1.h.i(this.a, jVar.a) && this.b == jVar.b && kotlin.jvm.internal.t.c(this.c, jVar.c);
        }

        public int hashCode() {
            int k = ((n1.h.k(this.a) * 31) + Boolean.hashCode(this.b)) * 31;
            Qa.p pVar = this.c;
            return k + (pVar == null ? 0 : pVar.hashCode());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.b ? "" : "Absolute");
            sb.append("Arrangement#spacedAligned(");
            sb.append(n1.h.l(this.a));
            sb.append(", ");
            sb.append(this.c);
            sb.append(')');
            return sb.toString();
        }

        public j(float f, boolean z, Qa.p pVar) {
            this.a = f;
            this.b = z;
            this.c = pVar;
            this.d = f;
        }
    }

    public static final class k implements e {
        public void c(n1.d dVar, int i, int[] iArr, n1.t tVar, int[] iArr2) {
            if (tVar == n1.t.a) {
                c.a.j(iArr, iArr2, false);
            } else {
                c.a.k(i, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#Start";
        }
    }

    public static final class l implements m {
        public void b(n1.d dVar, int i, int[] iArr, int[] iArr2) {
            c.a.j(iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Top";
        }
    }

    public interface m {
        default float a() {
            return n1.h.g(0);
        }

        void b(n1.d dVar, int i, int[] iArr, int[] iArr2);
    }

    public static final class n extends kotlin.jvm.internal.u implements Qa.p {
        public static final n a = new n();

        public n() {
            super(2);
        }

        public final Integer a(int i, n1.t tVar) {
            return Integer.valueOf(o0.e.a.k().a(0, i, tVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).intValue(), (n1.t) obj2);
        }
    }

    public static final class o extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ e.b a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(e.b bVar) {
            super(2);
            this.a = bVar;
        }

        public final Integer a(int i, n1.t tVar) {
            return Integer.valueOf(this.a.a(0, i, tVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).intValue(), (n1.t) obj2);
        }
    }

    public static final class p extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ e.c a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(e.c cVar) {
            super(2);
            this.a = cVar;
        }

        public final Integer a(int i, n1.t tVar) {
            return Integer.valueOf(this.a.a(0, i));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).intValue(), (n1.t) obj2);
        }
    }

    public final m a() {
        return e;
    }

    public final f b() {
        return f;
    }

    public final e c() {
        return c;
    }

    public final f d() {
        return i;
    }

    public final f e() {
        return h;
    }

    public final f f() {
        return g;
    }

    public final e g() {
        return b;
    }

    public final m h() {
        return d;
    }

    public final void i(int i2, int[] iArr, int[] iArr2, boolean z) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float f2 = (i2 - i4) / 2;
        if (!z) {
            int length = iArr.length;
            int i6 = 0;
            while (i3 < length) {
                int i7 = iArr[i3];
                iArr2[i6] = Math.round(f2);
                f2 += i7;
                i3++;
                i6++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i8 = iArr[length2];
            iArr2[length2] = Math.round(f2);
            f2 += i8;
        }
    }

    public final void j(int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        if (!z) {
            int length = iArr.length;
            int i3 = 0;
            int i4 = 0;
            while (i2 < length) {
                int i5 = iArr[i2];
                iArr2[i3] = i4;
                i4 += i5;
                i2++;
                i3++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i6 = iArr[length2];
            iArr2[length2] = i2;
            i2 += i6;
        }
    }

    public final void k(int i2, int[] iArr, int[] iArr2, boolean z) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        int i6 = i2 - i4;
        if (!z) {
            int length = iArr.length;
            int i7 = 0;
            while (i3 < length) {
                int i8 = iArr[i3];
                iArr2[i7] = i6;
                i6 += i8;
                i3++;
                i7++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i9 = iArr[length2];
            iArr2[length2] = i6;
            i6 += i9;
        }
    }

    public final void l(int i2, int[] iArr, int[] iArr2, boolean z) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float length = !(iArr.length == 0) ? (i2 - i4) / iArr.length : 0.0f;
        float f2 = length / 2;
        if (z) {
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i6 = iArr[length2];
                iArr2[length2] = Math.round(f2);
                f2 += i6 + length;
            }
            return;
        }
        int length3 = iArr.length;
        int i7 = 0;
        while (i3 < length3) {
            int i8 = iArr[i3];
            iArr2[i7] = Math.round(f2);
            f2 += i8 + length;
            i3++;
            i7++;
        }
    }

    public final void m(int i2, int[] iArr, int[] iArr2, boolean z) {
        if (iArr.length == 0) {
            return;
        }
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float max = (i2 - i4) / Math.max(Da.r.Y(iArr), 1);
        float f2 = (z && iArr.length == 1) ? max : 0.0f;
        if (z) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i6 = iArr[length];
                iArr2[length] = Math.round(f2);
                f2 += i6 + max;
            }
            return;
        }
        int length2 = iArr.length;
        int i7 = 0;
        while (i3 < length2) {
            int i8 = iArr[i3];
            iArr2[i7] = Math.round(f2);
            f2 += i8 + max;
            i3++;
            i7++;
        }
    }

    public final void n(int i2, int[] iArr, int[] iArr2, boolean z) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float length = (i2 - i4) / (iArr.length + 1);
        if (z) {
            float f2 = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i6 = iArr[length2];
                iArr2[length2] = Math.round(f2);
                f2 += i6 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f3 = length;
        int i7 = 0;
        while (i3 < length3) {
            int i8 = iArr[i3];
            iArr2[i7] = Math.round(f3);
            f3 += i8 + length;
            i3++;
            i7++;
        }
    }

    public final f o(float f2) {
        return new j(f2, true, n.a, null);
    }

    public final e p(float f2, e.b bVar) {
        return new j(f2, true, new o(bVar), null);
    }

    public final m q(float f2, e.c cVar) {
        return new j(f2, false, new p(cVar), null);
    }
}
