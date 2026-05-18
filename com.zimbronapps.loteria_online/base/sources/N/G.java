package N;

import b0.B1;
import b0.g1;
import b0.m;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class g {

    public static final class a extends kotlin.jvm.internal.u implements Qa.a {
        public final /* synthetic */ B.i a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(B.i iVar) {
            super(0);
            this.a = iVar;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return Ca.I.a;
        }

        public final void invoke() {
            B.j.a(this.a);
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ T.F a;
        public final /* synthetic */ Qa.p b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(T.F f, Qa.p pVar, int i) {
            super(2);
            this.a = f;
            this.b = pVar;
            this.c = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return Ca.I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            g.a(this.a, this.b, mVar, g1.a(this.c | 1));
        }
    }

    public static final void a(T.F f, Qa.p pVar, b0.m mVar, int i) {
        int i2;
        b0.m i3 = mVar.i(-1985516685);
        if ((i & 6) == 0) {
            i2 = (i3.E(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.E(pVar) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && i3.j()) {
            i3.M();
        } else {
            if (b0.w.L()) {
                b0.w.U(-1985516685, i2, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:35)");
            }
            Object C = i3.C();
            m.a aVar = b0.m.a;
            if (C == aVar.a()) {
                C = new B.i(null, 1, null);
                i3.t(C);
            }
            B.i iVar = (B.i) C;
            Object C2 = i3.C();
            if (C2 == aVar.a()) {
                C2 = new a(iVar);
                i3.t(C2);
            }
            B.a.b(iVar, (Qa.a) C2, T.H.a(f, iVar), null, f.E(), pVar, i3, ((i2 << 12) & 458752) | 54, 8);
            if (b0.w.L()) {
                b0.w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new b(f, pVar, i));
        }
    }
}
