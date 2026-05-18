package C;

import Ca.I;
import androidx.compose.foundation.gestures.DraggableElement;
import b0.U1;
import b0.h2;
import cb.O;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class l {
    public static final Qa.q a = new a(null);
    public static final Qa.q b = new b(null);

    public static final class a extends Ia.l implements Qa.q {
        public int a;

        public a(Ga.e eVar) {
            super(3, eVar);
        }

        public final Object a(O o, long j, Ga.e eVar) {
            return new a(eVar).invokeSuspend(I.a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((O) obj, ((u0.f) obj2).u(), (Ga.e) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            Ha.c.f();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ca.t.b(obj);
            return I.a;
        }
    }

    public static final class b extends Ia.l implements Qa.q {
        public int a;

        public b(Ga.e eVar) {
            super(3, eVar);
        }

        public final Object a(O o, float f, Ga.e eVar) {
            return new b(eVar).invokeSuspend(I.a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((O) obj, ((Number) obj2).floatValue(), (Ga.e) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            Ha.c.f();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ca.t.b(obj);
            return I.a;
        }
    }

    public static final class c extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ h2 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(h2 h2Var) {
            super(1);
            this.a = h2Var;
        }

        public final void a(float f) {
            ((Qa.l) this.a.getValue()).invoke(Float.valueOf(f));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).floatValue());
            return I.a;
        }
    }

    public static final m a(Qa.l lVar) {
        return new g(lVar);
    }

    public static final /* synthetic */ Qa.q b() {
        return a;
    }

    public static final /* synthetic */ Qa.q c() {
        return b;
    }

    public static final /* synthetic */ float d(long j, q qVar) {
        return j(j, qVar);
    }

    public static final /* synthetic */ float e(long j, q qVar) {
        return k(j, qVar);
    }

    public static final /* synthetic */ long f(long j) {
        return l(j);
    }

    public static final androidx.compose.ui.e g(androidx.compose.ui.e eVar, m mVar, q qVar, boolean z, E.m mVar2, boolean z2, Qa.q qVar2, Qa.q qVar3, boolean z3) {
        return eVar.then(new DraggableElement(mVar, qVar, z, mVar2, z2, qVar2, qVar3, z3));
    }

    public static /* synthetic */ androidx.compose.ui.e h(androidx.compose.ui.e eVar, m mVar, q qVar, boolean z, E.m mVar2, boolean z2, Qa.q qVar2, Qa.q qVar3, boolean z3, int i, Object obj) {
        return g(eVar, mVar, qVar, (i & 4) != 0 ? true : z, (i & 8) != 0 ? null : mVar2, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? a : qVar2, (i & 64) != 0 ? b : qVar3, (i & 128) != 0 ? false : z3);
    }

    public static final m i(Qa.l lVar, b0.m mVar, int i) {
        if (b0.w.L()) {
            b0.w.U(-183245213, i, -1, "androidx.compose.foundation.gestures.rememberDraggableState (Draggable.kt:135)");
        }
        h2 o = U1.o(lVar, mVar, i & 14);
        Object C = mVar.C();
        if (C == b0.m.a.a()) {
            C = a(new c(o));
            mVar.t(C);
        }
        m mVar2 = (m) C;
        if (b0.w.L()) {
            b0.w.T();
        }
        return mVar2;
    }

    public static final float j(long j, q qVar) {
        return qVar == q.a ? u0.f.n(j) : u0.f.m(j);
    }

    public static final float k(long j, q qVar) {
        return qVar == q.a ? n1.y.i(j) : n1.y.h(j);
    }

    public static final long l(long j) {
        return n1.z.a(Float.isNaN(n1.y.h(j)) ? 0.0f : n1.y.h(j), Float.isNaN(n1.y.i(j)) ? 0.0f : n1.y.i(j));
    }
}
