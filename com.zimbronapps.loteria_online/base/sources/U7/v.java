package U7;

import U7.F;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class v extends F.e.d.d {
    public final String a;

    public static final class b extends F.e.d.d.a {
        public String a;

        public F.e.d.d a() {
            String str = this.a;
            if (str != null) {
                return new v(str, null);
            }
            throw new IllegalStateException("Missing required properties: content");
        }

        public F.e.d.d.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null content");
            }
            this.a = str;
            return this;
        }
    }

    public /* synthetic */ v(String str, a aVar) {
        this(str);
    }

    public String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.d) {
            return this.a.equals(((F.e.d.d) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.a + "}";
    }

    public v(String str) {
        this.a = str;
    }
}
