package com.google.android.gms.internal.play_billing;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class zzbt extends zzbq implements List, RandomAccess {
    private static final zzci zza = new zzbr(zzca.zza, 0);
    public static final /* synthetic */ int zzd = 0;

    public static zzbt zzi(Object[] objArr, int i) {
        return i == 0 ? zzca.zza : new zzca(objArr, i);
    }

    public static zzbt zzj(Collection collection) {
        if (!(collection instanceof zzbq)) {
            Object[] array = collection.toArray();
            int length = array.length;
            zzbz.zza(array, length);
            return zzi(array, length);
        }
        zzbt zzd2 = ((zzbq) collection).zzd();
        if (!zzd2.zzf()) {
            return zzd2;
        }
        Object[] array2 = zzd2.toArray();
        return zzi(array2, array2.length);
    }

    public static zzbt zzk() {
        return zzca.zza;
    }

    public static zzbt zzl(Object obj) {
        Object[] objArr = {"inapp"};
        zzbz.zza(objArr, 1);
        return zzi(objArr, 1);
    }

    public static zzbt zzm(Object obj, Object obj2) {
        Object[] objArr = {"subs", "inapp"};
        zzbz.zza(objArr, 2);
        return zzi(objArr, 2);
    }

    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (zzbf.zza(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !zzbf.zza(it.next(), it2.next())) {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    public int zza(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    @Deprecated
    public final zzbt zzd() {
        return this;
    }

    public final zzch zze() {
        return listIterator(0);
    }

    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public zzbt subList(int i, int i2) {
        zzbg.zzd(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? zzca.zza : new zzbs(this, i, i3);
    }

    /* renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final zzci listIterator(int i) {
        zzbg.zzb(i, size(), "index");
        return isEmpty() ? zza : new zzbr(this, i);
    }
}
