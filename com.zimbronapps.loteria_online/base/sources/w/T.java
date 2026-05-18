package W;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import v0.t0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class t {
    public static final boolean a = kotlin.jvm.internal.t.c(Build.DEVICE, "layoutlib");

    public static final /* synthetic */ j a(ViewGroup viewGroup) {
        return c(viewGroup);
    }

    public static final /* synthetic */ ViewGroup b(View view) {
        return e(view);
    }

    public static final j c(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            j childAt = viewGroup.getChildAt(i);
            if (childAt instanceof j) {
                return childAt;
            }
        }
        j jVar = new j(viewGroup.getContext());
        viewGroup.addView(jVar);
        return jVar;
    }

    public static final O0.j d(E.k kVar, boolean z, float f, t0 t0Var, Qa.a aVar) {
        return a ? new c(kVar, z, f, t0Var, aVar, null) : new b(kVar, z, f, t0Var, aVar, null);
    }

    public static final ViewGroup e(View view) {
        while (!(view instanceof ViewGroup)) {
            View parent = view.getParent();
            if (!(parent instanceof View)) {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + view + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
            view = parent;
        }
        return (ViewGroup) view;
    }
}
