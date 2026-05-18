package hb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class z extends cb.a implements Ia.e {
    public final Ga.e d;

    public z(Ga.i iVar, Ga.e eVar) {
        super(iVar, true, true);
        this.d = eVar;
    }

    public void G(Object obj) {
        i.b(Ha.b.c(this.d), cb.E.a(obj, this.d));
    }

    public void N0(Object obj) {
        Ga.e eVar = this.d;
        eVar.resumeWith(cb.E.a(obj, eVar));
    }

    public final Ia.e getCallerFrame() {
        Ga.e eVar = this.d;
        if (eVar instanceof Ia.e) {
            return (Ia.e) eVar;
        }
        return null;
    }

    public final boolean j0() {
        return true;
    }
}
