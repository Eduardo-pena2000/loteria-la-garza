package I3;

import M2.q;
import M2.x;
import P2.z;
import o3.B;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class j {
    public static C3.e a(int i, z zVar) {
        int p = zVar.p();
        if (zVar.p() == 1684108385) {
            zVar.U(8);
            String B = zVar.B(p - 16);
            return new C3.e("und", B, B);
        }
        P2.o.h("MetadataUtil", "Failed to parse comment attribute: " + a.a(i));
        return null;
    }

    public static C3.a b(z zVar) {
        int p = zVar.p();
        if (zVar.p() != 1684108385) {
            P2.o.h("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int b = a.b(zVar.p());
        String str = b == 13 ? "image/jpeg" : b == 14 ? "image/png" : null;
        if (str == null) {
            P2.o.h("MetadataUtil", "Unrecognized cover art flags: " + b);
            return null;
        }
        zVar.U(4);
        int i = p - 16;
        byte[] bArr = new byte[i];
        zVar.l(bArr, 0, i);
        return new C3.a(str, null, 3, bArr);
    }

    public static x.b c(z zVar) {
        int f = zVar.f() + zVar.p();
        int p = zVar.p();
        int i = (p >> 24) & 255;
        try {
            if (i == 169 || i == 253) {
                int i2 = 16777215 & p;
                if (i2 == 6516084) {
                    return a(p, zVar);
                }
                if (i2 == 7233901 || i2 == 7631467) {
                    return j(p, "TIT2", zVar);
                }
                if (i2 == 6516589 || i2 == 7828084) {
                    return j(p, "TCOM", zVar);
                }
                if (i2 == 6578553) {
                    return j(p, "TDRC", zVar);
                }
                if (i2 == 4280916) {
                    return j(p, "TPE1", zVar);
                }
                if (i2 == 7630703) {
                    return j(p, "TSSE", zVar);
                }
                if (i2 == 6384738) {
                    return j(p, "TALB", zVar);
                }
                if (i2 == 7108978) {
                    return j(p, "USLT", zVar);
                }
                if (i2 == 6776174) {
                    return j(p, "TCON", zVar);
                }
                if (i2 == 6779504) {
                    return j(p, "TIT1", zVar);
                }
            } else {
                if (p == 1735291493) {
                    return i(zVar);
                }
                if (p == 1684632427) {
                    return d(p, "TPOS", zVar);
                }
                if (p == 1953655662) {
                    return d(p, "TRCK", zVar);
                }
                if (p == 1953329263) {
                    return f(p, "TBPM", zVar, true, false);
                }
                if (p == 1668311404) {
                    return f(p, "TCMP", zVar, true, true);
                }
                if (p == 1668249202) {
                    return b(zVar);
                }
                if (p == 1631670868) {
                    return j(p, "TPE2", zVar);
                }
                if (p == 1936682605) {
                    return j(p, "TSOT", zVar);
                }
                if (p == 1936679276) {
                    return j(p, "TSOA", zVar);
                }
                if (p == 1936679282) {
                    return j(p, "TSOP", zVar);
                }
                if (p == 1936679265) {
                    return j(p, "TSO2", zVar);
                }
                if (p == 1936679791) {
                    return j(p, "TSOC", zVar);
                }
                if (p == 1920233063) {
                    return f(p, "ITUNESADVISORY", zVar, false, false);
                }
                if (p == 1885823344) {
                    return f(p, "ITUNESGAPLESS", zVar, false, true);
                }
                if (p == 1936683886) {
                    return j(p, "TVSHOWSORT", zVar);
                }
                if (p == 1953919848) {
                    return j(p, "TVSHOW", zVar);
                }
                if (p == 757935405) {
                    return g(zVar, f);
                }
            }
            P2.o.b("MetadataUtil", "Skipped unknown metadata entry: " + a.a(p));
            zVar.T(f);
            return null;
        } finally {
            zVar.T(f);
        }
    }

    public static C3.n d(int i, String str, z zVar) {
        int p = zVar.p();
        if (zVar.p() == 1684108385 && p >= 22) {
            zVar.U(10);
            int M = zVar.M();
            if (M > 0) {
                String str2 = "" + M;
                int M2 = zVar.M();
                if (M2 > 0) {
                    str2 = str2 + "/" + M2;
                }
                return new C3.n(str, null, t7.r.t(str2));
            }
        }
        P2.o.h("MetadataUtil", "Failed to parse index/count attribute: " + a.a(i));
        return null;
    }

    public static int e(z zVar) {
        int p = zVar.p();
        if (zVar.p() == 1684108385) {
            zVar.U(8);
            int i = p - 16;
            if (i == 1) {
                return zVar.G();
            }
            if (i == 2) {
                return zVar.M();
            }
            if (i == 3) {
                return zVar.J();
            }
            if (i == 4 && (zVar.j() & 128) == 0) {
                return zVar.K();
            }
        }
        P2.o.h("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static C3.i f(int i, String str, z zVar, boolean z, boolean z2) {
        int e = e(zVar);
        if (z2) {
            e = Math.min(1, e);
        }
        if (e >= 0) {
            return z ? new C3.n(str, null, t7.r.t(Integer.toString(e))) : new C3.e("und", str, Integer.toString(e));
        }
        P2.o.h("MetadataUtil", "Failed to parse uint8 attribute: " + a.a(i));
        return null;
    }

    public static C3.i g(z zVar, int i) {
        String str = null;
        String str2 = null;
        int i2 = -1;
        int i3 = -1;
        while (zVar.f() < i) {
            int f = zVar.f();
            int p = zVar.p();
            int p2 = zVar.p();
            zVar.U(4);
            if (p2 == 1835360622) {
                str = zVar.B(p - 12);
            } else if (p2 == 1851878757) {
                str2 = zVar.B(p - 12);
            } else {
                if (p2 == 1684108385) {
                    i2 = f;
                    i3 = p;
                }
                zVar.U(p - 12);
            }
        }
        if (str == null || str2 == null || i2 == -1) {
            return null;
        }
        zVar.T(i2);
        zVar.U(16);
        return new C3.k(str, str2, zVar.B(i3 - 16));
    }

    public static Q2.a h(z zVar, int i, String str) {
        while (true) {
            int f = zVar.f();
            if (f >= i) {
                return null;
            }
            int p = zVar.p();
            if (zVar.p() == 1684108385) {
                int p2 = zVar.p();
                int p3 = zVar.p();
                int i2 = p - 16;
                byte[] bArr = new byte[i2];
                zVar.l(bArr, 0, i2);
                return new Q2.a(str, bArr, p3, p2);
            }
            zVar.T(f + p);
        }
    }

    public static C3.n i(z zVar) {
        String a = C3.j.a(e(zVar) - 1);
        if (a != null) {
            return new C3.n("TCON", null, t7.r.t(a));
        }
        P2.o.h("MetadataUtil", "Failed to parse standard genre code");
        return null;
    }

    public static C3.n j(int i, String str, z zVar) {
        int p = zVar.p();
        if (zVar.p() == 1684108385) {
            zVar.U(8);
            return new C3.n(str, null, t7.r.t(zVar.B(p - 16)));
        }
        P2.o.h("MetadataUtil", "Failed to parse text attribute: " + a.a(i));
        return null;
    }

    public static void k(int i, B b, q.b bVar) {
        if (i == 1 && b.a()) {
            bVar.V(b.a).W(b.b);
        }
    }

    public static void l(int i, x xVar, q.b bVar, x... xVarArr) {
        x xVar2 = new x(new x.b[0]);
        if (xVar != null) {
            for (int i2 = 0; i2 < xVar.j(); i2++) {
                x.b i3 = xVar.i(i2);
                if (i3 instanceof Q2.a) {
                    Q2.a aVar = (Q2.a) i3;
                    if (!aVar.a.equals("com.android.capture.fps")) {
                        xVar2 = xVar2.b(aVar);
                    } else if (i == 2) {
                        xVar2 = xVar2.b(aVar);
                    }
                }
            }
        }
        for (x xVar3 : xVarArr) {
            xVar2 = xVar2.c(xVar3);
        }
        if (xVar2.j() > 0) {
            bVar.h0(xVar2);
        }
    }
}
