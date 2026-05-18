package G3;

import M2.z;
import java.util.ArrayDeque;
import o3.q;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a implements c {
    public final byte[] a = new byte[8];
    public final ArrayDeque b = new ArrayDeque();
    public final g c = new g();
    public G3.b d;
    public int e;
    public int f;
    public long g;

    public static final class b {
        public final int a;
        public final long b;

        public /* synthetic */ b(int i, long j, a aVar) {
            this(i, j);
        }

        public static /* synthetic */ long a(b bVar) {
            return bVar.b;
        }

        public static /* synthetic */ int b(b bVar) {
            return bVar.a;
        }

        public b(int i, long j) {
            this.a = i;
            this.b = j;
        }
    }

    public static String f(q qVar, int i) {
        if (i == 0) {
            return "";
        }
        byte[] bArr = new byte[i];
        qVar.readFully(bArr, 0, i);
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        return new String(bArr, 0, i);
    }

    public boolean a(q qVar) {
        P2.a.h(this.d);
        while (true) {
            b bVar = (b) this.b.peek();
            if (bVar != null && qVar.b() >= b.a(bVar)) {
                this.d.a(b.b((b) this.b.pop()));
                return true;
            }
            if (this.e == 0) {
                long d = this.c.d(qVar, true, false, 4);
                if (d == -2) {
                    d = c(qVar);
                }
                if (d == -1) {
                    return false;
                }
                this.f = (int) d;
                this.e = 1;
            }
            if (this.e == 1) {
                this.g = this.c.d(qVar, false, true, 8);
                this.e = 2;
            }
            int e = this.d.e(this.f);
            if (e != 0) {
                if (e == 1) {
                    long b2 = qVar.b();
                    this.b.push(new b(this.f, this.g + b2, null));
                    this.d.h(this.f, b2, this.g);
                    this.e = 0;
                    return true;
                }
                if (e == 2) {
                    long j = this.g;
                    if (j <= 8) {
                        this.d.d(this.f, e(qVar, (int) j));
                        this.e = 0;
                        return true;
                    }
                    throw z.a("Invalid integer size: " + this.g, null);
                }
                if (e == 3) {
                    long j2 = this.g;
                    if (j2 <= 2147483647L) {
                        this.d.g(this.f, f(qVar, (int) j2));
                        this.e = 0;
                        return true;
                    }
                    throw z.a("String element size: " + this.g, null);
                }
                if (e == 4) {
                    this.d.c(this.f, (int) this.g, qVar);
                    this.e = 0;
                    return true;
                }
                if (e != 5) {
                    throw z.a("Invalid element type " + e, null);
                }
                long j3 = this.g;
                if (j3 == 4 || j3 == 8) {
                    this.d.b(this.f, d(qVar, (int) j3));
                    this.e = 0;
                    return true;
                }
                throw z.a("Invalid float size: " + this.g, null);
            }
            qVar.m((int) this.g);
            this.e = 0;
        }
    }

    public void b(G3.b bVar) {
        this.d = bVar;
    }

    public final long c(q qVar) {
        qVar.f();
        while (true) {
            qVar.p(this.a, 0, 4);
            int c = g.c(this.a[0]);
            if (c != -1 && c <= 4) {
                int a2 = (int) g.a(this.a, c, false);
                if (this.d.f(a2)) {
                    qVar.m(c);
                    return a2;
                }
            }
            qVar.m(1);
        }
    }

    public final double d(q qVar, int i) {
        return i == 4 ? Float.intBitsToFloat((int) r0) : Double.longBitsToDouble(e(qVar, i));
    }

    public final long e(q qVar, int i) {
        qVar.readFully(this.a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (this.a[i2] & 255);
        }
        return j;
    }

    public void reset() {
        this.e = 0;
        this.b.clear();
        this.c.e();
    }
}
