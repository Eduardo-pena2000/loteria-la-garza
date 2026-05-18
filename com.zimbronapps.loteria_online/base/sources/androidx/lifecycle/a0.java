package androidx.lifecycle;

import android.view.View;
import android.view.ViewParent;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class a0 {
    public static final r a(View view) {
        kotlin.jvm.internal.t.g(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(E2.a.a);
            r rVar = tag instanceof r ? (r) tag : null;
            if (rVar != null) {
                return rVar;
            }
            ViewParent a = W1.b.a(view);
            view = a instanceof View ? (View) a : null;
        }
        return null;
    }

    public static final void b(View view, r rVar) {
        kotlin.jvm.internal.t.g(view, "<this>");
        view.setTag(E2.a.a, rVar);
    }
}
