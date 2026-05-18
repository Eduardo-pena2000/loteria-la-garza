package cb;

import Ca.s;
import java.util.concurrent.CancellationException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class b0 extends jb.h {
    public int c;

    public b0(int i) {
        this.c = i;
    }

    public abstract Ga.e c();

    public Throwable d(Object obj) {
        C c = obj instanceof C ? (C) obj : null;
        if (c != null) {
            return c.a;
        }
        return null;
    }

    public final void f(Throwable th) {
        M.a(c().getContext(), new S("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object h();

    public final void run() {
        try {
            Ga.e c = c();
            kotlin.jvm.internal.t.e(c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            hb.h hVar = (hb.h) c;
            Ga.e eVar = hVar.e;
            Object obj = hVar.g;
            Ga.i context = eVar.getContext();
            Object i = hb.K.i(context, obj);
            B0 b0 = null;
            e1 m = i != hb.K.a ? I.m(eVar, context, i) : null;
            try {
                Ga.i context2 = eVar.getContext();
                Object h = h();
                Throwable d = d(h);
                if (d == null && c0.b(this.c)) {
                    b0 = (B0) context2.get(B0.P8);
                }
                if (b0 != null && !b0.isActive()) {
                    CancellationException cancellationException = b0.getCancellationException();
                    b(h, cancellationException);
                    s.a aVar = Ca.s.b;
                    eVar.resumeWith(Ca.s.b(Ca.t.a(cancellationException)));
                } else if (d != null) {
                    s.a aVar2 = Ca.s.b;
                    eVar.resumeWith(Ca.s.b(Ca.t.a(d)));
                } else {
                    s.a aVar3 = Ca.s.b;
                    eVar.resumeWith(Ca.s.b(e(h)));
                }
                Ca.I i2 = Ca.I.a;
                if (m == null || m.R0()) {
                    hb.K.f(context, i);
                }
            } catch (Throwable th) {
                if (m == null || m.R0()) {
                    hb.K.f(context, i);
                }
                throw th;
            }
        } catch (Throwable th2) {
            f(th2);
        }
    }

    public Object e(Object obj) {
        return obj;
    }

    public void b(Object obj, Throwable th) {
    }
}
