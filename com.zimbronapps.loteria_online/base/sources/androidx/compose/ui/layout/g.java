package androidx.compose.ui.layout;

import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class g implements l, M0.m {
    public final /* synthetic */ M0.m a;
    public final n1.t b;

    public static final class a implements M0.C {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ Map c;
        public final /* synthetic */ Qa.l d;

        public a(int i, int i2, Map map, Qa.l lVar) {
            this.a = i;
            this.b = i2;
            this.c = map;
            this.d = lVar;
        }

        public void A() {
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

    public g(M0.m mVar, n1.t tVar) {
        this.a = mVar;
        this.b = tVar;
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

    public float getDensity() {
        return this.a.getDensity();
    }

    public n1.t getLayoutDirection() {
        return this.b;
    }

    public boolean h0() {
        return this.a.h0();
    }

    public M0.C h1(int i, int i2, Map map, Qa.l lVar, Qa.l lVar2) {
        boolean z = false;
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if ((i & (-16777216)) == 0 && ((-16777216) & i2) == 0) {
            z = true;
        }
        if (!z) {
            L0.a.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new a(i, i2, map, lVar);
    }

    public float j1(float f) {
        return this.a.j1(f);
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
