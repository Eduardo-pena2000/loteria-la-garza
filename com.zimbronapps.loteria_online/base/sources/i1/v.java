package i1;

import android.graphics.Typeface;
import b0.h2;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class v {
    public final h2 a;
    public final v b;
    public final Object c;

    public v(h2 h2Var, v vVar) {
        this.a = h2Var;
        this.b = vVar;
        this.c = h2Var.getValue();
    }

    public final Typeface a() {
        Object obj = this.c;
        kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) obj;
    }

    public final boolean b() {
        v vVar;
        return this.a.getValue() != this.c || ((vVar = this.b) != null && vVar.b());
    }
}
