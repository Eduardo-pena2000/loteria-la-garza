package F;

import P0.L0;
import P0.N0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class k0 {

    public static final class a extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ e0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e0 e0Var) {
            super(1);
            this.a = e0Var;
        }

        public final void a(N0 n0) {
            n0.d("insetsBottomHeight");
            n0.b().c("insets", this.a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((N0) obj);
            return Ca.I.a;
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.p {
        public static final b a = new b();

        public b() {
            super(2);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(e0 e0Var, n1.d dVar) {
            return Integer.valueOf(e0Var.c(dVar));
        }
    }

    public static final class c extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ e0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e0 e0Var) {
            super(1);
            this.a = e0Var;
        }

        public final void a(N0 n0) {
            n0.d("insetsTopHeight");
            n0.b().c("insets", this.a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((N0) obj);
            return Ca.I.a;
        }
    }

    public static final class d extends kotlin.jvm.internal.u implements Qa.p {
        public static final d a = new d();

        public d() {
            super(2);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(e0 e0Var, n1.d dVar) {
            return Integer.valueOf(e0Var.d(dVar));
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, e0 e0Var) {
        return eVar.then(new r(e0Var, L0.b() ? new a(e0Var) : L0.a(), b.a));
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, e0 e0Var) {
        return eVar.then(new r(e0Var, L0.b() ? new c(e0Var) : L0.a(), d.a));
    }
}
