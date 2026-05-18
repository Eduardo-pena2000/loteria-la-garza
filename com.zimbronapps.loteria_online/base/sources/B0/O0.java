package b0;

import Ca.s;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class o0 {
    public final Object a = new Object();
    public List b = new ArrayList();
    public List c = new ArrayList();
    public boolean d = true;

    public static final class a implements Qa.l {
        public final /* synthetic */ cb.n b;

        public a(cb.n nVar) {
            this.b = nVar;
        }

        public final void a(Throwable th) {
            Object b = o0.b(o0.this);
            o0 o0Var = o0.this;
            cb.n nVar = this.b;
            synchronized (b) {
                o0.a(o0Var).remove(nVar);
                Ca.I i = Ca.I.a;
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Ca.I.a;
        }
    }

    public static final /* synthetic */ List a(o0 o0Var) {
        return o0Var.b;
    }

    public static final /* synthetic */ Object b(o0 o0Var) {
        return o0Var.a;
    }

    public final Object c(Ga.e eVar) {
        if (e()) {
            return Ca.I.a;
        }
        cb.p pVar = new cb.p(Ha.b.c(eVar), 1);
        pVar.E();
        synchronized (b(this)) {
            a(this).add(pVar);
        }
        pVar.z(new a(pVar));
        Object w = pVar.w();
        if (w == Ha.c.f()) {
            Ia.h.c(eVar);
        }
        return w == Ha.c.f() ? w : Ca.I.a;
    }

    public final void d() {
        synchronized (this.a) {
            this.d = false;
            Ca.I i = Ca.I.a;
        }
    }

    public final boolean e() {
        boolean z;
        synchronized (this.a) {
            z = this.d;
        }
        return z;
    }

    public final void f() {
        synchronized (this.a) {
            try {
                if (e()) {
                    return;
                }
                List list = this.b;
                this.b = this.c;
                this.c = list;
                this.d = true;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Ga.e eVar = (Ga.e) list.get(i);
                    s.a aVar = Ca.s.b;
                    eVar.resumeWith(Ca.s.b(Ca.I.a));
                }
                list.clear();
                Ca.I i2 = Ca.I.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
