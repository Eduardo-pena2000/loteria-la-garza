package b0;

import cb.L;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class x1 implements cb.O, v1 {
    public static final a e = new a(null);
    public static final int f = 8;
    public static final Ga.i g = new f();
    public final Ga.i a;
    public final Ga.i b;
    public final Object c = this;
    public volatile Ga.i d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends Ga.a implements cb.L {
        public final /* synthetic */ n0.h a;
        public final /* synthetic */ x1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(L.b bVar, n0.h hVar, x1 x1Var) {
            super(bVar);
            this.a = hVar;
            this.b = x1Var;
        }

        public void handleException(Ga.i iVar, Throwable th) {
            this.a.c(th, this.b);
            Ga.i a = x1.a(this.b);
            L.b bVar = cb.L.O8;
            cb.L l = a.get(bVar);
            if (l != null) {
                l.handleException(iVar, th);
                return;
            }
            cb.L l2 = x1.b(this.b).get(bVar);
            if (l2 == null) {
                throw th;
            }
            l2.handleException(iVar, th);
        }
    }

    public x1(Ga.i iVar, Ga.i iVar2) {
        this.a = iVar;
        this.b = iVar2;
    }

    public static final /* synthetic */ Ga.i a(x1 x1Var) {
        return x1Var.b;
    }

    public static final /* synthetic */ Ga.i b(x1 x1Var) {
        return x1Var.a;
    }

    public final void d() {
        synchronized (this.c) {
            try {
                Ga.i iVar = this.d;
                if (iVar == null) {
                    this.d = g;
                } else {
                    cb.E0.c(iVar, new d0());
                }
                Ca.I i = Ca.I.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e() {
        d();
    }

    public void g() {
        d();
    }

    public Ga.i getCoroutineContext() {
        Ga.i iVar;
        Ga.i iVar2 = this.d;
        if (iVar2 == null || iVar2 == g) {
            n0.h hVar = (n0.h) this.a.get(n0.h.b);
            b bVar = hVar != null ? new b(cb.L.O8, hVar, this) : Ga.j.a;
            synchronized (this.c) {
                try {
                    iVar = this.d;
                    if (iVar == null) {
                        Ga.i iVar3 = this.a;
                        iVar = iVar3.plus(cb.E0.a(iVar3.get(cb.B0.P8))).plus(this.b).plus(bVar);
                    } else if (iVar == g) {
                        Ga.i iVar4 = this.a;
                        cb.A a2 = cb.E0.a(iVar4.get(cb.B0.P8));
                        a2.cancel(new d0());
                        iVar = iVar4.plus(a2).plus(this.b).plus(bVar);
                    }
                    this.d = iVar;
                    Ca.I i = Ca.I.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            iVar2 = iVar;
        }
        kotlin.jvm.internal.t.d(iVar2);
        return iVar2;
    }

    public void c() {
    }
}
