package com.google.protobuf.kotlin;

import Ra.a;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class DslList implements List, a {
    private final List delegate;

    @OnlyForUseByGeneratedProtoCode
    public DslList(List list) {
        t.g(list, "delegate");
        this.delegate = list;
    }

    public void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection collection) {
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

    public boolean equals(Object obj) {
        return t.c(this.delegate, obj);
    }

    public Object get(int i) {
        return this.delegate.get(i);
    }

    public int getSize() {
        return this.delegate.size();
    }

    public int hashCode() {
        return this.delegate.hashCode();
    }

    public int indexOf(Object obj) {
        return this.delegate.indexOf(obj);
    }

    public boolean isEmpty() {
        return this.delegate.isEmpty();
    }

    public Iterator iterator() {
        return new UnmodifiableIterator(this.delegate.iterator());
    }

    public int lastIndexOf(Object obj) {
        return this.delegate.lastIndexOf(obj);
    }

    public ListIterator listIterator() {
        return new UnmodifiableListIterator(this.delegate.listIterator());
    }

    public Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List subList(int i, int i2) {
        return this.delegate.subList(i, i2);
    }

    public Object[] toArray() {
        return j.a(this);
    }

    public String toString() {
        return this.delegate.toString();
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public ListIterator listIterator(int i) {
        return new UnmodifiableListIterator(this.delegate.listIterator(i));
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object[] toArray(Object[] objArr) {
        t.g(objArr, "array");
        return j.b(this, objArr);
    }
}
