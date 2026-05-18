package com.google.protobuf.kotlin;

import Ra.a;
import java.util.ListIterator;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class UnmodifiableListIterator implements ListIterator, a {
    private final /* synthetic */ ListIterator $$delegate_0;

    public UnmodifiableListIterator(ListIterator listIterator) {
        t.g(listIterator, "delegate");
        this.$$delegate_0 = listIterator;
    }

    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean hasNext() {
        return this.$$delegate_0.hasNext();
    }

    public boolean hasPrevious() {
        return this.$$delegate_0.hasPrevious();
    }

    public Object next() {
        return this.$$delegate_0.next();
    }

    public int nextIndex() {
        return this.$$delegate_0.nextIndex();
    }

    public Object previous() {
        return this.$$delegate_0.previous();
    }

    public int previousIndex() {
        return this.$$delegate_0.previousIndex();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
