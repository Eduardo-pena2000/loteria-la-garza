package U7;

import U7.F;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class m extends F.e.d.a {
    public final F.e.d.a.b a;
    public final List b;
    public final List c;
    public final Boolean d;
    public final F.e.d.a.c e;
    public final List f;
    public final int g;

    public static final class b extends F.e.d.a.a {
        public F.e.d.a.b a;
        public List b;
        public List c;
        public Boolean d;
        public F.e.d.a.c e;
        public List f;
        public int g;
        public byte h;

        public /* synthetic */ b(F.e.d.a aVar, a aVar2) {
            this(aVar);
        }

        public F.e.d.a a() {
            F.e.d.a.b bVar;
            if (this.h == 1 && (bVar = this.a) != null) {
                return new m(bVar, this.b, this.c, this.d, this.e, this.f, this.g, null);
            }
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" execution");
            }
            if ((1 & this.h) == 0) {
                sb.append(" uiOrientation");
            }
            throw new IllegalStateException("Missing required properties:" + sb);
        }

        public F.e.d.a.a b(List list) {
            this.f = list;
            return this;
        }

        public F.e.d.a.a c(Boolean bool) {
            this.d = bool;
            return this;
        }

        public F.e.d.a.a d(F.e.d.a.c cVar) {
            this.e = cVar;
            return this;
        }

        public F.e.d.a.a e(List list) {
            this.b = list;
            return this;
        }

        public F.e.d.a.a f(F.e.d.a.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null execution");
            }
            this.a = bVar;
            return this;
        }

        public F.e.d.a.a g(List list) {
            this.c = list;
            return this;
        }

        public F.e.d.a.a h(int i) {
            this.g = i;
            this.h = (byte) (this.h | 1);
            return this;
        }

        public b() {
        }

        public b(F.e.d.a aVar) {
            this.a = aVar.f();
            this.b = aVar.e();
            this.c = aVar.g();
            this.d = aVar.c();
            this.e = aVar.d();
            this.f = aVar.b();
            this.g = aVar.h();
            this.h = (byte) 1;
        }
    }

    public /* synthetic */ m(F.e.d.a.b bVar, List list, List list2, Boolean bool, F.e.d.a.c cVar, List list3, int i, a aVar) {
        this(bVar, list, list2, bool, cVar, list3, i);
    }

    public List b() {
        return this.f;
    }

    public Boolean c() {
        return this.d;
    }

    public F.e.d.a.c d() {
        return this.e;
    }

    public List e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        Boolean bool;
        F.e.d.a.c cVar;
        List list3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a)) {
            return false;
        }
        F.e.d.a aVar = (F.e.d.a) obj;
        return this.a.equals(aVar.f()) && ((list = this.b) != null ? list.equals(aVar.e()) : aVar.e() == null) && ((list2 = this.c) != null ? list2.equals(aVar.g()) : aVar.g() == null) && ((bool = this.d) != null ? bool.equals(aVar.c()) : aVar.c() == null) && ((cVar = this.e) != null ? cVar.equals(aVar.d()) : aVar.d() == null) && ((list3 = this.f) != null ? list3.equals(aVar.b()) : aVar.b() == null) && this.g == aVar.h();
    }

    public F.e.d.a.b f() {
        return this.a;
    }

    public List g() {
        return this.c;
    }

    public int h() {
        return this.g;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        List list = this.b;
        int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.c;
        int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.d;
        int hashCode4 = (hashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        F.e.d.a.c cVar = this.e;
        int hashCode5 = (hashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List list3 = this.f;
        return ((hashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.g;
    }

    public F.e.d.a.a i() {
        return new b(this, null);
    }

    public String toString() {
        return "Application{execution=" + this.a + ", customAttributes=" + this.b + ", internalKeys=" + this.c + ", background=" + this.d + ", currentProcessDetails=" + this.e + ", appProcessDetails=" + this.f + ", uiOrientation=" + this.g + "}";
    }

    public m(F.e.d.a.b bVar, List list, List list2, Boolean bool, F.e.d.a.c cVar, List list3, int i) {
        this.a = bVar;
        this.b = list;
        this.c = list2;
        this.d = bool;
        this.e = cVar;
        this.f = list3;
        this.g = i;
    }
}
