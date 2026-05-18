package U7;

import U7.F;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class l extends F.e.d {
    public final long a;
    public final String b;
    public final F.e.d.a c;
    public final F.e.d.c d;
    public final F.e.d.d e;
    public final F.e.d.f f;

    public static final class b extends F.e.d.b {
        public long a;
        public String b;
        public F.e.d.a c;
        public F.e.d.c d;
        public F.e.d.d e;
        public F.e.d.f f;
        public byte g;

        public /* synthetic */ b(F.e.d dVar, a aVar) {
            this(dVar);
        }

        public F.e.d a() {
            String str;
            F.e.d.a aVar;
            F.e.d.c cVar;
            if (this.g == 1 && (str = this.b) != null && (aVar = this.c) != null && (cVar = this.d) != null) {
                return new l(this.a, str, aVar, cVar, this.e, this.f, null);
            }
            StringBuilder sb = new StringBuilder();
            if ((1 & this.g) == 0) {
                sb.append(" timestamp");
            }
            if (this.b == null) {
                sb.append(" type");
            }
            if (this.c == null) {
                sb.append(" app");
            }
            if (this.d == null) {
                sb.append(" device");
            }
            throw new IllegalStateException("Missing required properties:" + sb);
        }

        public F.e.d.b b(F.e.d.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null app");
            }
            this.c = aVar;
            return this;
        }

        public F.e.d.b c(F.e.d.c cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null device");
            }
            this.d = cVar;
            return this;
        }

        public F.e.d.b d(F.e.d.d dVar) {
            this.e = dVar;
            return this;
        }

        public F.e.d.b e(F.e.d.f fVar) {
            this.f = fVar;
            return this;
        }

        public F.e.d.b f(long j) {
            this.a = j;
            this.g = (byte) (this.g | 1);
            return this;
        }

        public F.e.d.b g(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.b = str;
            return this;
        }

        public b() {
        }

        public b(F.e.d dVar) {
            this.a = dVar.f();
            this.b = dVar.g();
            this.c = dVar.b();
            this.d = dVar.c();
            this.e = dVar.d();
            this.f = dVar.e();
            this.g = (byte) 1;
        }
    }

    public /* synthetic */ l(long j, String str, F.e.d.a aVar, F.e.d.c cVar, F.e.d.d dVar, F.e.d.f fVar, a aVar2) {
        this(j, str, aVar, cVar, dVar, fVar);
    }

    public F.e.d.a b() {
        return this.c;
    }

    public F.e.d.c c() {
        return this.d;
    }

    public F.e.d.d d() {
        return this.e;
    }

    public F.e.d.f e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        F.e.d.d dVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d)) {
            return false;
        }
        F.e.d dVar2 = (F.e.d) obj;
        if (this.a == dVar2.f() && this.b.equals(dVar2.g()) && this.c.equals(dVar2.b()) && this.d.equals(dVar2.c()) && ((dVar = this.e) != null ? dVar.equals(dVar2.d()) : dVar2.d() == null)) {
            F.e.d.f fVar = this.f;
            if (fVar == null) {
                if (dVar2.e() == null) {
                    return true;
                }
            } else if (fVar.equals(dVar2.e())) {
                return true;
            }
        }
        return false;
    }

    public long f() {
        return this.a;
    }

    public String g() {
        return this.b;
    }

    public F.e.d.b h() {
        return new b(this, null);
    }

    public int hashCode() {
        long j = this.a;
        int hashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        F.e.d.d dVar = this.e;
        int hashCode2 = (hashCode ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003;
        F.e.d.f fVar = this.f;
        return hashCode2 ^ (fVar != null ? fVar.hashCode() : 0);
    }

    public String toString() {
        return "Event{timestamp=" + this.a + ", type=" + this.b + ", app=" + this.c + ", device=" + this.d + ", log=" + this.e + ", rollouts=" + this.f + "}";
    }

    public l(long j, String str, F.e.d.a aVar, F.e.d.c cVar, F.e.d.d dVar, F.e.d.f fVar) {
        this.a = j;
        this.b = str;
        this.c = aVar;
        this.d = cVar;
        this.e = dVar;
        this.f = fVar;
    }
}
