package cb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class a extends H0 implements B0, Ga.e, O {
    public final Ga.i c;

    public a(Ga.i iVar, boolean z, boolean z2) {
        super(z2);
        if (z) {
            h0((B0) iVar.get(B0.P8));
        }
        this.c = iVar.plus(this);
    }

    public void N0(Object obj) {
        G(obj);
    }

    public String O() {
        return T.a(this) + " was cancelled";
    }

    public final void Q0(Q q, Object obj, Qa.p pVar) {
        q.b(pVar, obj, this);
    }

    public final void g0(Throwable th) {
        M.a(this.c, th);
    }

    public final Ga.i getContext() {
        return this.c;
    }

    public Ga.i getCoroutineContext() {
        return this.c;
    }

    public boolean isActive() {
        return super.isActive();
    }

    public String p0() {
        String g = I.g(this.c);
        if (g == null) {
            return super.p0();
        }
        return '\"' + g + "\":" + super.p0();
    }

    public final void resumeWith(Object obj) {
        Object o0 = o0(E.b(obj));
        if (o0 == I0.b) {
            return;
        }
        N0(o0);
    }

    public final void w0(Object obj) {
        if (!(obj instanceof C)) {
            P0(obj);
        } else {
            C c = (C) obj;
            O0(c.a, c.a());
        }
    }

    public void P0(Object obj) {
    }

    public void O0(Throwable th, boolean z) {
    }
}
