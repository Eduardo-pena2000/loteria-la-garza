package O0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class b0 {
    public static final /* synthetic */ void a(int[] iArr, int i, int i2) {
        i(iArr, i, i2);
    }

    public static final void b(z zVar, q qVar) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < zVar.c()) {
            int i4 = i + 2;
            int b = zVar.b(i) - zVar.b(i4);
            int b2 = zVar.b(i + 1) - zVar.b(i4);
            int b3 = zVar.b(i4);
            i += 3;
            while (i2 < b) {
                qVar.b(i3, i2);
                i2++;
            }
            while (i3 < b2) {
                qVar.d(i3);
                i3++;
            }
            while (true) {
                int i5 = b3 - 1;
                if (b3 > 0) {
                    qVar.e(i2, i3);
                    i2++;
                    i3++;
                    b3 = i5;
                }
            }
        }
    }

    public static final boolean c(int i, int i2, int i3, int i4, q qVar, int[] iArr, int[] iArr2, int i5, int[] iArr3) {
        int b;
        int i6;
        int i7;
        int i8 = (i2 - i) - (i4 - i3);
        boolean z = (i8 & 1) == 0;
        int i9 = -i5;
        for (int i10 = i9; i10 <= i5; i10 += 2) {
            if (i10 == i9 || (i10 != i5 && f.b(iArr2, i10 + 1) < f.b(iArr2, i10 - 1))) {
                b = f.b(iArr2, i10 + 1);
                i6 = b;
            } else {
                b = f.b(iArr2, i10 - 1);
                i6 = b - 1;
            }
            int i11 = i4 - ((i2 - i6) - i10);
            int i12 = ((i5 != 0 ? 1 : 0) & (i6 == b ? 1 : 0)) + i11;
            while (i6 > i && i11 > i3) {
                if (!qVar.c(i6 - 1, i11 - 1)) {
                    break;
                }
                i6--;
                i11--;
            }
            f.d(iArr2, i10, i6);
            if (z && (i7 = i8 - i10) >= i9 && i7 <= i5) {
                if (f.b(iArr, i7) >= i6) {
                    f(i6, i11, b, i12, true, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    public static final z d(int i, int i2, q qVar) {
        int i3 = ((i + i2) + 1) / 2;
        z zVar = new z(i3 * 3);
        z zVar2 = new z(i3 * 4);
        zVar2.h(0, i, 0, i2);
        int i4 = (i3 * 2) + 1;
        int[] a = f.a(new int[i4]);
        int[] a2 = f.a(new int[i4]);
        int[] b = C0.b(new int[5]);
        while (zVar2.d()) {
            int f = zVar2.f();
            int f2 = zVar2.f();
            int f3 = zVar2.f();
            int f4 = zVar2.f();
            int[] iArr = b;
            if (h(f4, f3, f2, f, qVar, a, a2, iArr)) {
                if (Math.min(iArr[2] - iArr[0], iArr[3] - iArr[1]) > 0) {
                    C0.a(iArr, zVar);
                }
                zVar2.h(f4, iArr[0], f2, iArr[1]);
                zVar2.h(iArr[2], f3, iArr[3], f);
                b = iArr;
            } else {
                b = iArr;
            }
        }
        zVar.k();
        zVar.g(i, i2, 0);
        return zVar;
    }

    public static final void e(int i, int i2, q qVar) {
        b(d(i, i2, qVar), qVar);
    }

    public static final void f(int i, int i2, int i3, int i4, boolean z, int[] iArr) {
        if (iArr.length < 5) {
            return;
        }
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        iArr[3] = i4;
        iArr[4] = z ? 1 : 0;
    }

    public static final boolean g(int i, int i2, int i3, int i4, q qVar, int[] iArr, int[] iArr2, int i5, int[] iArr3) {
        int b;
        int i6;
        int i7;
        int i8 = (i2 - i) - (i4 - i3);
        boolean z = (Math.abs(i8) & 1) == 1;
        int i9 = -i5;
        for (int i10 = i9; i10 <= i5; i10 += 2) {
            if (i10 == i9 || (i10 != i5 && f.b(iArr, i10 + 1) > f.b(iArr, i10 - 1))) {
                b = f.b(iArr, i10 + 1);
                i6 = b;
            } else {
                b = f.b(iArr, i10 - 1);
                i6 = b + 1;
            }
            int i11 = (i3 + (i6 - i)) - i10;
            int i12 = i11 - ((i5 != 0 ? 1 : 0) & (i6 == b ? 1 : 0));
            while (i6 < i2 && i11 < i4) {
                if (!qVar.c(i6, i11)) {
                    break;
                }
                i6++;
                i11++;
            }
            f.d(iArr, i10, i6);
            if (z && (i7 = i8 - i10) >= i9 + 1 && i7 <= i5 - 1) {
                if (f.b(iArr2, i7) <= i6) {
                    f(b, i12, i6, i11, false, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean h(int i, int i2, int i3, int i4, q qVar, int[] iArr, int[] iArr2, int[] iArr3) {
        int i5 = i2 - i;
        int i6 = i4 - i3;
        if (i5 >= 1 && i6 >= 1) {
            int i7 = ((i5 + i6) + 1) / 2;
            f.d(iArr, 1, i);
            f.d(iArr2, 1, i2);
            int i8 = 0;
            while (i8 < i7) {
                int i9 = i8;
                if (g(i, i2, i3, i4, qVar, iArr, iArr2, i8, iArr3) || c(i, i2, i3, i4, qVar, iArr, iArr2, i9, iArr3)) {
                    return true;
                }
                i8 = i9 + 1;
            }
        }
        return false;
    }

    public static final void i(int[] iArr, int i, int i2) {
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
    }
}
