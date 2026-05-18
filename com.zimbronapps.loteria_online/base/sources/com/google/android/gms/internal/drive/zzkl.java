package com.google.android.gms.internal.drive;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzkl extends zziw implements zzkp, zzmc, RandomAccess {
    private static final zzkl zzsl;
    private int size;
    private int[] zzsm;

    static {
        zzkl zzklVar = new zzkl(new int[0], 0);
        zzsl = zzklVar;
        zzklVar.zzbp();
    }

    public zzkl() {
        this(new int[10], 0);
    }

    private final void zzo(int i, int i2) {
        int i3;
        zzbq();
        if (i < 0 || i > (i3 = this.size)) {
            throw new IndexOutOfBoundsException(zzq(i));
        }
        int[] iArr = this.zzsm;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        } else {
            int[] iArr2 = new int[((i3 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.zzsm, i, iArr2, i + 1, this.size - i);
            this.zzsm = iArr2;
        }
        this.zzsm[i] = i2;
        this.size++;
        ((AbstractList) this).modCount++;
    }

    private final void zzp(int i) {
        if (i < 0 || i >= this.size) {
            throw new IndexOutOfBoundsException(zzq(i));
        }
    }

    private final String zzq(int i) {
        int i2 = this.size;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        zzo(i, ((Integer) obj).intValue());
    }

    public final boolean addAll(Collection collection) {
        zzbq();
        zzkm.checkNotNull(collection);
        if (!(collection instanceof zzkl)) {
            return super.addAll(collection);
        }
        zzkl zzklVar = (zzkl) collection;
        int i = zzklVar.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.zzsm;
        if (i3 > iArr.length) {
            this.zzsm = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(zzklVar.zzsm, 0, this.zzsm, this.size, zzklVar.size);
        this.size = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzkl)) {
            return super.equals(obj);
        }
        zzkl zzklVar = (zzkl) obj;
        if (this.size != zzklVar.size) {
            return false;
        }
        int[] iArr = zzklVar.zzsm;
        for (int i = 0; i < this.size; i++) {
            if (this.zzsm[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(getInt(i));
    }

    public final int getInt(int i) {
        zzp(i);
        return this.zzsm[i];
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + this.zzsm[i2];
        }
        return i;
    }

    public final boolean remove(Object obj) {
        zzbq();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Integer.valueOf(this.zzsm[i]))) {
                int[] iArr = this.zzsm;
                System.arraycopy(iArr, i + 1, iArr, i, (this.size - i) - 1);
                this.size--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    public final void removeRange(int i, int i2) {
        zzbq();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.zzsm;
        System.arraycopy(iArr, i2, iArr, i, this.size - i2);
        this.size -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        zzbq();
        zzp(i);
        int[] iArr = this.zzsm;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.size;
    }

    public final void zzam(int i) {
        zzo(this.size, i);
    }

    public final /* synthetic */ zzkp zzr(int i) {
        if (i >= this.size) {
            return new zzkl(Arrays.copyOf(this.zzsm, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    private zzkl(int[] iArr, int i) {
        this.zzsm = iArr;
        this.size = i;
    }

    public final /* synthetic */ Object remove(int i) {
        zzbq();
        zzp(i);
        int[] iArr = this.zzsm;
        int i2 = iArr[i];
        if (i < this.size - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }
}
