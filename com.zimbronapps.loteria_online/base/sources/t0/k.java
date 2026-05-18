package t0;

import android.view.KeyEvent;
import androidx.compose.ui.focus.FocusTargetNode;
import w.L;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface k extends i {

    public static final class a extends kotlin.jvm.internal.u implements Qa.a {
        public static final a a = new a();

        public a() {
            super(0);
        }

        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    static /* synthetic */ boolean l(k kVar, KeyEvent keyEvent, Qa.a aVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatchKeyEvent-YhN2O0w");
        }
        if ((i & 2) != 0) {
            aVar = a.a;
        }
        return kVar.n(keyEvent, aVar);
    }

    void b();

    boolean c(androidx.compose.ui.focus.c cVar, u0.h hVar);

    Boolean d(int i, u0.h hVar, Qa.l lVar);

    boolean e(KeyEvent keyEvent);

    FocusTargetNode f();

    void g(FocusTargetNode focusTargetNode);

    void h();

    androidx.compose.ui.e i();

    boolean j(F0.c cVar, Qa.a aVar);

    boolean k();

    boolean m(boolean z, boolean z2, boolean z3, int i);

    boolean n(KeyEvent keyEvent, Qa.a aVar);

    p o();

    boolean p(K0.c cVar, Qa.a aVar);

    u0.h q();

    void r(FocusTargetNode focusTargetNode);

    void s();

    void t(e eVar);

    L u();
}
