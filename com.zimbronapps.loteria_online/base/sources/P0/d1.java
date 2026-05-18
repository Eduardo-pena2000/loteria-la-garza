package P0;

import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class d1 {
    public final W0.m a;
    public final w.G b;

    public d1(W0.t tVar, w.o oVar) {
        this.a = tVar.y();
        this.b = new w.G(tVar.v().size());
        List v = tVar.v();
        int size = v.size();
        for (int i = 0; i < size; i++) {
            W0.t tVar2 = (W0.t) v.get(i);
            if (oVar.b(tVar2.q())) {
                this.b.g(tVar2.q());
            }
        }
    }

    public final w.G a() {
        return this.b;
    }

    public final W0.m b() {
        return this.a;
    }
}
