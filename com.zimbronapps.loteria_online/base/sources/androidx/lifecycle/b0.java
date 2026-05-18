package androidx.lifecycle;

import android.view.View;
import android.view.ViewParent;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class b0 {
    public static final Z a(View view) {
        kotlin.jvm.internal.t.g(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(F2.c.a);
            Z z = tag instanceof Z ? (Z) tag : null;
            if (z != null) {
                return z;
            }
            ViewParent a = W1.b.a(view);
            view = a instanceof View ? (View) a : null;
        }
        return null;
    }

    public static final void b(View view, Z z) {
        kotlin.jvm.internal.t.g(view, "<this>");
        view.setTag(F2.c.a, z);
    }
}
