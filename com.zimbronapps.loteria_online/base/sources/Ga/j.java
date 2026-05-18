package Ga;

import Ga.i;
import Qa.p;
import java.io.Serializable;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class j implements i, Serializable {
    public static final j a = new j();

    public Object fold(Object obj, p operation) {
        t.g(operation, "operation");
        return obj;
    }

    public i.b get(i.c key) {
        t.g(key, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public i minusKey(i.c key) {
        t.g(key, "key");
        return this;
    }

    public i plus(i context) {
        t.g(context, "context");
        return context;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
