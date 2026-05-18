package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class a extends AbstractList implements Internal.ProtobufList {
    protected static final int DEFAULT_CAPACITY = 10;
    private boolean isMutable;

    public a() {
        this(true);
    }

    public boolean add(Object obj) {
        ensureIsMutable();
        return super.add(obj);
    }

    public boolean addAll(Collection collection) {
        ensureIsMutable();
        return super/*java.util.AbstractCollection*/.addAll(collection);
    }

    public void clear() {
        ensureIsMutable();
        super.clear();
    }

    public void ensureIsMutable() {
        if (!this.isMutable) {
            throw new UnsupportedOperationException();
        }
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

    public boolean isModifiable() {
        return this.isMutable;
    }

    public final void makeImmutable() {
        if (this.isMutable) {
            this.isMutable = false;
        }
    }

    public abstract Object remove(int i);

    public boolean remove(Object obj) {
        ensureIsMutable();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public boolean removeAll(Collection collection) {
        ensureIsMutable();
        return super/*java.util.AbstractCollection*/.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        ensureIsMutable();
        return super/*java.util.AbstractCollection*/.retainAll(collection);
    }

    public a(boolean z) {
        this.isMutable = z;
    }

    public boolean addAll(int i, Collection collection) {
        ensureIsMutable();
        return super.addAll(i, collection);
    }
}
