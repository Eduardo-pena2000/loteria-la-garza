package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzguf extends zzgub implements List, RandomAccess {
    private static final zzgwu zza = new zzgud(zzgwa.zza, 0);
    public static final /* synthetic */ int zzd = 0;

    public static zzguf zzi() {
        return zzgwa.zza;
    }

    public static zzguf zzj(Object obj) {
        Object[] objArr = {obj};
        zzgvy.zza(objArr, 1);
        return zzt(objArr, 1);
    }

    public static zzguf zzk(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzgvy.zza(objArr, 2);
        return zzt(objArr, 2);
    }

    public static zzguf zzl(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        zzgvy.zza(objArr, 3);
        return zzt(objArr, 3);
    }

    public static zzguf zzm(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        zzgvy.zza(objArr, 5);
        return zzt(objArr, 5);
    }

    public static zzguf zzn(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6};
        zzgvy.zza(objArr, 6);
        return zzt(objArr, 6);
    }

    @SafeVarargs
    public static zzguf zzo(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        int length = objArr.length;
        int i = length + 12;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, length);
        zzgvy.zza(objArr2, i);
        return zzt(objArr2, i);
    }

    public static zzguf zzp(Iterable iterable) {
        iterable.getClass();
        return zzq((Collection) iterable);
    }

    public static zzguf zzq(Collection collection) {
        if (!(collection instanceof zzgub)) {
            Object[] array = collection.toArray();
            int length = array.length;
            zzgvy.zza(array, length);
            return zzt(array, length);
        }
        zzguf zze = ((zzgub) collection).zze();
        if (!zze.zzf()) {
            return zze;
        }
        Object[] array2 = zze.toArray();
        return zzt(array2, array2.length);
    }

    public static zzguf zzr(Object[] objArr) {
        if (objArr.length == 0) {
            return zzgwa.zza;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        zzgvy.zza(objArr2, length);
        return zzt(objArr2, length);
    }

    public static zzguf zzs(Comparator comparator, Iterable iterable) {
        Object[] array = (iterable instanceof Collection ? (Collection) iterable : zzgvf.zza(((zzguf) iterable).listIterator(0))).toArray();
        int length = array.length;
        zzgvy.zza(array, length);
        Arrays.sort(array, comparator);
        return zzt(array, length);
    }

    public static zzguf zzt(Object[] objArr, int i) {
        return i == 0 ? zzgwa.zza : new zzgwa(objArr, i);
    }

    public static zzguc zzv(int i) {
        zzgtb.zzb(i, "expectedSize");
        return new zzguc(i);
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
                        if (Objects.equals(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !Objects.equals(it.next(), it2.next())) {
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

    public final zzgwt zza() {
        return listIterator(0);
    }

    @Deprecated
    public final zzguf zze() {
        return this;
    }

    public int zzg(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public zzguf subList(int i, int i2) {
        zzgrc.zzo(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? zzgwa.zza : new zzgue(this, i, i3);
    }

    /* renamed from: zzu, reason: merged with bridge method [inline-methods] */
    public final zzgwu listIterator(int i) {
        zzgrc.zzn(i, size(), "index");
        return isEmpty() ? zza : new zzgud(this, i);
    }
}
