package com.google.protobuf.kotlin;

import Ra.a;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class UnmodifiableMapEntry implements Map.Entry, a {
    private final /* synthetic */ Map.Entry $$delegate_0;

    public UnmodifiableMapEntry(Map.Entry entry) {
        t.g(entry, "delegate");
        this.$$delegate_0 = entry;
    }

    public Object getKey() {
        return this.$$delegate_0.getKey();
    }

    public Object getValue() {
        return this.$$delegate_0.getValue();
    }

    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
