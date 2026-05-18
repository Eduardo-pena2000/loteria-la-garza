package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.Spliterators;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgxy extends AbstractList implements RandomAccess, Serializable {
    final int[] zza;
    final int zzb;
    final int zzc;

    public zzgxy(int[] iArr, int i, int i2) {
        this.zza = iArr;
        this.zzb = i;
        this.zzc = i2;
    }

    public final boolean contains(Object obj) {
        return (obj instanceof Integer) && zzgxz.zzi(this.zza, ((Integer) obj).intValue(), this.zzb, this.zzc) != -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgxy)) {
            return super.equals(obj);
        }
        zzgxy zzgxyVar = (zzgxy) obj;
        int i = this.zzc;
        int i2 = this.zzb;
        int i3 = zzgxyVar.zzc;
        int i4 = zzgxyVar.zzb;
        int i5 = i - i2;
        if (i3 - i4 != i5) {
            return false;
        }
        for (int i6 = 0; i6 < i5; i6++) {
            if (this.zza[i2 + i6] != zzgxyVar.zza[i4 + i6]) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i2 = this.zzc;
        int i3 = this.zzb;
        zzgrc.zzm(i, i2 - i3, "index");
        return Integer.valueOf(this.zza[i3 + i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = this.zzb; i2 < this.zzc; i2++) {
            i = (i * 31) + Integer.hashCode(this.zza[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int[] iArr = this.zza;
        int intValue = ((Integer) obj).intValue();
        int i = this.zzb;
        int zzi = zzgxz.zzi(iArr, intValue, i, this.zzc);
        if (zzi >= 0) {
            return zzi - i;
        }
        return -1;
    }

    public final boolean isEmpty() {
        return false;
    }

    public final int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.zza;
            int intValue = ((Integer) obj).intValue();
            int i = this.zzb;
            int i2 = this.zzc - 1;
            while (true) {
                if (i2 < i) {
                    i2 = -1;
                    break;
                }
                if (iArr[i2] == intValue) {
                    break;
                }
                i2--;
            }
            if (i2 >= 0) {
                return i2 - i;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int i2 = this.zzc;
        int i3 = this.zzb;
        Integer num = (Integer) obj;
        zzgrc.zzm(i, i2 - i3, "index");
        int[] iArr = this.zza;
        int i4 = i3 + i;
        int i5 = iArr[i4];
        num.getClass();
        iArr[i4] = num.intValue();
        return Integer.valueOf(i5);
    }

    public final int size() {
        return this.zzc - this.zzb;
    }

    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return Spliterators.spliterator(this.zza, this.zzb, this.zzc, 0);
    }

    public final List subList(int i, int i2) {
        int i3 = this.zzc;
        int i4 = this.zzb;
        zzgrc.zzo(i, i2, i3 - i4);
        return i == i2 ? Collections.emptyList() : new zzgxy(this.zza, i + i4, i4 + i2);
    }

    public final String toString() {
        int i = this.zzc;
        int i2 = this.zzb;
        StringBuilder sb = new StringBuilder((i - i2) * 5);
        sb.append('[');
        int[] iArr = this.zza;
        sb.append(iArr[i2]);
        while (true) {
            i2++;
            if (i2 >= i) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(iArr[i2]);
        }
    }
}
