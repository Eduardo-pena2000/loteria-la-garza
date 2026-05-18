package U3;

import M2.q;
import U3.K;
import java.util.Arrays;
import java.util.Collections;
import o3.O;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class o implements m {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final M a;
    public final P2.z b;
    public final w e;
    public b f;
    public long g;
    public String h;
    public O i;
    public boolean j;
    public final boolean[] c = new boolean[4];
    public final a d = new a(128);
    public long k = -9223372036854775807L;

    public static final class a {
        public static final byte[] f = {0, 0, 1};
        public boolean a;
        public int b;
        public int c;
        public int d;
        public byte[] e;

        public a(int i) {
            this.e = new byte[i];
        }

        public void a(byte[] bArr, int i, int i2) {
            if (this.a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.e;
                int length = bArr2.length;
                int i4 = this.c;
                if (length < i4 + i3) {
                    this.e = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.e, this.c, i3);
                this.c += i3;
            }
        }

        public boolean b(int i, int i2) {
            int i3 = this.b;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i == 179 || i == 181) {
                                this.c -= i2;
                                this.a = false;
                                return true;
                            }
                        } else if ((i & 240) != 32) {
                            P2.o.h("H263Reader", "Unexpected start code value");
                            c();
                        } else {
                            this.d = this.c;
                            this.b = 4;
                        }
                    } else if (i > 31) {
                        P2.o.h("H263Reader", "Unexpected start code value");
                        c();
                    } else {
                        this.b = 3;
                    }
                } else if (i != 181) {
                    P2.o.h("H263Reader", "Unexpected start code value");
                    c();
                } else {
                    this.b = 2;
                }
            } else if (i == 176) {
                this.b = 1;
                this.a = true;
            }
            byte[] bArr = f;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.a = false;
            this.c = 0;
            this.b = 0;
        }
    }

    public static final class b {
        public final O a;
        public boolean b;
        public boolean c;
        public boolean d;
        public int e;
        public int f;
        public long g;
        public long h;

        public b(O o) {
            this.a = o;
        }

        public void a(byte[] bArr, int i, int i2) {
            if (this.c) {
                int i3 = this.f;
                int i4 = (i + 1) - i3;
                if (i4 >= i2) {
                    this.f = i3 + (i2 - i);
                } else {
                    this.d = ((bArr[i4] & 192) >> 6) == 0;
                    this.c = false;
                }
            }
        }

        public void b(long j, int i, boolean z) {
            P2.a.f(this.h != -9223372036854775807L);
            if (this.e == 182 && z && this.b) {
                this.a.a(this.h, this.d ? 1 : 0, (int) (j - this.g), i, null);
            }
            if (this.e != 179) {
                this.g = j;
            }
        }

        public void c(int i, long j) {
            this.e = i;
            this.d = false;
            this.b = i == 182 || i == 179;
            this.c = i == 182;
            this.f = 0;
            this.h = j;
        }

        public void d() {
            this.b = false;
            this.c = false;
            this.d = false;
            this.e = -1;
        }
    }

    public o(M m) {
        this.a = m;
        if (m != null) {
            this.e = new w(178, 128);
            this.b = new P2.z();
        } else {
            this.e = null;
            this.b = null;
        }
    }

    public static M2.q b(a aVar, int i, String str) {
        byte[] copyOf = Arrays.copyOf(aVar.e, aVar.c);
        P2.y yVar = new P2.y(copyOf);
        yVar.s(i);
        yVar.s(4);
        yVar.q();
        yVar.r(8);
        if (yVar.g()) {
            yVar.r(4);
            yVar.r(3);
        }
        int h = yVar.h(4);
        float f = 1.0f;
        if (h == 15) {
            int h2 = yVar.h(8);
            int h3 = yVar.h(8);
            if (h3 == 0) {
                P2.o.h("H263Reader", "Invalid aspect ratio");
            } else {
                f = h2 / h3;
            }
        } else {
            float[] fArr = l;
            if (h < fArr.length) {
                f = fArr[h];
            } else {
                P2.o.h("H263Reader", "Invalid aspect ratio");
            }
        }
        if (yVar.g()) {
            yVar.r(2);
            yVar.r(1);
            if (yVar.g()) {
                yVar.r(15);
                yVar.q();
                yVar.r(15);
                yVar.q();
                yVar.r(15);
                yVar.q();
                yVar.r(3);
                yVar.r(11);
                yVar.q();
                yVar.r(15);
                yVar.q();
            }
        }
        if (yVar.h(2) != 0) {
            P2.o.h("H263Reader", "Unhandled video object layer shape");
        }
        yVar.q();
        int h4 = yVar.h(16);
        yVar.q();
        if (yVar.g()) {
            if (h4 == 0) {
                P2.o.h("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i2 = 0;
                for (int i3 = h4 - 1; i3 > 0; i3 >>= 1) {
                    i2++;
                }
                yVar.r(i2);
            }
        }
        yVar.q();
        int h5 = yVar.h(13);
        yVar.q();
        int h6 = yVar.h(13);
        yVar.q();
        yVar.q();
        return new q.b().a0(str).o0("video/mp4v-es").v0(h5).Y(h6).k0(f).b0(Collections.singletonList(copyOf)).K();
    }

    public void a() {
        Q2.d.a(this.c);
        this.d.c();
        b bVar = this.f;
        if (bVar != null) {
            bVar.d();
        }
        w wVar = this.e;
        if (wVar != null) {
            wVar.d();
        }
        this.g = 0L;
        this.k = -9223372036854775807L;
    }

    public void c(P2.z zVar) {
        P2.a.h(this.f);
        P2.a.h(this.i);
        int f = zVar.f();
        int g = zVar.g();
        byte[] e = zVar.e();
        this.g += zVar.a();
        this.i.f(zVar, zVar.a());
        while (true) {
            int c = Q2.d.c(e, f, g, this.c);
            if (c == g) {
                break;
            }
            int i = c + 3;
            int i2 = zVar.e()[i] & 255;
            int i3 = c - f;
            int i4 = 0;
            if (!this.j) {
                if (i3 > 0) {
                    this.d.a(e, f, c);
                }
                if (this.d.b(i2, i3 < 0 ? -i3 : 0)) {
                    O o = this.i;
                    a aVar = this.d;
                    o.b(b(aVar, aVar.d, (String) P2.a.e(this.h)));
                    this.j = true;
                }
            }
            this.f.a(e, f, c);
            w wVar = this.e;
            if (wVar != null) {
                if (i3 > 0) {
                    wVar.a(e, f, c);
                } else {
                    i4 = -i3;
                }
                if (this.e.b(i4)) {
                    w wVar2 = this.e;
                    ((P2.z) P2.K.i(this.b)).R(this.e.d, Q2.d.r(wVar2.d, wVar2.e));
                    ((M) P2.K.i(this.a)).a(this.k, this.b);
                }
                if (i2 == 178 && zVar.e()[c + 2] == 1) {
                    this.e.e(i2);
                }
            }
            int i5 = g - c;
            this.f.b(this.g - i5, i5, this.j);
            this.f.c(i2, this.k);
            f = i;
        }
        if (!this.j) {
            this.d.a(e, f, g);
        }
        this.f.a(e, f, g);
        w wVar3 = this.e;
        if (wVar3 != null) {
            wVar3.a(e, f, g);
        }
    }

    public void d(o3.r rVar, K.d dVar) {
        dVar.a();
        this.h = dVar.b();
        O e = rVar.e(dVar.c(), 2);
        this.i = e;
        this.f = new b(e);
        M m = this.a;
        if (m != null) {
            m.b(rVar, dVar);
        }
    }

    public void e(boolean z) {
        P2.a.h(this.f);
        if (z) {
            this.f.b(this.g, 0, this.j);
            this.f.d();
        }
    }

    public void f(long j, int i) {
        this.k = j;
    }
}
