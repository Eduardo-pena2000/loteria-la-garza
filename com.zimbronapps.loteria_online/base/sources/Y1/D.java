package y1;

import B1.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class d {
    public static final Object i = new String("FIXED_DIMENSION");
    public static final Object j = new String("WRAP_DIMENSION");
    public static final Object k = new String("SPREAD_DIMENSION");
    public static final Object l = new String("PARENT_DIMENSION");
    public static final Object m = new String("PERCENT_DIMENSION");
    public static final Object n = new String("RATIO_DIMENSION");
    public final int a;
    public int b;
    public int c;
    public float d;
    public int e;
    public String f;
    public Object g;
    public boolean h;

    public d() {
        this.a = -2;
        this.b = 0;
        this.c = Integer.MAX_VALUE;
        this.d = 1.0f;
        this.e = 0;
        this.f = null;
        this.g = j;
        this.h = false;
    }

    public static d b(int i2) {
        d dVar = new d(i);
        dVar.i(i2);
        return dVar;
    }

    public static d c(Object obj) {
        d dVar = new d(i);
        dVar.j(obj);
        return dVar;
    }

    public static d d() {
        return new d(l);
    }

    public static d e(Object obj, float f) {
        d dVar = new d(m);
        dVar.p(obj, f);
        return dVar;
    }

    public static d f(String str) {
        d dVar = new d(n);
        dVar.q(str);
        return dVar;
    }

    public static d g(Object obj) {
        d dVar = new d();
        dVar.s(obj);
        return dVar;
    }

    public static d h() {
        return new d(j);
    }

    public void a(g gVar, B1.e eVar, int i2) {
        String str = this.f;
        if (str != null) {
            eVar.G0(str);
        }
        int i3 = 2;
        if (i2 == 0) {
            if (this.h) {
                eVar.S0(e.b.MATCH_CONSTRAINT);
                Object obj = this.g;
                if (obj == j) {
                    i3 = 1;
                } else if (obj != m) {
                    i3 = 0;
                }
                eVar.T0(i3, this.b, this.c, this.d);
                return;
            }
            int i4 = this.b;
            if (i4 > 0) {
                eVar.d1(i4);
            }
            int i5 = this.c;
            if (i5 < Integer.MAX_VALUE) {
                eVar.a1(i5);
            }
            Object obj2 = this.g;
            if (obj2 == j) {
                eVar.S0(e.b.WRAP_CONTENT);
                return;
            }
            if (obj2 == l) {
                eVar.S0(e.b.MATCH_PARENT);
                return;
            } else {
                if (obj2 == null) {
                    eVar.S0(e.b.FIXED);
                    eVar.n1(this.e);
                    return;
                }
                return;
            }
        }
        if (this.h) {
            eVar.j1(e.b.MATCH_CONSTRAINT);
            Object obj3 = this.g;
            if (obj3 == j) {
                i3 = 1;
            } else if (obj3 != m) {
                i3 = 0;
            }
            eVar.k1(i3, this.b, this.c, this.d);
            return;
        }
        int i6 = this.b;
        if (i6 > 0) {
            eVar.c1(i6);
        }
        int i7 = this.c;
        if (i7 < Integer.MAX_VALUE) {
            eVar.Z0(i7);
        }
        Object obj4 = this.g;
        if (obj4 == j) {
            eVar.j1(e.b.WRAP_CONTENT);
            return;
        }
        if (obj4 == l) {
            eVar.j1(e.b.MATCH_PARENT);
        } else if (obj4 == null) {
            eVar.j1(e.b.FIXED);
            eVar.O0(this.e);
        }
    }

    public d i(int i2) {
        this.g = null;
        this.e = i2;
        return this;
    }

    public d j(Object obj) {
        this.g = obj;
        if (obj instanceof Integer) {
            this.e = ((Integer) obj).intValue();
            this.g = null;
        }
        return this;
    }

    public int k() {
        return this.e;
    }

    public d l(int i2) {
        if (this.c >= 0) {
            this.c = i2;
        }
        return this;
    }

    public d m(Object obj) {
        Object obj2 = j;
        if (obj == obj2 && this.h) {
            this.g = obj2;
            this.c = Integer.MAX_VALUE;
        }
        return this;
    }

    public d n(int i2) {
        if (i2 >= 0) {
            this.b = i2;
        }
        return this;
    }

    public d o(Object obj) {
        if (obj == j) {
            this.b = -2;
        }
        return this;
    }

    public d p(Object obj, float f) {
        this.d = f;
        return this;
    }

    public d q(String str) {
        this.f = str;
        return this;
    }

    public d r(int i2) {
        this.h = true;
        if (i2 >= 0) {
            this.c = i2;
        }
        return this;
    }

    public d s(Object obj) {
        this.g = obj;
        this.h = true;
        return this;
    }

    public d(Object obj) {
        this.a = -2;
        this.b = 0;
        this.c = Integer.MAX_VALUE;
        this.d = 1.0f;
        this.e = 0;
        this.f = null;
        this.h = false;
        this.g = obj;
    }
}
