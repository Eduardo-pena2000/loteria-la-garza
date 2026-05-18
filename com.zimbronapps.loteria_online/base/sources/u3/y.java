package U3;

import U3.K;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class y implements K {
    public final m a;
    public final P2.y b = new P2.y(new byte[10]);
    public int c = 0;
    public int d;
    public P2.E e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public long l;

    public y(m mVar) {
        this.a = mVar;
    }

    public void a() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.a();
    }

    public void b(P2.E e, o3.r rVar, K.d dVar) {
        this.e = e;
        this.a.d(rVar, dVar);
    }

    public void c(P2.z zVar, int i) {
        P2.a.h(this.e);
        if ((i & 1) != 0) {
            int i2 = this.c;
            if (i2 != 0 && i2 != 1) {
                if (i2 == 2) {
                    P2.o.h("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.j != -1) {
                        P2.o.h("PesReader", "Unexpected start indicator: expected " + this.j + " more bytes");
                    }
                    this.a.e(zVar.g() == 0);
                }
            }
            h(1);
        }
        while (zVar.a() > 0) {
            int i3 = this.c;
            if (i3 == 0) {
                zVar.U(zVar.a());
            } else if (i3 != 1) {
                if (i3 == 2) {
                    if (e(zVar, this.b.a, Math.min(10, this.i)) && e(zVar, null, this.i)) {
                        g();
                        i |= this.k ? 4 : 0;
                        this.a.f(this.l, i);
                        h(3);
                    }
                } else {
                    if (i3 != 3) {
                        throw new IllegalStateException();
                    }
                    int a = zVar.a();
                    int i4 = this.j;
                    int i5 = i4 == -1 ? 0 : a - i4;
                    if (i5 > 0) {
                        a -= i5;
                        zVar.S(zVar.f() + a);
                    }
                    this.a.c(zVar);
                    int i6 = this.j;
                    if (i6 != -1) {
                        int i7 = i6 - a;
                        this.j = i7;
                        if (i7 == 0) {
                            this.a.e(false);
                            h(1);
                        }
                    }
                }
            } else if (e(zVar, this.b.a, 9)) {
                h(f() ? 2 : 0);
            }
        }
    }

    public boolean d(boolean z) {
        return this.c == 3 && this.j == -1 && !(z && (this.a instanceof n));
    }

    public final boolean e(P2.z zVar, byte[] bArr, int i) {
        int min = Math.min(zVar.a(), i - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            zVar.U(min);
        } else {
            zVar.l(bArr, this.d, min);
        }
        int i2 = this.d + min;
        this.d = i2;
        return i2 == i;
    }

    public final boolean f() {
        this.b.p(0);
        int h = this.b.h(24);
        if (h != 1) {
            P2.o.h("PesReader", "Unexpected start code prefix: " + h);
            this.j = -1;
            return false;
        }
        this.b.r(8);
        int h2 = this.b.h(16);
        this.b.r(5);
        this.k = this.b.g();
        this.b.r(2);
        this.f = this.b.g();
        this.g = this.b.g();
        this.b.r(6);
        int h3 = this.b.h(8);
        this.i = h3;
        if (h2 == 0) {
            this.j = -1;
        } else {
            int i = (h2 - 3) - h3;
            this.j = i;
            if (i < 0) {
                P2.o.h("PesReader", "Found negative packet payload size: " + this.j);
                this.j = -1;
            }
        }
        return true;
    }

    public final void g() {
        this.b.p(0);
        this.l = -9223372036854775807L;
        if (this.f) {
            this.b.r(4);
            this.b.r(1);
            this.b.r(1);
            long h = (this.b.h(3) << 30) | (this.b.h(15) << 15) | this.b.h(15);
            this.b.r(1);
            if (!this.h && this.g) {
                this.b.r(4);
                this.b.r(1);
                this.b.r(1);
                this.b.r(1);
                this.e.b((this.b.h(3) << 30) | (this.b.h(15) << 15) | this.b.h(15));
                this.h = true;
            }
            this.l = this.e.b(h);
        }
    }

    public final void h(int i) {
        this.c = i;
        this.d = 0;
    }
}
