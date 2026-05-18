package com.revenuecat.purchases.ui.revenuecatui.helpers;

import Da.D;
import Da.u;
import Da.v;
import Da.w;
import Qa.l;
import Qa.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class NonEmptyList implements List, Ra.a {
    public static final int $stable = 8;
    private final List all;

    private NonEmptyList(List list) {
        this.all = list;
    }

    public void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        return this.all.contains(obj);
    }

    public boolean containsAll(Collection elements) {
        t.g(elements, "elements");
        return this.all.containsAll(elements);
    }

    public boolean equals(Object obj) {
        return obj instanceof NonEmptyList ? t.c(this.all, ((NonEmptyList) obj).all) : t.c(this.all, obj);
    }

    public Object get(int i) {
        return this.all.get(i);
    }

    public final /* synthetic */ Object getHead() {
        return D.f0(this.all);
    }

    public int getSize() {
        return this.all.size();
    }

    public int hashCode() {
        return this.all.hashCode();
    }

    public int indexOf(Object obj) {
        return this.all.indexOf(obj);
    }

    public /* synthetic */ boolean isEmpty() {
        return false;
    }

    public Iterator iterator() {
        return this.all.iterator();
    }

    public int lastIndexOf(Object obj) {
        return this.all.lastIndexOf(obj);
    }

    public ListIterator listIterator() {
        return this.all.listIterator();
    }

    public final /* synthetic */ NonEmptyList map(l transform) {
        t.g(transform, "transform");
        List list = this.all;
        ArrayList arrayList = new ArrayList(w.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(transform.invoke(it.next()));
        }
        return new NonEmptyList(arrayList);
    }

    public final /* synthetic */ NonEmptyList mapIndexed(p transform) {
        t.g(transform, "transform");
        List list = this.all;
        ArrayList arrayList = new ArrayList(w.y(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                v.x();
            }
            arrayList.add(transform.invoke(Integer.valueOf(i), obj));
            i = i2;
        }
        return new NonEmptyList(arrayList);
    }

    public Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object removeLast() {
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
        return this.all.subList(i, i2);
    }

    public Object[] toArray() {
        return j.a(this);
    }

    public final /* synthetic */ List toList() {
        return this.all;
    }

    public String toString() {
        return "NonEmptyList(" + D.n0(this.all, null, null, null, 0, null, null, 63, null) + ')';
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public ListIterator listIterator(int i) {
        return this.all.listIterator(i);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object[] toArray(Object[] array) {
        t.g(array, "array");
        return j.b(this, array);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NonEmptyList(Object obj, List tail) {
        this(D.v0(u.e(obj), tail));
        t.g(tail, "tail");
    }
}
