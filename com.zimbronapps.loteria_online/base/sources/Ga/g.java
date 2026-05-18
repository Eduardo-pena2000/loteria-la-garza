package Ga;

import Ca.I;
import Ca.s;
import Qa.p;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class g {
    public static final e a(p pVar, Object obj, e completion) {
        t.g(pVar, "<this>");
        t.g(completion, "completion");
        return new k(Ha.b.c(Ha.b.a(pVar, obj, completion)), Ha.c.f());
    }

    public static final void b(p pVar, Object obj, e completion) {
        t.g(pVar, "<this>");
        t.g(completion, "completion");
        e c = Ha.b.c(Ha.b.a(pVar, obj, completion));
        s.a aVar = s.b;
        c.resumeWith(s.b(I.a));
    }
}
