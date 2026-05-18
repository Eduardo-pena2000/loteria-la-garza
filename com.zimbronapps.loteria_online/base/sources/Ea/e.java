package Ea;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class e extends a {
    public final d a;

    public e(d backing) {
        t.g(backing, "backing");
        this.a = backing;
    }

    public int a() {
        return this.a.size();
    }

    public boolean addAll(Collection elements) {
        t.g(elements, "elements");
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.a.clear();
    }

    public boolean containsAll(Collection elements) {
        t.g(elements, "elements");
        return this.a.r(elements);
    }

    public boolean e(Map.Entry element) {
        t.g(element, "element");
        return this.a.s(element);
    }

    public boolean f(Map.Entry element) {
        t.g(element, "element");
        return this.a.N(element);
    }

    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean add(Map.Entry element) {
        t.g(element, "element");
        throw new UnsupportedOperationException();
    }

    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    public Iterator iterator() {
        return this.a.w();
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
