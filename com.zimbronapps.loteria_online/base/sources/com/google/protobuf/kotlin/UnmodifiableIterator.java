package com.google.protobuf.kotlin;

import Ra.a;
import java.util.Iterator;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class UnmodifiableIterator implements Iterator, a {
    private final /* synthetic */ Iterator $$delegate_0;

    public UnmodifiableIterator(Iterator it) {
        t.g(it, "delegate");
        this.$$delegate_0 = it;
    }

    public boolean hasNext() {
        return this.$$delegate_0.hasNext();
    }

    public Object next() {
        return this.$$delegate_0.next();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
