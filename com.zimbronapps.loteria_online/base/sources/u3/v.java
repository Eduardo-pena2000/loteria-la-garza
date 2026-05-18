package U3;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class v {

    public static class b {
        public int a;
        public long b;
        public int c;
    }

    public static class c {
        public final int a;
        public final int b;
        public final int c;
        public final byte[] d;

        public /* synthetic */ c(int i, int i2, int i3, byte[] bArr, a aVar) {
            this(i, i2, i3, bArr);
        }

        public c(int i, int i2, int i3, byte[] bArr) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = bArr;
        }
    }

    public static int a(int i) {
        if (i == 0) {
            return 768;
        }
        if (i == 1) {
            return 1024;
        }
        if (i == 2 || i == 3) {
            return 2048;
        }
        if (i == 4) {
            return 4096;
        }
        throw M2.z.d("Unsupported coreSbrFrameLengthIndex " + i);
    }

    public static double b(int i) {
        switch (i) {
            case 14700:
            case 16000:
                return 3.0d;
            case 22050:
            case 24000:
                return 2.0d;
            case 29400:
            case 32000:
            case 58800:
            case 64000:
                return 1.5d;
            case 44100:
            case 48000:
            case 88200:
            case 96000:
                return 1.0d;
            default:
                throw M2.z.d("Unsupported sampling rate " + i);
        }
    }

    public static int c(int i) {
        switch (i) {
            case 0:
                return 96000;
            case 1:
                return 88200;
            case 2:
                return 64000;
            case 3:
                return 48000;
            case 4:
                return 44100;
            case 5:
                return 32000;
            case 6:
                return 24000;
            case 7:
                return 22050;
            case 8:
                return 16000;
            case 9:
                return 12000;
            case 10:
                return 11025;
            case 11:
                return 8000;
            case 12:
                return 7350;
            case 13:
            case 14:
            default:
                throw M2.z.d("Unsupported sampling rate index " + i);
            case 15:
                return 57600;
            case 16:
                return 51200;
            case 17:
                return 40000;
            case 18:
                return 38400;
            case 19:
                return 34150;
            case 20:
                return 28800;
            case 21:
                return 25600;
            case 22:
                return 20000;
            case 23:
                return 19200;
            case 24:
                return 17075;
            case 25:
                return 14400;
            case 26:
                return 12800;
            case 27:
                return 9600;
        }
    }

    public static int d(int i) {
        if (i == 0 || i == 1) {
            return 0;
        }
        int i2 = 2;
        if (i != 2) {
            i2 = 3;
            if (i != 3) {
                if (i == 4) {
                    return 1;
                }
                throw M2.z.d("Unsupported coreSbrFrameLengthIndex " + i);
            }
        }
        return i2;
    }

    public static boolean e(int i) {
        return (i & 16777215) == 12583333;
    }

    public static int f(P2.y yVar) {
        if (!yVar.g()) {
            return 0;
        }
        yVar.r(2);
        return yVar.h(13);
    }

    public static boolean g(P2.y yVar, b bVar) {
        yVar.d();
        int k = k(yVar, 3, 8, 8);
        bVar.a = k;
        if (k == -1) {
            return false;
        }
        long l = l(yVar, 2, 8, 32);
        bVar.b = l;
        if (l == -1) {
            return false;
        }
        if (l > 16) {
            throw M2.z.d("Contains sub-stream with an invalid packet label " + bVar.b);
        }
        if (l == 0) {
            int i = bVar.a;
            if (i == 1) {
                throw M2.z.a("Mpegh3daConfig packet with invalid packet label 0", null);
            }
            if (i == 2) {
                throw M2.z.a("Mpegh3daFrame packet with invalid packet label 0", null);
            }
            if (i == 17) {
                throw M2.z.a("AudioTruncation packet with invalid packet label 0", null);
            }
        }
        int k2 = k(yVar, 11, 24, 24);
        bVar.c = k2;
        return k2 != -1;
    }

    public static c h(P2.y yVar) {
        int h = yVar.h(8);
        int h2 = yVar.h(5);
        int h3 = h2 == 31 ? yVar.h(24) : c(h2);
        int h4 = yVar.h(3);
        int a2 = a(h4);
        int d = d(h4);
        yVar.r(2);
        p(yVar);
        m(yVar, j(yVar), d);
        byte[] bArr = null;
        if (yVar.g()) {
            int k = k(yVar, 2, 4, 8) + 1;
            for (int i = 0; i < k; i++) {
                int k2 = k(yVar, 4, 8, 16);
                int k3 = k(yVar, 4, 8, 16);
                if (k2 == 7) {
                    int h5 = yVar.h(4) + 1;
                    yVar.r(4);
                    byte[] bArr2 = new byte[h5];
                    for (int i2 = 0; i2 < h5; i2++) {
                        bArr2[i2] = (byte) yVar.h(8);
                    }
                    bArr = bArr2;
                } else {
                    yVar.r(k3 * 8);
                }
            }
        }
        byte[] bArr3 = bArr;
        double b2 = b(h3);
        return new c(h, (int) (h3 * b2), (int) (a2 * b2), bArr3, null);
    }

    public static boolean i(P2.y yVar) {
        yVar.r(3);
        boolean g = yVar.g();
        if (g) {
            yVar.r(13);
        }
        return g;
    }

    public static int j(P2.y yVar) {
        int h = yVar.h(5);
        int i = 0;
        for (int i2 = 0; i2 < h + 1; i2++) {
            int h2 = yVar.h(3);
            i += k(yVar, 5, 8, 16) + 1;
            if ((h2 == 0 || h2 == 2) && yVar.g()) {
                p(yVar);
            }
        }
        return i;
    }

    public static int k(P2.y yVar, int i, int i2, int i3) {
        P2.a.a(Math.max(Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        v7.d.a(v7.d.a(i4, i5), 1 << i3);
        if (yVar.b() < i) {
            return -1;
        }
        int h = yVar.h(i);
        if (h != i4) {
            return h;
        }
        if (yVar.b() < i2) {
            return -1;
        }
        int h2 = yVar.h(i2);
        int i6 = h + h2;
        if (h2 != i5) {
            return i6;
        }
        if (yVar.b() < i3) {
            return -1;
        }
        return i6 + yVar.h(i3);
    }

    public static long l(P2.y yVar, int i, int i2, int i3) {
        P2.a.a(Math.max(Math.max(i, i2), i3) <= 63);
        long j = (1 << i) - 1;
        long j2 = (1 << i2) - 1;
        v7.e.a(v7.e.a(j, j2), 1 << i3);
        if (yVar.b() < i) {
            return -1L;
        }
        long j3 = yVar.j(i);
        if (j3 != j) {
            return j3;
        }
        if (yVar.b() < i2) {
            return -1L;
        }
        long j4 = yVar.j(i2);
        long j5 = j3 + j4;
        if (j4 != j2) {
            return j5;
        }
        if (yVar.b() < i3) {
            return -1L;
        }
        return j5 + yVar.j(i3);
    }

    public static void m(P2.y yVar, int i, int i2) {
        int i3;
        int k = k(yVar, 4, 8, 16) + 1;
        yVar.q();
        for (int i4 = 0; i4 < k; i4++) {
            int h = yVar.h(2);
            if (h == 0) {
                i(yVar);
                if (i2 > 0) {
                    o(yVar);
                }
            } else if (h == 1) {
                if (i(yVar)) {
                    yVar.q();
                }
                if (i2 > 0) {
                    o(yVar);
                    i3 = yVar.h(2);
                } else {
                    i3 = 0;
                }
                if (i3 > 0) {
                    yVar.r(6);
                    int h2 = yVar.h(2);
                    yVar.r(4);
                    if (yVar.g()) {
                        yVar.r(5);
                    }
                    if (i3 == 2 || i3 == 3) {
                        yVar.r(6);
                    }
                    if (h2 == 2) {
                        yVar.q();
                    }
                }
                int floor = ((int) Math.floor(Math.log(i - 1) / Math.log(2.0d))) + 1;
                int h3 = yVar.h(2);
                if (h3 > 0 && yVar.g()) {
                    yVar.r(floor);
                }
                if (yVar.g()) {
                    yVar.r(floor);
                }
                if (i2 == 0 && h3 == 0) {
                    yVar.q();
                }
            } else if (h == 3) {
                k(yVar, 4, 8, 16);
                int k2 = k(yVar, 4, 8, 16);
                if (yVar.g()) {
                    k(yVar, 8, 16, 0);
                }
                yVar.q();
                if (k2 > 0) {
                    yVar.r(k2 * 8);
                }
            }
        }
    }

    public static void n(P2.y yVar, int i) {
        int h;
        boolean g = yVar.g();
        int i2 = g ? 1 : 5;
        int i3 = g ? 7 : 5;
        int i4 = g ? 8 : 6;
        int i5 = 0;
        while (i5 < i) {
            if (yVar.g()) {
                yVar.r(7);
                h = 0;
            } else {
                if (yVar.h(2) == 3 && yVar.h(i3) * i2 != 0) {
                    yVar.q();
                }
                h = yVar.h(i4) * i2;
                if (h != 0 && h != 180) {
                    yVar.q();
                }
                yVar.q();
            }
            if (h != 0 && h != 180 && yVar.g()) {
                i5++;
            }
            i5++;
        }
    }

    public static void o(P2.y yVar) {
        yVar.r(3);
        yVar.r(8);
        boolean g = yVar.g();
        boolean g2 = yVar.g();
        if (g) {
            yVar.r(5);
        }
        if (g2) {
            yVar.r(6);
        }
    }

    public static void p(P2.y yVar) {
        int h = yVar.h(2);
        if (h == 0) {
            yVar.r(6);
            return;
        }
        int k = k(yVar, 5, 8, 16) + 1;
        if (h == 1) {
            yVar.r(k * 7);
        } else if (h == 2) {
            n(yVar, k);
        }
    }
}
