package U7;

import U7.F;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class w extends F.e.d.e {
    public final F.e.d.e.b a;
    public final String b;
    public final String c;
    public final long d;

    public static final class b extends F.e.d.e.a {
        public F.e.d.e.b a;
        public String b;
        public String c;
        public long d;
        public byte e;

        public F.e.d.e a() {
            F.e.d.e.b bVar;
            String str;
            String str2;
            if (this.e == 1 && (bVar = this.a) != null && (str = this.b) != null && (str2 = this.c) != null) {
                return new w(bVar, str, str2, this.d, null);
            }
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" rolloutVariant");
            }
            if (this.b == null) {
                sb.append(" parameterKey");
            }
            if (this.c == null) {
                sb.append(" parameterValue");
            }
            if ((1 & this.e) == 0) {
                sb.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + sb);
        }

        public F.e.d.e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.b = str;
            return this;
        }

        public F.e.d.e.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.c = str;
            return this;
        }

        public F.e.d.e.a d(F.e.d.e.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null rolloutVariant");
            }
            this.a = bVar;
            return this;
        }

        public F.e.d.e.a e(long j) {
            this.d = j;
            this.e = (byte) (this.e | 1);
            return this;
        }
    }

    public /* synthetic */ w(F.e.d.e.b bVar, String str, String str2, long j, a aVar) {
        this(bVar, str, str2, j);
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public F.e.d.e.b d() {
        return this.a;
    }

    public long e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.e)) {
            return false;
        }
        F.e.d.e eVar = (F.e.d.e) obj;
        return this.a.equals(eVar.d()) && this.b.equals(eVar.b()) && this.c.equals(eVar.c()) && this.d == eVar.e();
    }

    public int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        return hashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutVariant=" + this.a + ", parameterKey=" + this.b + ", parameterValue=" + this.c + ", templateVersion=" + this.d + "}";
    }

    public w(F.e.d.e.b bVar, String str, String str2, long j) {
        this.a = bVar;
        this.b = str;
        this.c = str2;
        this.d = j;
    }
}
