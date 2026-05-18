package androidx.compose.ui.viewinterop;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.f;
import t0.k;
import u0.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class a {
    public static final /* synthetic */ boolean a(View view, View view2) {
        return d(view, view2);
    }

    public static final /* synthetic */ Rect b(k kVar, View view, View view2) {
        return f(kVar, view, view2);
    }

    public static final /* synthetic */ View c(e.c cVar) {
        return g(cVar);
    }

    public static final boolean d(View view, View view2) {
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }

    public static final e e(e eVar) {
        return f.a(f.a(eVar.then(FocusGroupPropertiesElement.b)).then(FocusTargetPropertiesElement.b));
    }

    public static final Rect f(k kVar, View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        h q = kVar.q();
        if (q == null) {
            return null;
        }
        return new Rect((((int) q.i()) + iArr[0]) - iArr2[0], (((int) q.l()) + iArr[1]) - iArr2[1], (((int) q.j()) + iArr[0]) - iArr2[0], (((int) q.e()) + iArr[1]) - iArr2[1]);
    }

    public static final View g(e.c cVar) {
        View Z = O0.k.n(cVar.getNode()).Z();
        if (Z != null) {
            return Z;
        }
        throw new IllegalStateException("Could not fetch interop view");
    }
}
