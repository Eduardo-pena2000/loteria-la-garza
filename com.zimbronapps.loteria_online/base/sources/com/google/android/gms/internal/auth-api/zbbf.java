package com.google.android.gms.internal.auth-api;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zbbf extends AbstractCollection implements Serializable {
    private static final Object[] zba = new Object[0];

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
        return toArray(zba);
    }

    /* renamed from: zba, reason: merged with bridge method [inline-methods] */
    public abstract zbbk iterator();

    public Object[] zbb() {
        throw null;
    }

    public int zbc() {
        throw null;
    }

    public int zbd() {
        throw null;
    }

    public zbbi zbe() {
        throw null;
    }

    public abstract boolean zbf();

    public int zbg(Object[] objArr, int i) {
        throw null;
    }

    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] zbb = zbb();
            if (zbb != null) {
                return Arrays.copyOfRange(zbb, zbc(), zbd(), objArr.getClass());
            }
            if (length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, size);
        } else if (length > size) {
            objArr[size] = null;
        }
        zbg(objArr, 0);
        return objArr;
    }
}
