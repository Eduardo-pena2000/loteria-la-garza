package I3;

import I3.a;
import M2.h;
import M2.q;
import M2.x;
import P2.K;
import P2.y;
import P2.z;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o3.B;
import o3.C;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class b {
    public static final byte[] a = K.r0("OpusHead");

    public static final class a {
        public final int a;
        public int b;
        public int c;
        public long d;
        public final boolean e;
        public final z f;
        public final z g;
        public int h;
        public int i;

        public a(z zVar, z zVar2, boolean z) {
            this.g = zVar;
            this.f = zVar2;
            this.e = z;
            zVar2.T(12);
            this.a = zVar2.K();
            zVar.T(12);
            this.i = zVar.K();
            o3.s.a(zVar.p() == 1, "first_chunk must be 1");
            this.b = -1;
        }

        public boolean a() {
            int i = this.b + 1;
            this.b = i;
            if (i == this.a) {
                return false;
            }
            this.d = this.e ? this.f.L() : this.f.I();
            if (this.b == this.h) {
                this.c = this.g.K();
                this.g.U(4);
                int i2 = this.i - 1;
                this.i = i2;
                this.h = i2 > 0 ? this.g.K() - 1 : -1;
            }
            return true;
        }
    }

    public static final class b {
        public final String a;
        public final byte[] b;
        public final long c;
        public final long d;

        public b(String str, byte[] bArr, long j, long j2) {
            this.a = str;
            this.b = bArr;
            this.c = j;
            this.d = j2;
        }

        public static /* synthetic */ String a(b bVar) {
            return bVar.a;
        }

        public static /* synthetic */ byte[] b(b bVar) {
            return bVar.b;
        }

        public static /* synthetic */ long c(b bVar) {
            return bVar.d;
        }

        public static /* synthetic */ long d(b bVar) {
            return bVar.c;
        }
    }

    public interface c {
        int a();

        int b();

        int c();
    }

    public static final class d {
        public final t[] a;
        public M2.q b;
        public int c;
        public int d = 0;

        public d(int i) {
            this.a = new t[i];
        }
    }

    public static final class e implements c {
        public final int a;
        public final int b;
        public final z c;

        public e(a.b bVar, M2.q qVar) {
            z zVar = bVar.b;
            this.c = zVar;
            zVar.T(12);
            int K = zVar.K();
            if ("audio/raw".equals(qVar.n)) {
                int g0 = K.g0(qVar.D, qVar.B);
                if (K == 0 || K % g0 != 0) {
                    P2.o.h("AtomParsers", "Audio sample size mismatch. stsd sample size: " + g0 + ", stsz sample size: " + K);
                    K = g0;
                }
            }
            this.a = K == 0 ? -1 : K;
            this.b = zVar.K();
        }

        public int a() {
            int i = this.a;
            return i == -1 ? this.c.K() : i;
        }

        public int b() {
            return this.a;
        }

        public int c() {
            return this.b;
        }
    }

    public static final class f implements c {
        public final z a;
        public final int b;
        public final int c;
        public int d;
        public int e;

        public f(a.b bVar) {
            z zVar = bVar.b;
            this.a = zVar;
            zVar.T(12);
            this.c = zVar.K() & 255;
            this.b = zVar.K();
        }

        public int a() {
            int i = this.c;
            if (i == 8) {
                return this.a.G();
            }
            if (i == 16) {
                return this.a.M();
            }
            int i2 = this.d;
            this.d = i2 + 1;
            if (i2 % 2 != 0) {
                return this.e & 15;
            }
            int G = this.a.G();
            this.e = G;
            return (G & 240) >> 4;
        }

        public int b() {
            return -1;
        }

        public int c() {
            return this.b;
        }
    }

    public static final class g {
        public final int a;
        public final long b;
        public final int c;

        public g(int i, long j, int i2) {
            this.a = i;
            this.b = j;
            this.c = i2;
        }

        public static /* synthetic */ long a(g gVar) {
            return gVar.b;
        }

        public static /* synthetic */ int b(g gVar) {
            return gVar.a;
        }

        public static /* synthetic */ int c(g gVar) {
            return gVar.c;
        }
    }

    public static s A(a.a aVar, a.b bVar, long j, M2.m mVar, boolean z, boolean z2) {
        a.b bVar2;
        long j2;
        long[] jArr;
        long[] jArr2;
        a.a f2;
        Pair j3;
        a.a aVar2 = (a.a) P2.a.e(aVar.f(1835297121));
        int e2 = e(m(((a.b) P2.a.e(aVar2.g(1751411826))).b));
        if (e2 == -1) {
            return null;
        }
        g z3 = z(((a.b) P2.a.e(aVar.g(1953196132))).b);
        if (j == -9223372036854775807L) {
            bVar2 = bVar;
            j2 = g.a(z3);
        } else {
            bVar2 = bVar;
            j2 = j;
        }
        long j4 = r(bVar2.b).c;
        long X0 = j2 != -9223372036854775807L ? K.X0(j2, 1000000L, j4) : -9223372036854775807L;
        a.a aVar3 = (a.a) P2.a.e(((a.a) P2.a.e(aVar2.f(1835626086))).f(1937007212));
        Pair o = o(((a.b) P2.a.e(aVar2.g(1835296868))).b);
        a.b g2 = aVar3.g(1937011556);
        if (g2 == null) {
            throw M2.z.a("Malformed sample table (stbl) missing sample description (stsd)", null);
        }
        d x = x(g2.b, g.b(z3), g.c(z3), (String) o.second, mVar, z2);
        if (z || (f2 = aVar.f(1701082227)) == null || (j3 = j(f2)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) j3.first;
            jArr2 = (long[]) j3.second;
            jArr = jArr3;
        }
        if (x.b == null) {
            return null;
        }
        return new s(g.b(z3), e2, ((Long) o.first).longValue(), j4, X0, x.b, x.d, x.a, x.c, jArr, jArr2);
    }

    public static List B(a.a aVar, B b2, long j, M2.m mVar, boolean z, boolean z2, s7.g gVar) {
        s sVar;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < aVar.d.size(); i++) {
            a.a aVar2 = (a.a) aVar.d.get(i);
            if (aVar2.a == 1953653099 && (sVar = (s) gVar.apply(A(aVar2, (a.b) P2.a.e(aVar.g(1836476516)), j, mVar, z, z2))) != null) {
                arrayList.add(w(sVar, (a.a) P2.a.e(((a.a) P2.a.e(((a.a) P2.a.e(aVar2.f(1835297121))).f(1835626086))).f(1937007212)), b2));
            }
        }
        return arrayList;
    }

    public static x C(a.b bVar) {
        z zVar = bVar.b;
        zVar.T(8);
        x xVar = new x(new x.b[0]);
        while (zVar.a() >= 8) {
            int f2 = zVar.f();
            int p = zVar.p();
            int p2 = zVar.p();
            if (p2 == 1835365473) {
                zVar.T(f2);
                xVar = xVar.c(D(zVar, f2 + p));
            } else if (p2 == 1936553057) {
                zVar.T(f2);
                xVar = xVar.c(q.b(zVar, f2 + p));
            } else if (p2 == -1451722374) {
                xVar = xVar.c(F(zVar));
            }
            zVar.T(f2 + p);
        }
        return xVar;
    }

    public static x D(z zVar, int i) {
        zVar.U(8);
        f(zVar);
        while (zVar.f() < i) {
            int f2 = zVar.f();
            int p = zVar.p();
            if (zVar.p() == 1768715124) {
                zVar.T(f2);
                return n(zVar, f2 + p);
            }
            zVar.T(f2 + p);
        }
        return null;
    }

    public static void E(z zVar, int i, int i2, int i3, int i4, int i5, M2.m mVar, d dVar, int i6) {
        M2.m mVar2;
        int i7;
        String str;
        float f2;
        int i8;
        int i9;
        int i10;
        int i11 = i2;
        int i12 = i3;
        M2.m mVar3 = mVar;
        d dVar2 = dVar;
        zVar.T(i11 + 16);
        zVar.U(16);
        int M = zVar.M();
        int M2 = zVar.M();
        zVar.U(50);
        int f3 = zVar.f();
        int i13 = i;
        if (i13 == 1701733238) {
            Pair u = u(zVar, i11, i12);
            if (u != null) {
                i13 = ((Integer) u.first).intValue();
                mVar3 = mVar3 == null ? null : mVar3.d(((t) u.second).b);
                dVar2.a[i6] = (t) u.second;
            }
            zVar.T(f3);
        }
        String str2 = "video/3gpp";
        String str3 = i13 == 1831958048 ? "video/mpeg" : i13 == 1211250227 ? "video/3gpp" : null;
        float f4 = 1.0f;
        int i14 = 8;
        int i15 = 8;
        t7.r rVar = null;
        String str4 = null;
        byte[] bArr = null;
        int i16 = -1;
        int i17 = -1;
        int i18 = -1;
        int i19 = -1;
        int i20 = -1;
        ByteBuffer byteBuffer = null;
        b bVar = null;
        boolean z = false;
        while (f3 - i11 < i12) {
            zVar.T(f3);
            int f5 = zVar.f();
            int p = zVar.p();
            if (p == 0 && zVar.f() - i11 == i12) {
                break;
            }
            o3.s.a(p > 0, "childAtomSize must be positive");
            int p2 = zVar.p();
            if (p2 == 1635148611) {
                o3.s.a(str3 == null, null);
                zVar.T(f5 + 8);
                o3.d b2 = o3.d.b(zVar);
                t7.r rVar2 = b2.a;
                dVar2.c = b2.b;
                if (!z) {
                    f4 = b2.k;
                }
                String str5 = b2.l;
                int i21 = b2.j;
                int i22 = b2.g;
                int i23 = b2.h;
                int i24 = b2.i;
                int i25 = b2.e;
                mVar2 = mVar3;
                i7 = i13;
                str = str2;
                i17 = i21;
                i18 = i22;
                i19 = i23;
                i20 = i24;
                i15 = b2.f;
                i14 = i25;
                rVar = rVar2;
                str3 = "video/avc";
                str4 = str5;
            } else if (p2 == 1752589123) {
                o3.s.a(str3 == null, null);
                zVar.T(f5 + 8);
                C a2 = C.a(zVar);
                t7.r rVar3 = a2.a;
                dVar2.c = a2.b;
                if (!z) {
                    f4 = a2.j;
                }
                int i26 = a2.k;
                String str6 = a2.l;
                mVar2 = mVar3;
                i17 = i26;
                i7 = i13;
                str = str2;
                i18 = a2.g;
                i19 = a2.h;
                i20 = a2.i;
                str3 = "video/hevc";
                i14 = a2.e;
                str4 = str6;
                rVar = rVar3;
                i15 = a2.f;
            } else {
                if (p2 == 1685480259 || p2 == 1685485123) {
                    mVar2 = mVar3;
                    i7 = i13;
                    str = str2;
                    f2 = f4;
                    i8 = i14;
                    i9 = i18;
                    i10 = i20;
                    o3.n a3 = o3.n.a(zVar);
                    if (a3 != null) {
                        str4 = a3.c;
                        str3 = "video/dolby-vision";
                    }
                } else if (p2 == 1987076931) {
                    o3.s.a(str3 == null, null);
                    String str7 = i13 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                    zVar.T(f5 + 12);
                    zVar.U(2);
                    int G = zVar.G();
                    int i27 = G >> 4;
                    boolean z2 = (G & 1) != 0;
                    int G2 = zVar.G();
                    int G3 = zVar.G();
                    i18 = M2.h.j(G2);
                    i19 = z2 ? 1 : 2;
                    i20 = M2.h.k(G3);
                    mVar2 = mVar3;
                    i14 = i27;
                    i15 = i14;
                    i7 = i13;
                    str = str2;
                    str3 = str7;
                } else if (p2 == 1635135811) {
                    int i28 = p - 8;
                    byte[] bArr2 = new byte[i28];
                    zVar.l(bArr2, 0, i28);
                    rVar = t7.r.t(bArr2);
                    zVar.T(f5 + 8);
                    M2.h h = h(zVar);
                    int i29 = h.e;
                    int i30 = h.f;
                    int i31 = h.a;
                    int i32 = h.b;
                    i20 = h.c;
                    mVar2 = mVar3;
                    i7 = i13;
                    str = str2;
                    i18 = i31;
                    i19 = i32;
                    str3 = "video/av01";
                    i14 = i29;
                    i15 = i30;
                } else if (p2 == 1668050025) {
                    if (byteBuffer == null) {
                        byteBuffer = a();
                    }
                    ByteBuffer byteBuffer2 = byteBuffer;
                    byteBuffer2.position(21);
                    byteBuffer2.putShort(zVar.C());
                    byteBuffer2.putShort(zVar.C());
                    byteBuffer = byteBuffer2;
                    mVar2 = mVar3;
                    i7 = i13;
                    str = str2;
                } else if (p2 == 1835295606) {
                    if (byteBuffer == null) {
                        byteBuffer = a();
                    }
                    ByteBuffer byteBuffer3 = byteBuffer;
                    short C = zVar.C();
                    short C2 = zVar.C();
                    short C3 = zVar.C();
                    i7 = i13;
                    short C4 = zVar.C();
                    str = str2;
                    short C5 = zVar.C();
                    short C6 = zVar.C();
                    int i33 = i14;
                    short C7 = zVar.C();
                    mVar2 = mVar3;
                    short C8 = zVar.C();
                    long I = zVar.I();
                    long I2 = zVar.I();
                    byteBuffer3.position(1);
                    byteBuffer3.putShort(C5);
                    byteBuffer3.putShort(C6);
                    byteBuffer3.putShort(C);
                    byteBuffer3.putShort(C2);
                    byteBuffer3.putShort(C3);
                    byteBuffer3.putShort(C4);
                    byteBuffer3.putShort(C7);
                    byteBuffer3.putShort(C8);
                    byteBuffer3.putShort((short) (I / 10000));
                    byteBuffer3.putShort((short) (I2 / 10000));
                    byteBuffer = byteBuffer3;
                    i14 = i33;
                    f4 = f4;
                } else {
                    mVar2 = mVar3;
                    i7 = i13;
                    str = str2;
                    f2 = f4;
                    i8 = i14;
                    if (p2 == 1681012275) {
                        o3.s.a(str3 == null, null);
                        str3 = str;
                    } else if (p2 == 1702061171) {
                        o3.s.a(str3 == null, null);
                        bVar = k(zVar, f5);
                        String a4 = b.a(bVar);
                        byte[] b3 = b.b(bVar);
                        if (b3 != null) {
                            rVar = t7.r.t(b3);
                        }
                        str3 = a4;
                    } else if (p2 == 1885434736) {
                        f4 = s(zVar, f5);
                        i14 = i8;
                        z = true;
                    } else if (p2 == 1937126244) {
                        bArr = t(zVar, f5, p);
                    } else if (p2 == 1936995172) {
                        int G4 = zVar.G();
                        zVar.U(3);
                        if (G4 == 0) {
                            int G5 = zVar.G();
                            if (G5 == 0) {
                                i16 = 0;
                            } else if (G5 == 1) {
                                i16 = 1;
                            } else if (G5 == 2) {
                                i16 = 2;
                            } else if (G5 == 3) {
                                i16 = 3;
                            }
                        }
                    } else if (p2 == 1668246642) {
                        i9 = i18;
                        i10 = i20;
                        if (i9 == -1 && i10 == -1) {
                            int p3 = zVar.p();
                            if (p3 == 1852009592 || p3 == 1852009571) {
                                int M3 = zVar.M();
                                int M4 = zVar.M();
                                zVar.U(2);
                                boolean z3 = p == 19 && (zVar.G() & 128) != 0;
                                i18 = M2.h.j(M3);
                                i19 = z3 ? 1 : 2;
                                i20 = M2.h.k(M4);
                                i14 = i8;
                                f4 = f2;
                            } else {
                                P2.o.h("AtomParsers", "Unsupported color type: " + I3.a.a(p3));
                            }
                        }
                    } else {
                        i9 = i18;
                        i10 = i20;
                    }
                    i14 = i8;
                    f4 = f2;
                }
                i18 = i9;
                i20 = i10;
                i14 = i8;
                f4 = f2;
            }
            f3 += p;
            i11 = i2;
            i12 = i3;
            dVar2 = dVar;
            i13 = i7;
            str2 = str;
            mVar3 = mVar2;
        }
        M2.m mVar4 = mVar3;
        float f6 = f4;
        int i34 = i14;
        int i35 = i18;
        int i36 = i20;
        if (str3 == null) {
            return;
        }
        q.b P = new q.b().Z(i4).o0(str3).O(str4).v0(M).Y(M2).k0(f6).n0(i5).l0(bArr).r0(i16).b0(rVar).g0(i17).U(mVar4).P(new h.b().d(i35).c(i19).e(i36).f(byteBuffer != null ? byteBuffer.array() : null).g(i34).b(i15).a());
        if (bVar != null) {
            P.M(w7.f.l(b.d(bVar))).j0(w7.f.l(b.c(bVar)));
        }
        dVar.b = P.K();
    }

    public static x F(z zVar) {
        short C = zVar.C();
        zVar.U(2);
        String D = zVar.D(C);
        int max = Math.max(D.lastIndexOf(43), D.lastIndexOf(45));
        try {
            return new x(new Q2.b(Float.parseFloat(D.substring(0, max)), Float.parseFloat(D.substring(max, D.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    public static ByteBuffer a() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    public static boolean b(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        return jArr[0] <= j2 && j2 < jArr[K.p(4, 0, length)] && jArr[K.p(jArr.length - 4, 0, length)] < j3 && j3 <= j;
    }

    public static boolean c(int i) {
        return i != 1;
    }

    public static int d(z zVar, int i, int i2, int i3) {
        int f2 = zVar.f();
        o3.s.a(f2 >= i2, null);
        while (f2 - i2 < i3) {
            zVar.T(f2);
            int p = zVar.p();
            o3.s.a(p > 0, "childAtomSize must be positive");
            if (zVar.p() == i) {
                return f2;
            }
            f2 += p;
        }
        return -1;
    }

    public static int e(int i) {
        if (i == 1936684398) {
            return 1;
        }
        if (i == 1986618469) {
            return 2;
        }
        if (i == 1952807028 || i == 1935832172 || i == 1937072756 || i == 1668047728) {
            return 3;
        }
        return i == 1835365473 ? 5 : -1;
    }

    public static void f(z zVar) {
        int f2 = zVar.f();
        zVar.U(4);
        if (zVar.p() != 1751411826) {
            f2 += 4;
        }
        zVar.T(f2);
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void g(P2.z r24, int r25, int r26, int r27, int r28, java.lang.String r29, boolean r30, M2.m r31, I3.b.d r32, int r33) {
        /*
            Method dump skipped, instructions count: 1118
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: I3.b.g(P2.z, int, int, int, int, java.lang.String, boolean, M2.m, I3.b$d, int):void");
    }

    public static M2.h h(z zVar) {
        h.b bVar = new h.b();
        y yVar = new y(zVar.e());
        yVar.p(zVar.f() * 8);
        yVar.s(1);
        int h = yVar.h(3);
        yVar.r(6);
        boolean g2 = yVar.g();
        boolean g3 = yVar.g();
        if (h == 2 && g2) {
            bVar.g(g3 ? 12 : 10);
            bVar.b(g3 ? 12 : 10);
        } else if (h <= 2) {
            bVar.g(g2 ? 10 : 8);
            bVar.b(g2 ? 10 : 8);
        }
        yVar.r(13);
        yVar.q();
        int h2 = yVar.h(4);
        if (h2 != 1) {
            P2.o.f("AtomParsers", "Unsupported obu_type: " + h2);
            return bVar.a();
        }
        if (yVar.g()) {
            P2.o.f("AtomParsers", "Unsupported obu_extension_flag");
            return bVar.a();
        }
        boolean g4 = yVar.g();
        yVar.q();
        if (g4 && yVar.h(8) > 127) {
            P2.o.f("AtomParsers", "Excessive obu_size");
            return bVar.a();
        }
        int h3 = yVar.h(3);
        yVar.q();
        if (yVar.g()) {
            P2.o.f("AtomParsers", "Unsupported reduced_still_picture_header");
            return bVar.a();
        }
        if (yVar.g()) {
            P2.o.f("AtomParsers", "Unsupported timing_info_present_flag");
            return bVar.a();
        }
        if (yVar.g()) {
            P2.o.f("AtomParsers", "Unsupported initial_display_delay_present_flag");
            return bVar.a();
        }
        int h4 = yVar.h(5);
        boolean z = false;
        for (int i = 0; i <= h4; i++) {
            yVar.r(12);
            if (yVar.h(5) > 7) {
                yVar.q();
            }
        }
        int h5 = yVar.h(4);
        int h6 = yVar.h(4);
        yVar.r(h5 + 1);
        yVar.r(h6 + 1);
        if (yVar.g()) {
            yVar.r(7);
        }
        yVar.r(7);
        boolean g5 = yVar.g();
        if (g5) {
            yVar.r(2);
        }
        if ((yVar.g() ? 2 : yVar.h(1)) > 0 && !yVar.g()) {
            yVar.r(1);
        }
        if (g5) {
            yVar.r(3);
        }
        yVar.r(3);
        boolean g6 = yVar.g();
        if (h3 == 2 && g6) {
            yVar.q();
        }
        if (h3 != 1 && yVar.g()) {
            z = true;
        }
        if (yVar.g()) {
            int h7 = yVar.h(8);
            int h8 = yVar.h(8);
            bVar.d(M2.h.j(h7)).c(((z || h7 != 1 || h8 != 13 || yVar.h(8) != 0) ? yVar.h(1) : 1) != 1 ? 2 : 1).e(M2.h.k(h8));
        }
        return bVar.a();
    }

    public static Pair i(z zVar, int i, int i2) {
        int i3 = i + 8;
        int i4 = -1;
        int i5 = 0;
        String str = null;
        Integer num = null;
        while (i3 - i < i2) {
            zVar.T(i3);
            int p = zVar.p();
            int p2 = zVar.p();
            if (p2 == 1718775137) {
                num = Integer.valueOf(zVar.p());
            } else if (p2 == 1935894637) {
                zVar.U(4);
                str = zVar.D(4);
            } else if (p2 == 1935894633) {
                i4 = i3;
                i5 = p;
            }
            i3 += p;
        }
        if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
            return null;
        }
        o3.s.a(num != null, "frma atom is mandatory");
        o3.s.a(i4 != -1, "schi atom is mandatory");
        t v = v(zVar, i4, i5, str);
        o3.s.a(v != null, "tenc atom is mandatory");
        return Pair.create(num, (t) K.i(v));
    }

    public static Pair j(a.a aVar) {
        a.b g2 = aVar.g(1701606260);
        if (g2 == null) {
            return null;
        }
        z zVar = g2.b;
        zVar.T(8);
        int c2 = I3.a.c(zVar.p());
        int K = zVar.K();
        long[] jArr = new long[K];
        long[] jArr2 = new long[K];
        for (int i = 0; i < K; i++) {
            jArr[i] = c2 == 1 ? zVar.L() : zVar.I();
            jArr2[i] = c2 == 1 ? zVar.z() : zVar.p();
            if (zVar.C() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            zVar.U(2);
        }
        return Pair.create(jArr, jArr2);
    }

    public static b k(z zVar, int i) {
        zVar.T(i + 12);
        zVar.U(1);
        l(zVar);
        zVar.U(2);
        int G = zVar.G();
        if ((G & 128) != 0) {
            zVar.U(2);
        }
        if ((G & 64) != 0) {
            zVar.U(zVar.G());
        }
        if ((G & 32) != 0) {
            zVar.U(2);
        }
        zVar.U(1);
        l(zVar);
        String h = M2.y.h(zVar.G());
        if ("audio/mpeg".equals(h) || "audio/vnd.dts".equals(h) || "audio/vnd.dts.hd".equals(h)) {
            return new b(h, null, -1L, -1L);
        }
        zVar.U(4);
        long I = zVar.I();
        long I2 = zVar.I();
        zVar.U(1);
        int l = l(zVar);
        byte[] bArr = new byte[l];
        zVar.l(bArr, 0, l);
        return new b(h, bArr, I2 > 0 ? I2 : -1L, I > 0 ? I : -1L);
    }

    public static int l(z zVar) {
        int G = zVar.G();
        int i = G & 127;
        while ((G & 128) == 128) {
            G = zVar.G();
            i = (i << 7) | (G & 127);
        }
        return i;
    }

    public static int m(z zVar) {
        zVar.T(16);
        return zVar.p();
    }

    public static x n(z zVar, int i) {
        zVar.U(8);
        ArrayList arrayList = new ArrayList();
        while (zVar.f() < i) {
            x.b c2 = j.c(zVar);
            if (c2 != null) {
                arrayList.add(c2);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new x((List) arrayList);
    }

    public static Pair o(z zVar) {
        zVar.T(8);
        int c2 = I3.a.c(zVar.p());
        zVar.U(c2 == 0 ? 8 : 16);
        long I = zVar.I();
        zVar.U(c2 == 0 ? 4 : 8);
        int M = zVar.M();
        return Pair.create(Long.valueOf(I), "" + ((char) (((M >> 10) & 31) + 96)) + ((char) (((M >> 5) & 31) + 96)) + ((char) ((M & 31) + 96)));
    }

    public static x p(a.a aVar) {
        a.b g2 = aVar.g(1751411826);
        a.b g3 = aVar.g(1801812339);
        a.b g4 = aVar.g(1768715124);
        if (g2 == null || g3 == null || g4 == null || m(g2.b) != 1835299937) {
            return null;
        }
        z zVar = g3.b;
        zVar.T(12);
        int p = zVar.p();
        String[] strArr = new String[p];
        for (int i = 0; i < p; i++) {
            int p2 = zVar.p();
            zVar.U(4);
            strArr[i] = zVar.D(p2 - 8);
        }
        z zVar2 = g4.b;
        zVar2.T(8);
        ArrayList arrayList = new ArrayList();
        while (zVar2.a() > 8) {
            int f2 = zVar2.f();
            int p3 = zVar2.p();
            int p4 = zVar2.p() - 1;
            if (p4 < 0 || p4 >= p) {
                P2.o.h("AtomParsers", "Skipped metadata with unknown key index: " + p4);
            } else {
                Q2.a h = j.h(zVar2, f2 + p3, strArr[p4]);
                if (h != null) {
                    arrayList.add(h);
                }
            }
            zVar2.T(f2 + p3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new x((List) arrayList);
    }

    public static void q(z zVar, int i, int i2, int i3, d dVar) {
        zVar.T(i2 + 16);
        if (i == 1835365492) {
            zVar.A();
            String A = zVar.A();
            if (A != null) {
                dVar.b = new q.b().Z(i3).o0(A).K();
            }
        }
    }

    public static Q2.c r(z zVar) {
        long z;
        long z2;
        zVar.T(8);
        if (I3.a.c(zVar.p()) == 0) {
            z = zVar.I();
            z2 = zVar.I();
        } else {
            z = zVar.z();
            z2 = zVar.z();
        }
        return new Q2.c(z, z2, zVar.I());
    }

    public static float s(z zVar, int i) {
        zVar.T(i + 8);
        return zVar.K() / zVar.K();
    }

    public static byte[] t(z zVar, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            zVar.T(i3);
            int p = zVar.p();
            if (zVar.p() == 1886547818) {
                return Arrays.copyOfRange(zVar.e(), i3, p + i3);
            }
            i3 += p;
        }
        return null;
    }

    public static Pair u(z zVar, int i, int i2) {
        Pair i3;
        int f2 = zVar.f();
        while (f2 - i < i2) {
            zVar.T(f2);
            int p = zVar.p();
            o3.s.a(p > 0, "childAtomSize must be positive");
            if (zVar.p() == 1936289382 && (i3 = i(zVar, f2, p)) != null) {
                return i3;
            }
            f2 += p;
        }
        return null;
    }

    public static t v(z zVar, int i, int i2, String str) {
        int i3;
        int i4;
        int i5 = i + 8;
        while (true) {
            byte[] bArr = null;
            if (i5 - i >= i2) {
                return null;
            }
            zVar.T(i5);
            int p = zVar.p();
            if (zVar.p() == 1952804451) {
                int c2 = I3.a.c(zVar.p());
                zVar.U(1);
                if (c2 == 0) {
                    zVar.U(1);
                    i4 = 0;
                    i3 = 0;
                } else {
                    int G = zVar.G();
                    i3 = G & 15;
                    i4 = (G & 240) >> 4;
                }
                boolean z = zVar.G() == 1;
                int G2 = zVar.G();
                byte[] bArr2 = new byte[16];
                zVar.l(bArr2, 0, 16);
                if (z && G2 == 0) {
                    int G3 = zVar.G();
                    bArr = new byte[G3];
                    zVar.l(bArr, 0, G3);
                }
                return new t(z, str, G2, bArr2, i4, i3, bArr);
            }
            i5 += p;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0429 A[EDGE_INSN: B:97:0x0429->B:98:0x0429 BREAK  A[LOOP:2: B:76:0x03c8->B:92:0x0422], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static I3.v w(I3.s r37, I3.a.a r38, o3.B r39) {
        /*
            Method dump skipped, instructions count: 1326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: I3.b.w(I3.s, I3.a$a, o3.B):I3.v");
    }

    public static d x(z zVar, int i, int i2, String str, M2.m mVar, boolean z) {
        int i3;
        zVar.T(12);
        int p = zVar.p();
        d dVar = new d(p);
        for (int i4 = 0; i4 < p; i4++) {
            int f2 = zVar.f();
            int p2 = zVar.p();
            o3.s.a(p2 > 0, "childAtomSize must be positive");
            int p3 = zVar.p();
            if (p3 == 1635148593 || p3 == 1635148595 || p3 == 1701733238 || p3 == 1831958048 || p3 == 1836070006 || p3 == 1752589105 || p3 == 1751479857 || p3 == 1932670515 || p3 == 1211250227 || p3 == 1987063864 || p3 == 1987063865 || p3 == 1635135537 || p3 == 1685479798 || p3 == 1685479729 || p3 == 1685481573 || p3 == 1685481521) {
                i3 = f2;
                E(zVar, p3, i3, p2, i, i2, mVar, dVar, i4);
            } else if (p3 == 1836069985 || p3 == 1701733217 || p3 == 1633889587 || p3 == 1700998451 || p3 == 1633889588 || p3 == 1835823201 || p3 == 1685353315 || p3 == 1685353317 || p3 == 1685353320 || p3 == 1685353324 || p3 == 1685353336 || p3 == 1935764850 || p3 == 1935767394 || p3 == 1819304813 || p3 == 1936684916 || p3 == 1953984371 || p3 == 778924082 || p3 == 778924083 || p3 == 1835557169 || p3 == 1835560241 || p3 == 1634492771 || p3 == 1634492791 || p3 == 1970037111 || p3 == 1332770163 || p3 == 1716281667) {
                i3 = f2;
                g(zVar, p3, f2, p2, i, str, z, mVar, dVar, i4);
            } else {
                if (p3 == 1414810956 || p3 == 1954034535 || p3 == 2004251764 || p3 == 1937010800 || p3 == 1664495672) {
                    y(zVar, p3, f2, p2, i, str, dVar);
                } else if (p3 == 1835365492) {
                    q(zVar, p3, f2, i, dVar);
                } else if (p3 == 1667329389) {
                    dVar.b = new q.b().Z(i).o0("application/x-camera-motion").K();
                }
                i3 = f2;
            }
            zVar.T(i3 + p2);
        }
        return dVar;
    }

    public static void y(z zVar, int i, int i2, int i3, int i4, String str, d dVar) {
        zVar.T(i2 + 16);
        String str2 = "application/ttml+xml";
        t7.r rVar = null;
        long j = Long.MAX_VALUE;
        if (i != 1414810956) {
            if (i == 1954034535) {
                int i5 = i3 - 16;
                byte[] bArr = new byte[i5];
                zVar.l(bArr, 0, i5);
                rVar = t7.r.t(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i == 1937010800) {
                j = 0;
            } else {
                if (i != 1664495672) {
                    throw new IllegalStateException();
                }
                dVar.d = 1;
                str2 = "application/x-mp4-cea-608";
            }
        }
        dVar.b = new q.b().Z(i4).o0(str2).e0(str).s0(j).b0(rVar).K();
    }

    public static g z(z zVar) {
        long j;
        zVar.T(8);
        int c2 = I3.a.c(zVar.p());
        zVar.U(c2 == 0 ? 8 : 16);
        int p = zVar.p();
        zVar.U(4);
        int f2 = zVar.f();
        int i = c2 == 0 ? 4 : 8;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            j = -9223372036854775807L;
            if (i3 >= i) {
                zVar.U(i);
                break;
            }
            if (zVar.e()[f2 + i3] != -1) {
                long I = c2 == 0 ? zVar.I() : zVar.L();
                if (I != 0) {
                    j = I;
                }
            } else {
                i3++;
            }
        }
        zVar.U(16);
        int p2 = zVar.p();
        int p3 = zVar.p();
        zVar.U(4);
        int p4 = zVar.p();
        int p5 = zVar.p();
        if (p2 == 0 && p3 == 65536 && p4 == -65536 && p5 == 0) {
            i2 = 90;
        } else if (p2 == 0 && p3 == -65536 && p4 == 65536 && p5 == 0) {
            i2 = 270;
        } else if (p2 == -65536 && p3 == 0 && p4 == 0 && p5 == -65536) {
            i2 = 180;
        }
        return new g(p, j, i2);
    }
}
