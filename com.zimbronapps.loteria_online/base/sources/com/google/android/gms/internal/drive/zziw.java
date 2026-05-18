package com.google.android.gms.internal.drive;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
abstract class zziw extends AbstractList implements zzkp {
    private boolean zznh = true;

    public boolean add(Object obj) {
        zzbq();
        return super.add(obj);
    }

    public boolean addAll(Collection collection) {
        zzbq();
        return super/*java.util.AbstractCollection*/.addAll(collection);
    }

    public void clear() {
        zzbq();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public Object remove(int i) {
        zzbq();
        return super.remove(i);
    }

    public boolean removeAll(Collection collection) {
        zzbq();
        return super/*java.util.AbstractCollection*/.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        zzbq();
        return super/*java.util.AbstractCollection*/.retainAll(collection);
    }

    public Object set(int i, Object obj) {
        zzbq();
        return super.set(i, obj);
    }

    public boolean zzbo() {
        return this.zznh;
    }

    public final void zzbp() {
        this.zznh = false;
    }

    public final void zzbq() {
        if (!this.zznh) {
            throw new UnsupportedOperationException();
        }
    }

    public void add(int i, Object obj) {
        zzbq();
        super.add(i, obj);
    }

    public boolean addAll(int i, Collection collection) {
        zzbq();
        return super.addAll(i, collection);
    }

    public boolean remove(Object obj) {
        zzbq();
        return super/*java.util.AbstractCollection*/.remove(obj);
    }
}
