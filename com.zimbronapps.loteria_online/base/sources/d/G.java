package D;

import Ca.x;
import D.d;
import J.A;
import J.C;
import J.o;
import Qa.q;
import Wa.n;
import java.util.List;
import n1.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class g {

    public static final class a implements j {
        public final /* synthetic */ C a;
        public final /* synthetic */ q b;
        public final /* synthetic */ A c;

        public a(C c, q qVar, A a) {
            this.a = c;
            this.b = qVar;
            this.c = a;
        }

        public float a(float f) {
            Ca.q e = e(this.a.C().k());
            float floatValue = ((Number) e.a()).floatValue();
            float floatValue2 = ((Number) e.b()).floatValue();
            float floatValue3 = ((Number) this.b.invoke(Float.valueOf(f), Float.valueOf(floatValue), Float.valueOf(floatValue2))).floatValue();
            if (floatValue3 == floatValue || floatValue3 == floatValue2 || floatValue3 == 0.0f) {
                if (d(floatValue3)) {
                    return floatValue3;
                }
                return 0.0f;
            }
            throw new IllegalStateException(("Final Snapping Offset Should Be one of " + floatValue + ", " + floatValue2 + " or 0.0").toString());
        }

        public float b(float f, float f2) {
            int G = this.a.G() + this.a.I();
            if (G == 0) {
                return 0.0f;
            }
            int y = f < 0.0f ? this.a.y() + 1 : this.a.y();
            int e = n.e(Math.abs((n.m(this.c.a(y, n.m(((int) (f2 / G)) + y, 0, this.a.F()), f, this.a.G(), this.a.I()), 0, this.a.F()) - y) * G) - G, 0);
            if (e == 0) {
                return e;
            }
            return Math.signum(f) * e;
        }

        public final J.n c() {
            return this.a.C();
        }

        public final boolean d(float f) {
            return (f == Float.POSITIVE_INFINITY || f == Float.NEGATIVE_INFINITY) ? false : true;
        }

        public final Ca.q e(k kVar) {
            float f;
            List h = c().h();
            C c = this.a;
            int size = h.size();
            float f2 = Float.NEGATIVE_INFINITY;
            float f3 = Float.POSITIVE_INFINITY;
            int i = 0;
            while (true) {
                f = 0.0f;
                if (i >= size) {
                    break;
                }
                J.f fVar = (J.f) h.get(i);
                float a = l.a(o.a(c()), c().d(), c().b(), c().g(), fVar.a(), fVar.getIndex(), kVar, c.F());
                if (a <= 0.0f && a > f2) {
                    f2 = a;
                }
                if (a >= 0.0f && a < f3) {
                    f3 = a;
                }
                i++;
            }
            if (f2 == Float.NEGATIVE_INFINITY) {
                f2 = f3;
            }
            if (f3 == Float.POSITIVE_INFINITY) {
                f3 = f2;
            }
            boolean z = g.b(this.a) == 0.0f;
            if (!this.a.d()) {
                if (z || !g.c(this.a)) {
                    f3 = 0.0f;
                } else {
                    f2 = 0.0f;
                    f3 = 0.0f;
                }
            }
            if (this.a.b()) {
                f = f2;
            } else if (!z && !g.c(this.a)) {
                f3 = 0.0f;
            }
            return x.a(Float.valueOf(f), Float.valueOf(f3));
        }
    }

    public static final j a(C c, A a2, q qVar) {
        return new a(c, qVar, a2);
    }

    public static final /* synthetic */ float b(C c) {
        return e(c);
    }

    public static final /* synthetic */ boolean c(C c) {
        return g(c);
    }

    public static final float d(C c, t tVar, float f, float f2, float f3, float f4) {
        boolean g = c.C().getOrientation() == C.q.Vertical ? g(c) : tVar == t.a ? g(c) : !g(c);
        int g2 = c.C().g();
        float e = g2 == 0 ? 0.0f : e(c) / g2;
        float f5 = e - ((int) e);
        int a2 = f.a(c.x(), f2);
        d.a aVar = d.a;
        if (d.e(a2, aVar.a())) {
            if (Math.abs(f5) > f) {
                if (!g) {
                    return f3;
                }
            } else if (Math.abs(e) >= Math.abs(c.L())) {
                if (g) {
                    return f3;
                }
            } else if (Math.abs(f3) < Math.abs(f4)) {
                return f3;
            }
        } else if (!d.e(a2, aVar.b())) {
            if (d.e(a2, aVar.c())) {
                return f3;
            }
            return 0.0f;
        }
        return f4;
    }

    public static final float e(C c) {
        return c.C().getOrientation() == C.q.Horizontal ? u0.f.m(c.R()) : u0.f.n(c.R());
    }

    public static final boolean f(C c) {
        return e(c) > 0.0f;
    }

    public static final boolean g(C c) {
        boolean f = c.C().f();
        return (f(c) && f) || !(f(c) || f);
    }
}
