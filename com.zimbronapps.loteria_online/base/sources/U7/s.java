package U7;

import U7.F;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class s extends F.e.d.a.b.e.b {
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final int e;

    public static final class b extends F.e.d.a.b.e.b.a {
        public long a;
        public String b;
        public String c;
        public long d;
        public int e;
        public byte f;

        public F.e.d.a.b.e.b a() {
            String str;
            if (this.f == 7 && (str = this.b) != null) {
                return new s(this.a, str, this.c, this.d, this.e, null);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f & 1) == 0) {
                sb.append(" pc");
            }
            if (this.b == null) {
                sb.append(" symbol");
            }
            if ((this.f & 2) == 0) {
                sb.append(" offset");
            }
            if ((this.f & 4) == 0) {
                sb.append(" importance");
            }
            throw new IllegalStateException("Missing required properties:" + sb);
        }

        public F.e.d.a.b.e.b.a b(String str) {
            this.c = str;
            return this;
        }

        public F.e.d.a.b.e.b.a c(int i) {
            this.e = i;
            this.f = (byte) (this.f | 4);
            return this;
        }

        public F.e.d.a.b.e.b.a d(long j) {
            this.d = j;
            this.f = (byte) (this.f | 2);
            return this;
        }

        public F.e.d.a.b.e.b.a e(long j) {
            this.a = j;
            this.f = (byte) (this.f | 1);
            return this;
        }

        public F.e.d.a.b.e.b.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            this.b = str;
            return this;
        }
    }

    public /* synthetic */ s(long j, String str, String str2, long j2, int i, a aVar) {
        this(j, str, str2, j2, i);
    }

    public String b() {
        return this.c;
    }

    public int c() {
        return this.e;
    }

    public long d() {
        return this.d;
    }

    public long e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a.b.e.b)) {
            return false;
        }
        F.e.d.a.b.e.b bVar = (F.e.d.a.b.e.b) obj;
        return this.a == bVar.e() && this.b.equals(bVar.f()) && ((str = this.c) != null ? str.equals(bVar.b()) : bVar.b() == null) && this.d == bVar.d() && this.e == bVar.c();
    }

    public String f() {
        return this.b;
    }

    public int hashCode() {
        long j = this.a;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j2 = this.d;
        return ((hashCode2 ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.e;
    }

    public String toString() {
        return "Frame{pc=" + this.a + ", symbol=" + this.b + ", file=" + this.c + ", offset=" + this.d + ", importance=" + this.e + "}";
    }

    public s(long j, String str, String str2, long j2, int i) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = j2;
        this.e = i;
    }
}
