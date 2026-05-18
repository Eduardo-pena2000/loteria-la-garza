package W0;

import O0.A0;
import androidx.compose.ui.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c extends e.c implements A0 {
    public boolean a;
    public boolean b;
    public Qa.l c;

    public c(boolean z, boolean z2, Qa.l lVar) {
        this.a = z;
        this.b = z2;
        this.c = lVar;
    }

    public boolean A1() {
        return this.a;
    }

    public final void E1(boolean z) {
        this.a = z;
    }

    public final void F1(Qa.l lVar) {
        this.c = lVar;
    }

    public boolean W() {
        return this.b;
    }

    public void g1(D d) {
        this.c.invoke(d);
    }
}
