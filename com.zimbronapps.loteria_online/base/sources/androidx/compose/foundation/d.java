package androidx.compose.foundation;

import A.M;
import A.N;
import A.O;
import A.Q;
import A.s;
import Ca.I;
import E.k;
import P0.L0;
import P0.N0;
import Qa.l;
import Qa.q;
import b0.H;
import b0.b1;
import b0.m;
import b0.w;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class d {
    public static final b1 a = H.j(a.a);

    public static final class a extends u implements Qa.a {
        public static final a a = new a();

        public a() {
            super(0);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final M invoke() {
            return s.a;
        }
    }

    public static final class b extends u implements l {
        public final /* synthetic */ k a;
        public final /* synthetic */ M b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k kVar, M m) {
            super(1);
            this.a = kVar;
            this.b = m;
        }

        public final void a(N0 n0) {
            n0.d("indication");
            n0.b().c("interactionSource", this.a);
            n0.b().c("indication", this.b);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((N0) obj);
            return I.a;
        }
    }

    public static final class c extends u implements q {
        public final /* synthetic */ M a;
        public final /* synthetic */ k b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(M m, k kVar) {
            super(3);
            this.a = m;
            this.b = kVar;
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, m mVar, int i) {
            mVar.V(-353972293);
            if (w.L()) {
                w.U(-353972293, i, -1, "androidx.compose.foundation.indication.<anonymous> (Indication.kt:182)");
            }
            N b = this.a.b(this.b, mVar, 0);
            boolean U = mVar.U(b);
            Object C = mVar.C();
            if (U || C == m.a.a()) {
                C = new O(b);
                mVar.t(C);
            }
            O o = (O) C;
            if (w.L()) {
                w.T();
            }
            mVar.P();
            return o;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.e) obj, (m) obj2, ((Number) obj3).intValue());
        }
    }

    public static final b1 a() {
        return a;
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, k kVar, M m) {
        if (m == null) {
            return eVar;
        }
        if (m instanceof Q) {
            return eVar.then(new IndicationModifierElement(kVar, (Q) m));
        }
        return androidx.compose.ui.c.b(eVar, L0.b() ? new b(kVar, m) : L0.a(), new c(m, kVar));
    }
}
