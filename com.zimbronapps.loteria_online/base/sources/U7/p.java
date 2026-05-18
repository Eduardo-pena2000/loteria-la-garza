package U7;

import U7.F;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class p extends F.e.d.a.b.c {
    public final String a;
    public final String b;
    public final List c;
    public final F.e.d.a.b.c d;
    public final int e;

    public static final class b extends F.e.d.a.b.c.a {
        public String a;
        public String b;
        public List c;
        public F.e.d.a.b.c d;
        public int e;
        public byte f;

        public F.e.d.a.b.c a() {
            String str;
            List list;
            if (this.f == 1 && (str = this.a) != null && (list = this.c) != null) {
                return new p(str, this.b, list, this.d, this.e, null);
            }
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" type");
            }
            if (this.c == null) {
                sb.append(" frames");
            }
            if ((1 & this.f) == 0) {
                sb.append(" overflowCount");
            }
            throw new IllegalStateException("Missing required properties:" + sb);
        }

        public F.e.d.a.b.c.a b(F.e.d.a.b.c cVar) {
            this.d = cVar;
            return this;
        }

        public F.e.d.a.b.c.a c(List list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.c = list;
            return this;
        }

        public F.e.d.a.b.c.a d(int i) {
            this.e = i;
            this.f = (byte) (this.f | 1);
            return this;
        }

        public F.e.d.a.b.c.a e(String str) {
            this.b = str;
            return this;
        }

        public F.e.d.a.b.c.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.a = str;
            return this;
        }
    }

    public /* synthetic */ p(String str, String str2, List list, F.e.d.a.b.c cVar, int i, a aVar) {
        this(str, str2, list, cVar, i);
    }

    public F.e.d.a.b.c b() {
        return this.d;
    }

    public List c() {
        return this.c;
    }

    public int d() {
        return this.e;
    }

    public String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        String str;
        F.e.d.a.b.c cVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a.b.c)) {
            return false;
        }
        F.e.d.a.b.c cVar2 = (F.e.d.a.b.c) obj;
        return this.a.equals(cVar2.f()) && ((str = this.b) != null ? str.equals(cVar2.e()) : cVar2.e() == null) && this.c.equals(cVar2.c()) && ((cVar = this.d) != null ? cVar.equals(cVar2.b()) : cVar2.b() == null) && this.e == cVar2.d();
    }

    public String f() {
        return this.a;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        F.e.d.a.b.c cVar = this.d;
        return ((hashCode2 ^ (cVar != null ? cVar.hashCode() : 0)) * 1000003) ^ this.e;
    }

    public String toString() {
        return "Exception{type=" + this.a + ", reason=" + this.b + ", frames=" + this.c + ", causedBy=" + this.d + ", overflowCount=" + this.e + "}";
    }

    public p(String str, String str2, List list, F.e.d.a.b.c cVar, int i) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = cVar;
        this.e = i;
    }
}
