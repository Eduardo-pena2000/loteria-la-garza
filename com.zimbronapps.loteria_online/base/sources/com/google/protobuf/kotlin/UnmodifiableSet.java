package com.google.protobuf.kotlin;

import Ra.a;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class UnmodifiableSet extends UnmodifiableCollection implements Set, a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnmodifiableSet(Collection collection) {
        super(collection);
        t.g(collection, "delegate");
    }
}
