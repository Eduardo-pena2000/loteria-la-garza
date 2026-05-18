package U7;

import U7.F;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class u extends F.e.d.c {
    public final Double a;
    public final int b;
    public final boolean c;
    public final int d;
    public final long e;
    public final long f;

    public static final class b extends F.e.d.c.a {
        public Double a;
        public int b;
        public boolean c;
        public int d;
        public long e;
        public long f;
        public byte g;

        public F.e.d.c a() {
            if (this.g == 31) {
                return new u(this.a, this.b, this.c, this.d, this.e, this.f, null);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.g & 1) == 0) {
                sb.append(" batteryVelocity");
            }
            if ((this.g & 2) == 0) {
                sb.append(" proximityOn");
            }
            if ((this.g & 4) == 0) {
                sb.append(" orientation");
            }
            if ((this.g & 8) == 0) {
                sb.append(" ramUsed");
            }
            if ((this.g & 16) == 0) {
                sb.append(" diskUsed");
            }
            throw new IllegalStateException("Missing required properties:" + sb);
        }

        public F.e.d.c.a b(Double d) {
            this.a = d;
            return this;
        }

        public F.e.d.c.a c(int i) {
            this.b = i;
            this.g = (byte) (this.g | 1);
            return this;
        }

        public F.e.d.c.a d(long j) {
            this.f = j;
            this.g = (byte) (this.g | 16);
            return this;
        }

        public F.e.d.c.a e(int i) {
            this.d = i;
            this.g = (byte) (this.g | 4);
            return this;
        }

        public F.e.d.c.a f(boolean z) {
            this.c = z;
            this.g = (byte) (this.g | 2);
            return this;
        }

        public F.e.d.c.a g(long j) {
            this.e = j;
            this.g = (byte) (this.g | 8);
            return this;
        }
    }

    public /* synthetic */ u(Double d, int i, boolean z, int i2, long j, long j2, a aVar) {
        this(d, i, z, i2, j, j2);
    }

    public Double b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public long d() {
        return this.f;
    }

    public int e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.c)) {
            return false;
        }
        F.e.d.c cVar = (F.e.d.c) obj;
        Double d = this.a;
        if (d != null ? d.equals(cVar.b()) : cVar.b() == null) {
            if (this.b == cVar.c() && this.c == cVar.g() && this.d == cVar.e() && this.e == cVar.f() && this.f == cVar.d()) {
                return true;
            }
        }
        return false;
    }

    public long f() {
        return this.e;
    }

    public boolean g() {
        return this.c;
    }

    public int hashCode() {
        Double d = this.a;
        int hashCode = ((((((((d == null ? 0 : d.hashCode()) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ this.d) * 1000003;
        long j = this.e;
        long j2 = this.f;
        return ((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.a + ", batteryVelocity=" + this.b + ", proximityOn=" + this.c + ", orientation=" + this.d + ", ramUsed=" + this.e + ", diskUsed=" + this.f + "}";
    }

    public u(Double d, int i, boolean z, int i2, long j, long j2) {
        this.a = d;
        this.b = i;
        this.c = z;
        this.d = i2;
        this.e = j;
        this.f = j2;
    }
}
