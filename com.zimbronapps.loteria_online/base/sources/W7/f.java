package w7;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import s7.m;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class f extends g {

    public static class a extends AbstractList implements RandomAccess, Serializable {
        public final int[] a;
        public final int b;
        public final int c;

        public a(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(int i) {
            m.h(i, size());
            return Integer.valueOf(this.a[this.b + i]);
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer set(int i, Integer num) {
            m.h(i, size());
            int[] iArr = this.a;
            int i2 = this.b;
            int i3 = iArr[i2 + i];
            iArr[i2 + i] = ((Integer) m.j(num)).intValue();
            return Integer.valueOf(i3);
        }

        public int[] c() {
            return Arrays.copyOfRange(this.a, this.b, this.c);
        }

        public boolean contains(Object obj) {
            return (obj instanceof Integer) && f.a(this.a, ((Integer) obj).intValue(), this.b, this.c) != -1;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return super.equals(obj);
            }
            a aVar = (a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.a[this.b + i] != aVar.a[aVar.b + i]) {
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

        public int indexOf(Object obj) {
            int a;
            if (!(obj instanceof Integer) || (a = f.a(this.a, ((Integer) obj).intValue(), this.b, this.c)) < 0) {
                return -1;
            }
            return a - this.b;
        }

        public boolean isEmpty() {
            return false;
        }

        public int lastIndexOf(Object obj) {
            int b;
            if (!(obj instanceof Integer) || (b = f.b(this.a, ((Integer) obj).intValue(), this.b, this.c)) < 0) {
                return -1;
            }
            return b - this.b;
        }

        public int size() {
            return this.c - this.b;
        }

        public List subList(int i, int i2) {
            m.n(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            int[] iArr = this.a;
            int i3 = this.b;
            return new a(iArr, i + i3, i3 + i2);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
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

        public a(int[] iArr, int i, int i2) {
            this.a = iArr;
            this.b = i;
            this.c = i2;
        }
    }

    public static /* synthetic */ int a(int[] iArr, int i, int i2, int i3) {
        return j(iArr, i, i2, i3);
    }

    public static /* synthetic */ int b(int[] iArr, int i, int i2, int i3) {
        return k(iArr, i, i2, i3);
    }

    public static List c(int... iArr) {
        return iArr.length == 0 ? Collections.emptyList() : new a(iArr);
    }

    public static int d(long j) {
        int i = (int) j;
        m.g(((long) i) == j, "Out of range: %s", j);
        return i;
    }

    public static int e(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    public static int f(byte[] bArr) {
        m.f(bArr.length >= 4, "array too small: %s < %s", bArr.length, 4);
        return g(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    public static int g(byte b, byte b2, byte b3, byte b4) {
        return (b << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    public static int i(int[] iArr, int i) {
        return j(iArr, i, 0, iArr.length);
    }

    public static int j(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static int k(int[] iArr, int i, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            if (iArr[i4] == i) {
                return i4;
            }
        }
        return -1;
    }

    public static int l(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static int[] m(Collection collection) {
        if (collection instanceof a) {
            return ((a) collection).c();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = ((Number) m.j(array[i])).intValue();
        }
        return iArr;
    }

    public static Integer n(String str) {
        return o(str, 10);
    }

    public static Integer o(String str, int i) {
        Long d = h.d(str, i);
        if (d == null || d.longValue() != d.intValue()) {
            return null;
        }
        return Integer.valueOf(d.intValue());
    }

    public static int h(int i) {
        return i;
    }
}
