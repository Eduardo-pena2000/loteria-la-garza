package G5;

import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class v {
    public final Executor a;
    public final H5.d b;
    public final x c;
    public final I5.b d;

    public v(Executor executor, H5.d dVar, x xVar, I5.b bVar) {
        this.a = executor;
        this.b = dVar;
        this.c = xVar;
        this.d = bVar;
    }

    public static /* synthetic */ Object a(v vVar) {
        return vVar.d();
    }

    public static /* synthetic */ void b(v vVar) {
        vVar.e();
    }

    public void c() {
        this.a.execute(new t(this));
    }

    public final /* synthetic */ Object d() {
        Iterator it = this.b.D().iterator();
        while (it.hasNext()) {
            this.c.a((z5.p) it.next(), 1);
        }
        return null;
    }

    public final /* synthetic */ void e() {
        this.d.b(new u(this));
    }
}
