package U7;

import U7.F;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class f extends F.d {
    public final List a;
    public final String b;

    public static final class b extends F.d.a {
        public List a;
        public String b;

        public F.d a() {
            List list = this.a;
            if (list != null) {
                return new f(list, this.b, null);
            }
            throw new IllegalStateException("Missing required properties: files");
        }

        public F.d.a b(List list) {
            if (list == null) {
                throw new NullPointerException("Null files");
            }
            this.a = list;
            return this;
        }

        public F.d.a c(String str) {
            this.b = str;
            return this;
        }
    }

    public /* synthetic */ f(List list, String str, a aVar) {
        this(list, str);
    }

    public List b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.d)) {
            return false;
        }
        F.d dVar = (F.d) obj;
        if (this.a.equals(dVar.b())) {
            String str = this.b;
            if (str == null) {
                if (dVar.c() == null) {
                    return true;
                }
            } else if (str.equals(dVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FilesPayload{files=" + this.a + ", orgId=" + this.b + "}";
    }

    public f(List list, String str) {
        this.a = list;
        this.b = str;
    }
}
