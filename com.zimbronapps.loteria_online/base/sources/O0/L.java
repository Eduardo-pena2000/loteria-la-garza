package O0;

import android.view.View;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class l {
    public static final View a(j jVar) {
        if (!jVar.getNode().isAttached()) {
            L0.a.b("Cannot get View because the Modifier node is not currently attached.");
        }
        View b = N.b(k.n(jVar));
        kotlin.jvm.internal.t.e(b, "null cannot be cast to non-null type android.view.View");
        return b;
    }
}
