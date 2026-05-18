package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class h extends a implements Internal.DoubleList, RandomAccess, H {
    public static final h c = new h(new double[0], 0, false);
    public double[] a;
    public int b;

    public h() {
        this(new double[10], 0, true);
    }

    public static h e() {
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
    public void add(int i, Double d) {
        c(i, d.doubleValue());
    }

    public boolean addAll(Collection collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof h)) {
            return super.addAll(collection);
        }
        h hVar = (h) collection;
        int i = hVar.b;
        if (i == 0) {
            return false;
        }
        int i2 = this.b;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.a;
        if (i3 > dArr.length) {
            this.a = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(hVar.a, 0, this.a, this.b, hVar.b);
        this.b = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public void addDouble(double d) {
        ensureIsMutable();
        int i = this.b;
        double[] dArr = this.a;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.a = dArr2;
        }
        double[] dArr3 = this.a;
        int i2 = this.b;
        this.b = i2 + 1;
        dArr3[i2] = d;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean add(Double d) {
        addDouble(d.doubleValue());
        return true;
    }

    public final void c(int i, double d) {
        int i2;
        ensureIsMutable();
        if (i < 0 || i > (i2 = this.b)) {
            throw new IndexOutOfBoundsException(h(i));
        }
        double[] dArr = this.a;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.a, i, dArr2, i + 1, this.b - i);
            this.a = dArr2;
        }
        this.a[i] = d;
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
        if (!(obj instanceof h)) {
            return super.equals(obj);
        }
        h hVar = (h) obj;
        if (this.b != hVar.b) {
            return false;
        }
        double[] dArr = hVar.a;
        for (int i = 0; i < this.b; i++) {
            if (Double.doubleToLongBits(this.a[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Double get(int i) {
        return Double.valueOf(getDouble(i));
    }

    public double getDouble(int i) {
        f(i);
        return this.a[i];
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.b; i2++) {
            i = (i * 31) + Internal.hashLong(Double.doubleToLongBits(this.a[i2]));
        }
        return i;
    }

    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Double remove(int i) {
        ensureIsMutable();
        f(i);
        double[] dArr = this.a;
        double d = dArr[i];
        if (i < this.b - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (r3 - i) - 1);
        }
        this.b--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.a[i] == doubleValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Double set(int i, Double d) {
        return Double.valueOf(setDouble(i, d.doubleValue()));
    }

    public void removeRange(int i, int i2) {
        ensureIsMutable();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.a;
        System.arraycopy(dArr, i2, dArr, i, this.b - i2);
        this.b -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    public double setDouble(int i, double d) {
        ensureIsMutable();
        f(i);
        double[] dArr = this.a;
        double d2 = dArr[i];
        dArr[i] = d;
        return d2;
    }

    public int size() {
        return this.b;
    }

    public h(double[] dArr, int i, boolean z) {
        super(z);
        this.a = dArr;
        this.b = i;
    }

    public Internal.DoubleList mutableCopyWithCapacity(int i) {
        if (i >= this.b) {
            return new h(Arrays.copyOf(this.a, i), this.b, true);
        }
        throw new IllegalArgumentException();
    }
}
