package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.n0;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class i0 {
    public static final i0 f = new i0(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d;
    public boolean e;

    public i0() {
        this(0, new int[8], new Object[8], true);
    }

    public static i0 c() {
        return f;
    }

    public static int f(int[] iArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        return i2;
    }

    public static int g(Object[] objArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + objArr[i3].hashCode();
        }
        return i2;
    }

    public static i0 j(i0 i0Var, i0 i0Var2) {
        int i = i0Var.a + i0Var2.a;
        int[] copyOf = Arrays.copyOf(i0Var.b, i);
        System.arraycopy(i0Var2.b, 0, copyOf, i0Var.a, i0Var2.a);
        Object[] copyOf2 = Arrays.copyOf(i0Var.c, i);
        System.arraycopy(i0Var2.c, 0, copyOf2, i0Var.a, i0Var2.a);
        return new i0(i, copyOf, copyOf2, true);
    }

    public static i0 k() {
        return new i0();
    }

    public static boolean l(Object[] objArr, Object[] objArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!objArr[i2].equals(objArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    public static boolean o(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static void q(int i, Object obj, n0 n0Var) {
        int a = m0.a(i);
        int b = m0.b(i);
        if (b == 0) {
            n0Var.u(a, ((Long) obj).longValue());
            return;
        }
        if (b == 1) {
            n0Var.s(a, ((Long) obj).longValue());
            return;
        }
        if (b == 2) {
            n0Var.K(a, (f) obj);
            return;
        }
        if (b != 3) {
            if (b != 5) {
                throw new RuntimeException(v.e());
            }
            n0Var.c(a, ((Integer) obj).intValue());
        } else if (n0Var.t() == n0.a.a) {
            n0Var.x(a);
            ((i0) obj).r(n0Var);
            n0Var.C(a);
        } else {
            n0Var.C(a);
            ((i0) obj).r(n0Var);
            n0Var.x(a);
        }
    }

    public void a() {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void b(int i) {
        int[] iArr = this.b;
        if (i > iArr.length) {
            int i2 = this.a;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.b = Arrays.copyOf(iArr, i);
            this.c = Arrays.copyOf(this.c, i);
        }
    }

    public int d() {
        int R;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int a = m0.a(i4);
            int b = m0.b(i4);
            if (b == 0) {
                R = i.R(a, ((Long) this.c[i3]).longValue());
            } else if (b == 1) {
                R = i.n(a, ((Long) this.c[i3]).longValue());
            } else if (b == 2) {
                R = i.f(a, (f) this.c[i3]);
            } else if (b == 3) {
                R = (i.O(a) * 2) + ((i0) this.c[i3]).d();
            } else {
                if (b != 5) {
                    throw new IllegalStateException(v.e());
                }
                R = i.l(a, ((Integer) this.c[i3]).intValue());
            }
            i2 += R;
        }
        this.d = i2;
        return i2;
    }

    public int e() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            i2 += i.D(m0.a(this.b[i3]), (f) this.c[i3]);
        }
        this.d = i2;
        return i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        int i = this.a;
        return i == i0Var.a && o(this.b, i0Var.b, i) && l(this.c, i0Var.c, this.a);
    }

    public void h() {
        if (this.e) {
            this.e = false;
        }
    }

    public int hashCode() {
        int i = this.a;
        return ((((527 + i) * 31) + f(this.b, i)) * 31) + g(this.c, this.a);
    }

    public i0 i(i0 i0Var) {
        if (i0Var.equals(c())) {
            return this;
        }
        a();
        int i = this.a + i0Var.a;
        b(i);
        System.arraycopy(i0Var.b, 0, this.b, this.a, i0Var.a);
        System.arraycopy(i0Var.c, 0, this.c, this.a, i0Var.a);
        this.a = i;
        return this;
    }

    public final void m(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.a; i2++) {
            M.d(sb, i, String.valueOf(m0.a(this.b[i2])), this.c[i2]);
        }
    }

    public void n(int i, Object obj) {
        a();
        b(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public void p(n0 n0Var) {
        if (n0Var.t() == n0.a.b) {
            for (int i = this.a - 1; i >= 0; i--) {
                n0Var.b(m0.a(this.b[i]), this.c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.a; i2++) {
            n0Var.b(m0.a(this.b[i2]), this.c[i2]);
        }
    }

    public void r(n0 n0Var) {
        if (this.a == 0) {
            return;
        }
        if (n0Var.t() == n0.a.a) {
            for (int i = 0; i < this.a; i++) {
                q(this.b[i], this.c[i], n0Var);
            }
            return;
        }
        for (int i2 = this.a - 1; i2 >= 0; i2--) {
            q(this.b[i2], this.c[i2], n0Var);
        }
    }

    public i0(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }
}
