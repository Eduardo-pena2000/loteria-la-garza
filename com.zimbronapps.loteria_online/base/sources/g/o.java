package G;

import I.K;
import b0.U1;
import b0.h2;
import kotlin.jvm.internal.D;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class o {

    public /* synthetic */ class a extends D {
        public a(Object obj) {
            super(obj, h2.class, "value", "getValue()Ljava/lang/Object;", 0);
        }

        public Object get() {
            return ((h2) ((kotlin.jvm.internal.f) this).receiver).getValue();
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.a {
        public final /* synthetic */ h2 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h2 h2Var) {
            super(0);
            this.a = h2Var;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k invoke() {
            return new k((Qa.l) this.a.getValue());
        }
    }

    public static final class c extends kotlin.jvm.internal.u implements Qa.a {
        public final /* synthetic */ h2 a;
        public final /* synthetic */ B b;
        public final /* synthetic */ d c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(h2 h2Var, B b, d dVar) {
            super(0);
            this.a = h2Var;
            this.b = b;
            this.c = dVar;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n invoke() {
            k kVar = (k) this.a.getValue();
            return new n(this.b, kVar, this.c, new K(this.b.w(), kVar));
        }
    }

    public static final Qa.a a(B b2, Qa.l lVar, b0.m mVar, int i) {
        if (b0.w.L()) {
            b0.w.U(-343736148, i, -1, "androidx.compose.foundation.lazy.rememberLazyListItemProviderLambda (LazyListItemProvider.kt:43)");
        }
        h2 o = U1.o(lVar, mVar, (i >> 3) & 14);
        boolean z = (((i & 14) ^ 6) > 4 && mVar.U(b2)) || (i & 6) == 4;
        Object C = mVar.C();
        if (z || C == b0.m.a.a()) {
            C = new a(U1.d(U1.n(), new c(U1.d(U1.n(), new b(o)), b2, new d())));
            mVar.t(C);
        }
        Xa.k kVar = (Xa.k) C;
        if (b0.w.L()) {
            b0.w.T();
        }
        return kVar;
    }
}
