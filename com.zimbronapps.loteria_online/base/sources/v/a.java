package V;

import B0.d;
import B0.f;
import B0.o;
import kotlin.jvm.internal.t;
import n1.h;
import v0.F1;
import v0.G1;
import v0.H1;
import v0.r0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class a {
    public static d a;

    public static final d a(U.a aVar) {
        d dVar = a;
        if (dVar != null) {
            t.d(dVar);
            return dVar;
        }
        d.a aVar2 = new d.a("Filled.CheckCircle", h.g(24.0f), h.g(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int a2 = o.a();
        F1 f1 = new F1(r0.b.a(), null);
        int a3 = G1.a.a();
        int a4 = H1.a.a();
        f fVar = new f();
        fVar.i(12.0f, 2.0f);
        fVar.b(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        fVar.m(4.48f, 10.0f, 10.0f, 10.0f);
        fVar.m(10.0f, -4.48f, 10.0f, -10.0f);
        fVar.l(17.52f, 2.0f, 12.0f, 2.0f);
        fVar.a();
        fVar.i(10.0f, 17.0f);
        fVar.h(-5.0f, -5.0f);
        fVar.h(1.41f, -1.41f);
        fVar.g(10.0f, 14.17f);
        fVar.h(7.59f, -7.59f);
        fVar.g(19.0f, 8.0f);
        fVar.h(-9.0f, 9.0f);
        fVar.a();
        d f = d.a.d(aVar2, fVar.d(), a2, "", f1, 1.0f, null, 1.0f, 1.0f, a3, a4, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).f();
        a = f;
        t.d(f);
        return f;
    }
}
