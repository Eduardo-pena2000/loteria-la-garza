package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzicq extends zzhzz implements RandomAccess, zzicc, zzidl {
    private static final long[] zza;
    private static final zzicq zzb;
    private long[] zzc;
    private int zzd;

    static {
        long[] jArr = new long[0];
        zza = jArr;
        zzb = new zzicq(jArr, 0, false);
    }

    public zzicq() {
        this(zza, 0, true);
    }

    public static zzicq zzg() {
        return zzb;
    }

    private static int zzj(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    private final void zzk(int i) {
        if (i < 0 || i >= this.zzd) {
            throw new IndexOutOfBoundsException(zzl(i));
        }
    }

    private final String zzl(int i) {
        int i2 = this.zzd;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 13 + String.valueOf(i2).length());
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        zzdV();
        if (i < 0 || i > (i2 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzl(i));
        }
        int i3 = i + 1;
        long[] jArr = this.zzc;
        int length = jArr.length;
        if (i2 < length) {
            System.arraycopy(jArr, i, jArr, i3, i2 - i);
        } else {
            long[] jArr2 = new long[zzj(length)];
            System.arraycopy(this.zzc, 0, jArr2, 0, i);
            System.arraycopy(this.zzc, i, jArr2, i3, this.zzd - i);
            this.zzc = jArr2;
        }
        this.zzc[i] = longValue;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    public final boolean addAll(Collection collection) {
        zzdV();
        byte[] bArr = zzice.zzb;
        collection.getClass();
        if (!(collection instanceof zzicq)) {
            return super.addAll(collection);
        }
        zzicq zzicqVar = (zzicq) collection;
        int i = zzicqVar.zzd;
        if (i == 0) {
            return false;
        }
        int i2 = this.zzd;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.zzc;
        if (i3 > jArr.length) {
            this.zzc = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(zzicqVar.zzc, 0, this.zzc, this.zzd, zzicqVar.zzd);
        this.zzd = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzicq)) {
            return super.equals(obj);
        }
        zzicq zzicqVar = (zzicq) obj;
        if (this.zzd != zzicqVar.zzd) {
            return false;
        }
        long[] jArr = zzicqVar.zzc;
        for (int i = 0; i < this.zzd; i++) {
            if (this.zzc[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        zzk(i);
        return Long.valueOf(this.zzc[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzd; i2++) {
            long j = this.zzc[i2];
            byte[] bArr = zzice.zzb;
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.zzd;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.zzc[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zzdV();
        zzk(i);
        long[] jArr = this.zzc;
        long j = jArr[i];
        if (i < this.zzd - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    public final void removeRange(int i, int i2) {
        zzdV();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.zzc;
        System.arraycopy(jArr, i2, jArr, i, this.zzd - i2);
        this.zzd -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        return Long.valueOf(zze(i, ((Long) obj).longValue()));
    }

    public final int size() {
        return this.zzd;
    }

    public final long zzc(int i) {
        zzk(i);
        return this.zzc[i];
    }

    public final void zzd(long j) {
        zzdV();
        int i = this.zzd;
        int length = this.zzc.length;
        if (i == length) {
            long[] jArr = new long[zzj(length)];
            System.arraycopy(this.zzc, 0, jArr, 0, this.zzd);
            this.zzc = jArr;
        }
        long[] jArr2 = this.zzc;
        int i2 = this.zzd;
        this.zzd = i2 + 1;
        jArr2[i2] = j;
    }

    public final long zze(int i, long j) {
        zzdV();
        zzk(i);
        long[] jArr = this.zzc;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzicc zzh(int i) {
        if (i >= this.zzd) {
            return new zzicq(i == 0 ? zza : Arrays.copyOf(this.zzc, i), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zzi(int i) {
        int length = this.zzc.length;
        if (i <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new long[Math.max(i, 10)];
            return;
        }
        while (length < i) {
            length = zzj(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    private zzicq(long[] jArr, int i, boolean z) {
        super(z);
        this.zzc = jArr;
        this.zzd = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzd(((Long) obj).longValue());
        return true;
    }
}
