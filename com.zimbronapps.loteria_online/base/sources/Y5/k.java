package y5;

import java.util.List;
import y5.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class k extends u {
    public final long a;
    public final long b;
    public final o c;
    public final Integer d;
    public final String e;
    public final List f;
    public final x g;

    public static final class b extends u.a {
        public Long a;
        public Long b;
        public o c;
        public Integer d;
        public String e;
        public List f;
        public x g;

        public u a() {
            String str = "";
            if (this.a == null) {
                str = " requestTimeMs";
            }
            if (this.b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new k(this.a.longValue(), this.b.longValue(), this.c, this.d, this.e, this.f, this.g, null);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public u.a b(o oVar) {
            this.c = oVar;
            return this;
        }

        public u.a c(List list) {
            this.f = list;
            return this;
        }

        public u.a d(Integer num) {
            this.d = num;
            return this;
        }

        public u.a e(String str) {
            this.e = str;
            return this;
        }

        public u.a f(x xVar) {
            this.g = xVar;
            return this;
        }

        public u.a g(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        public u.a h(long j) {
            this.b = Long.valueOf(j);
            return this;
        }
    }

    public /* synthetic */ k(long j, long j2, o oVar, Integer num, String str, List list, x xVar, a aVar) {
        this(j, j2, oVar, num, str, list, xVar);
    }

    public o b() {
        return this.c;
    }

    public List c() {
        return this.f;
    }

    public Integer d() {
        return this.d;
    }

    public String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        o oVar;
        Integer num;
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.a == uVar.g() && this.b == uVar.h() && ((oVar = this.c) != null ? oVar.equals(uVar.b()) : uVar.b() == null) && ((num = this.d) != null ? num.equals(uVar.d()) : uVar.d() == null) && ((str = this.e) != null ? str.equals(uVar.e()) : uVar.e() == null) && ((list = this.f) != null ? list.equals(uVar.c()) : uVar.c() == null)) {
            x xVar = this.g;
            if (xVar == null) {
                if (uVar.f() == null) {
                    return true;
                }
            } else if (xVar.equals(uVar.f())) {
                return true;
            }
        }
        return false;
    }

    public x f() {
        return this.g;
    }

    public long g() {
        return this.a;
    }

    public long h() {
        return this.b;
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        o oVar = this.c;
        int hashCode = (i ^ (oVar == null ? 0 : oVar.hashCode())) * 1000003;
        Integer num = this.d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        x xVar = this.g;
        return hashCode4 ^ (xVar != null ? xVar.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + this.g + "}";
    }

    public k(long j, long j2, o oVar, Integer num, String str, List list, x xVar) {
        this.a = j;
        this.b = j2;
        this.c = oVar;
        this.d = num;
        this.e = str;
        this.f = list;
        this.g = xVar;
    }
}
