package Pb;

import Sb.v;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class r extends Ub.a {
    public final Sb.r a = new Sb.r();
    public int b;
    public boolean c;

    public r(int i) {
        this.b = i;
    }

    public boolean a(Sb.a aVar) {
        if (!this.c) {
            return true;
        }
        Sb.a n = this.a.n();
        if (!(n instanceof Sb.q)) {
            return true;
        }
        ((Sb.q) n).o(false);
        return true;
    }

    public boolean b() {
        return true;
    }

    public Ub.c c(Ub.h hVar) {
        if (!hVar.a()) {
            return hVar.d() >= this.b ? Ub.c.a(hVar.b() + this.b) : Ub.c.d();
        }
        if (this.a.c() == null) {
            return Ub.c.d();
        }
        Sb.a f = hVar.f().f();
        this.c = (f instanceof v) || (f instanceof Sb.r);
        return Ub.c.b(hVar.e());
    }

    public Sb.a f() {
        return this.a;
    }
}
