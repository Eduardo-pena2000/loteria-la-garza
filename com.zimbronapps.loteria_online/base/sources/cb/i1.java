package cb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class i1 {
    public static final Object a(Ga.e eVar) {
        Object f;
        Ga.i context = eVar.getContext();
        E0.k(context);
        Ga.e c = Ha.b.c(eVar);
        hb.h hVar = c instanceof hb.h ? (hb.h) c : null;
        if (hVar == null) {
            f = Ca.I.a;
        } else {
            if (hVar.d.z(context)) {
                hVar.l(context, Ca.I.a);
            } else {
                h1 h1Var = new h1();
                Ga.i plus = context.plus(h1Var);
                Ca.I i = Ca.I.a;
                hVar.l(plus, i);
                if (h1Var.a) {
                    f = hb.i.c(hVar) ? Ha.c.f() : i;
                }
            }
            f = Ha.c.f();
        }
        if (f == Ha.c.f()) {
            Ia.h.c(eVar);
        }
        return f == Ha.c.f() ? f : Ca.I.a;
    }
}
