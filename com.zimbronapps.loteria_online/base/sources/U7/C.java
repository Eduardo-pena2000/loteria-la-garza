package U7;

import U7.F;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class c extends F.a {
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final long g;
    public final String h;
    public final List i;

    public static final class b extends F.a.b {
        public int a;
        public String b;
        public int c;
        public int d;
        public long e;
        public long f;
        public long g;
        public String h;
        public List i;
        public byte j;

        public F.a a() {
            String str;
            if (this.j == 63 && (str = this.b) != null) {
                return new c(this.a, str, this.c, this.d, this.e, this.f, this.g, this.h, this.i, null);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.j & 1) == 0) {
                sb.append(" pid");
            }
            if (this.b == null) {
                sb.append(" processName");
            }
            if ((this.j & 2) == 0) {
                sb.append(" reasonCode");
            }
            if ((this.j & 4) == 0) {
                sb.append(" importance");
            }
            if ((this.j & 8) == 0) {
                sb.append(" pss");
            }
            if ((this.j & 16) == 0) {
                sb.append(" rss");
            }
            if ((this.j & 32) == 0) {
                sb.append(" timestamp");
            }
            throw new IllegalStateException("Missing required properties:" + sb);
        }

        public F.a.b b(List list) {
            this.i = list;
            return this;
        }

        public F.a.b c(int i) {
            this.d = i;
            this.j = (byte) (this.j | 4);
            return this;
        }

        public F.a.b d(int i) {
            this.a = i;
            this.j = (byte) (this.j | 1);
            return this;
        }

        public F.a.b e(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.b = str;
            return this;
        }

        public F.a.b f(long j) {
            this.e = j;
            this.j = (byte) (this.j | 8);
            return this;
        }

        public F.a.b g(int i) {
            this.c = i;
            this.j = (byte) (this.j | 2);
            return this;
        }

        public F.a.b h(long j) {
            this.f = j;
            this.j = (byte) (this.j | 16);
            return this;
        }

        public F.a.b i(long j) {
            this.g = j;
            this.j = (byte) (this.j | 32);
            return this;
        }

        public F.a.b j(String str) {
            this.h = str;
            return this;
        }
    }

    public /* synthetic */ c(int i, String str, int i2, int i3, long j, long j2, long j3, String str2, List list, a aVar) {
        this(i, str, i2, i3, j, j2, j3, str2, list);
    }

    public List b() {
        return this.i;
    }

    public int c() {
        return this.d;
    }

    public int d() {
        return this.a;
    }

    public String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.a)) {
            return false;
        }
        F.a aVar = (F.a) obj;
        if (this.a == aVar.d() && this.b.equals(aVar.e()) && this.c == aVar.g() && this.d == aVar.c() && this.e == aVar.f() && this.f == aVar.h() && this.g == aVar.i() && ((str = this.h) != null ? str.equals(aVar.j()) : aVar.j() == null)) {
            List list = this.i;
            if (list == null) {
                if (aVar.b() == null) {
                    return true;
                }
            } else if (list.equals(aVar.b())) {
                return true;
            }
        }
        return false;
    }

    public long f() {
        return this.e;
    }

    public int g() {
        return this.c;
    }

    public long h() {
        return this.f;
    }

    public int hashCode() {
        int hashCode = (((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003;
        long j = this.e;
        int i = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.g;
        int i3 = (i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str = this.h;
        int hashCode2 = (i3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.i;
        return hashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    public long i() {
        return this.g;
    }

    public String j() {
        return this.h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.a + ", processName=" + this.b + ", reasonCode=" + this.c + ", importance=" + this.d + ", pss=" + this.e + ", rss=" + this.f + ", timestamp=" + this.g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.i + "}";
    }

    public c(int i, String str, int i2, int i3, long j, long j2, long j3, String str2, List list) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = str2;
        this.i = list;
    }
}
