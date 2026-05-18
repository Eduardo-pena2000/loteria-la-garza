package z;

import b0.h2;
import b0.m;
import z.o0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class p0 {
    public static final Qa.l a = b.a;
    public static final Ca.l b = Ca.m.a(Ca.n.c, a.a);

    public static final class a extends kotlin.jvm.internal.u implements Qa.a {
        public static final a a = new a();

        public static final class a extends kotlin.jvm.internal.u implements Qa.l {
            public static final a a = new a();

            public a() {
                super(1);
            }

            public final void a(Qa.a aVar) {
                aVar.invoke();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Qa.a) obj);
                return Ca.I.a;
            }
        }

        public a() {
            super(0);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l0.L invoke() {
            l0.L l = new l0.L(a.a);
            l.q();
            return l;
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.l {
        public static final b a = new b();

        public b() {
            super(1);
        }

        public final void a(c0 c0Var) {
            throw null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.b.a(obj);
            a(null);
            return Ca.I.a;
        }
    }

    public static final class c extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ o0 a;
        public final /* synthetic */ o0 b;

        public static final class a implements b0.X {
            public final /* synthetic */ o0 a;
            public final /* synthetic */ o0 b;

            public a(o0 o0Var, o0 o0Var2) {
                this.a = o0Var;
                this.b = o0Var2;
            }

            public void dispose() {
                this.a.B(this.b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(o0 o0Var, o0 o0Var2) {
            super(1);
            this.a = o0Var;
            this.b = o0Var2;
        }

        public final b0.X invoke(b0.Y y) {
            this.a.d(this.b);
            return new a(this.a, this.b);
        }
    }

    public static final class d extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ o0 a;
        public final /* synthetic */ o0.a b;

        public static final class a implements b0.X {
            public final /* synthetic */ o0 a;
            public final /* synthetic */ o0.a b;

            public a(o0 o0Var, o0.a aVar) {
                this.a = o0Var;
                this.b = aVar;
            }

            public void dispose() {
                this.a.z(this.b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(o0 o0Var, o0.a aVar) {
            super(1);
            this.a = o0Var;
            this.b = aVar;
        }

        public final b0.X invoke(b0.Y y) {
            return new a(this.a, this.b);
        }
    }

    public static final class e extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ o0 a;
        public final /* synthetic */ o0.d b;

        public static final class a implements b0.X {
            public final /* synthetic */ o0 a;
            public final /* synthetic */ o0.d b;

            public a(o0 o0Var, o0.d dVar) {
                this.a = o0Var;
                this.b = dVar;
            }

            public void dispose() {
                this.a.A(this.b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(o0 o0Var, o0.d dVar) {
            super(1);
            this.a = o0Var;
            this.b = dVar;
        }

        public final b0.X invoke(b0.Y y) {
            this.a.c(this.b);
            return new a(this.a, this.b);
        }
    }

    public static final class f extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ o0 a;

        public static final class a implements b0.X {
            public final /* synthetic */ o0 a;

            public a(o0 o0Var) {
                this.a = o0Var;
            }

            public void dispose() {
                this.a.u();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(o0 o0Var) {
            super(1);
            this.a = o0Var;
        }

        public final b0.X invoke(b0.Y y) {
            return new a(this.a);
        }
    }

    public static final o0 a(o0 o0Var, Object obj, Object obj2, String str, b0.m mVar, int i) {
        if (b0.w.L()) {
            b0.w.U(-198307638, i, -1, "androidx.compose.animation.core.createChildTransitionInternal (Transition.kt:1825)");
        }
        int i2 = (i & 14) ^ 6;
        boolean z = true;
        boolean z2 = (i2 > 4 && mVar.U(o0Var)) || (i & 6) == 4;
        Object C = mVar.C();
        if (z2 || C == b0.m.a.a()) {
            C = new o0(new V(obj), o0Var, o0Var.j() + " > " + str);
            mVar.t(C);
        }
        o0 o0Var2 = (o0) C;
        if ((i2 <= 4 || !mVar.U(o0Var)) && (i & 6) != 4) {
            z = false;
        }
        boolean U = mVar.U(o0Var2) | z;
        Object C2 = mVar.C();
        if (U || C2 == b0.m.a.a()) {
            C2 = new c(o0Var, o0Var2);
            mVar.t(C2);
        }
        b0.b0.a(o0Var2, (Qa.l) C2, mVar, 0);
        if (o0Var.s()) {
            o0Var2.D(obj, obj2, o0Var.k());
        } else {
            o0Var2.L(obj2);
            o0Var2.F(false);
        }
        if (b0.w.L()) {
            b0.w.T();
        }
        return o0Var2;
    }

    public static final o0.a b(o0 o0Var, s0 s0Var, String str, b0.m mVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            str = "DeferredAnimation";
        }
        if (b0.w.L()) {
            b0.w.U(-1714122528, i, -1, "androidx.compose.animation.core.createDeferredAnimation (Transition.kt:1779)");
        }
        int i3 = (i & 14) ^ 6;
        boolean z = true;
        boolean z2 = (i3 > 4 && mVar.U(o0Var)) || (i & 6) == 4;
        Object C = mVar.C();
        if (z2 || C == b0.m.a.a()) {
            C = new o0.a(o0Var, s0Var, str);
            mVar.t(C);
        }
        o0.a aVar = (o0.a) C;
        if ((i3 <= 4 || !mVar.U(o0Var)) && (i & 6) != 4) {
            z = false;
        }
        boolean E = mVar.E(aVar) | z;
        Object C2 = mVar.C();
        if (E || C2 == b0.m.a.a()) {
            C2 = new d(o0Var, aVar);
            mVar.t(C2);
        }
        b0.b0.a(aVar, (Qa.l) C2, mVar, 0);
        if (o0Var.s()) {
            aVar.d();
        }
        if (b0.w.L()) {
            b0.w.T();
        }
        return aVar;
    }

    public static final h2 c(o0 o0Var, Object obj, Object obj2, G g, s0 s0Var, String str, b0.m mVar, int i) {
        if (b0.w.L()) {
            b0.w.U(-304821198, i, -1, "androidx.compose.animation.core.createTransitionAnimation (Transition.kt:1900)");
        }
        int i2 = (i & 14) ^ 6;
        boolean z = true;
        boolean z2 = (i2 > 4 && mVar.U(o0Var)) || (i & 6) == 4;
        Object C = mVar.C();
        if (z2 || C == b0.m.a.a()) {
            Object dVar = new o0.d(o0Var, obj, l.i(s0Var, obj2), s0Var, str);
            mVar.t(dVar);
            C = dVar;
        }
        o0.d dVar2 = (o0.d) C;
        if (o0Var.s()) {
            dVar2.E(obj, obj2, g);
        } else {
            dVar2.F(obj2, g);
        }
        if ((i2 <= 4 || !mVar.U(o0Var)) && (i & 6) != 4) {
            z = false;
        }
        boolean U = mVar.U(dVar2) | z;
        Object C2 = mVar.C();
        if (U || C2 == b0.m.a.a()) {
            C2 = new e(o0Var, dVar2);
            mVar.t(C2);
        }
        b0.b0.a(dVar2, (Qa.l) C2, mVar, 0);
        if (b0.w.L()) {
            b0.w.T();
        }
        return dVar2;
    }

    public static final o0 d(Object obj, String str, b0.m mVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if (b0.w.L()) {
            b0.w.U(2029166765, i, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:91)");
        }
        Object C = mVar.C();
        m.a aVar = b0.m.a;
        if (C == aVar.a()) {
            C = new o0(obj, str);
            mVar.t(C);
        }
        o0 o0Var = (o0) C;
        o0Var.e(obj, mVar, (i & 8) | 48 | (i & 14));
        Object C2 = mVar.C();
        if (C2 == aVar.a()) {
            C2 = new f(o0Var);
            mVar.t(C2);
        }
        b0.b0.a(o0Var, (Qa.l) C2, mVar, 54);
        if (b0.w.L()) {
            b0.w.T();
        }
        return o0Var;
    }
}
