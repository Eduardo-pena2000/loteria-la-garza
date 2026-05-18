package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class m extends a implements Internal.FloatList, RandomAccess, H {
    public static final m c = new m(new float[0], 0, false);
    public float[] a;
    public int b;

    public m() {
        this(new float[10], 0, true);
    }

    public static m e() {
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
    public void add(int i, Float f) {
        c(i, f.floatValue());
    }

    public boolean addAll(Collection collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof m)) {
            return super.addAll(collection);
        }
        m mVar = (m) collection;
        int i = mVar.b;
        if (i == 0) {
            return false;
        }
        int i2 = this.b;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.a;
        if (i3 > fArr.length) {
            this.a = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(mVar.a, 0, this.a, this.b, mVar.b);
        this.b = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public void addFloat(float f) {
        ensureIsMutable();
        int i = this.b;
        float[] fArr = this.a;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.a = fArr2;
        }
        float[] fArr3 = this.a;
        int i2 = this.b;
        this.b = i2 + 1;
        fArr3[i2] = f;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean add(Float f) {
        addFloat(f.floatValue());
        return true;
    }

    public final void c(int i, float f) {
        int i2;
        ensureIsMutable();
        if (i < 0 || i > (i2 = this.b)) {
            throw new IndexOutOfBoundsException(h(i));
        }
        float[] fArr = this.a;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.a, i, fArr2, i + 1, this.b - i);
            this.a = fArr2;
        }
        this.a[i] = f;
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
        if (!(obj instanceof m)) {
            return super.equals(obj);
        }
        m mVar = (m) obj;
        if (this.b != mVar.b) {
            return false;
        }
        float[] fArr = mVar.a;
        for (int i = 0; i < this.b; i++) {
            if (Float.floatToIntBits(this.a[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Float get(int i) {
        return Float.valueOf(getFloat(i));
    }

    public float getFloat(int i) {
        f(i);
        return this.a[i];
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.b; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.a[i2]);
        }
        return i;
    }

    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Float remove(int i) {
        ensureIsMutable();
        f(i);
        float[] fArr = this.a;
        float f = fArr[i];
        if (i < this.b - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (r2 - i) - 1);
        }
        this.b--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.a[i] == floatValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Float set(int i, Float f) {
        return Float.valueOf(setFloat(i, f.floatValue()));
    }

    public void removeRange(int i, int i2) {
        ensureIsMutable();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.a;
        System.arraycopy(fArr, i2, fArr, i, this.b - i2);
        this.b -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    public float setFloat(int i, float f) {
        ensureIsMutable();
        f(i);
        float[] fArr = this.a;
        float f2 = fArr[i];
        fArr[i] = f;
        return f2;
    }

    public int size() {
        return this.b;
    }

    public m(float[] fArr, int i, boolean z) {
        super(z);
        this.a = fArr;
        this.b = i;
    }

    public Internal.FloatList mutableCopyWithCapacity(int i) {
        if (i >= this.b) {
            return new m(Arrays.copyOf(this.a, i), this.b, true);
        }
        throw new IllegalArgumentException();
    }
}
