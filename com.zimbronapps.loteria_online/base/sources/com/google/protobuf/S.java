package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class s extends a implements Internal.LongList, RandomAccess, H {
    public static final s c = new s(new long[0], 0, false);
    public long[] a;
    public int b;

    public s() {
        this(new long[10], 0, true);
    }

    public static s e() {
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
    public void add(int i, Long l) {
        c(i, l.longValue());
    }

    public boolean addAll(Collection collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof s)) {
            return super.addAll(collection);
        }
        s sVar = (s) collection;
        int i = sVar.b;
        if (i == 0) {
            return false;
        }
        int i2 = this.b;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.a;
        if (i3 > jArr.length) {
            this.a = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(sVar.a, 0, this.a, this.b, sVar.b);
        this.b = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public void addLong(long j) {
        ensureIsMutable();
        int i = this.b;
        long[] jArr = this.a;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.a = jArr2;
        }
        long[] jArr3 = this.a;
        int i2 = this.b;
        this.b = i2 + 1;
        jArr3[i2] = j;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean add(Long l) {
        addLong(l.longValue());
        return true;
    }

    public final void c(int i, long j) {
        int i2;
        ensureIsMutable();
        if (i < 0 || i > (i2 = this.b)) {
            throw new IndexOutOfBoundsException(h(i));
        }
        long[] jArr = this.a;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.a, i, jArr2, i + 1, this.b - i);
            this.a = jArr2;
        }
        this.a[i] = j;
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
        if (!(obj instanceof s)) {
            return super.equals(obj);
        }
        s sVar = (s) obj;
        if (this.b != sVar.b) {
            return false;
        }
        long[] jArr = sVar.a;
        for (int i = 0; i < this.b; i++) {
            if (this.a[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Long get(int i) {
        return Long.valueOf(getLong(i));
    }

    public long getLong(int i) {
        f(i);
        return this.a[i];
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.b; i2++) {
            i = (i * 31) + Internal.hashLong(this.a[i2]);
        }
        return i;
    }

    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Long remove(int i) {
        ensureIsMutable();
        f(i);
        long[] jArr = this.a;
        long j = jArr[i];
        if (i < this.b - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.b--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.a[i] == longValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Long set(int i, Long l) {
        return Long.valueOf(setLong(i, l.longValue()));
    }

    public void removeRange(int i, int i2) {
        ensureIsMutable();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.a;
        System.arraycopy(jArr, i2, jArr, i, this.b - i2);
        this.b -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    public long setLong(int i, long j) {
        ensureIsMutable();
        f(i);
        long[] jArr = this.a;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    public int size() {
        return this.b;
    }

    public s(long[] jArr, int i, boolean z) {
        super(z);
        this.a = jArr;
        this.b = i;
    }

    public Internal.LongList mutableCopyWithCapacity(int i) {
        if (i >= this.b) {
            return new s(Arrays.copyOf(this.a, i), this.b, true);
        }
        throw new IllegalArgumentException();
    }
}
