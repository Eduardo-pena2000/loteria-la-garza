package F;

import P0.L0;
import P0.N0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class h0 {
    public static final N0.l a = N0.e.a(a.a);

    public static final class a extends kotlin.jvm.internal.u implements Qa.a {
        public static final a a = new a();

        public a() {
            super(0);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e0 invoke() {
            return g0.a(0, 0, 0, 0);
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ Qa.l a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Qa.l lVar) {
            super(1);
            this.a = lVar;
        }

        public final void a(N0 n0) {
            n0.d("onConsumedWindowInsetsChanged");
            n0.b().c("block", this.a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((N0) obj);
            return Ca.I.a;
        }
    }

    public static final class c extends kotlin.jvm.internal.u implements Qa.q {
        public final /* synthetic */ Qa.l a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Qa.l lVar) {
            super(3);
            this.a = lVar;
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, b0.m mVar, int i) {
            mVar.V(-1608161351);
            if (b0.w.L()) {
                b0.w.U(-1608161351, i, -1, "androidx.compose.foundation.layout.onConsumedWindowInsetsChanged.<anonymous> (WindowInsetsPadding.kt:125)");
            }
            boolean U = mVar.U(this.a);
            Qa.l lVar = this.a;
            Object C = mVar.C();
            if (U || C == b0.m.a.a()) {
                C = new p(lVar);
                mVar.t(C);
            }
            p pVar = (p) C;
            if (b0.w.L()) {
                b0.w.T();
            }
            mVar.P();
            return pVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.e) obj, (b0.m) obj2, ((Number) obj3).intValue());
        }
    }

    public static final class d extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ e0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e0 e0Var) {
            super(1);
            this.a = e0Var;
        }

        public final void a(N0 n0) {
            n0.d("windowInsetsPadding");
            n0.b().c("insets", this.a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((N0) obj);
            return Ca.I.a;
        }
    }

    public static final class e extends kotlin.jvm.internal.u implements Qa.q {
        public final /* synthetic */ e0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e0 e0Var) {
            super(3);
            this.a = e0Var;
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, b0.m mVar, int i) {
            mVar.V(-1415685722);
            if (b0.w.L()) {
                b0.w.U(-1415685722, i, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.kt:61)");
            }
            boolean U = mVar.U(this.a);
            e0 e0Var = this.a;
            Object C = mVar.C();
            if (U || C == b0.m.a.a()) {
                C = new z(e0Var);
                mVar.t(C);
            }
            z zVar = (z) C;
            if (b0.w.L()) {
                b0.w.T();
            }
            mVar.P();
            return zVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.e) obj, (b0.m) obj2, ((Number) obj3).intValue());
        }
    }

    public static final N0.l a() {
        return a;
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, Qa.l lVar) {
        return androidx.compose.ui.c.b(eVar, L0.b() ? new b(lVar) : L0.a(), new c(lVar));
    }

    public static final androidx.compose.ui.e c(androidx.compose.ui.e eVar, e0 e0Var) {
        return androidx.compose.ui.c.b(eVar, L0.b() ? new d(e0Var) : L0.a(), new e(e0Var));
    }
}
