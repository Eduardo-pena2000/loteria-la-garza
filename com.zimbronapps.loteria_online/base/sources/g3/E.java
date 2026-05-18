package G3;

import L3.s;
import M2.h;
import M2.m;
import P2.K;
import P2.o;
import P2.z;
import android.util.Pair;
import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import o3.I;
import o3.J;
import o3.O;
import o3.P;
import o3.p;
import o3.q;
import o3.r;
import o3.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class e implements p {
    public static final u e0 = new d();
    public static final byte[] f0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] g0 = K.r0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    public static final byte[] h0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    public static final byte[] i0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
    public static final UUID j0 = new UUID(72057594037932032L, -9223371306706625679L);
    public static final Map k0;
    public boolean A;
    public long B;
    public long C;
    public long D;
    public P2.p E;
    public P2.p F;
    public boolean G;
    public boolean H;
    public int I;
    public long J;
    public long K;
    public int L;
    public int M;
    public int[] N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public long T;
    public int U;
    public int V;
    public int W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final G3.c a;
    public int a0;
    public final g b;
    public byte b0;
    public final SparseArray c;
    public boolean c0;
    public final boolean d;
    public r d0;
    public final boolean e;
    public final s.a f;
    public final z g;
    public final z h;
    public final z i;
    public final z j;
    public final z k;
    public final z l;
    public final z m;
    public final z n;
    public final z o;
    public final z p;
    public ByteBuffer q;
    public long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public c w;
    public boolean x;
    public int y;
    public long z;

    public final class b implements G3.b {
        public b() {
        }

        public void a(int i) {
            e.this.q(i);
        }

        public void b(int i, double d) {
            e.this.t(i, d);
        }

        public void c(int i, int i2, q qVar) {
            e.this.n(i, i2, qVar);
        }

        public void d(int i, long j) {
            e.this.z(i, j);
        }

        public int e(int i) {
            return e.this.w(i);
        }

        public boolean f(int i) {
            return e.this.B(i);
        }

        public void g(int i, String str) {
            e.this.J(i, str);
        }

        public void h(int i, long j, long j2) {
            e.this.I(i, j, j2);
        }

        public /* synthetic */ b(e eVar, a aVar) {
            this();
        }
    }

    public static final class c {
        public byte[] O;
        public P U;
        public boolean V;
        public O Y;
        public int Z;
        public String a;
        public String b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public boolean h;
        public byte[] i;
        public O.a j;
        public byte[] k;
        public m l;
        public int m = -1;
        public int n = -1;
        public int o = -1;
        public int p = -1;
        public int q = -1;
        public int r = 0;
        public int s = -1;
        public float t = 0.0f;
        public float u = 0.0f;
        public float v = 0.0f;
        public byte[] w = null;
        public int x = -1;
        public boolean y = false;
        public int z = -1;
        public int A = -1;
        public int B = -1;
        public int C = 1000;
        public int D = 200;
        public float E = -1.0f;
        public float F = -1.0f;
        public float G = -1.0f;
        public float H = -1.0f;
        public float I = -1.0f;
        public float J = -1.0f;
        public float K = -1.0f;
        public float L = -1.0f;
        public float M = -1.0f;
        public float N = -1.0f;
        public int P = 1;
        public int Q = -1;
        public int R = 8000;
        public long S = 0;
        public long T = 0;
        public boolean W = true;
        public String X = "eng";

        public static /* synthetic */ void a(c cVar) {
            cVar.f();
        }

        public static /* synthetic */ int b(c cVar) {
            return cVar.g;
        }

        public static /* synthetic */ int c(c cVar, int i) {
            cVar.g = i;
            return i;
        }

        public static /* synthetic */ String d(c cVar, String str) {
            cVar.X = str;
            return str;
        }

        public static /* synthetic */ boolean e(c cVar, boolean z) {
            return cVar.o(z);
        }

        public static Pair k(z zVar) {
            try {
                zVar.U(16);
                long w = zVar.w();
                if (w == 1482049860) {
                    return new Pair("video/divx", (Object) null);
                }
                if (w == 859189832) {
                    return new Pair("video/3gpp", (Object) null);
                }
                if (w != 826496599) {
                    o.h("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                    return new Pair("video/x-unknown", (Object) null);
                }
                byte[] e = zVar.e();
                for (int f = zVar.f() + 20; f < e.length - 4; f++) {
                    if (e[f] == 0 && e[f + 1] == 0 && e[f + 2] == 1 && e[f + 3] == 15) {
                        return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(e, f, e.length)));
                    }
                }
                throw M2.z.a("Failed to find FourCC VC1 initialization data", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw M2.z.a("Error parsing FourCC private data", null);
            }
        }

        public static boolean l(z zVar) {
            try {
                int y = zVar.y();
                if (y == 1) {
                    return true;
                }
                if (y != 65534) {
                    return false;
                }
                zVar.T(24);
                if (zVar.z() == e.i().getMostSignificantBits()) {
                    if (zVar.z() == e.i().getLeastSignificantBits()) {
                        return true;
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw M2.z.a("Error parsing MS/ACM codec private", null);
            }
        }

        public static List m(byte[] bArr) {
            int i;
            int i2;
            try {
                if (bArr[0] != 2) {
                    throw M2.z.a("Error parsing vorbis codec private", null);
                }
                int i3 = 0;
                int i4 = 1;
                while (true) {
                    i = bArr[i4];
                    if ((i & 255) != 255) {
                        break;
                    }
                    i3 += 255;
                    i4++;
                }
                int i5 = i4 + 1;
                int i6 = i3 + (i & 255);
                int i7 = 0;
                while (true) {
                    i2 = bArr[i5];
                    if ((i2 & 255) != 255) {
                        break;
                    }
                    i7 += 255;
                    i5++;
                }
                int i8 = i5 + 1;
                int i9 = i7 + (i2 & 255);
                if (bArr[i8] != 1) {
                    throw M2.z.a("Error parsing vorbis codec private", null);
                }
                byte[] bArr2 = new byte[i6];
                System.arraycopy(bArr, i8, bArr2, 0, i6);
                int i10 = i8 + i6;
                if (bArr[i10] != 3) {
                    throw M2.z.a("Error parsing vorbis codec private", null);
                }
                int i11 = i10 + i9;
                if (bArr[i11] != 5) {
                    throw M2.z.a("Error parsing vorbis codec private", null);
                }
                byte[] bArr3 = new byte[bArr.length - i11];
                System.arraycopy(bArr, i11, bArr3, 0, bArr.length - i11);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw M2.z.a("Error parsing vorbis codec private", null);
            }
        }

        public final void f() {
            P2.a.e(this.Y);
        }

        public final byte[] g(String str) {
            byte[] bArr = this.k;
            if (bArr != null) {
                return bArr;
            }
            throw M2.z.a("Missing CodecPrivate for codec " + str, null);
        }

        public final byte[] h() {
            if (this.E == -1.0f || this.F == -1.0f || this.G == -1.0f || this.H == -1.0f || this.I == -1.0f || this.J == -1.0f || this.K == -1.0f || this.L == -1.0f || this.M == -1.0f || this.N == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            order.put((byte) 0);
            order.putShort((short) ((this.E * 50000.0f) + 0.5f));
            order.putShort((short) ((this.F * 50000.0f) + 0.5f));
            order.putShort((short) ((this.G * 50000.0f) + 0.5f));
            order.putShort((short) ((this.H * 50000.0f) + 0.5f));
            order.putShort((short) ((this.I * 50000.0f) + 0.5f));
            order.putShort((short) ((this.J * 50000.0f) + 0.5f));
            order.putShort((short) ((this.K * 50000.0f) + 0.5f));
            order.putShort((short) ((this.L * 50000.0f) + 0.5f));
            order.putShort((short) (this.M + 0.5f));
            order.putShort((short) (this.N + 0.5f));
            order.putShort((short) this.C);
            order.putShort((short) this.D);
            return bArr;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:12:0x043f  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0458  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0467  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x05a4  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0479  */
        /* JADX WARN: Removed duplicated region for block: B:3:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x054d  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x045a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void i(o3.r r20, int r21) {
            /*
                Method dump skipped, instructions count: 1722
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: G3.e.c.i(o3.r, int):void");
        }

        public void j() {
            P p = this.U;
            if (p != null) {
                p.a(this.Y, this.j);
            }
        }

        public void n() {
            P p = this.U;
            if (p != null) {
                p.b();
            }
        }

        public final boolean o(boolean z) {
            return "A_OPUS".equals(this.b) ? z : this.f > 0;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        k0 = Collections.unmodifiableMap(hashMap);
    }

    public e(s.a aVar, int i) {
        this(new G3.a(), i, aVar);
    }

    public static boolean A(String str) {
        str.hashCode();
        switch (str) {
            case "V_MPEG4/ISO/AP":
            case "V_MPEG4/ISO/SP":
            case "A_MS/ACM":
            case "A_TRUEHD":
            case "A_VORBIS":
            case "A_MPEG/L2":
            case "A_MPEG/L3":
            case "V_MS/VFW/FOURCC":
            case "S_DVBSUB":
            case "V_MPEG4/ISO/ASP":
            case "V_MPEG4/ISO/AVC":
            case "S_VOBSUB":
            case "A_DTS/LOSSLESS":
            case "A_AAC":
            case "A_AC3":
            case "A_DTS":
            case "V_AV1":
            case "V_VP8":
            case "V_VP9":
            case "S_HDMV/PGS":
            case "V_THEORA":
            case "A_DTS/EXPRESS":
            case "A_PCM/FLOAT/IEEE":
            case "A_PCM/INT/BIG":
            case "A_PCM/INT/LIT":
            case "S_TEXT/ASS":
            case "V_MPEGH/ISO/HEVC":
            case "S_TEXT/WEBVTT":
            case "S_TEXT/UTF8":
            case "V_MPEG2":
            case "A_EAC3":
            case "A_FLAC":
            case "A_OPUS":
                return true;
            default:
                return false;
        }
    }

    private static /* synthetic */ p[] C() {
        return new p[]{new e(s.a.a, 2)};
    }

    public static void H(String str, long j, byte[] bArr) {
        byte[] u;
        int i;
        str.hashCode();
        switch (str) {
            case "S_TEXT/ASS":
                u = u(j, "%01d:%02d:%02d:%02d", 10000L);
                i = 21;
                break;
            case "S_TEXT/WEBVTT":
                u = u(j, "%02d:%02d:%02d.%03d", 1000L);
                i = 25;
                break;
            case "S_TEXT/UTF8":
                u = u(j, "%02d:%02d:%02d,%03d", 1000L);
                i = 19;
                break;
            default:
                throw new IllegalArgumentException();
        }
        System.arraycopy(u, 0, bArr, i, u.length);
    }

    public static /* synthetic */ p[] c() {
        return C();
    }

    public static /* synthetic */ byte[] f() {
        return g0;
    }

    public static /* synthetic */ Map h() {
        return k0;
    }

    public static /* synthetic */ UUID i() {
        return j0;
    }

    private void m() {
        P2.a.h(this.d0);
    }

    public static int[] r(int[] iArr, int i) {
        return iArr == null ? new int[i] : iArr.length >= i ? iArr : new int[Math.max(iArr.length * 2, i)];
    }

    public static byte[] u(long j, String str, long j2) {
        P2.a.a(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        return K.r0(String.format(Locale.US, str, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2))}));
    }

    public boolean B(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    public final boolean D(I i, long j) {
        if (this.A) {
            this.C = j;
            i.a = this.B;
            this.A = false;
            return true;
        }
        if (this.x) {
            long j2 = this.C;
            if (j2 != -1) {
                i.a = j2;
                this.C = -1L;
                return true;
            }
        }
        return false;
    }

    public final void E(q qVar, int i) {
        if (this.i.g() >= i) {
            return;
        }
        if (this.i.b() < i) {
            z zVar = this.i;
            zVar.c(Math.max(zVar.b() * 2, i));
        }
        qVar.readFully(this.i.e(), this.i.g(), i - this.i.g());
        this.i.S(i);
    }

    public final void F() {
        this.U = 0;
        this.V = 0;
        this.W = 0;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.a0 = 0;
        this.b0 = (byte) 0;
        this.c0 = false;
        this.l.P(0);
    }

    public final long G(long j) {
        long j2 = this.t;
        if (j2 != -9223372036854775807L) {
            return K.X0(j, j2, 1000L);
        }
        throw M2.z.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    public void I(int i, long j, long j2) {
        m();
        if (i == 160) {
            this.S = false;
            this.T = 0L;
            return;
        }
        if (i == 174) {
            this.w = new c();
            return;
        }
        if (i == 187) {
            this.G = false;
            return;
        }
        if (i == 19899) {
            this.y = -1;
            this.z = -1L;
            return;
        }
        if (i == 20533) {
            v(i).h = true;
            return;
        }
        if (i == 21968) {
            v(i).y = true;
            return;
        }
        if (i == 408125543) {
            long j3 = this.s;
            if (j3 != -1 && j3 != j) {
                throw M2.z.a("Multiple Segment elements not supported", null);
            }
            this.s = j;
            this.r = j2;
            return;
        }
        if (i == 475249515) {
            this.E = new P2.p();
            this.F = new P2.p();
        } else if (i == 524531317 && !this.x) {
            if (this.d && this.B != -1) {
                this.A = true;
            } else {
                this.d0.n(new J.b(this.v));
                this.x = true;
            }
        }
    }

    public void J(int i, String str) {
        if (i == 134) {
            v(i).b = str;
            return;
        }
        if (i != 17026) {
            if (i == 21358) {
                v(i).a = str;
                return;
            } else {
                if (i != 2274716) {
                    return;
                }
                c.d(v(i), str);
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            return;
        }
        throw M2.z.a("DocType " + str + " not supported", null);
    }

    public final int K(q qVar, c cVar, int i, boolean z) {
        int i2;
        if ("S_TEXT/UTF8".equals(cVar.b)) {
            L(qVar, f0, i);
            return s();
        }
        if ("S_TEXT/ASS".equals(cVar.b)) {
            L(qVar, h0, i);
            return s();
        }
        if ("S_TEXT/WEBVTT".equals(cVar.b)) {
            L(qVar, i0, i);
            return s();
        }
        O o = cVar.Y;
        if (!this.X) {
            if (cVar.h) {
                this.Q &= -1073741825;
                if (!this.Y) {
                    qVar.readFully(this.i.e(), 0, 1);
                    this.U++;
                    if ((this.i.e()[0] & 128) == 128) {
                        throw M2.z.a("Extension bit is set in signal byte", null);
                    }
                    this.b0 = this.i.e()[0];
                    this.Y = true;
                }
                byte b2 = this.b0;
                if ((b2 & 1) == 1) {
                    boolean z2 = (b2 & 2) == 2;
                    this.Q |= 1073741824;
                    if (!this.c0) {
                        qVar.readFully(this.n.e(), 0, 8);
                        this.U += 8;
                        this.c0 = true;
                        this.i.e()[0] = (byte) ((z2 ? 128 : 0) | 8);
                        this.i.T(0);
                        o.d(this.i, 1, 1);
                        this.V++;
                        this.n.T(0);
                        o.d(this.n, 8, 1);
                        this.V += 8;
                    }
                    if (z2) {
                        if (!this.Z) {
                            qVar.readFully(this.i.e(), 0, 1);
                            this.U++;
                            this.i.T(0);
                            this.a0 = this.i.G();
                            this.Z = true;
                        }
                        int i3 = this.a0 * 4;
                        this.i.P(i3);
                        qVar.readFully(this.i.e(), 0, i3);
                        this.U += i3;
                        short s = (short) ((this.a0 / 2) + 1);
                        int i4 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.q;
                        if (byteBuffer == null || byteBuffer.capacity() < i4) {
                            this.q = ByteBuffer.allocate(i4);
                        }
                        this.q.position(0);
                        this.q.putShort(s);
                        int i5 = 0;
                        int i6 = 0;
                        while (true) {
                            i2 = this.a0;
                            if (i5 >= i2) {
                                break;
                            }
                            int K = this.i.K();
                            if (i5 % 2 == 0) {
                                this.q.putShort((short) (K - i6));
                            } else {
                                this.q.putInt(K - i6);
                            }
                            i5++;
                            i6 = K;
                        }
                        int i7 = (i - this.U) - i6;
                        if (i2 % 2 == 1) {
                            this.q.putInt(i7);
                        } else {
                            this.q.putShort((short) i7);
                            this.q.putInt(0);
                        }
                        this.o.R(this.q.array(), i4);
                        o.d(this.o, i4, 1);
                        this.V += i4;
                    }
                }
            } else {
                byte[] bArr = cVar.i;
                if (bArr != null) {
                    this.l.R(bArr, bArr.length);
                }
            }
            if (c.e(cVar, z)) {
                this.Q |= 268435456;
                this.p.P(0);
                int g = (this.l.g() + i) - this.U;
                this.i.P(4);
                this.i.e()[0] = (byte) ((g >> 24) & 255);
                this.i.e()[1] = (byte) ((g >> 16) & 255);
                this.i.e()[2] = (byte) ((g >> 8) & 255);
                this.i.e()[3] = (byte) (g & 255);
                o.d(this.i, 4, 2);
                this.V += 4;
            }
            this.X = true;
        }
        int g2 = i + this.l.g();
        if (!"V_MPEG4/ISO/AVC".equals(cVar.b) && !"V_MPEGH/ISO/HEVC".equals(cVar.b)) {
            if (cVar.U != null) {
                P2.a.f(this.l.g() == 0);
                cVar.U.d(qVar);
            }
            while (true) {
                int i8 = this.U;
                if (i8 >= g2) {
                    break;
                }
                int M = M(qVar, o, g2 - i8);
                this.U += M;
                this.V += M;
            }
        } else {
            byte[] e = this.h.e();
            e[0] = 0;
            e[1] = 0;
            e[2] = 0;
            int i9 = cVar.Z;
            int i10 = 4 - i9;
            while (this.U < g2) {
                int i11 = this.W;
                if (i11 == 0) {
                    N(qVar, e, i10, i9);
                    this.U += i9;
                    this.h.T(0);
                    this.W = this.h.K();
                    this.g.T(0);
                    o.f(this.g, 4);
                    this.V += 4;
                } else {
                    int M2 = M(qVar, o, i11);
                    this.U += M2;
                    this.V += M2;
                    this.W -= M2;
                }
            }
        }
        if ("A_VORBIS".equals(cVar.b)) {
            this.j.T(0);
            o.f(this.j, 4);
            this.V += 4;
        }
        return s();
    }

    public final void L(q qVar, byte[] bArr, int i) {
        int length = bArr.length + i;
        if (this.m.b() < length) {
            this.m.Q(Arrays.copyOf(bArr, length + i));
        } else {
            System.arraycopy(bArr, 0, this.m.e(), 0, bArr.length);
        }
        qVar.readFully(this.m.e(), bArr.length, i);
        this.m.T(0);
        this.m.S(length);
    }

    public final int M(q qVar, O o, int i) {
        int a2 = this.l.a();
        if (a2 <= 0) {
            return o.c(qVar, i, false);
        }
        int min = Math.min(i, a2);
        o.f(this.l, min);
        return min;
    }

    public final void N(q qVar, byte[] bArr, int i, int i2) {
        int min = Math.min(i2, this.l.a());
        qVar.readFully(bArr, i + min, i2 - min);
        if (min > 0) {
            this.l.l(bArr, i, min);
        }
    }

    public void a(long j, long j2) {
        this.D = -9223372036854775807L;
        this.I = 0;
        this.a.reset();
        this.b.e();
        F();
        for (int i = 0; i < this.c.size(); i++) {
            ((c) this.c.valueAt(i)).n();
        }
    }

    public final void b(r rVar) {
        this.d0 = rVar;
        if (this.e) {
            rVar = new L3.u(rVar, this.f);
        }
        this.d0 = rVar;
    }

    public final boolean d(q qVar) {
        return new f().b(qVar);
    }

    public final int e(q qVar, I i) {
        this.H = false;
        boolean z = true;
        while (z && !this.H) {
            z = this.a.a(qVar);
            if (z && D(i, qVar.b())) {
                return 1;
            }
        }
        if (z) {
            return 0;
        }
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            c cVar = (c) this.c.valueAt(i2);
            c.a(cVar);
            cVar.j();
        }
        return -1;
    }

    public final void k(int i) {
        if (this.E == null || this.F == null) {
            throw M2.z.a("Element " + i + " must be in a Cues", null);
        }
    }

    public final void l(int i) {
        if (this.w != null) {
            return;
        }
        throw M2.z.a("Element " + i + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0231, code lost:
    
        throw M2.z.a("EBML lacing sample size out of range.", null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void n(int r22, int r23, o3.q r24) {
        /*
            Method dump skipped, instructions count: 749
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: G3.e.n(int, int, o3.q):void");
    }

    public final J o(P2.p pVar, P2.p pVar2) {
        int i;
        if (this.s == -1 || this.v == -9223372036854775807L || pVar == null || pVar.c() == 0 || pVar2 == null || pVar2.c() != pVar.c()) {
            return new J.b(this.v);
        }
        int c2 = pVar.c();
        int[] iArr = new int[c2];
        long[] jArr = new long[c2];
        long[] jArr2 = new long[c2];
        long[] jArr3 = new long[c2];
        int i2 = 0;
        for (int i3 = 0; i3 < c2; i3++) {
            jArr3[i3] = pVar.b(i3);
            jArr[i3] = this.s + pVar2.b(i3);
        }
        while (true) {
            i = c2 - 1;
            if (i2 >= i) {
                break;
            }
            int i4 = i2 + 1;
            iArr[i2] = (int) (jArr[i4] - jArr[i2]);
            jArr2[i2] = jArr3[i4] - jArr3[i2];
            i2 = i4;
        }
        iArr[i] = (int) ((this.s + this.r) - jArr[i]);
        long j = this.v - jArr3[i];
        jArr2[i] = j;
        if (j <= 0) {
            o.h("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j);
            iArr = Arrays.copyOf(iArr, i);
            jArr = Arrays.copyOf(jArr, i);
            jArr2 = Arrays.copyOf(jArr2, i);
            jArr3 = Arrays.copyOf(jArr3, i);
        }
        return new o3.g(iArr, jArr, jArr2, jArr3);
    }

    public final void p(c cVar, long j, int i, int i2, int i3) {
        P p = cVar.U;
        if (p != null) {
            p.c(cVar.Y, j, i, i2, i3, cVar.j);
        } else {
            if ("S_TEXT/UTF8".equals(cVar.b) || "S_TEXT/ASS".equals(cVar.b) || "S_TEXT/WEBVTT".equals(cVar.b)) {
                if (this.M > 1) {
                    o.h("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.K;
                    if (j2 == -9223372036854775807L) {
                        o.h("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        H(cVar.b, j2, this.m.e());
                        int f = this.m.f();
                        while (true) {
                            if (f >= this.m.g()) {
                                break;
                            }
                            if (this.m.e()[f] == 0) {
                                this.m.S(f);
                                break;
                            }
                            f++;
                        }
                        O o = cVar.Y;
                        z zVar = this.m;
                        o.f(zVar, zVar.g());
                        i2 += this.m.g();
                    }
                }
            }
            if ((268435456 & i) != 0) {
                if (this.M > 1) {
                    this.p.P(0);
                } else {
                    int g = this.p.g();
                    cVar.Y.d(this.p, g, 2);
                    i2 += g;
                }
            }
            cVar.Y.a(j, i, i2, i3, cVar.j);
        }
        this.H = true;
    }

    public void q(int i) {
        m();
        if (i == 160) {
            if (this.I != 2) {
                return;
            }
            c cVar = (c) this.c.get(this.O);
            c.a(cVar);
            if (this.T > 0 && "A_OPUS".equals(cVar.b)) {
                this.p.Q(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.T).array());
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.M; i3++) {
                i2 += this.N[i3];
            }
            int i4 = 0;
            while (i4 < this.M) {
                long j = this.J + ((cVar.e * i4) / 1000);
                int i5 = this.Q;
                if (i4 == 0 && !this.S) {
                    i5 |= 1;
                }
                int i6 = this.N[i4];
                int i7 = i2 - i6;
                p(cVar, j, i5, i6, i7);
                i4++;
                i2 = i7;
            }
            this.I = 0;
            return;
        }
        if (i == 174) {
            c cVar2 = (c) P2.a.h(this.w);
            String str = cVar2.b;
            if (str == null) {
                throw M2.z.a("CodecId is missing in TrackEntry element", null);
            }
            if (A(str)) {
                cVar2.i(this.d0, cVar2.c);
                this.c.put(cVar2.c, cVar2);
            }
            this.w = null;
            return;
        }
        if (i == 19899) {
            int i8 = this.y;
            if (i8 != -1) {
                long j2 = this.z;
                if (j2 != -1) {
                    if (i8 == 475249515) {
                        this.B = j2;
                        return;
                    }
                    return;
                }
            }
            throw M2.z.a("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i == 25152) {
            l(i);
            c cVar3 = this.w;
            if (cVar3.h) {
                if (cVar3.j == null) {
                    throw M2.z.a("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                cVar3.l = new m(new m.b(M2.g.a, "video/webm", this.w.j.b));
                return;
            }
            return;
        }
        if (i == 28032) {
            l(i);
            c cVar4 = this.w;
            if (cVar4.h && cVar4.i != null) {
                throw M2.z.a("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i == 357149030) {
            if (this.t == -9223372036854775807L) {
                this.t = 1000000L;
            }
            long j3 = this.u;
            if (j3 != -9223372036854775807L) {
                this.v = G(j3);
                return;
            }
            return;
        }
        if (i == 374648427) {
            if (this.c.size() == 0) {
                throw M2.z.a("No valid tracks were found", null);
            }
            this.d0.s();
        } else {
            if (i != 475249515) {
                return;
            }
            if (!this.x) {
                this.d0.n(o(this.E, this.F));
                this.x = true;
            }
            this.E = null;
            this.F = null;
        }
    }

    public final int s() {
        int i = this.V;
        F();
        return i;
    }

    public void t(int i, double d) {
        if (i == 181) {
            v(i).R = (int) d;
        }
        if (i == 17545) {
            this.u = (long) d;
            return;
        }
        switch (i) {
            case 21969:
                v(i).E = (float) d;
                break;
            case 21970:
                v(i).F = (float) d;
                break;
            case 21971:
                v(i).G = (float) d;
                break;
            case 21972:
                v(i).H = (float) d;
                break;
            case 21973:
                v(i).I = (float) d;
                break;
            case 21974:
                v(i).J = (float) d;
                break;
            case 21975:
                v(i).K = (float) d;
                break;
            case 21976:
                v(i).L = (float) d;
                break;
            case 21977:
                v(i).M = (float) d;
                break;
            case 21978:
                v(i).N = (float) d;
                break;
            default:
                switch (i) {
                    case 30323:
                        v(i).t = (float) d;
                        break;
                    case 30324:
                        v(i).u = (float) d;
                        break;
                    case 30325:
                        v(i).v = (float) d;
                        break;
                }
        }
    }

    public c v(int i) {
        l(i);
        return this.w;
    }

    public int w(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21938:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    public void x(c cVar, q qVar, int i) {
        if (c.b(cVar) != 1685485123 && c.b(cVar) != 1685480259) {
            qVar.m(i);
            return;
        }
        byte[] bArr = new byte[i];
        cVar.O = bArr;
        qVar.readFully(bArr, 0, i);
    }

    public void y(c cVar, int i, q qVar, int i2) {
        if (i != 4 || !"V_VP9".equals(cVar.b)) {
            qVar.m(i2);
        } else {
            this.p.P(i2);
            qVar.readFully(this.p.e(), 0, i2);
        }
    }

    public void z(int i, long j) {
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw M2.z.a("ContentEncodingOrder " + j + " not supported", null);
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw M2.z.a("ContentEncodingScope " + j + " not supported", null);
        }
        switch (i) {
            case 131:
                v(i).d = (int) j;
                return;
            case 136:
                v(i).W = j == 1;
                return;
            case 155:
                this.K = G(j);
                return;
            case 159:
                v(i).P = (int) j;
                return;
            case 176:
                v(i).m = (int) j;
                return;
            case 179:
                k(i);
                this.E.a(G(j));
                return;
            case 186:
                v(i).n = (int) j;
                return;
            case 215:
                v(i).c = (int) j;
                return;
            case 231:
                this.D = G(j);
                return;
            case 238:
                this.R = (int) j;
                return;
            case 241:
                if (this.G) {
                    return;
                }
                k(i);
                this.F.a(j);
                this.G = true;
                return;
            case 251:
                this.S = true;
                return;
            case 16871:
                c.c(v(i), (int) j);
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw M2.z.a("ContentCompAlgo " + j + " not supported", null);
            case 17029:
                if (j < 1 || j > 2) {
                    throw M2.z.a("DocTypeReadVersion " + j + " not supported", null);
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw M2.z.a("EBMLReadVersion " + j + " not supported", null);
            case 18401:
                if (j == 5) {
                    return;
                }
                throw M2.z.a("ContentEncAlgo " + j + " not supported", null);
            case 18408:
                if (j == 1) {
                    return;
                }
                throw M2.z.a("AESSettingsCipherMode " + j + " not supported", null);
            case 21420:
                this.z = j + this.s;
                return;
            case 21432:
                int i2 = (int) j;
                l(i);
                if (i2 == 0) {
                    this.w.x = 0;
                    return;
                }
                if (i2 == 1) {
                    this.w.x = 2;
                    return;
                } else if (i2 == 3) {
                    this.w.x = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    this.w.x = 3;
                    return;
                }
            case 21680:
                v(i).p = (int) j;
                return;
            case 21682:
                v(i).r = (int) j;
                return;
            case 21690:
                v(i).q = (int) j;
                return;
            case 21930:
                v(i).V = j == 1;
                return;
            case 21938:
                l(i);
                c cVar = this.w;
                cVar.y = true;
                cVar.o = (int) j;
                return;
            case 21998:
                v(i).f = (int) j;
                return;
            case 22186:
                v(i).S = j;
                return;
            case 22203:
                v(i).T = j;
                return;
            case 25188:
                v(i).Q = (int) j;
                return;
            case 30114:
                this.T = j;
                return;
            case 30321:
                l(i);
                int i3 = (int) j;
                if (i3 == 0) {
                    this.w.s = 0;
                    return;
                }
                if (i3 == 1) {
                    this.w.s = 1;
                    return;
                } else if (i3 == 2) {
                    this.w.s = 2;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    this.w.s = 3;
                    return;
                }
            case 2352003:
                v(i).e = (int) j;
                return;
            case 2807729:
                this.t = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        l(i);
                        int i4 = (int) j;
                        if (i4 == 1) {
                            this.w.B = 2;
                            return;
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            this.w.B = 1;
                            return;
                        }
                    case 21946:
                        l(i);
                        int k = h.k((int) j);
                        if (k != -1) {
                            this.w.A = k;
                            return;
                        }
                        return;
                    case 21947:
                        l(i);
                        this.w.y = true;
                        int j2 = h.j((int) j);
                        if (j2 != -1) {
                            this.w.z = j2;
                            return;
                        }
                        return;
                    case 21948:
                        v(i).C = (int) j;
                        return;
                    case 21949:
                        v(i).D = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    public e(G3.c cVar, int i, s.a aVar) {
        this.s = -1L;
        this.t = -9223372036854775807L;
        this.u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.B = -1L;
        this.C = -1L;
        this.D = -9223372036854775807L;
        this.a = cVar;
        cVar.b(new b(this, null));
        this.f = aVar;
        this.d = (i & 1) == 0;
        this.e = (i & 2) == 0;
        this.b = new g();
        this.c = new SparseArray();
        this.i = new z(4);
        this.j = new z(ByteBuffer.allocate(4).putInt(-1).array());
        this.k = new z(4);
        this.g = new z(Q2.d.a);
        this.h = new z(4);
        this.l = new z();
        this.m = new z();
        this.n = new z(8);
        this.o = new z();
        this.p = new z();
        this.N = new int[1];
    }

    public final void release() {
    }
}
