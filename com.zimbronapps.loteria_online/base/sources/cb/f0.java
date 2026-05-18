package cb;

import cb.B0;
import java.util.Iterator;
import java.util.concurrent.CancellationException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract /* synthetic */ class F0 {

    public /* synthetic */ class a extends kotlin.jvm.internal.q implements Qa.l {
        public a(Object obj) {
            super(1, obj, G0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        }

        public final void b(Throwable th) {
            ((G0) this.receiver).v(th);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return Ca.I.a;
        }
    }

    public static final A a(B0 b0) {
        return new D0(b0);
    }

    public static /* synthetic */ A b(B0 b0, int i, Object obj) {
        if ((i & 1) != 0) {
            b0 = null;
        }
        return E0.a(b0);
    }

    public static final void c(Ga.i iVar, CancellationException cancellationException) {
        B0 b0 = (B0) iVar.get(B0.P8);
        if (b0 != null) {
            b0.cancel(cancellationException);
        }
    }

    public static final void d(B0 b0, String str, Throwable th) {
        b0.cancel(p0.a(str, th));
    }

    public static /* synthetic */ void e(Ga.i iVar, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        E0.c(iVar, cancellationException);
    }

    public static /* synthetic */ void f(B0 b0, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        E0.d(b0, str, th);
    }

    public static final Object g(B0 b0, Ga.e eVar) {
        B0.a.b(b0, null, 1, null);
        Object join = b0.join(eVar);
        return join == Ha.c.f() ? join : Ca.I.a;
    }

    public static final void h(Ga.i iVar, CancellationException cancellationException) {
        Ya.h children;
        B0 b0 = (B0) iVar.get(B0.P8);
        if (b0 == null || (children = b0.getChildren()) == null) {
            return;
        }
        Iterator it = children.iterator();
        while (it.hasNext()) {
            ((B0) it.next()).cancel(cancellationException);
        }
    }

    public static /* synthetic */ void i(Ga.i iVar, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        E0.h(iVar, cancellationException);
    }

    public static final g0 j(B0 b0, g0 g0Var) {
        return E0.o(b0, false, new i0(g0Var), 1, null);
    }

    public static final void k(Ga.i iVar) {
        B0 b0 = (B0) iVar.get(B0.P8);
        if (b0 != null) {
            E0.l(b0);
        }
    }

    public static final void l(B0 b0) {
        if (!b0.isActive()) {
            throw b0.getCancellationException();
        }
    }

    public static final B0 m(Ga.i iVar) {
        B0 b0 = (B0) iVar.get(B0.P8);
        if (b0 != null) {
            return b0;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + iVar).toString());
    }

    public static final g0 n(B0 b0, boolean z, G0 g0) {
        return b0 instanceof H0 ? ((H0) b0).i0(z, g0) : b0.invokeOnCompletion(g0.u(), z, new a(g0));
    }

    public static /* synthetic */ g0 o(B0 b0, boolean z, G0 g0, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return E0.n(b0, z, g0);
    }

    public static final boolean p(Ga.i iVar) {
        B0 b0 = (B0) iVar.get(B0.P8);
        if (b0 != null) {
            return b0.isActive();
        }
        return true;
    }
}
