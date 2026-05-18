package U7;

import U7.F;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class h extends F.e {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final Long e;
    public final boolean f;
    public final F.e.a g;
    public final F.e.f h;
    public final F.e.e i;
    public final F.e.c j;
    public final List k;
    public final int l;

    public static final class b extends F.e.b {
        public String a;
        public String b;
        public String c;
        public long d;
        public Long e;
        public boolean f;
        public F.e.a g;
        public F.e.f h;
        public F.e.e i;
        public F.e.c j;
        public List k;
        public int l;
        public byte m;

        public /* synthetic */ b(F.e eVar, a aVar) {
            this(eVar);
        }

        public F.e a() {
            String str;
            String str2;
            F.e.a aVar;
            if (this.m == 7 && (str = this.a) != null && (str2 = this.b) != null && (aVar = this.g) != null) {
                return new h(str, str2, this.c, this.d, this.e, this.f, aVar, this.h, this.i, this.j, this.k, this.l, null);
            }
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" generator");
            }
            if (this.b == null) {
                sb.append(" identifier");
            }
            if ((this.m & 1) == 0) {
                sb.append(" startedAt");
            }
            if ((this.m & 2) == 0) {
                sb.append(" crashed");
            }
            if (this.g == null) {
                sb.append(" app");
            }
            if ((this.m & 4) == 0) {
                sb.append(" generatorType");
            }
            throw new IllegalStateException("Missing required properties:" + sb);
        }

        public F.e.b b(F.e.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null app");
            }
            this.g = aVar;
            return this;
        }

        public F.e.b c(String str) {
            this.c = str;
            return this;
        }

        public F.e.b d(boolean z) {
            this.f = z;
            this.m = (byte) (this.m | 2);
            return this;
        }

        public F.e.b e(F.e.c cVar) {
            this.j = cVar;
            return this;
        }

        public F.e.b f(Long l) {
            this.e = l;
            return this;
        }

        public F.e.b g(List list) {
            this.k = list;
            return this;
        }

        public F.e.b h(String str) {
            if (str == null) {
                throw new NullPointerException("Null generator");
            }
            this.a = str;
            return this;
        }

        public F.e.b i(int i) {
            this.l = i;
            this.m = (byte) (this.m | 4);
            return this;
        }

        public F.e.b j(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.b = str;
            return this;
        }

        public F.e.b l(F.e.e eVar) {
            this.i = eVar;
            return this;
        }

        public F.e.b m(long j) {
            this.d = j;
            this.m = (byte) (this.m | 1);
            return this;
        }

        public F.e.b n(F.e.f fVar) {
            this.h = fVar;
            return this;
        }

        public b() {
        }

        public b(F.e eVar) {
            this.a = eVar.g();
            this.b = eVar.i();
            this.c = eVar.c();
            this.d = eVar.l();
            this.e = eVar.e();
            this.f = eVar.n();
            this.g = eVar.b();
            this.h = eVar.m();
            this.i = eVar.k();
            this.j = eVar.d();
            this.k = eVar.f();
            this.l = eVar.h();
            this.m = (byte) 7;
        }
    }

    public /* synthetic */ h(String str, String str2, String str3, long j, Long l, boolean z, F.e.a aVar, F.e.f fVar, F.e.e eVar, F.e.c cVar, List list, int i, a aVar2) {
        this(str, str2, str3, j, l, z, aVar, fVar, eVar, cVar, list, i);
    }

    public F.e.a b() {
        return this.g;
    }

    public String c() {
        return this.c;
    }

    public F.e.c d() {
        return this.j;
    }

    public Long e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        String str;
        Long l;
        F.e.f fVar;
        F.e.e eVar;
        F.e.c cVar;
        List list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e)) {
            return false;
        }
        F.e eVar2 = (F.e) obj;
        return this.a.equals(eVar2.g()) && this.b.equals(eVar2.i()) && ((str = this.c) != null ? str.equals(eVar2.c()) : eVar2.c() == null) && this.d == eVar2.l() && ((l = this.e) != null ? l.equals(eVar2.e()) : eVar2.e() == null) && this.f == eVar2.n() && this.g.equals(eVar2.b()) && ((fVar = this.h) != null ? fVar.equals(eVar2.m()) : eVar2.m() == null) && ((eVar = this.i) != null ? eVar.equals(eVar2.k()) : eVar2.k() == null) && ((cVar = this.j) != null ? cVar.equals(eVar2.d()) : eVar2.d() == null) && ((list = this.k) != null ? list.equals(eVar2.f()) : eVar2.f() == null) && this.l == eVar2.h();
    }

    public List f() {
        return this.k;
    }

    public String g() {
        return this.a;
    }

    public int h() {
        return this.l;
    }

    public int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j = this.d;
        int i = (((hashCode ^ hashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l = this.e;
        int hashCode3 = (((((i ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.g.hashCode()) * 1000003;
        F.e.f fVar = this.h;
        int hashCode4 = (hashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        F.e.e eVar = this.i;
        int hashCode5 = (hashCode4 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        F.e.c cVar = this.j;
        int hashCode6 = (hashCode5 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List list = this.k;
        return ((hashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.l;
    }

    public String i() {
        return this.b;
    }

    public F.e.e k() {
        return this.i;
    }

    public long l() {
        return this.d;
    }

    public F.e.f m() {
        return this.h;
    }

    public boolean n() {
        return this.f;
    }

    public F.e.b o() {
        return new b(this, null);
    }

    public String toString() {
        return "Session{generator=" + this.a + ", identifier=" + this.b + ", appQualitySessionId=" + this.c + ", startedAt=" + this.d + ", endedAt=" + this.e + ", crashed=" + this.f + ", app=" + this.g + ", user=" + this.h + ", os=" + this.i + ", device=" + this.j + ", events=" + this.k + ", generatorType=" + this.l + "}";
    }

    public h(String str, String str2, String str3, long j, Long l, boolean z, F.e.a aVar, F.e.f fVar, F.e.e eVar, F.e.c cVar, List list, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = l;
        this.f = z;
        this.g = aVar;
        this.h = fVar;
        this.i = eVar;
        this.j = cVar;
        this.k = list;
        this.l = i;
    }
}
