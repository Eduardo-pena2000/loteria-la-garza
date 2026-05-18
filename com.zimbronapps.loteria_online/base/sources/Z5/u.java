package z5;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
import z5.i;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class u implements t {
    public static volatile v e;
    public final J5.a a;
    public final J5.a b;
    public final F5.e c;
    public final G5.r d;

    public u(J5.a aVar, J5.a aVar2, F5.e eVar, G5.r rVar, G5.v vVar) {
        this.a = aVar;
        this.b = aVar2;
        this.c = eVar;
        this.d = rVar;
        vVar.c();
    }

    public static u c() {
        v vVar = e;
        if (vVar != null) {
            return vVar.b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static Set d(f fVar) {
        return fVar instanceof g ? Collections.unmodifiableSet(((g) fVar).a()) : Collections.singleton(w5.c.b("proto"));
    }

    public static void f(Context context) {
        if (e == null) {
            synchronized (u.class) {
                try {
                    if (e == null) {
                        e = e.a().a(context).build();
                    }
                } finally {
                }
            }
        }
    }

    public void a(o oVar, w5.k kVar) {
        this.c.a(oVar.f().f(oVar.c().d()), b(oVar), kVar);
    }

    public final i b(o oVar) {
        i.a g = i.a().i(this.a.a()).o(this.b.a()).n(oVar.g()).h(new h(oVar.b(), oVar.d())).g(oVar.c().a());
        if (oVar.c().e() != null && oVar.c().e().a() != null) {
            g.l(oVar.c().e().a());
        }
        oVar.c().b();
        return g.d();
    }

    public G5.r e() {
        return this.d;
    }

    public w5.j g(f fVar) {
        return new q(d(fVar), p.a().b(fVar.getName()).c(fVar.getExtras()).a(), this);
    }
}
