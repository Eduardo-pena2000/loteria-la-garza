package N;

import android.view.KeyEvent;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class t {
    public static final r a = new a();

    public static final class a implements r {
        public p a(KeyEvent keyEvent) {
            p pVar = null;
            if (G0.d.f(keyEvent) && G0.d.d(keyEvent)) {
                long a = G0.d.a(keyEvent);
                B b = B.a;
                if (G0.a.r(a, b.i())) {
                    pVar = p.SELECT_LINE_LEFT;
                } else if (G0.a.r(a, b.j())) {
                    pVar = p.SELECT_LINE_RIGHT;
                } else if (G0.a.r(a, b.k())) {
                    pVar = p.SELECT_HOME;
                } else if (G0.a.r(a, b.h())) {
                    pVar = p.SELECT_END;
                }
            } else if (G0.d.d(keyEvent)) {
                long a2 = G0.d.a(keyEvent);
                B b2 = B.a;
                if (G0.a.r(a2, b2.i())) {
                    pVar = p.LINE_LEFT;
                } else if (G0.a.r(a2, b2.j())) {
                    pVar = p.LINE_RIGHT;
                } else if (G0.a.r(a2, b2.k())) {
                    pVar = p.HOME;
                } else if (G0.a.r(a2, b2.h())) {
                    pVar = p.END;
                }
            }
            return pVar == null ? s.b().a(keyEvent) : pVar;
        }
    }

    public static final r a() {
        return a;
    }
}
