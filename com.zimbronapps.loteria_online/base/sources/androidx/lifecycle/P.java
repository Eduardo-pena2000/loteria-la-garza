package androidx.lifecycle;

import cb.B0;
import cb.W0;
import cb.e0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class p {
    public static final l a(k kVar) {
        m mVar;
        kotlin.jvm.internal.t.g(kVar, "<this>");
        do {
            m mVar2 = (m) kVar.getInternalScopeRef().b();
            if (mVar2 != null) {
                return mVar2;
            }
            mVar = new m(kVar, W0.b((B0) null, 1, (Object) null).plus(e0.c().E()));
        } while (!kVar.getInternalScopeRef().a(null, mVar));
        mVar.c();
        return mVar;
    }
}
