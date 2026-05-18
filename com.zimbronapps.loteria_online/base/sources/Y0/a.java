package y0;

import v0.e1;
import w.f0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a {
    public c a;
    public c b;
    public w.Q c;
    public w.Q d;
    public boolean e;

    public static final /* synthetic */ w.Q a(a aVar) {
        return aVar.c;
    }

    public static final /* synthetic */ c b(a aVar) {
        return aVar.a;
    }

    public static final /* synthetic */ w.Q c(a aVar) {
        return aVar.d;
    }

    public static final /* synthetic */ c d(a aVar) {
        return aVar.b;
    }

    public static final /* synthetic */ void e(a aVar, c cVar) {
        aVar.a = cVar;
    }

    public static final /* synthetic */ void f(a aVar, w.Q q) {
        aVar.d = q;
    }

    public static final /* synthetic */ void g(a aVar, c cVar) {
        aVar.b = cVar;
    }

    public static final /* synthetic */ void h(a aVar, boolean z) {
        aVar.e = z;
    }

    public final boolean i(c cVar) {
        if (!this.e) {
            e1.a("Only add dependencies during a tracking");
        }
        w.Q q = this.c;
        if (q != null) {
            kotlin.jvm.internal.t.d(q);
            q.h(cVar);
        } else if (this.a != null) {
            w.Q b = f0.b();
            c cVar2 = this.a;
            kotlin.jvm.internal.t.d(cVar2);
            b.h(cVar2);
            b.h(cVar);
            this.c = b;
            this.a = null;
        } else {
            this.a = cVar;
        }
        w.Q q2 = this.d;
        if (q2 != null) {
            kotlin.jvm.internal.t.d(q2);
            return !q2.y(cVar);
        }
        if (this.b != cVar) {
            return true;
        }
        this.b = null;
        return false;
    }
}
