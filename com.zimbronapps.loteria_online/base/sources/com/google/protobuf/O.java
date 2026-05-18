package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class o extends a implements Internal.IntList, RandomAccess, H {
    public static final o c = new o(new int[0], 0, false);
    public int[] a;
    public int b;

    public o() {
        this(new int[10], 0, true);
    }

    public static o e() {
        return c;
    }

    private void f(int i) {
        if (i < 0 || i >= this.b) {
            throw new IndexOutOfBoundsException(h(i));
        }
    }

    private String h(int i) {
        return "Index:" + i + ", Size:" + this.b;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void add(int i, Integer num) {
        c(i, num.intValue());
    }

    public boolean addAll(Collection collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof o)) {
            return super.addAll(collection);
        }
        o oVar = (o) collection;
        int i = oVar.b;
        if (i == 0) {
            return false;
        }
        int i2 = this.b;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.a;
        if (i3 > iArr.length) {
            this.a = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(oVar.a, 0, this.a, this.b, oVar.b);
        this.b = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public void addInt(int i) {
        ensureIsMutable();
        int i2 = this.b;
        int[] iArr = this.a;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.a = iArr2;
        }
        int[] iArr3 = this.a;
        int i3 = this.b;
        this.b = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        addInt(num.intValue());
        return true;
    }

    public final void c(int i, int i2) {
        int i3;
        ensureIsMutable();
        if (i < 0 || i > (i3 = this.b)) {
            throw new IndexOutOfBoundsException(h(i));
        }
        int[] iArr = this.a;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        } else {
            int[] iArr2 = new int[((i3 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.a, i, iArr2, i + 1, this.b - i);
            this.a = iArr2;
        }
        this.a[i] = i2;
        this.b++;
        ((AbstractList) this).modCount++;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return super.equals(obj);
        }
        o oVar = (o) obj;
        if (this.b != oVar.b) {
            return false;
        }
        int[] iArr = oVar.a;
        for (int i = 0; i < this.b; i++) {
            if (this.a[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Integer get(int i) {
        return Integer.valueOf(getInt(i));
    }

    public int getInt(int i) {
        f(i);
        return this.a[i];
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.b; i2++) {
            i = (i * 31) + this.a[i2];
        }
        return i;
    }

    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Integer remove(int i) {
        ensureIsMutable();
        f(i);
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (i < this.b - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.b--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.a[i] == intValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Integer set(int i, Integer num) {
        return Integer.valueOf(setInt(i, num.intValue()));
    }

    public void removeRange(int i, int i2) {
        ensureIsMutable();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.a;
        System.arraycopy(iArr, i2, iArr, i, this.b - i2);
        this.b -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    public int setInt(int i, int i2) {
        ensureIsMutable();
        f(i);
        int[] iArr = this.a;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    public int size() {
        return this.b;
    }

    public o(int[] iArr, int i, boolean z) {
        super(z);
        this.a = iArr;
        this.b = i;
    }

    public Internal.IntList mutableCopyWithCapacity(int i) {
        if (i >= this.b) {
            return new o(Arrays.copyOf(this.a, i), this.b, true);
        }
        throw new IllegalArgumentException();
    }
}
