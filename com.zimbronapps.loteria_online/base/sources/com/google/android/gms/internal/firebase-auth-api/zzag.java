package com.google.android.gms.internal.firebase-auth-api;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class zzag extends AbstractCollection implements Serializable {
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

    public Spliterator spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    public final Object[] toArray() {
        return toArray(zza);
    }

    public int zza(Object[] objArr, int i) {
        zzay zzayVar = (zzay) iterator();
        while (zzayVar.hasNext()) {
            objArr[i] = zzayVar.next();
            i++;
        }
        return i;
    }

    public int zzb() {
        throw new UnsupportedOperationException();
    }

    public zzah zzc() {
        return isEmpty() ? zzah.zzg() : zzah.zza(toArray());
    }

    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public abstract zzay iterator();

    public Object[] zze() {
        return null;
    }

    public final Object[] toArray(Object[] objArr) {
        zzu.zza(objArr);
        int size = size();
        if (objArr.length < size) {
            Object[] zze = zze();
            if (zze != null) {
                return Arrays.copyOfRange(zze, zzb(), zza(), objArr.getClass());
            }
            if (objArr.length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        zza(objArr, 0);
        return objArr;
    }

    public int zza() {
        throw new UnsupportedOperationException();
    }
}
