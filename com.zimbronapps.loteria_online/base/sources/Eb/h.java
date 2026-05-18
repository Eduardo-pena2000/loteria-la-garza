package eb;

import cb.C0;
import cb.H0;
import java.util.concurrent.CancellationException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class h extends cb.a implements g {
    public final g d;

    public h(Ga.i iVar, g gVar, boolean z, boolean z2) {
        super(iVar, z, z2);
        this.d = gVar;
    }

    public void L(Throwable th) {
        CancellationException G0 = H0.G0(this, th, null, 1, null);
        this.d.cancel(G0);
        J(G0);
    }

    public final g R0() {
        return this.d;
    }

    public Object c(Ga.e eVar) {
        return this.d.c(eVar);
    }

    public final void cancel(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new C0(H0.y(this), null, this);
        }
        L(cancellationException);
    }

    public Object e(Object obj, Ga.e eVar) {
        return this.d.e(obj, eVar);
    }

    public Object i(Object obj) {
        return this.d.i(obj);
    }

    public i iterator() {
        return this.d.iterator();
    }

    public kb.f l() {
        return this.d.l();
    }

    public Object m() {
        return this.d.m();
    }

    public boolean n(Throwable th) {
        return this.d.n(th);
    }

    public Object v(Ga.e eVar) {
        Object v = this.d.v(eVar);
        Ha.c.f();
        return v;
    }

    public boolean w() {
        return this.d.w();
    }

    public void x(Qa.l lVar) {
        this.d.x(lVar);
    }

    public /* synthetic */ void cancel() {
        L(new C0(H0.y(this), null, this));
    }

    public final /* synthetic */ boolean cancel(Throwable th) {
        L(new C0(H0.y(this), null, this));
        return true;
    }
}
