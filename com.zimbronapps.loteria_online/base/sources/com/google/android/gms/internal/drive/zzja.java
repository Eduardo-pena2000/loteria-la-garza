package com.google.android.gms.internal.drive;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzja extends zziw implements zzkp, zzmc, RandomAccess {
    private static final zzja zzno;
    private int size;
    private boolean[] zznp;

    static {
        zzja zzjaVar = new zzja(new boolean[0], 0);
        zzno = zzjaVar;
        zzjaVar.zzbp();
    }

    public zzja() {
        this(new boolean[10], 0);
    }

    private final void zza(int i, boolean z) {
        int i2;
        zzbq();
        if (i < 0 || i > (i2 = this.size)) {
            throw new IndexOutOfBoundsException(zzq(i));
        }
        boolean[] zArr = this.zznp;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.zznp, i, zArr2, i + 1, this.size - i);
            this.zznp = zArr2;
        }
        this.zznp[i] = z;
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
        zza(i, ((Boolean) obj).booleanValue());
    }

    public final boolean addAll(Collection collection) {
        zzbq();
        zzkm.checkNotNull(collection);
        if (!(collection instanceof zzja)) {
            return super.addAll(collection);
        }
        zzja zzjaVar = (zzja) collection;
        int i = zzjaVar.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.zznp;
        if (i3 > zArr.length) {
            this.zznp = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(zzjaVar.zznp, 0, this.zznp, this.size, zzjaVar.size);
        this.size = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addBoolean(boolean z) {
        zza(this.size, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzja)) {
            return super.equals(obj);
        }
        zzja zzjaVar = (zzja) obj;
        if (this.size != zzjaVar.size) {
            return false;
        }
        boolean[] zArr = zzjaVar.zznp;
        for (int i = 0; i < this.size; i++) {
            if (this.zznp[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        zzp(i);
        return Boolean.valueOf(this.zznp[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + zzkm.zze(this.zznp[i2]);
        }
        return i;
    }

    public final boolean remove(Object obj) {
        zzbq();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Boolean.valueOf(this.zznp[i]))) {
                boolean[] zArr = this.zznp;
                System.arraycopy(zArr, i + 1, zArr, i, (this.size - i) - 1);
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
        boolean[] zArr = this.zznp;
        System.arraycopy(zArr, i2, zArr, i, this.size - i2);
        this.size -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zzbq();
        zzp(i);
        boolean[] zArr = this.zznp;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.size;
    }

    public final /* synthetic */ zzkp zzr(int i) {
        if (i >= this.size) {
            return new zzja(Arrays.copyOf(this.zznp, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    private zzja(boolean[] zArr, int i) {
        this.zznp = zArr;
        this.size = i;
    }

    public final /* synthetic */ Object remove(int i) {
        zzbq();
        zzp(i);
        boolean[] zArr = this.zznp;
        boolean z = zArr[i];
        if (i < this.size - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (r2 - i) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }
}
