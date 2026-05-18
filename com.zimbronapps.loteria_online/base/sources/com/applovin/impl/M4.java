package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class m4 implements Set, RandomAccess {
    private final ArrayList a = new ArrayList();
    private final HashSet b = new HashSet();

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean add(Comparable comparable) {
        if (contains(comparable)) {
            return false;
        }
        if (isEmpty() || comparable.compareTo(a()) > 0) {
            this.a.add(comparable);
        } else {
            this.a.add(b(comparable), comparable);
        }
        return this.b.add(comparable);
    }

    public boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (add((Comparable) it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    public Comparable b(int i) {
        Comparable comparable = (Comparable) this.a.remove(i);
        this.b.remove(comparable);
        return comparable;
    }

    public int c(Comparable comparable) {
        int binarySearch = Collections.binarySearch(this.a, comparable);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        Comparable a = a(binarySearch);
        while (binarySearch < size() && a == a(binarySearch)) {
            binarySearch++;
        }
        return binarySearch;
    }

    public void clear() {
        this.a.clear();
        this.b.clear();
    }

    public boolean contains(Object obj) {
        return this.b.contains(obj);
    }

    public boolean containsAll(Collection collection) {
        return this.b.containsAll(collection);
    }

    public int d(Comparable comparable) {
        if (comparable == null || !contains(comparable)) {
            return -1;
        }
        return b(comparable);
    }

    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    public Iterator iterator() {
        return this.a.iterator();
    }

    public boolean remove(Object obj) {
        int d = d((Comparable) obj);
        if (d == -1) {
            return false;
        }
        this.a.remove(d);
        return this.b.remove(obj);
    }

    public boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    public boolean retainAll(Collection collection) {
        boolean z = false;
        for (int size = size() - 1; size >= 0; size--) {
            Comparable comparable = (Comparable) this.a.get(size);
            if (!collection.contains(comparable)) {
                this.a.remove(size);
                this.b.remove(comparable);
                z = true;
            }
        }
        return z;
    }

    public int size() {
        return this.a.size();
    }

    public Object[] toArray() {
        return this.a.toArray();
    }

    public Object[] toArray(Object[] objArr) {
        return this.a.toArray(objArr);
    }

    public int b(Comparable comparable) {
        int binarySearch = Collections.binarySearch(this.a, comparable);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        Comparable a = a(binarySearch);
        while (binarySearch >= 0 && a == a(binarySearch)) {
            binarySearch--;
        }
        return binarySearch + 1;
    }

    public Comparable a(int i) {
        return (Comparable) this.a.get(i);
    }

    public void a(int i, Comparable comparable) {
        this.b.remove((Comparable) this.a.get(i));
        this.a.set(i, comparable);
        this.b.add(comparable);
    }

    public Comparable a() {
        return (Comparable) this.a.get(size() - 1);
    }
}
