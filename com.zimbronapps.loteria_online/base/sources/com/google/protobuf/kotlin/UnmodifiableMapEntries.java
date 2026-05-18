package com.google.protobuf.kotlin;

import Ra.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class UnmodifiableMapEntries extends UnmodifiableCollection implements Set, a {
    private final Set delegate;

    public static final class 1 implements Iterator, a {
        private final /* synthetic */ Iterator $$delegate_0;
        final /* synthetic */ Iterator $itr;

        public 1(Iterator it) {
            this.$itr = it;
            this.$$delegate_0 = it;
        }

        public boolean hasNext() {
            return this.$$delegate_0.hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public Map.Entry next() {
            return new UnmodifiableMapEntry((Map.Entry) this.$itr.next());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnmodifiableMapEntries(Set set) {
        super((Collection) set);
        t.g(set, "delegate");
        this.delegate = set;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return contains((Map.Entry) obj);
        }
        return false;
    }

    public Iterator iterator() {
        return new 1(this.delegate.iterator());
    }

    public /* bridge */ boolean contains(Map.Entry entry) {
        return super.contains((Object) entry);
    }
}
