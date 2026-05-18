package Q;

import P0.g1;
import P0.r1;
import cb.B0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class q0 implements f1.M {
    public a a;

    public interface a {
        B0 E0(Qa.p pVar);

        T.F T0();

        g1 getSoftwareKeyboardController();

        r1 getViewConfiguration();

        M0.p p0();

        N.y y1();
    }

    public final void d() {
        g1 softwareKeyboardController;
        a aVar = this.a;
        if (aVar == null || (softwareKeyboardController = aVar.getSoftwareKeyboardController()) == null) {
            return;
        }
        softwareKeyboardController.a();
    }

    public final void g() {
        g1 softwareKeyboardController;
        a aVar = this.a;
        if (aVar == null || (softwareKeyboardController = aVar.getSoftwareKeyboardController()) == null) {
            return;
        }
        softwareKeyboardController.show();
    }

    public final a i() {
        return this.a;
    }

    public final void j(a aVar) {
        if (this.a != null) {
            throw new IllegalStateException("Expected textInputModifierNode to be null");
        }
        this.a = aVar;
    }

    public abstract void k();

    public final void l(a aVar) {
        if (this.a == aVar) {
            this.a = null;
            return;
        }
        throw new IllegalStateException(("Expected textInputModifierNode to be " + aVar + " but was " + this.a).toString());
    }
}
