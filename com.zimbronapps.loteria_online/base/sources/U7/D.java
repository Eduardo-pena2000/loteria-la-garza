package U7;

import U7.F;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class d extends F.a.a {
    public final String a;
    public final String b;
    public final String c;

    public static final class b extends F.a.a.a {
        public String a;
        public String b;
        public String c;

        public F.a.a a() {
            String str;
            String str2;
            String str3 = this.a;
            if (str3 != null && (str = this.b) != null && (str2 = this.c) != null) {
                return new d(str3, str, str2, null);
            }
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" arch");
            }
            if (this.b == null) {
                sb.append(" libraryName");
            }
            if (this.c == null) {
                sb.append(" buildId");
            }
            throw new IllegalStateException("Missing required properties:" + sb);
        }

        public F.a.a.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null arch");
            }
            this.a = str;
            return this;
        }

        public F.a.a.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildId");
            }
            this.c = str;
            return this;
        }

        public F.a.a.a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null libraryName");
            }
            this.b = str;
            return this;
        }
    }

    public /* synthetic */ d(String str, String str2, String str3, a aVar) {
        this(str, str2, str3);
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.c;
    }

    public String d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.a.a)) {
            return false;
        }
        F.a.a aVar = (F.a.a) obj;
        return this.a.equals(aVar.b()) && this.b.equals(aVar.d()) && this.c.equals(aVar.c());
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        return "BuildIdMappingForArch{arch=" + this.a + ", libraryName=" + this.b + ", buildId=" + this.c + "}";
    }

    public d(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
