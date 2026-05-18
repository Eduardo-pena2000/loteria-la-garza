package K;

import Ca.I;
import M0.p;
import M0.q;
import O0.l;
import android.graphics.Rect;
import android.view.View;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class i {

    public static final class a implements K.a {
        public final /* synthetic */ O0.j a;

        public a(O0.j jVar) {
            this.a = jVar;
        }

        public final Object K0(p pVar, Qa.a aVar, Ga.e eVar) {
            View a = l.a(this.a);
            long e = q.e(pVar);
            u0.h hVar = (u0.h) aVar.invoke();
            u0.h t = hVar != null ? hVar.t(e) : null;
            if (t != null) {
                a.requestRectangleOnScreen(i.a(t), false);
            }
            return I.a;
        }
    }

    public static final /* synthetic */ Rect a(u0.h hVar) {
        return c(hVar);
    }

    public static final K.a b(O0.j jVar) {
        return new a(jVar);
    }

    public static final Rect c(u0.h hVar) {
        return new Rect((int) hVar.i(), (int) hVar.l(), (int) hVar.j(), (int) hVar.e());
    }
}
