package z5;

import z5.o;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class c extends o {
    public final p a;
    public final String b;
    public final w5.d c;
    public final w5.h d;
    public final w5.c e;

    public static final class b extends o.a {
        public p a;
        public String b;
        public w5.d c;
        public w5.h d;
        public w5.c e;

        public o a() {
            String str = "";
            if (this.a == null) {
                str = " transportContext";
            }
            if (this.b == null) {
                str = str + " transportName";
            }
            if (this.c == null) {
                str = str + " event";
            }
            if (this.d == null) {
                str = str + " transformer";
            }
            if (this.e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new c(this.a, this.b, this.c, this.d, this.e, null);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public o.a b(w5.c cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null encoding");
            }
            this.e = cVar;
            return this;
        }

        public o.a c(w5.d dVar) {
            if (dVar == null) {
                throw new NullPointerException("Null event");
            }
            this.c = dVar;
            return this;
        }

        public o.a d(w5.h hVar) {
            if (hVar == null) {
                throw new NullPointerException("Null transformer");
            }
            this.d = hVar;
            return this;
        }

        public o.a e(p pVar) {
            if (pVar == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.a = pVar;
            return this;
        }

        public o.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.b = str;
            return this;
        }
    }

    public /* synthetic */ c(p pVar, String str, w5.d dVar, w5.h hVar, w5.c cVar, a aVar) {
        this(pVar, str, dVar, hVar, cVar);
    }

    public w5.c b() {
        return this.e;
    }

    public w5.d c() {
        return this.c;
    }

    public w5.h e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.a.equals(oVar.f()) && this.b.equals(oVar.g()) && this.c.equals(oVar.c()) && this.d.equals(oVar.e()) && this.e.equals(oVar.b());
    }

    public p f() {
        return this.a;
    }

    public String g() {
        return this.b;
    }

    public int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.a + ", transportName=" + this.b + ", event=" + this.c + ", transformer=" + this.d + ", encoding=" + this.e + "}";
    }

    public c(p pVar, String str, w5.d dVar, w5.h hVar, w5.c cVar) {
        this.a = pVar;
        this.b = str;
        this.c = dVar;
        this.d = hVar;
        this.e = cVar;
    }
}
