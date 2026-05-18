package F5;

import A5.m;
import G5.x;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import w5.k;
import z5.p;
import z5.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class c implements e {
    public static final Logger f = Logger.getLogger(u.class.getName());
    public final x a;
    public final Executor b;
    public final A5.e c;
    public final H5.d d;
    public final I5.b e;

    public c(Executor executor, A5.e eVar, x xVar, H5.d dVar, I5.b bVar) {
        this.b = executor;
        this.c = eVar;
        this.a = xVar;
        this.d = dVar;
        this.e = bVar;
    }

    public static /* synthetic */ Object b(c cVar, p pVar, z5.i iVar) {
        return cVar.d(pVar, iVar);
    }

    public static /* synthetic */ void c(c cVar, p pVar, k kVar, z5.i iVar) {
        cVar.e(pVar, kVar, iVar);
    }

    public void a(p pVar, z5.i iVar, k kVar) {
        this.b.execute(new a(this, pVar, kVar, iVar));
    }

    public final /* synthetic */ Object d(p pVar, z5.i iVar) {
        this.d.W0(pVar, iVar);
        this.a.a(pVar, 1);
        return null;
    }

    public final /* synthetic */ void e(p pVar, k kVar, z5.i iVar) {
        try {
            m mVar = this.c.get(pVar.b());
            if (mVar == null) {
                String format = String.format("Transport backend '%s' is not registered", new Object[]{pVar.b()});
                f.warning(format);
                kVar.a(new IllegalArgumentException(format));
            } else {
                this.e.b(new b(this, pVar, mVar.a(iVar)));
                kVar.a(null);
            }
        } catch (Exception e) {
            f.warning("Error scheduling event " + e.getMessage());
            kVar.a(e);
        }
    }
}
