package com.revenuecat.purchases.ui.revenuecatui.helpers;

import Da.D;
import Da.Z;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class NonEmptySet implements Set, Ra.a {
    public static final int $stable = 8;
    private final Set all;
    private final Object head;

    private NonEmptySet(Object obj, Set set) {
        this.head = obj;
        this.all = set;
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
        return this.all.contains(obj);
    }

    public boolean containsAll(Collection elements) {
        t.g(elements, "elements");
        return this.all.containsAll(elements);
    }

    public boolean equals(Object obj) {
        return obj instanceof NonEmptySet ? t.c(this.all, ((NonEmptySet) obj).all) : t.c(this.all, obj);
    }

    public final /* synthetic */ Object getHead() {
        return this.head;
    }

    public int getSize() {
        return this.all.size();
    }

    public int hashCode() {
        return this.all.hashCode();
    }

    public /* synthetic */ boolean isEmpty() {
        return false;
    }

    public Iterator iterator() {
        return this.all.iterator();
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
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

    public final /* synthetic */ Set toSet() {
        return this.all;
    }

    public String toString() {
        return "NonEmptySet(" + D.n0(this.all, null, null, null, 0, null, null, 63, null) + ')';
    }

    public Object[] toArray(Object[] array) {
        t.g(array, "array");
        return j.b(this, array);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NonEmptySet(Object obj, Iterable rest) {
        this(obj, Z.j(D.Q0(rest), obj));
        t.g(rest, "rest");
    }
}
