package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class d extends a implements Internal.BooleanList, RandomAccess, H {
    public static final d c = new d(new boolean[0], 0, false);
    public boolean[] a;
    public int b;

    public d() {
        this(new boolean[10], 0, true);
    }

    public static d e() {
        return c;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void add(int i, Boolean bool) {
        c(i, bool.booleanValue());
    }

    public boolean addAll(Collection collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof d)) {
            return super.addAll(collection);
        }
        d dVar = (d) collection;
        int i = dVar.b;
        if (i == 0) {
            return false;
        }
        int i2 = this.b;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.a;
        if (i3 > zArr.length) {
            this.a = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(dVar.a, 0, this.a, this.b, dVar.b);
        this.b = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public void addBoolean(boolean z) {
        ensureIsMutable();
        int i = this.b;
        boolean[] zArr = this.a;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.a = zArr2;
        }
        boolean[] zArr3 = this.a;
        int i2 = this.b;
        this.b = i2 + 1;
        zArr3[i2] = z;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean add(Boolean bool) {
        addBoolean(bool.booleanValue());
        return true;
    }

    public final void c(int i, boolean z) {
        int i2;
        ensureIsMutable();
        if (i < 0 || i > (i2 = this.b)) {
            throw new IndexOutOfBoundsException(h(i));
        }
        boolean[] zArr = this.a;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.a, i, zArr2, i + 1, this.b - i);
            this.a = zArr2;
        }
        this.a[i] = z;
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
        if (!(obj instanceof d)) {
            return super.equals(obj);
        }
        d dVar = (d) obj;
        if (this.b != dVar.b) {
            return false;
        }
        boolean[] zArr = dVar.a;
        for (int i = 0; i < this.b; i++) {
            if (this.a[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i) {
        if (i < 0 || i >= this.b) {
            throw new IndexOutOfBoundsException(h(i));
        }
    }

    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Boolean get(int i) {
        return Boolean.valueOf(getBoolean(i));
    }

    public boolean getBoolean(int i) {
        f(i);
        return this.a[i];
    }

    public final String h(int i) {
        return "Index:" + i + ", Size:" + this.b;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.b; i2++) {
            i = (i * 31) + Internal.hashBoolean(this.a[i2]);
        }
        return i;
    }

    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Boolean remove(int i) {
        ensureIsMutable();
        f(i);
        boolean[] zArr = this.a;
        boolean z = zArr[i];
        if (i < this.b - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (r2 - i) - 1);
        }
        this.b--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.a[i] == booleanValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Boolean set(int i, Boolean bool) {
        return Boolean.valueOf(setBoolean(i, bool.booleanValue()));
    }

    public void removeRange(int i, int i2) {
        ensureIsMutable();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.a;
        System.arraycopy(zArr, i2, zArr, i, this.b - i2);
        this.b -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    public boolean setBoolean(int i, boolean z) {
        ensureIsMutable();
        f(i);
        boolean[] zArr = this.a;
        boolean z2 = zArr[i];
        zArr[i] = z;
        return z2;
    }

    public int size() {
        return this.b;
    }

    public d(boolean[] zArr, int i, boolean z) {
        super(z);
        this.a = zArr;
        this.b = i;
    }

    public Internal.BooleanList mutableCopyWithCapacity(int i) {
        if (i >= this.b) {
            return new d(Arrays.copyOf(this.a, i), this.b, true);
        }
        throw new IllegalArgumentException();
    }
}
