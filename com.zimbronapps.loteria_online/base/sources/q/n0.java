package Q;

import P0.Z0;
import P0.a1;
import P0.g1;
import P0.r1;
import Q.q0;
import androidx.compose.ui.e;
import b0.C0;
import b0.U1;
import cb.B0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class n0 extends e.c implements Z0, O0.h, O0.v, q0.a {
    public q0 a;
    public N.y b;
    public T.F c;
    public final C0 d = U1.i(null, null, 2, null);

    public static final class a extends Ia.l implements Qa.p {
        public int a;
        public final /* synthetic */ Qa.p c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Qa.p pVar, Ga.e eVar) {
            super(2, eVar);
            this.c = pVar;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            return n0.this.new a(this.c, eVar);
        }

        public final Object invoke(cb.O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(Ca.I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                Ca.t.b(obj);
                n0 n0Var = n0.this;
                Qa.p pVar = this.c;
                this.a = 1;
                if (a1.b(n0Var, pVar, this) == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Ca.t.b(obj);
            }
            throw new Ca.i();
        }
    }

    public n0(q0 q0Var, N.y yVar, T.F f) {
        this.a = q0Var;
        this.b = yVar;
        this.c = f;
    }

    private void E1(M0.p pVar) {
        this.d.setValue(pVar);
    }

    public B0 E0(Qa.p pVar) {
        if (isAttached()) {
            return cb.i.d(getCoroutineScope(), (Ga.i) null, cb.Q.d, new a(pVar, null), 1, (Object) null);
        }
        return null;
    }

    public void F1(N.y yVar) {
        this.b = yVar;
    }

    public final void G1(q0 q0Var) {
        if (isAttached()) {
            this.a.c();
            this.a.l(this);
        }
        this.a = q0Var;
        if (isAttached()) {
            this.a.j(this);
        }
    }

    public void H1(T.F f) {
        this.c = f;
    }

    public T.F T0() {
        return this.c;
    }

    public void g(M0.p pVar) {
        E1(pVar);
    }

    public g1 getSoftwareKeyboardController() {
        return (g1) O0.i.a(this, P0.p0.o());
    }

    public r1 getViewConfiguration() {
        return (r1) O0.i.a(this, P0.p0.r());
    }

    public void onAttach() {
        this.a.j(this);
    }

    public void onDetach() {
        this.a.l(this);
    }

    public M0.p p0() {
        return (M0.p) this.d.getValue();
    }

    public N.y y1() {
        return this.b;
    }
}
