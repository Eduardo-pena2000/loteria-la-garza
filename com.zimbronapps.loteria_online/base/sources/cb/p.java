package cb;

import java.util.concurrent.CancellationException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class P {
    public static final O a(Ga.i iVar) {
        if (iVar.get(B0.P8) == null) {
            iVar = iVar.plus(E0.b(null, 1, null));
        }
        return new hb.d(iVar);
    }

    public static final O b() {
        return new hb.d(W0.b(null, 1, null).plus(e0.c()));
    }

    public static final void c(O o, CancellationException cancellationException) {
        B0 b0 = (B0) o.getCoroutineContext().get(B0.P8);
        if (b0 != null) {
            b0.cancel(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + o).toString());
    }

    public static /* synthetic */ void d(O o, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        c(o, cancellationException);
    }

    public static final Object e(Qa.p pVar, Ga.e eVar) {
        hb.z zVar = new hb.z(eVar.getContext(), eVar);
        Object b = ib.b.b(zVar, zVar, pVar);
        if (b == Ha.c.f()) {
            Ia.h.c(eVar);
        }
        return b;
    }

    public static final void f(O o) {
        E0.k(o.getCoroutineContext());
    }

    public static final boolean g(O o) {
        B0 b0 = (B0) o.getCoroutineContext().get(B0.P8);
        if (b0 != null) {
            return b0.isActive();
        }
        return true;
    }

    public static final O h(O o, Ga.i iVar) {
        return new hb.d(o.getCoroutineContext().plus(iVar));
    }
}
