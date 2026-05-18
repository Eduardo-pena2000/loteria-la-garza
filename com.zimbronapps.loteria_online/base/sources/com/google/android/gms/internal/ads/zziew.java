package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class zziew implements Collection, Ra.a {
    private final Collection zza;

    public zziew(Collection collection) {
        kotlin.jvm.internal.t.g(collection, "delegate");
        this.zza = collection;
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        return this.zza.contains(obj);
    }

    public final boolean containsAll(Collection collection) {
        kotlin.jvm.internal.t.g(collection, "elements");
        return this.zza.containsAll(collection);
    }

    public final boolean isEmpty() {
        return this.zza.isEmpty();
    }

    public Iterator iterator() {
        return new zziex(this.zza.iterator());
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return this.zza.size();
    }

    public final Object[] toArray() {
        return kotlin.jvm.internal.j.a(this);
    }

    public final Object[] toArray(Object[] objArr) {
        kotlin.jvm.internal.t.g(objArr, "array");
        return kotlin.jvm.internal.j.b(this, objArr);
    }
}
