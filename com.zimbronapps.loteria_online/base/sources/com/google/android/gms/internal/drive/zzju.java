package com.google.android.gms.internal.drive;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzju extends zziw implements zzkp, zzmc, RandomAccess {
    private static final zzju zzoi;
    private int size;
    private double[] zzoj;

    static {
        zzju zzjuVar = new zzju(new double[0], 0);
        zzoi = zzjuVar;
        zzjuVar.zzbp();
    }

    public zzju() {
        this(new double[10], 0);
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
        zzc(i, ((Double) obj).doubleValue());
    }

    public final boolean addAll(Collection collection) {
        zzbq();
        zzkm.checkNotNull(collection);
        if (!(collection instanceof zzju)) {
            return super.addAll(collection);
        }
        zzju zzjuVar = (zzju) collection;
        int i = zzjuVar.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.zzoj;
        if (i3 > dArr.length) {
            this.zzoj = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(zzjuVar.zzoj, 0, this.zzoj, this.size, zzjuVar.size);
        this.size = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzju)) {
            return super.equals(obj);
        }
        zzju zzjuVar = (zzju) obj;
        if (this.size != zzjuVar.size) {
            return false;
        }
        double[] dArr = zzjuVar.zzoj;
        for (int i = 0; i < this.size; i++) {
            if (Double.doubleToLongBits(this.zzoj[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        zzp(i);
        return Double.valueOf(this.zzoj[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + zzkm.zzu(Double.doubleToLongBits(this.zzoj[i2]));
        }
        return i;
    }

    public final boolean remove(Object obj) {
        zzbq();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Double.valueOf(this.zzoj[i]))) {
                double[] dArr = this.zzoj;
                System.arraycopy(dArr, i + 1, dArr, i, (this.size - i) - 1);
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
        double[] dArr = this.zzoj;
        System.arraycopy(dArr, i2, dArr, i, this.size - i2);
        this.size -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        zzbq();
        zzp(i);
        double[] dArr = this.zzoj;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.size;
    }

    public final void zzc(double d) {
        zzc(this.size, d);
    }

    public final /* synthetic */ zzkp zzr(int i) {
        if (i >= this.size) {
            return new zzju(Arrays.copyOf(this.zzoj, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    private zzju(double[] dArr, int i) {
        this.zzoj = dArr;
        this.size = i;
    }

    private final void zzc(int i, double d) {
        int i2;
        zzbq();
        if (i < 0 || i > (i2 = this.size)) {
            throw new IndexOutOfBoundsException(zzq(i));
        }
        double[] dArr = this.zzoj;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.zzoj, i, dArr2, i + 1, this.size - i);
            this.zzoj = dArr2;
        }
        this.zzoj[i] = d;
        this.size++;
        ((AbstractList) this).modCount++;
    }

    public final /* synthetic */ Object remove(int i) {
        zzbq();
        zzp(i);
        double[] dArr = this.zzoj;
        double d = dArr[i];
        if (i < this.size - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (r3 - i) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }
}
