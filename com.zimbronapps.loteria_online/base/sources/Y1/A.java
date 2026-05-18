package y1;

import B1.d;
import java.util.HashMap;
import y1.g;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class a implements f {
    public Object a;
    public final g b;
    public float c0;
    public float d0;
    public d f0;
    public d g0;
    public Object h0;
    public B1.e i0;
    public HashMap j0;
    public HashMap k0;
    public w1.b l0;
    public String c = null;
    public z1.e d = null;
    public int e = 0;
    public int f = 0;
    public float g = -1.0f;
    public float h = -1.0f;
    public float i = 0.5f;
    public float j = 0.5f;
    public int k = 0;
    public int l = 0;
    public int m = 0;
    public int n = 0;
    public int o = 0;
    public int p = 0;
    public int q = 0;
    public int r = 0;
    public int s = 0;
    public int t = 0;
    public int u = 0;
    public int v = 0;
    public int w = 0;
    public int x = 0;
    public float y = Float.NaN;
    public float z = Float.NaN;
    public float A = Float.NaN;
    public float B = Float.NaN;
    public float C = Float.NaN;
    public float D = Float.NaN;
    public float E = Float.NaN;
    public float F = Float.NaN;
    public float G = Float.NaN;
    public float H = Float.NaN;
    public float I = Float.NaN;
    public int J = 0;
    public Object K = null;
    public Object L = null;
    public Object M = null;
    public Object N = null;
    public Object O = null;
    public Object P = null;
    public Object Q = null;
    public Object R = null;
    public Object S = null;
    public Object T = null;
    public Object U = null;
    public Object V = null;
    public Object W = null;
    public Object X = null;
    public Object Y = null;
    public Object Z = null;
    public Object a0 = null;
    public Object b0 = null;
    public g.b e0 = null;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[g.b.values().length];
            a = iArr;
            try {
                iArr[g.b.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[g.b.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[g.b.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[g.b.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[g.b.e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[g.b.f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[g.b.g.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[g.b.h.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[g.b.i.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[g.b.j.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[g.b.k.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[g.b.l.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[g.b.m.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[g.b.n.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[g.b.q.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[g.b.p.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[g.b.o.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[g.b.t.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                a[g.b.r.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[g.b.s.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
        }
    }

    public a(g gVar) {
        Object obj = d.j;
        this.f0 = d.c(obj);
        this.g0 = d.c(obj);
        this.j0 = new HashMap();
        this.k0 = new HashMap();
        this.l0 = null;
        this.b = gVar;
    }

    public a A(Object obj) {
        this.e0 = g.b.g;
        this.Q = obj;
        return this;
    }

    public final Object B(Object obj) {
        if (obj == null) {
            return null;
        }
        return !(obj instanceof a) ? this.b.t(obj) : obj;
    }

    public d C() {
        return this.g0;
    }

    public final B1.e D(Object obj) {
        if (obj instanceof f) {
            return ((f) obj).a();
        }
        return null;
    }

    public d E() {
        return this.f0;
    }

    public a F(float f) {
        this.i = f;
        return this;
    }

    public a G() {
        if (this.K != null) {
            this.e0 = g.b.a;
        } else {
            this.e0 = g.b.b;
        }
        return this;
    }

    public a H(Object obj) {
        this.e0 = g.b.a;
        this.K = obj;
        return this;
    }

    public a I(Object obj) {
        this.e0 = g.b.b;
        this.L = obj;
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public a J(int i) {
        g.b bVar = this.e0;
        if (bVar != null) {
            switch (a.a[bVar.ordinal()]) {
                case 1:
                case 2:
                    this.k = i;
                    break;
                case 3:
                case 4:
                    this.l = i;
                    break;
                case 5:
                case 6:
                    this.m = i;
                    break;
                case 7:
                case 8:
                    this.n = i;
                    break;
                case 9:
                case 10:
                case 11:
                    this.o = i;
                    break;
                case 12:
                case 13:
                case 14:
                    this.p = i;
                    break;
                case 15:
                case 16:
                case 17:
                    this.w = i;
                    break;
                case 18:
                    this.d0 = i;
                    break;
            }
        } else {
            this.k = i;
            this.l = i;
            this.m = i;
            this.n = i;
            this.o = i;
            this.p = i;
        }
        return this;
    }

    public a K(Object obj) {
        return J(this.b.e(obj));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public a L(int i) {
        g.b bVar = this.e0;
        if (bVar != null) {
            switch (a.a[bVar.ordinal()]) {
                case 1:
                case 2:
                    this.q = i;
                    break;
                case 3:
                case 4:
                    this.r = i;
                    break;
                case 5:
                case 6:
                    this.s = i;
                    break;
                case 7:
                case 8:
                    this.t = i;
                    break;
                case 9:
                case 10:
                case 11:
                    this.u = i;
                    break;
                case 12:
                case 13:
                case 14:
                    this.v = i;
                    break;
                case 15:
                case 16:
                case 17:
                    this.x = i;
                    break;
            }
        } else {
            this.q = i;
            this.r = i;
            this.s = i;
            this.t = i;
            this.u = i;
            this.v = i;
        }
        return this;
    }

    public a M(Object obj) {
        return L(this.b.e(obj));
    }

    public a N(float f) {
        this.y = f;
        return this;
    }

    public a O(float f) {
        this.z = f;
        return this;
    }

    public a P() {
        if (this.M != null) {
            this.e0 = g.b.c;
        } else {
            this.e0 = g.b.d;
        }
        return this;
    }

    public a Q(Object obj) {
        this.e0 = g.b.c;
        this.M = obj;
        return this;
    }

    public a R(Object obj) {
        this.e0 = g.b.d;
        this.N = obj;
        return this;
    }

    public a S(float f) {
        this.A = f;
        return this;
    }

    public a T(float f) {
        this.B = f;
        return this;
    }

    public a U(float f) {
        this.C = f;
        return this;
    }

    public a V(float f) {
        this.H = f;
        return this;
    }

    public a W(float f) {
        this.I = f;
        return this;
    }

    public void X(z1.e eVar) {
        this.d = eVar;
        if (eVar != null) {
            b(eVar.a());
        }
    }

    public a Y(d dVar) {
        this.g0 = dVar;
        return this;
    }

    public void Z(int i) {
        this.e = i;
    }

    public B1.e a() {
        if (this.i0 == null) {
            B1.e w = w();
            this.i0 = w;
            w.E0(this.h0);
        }
        return this.i0;
    }

    public void a0(float f) {
        this.g = f;
    }

    public void apply() {
        if (this.i0 == null) {
            return;
        }
        z1.e eVar = this.d;
        if (eVar != null) {
            eVar.apply();
        }
        this.f0.a(this.b, this.i0, 0);
        this.g0.a(this.b, this.i0, 1);
        x();
        i();
        int i = this.e;
        if (i != 0) {
            this.i0.Q0(i);
        }
        int i2 = this.f;
        if (i2 != 0) {
            this.i0.h1(i2);
        }
        float f = this.g;
        if (f != -1.0f) {
            this.i0.U0(f);
        }
        float f2 = this.h;
        if (f2 != -1.0f) {
            this.i0.l1(f2);
        }
        this.i0.P0(this.i);
        this.i0.g1(this.j);
        B1.e eVar2 = this.i0;
        h hVar = eVar2.n;
        hVar.f = this.y;
        hVar.g = this.z;
        hVar.h = this.A;
        hVar.i = this.B;
        hVar.j = this.C;
        hVar.k = this.D;
        hVar.l = this.E;
        hVar.m = this.F;
        hVar.n = this.H;
        hVar.o = this.I;
        hVar.p = this.G;
        int i3 = this.J;
        hVar.r = i3;
        eVar2.m1(i3);
        this.i0.n.i(this.l0);
        HashMap hashMap = this.j0;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                this.i0.n.h(str, 902, ((Integer) this.j0.get(str)).intValue());
            }
        }
        HashMap hashMap2 = this.k0;
        if (hashMap2 != null) {
            for (String str2 : hashMap2.keySet()) {
                this.i0.n.g(str2, 901, ((Float) this.k0.get(str2)).floatValue());
            }
        }
    }

    public void b(B1.e eVar) {
        if (eVar == null) {
            return;
        }
        this.i0 = eVar;
        eVar.E0(this.h0);
    }

    public void b0(String str) {
        this.c = str;
    }

    public void c(Object obj) {
        this.a = obj;
    }

    public void c0(int i) {
        this.f = i;
    }

    public z1.e d() {
        return this.d;
    }

    public void d0(float f) {
        this.h = f;
    }

    public void e(String str, int i) {
        this.j0.put(str, Integer.valueOf(i));
    }

    public void e0(Object obj) {
        this.h0 = obj;
        B1.e eVar = this.i0;
        if (eVar != null) {
            eVar.E0(obj);
        }
    }

    public void f(String str, float f) {
        if (this.k0 == null) {
            this.k0 = new HashMap();
        }
        this.k0.put(str, Float.valueOf(f));
    }

    public a f0(d dVar) {
        this.f0 = dVar;
        return this;
    }

    public a g(float f) {
        this.G = f;
        return this;
    }

    public a g0() {
        if (this.O != null) {
            this.e0 = g.b.e;
        } else {
            this.e0 = g.b.f;
        }
        return this;
    }

    public Object getKey() {
        return this.a;
    }

    public final void h(B1.e eVar, Object obj, g.b bVar) {
        B1.e D = D(obj);
        if (D == null) {
        }
        int[] iArr = a.a;
        int i = iArr[bVar.ordinal()];
        switch (iArr[bVar.ordinal()]) {
            case 1:
                d.a aVar = d.a.LEFT;
                eVar.o(aVar).b(D.o(aVar), this.k, this.q, false);
                break;
            case 2:
                eVar.o(d.a.LEFT).b(D.o(d.a.RIGHT), this.k, this.q, false);
                break;
            case 3:
                eVar.o(d.a.RIGHT).b(D.o(d.a.LEFT), this.l, this.r, false);
                break;
            case 4:
                d.a aVar2 = d.a.RIGHT;
                eVar.o(aVar2).b(D.o(aVar2), this.l, this.r, false);
                break;
            case 5:
                d.a aVar3 = d.a.LEFT;
                eVar.o(aVar3).b(D.o(aVar3), this.m, this.s, false);
                break;
            case 6:
                eVar.o(d.a.LEFT).b(D.o(d.a.RIGHT), this.m, this.s, false);
                break;
            case 7:
                eVar.o(d.a.RIGHT).b(D.o(d.a.LEFT), this.n, this.t, false);
                break;
            case 8:
                d.a aVar4 = d.a.RIGHT;
                eVar.o(aVar4).b(D.o(aVar4), this.n, this.t, false);
                break;
            case 9:
                d.a aVar5 = d.a.TOP;
                eVar.o(aVar5).b(D.o(aVar5), this.o, this.u, false);
                break;
            case 10:
                eVar.o(d.a.TOP).b(D.o(d.a.BOTTOM), this.o, this.u, false);
                break;
            case 11:
                eVar.g0(d.a.TOP, D, d.a.BASELINE, this.o, this.u);
                break;
            case 12:
                eVar.o(d.a.BOTTOM).b(D.o(d.a.TOP), this.p, this.v, false);
                break;
            case 13:
                d.a aVar6 = d.a.BOTTOM;
                eVar.o(aVar6).b(D.o(aVar6), this.p, this.v, false);
                break;
            case 14:
                eVar.g0(d.a.BOTTOM, D, d.a.BASELINE, this.p, this.v);
                break;
            case 15:
                eVar.g0(d.a.BASELINE, D, d.a.BOTTOM, this.w, this.x);
                break;
            case 16:
                eVar.g0(d.a.BASELINE, D, d.a.TOP, this.w, this.x);
                break;
            case 17:
                d.a aVar7 = d.a.BASELINE;
                eVar.g0(aVar7, D, aVar7, this.w, this.x);
                break;
            case 18:
                eVar.l(D, this.c0, (int) this.d0);
                break;
        }
    }

    public a h0(Object obj) {
        this.e0 = g.b.f;
        this.P = obj;
        return this;
    }

    public void i() {
        h(this.i0, this.K, g.b.a);
        h(this.i0, this.L, g.b.b);
        h(this.i0, this.M, g.b.c);
        h(this.i0, this.N, g.b.d);
        h(this.i0, this.O, g.b.e);
        h(this.i0, this.P, g.b.f);
        h(this.i0, this.Q, g.b.g);
        h(this.i0, this.R, g.b.h);
        h(this.i0, this.S, g.b.i);
        h(this.i0, this.T, g.b.j);
        h(this.i0, this.U, g.b.k);
        h(this.i0, this.V, g.b.l);
        h(this.i0, this.W, g.b.m);
        h(this.i0, this.X, g.b.n);
        h(this.i0, this.Y, g.b.o);
        h(this.i0, this.Z, g.b.p);
        h(this.i0, this.a0, g.b.q);
        h(this.i0, this.b0, g.b.t);
    }

    public a i0(Object obj) {
        this.e0 = g.b.e;
        this.O = obj;
        return this;
    }

    public a j() {
        this.e0 = g.b.o;
        return this;
    }

    public a j0() {
        if (this.S != null) {
            this.e0 = g.b.i;
        } else {
            this.e0 = g.b.j;
        }
        return this;
    }

    public a k(Object obj) {
        this.e0 = g.b.o;
        this.Y = obj;
        return this;
    }

    public a k0(Object obj) {
        this.e0 = g.b.k;
        this.U = obj;
        return this;
    }

    public a l(Object obj) {
        this.e0 = g.b.q;
        this.a0 = obj;
        return this;
    }

    public a l0(Object obj) {
        this.e0 = g.b.j;
        this.T = obj;
        return this;
    }

    public a m(Object obj) {
        this.e0 = g.b.p;
        this.Z = obj;
        return this;
    }

    public a m0(Object obj) {
        this.e0 = g.b.i;
        this.S = obj;
        return this;
    }

    public a n() {
        if (this.V != null) {
            this.e0 = g.b.l;
        } else {
            this.e0 = g.b.m;
        }
        return this;
    }

    public a n0(float f) {
        this.D = f;
        return this;
    }

    public a o(Object obj) {
        this.e0 = g.b.n;
        this.X = obj;
        return this;
    }

    public a o0(float f) {
        this.E = f;
        return this;
    }

    public a p(Object obj) {
        this.e0 = g.b.m;
        this.W = obj;
        return this;
    }

    public a p0(float f) {
        this.F = f;
        return this;
    }

    public a q(Object obj) {
        this.e0 = g.b.l;
        this.V = obj;
        return this;
    }

    public a q0(float f) {
        this.j = f;
        return this;
    }

    public a r(Object obj, float f, float f2) {
        this.b0 = B(obj);
        this.c0 = f;
        this.d0 = f2;
        this.e0 = g.b.t;
        return this;
    }

    public a r0(int i) {
        this.J = i;
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public a s() {
        g.b bVar = this.e0;
        if (bVar != null) {
            switch (a.a[bVar.ordinal()]) {
                case 1:
                case 2:
                    this.K = null;
                    this.L = null;
                    this.k = 0;
                    this.q = 0;
                    break;
                case 3:
                case 4:
                    this.M = null;
                    this.N = null;
                    this.l = 0;
                    this.r = 0;
                    break;
                case 5:
                case 6:
                    this.O = null;
                    this.P = null;
                    this.m = 0;
                    this.s = 0;
                    break;
                case 7:
                case 8:
                    this.Q = null;
                    this.R = null;
                    this.n = 0;
                    this.t = 0;
                    break;
                case 9:
                case 10:
                case 11:
                    this.S = null;
                    this.T = null;
                    this.U = null;
                    this.o = 0;
                    this.u = 0;
                    break;
                case 12:
                case 13:
                case 14:
                    this.V = null;
                    this.W = null;
                    this.X = null;
                    this.p = 0;
                    this.v = 0;
                    break;
                case 17:
                    this.Y = null;
                    break;
                case 18:
                    this.b0 = null;
                    break;
            }
        } else {
            t();
        }
        return this;
    }

    public a t() {
        this.K = null;
        this.L = null;
        this.k = 0;
        this.M = null;
        this.N = null;
        this.l = 0;
        this.O = null;
        this.P = null;
        this.m = 0;
        this.Q = null;
        this.R = null;
        this.n = 0;
        this.S = null;
        this.T = null;
        this.o = 0;
        this.V = null;
        this.W = null;
        this.p = 0;
        this.Y = null;
        this.b0 = null;
        this.i = 0.5f;
        this.j = 0.5f;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = 0;
        return this;
    }

    public a u() {
        g0().s();
        y().s();
        G().s();
        P().s();
        return this;
    }

    public a v() {
        j0().s();
        j().s();
        n().s();
        return this;
    }

    public B1.e w() {
        return new B1.e(E().k(), C().k());
    }

    public final void x() {
        this.K = B(this.K);
        this.L = B(this.L);
        this.M = B(this.M);
        this.N = B(this.N);
        this.O = B(this.O);
        this.P = B(this.P);
        this.Q = B(this.Q);
        this.R = B(this.R);
        this.S = B(this.S);
        this.T = B(this.T);
        this.V = B(this.V);
        this.W = B(this.W);
        this.Y = B(this.Y);
        this.Z = B(this.Z);
        this.a0 = B(this.a0);
    }

    public a y() {
        if (this.Q != null) {
            this.e0 = g.b.g;
        } else {
            this.e0 = g.b.h;
        }
        return this;
    }

    public a z(Object obj) {
        this.e0 = g.b.h;
        this.R = obj;
        return this;
    }
}
