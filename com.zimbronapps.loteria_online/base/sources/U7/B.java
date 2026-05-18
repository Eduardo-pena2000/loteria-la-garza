package U7;

import U7.F;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class b extends F {
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final F.e k;
    public final F.d l;
    public final F.a m;

    public static final class b extends F.b {
        public String a;
        public String b;
        public int c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;
        public F.e j;
        public F.d k;
        public F.a l;
        public byte m;

        public /* synthetic */ b(F f, a aVar) {
            this(f);
        }

        public F a() {
            if (this.m == 1 && this.a != null && this.b != null && this.d != null && this.h != null && this.i != null) {
                return new b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, null);
            }
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" sdkVersion");
            }
            if (this.b == null) {
                sb.append(" gmpAppId");
            }
            if ((1 & this.m) == 0) {
                sb.append(" platform");
            }
            if (this.d == null) {
                sb.append(" installationUuid");
            }
            if (this.h == null) {
                sb.append(" buildVersion");
            }
            if (this.i == null) {
                sb.append(" displayVersion");
            }
            throw new IllegalStateException("Missing required properties:" + sb);
        }

        public F.b b(F.a aVar) {
            this.l = aVar;
            return this;
        }

        public F.b c(String str) {
            this.g = str;
            return this;
        }

        public F.b d(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.h = str;
            return this;
        }

        public F.b e(String str) {
            if (str == null) {
                throw new NullPointerException("Null displayVersion");
            }
            this.i = str;
            return this;
        }

        public F.b f(String str) {
            this.f = str;
            return this;
        }

        public F.b g(String str) {
            this.e = str;
            return this;
        }

        public F.b h(String str) {
            if (str == null) {
                throw new NullPointerException("Null gmpAppId");
            }
            this.b = str;
            return this;
        }

        public F.b i(String str) {
            if (str == null) {
                throw new NullPointerException("Null installationUuid");
            }
            this.d = str;
            return this;
        }

        public F.b j(F.d dVar) {
            this.k = dVar;
            return this;
        }

        public F.b k(int i) {
            this.c = i;
            this.m = (byte) (this.m | 1);
            return this;
        }

        public F.b l(String str) {
            if (str == null) {
                throw new NullPointerException("Null sdkVersion");
            }
            this.a = str;
            return this;
        }

        public F.b m(F.e eVar) {
            this.j = eVar;
            return this;
        }

        public b() {
        }

        public b(F f) {
            this.a = f.m();
            this.b = f.i();
            this.c = f.l();
            this.d = f.j();
            this.e = f.h();
            this.f = f.g();
            this.g = f.d();
            this.h = f.e();
            this.i = f.f();
            this.j = f.n();
            this.k = f.k();
            this.l = f.c();
            this.m = (byte) 1;
        }
    }

    public /* synthetic */ b(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, F.e eVar, F.d dVar, F.a aVar, a aVar2) {
        this(str, str2, i, str3, str4, str5, str6, str7, str8, eVar, dVar, aVar);
    }

    public F.a c() {
        return this.m;
    }

    public String d() {
        return this.h;
    }

    public String e() {
        return this.i;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        F.e eVar;
        F.d dVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f = (F) obj;
        if (this.b.equals(f.m()) && this.c.equals(f.i()) && this.d == f.l() && this.e.equals(f.j()) && ((str = this.f) != null ? str.equals(f.h()) : f.h() == null) && ((str2 = this.g) != null ? str2.equals(f.g()) : f.g() == null) && ((str3 = this.h) != null ? str3.equals(f.d()) : f.d() == null) && this.i.equals(f.e()) && this.j.equals(f.f()) && ((eVar = this.k) != null ? eVar.equals(f.n()) : f.n() == null) && ((dVar = this.l) != null ? dVar.equals(f.k()) : f.k() == null)) {
            F.a aVar = this.m;
            if (aVar == null) {
                if (f.c() == null) {
                    return true;
                }
            } else if (aVar.equals(f.c())) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        return this.j;
    }

    public String g() {
        return this.g;
    }

    public String h() {
        return this.f;
    }

    public int hashCode() {
        int hashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        String str = this.f;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.g;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.h;
        int hashCode4 = (((((hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003;
        F.e eVar = this.k;
        int hashCode5 = (hashCode4 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        F.d dVar = this.l;
        int hashCode6 = (hashCode5 ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003;
        F.a aVar = this.m;
        return hashCode6 ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public String i() {
        return this.c;
    }

    public String j() {
        return this.e;
    }

    public F.d k() {
        return this.l;
    }

    public int l() {
        return this.d;
    }

    public String m() {
        return this.b;
    }

    public F.e n() {
        return this.k;
    }

    public F.b o() {
        return new b(this, null);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.b + ", gmpAppId=" + this.c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f + ", firebaseAuthenticationToken=" + this.g + ", appQualitySessionId=" + this.h + ", buildVersion=" + this.i + ", displayVersion=" + this.j + ", session=" + this.k + ", ndkPayload=" + this.l + ", appExitInfo=" + this.m + "}";
    }

    public b(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, F.e eVar, F.d dVar, F.a aVar) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = eVar;
        this.l = dVar;
        this.m = aVar;
    }
}
