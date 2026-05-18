package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzgub extends AbstractCollection implements Serializable {
    private static final Object[] zza = new Object[0];

    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(Object obj);

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final Spliterator spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    public final Object[] toArray() {
        return toArray(zza);
    }

    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public abstract zzgwt iterator();

    public Object[] zzb() {
        return null;
    }

    public int zzc() {
        throw new UnsupportedOperationException();
    }

    public int zzd() {
        throw new UnsupportedOperationException();
    }

    public zzguf zze() {
        if (isEmpty()) {
            int i = zzguf.zzd;
            return zzgwa.zza;
        }
        Object[] array = toArray(zza);
        int i2 = zzguf.zzd;
        return zzguf.zzt(array, array.length);
    }

    public abstract boolean zzf();

    public int zzg(Object[] objArr, int i) {
        zzgwt it = iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return i;
    }

    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] zzb = zzb();
            if (zzb != null) {
                return Arrays.copyOfRange(zzb, zzc(), zzd(), objArr.getClass());
            }
            if (length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, size);
        } else if (length > size) {
            objArr[size] = null;
        }
        zzg(objArr, 0);
        return objArr;
    }
}
