package F;

import b0.B1;
import b0.g1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class i {

    public static final class a extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ M0.B a;
        public final /* synthetic */ Qa.q b;

        public static final class a extends kotlin.jvm.internal.u implements Qa.p {
            public final /* synthetic */ Qa.q a;
            public final /* synthetic */ k b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Qa.q qVar, k kVar) {
                super(2);
                this.a = qVar;
                this.b = kVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((b0.m) obj, ((Number) obj2).intValue());
                return Ca.I.a;
            }

            public final void invoke(b0.m mVar, int i) {
                if ((i & 3) == 2 && mVar.j()) {
                    mVar.M();
                    return;
                }
                if (b0.w.L()) {
                    b0.w.U(-1945019079, i, -1, "androidx.compose.foundation.layout.BoxWithConstraints.<anonymous>.<anonymous>.<anonymous> (BoxWithConstraints.kt:68)");
                }
                this.a.invoke(this.b, mVar, 0);
                if (b0.w.L()) {
                    b0.w.T();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(M0.B b, Qa.q qVar) {
            super(2);
            this.a = b;
            this.b = qVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke-0kLqBqw((M0.S) obj, ((n1.b) obj2).r());
        }

        public final M0.C invoke-0kLqBqw(M0.S s, long j) {
            return this.a.measure-3p2s80s(s, s.Y(Ca.I.a, j0.i.b(-1945019079, true, new a(this.b, new k(s, j, null)))), j);
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ androidx.compose.ui.e a;
        public final /* synthetic */ o0.e b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ Qa.q d;
        public final /* synthetic */ int e;
        public final /* synthetic */ int f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.compose.ui.e eVar, o0.e eVar2, boolean z, Qa.q qVar, int i, int i2) {
            super(2);
            this.a = eVar;
            this.b = eVar2;
            this.c = z;
            this.d = qVar;
            this.e = i;
            this.f = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return Ca.I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            i.a(this.a, this.b, this.c, this.d, mVar, g1.a(this.e | 1), this.f);
        }
    }

    public static final void a(androidx.compose.ui.e eVar, o0.e eVar2, boolean z, Qa.q qVar, b0.m mVar, int i, int i2) {
        int i3;
        b0.m i4 = mVar.i(1781813501);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (i4.U(eVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= i4.U(eVar2) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= i4.a(z) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= i4.E(qVar) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && i4.j()) {
            i4.M();
        } else {
            if (i5 != 0) {
                eVar = androidx.compose.ui.e.a;
            }
            if (i6 != 0) {
                eVar2 = o0.e.a.o();
            }
            if (i7 != 0) {
                z = false;
            }
            if (b0.w.L()) {
                b0.w.U(1781813501, i3, -1, "androidx.compose.foundation.layout.BoxWithConstraints (BoxWithConstraints.kt:64)");
            }
            M0.B h = f.h(eVar2, z);
            boolean U = ((i3 & 7168) == 2048) | i4.U(h);
            Object C = i4.C();
            if (U || C == b0.m.a.a()) {
                C = new a(h, qVar);
                i4.t(C);
            }
            androidx.compose.ui.layout.y.a(eVar, (Qa.p) C, i4, i3 & 14, 0);
            if (b0.w.L()) {
                b0.w.T();
            }
        }
        androidx.compose.ui.e eVar3 = eVar;
        o0.e eVar4 = eVar2;
        boolean z2 = z;
        B1 l = i4.l();
        if (l != null) {
            l.a(new b(eVar3, eVar4, z2, qVar, i, i2));
        }
    }
}
