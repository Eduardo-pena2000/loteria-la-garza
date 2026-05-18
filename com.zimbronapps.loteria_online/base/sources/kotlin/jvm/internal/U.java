package kotlin.jvm.internal;

import java.io.Serializable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class u implements o, Serializable {
    private final int arity;

    public u(int i) {
        this.arity = i;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String j = P.j(this);
        t.f(j, "renderLambdaToString(...)");
        return j;
    }
}
