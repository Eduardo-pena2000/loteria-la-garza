package b0;

import Ga.i;
import cb.L;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class p0 implements v1, cb.L {
    public final Ga.i a;
    public final Qa.p b;
    public final cb.O c;
    public cb.B0 d;

    public p0(Ga.i iVar, Qa.p pVar) {
        this.a = iVar;
        this.b = pVar;
        this.c = cb.P.a(iVar.plus(iVar.get(n0.h.b) != null ? this : Ga.j.a));
    }

    public void c() {
        cb.B0 b0 = this.d;
        if (b0 != null) {
            cb.E0.f(b0, "Old job was still running!", (Throwable) null, 2, (Object) null);
        }
        this.d = cb.i.d(this.c, (Ga.i) null, (cb.Q) null, this.b, 3, (Object) null);
    }

    public void e() {
        cb.B0 b0 = this.d;
        if (b0 != null) {
            b0.cancel(new r0());
        }
        this.d = null;
    }

    public Object fold(Object obj, Qa.p pVar) {
        return L.a.a(this, obj, pVar);
    }

    public void g() {
        cb.B0 b0 = this.d;
        if (b0 != null) {
            b0.cancel(new r0());
        }
        this.d = null;
    }

    public i.b get(i.c cVar) {
        return L.a.b(this, cVar);
    }

    public i.c getKey() {
        return cb.L.O8;
    }

    public void handleException(Ga.i iVar, Throwable th) {
        n0.h hVar = (n0.h) iVar.get(n0.h.b);
        if (hVar != null) {
            hVar.c(th, this);
        }
        cb.L l = this.a.get(cb.L.O8);
        if (l == null) {
            throw th;
        }
        l.handleException(iVar, th);
    }

    public Ga.i minusKey(i.c cVar) {
        return L.a.c(this, cVar);
    }

    public Ga.i plus(Ga.i iVar) {
        return L.a.d(this, iVar);
    }
}
