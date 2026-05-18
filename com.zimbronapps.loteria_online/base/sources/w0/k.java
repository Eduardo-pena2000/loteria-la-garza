package W0;

import android.graphics.Region;
import v0.s1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class k implements E {
    public final Region a = new Region();

    public n1.p a() {
        return s1.d(this.a.getBounds());
    }

    public void b(n1.p pVar) {
        this.a.set(pVar.f(), pVar.h(), pVar.g(), pVar.d());
    }

    public boolean c(E e) {
        Region region = this.a;
        kotlin.jvm.internal.t.e(e, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticRegionImpl");
        return region.op(((k) e).a, Region.Op.INTERSECT);
    }

    public boolean d(n1.p pVar) {
        return this.a.op(pVar.f(), pVar.h(), pVar.g(), pVar.d(), Region.Op.DIFFERENCE);
    }

    public boolean isEmpty() {
        return this.a.isEmpty();
    }
}
