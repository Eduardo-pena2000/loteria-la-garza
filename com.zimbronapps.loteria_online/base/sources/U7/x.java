package U7;

import U7.F;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class x extends F.e.d.e.b {
    public final String a;
    public final String b;

    public static final class b extends F.e.d.e.b.a {
        public String a;
        public String b;

        public F.e.d.e.b a() {
            String str;
            String str2 = this.a;
            if (str2 != null && (str = this.b) != null) {
                return new x(str2, str, null);
            }
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" rolloutId");
            }
            if (this.b == null) {
                sb.append(" variantId");
            }
            throw new IllegalStateException("Missing required properties:" + sb);
        }

        public F.e.d.e.b.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.a = str;
            return this;
        }

        public F.e.d.e.b.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            this.b = str;
            return this;
        }
    }

    public /* synthetic */ x(String str, String str2, a aVar) {
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
        if (!(obj instanceof F.e.d.e.b)) {
            return false;
        }
        F.e.d.e.b bVar = (F.e.d.e.b) obj;
        return this.a.equals(bVar.b()) && this.b.equals(bVar.c());
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "RolloutVariant{rolloutId=" + this.a + ", variantId=" + this.b + "}";
    }

    public x(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
