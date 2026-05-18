package w7;

import java.io.Serializable;
import java.util.Arrays;
import s7.m;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class e implements Serializable {
    public static final e d = new e(new int[0]);
    public final int[] a;
    public final transient int b;
    public final int c;

    public e(int[] iArr) {
        this(iArr, 0, iArr.length);
    }

    public static e a(int[] iArr) {
        return iArr.length == 0 ? d : new e(Arrays.copyOf(iArr, iArr.length));
    }

    public static e e() {
        return d;
    }

    public int b(int i) {
        m.h(i, d());
        return this.a[this.b + i];
    }

    public boolean c() {
        return this.c == this.b;
    }

    public int d() {
        return this.c - this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (d() != eVar.d()) {
            return false;
        }
        for (int i = 0; i < d(); i++) {
            if (b(i) != eVar.b(i)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = this.b; i2 < this.c; i2++) {
            i = (i * 31) + f.h(this.a[i2]);
        }
        return i;
    }

    public String toString() {
        if (c()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(d() * 5);
        sb.append('[');
        sb.append(this.a[this.b]);
        int i = this.b;
        while (true) {
            i++;
            if (i >= this.c) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(this.a[i]);
        }
    }

    public e(int[] iArr, int i, int i2) {
        this.a = iArr;
        this.b = i;
        this.c = i2;
    }
}
