package U7;

import U7.F;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class q extends F.e.d.a.b.d {
    public final String a;
    public final String b;
    public final long c;

    public static final class b extends F.e.d.a.b.d.a {
        public String a;
        public String b;
        public long c;
        public byte d;

        public F.e.d.a.b.d a() {
            String str;
            String str2;
            if (this.d == 1 && (str = this.a) != null && (str2 = this.b) != null) {
                return new q(str, str2, this.c, null);
            }
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" name");
            }
            if (this.b == null) {
                sb.append(" code");
            }
            if ((1 & this.d) == 0) {
                sb.append(" address");
            }
            throw new IllegalStateException("Missing required properties:" + sb);
        }

        public F.e.d.a.b.d.a b(long j) {
            this.c = j;
            this.d = (byte) (this.d | 1);
            return this;
        }

        public F.e.d.a.b.d.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null code");
            }
            this.b = str;
            return this;
        }

        public F.e.d.a.b.d.a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.a = str;
            return this;
        }
    }

    public /* synthetic */ q(String str, String str2, long j, a aVar) {
        this(str, str2, j);
    }

    public long b() {
        return this.c;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a.b.d)) {
            return false;
        }
        F.e.d.a.b.d dVar = (F.e.d.a.b.d) obj;
        return this.a.equals(dVar.d()) && this.b.equals(dVar.c()) && this.c == dVar.b();
    }

    public int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        long j = this.c;
        return hashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.a + ", code=" + this.b + ", address=" + this.c + "}";
    }

    public q(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }
}
