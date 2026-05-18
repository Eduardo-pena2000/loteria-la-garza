package U7;

import U7.F;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class e extends F.c {
    public final String a;
    public final String b;

    public static final class b extends F.c.a {
        public String a;
        public String b;

        public F.c a() {
            String str;
            String str2 = this.a;
            if (str2 != null && (str = this.b) != null) {
                return new e(str2, str, null);
            }
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" key");
            }
            if (this.b == null) {
                sb.append(" value");
            }
            throw new IllegalStateException("Missing required properties:" + sb);
        }

        public F.c.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            this.a = str;
            return this;
        }

        public F.c.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null value");
            }
            this.b = str;
            return this;
        }
    }

    public /* synthetic */ e(String str, String str2, a aVar) {
        this(str, str2);
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.c)) {
            return false;
        }
        F.c cVar = (F.c) obj;
        return this.a.equals(cVar.b()) && this.b.equals(cVar.c());
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.a + ", value=" + this.b + "}";
    }

    public e(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
