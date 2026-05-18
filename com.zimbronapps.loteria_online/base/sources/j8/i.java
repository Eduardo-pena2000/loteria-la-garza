package J8;

import G8.n;
import G8.o;
import G8.p;
import G8.q;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class i extends p {
    public static final q c = e(n.a);
    public final G8.d a;
    public final o b;

    public class a implements q {
        public final /* synthetic */ o a;

        public a(o oVar) {
            this.a = oVar;
        }

        public p a(G8.d dVar, N8.a aVar) {
            if (aVar.c() == Object.class) {
                return new i(dVar, this.a, null);
            }
            return null;
        }
    }

    public /* synthetic */ i(G8.d dVar, o oVar, a aVar) {
        this(dVar, oVar);
    }

    public static q d(o oVar) {
        return oVar == n.a ? c : e(oVar);
    }

    private static q e(o oVar) {
        return new a(oVar);
    }

    public void c(O8.a aVar, Object obj) {
        if (obj == null) {
            aVar.u();
            return;
        }
        p g = this.a.g(obj.getClass());
        if (!(g instanceof i)) {
            g.c(aVar, obj);
        } else {
            aVar.d();
            aVar.h();
        }
    }

    public i(G8.d dVar, o oVar) {
        this.a = dVar;
        this.b = oVar;
    }
}
