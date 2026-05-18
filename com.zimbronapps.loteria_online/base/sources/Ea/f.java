package Ea;

import Da.j;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class f extends j implements Set, Ra.f {
    public final d a;

    public f(d backing) {
        t.g(backing, "backing");
        this.a = backing;
    }

    public int a() {
        return this.a.size();
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection elements) {
        t.g(elements, "elements");
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.a.clear();
    }

    public boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    public Iterator iterator() {
        return this.a.H();
    }

    public boolean remove(Object obj) {
        return this.a.Q(obj);
    }

    public boolean removeAll(Collection elements) {
        t.g(elements, "elements");
        this.a.p();
        return super/*java.util.AbstractCollection*/.removeAll(elements);
    }

    public boolean retainAll(Collection elements) {
        t.g(elements, "elements");
        this.a.p();
        return super/*java.util.AbstractCollection*/.retainAll(elements);
    }
}
