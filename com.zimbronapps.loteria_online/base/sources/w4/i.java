package w4;

import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class i extends h {
    public final Object b;
    public final String c;
    public final j d;
    public final g e;

    public i(Object obj, String str, j jVar, g gVar) {
        t.g(obj, "value");
        t.g(str, "tag");
        t.g(jVar, "verificationMode");
        t.g(gVar, "logger");
        this.b = obj;
        this.c = str;
        this.d = jVar;
        this.e = gVar;
    }

    public Object a() {
        return this.b;
    }

    public h c(String str, Qa.l lVar) {
        t.g(str, "message");
        t.g(lVar, "condition");
        return ((Boolean) lVar.invoke(this.b)).booleanValue() ? this : new f(this.b, this.c, str, this.e, this.d);
    }
}
