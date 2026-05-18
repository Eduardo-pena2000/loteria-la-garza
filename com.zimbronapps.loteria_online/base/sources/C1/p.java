package C1;

import B1.d;
import B1.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class p implements d {
    public int a;
    public B1.e b;
    public m c;
    public e.b d;
    public g e = new g(this);
    public int f = 0;
    public boolean g = false;
    public f h = new f(this);
    public f i = new f(this);
    public b j = b.NONE;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.a.values().length];
            a = iArr;
            try {
                iArr[d.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[d.a.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[d.a.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[d.a.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[d.a.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public p(B1.e eVar) {
        this.b = eVar;
    }

    public abstract void a(d dVar);

    public final void b(f fVar, f fVar2, int i) {
        fVar.l.add(fVar2);
        fVar.f = i;
        fVar2.k.add(fVar);
    }

    public final void c(f fVar, f fVar2, int i, g gVar) {
        fVar.l.add(fVar2);
        fVar.l.add(this.e);
        fVar.h = i;
        fVar.i = gVar;
        fVar2.k.add(fVar);
        gVar.k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        int max;
        if (i2 == 0) {
            B1.e eVar = this.b;
            int i3 = eVar.A;
            max = Math.max(eVar.z, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max == i) {
                return i;
            }
        } else {
            B1.e eVar2 = this.b;
            int i4 = eVar2.D;
            max = Math.max(eVar2.C, i);
            if (i4 > 0) {
                max = Math.min(i4, i);
            }
            if (max == i) {
                return i;
            }
        }
        return max;
    }

    public final f h(B1.d dVar) {
        B1.d dVar2 = dVar.f;
        if (dVar2 == null) {
            return null;
        }
        B1.e eVar = dVar2.d;
        int i = a.a[dVar2.e.ordinal()];
        if (i == 1) {
            return eVar.e.h;
        }
        if (i == 2) {
            return eVar.e.i;
        }
        if (i == 3) {
            return eVar.f.h;
        }
        if (i == 4) {
            return eVar.f.k;
        }
        if (i != 5) {
            return null;
        }
        return eVar.f.i;
    }

    public final f i(B1.d dVar, int i) {
        B1.d dVar2 = dVar.f;
        if (dVar2 == null) {
            return null;
        }
        B1.e eVar = dVar2.d;
        p pVar = i == 0 ? eVar.e : eVar.f;
        int i2 = a.a[dVar2.e.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return pVar.i;
        }
        return pVar.h;
    }

    public long j() {
        if (this.e.j) {
            return r0.g;
        }
        return 0L;
    }

    public boolean k() {
        return this.g;
    }

    public final void l(int i, int i2) {
        int i3 = this.a;
        if (i3 == 0) {
            this.e.d(g(i2, i));
            return;
        }
        if (i3 == 1) {
            this.e.d(Math.min(g(this.e.m, i), i2));
            return;
        }
        if (i3 == 2) {
            B1.e L = this.b.L();
            if (L != null) {
                if ((i == 0 ? L.e : L.f).e.j) {
                    this.e.d(g((int) ((r9.g * (i == 0 ? this.b.B : this.b.E)) + 0.5f), i));
                    return;
                }
                return;
            }
            return;
        }
        if (i3 != 3) {
            return;
        }
        B1.e eVar = this.b;
        p pVar = eVar.e;
        e.b bVar = pVar.d;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        if (bVar == bVar2 && pVar.a == 3) {
            n nVar = eVar.f;
            if (nVar.d == bVar2 && nVar.a == 3) {
                return;
            }
        }
        if (i == 0) {
            pVar = eVar.f;
        }
        if (pVar.e.j) {
            float v = eVar.v();
            this.e.d(i == 1 ? (int) ((pVar.e.g / v) + 0.5f) : (int) ((v * pVar.e.g) + 0.5f));
        }
    }

    public abstract boolean m();

    public void n(d dVar, B1.d dVar2, B1.d dVar3, int i) {
        f h = h(dVar2);
        f h2 = h(dVar3);
        if (h.j && h2.j) {
            int f = h.g + dVar2.f();
            int f2 = h2.g - dVar3.f();
            int i2 = f2 - f;
            if (!this.e.j && this.d == e.b.MATCH_CONSTRAINT) {
                l(i, i2);
            }
            g gVar = this.e;
            if (gVar.j) {
                if (gVar.g == i2) {
                    this.h.d(f);
                    this.i.d(f2);
                    return;
                }
                float y = i == 0 ? this.b.y() : this.b.T();
                if (h == h2) {
                    f = h.g;
                    f2 = h2.g;
                    y = 0.5f;
                }
                this.h.d((int) (f + 0.5f + (((f2 - f) - this.e.g) * y)));
                this.i.d(this.h.g + this.e.g);
            }
        }
    }

    public void o(d dVar) {
    }

    public void p(d dVar) {
    }
}
