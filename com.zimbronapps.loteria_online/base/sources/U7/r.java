package U7;

import U7.F;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class r extends F.e.d.a.b.e {
    public final String a;
    public final int b;
    public final List c;

    public static final class b extends F.e.d.a.b.e.a {
        public String a;
        public int b;
        public List c;
        public byte d;

        public F.e.d.a.b.e a() {
            String str;
            List list;
            if (this.d == 1 && (str = this.a) != null && (list = this.c) != null) {
                return new r(str, this.b, list, null);
            }
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" name");
            }
            if ((1 & this.d) == 0) {
                sb.append(" importance");
            }
            if (this.c == null) {
                sb.append(" frames");
            }
            throw new IllegalStateException("Missing required properties:" + sb);
        }

        public F.e.d.a.b.e.a b(List list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.c = list;
            return this;
        }

        public F.e.d.a.b.e.a c(int i) {
            this.b = i;
            this.d = (byte) (this.d | 1);
            return this;
        }

        public F.e.d.a.b.e.a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.a = str;
            return this;
        }
    }

    public /* synthetic */ r(String str, int i, List list, a aVar) {
        this(str, i, list);
    }

    public List b() {
        return this.c;
    }

    public int c() {
        return this.b;
    }

    public String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a.b.e)) {
            return false;
        }
        F.e.d.a.b.e eVar = (F.e.d.a.b.e) obj;
        return this.a.equals(eVar.d()) && this.b == eVar.c() && this.c.equals(eVar.b());
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.a + ", importance=" + this.b + ", frames=" + this.c + "}";
    }

    public r(String str, int i, List list) {
        this.a = str;
        this.b = i;
        this.c = list;
    }
}
