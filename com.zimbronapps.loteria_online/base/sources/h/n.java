package H;

import b0.U1;
import b0.h2;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class n {

    public /* synthetic */ class a extends kotlin.jvm.internal.D {
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
        public final j invoke() {
            return new j((Qa.l) this.a.getValue());
        }
    }

    public static final class c extends kotlin.jvm.internal.u implements Qa.a {
        public final /* synthetic */ h2 a;
        public final /* synthetic */ I b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(h2 h2Var, I i) {
            super(0);
            this.a = h2Var;
            this.b = i;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final m invoke() {
            j jVar = (j) this.a.getValue();
            return new m(this.b, jVar, new I.K(this.b.u(), jVar));
        }
    }

    public static final Qa.a a(I i, Qa.l lVar, b0.m mVar, int i2) {
        if (b0.w.L()) {
            b0.w.U(-1898306282, i2, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridItemProviderLambda (LazyGridItemProvider.kt:40)");
        }
        h2 o = U1.o(lVar, mVar, (i2 >> 3) & 14);
        boolean z = (((i2 & 14) ^ 6) > 4 && mVar.U(i)) || (i2 & 6) == 4;
        Object C = mVar.C();
        if (z || C == b0.m.a.a()) {
            C = new a(U1.d(U1.n(), new c(U1.d(U1.n(), new b(o)), i)));
            mVar.t(C);
        }
        Xa.k kVar = (Xa.k) C;
        if (b0.w.L()) {
            b0.w.T();
        }
        return kVar;
    }
}
