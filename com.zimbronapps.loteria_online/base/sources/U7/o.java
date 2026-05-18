package U7;

import U7.F;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class o extends F.e.d.a.b.a {
    public final long a;
    public final long b;
    public final String c;
    public final String d;

    public static final class b extends F.e.d.a.b.a.a {
        public long a;
        public long b;
        public String c;
        public String d;
        public byte e;

        public F.e.d.a.b.a a() {
            String str;
            if (this.e == 3 && (str = this.c) != null) {
                return new o(this.a, this.b, str, this.d, null);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.e & 1) == 0) {
                sb.append(" baseAddress");
            }
            if ((this.e & 2) == 0) {
                sb.append(" size");
            }
            if (this.c == null) {
                sb.append(" name");
            }
            throw new IllegalStateException("Missing required properties:" + sb);
        }

        public F.e.d.a.b.a.a b(long j) {
            this.a = j;
            this.e = (byte) (this.e | 1);
            return this;
        }

        public F.e.d.a.b.a.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.c = str;
            return this;
        }

        public F.e.d.a.b.a.a d(long j) {
            this.b = j;
            this.e = (byte) (this.e | 2);
            return this;
        }

        public F.e.d.a.b.a.a e(String str) {
            this.d = str;
            return this;
        }
    }

    public /* synthetic */ o(long j, long j2, String str, String str2, a aVar) {
        this(j, j2, str, str2);
    }

    public long b() {
        return this.a;
    }

    public String c() {
        return this.c;
    }

    public long d() {
        return this.b;
    }

    public String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a.b.a)) {
            return false;
        }
        F.e.d.a.b.a aVar = (F.e.d.a.b.a) obj;
        if (this.a == aVar.b() && this.b == aVar.d() && this.c.equals(aVar.c())) {
            String str = this.d;
            if (str == null) {
                if (aVar.e() == null) {
                    return true;
                }
            } else if (str.equals(aVar.e())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str = this.d;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.a + ", size=" + this.b + ", name=" + this.c + ", uuid=" + this.d + "}";
    }

    public o(long j, long j2, String str, String str2) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
    }
}
