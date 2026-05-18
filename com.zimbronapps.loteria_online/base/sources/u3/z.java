package U3;

import o3.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class z extends o3.e {

    public static final class b implements e.f {
        public final P2.E a;
        public final P2.z b;

        public /* synthetic */ b(P2.E e, a aVar) {
            this(e);
        }

        public static void d(P2.z zVar) {
            int j;
            int g = zVar.g();
            if (zVar.a() < 10) {
                zVar.T(g);
                return;
            }
            zVar.U(9);
            int G = zVar.G() & 7;
            if (zVar.a() < G) {
                zVar.T(g);
                return;
            }
            zVar.U(G);
            if (zVar.a() < 4) {
                zVar.T(g);
                return;
            }
            if (z.j(zVar.e(), zVar.f()) == 443) {
                zVar.U(4);
                int M = zVar.M();
                if (zVar.a() < M) {
                    zVar.T(g);
                    return;
                }
                zVar.U(M);
            }
            while (zVar.a() >= 4 && (j = z.j(zVar.e(), zVar.f())) != 442 && j != 441 && (j >>> 8) == 1) {
                zVar.U(4);
                if (zVar.a() < 2) {
                    zVar.T(g);
                    return;
                }
                zVar.T(Math.min(zVar.g(), zVar.f() + zVar.M()));
            }
        }

        public e.e a(o3.q qVar, long j) {
            long b = qVar.b();
            int min = (int) Math.min(20000L, qVar.a() - b);
            this.b.P(min);
            qVar.p(this.b.e(), 0, min);
            return c(this.b, j, b);
        }

        public void b() {
            this.b.Q(P2.K.f);
        }

        public final e.e c(P2.z zVar, long j, long j2) {
            int i = -1;
            int i2 = -1;
            long j3 = -9223372036854775807L;
            while (zVar.a() >= 4) {
                if (z.j(zVar.e(), zVar.f()) != 442) {
                    zVar.U(1);
                } else {
                    zVar.U(4);
                    long l = A.l(zVar);
                    if (l != -9223372036854775807L) {
                        long b = this.a.b(l);
                        if (b > j) {
                            return j3 == -9223372036854775807L ? e.e.d(b, j2) : e.e.e(j2 + i2);
                        }
                        if (100000 + b > j) {
                            return e.e.e(j2 + zVar.f());
                        }
                        i2 = zVar.f();
                        j3 = b;
                    }
                    d(zVar);
                    i = zVar.f();
                }
            }
            return j3 != -9223372036854775807L ? e.e.f(j3, j2 + i) : e.e.d;
        }

        public b(P2.E e) {
            this.a = e;
            this.b = new P2.z();
        }
    }

    public z(P2.E e, long j, long j2) {
        super(new e.b(), new b(e, null), j, 0L, j + 1, 0L, j2, 188L, 1000);
    }

    public static /* synthetic */ int j(byte[] bArr, int i) {
        return k(bArr, i);
    }

    public static int k(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
