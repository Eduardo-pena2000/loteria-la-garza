package c0;

import Qa.p;
import b0.H1;
import b0.u1;
import b0.w;
import c0.d;
import c0.i;
import kotlin.jvm.internal.V;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c extends j {
    public final i a = new i();
    public final i b = new i();

    public final void a() {
        this.b.a();
        this.a.a();
    }

    public final void b(Qa.a aVar, int i, b0.b bVar) {
        i iVar = this.a;
        d.o oVar = d.o.c;
        iVar.j(oVar);
        i a = i.b.a(iVar);
        i.b.b(a, d.t.a(0), aVar);
        a.c[a.d - a.a[a.b - 1].d()] = i;
        i.b.b(a, d.t.a(1), bVar);
        iVar.c(oVar);
        i iVar2 = this.b;
        d.u uVar = d.u.c;
        iVar2.j(uVar);
        i a2 = i.b.a(iVar2);
        a2.c[a2.d - a2.a[a2.b - 1].d()] = i;
        i.b.b(a2, d.t.a(0), bVar);
        iVar2.c(uVar);
    }

    public final void c() {
        if (!this.b.g()) {
            w.t("Cannot end node insertion, there are no pending operations that can be realized.");
        }
        this.b.h(this.a);
    }

    public final void d(b0.d dVar, H1 h1, u1 u1Var, f fVar) {
        if (!this.b.f()) {
            w.t("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        this.a.d(dVar, h1, u1Var, fVar);
    }

    public final boolean e() {
        return this.a.f();
    }

    public final void f(Object obj, p pVar) {
        i iVar = this.a;
        d.G g = d.G.c;
        iVar.j(g);
        i a = i.b.a(iVar);
        i.b.b(a, d.t.a(0), obj);
        int a2 = d.t.a(1);
        t.e(pVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        i.b.b(a, a2, (p) V.e(pVar, 2));
        iVar.c(g);
    }
}
