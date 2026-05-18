package j3;

import M2.G;
import M2.H;
import P2.K;
import T2.X0;
import T2.Y0;
import android.util.Pair;
import g3.Y;
import g3.w;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class z extends C {
    public a c;

    public static final class a {
        public final int a;
        public final String[] b;
        public final int[] c;
        public final Y[] d;
        public final int[] e;
        public final int[][][] f;
        public final Y g;

        public a(String[] strArr, int[] iArr, Y[] yArr, int[] iArr2, int[][][] iArr3, Y y) {
            this.b = strArr;
            this.c = iArr;
            this.d = yArr;
            this.f = iArr3;
            this.e = iArr2;
            this.g = y;
            this.a = iArr.length;
        }

        public int a(int i, int i2, boolean z) {
            int i3 = this.d[i].b(i2).a;
            int[] iArr = new int[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                int g = g(i, i2, i5);
                if (g == 4 || (z && g == 3)) {
                    iArr[i4] = i5;
                    i4++;
                }
            }
            return b(i, i2, Arrays.copyOf(iArr, i4));
        }

        public int b(int i, int i2, int[] iArr) {
            int i3 = 0;
            int i4 = 16;
            String str = null;
            boolean z = false;
            int i5 = 0;
            while (i3 < iArr.length) {
                String str2 = this.d[i].b(i2).a(iArr[i3]).n;
                int i6 = i5 + 1;
                if (i5 == 0) {
                    str = str2;
                } else {
                    z |= !K.c(str, str2);
                }
                i4 = Math.min(i4, X0.s(this.f[i][i2][i3]));
                i3++;
                i5 = i6;
            }
            return z ? Math.min(i4, this.e[i]) : i4;
        }

        public int c(int i, int i2, int i3) {
            return this.f[i][i2][i3];
        }

        public int d() {
            return this.a;
        }

        public int e(int i) {
            return this.c[i];
        }

        public Y f(int i) {
            return this.d[i];
        }

        public int g(int i, int i2, int i3) {
            return X0.Q(c(i, i2, i3));
        }

        public Y h() {
            return this.g;
        }
    }

    public static int n(X0[] x0Arr, H h, int[] iArr, boolean z) {
        int length = x0Arr.length;
        int i = 0;
        boolean z2 = true;
        for (int i2 = 0; i2 < x0Arr.length; i2++) {
            X0 x0 = x0Arr[i2];
            int i3 = 0;
            for (int i4 = 0; i4 < h.a; i4++) {
                i3 = Math.max(i3, X0.Q(x0.a(h.a(i4))));
            }
            boolean z3 = iArr[i2] == 0;
            if (i3 > i || (i3 == i && z && !z2 && z3)) {
                length = i2;
                z2 = z3;
                i = i3;
            }
        }
        return length;
    }

    public static int[] o(X0 x0, H h) {
        int[] iArr = new int[h.a];
        for (int i = 0; i < h.a; i++) {
            iArr[i] = x0.a(h.a(i));
        }
        return iArr;
    }

    public static int[] p(X0[] x0Arr) {
        int length = x0Arr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = x0Arr[i].M();
        }
        return iArr;
    }

    public final void i(Object obj) {
        this.c = (a) obj;
    }

    public final D k(X0[] x0Arr, Y y, w.b bVar, G g) {
        int[] iArr = new int[x0Arr.length + 1];
        int length = x0Arr.length + 1;
        H[][] hArr = new H[length][];
        int[][][] iArr2 = new int[x0Arr.length + 1][][];
        for (int i = 0; i < length; i++) {
            int i2 = y.a;
            hArr[i] = new H[i2];
            iArr2[i] = new int[i2][];
        }
        int[] p = p(x0Arr);
        for (int i3 = 0; i3 < y.a; i3++) {
            H b = y.b(i3);
            int n = n(x0Arr, b, iArr, b.c == 5);
            int[] o = n == x0Arr.length ? new int[b.a] : o(x0Arr[n], b);
            int i4 = iArr[n];
            hArr[n][i4] = b;
            iArr2[n][i4] = o;
            iArr[n] = i4 + 1;
        }
        Y[] yArr = new Y[x0Arr.length];
        String[] strArr = new String[x0Arr.length];
        int[] iArr3 = new int[x0Arr.length];
        for (int i5 = 0; i5 < x0Arr.length; i5++) {
            int i6 = iArr[i5];
            yArr[i5] = new Y((H[]) K.P0(hArr[i5], i6));
            iArr2[i5] = (int[][]) K.P0(iArr2[i5], i6);
            strArr[i5] = x0Arr[i5].getName();
            iArr3[i5] = x0Arr[i5].g();
        }
        a aVar = new a(strArr, iArr3, yArr, p, iArr2, new Y((H[]) K.P0(hArr[x0Arr.length], iArr[x0Arr.length])));
        Pair q = q(aVar, iArr2, p, bVar, g);
        return new D((Y0[]) q.first, (x[]) q.second, B.a(aVar, (A[]) q.second), aVar);
    }

    public abstract Pair q(a aVar, int[][][] iArr, int[] iArr2, w.b bVar, G g);
}
