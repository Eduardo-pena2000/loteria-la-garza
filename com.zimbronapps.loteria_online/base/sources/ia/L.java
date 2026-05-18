package Ia;

import kotlin.jvm.internal.P;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class l extends d implements o {
    private final int arity;

    public l(int i, Ga.e eVar) {
        super(eVar);
        this.arity = i;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String i = P.i(this);
        t.f(i, "renderLambdaToString(...)");
        return i;
    }
}
