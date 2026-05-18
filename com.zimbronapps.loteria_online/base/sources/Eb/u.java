package eb;

import Ca.I;
import cb.M;
import eb.y;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class u extends h implements v {
    public u(Ga.i iVar, g gVar) {
        super(iVar, gVar, true, true);
    }

    public void O0(Throwable th, boolean z) {
        if (R0().n(th) || z) {
            return;
        }
        M.a(getContext(), th);
    }

    /* renamed from: S0, reason: merged with bridge method [inline-methods] */
    public void P0(I i) {
        y.a.a(R0(), null, 1, null);
    }

    public boolean isActive() {
        return super.isActive();
    }
}
