package O0;

import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class z {
    public int[] a;
    public int b;

    public z(int i) {
        this.a = new int[i];
    }

    public final boolean a(int i, int i2) {
        int[] iArr = this.a;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        if (i3 >= i4) {
            return i3 == i4 && iArr[i + 1] <= iArr[i2 + 1];
        }
        return true;
    }

    public final int b(int i) {
        return this.a[i];
    }

    public final int c() {
        return this.b;
    }

    public final boolean d() {
        return this.b != 0;
    }

    public final int e(int i, int i2, int i3) {
        int i4 = i - i3;
        while (i < i2) {
            if (a(i, i2)) {
                i4 += i3;
                l(i4, i);
            }
            i += i3;
        }
        int i5 = i4 + i3;
        l(i5, i2);
        return i5;
    }

    public final int f() {
        int[] iArr = this.a;
        int i = this.b - 1;
        this.b = i;
        return iArr[i];
    }

    public final void g(int i, int i2, int i3) {
        int i4 = this.b;
        int[] iArr = this.a;
        int i5 = i4 + 3;
        if (i5 >= iArr.length) {
            iArr = j(iArr);
        }
        iArr[i4] = i + i3;
        iArr[i4 + 1] = i2 + i3;
        iArr[i4 + 2] = i3;
        this.b = i5;
    }

    public final void h(int i, int i2, int i3, int i4) {
        int i5 = this.b;
        int[] iArr = this.a;
        int i6 = i5 + 4;
        if (i6 >= iArr.length) {
            iArr = j(iArr);
        }
        iArr[i5] = i;
        iArr[i5 + 1] = i2;
        iArr[i5 + 2] = i3;
        iArr[i5 + 3] = i4;
        this.b = i6;
    }

    public final void i(int i, int i2, int i3) {
        if (i < i2) {
            int e = e(i, i2, i3);
            i(i, e - i3, i3);
            i(e + i3, i2, i3);
        }
    }

    public final int[] j(int[] iArr) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
        kotlin.jvm.internal.t.f(copyOf, "copyOf(...)");
        this.a = copyOf;
        return copyOf;
    }

    public final void k() {
        int i = this.b;
        if (!(i % 3 == 0)) {
            L0.a.b("Array size not a multiple of 3");
        }
        if (i > 3) {
            i(0, i - 3, 3);
        }
    }

    public final void l(int i, int i2) {
        int[] iArr = this.a;
        b0.a(iArr, i, i2);
        b0.a(iArr, i + 1, i2 + 1);
        b0.a(iArr, i + 2, i2 + 2);
    }
}
