package M2;

import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class h {
    public static final h h = new b().d(1).c(2).e(3).a();
    public static final h i = new b().d(1).c(1).e(2).a();
    public static final String j = P2.K.w0(0);
    public static final String k = P2.K.w0(1);
    public static final String l = P2.K.w0(2);
    public static final String m = P2.K.w0(3);
    public static final String n = P2.K.w0(4);
    public static final String o = P2.K.w0(5);
    public final int a;
    public final int b;
    public final int c;
    public final byte[] d;
    public final int e;
    public final int f;
    public int g;

    public static final class b {
        public int a;
        public int b;
        public int c;
        public byte[] d;
        public int e;
        public int f;

        public /* synthetic */ b(h hVar, a aVar) {
            this(hVar);
        }

        public h a() {
            return new h(this.a, this.b, this.c, this.d, this.e, this.f, null);
        }

        public b b(int i) {
            this.f = i;
            return this;
        }

        public b c(int i) {
            this.b = i;
            return this;
        }

        public b d(int i) {
            this.a = i;
            return this;
        }

        public b e(int i) {
            this.c = i;
            return this;
        }

        public b f(byte[] bArr) {
            this.d = bArr;
            return this;
        }

        public b g(int i) {
            this.e = i;
            return this;
        }

        public b() {
            this.a = -1;
            this.b = -1;
            this.c = -1;
            this.e = -1;
            this.f = -1;
        }

        public b(h hVar) {
            this.a = hVar.a;
            this.b = hVar.b;
            this.c = hVar.c;
            this.d = hVar.d;
            this.e = hVar.e;
            this.f = hVar.f;
        }
    }

    public /* synthetic */ h(int i2, int i3, int i4, byte[] bArr, int i5, int i6, a aVar) {
        this(i2, i3, i4, bArr, i5, i6);
    }

    public static String b(int i2) {
        if (i2 == -1) {
            return "NA";
        }
        return i2 + "bit Chroma";
    }

    public static String c(int i2) {
        if (i2 == -1) {
            return "Unset color range";
        }
        if (i2 == 1) {
            return "Full range";
        }
        if (i2 == 2) {
            return "Limited range";
        }
        return "Undefined color range " + i2;
    }

    public static String d(int i2) {
        if (i2 == -1) {
            return "Unset color space";
        }
        if (i2 == 6) {
            return "BT2020";
        }
        if (i2 == 1) {
            return "BT709";
        }
        if (i2 == 2) {
            return "BT601";
        }
        return "Undefined color space " + i2;
    }

    public static String e(int i2) {
        if (i2 == -1) {
            return "Unset color transfer";
        }
        if (i2 == 10) {
            return "Gamma 2.2";
        }
        if (i2 == 1) {
            return "Linear";
        }
        if (i2 == 2) {
            return "sRGB";
        }
        if (i2 == 3) {
            return "SDR SMPTE 170M";
        }
        if (i2 == 6) {
            return "ST2084 PQ";
        }
        if (i2 == 7) {
            return "HLG";
        }
        return "Undefined color transfer " + i2;
    }

    public static boolean h(h hVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (hVar == null) {
            return true;
        }
        int i6 = hVar.a;
        return (i6 == -1 || i6 == 1 || i6 == 2) && ((i2 = hVar.b) == -1 || i2 == 2) && (((i3 = hVar.c) == -1 || i3 == 3) && hVar.d == null && (((i4 = hVar.f) == -1 || i4 == 8) && ((i5 = hVar.e) == -1 || i5 == 8)));
    }

    public static int j(int i2) {
        if (i2 == 1) {
            return 1;
        }
        if (i2 != 9) {
            return (i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int k(int i2) {
        if (i2 == 1) {
            return 3;
        }
        if (i2 == 4) {
            return 10;
        }
        if (i2 == 13) {
            return 2;
        }
        if (i2 == 16) {
            return 6;
        }
        if (i2 != 18) {
            return (i2 == 6 || i2 == 7) ? 3 : -1;
        }
        return 7;
    }

    public static String l(int i2) {
        if (i2 == -1) {
            return "NA";
        }
        return i2 + "bit Luma";
    }

    public b a() {
        return new b(this, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return this.a == hVar.a && this.b == hVar.b && this.c == hVar.c && Arrays.equals(this.d, hVar.d) && this.e == hVar.e && this.f == hVar.f;
    }

    public boolean f() {
        return (this.e == -1 || this.f == -1) ? false : true;
    }

    public boolean g() {
        return (this.a == -1 || this.b == -1 || this.c == -1) ? false : true;
    }

    public int hashCode() {
        if (this.g == 0) {
            this.g = ((((((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31) + Arrays.hashCode(this.d)) * 31) + this.e) * 31) + this.f;
        }
        return this.g;
    }

    public boolean i() {
        return f() || g();
    }

    public String m() {
        String str;
        String G = g() ? P2.K.G("%s/%s/%s", d(this.a), c(this.b), e(this.c)) : "NA/NA/NA";
        if (f()) {
            str = this.e + "/" + this.f;
        } else {
            str = "NA/NA";
        }
        return G + "/" + str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColorInfo(");
        sb.append(d(this.a));
        sb.append(", ");
        sb.append(c(this.b));
        sb.append(", ");
        sb.append(e(this.c));
        sb.append(", ");
        sb.append(this.d != null);
        sb.append(", ");
        sb.append(l(this.e));
        sb.append(", ");
        sb.append(b(this.f));
        sb.append(")");
        return sb.toString();
    }

    public h(int i2, int i3, int i4, byte[] bArr, int i5, int i6) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = bArr;
        this.e = i5;
        this.f = i6;
    }
}
