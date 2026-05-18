package b0;

import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class i0 {
    public int[] a = new int[10];
    public int b;

    public final void a() {
        this.b = 0;
    }

    public final int b(int i) {
        int[] iArr = this.a;
        int min = Math.min(iArr.length, this.b);
        for (int i2 = 0; i2 < min; i2++) {
            if (iArr[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    public final int c() {
        return this.a[this.b - 1];
    }

    public final int d(int i) {
        return this.a[i];
    }

    public final int e() {
        return this.a[this.b - 2];
    }

    public final int f(int i) {
        int i2 = this.b - 1;
        return i2 >= 0 ? this.a[i2] : i;
    }

    public final int g() {
        int[] iArr = this.a;
        int i = this.b - 1;
        this.b = i;
        return iArr[i];
    }

    public final void h(int i) {
        int[] iArr = this.a;
        if (this.b >= iArr.length) {
            iArr = i();
        }
        int i2 = this.b;
        this.b = i2 + 1;
        iArr[i2] = i;
    }

    public final int[] i() {
        int[] iArr = this.a;
        int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
        kotlin.jvm.internal.t.f(copyOf, "copyOf(...)");
        this.a = copyOf;
        return copyOf;
    }
}
