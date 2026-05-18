package Xa;

import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class d {
    public static final Object a(c cVar, Object obj) {
        t.g(cVar, "<this>");
        if (cVar.a(obj)) {
            t.e(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            return obj;
        }
        throw new ClassCastException("Value cannot be cast to " + cVar.c());
    }
}
