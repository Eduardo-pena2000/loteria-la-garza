package I3;

import P2.z;
import o3.N;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class r {
    public static final int[] a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean a(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        for (int i2 : a) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static N b(o3.q qVar) {
        return c(qVar, true, false);
    }

    public static N c(o3.q qVar, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        boolean z3;
        int[] iArr;
        long a2 = qVar.a();
        long j = -1;
        long j2 = 4096;
        if (a2 != -1 && a2 <= 4096) {
            j2 = a2;
        }
        int i4 = (int) j2;
        z zVar = new z(64);
        int i5 = 0;
        int i6 = 0;
        boolean z4 = false;
        while (i6 < i4) {
            zVar.P(8);
            if (!qVar.d(zVar.e(), i5, 8, true)) {
                break;
            }
            long I = zVar.I();
            int p = zVar.p();
            if (I == 1) {
                qVar.p(zVar.e(), 8, 8);
                i2 = 16;
                zVar.S(16);
                I = zVar.z();
            } else {
                if (I == 0) {
                    long a3 = qVar.a();
                    if (a3 != j) {
                        I = (a3 - qVar.i()) + 8;
                    }
                }
                i2 = 8;
            }
            long j3 = I;
            long j4 = i2;
            if (j3 < j4) {
                return new c(p, j3, i2);
            }
            i6 += i2;
            if (p == 1836019574) {
                i4 += (int) j3;
                if (a2 != -1 && i4 > a2) {
                    i4 = (int) a2;
                }
            } else {
                if (p == 1836019558 || p == 1836475768) {
                    i = 1;
                    break;
                }
                long j5 = a2;
                if (p == 1835295092) {
                    z4 = true;
                }
                if ((i6 + j3) - j4 >= i4) {
                    i = 0;
                    break;
                }
                int i7 = (int) (j3 - j4);
                i6 += i7;
                if (p != 1718909296) {
                    i3 = 0;
                    if (i7 != 0) {
                        qVar.j(i7);
                    }
                } else {
                    if (i7 < 8) {
                        return new c(p, i7, 8);
                    }
                    zVar.P(i7);
                    i3 = 0;
                    qVar.p(zVar.e(), 0, i7);
                    int p2 = zVar.p();
                    if (a(p2, z2)) {
                        z4 = true;
                    }
                    zVar.U(4);
                    int a4 = zVar.a() / 4;
                    if (!z4 && a4 > 0) {
                        iArr = new int[a4];
                        int i8 = 0;
                        while (true) {
                            if (i8 >= a4) {
                                z3 = z4;
                                break;
                            }
                            int p3 = zVar.p();
                            iArr[i8] = p3;
                            if (a(p3, z2)) {
                                z3 = true;
                                break;
                            }
                            i8++;
                        }
                    } else {
                        z3 = z4;
                        iArr = null;
                    }
                    if (!z3) {
                        return new w(p2, iArr);
                    }
                    z4 = z3;
                }
                i5 = i3;
                a2 = j5;
            }
            j = -1;
        }
        i = i5;
        if (!z4) {
            return n.a;
        }
        if (z != i) {
            return i != 0 ? i.b : i.c;
        }
        return null;
    }

    public static N d(o3.q qVar, boolean z) {
        return c(qVar, false, z);
    }
}
