package C;

import C.f;
import Ca.I;
import Ca.s;
import java.util.concurrent.CancellationException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c {
    public static final int b = d0.c.d;
    public final d0.c a = new d0.c(new f.a[16], 0);

    public static final class a extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ f.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f.a aVar) {
            super(1);
            this.b = aVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return I.a;
        }

        public final void invoke(Throwable th) {
            c.a(c.this).s(this.b);
        }
    }

    public static final /* synthetic */ d0.c a(c cVar) {
        return cVar.a;
    }

    public final void b(Throwable th) {
        d0.c cVar = this.a;
        int m = cVar.m();
        cb.n[] nVarArr = new cb.n[m];
        for (int i = 0; i < m; i++) {
            nVarArr[i] = ((f.a) cVar.l()[i]).a();
        }
        for (int i2 = 0; i2 < m; i2++) {
            nVarArr[i2].cancel(th);
        }
        if (!this.a.o()) {
            throw new IllegalStateException("uncancelled requests present");
        }
    }

    public final boolean c(f.a aVar) {
        u0.h hVar = (u0.h) aVar.b().invoke();
        if (hVar == null) {
            cb.n a2 = aVar.a();
            s.a aVar2 = Ca.s.b;
            a2.resumeWith(Ca.s.b(I.a));
            return false;
        }
        aVar.a().z(new a(aVar));
        Wa.i iVar = new Wa.i(0, this.a.m() - 1);
        int f = iVar.f();
        int g = iVar.g();
        if (f <= g) {
            while (true) {
                u0.h hVar2 = (u0.h) ((f.a) this.a.l()[g]).b().invoke();
                if (hVar2 != null) {
                    u0.h p = hVar.p(hVar2);
                    if (kotlin.jvm.internal.t.c(p, hVar)) {
                        this.a.a(g + 1, aVar);
                        return true;
                    }
                    if (!kotlin.jvm.internal.t.c(p, hVar2)) {
                        CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                        int m = this.a.m() - 1;
                        if (m <= g) {
                            while (true) {
                                ((f.a) this.a.l()[g]).a().cancel(cancellationException);
                                if (m == g) {
                                    break;
                                }
                                m++;
                            }
                        }
                    }
                }
                if (g == f) {
                    break;
                }
                g--;
            }
        }
        this.a.a(0, aVar);
        return true;
    }

    public final void d() {
        Wa.i iVar = new Wa.i(0, this.a.m() - 1);
        int f = iVar.f();
        int g = iVar.g();
        if (f <= g) {
            while (true) {
                ((f.a) this.a.l()[f]).a().resumeWith(Ca.s.b(I.a));
                if (f == g) {
                    break;
                } else {
                    f++;
                }
            }
        }
        this.a.h();
    }
}
