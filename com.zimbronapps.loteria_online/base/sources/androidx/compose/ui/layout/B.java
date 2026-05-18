package androidx.compose.ui.layout;

import O0.F;
import O0.U;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b implements M0.m, l {
    public final F a;

    public static final class a implements M0.C {
        public final int a;
        public final int b;
        public final Map c;
        public final Qa.l d;
        public final /* synthetic */ Qa.l e;
        public final /* synthetic */ b f;

        public a(int i, int i2, Map map, Qa.l lVar, Qa.l lVar2, b bVar) {
            this.e = lVar2;
            this.f = bVar;
            this.a = i;
            this.b = i2;
            this.c = map;
            this.d = lVar;
        }

        public void A() {
            this.e.invoke(this.f.j().O1());
        }

        public Qa.l B() {
            return this.d;
        }

        public int getHeight() {
            return this.b;
        }

        public int getWidth() {
            return this.a;
        }

        public Map z() {
            return this.c;
        }
    }

    public b(F f, androidx.compose.ui.layout.a aVar) {
        this.a = f;
    }

    public float A(int i) {
        return this.a.A(i);
    }

    public long M(float f) {
        return this.a.M(f);
    }

    public long N(long j) {
        return this.a.N(j);
    }

    public float S(long j) {
        return this.a.S(j);
    }

    public long X(float f) {
        return this.a.X(f);
    }

    public float a1(float f) {
        return this.a.a1(f);
    }

    public float e1() {
        return this.a.e1();
    }

    public M0.C f0(int i, int i2, Map map, Qa.l lVar) {
        return this.a.f0(i, i2, map, lVar);
    }

    public final androidx.compose.ui.layout.a g() {
        return null;
    }

    public float getDensity() {
        return this.a.getDensity();
    }

    public n1.t getLayoutDirection() {
        return this.a.getLayoutDirection();
    }

    public boolean h0() {
        return false;
    }

    public M0.C h1(int i, int i2, Map map, Qa.l lVar, Qa.l lVar2) {
        if (!((i & (-16777216)) == 0 && ((-16777216) & i2) == 0)) {
            L0.a.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new a(i, i2, map, lVar, lVar2, this);
    }

    public final F j() {
        return this.a;
    }

    public float j1(float f) {
        return this.a.j1(f);
    }

    public long p() {
        U I2 = this.a.I2();
        kotlin.jvm.internal.t.d(I2);
        M0.C M1 = I2.M1();
        return n1.r.c((M1.getWidth() << 32) | (M1.getHeight() & 4294967295L));
    }

    public final void q(androidx.compose.ui.layout.a aVar) {
    }

    public int s0(float f) {
        return this.a.s0(f);
    }

    public long w1(long j) {
        return this.a.w1(j);
    }

    public float y0(long j) {
        return this.a.y0(j);
    }
}
