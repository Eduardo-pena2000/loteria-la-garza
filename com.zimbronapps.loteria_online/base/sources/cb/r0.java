package cb;

import Ca.s;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class R0 extends G0 {
    public final p e;

    public R0(p pVar) {
        this.e = pVar;
    }

    public boolean u() {
        return false;
    }

    public void v(Throwable th) {
        Object c0 = t().c0();
        if (c0 instanceof C) {
            p pVar = this.e;
            s.a aVar = Ca.s.b;
            pVar.resumeWith(Ca.s.b(Ca.t.a(((C) c0).a)));
        } else {
            p pVar2 = this.e;
            s.a aVar2 = Ca.s.b;
            pVar2.resumeWith(Ca.s.b(I0.h(c0)));
        }
    }
}
