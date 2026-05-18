package A;

import O0.A0;
import androidx.compose.ui.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class i0 extends e.c implements A0 {
    public androidx.compose.foundation.f a;
    public boolean b;
    public C.n c;
    public boolean d;
    public boolean e;

    public static final class a extends kotlin.jvm.internal.u implements Qa.a {
        public a() {
            super(0);
        }

        public final Float invoke() {
            return Float.valueOf(i0.this.E1().m());
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.a {
        public b() {
            super(0);
        }

        public final Float invoke() {
            return Float.valueOf(i0.this.E1().l());
        }
    }

    public i0(androidx.compose.foundation.f fVar, boolean z, C.n nVar, boolean z2, boolean z3) {
        this.a = fVar;
        this.b = z;
        this.c = nVar;
        this.d = z2;
        this.e = z3;
    }

    public final androidx.compose.foundation.f E1() {
        return this.a;
    }

    public final void F1(C.n nVar) {
        this.c = nVar;
    }

    public final void G1(boolean z) {
        this.b = z;
    }

    public final void H1(boolean z) {
        this.d = z;
    }

    public final void I1(androidx.compose.foundation.f fVar) {
        this.a = fVar;
    }

    public final void J1(boolean z) {
        this.e = z;
    }

    public void g1(W0.D d) {
        W0.B.q0(d, true);
        W0.j jVar = new W0.j(new a(), new b(), this.b);
        if (this.e) {
            W0.B.r0(d, jVar);
        } else {
            W0.B.Y(d, jVar);
        }
    }
}
