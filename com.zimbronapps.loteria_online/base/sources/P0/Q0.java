package P0;

import android.os.Parcel;
import android.util.Base64;
import l1.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class q0 {
    public final Parcel a;

    public q0(String str) {
        Parcel obtain = Parcel.obtain();
        this.a = obtain;
        byte[] decode = Base64.decode(str, 0);
        obtain.unmarshall(decode, 0, decode.length);
        obtain.setDataPosition(0);
    }

    public final int a() {
        return this.a.dataAvail();
    }

    public final float b() {
        return l1.a.c(e());
    }

    public final byte c() {
        return this.a.readByte();
    }

    public final long d() {
        return v0.H.a(v0.r0.b, this.a.readLong());
    }

    public final float e() {
        return this.a.readFloat();
    }

    public final int f() {
        byte c = c();
        return c == 0 ? d1.H.b.b() : c == 1 ? d1.H.b.a() : d1.H.b.b();
    }

    public final int g() {
        byte c = c();
        return c == 0 ? d1.I.b.b() : c == 1 ? d1.I.b.a() : c == 3 ? d1.I.b.c() : c == 2 ? d1.I.b.d() : d1.I.b.b();
    }

    public final d1.L h() {
        return new d1.L(i());
    }

    public final int i() {
        return this.a.readInt();
    }

    public final v0.C1 j() {
        long d = d();
        float e = e();
        float e2 = e();
        return new v0.C1(d, u0.f.e((Float.floatToRawIntBits(e) << 32) | (4294967295L & Float.floatToRawIntBits(e2))), e(), null);
    }

    public final Z0.I0 k() {
        U0 u0;
        U0 u02 = r15;
        U0 u03 = new U0(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 16383, null);
        while (this.a.dataAvail() > 1) {
            byte c = c();
            if (c != 1) {
                u0 = u02;
                if (c == 2) {
                    if (a() < 5) {
                        break;
                    }
                    u0.e(o());
                    u02 = u0;
                } else if (c == 3) {
                    if (a() < 4) {
                        break;
                    }
                    u0.h(h());
                    u02 = u0;
                } else if (c == 4) {
                    if (a() < 1) {
                        break;
                    }
                    u0.f(d1.H.c(f()));
                    u02 = u0;
                } else if (c != 5) {
                    if (c != 6) {
                        if (c != 7) {
                            if (c != 8) {
                                if (c != 9) {
                                    if (c != 10) {
                                        if (c != 11) {
                                            if (c == 12) {
                                                if (a() < 20) {
                                                    break;
                                                }
                                                u0.j(j());
                                            }
                                        } else {
                                            if (a() < 4) {
                                                break;
                                            }
                                            u0.k(m());
                                        }
                                    } else {
                                        if (a() < 8) {
                                            break;
                                        }
                                        u0.a(d());
                                    }
                                } else {
                                    if (a() < 8) {
                                        break;
                                    }
                                    u0.l(n());
                                }
                            } else {
                                if (a() < 4) {
                                    break;
                                }
                                u0.b(l1.a.b(b()));
                            }
                        } else {
                            if (a() < 5) {
                                break;
                            }
                            u0.i(o());
                        }
                    } else {
                        u0.d(l());
                    }
                    u02 = u0;
                } else {
                    if (a() < 1) {
                        break;
                    }
                    u0.g(d1.I.e(g()));
                    u02 = u0;
                }
            } else {
                if (a() < 8) {
                    break;
                }
                u02.c(d());
            }
        }
        u0 = u02;
        return u0.m();
    }

    public final String l() {
        return this.a.readString();
    }

    public final l1.k m() {
        int i = i();
        k.a aVar = l1.k.b;
        boolean z = (aVar.b().e() & i) != 0;
        boolean z2 = (i & aVar.d().e()) != 0;
        return (z && z2) ? aVar.a(Da.v.q(new l1.k[]{aVar.b(), aVar.d()})) : z ? aVar.b() : z2 ? aVar.d() : aVar.c();
    }

    public final l1.q n() {
        return new l1.q(e(), e());
    }

    public final long o() {
        byte c = c();
        long b = c == 1 ? n1.x.b.b() : c == 2 ? n1.x.b.a() : n1.x.b.c();
        return n1.x.g(b, n1.x.b.c()) ? n1.v.b.a() : n1.w.a(e(), b);
    }
}
