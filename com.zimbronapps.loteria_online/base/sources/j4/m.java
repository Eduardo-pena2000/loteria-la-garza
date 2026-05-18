package j4;

import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class m {
    public static final i a(View view) {
        t.g(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(a.a);
            i iVar = tag instanceof i ? (i) tag : null;
            if (iVar != null) {
                return iVar;
            }
            ViewParent a = W1.b.a(view);
            view = a instanceof View ? (View) a : null;
        }
        return null;
    }

    public static final void b(View view, i iVar) {
        t.g(view, "<this>");
        view.setTag(a.a, iVar);
    }
}
