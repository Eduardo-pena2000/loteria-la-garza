package Pb;

import Sb.v;
import Sb.x;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class s extends Ub.a {
    public final v a = new v();
    public final o b = new o();

    public Ub.c c(Ub.h hVar) {
        return !hVar.a() ? Ub.c.b(hVar.getIndex()) : Ub.c.d();
    }

    public void d(x xVar) {
        this.b.a(xVar);
    }

    public boolean e() {
        return true;
    }

    public Sb.a f() {
        return this.a;
    }

    public void g() {
        if (this.b.e().f()) {
            this.a.m();
        } else {
            this.a.k(this.b.f());
        }
    }

    public void h(Tb.f fVar) {
        this.b.h(fVar);
    }

    public void i(Tb.b bVar) {
        Tb.g e = this.b.e();
        if (e.f()) {
            return;
        }
        bVar.a(e, this.a);
    }

    public List j() {
        return this.b.d();
    }

    public Tb.g k() {
        return this.b.e();
    }
}
