package A;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class n {
    public static final long a = ViewConfiguration.getTapTimeout();

    public static final long a() {
        return a;
    }

    public static final boolean b(KeyEvent keyEvent) {
        return G0.c.e(G0.d.b(keyEvent), G0.c.a.b()) && d(keyEvent);
    }

    public static final boolean c(O0.j jVar) {
        return e(O0.l.a(jVar));
    }

    public static final boolean d(KeyEvent keyEvent) {
        int b = G0.g.b(G0.d.a(keyEvent));
        return b == 23 || b == 66 || b == 160;
    }

    public static final boolean e(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }

    public static final boolean f(KeyEvent keyEvent) {
        return G0.c.e(G0.d.b(keyEvent), G0.c.a.a()) && d(keyEvent);
    }
}
