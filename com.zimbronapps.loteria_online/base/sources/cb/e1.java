package cb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class e1 extends hb.z {
    public final ThreadLocal e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public e1(Ga.i iVar, Ga.e eVar) {
        f1 f1Var = f1.a;
        super(iVar.get(f1Var) == null ? iVar.plus(f1Var) : iVar, eVar);
        this.e = new ThreadLocal();
        if (eVar.getContext().get(Ga.f.D8) instanceof K) {
            return;
        }
        Object i = hb.K.i(iVar, null);
        hb.K.f(iVar, i);
        S0(iVar, i);
    }

    public void N0(Object obj) {
        if (this.threadLocalIsSet) {
            Ca.q qVar = (Ca.q) this.e.get();
            if (qVar != null) {
                hb.K.f((Ga.i) qVar.a(), qVar.b());
            }
            this.e.remove();
        }
        Object a = E.a(obj, this.d);
        Ga.e eVar = this.d;
        Ga.i context = eVar.getContext();
        Object i = hb.K.i(context, null);
        e1 m = i != hb.K.a ? I.m(eVar, context, i) : null;
        try {
            this.d.resumeWith(a);
            Ca.I i2 = Ca.I.a;
        } finally {
            if (m == null || m.R0()) {
                hb.K.f(context, i);
            }
        }
    }

    public final boolean R0() {
        boolean z = this.threadLocalIsSet && this.e.get() == null;
        this.e.remove();
        return !z;
    }

    public final void S0(Ga.i iVar, Object obj) {
        this.threadLocalIsSet = true;
        this.e.set(Ca.x.a(iVar, obj));
    }
}
