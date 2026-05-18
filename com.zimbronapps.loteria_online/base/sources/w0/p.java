package W0;

import w.L;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class p {
    public static final m a(o oVar) {
        m c = oVar.c();
        if (c != null && c.p() && !c.o()) {
            c = c.g();
            L l = new L(oVar.n().size());
            l.l(oVar.n());
            while (l.g()) {
                o oVar2 = (o) l.r(l.b - 1);
                m c2 = oVar2.c();
                if (c2 != null && !c2.p()) {
                    c.q(c2);
                    if (!c2.o()) {
                        l.l(oVar2.n());
                    }
                }
            }
        }
        return c;
    }
}
