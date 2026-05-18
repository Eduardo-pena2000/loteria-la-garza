package com.google.protobuf.kotlin;

import Ra.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class UnmodifiableCollection implements Collection, a {
    private final Collection delegate;

    public UnmodifiableCollection(Collection collection) {
        t.g(collection, "delegate");
        this.delegate = collection;
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        return this.delegate.contains(obj);
    }

    public boolean containsAll(Collection collection) {
        t.g(collection, "elements");
        return this.delegate.containsAll(collection);
    }

    public int getSize() {
        return this.delegate.size();
    }

    public boolean isEmpty() {
        return this.delegate.isEmpty();
    }

    public Iterator iterator() {
        return new UnmodifiableIterator(this.delegate.iterator());
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public Object[] toArray() {
        return j.a(this);
    }

    public Object[] toArray(Object[] objArr) {
        t.g(objArr, "array");
        return j.b(this, objArr);
    }
}
