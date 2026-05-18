package U7;

import U7.F;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class n extends F.e.d.a.b {
    public final List a;
    public final F.e.d.a.b.c b;
    public final F.a c;
    public final F.e.d.a.b.d d;
    public final List e;

    public static final class b extends F.e.d.a.b.b {
        public List a;
        public F.e.d.a.b.c b;
        public F.a c;
        public F.e.d.a.b.d d;
        public List e;

        public F.e.d.a.b a() {
            List list;
            F.e.d.a.b.d dVar = this.d;
            if (dVar != null && (list = this.e) != null) {
                return new n(this.a, this.b, this.c, dVar, list, null);
            }
            StringBuilder sb = new StringBuilder();
            if (this.d == null) {
                sb.append(" signal");
            }
            if (this.e == null) {
                sb.append(" binaries");
            }
            throw new IllegalStateException("Missing required properties:" + sb);
        }

        public F.e.d.a.b.b b(F.a aVar) {
            this.c = aVar;
            return this;
        }

        public F.e.d.a.b.b c(List list) {
            if (list == null) {
                throw new NullPointerException("Null binaries");
            }
            this.e = list;
            return this;
        }

        public F.e.d.a.b.b d(F.e.d.a.b.c cVar) {
            this.b = cVar;
            return this;
        }

        public F.e.d.a.b.b e(F.e.d.a.b.d dVar) {
            if (dVar == null) {
                throw new NullPointerException("Null signal");
            }
            this.d = dVar;
            return this;
        }

        public F.e.d.a.b.b f(List list) {
            this.a = list;
            return this;
        }
    }

    public /* synthetic */ n(List list, F.e.d.a.b.c cVar, F.a aVar, F.e.d.a.b.d dVar, List list2, a aVar2) {
        this(list, cVar, aVar, dVar, list2);
    }

    public F.a b() {
        return this.c;
    }

    public List c() {
        return this.e;
    }

    public F.e.d.a.b.c d() {
        return this.b;
    }

    public F.e.d.a.b.d e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a.b)) {
            return false;
        }
        F.e.d.a.b bVar = (F.e.d.a.b) obj;
        List list = this.a;
        if (list != null ? list.equals(bVar.f()) : bVar.f() == null) {
            F.e.d.a.b.c cVar = this.b;
            if (cVar != null ? cVar.equals(bVar.d()) : bVar.d() == null) {
                F.a aVar = this.c;
                if (aVar != null ? aVar.equals(bVar.b()) : bVar.b() == null) {
                    if (this.d.equals(bVar.e()) && this.e.equals(bVar.c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public List f() {
        return this.a;
    }

    public int hashCode() {
        List list = this.a;
        int hashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        F.e.d.a.b.c cVar = this.b;
        int hashCode2 = (hashCode ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        F.a aVar = this.c;
        return ((((hashCode2 ^ (aVar != null ? aVar.hashCode() : 0)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.a + ", exception=" + this.b + ", appExitInfo=" + this.c + ", signal=" + this.d + ", binaries=" + this.e + "}";
    }

    public n(List list, F.e.d.a.b.c cVar, F.a aVar, F.e.d.a.b.d dVar, List list2) {
        this.a = list;
        this.b = cVar;
        this.c = aVar;
        this.d = dVar;
        this.e = list2;
    }
}
