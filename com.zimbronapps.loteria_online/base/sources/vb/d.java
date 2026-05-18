package vb;

import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class d extends IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String msg) {
        super(msg);
        t.g(msg, "msg");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(Xa.c baseClass, Xa.c concreteClass) {
        this("Serializer for " + concreteClass + " already registered in the scope of " + baseClass);
        t.g(baseClass, "baseClass");
        t.g(concreteClass, "concreteClass");
    }
}
