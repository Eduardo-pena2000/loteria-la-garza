package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
abstract class zzhzz extends AbstractList implements zzicd {
    private boolean zza;

    public zzhzz(boolean z) {
        this.zza = z;
    }

    public void add(int i, Object obj) {
        zzdV();
        super.add(i, obj);
    }

    public final boolean addAll(int i, Collection collection) {
        zzdV();
        return super.addAll(i, collection);
    }

    public final void clear() {
        zzdV();
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
        zzdV();
        return super.remove(i);
    }

    public final boolean removeAll(Collection collection) {
        zzdV();
        return super/*java.util.AbstractCollection*/.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        zzdV();
        return super/*java.util.AbstractCollection*/.retainAll(collection);
    }

    public Object set(int i, Object obj) {
        zzdV();
        return super.set(i, obj);
    }

    public final boolean zza() {
        return this.zza;
    }

    public final void zzb() {
        if (this.zza) {
            this.zza = false;
        }
    }

    public final void zzdV() {
        if (!this.zza) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean add(Object obj) {
        zzdV();
        return super.add(obj);
    }

    public boolean addAll(Collection collection) {
        zzdV();
        return super/*java.util.AbstractCollection*/.addAll(collection);
    }

    public final boolean remove(Object obj) {
        zzdV();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }
}
