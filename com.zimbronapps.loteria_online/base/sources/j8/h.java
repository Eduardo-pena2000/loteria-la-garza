package J8;

import G8.n;
import G8.o;
import G8.p;
import G8.q;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class h extends p {
    public static final q b = e(n.b);
    public final o a;

    public class a implements q {
        public a() {
        }

        public p a(G8.d dVar, N8.a aVar) {
            if (aVar.c() == Number.class) {
                return h.this;
            }
            return null;
        }
    }

    public h(o oVar) {
        this.a = oVar;
    }

    public static q d(o oVar) {
        return oVar == n.b ? b : e(oVar);
    }

    public static q e(o oVar) {
        return new h(oVar).new a();
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void c(O8.a aVar, Number number) {
        aVar.N(number);
    }
}
