package G4;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b {
    public static final b i = new a().a();
    public n a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public long f;
    public long g;
    public c h;

    public static final class a {
        public boolean a = false;
        public boolean b = false;
        public n c = n.a;
        public boolean d = false;
        public boolean e = false;
        public long f = -1;
        public long g = -1;
        public c h = new c();

        public b a() {
            return new b(this);
        }

        public a b(n nVar) {
            this.c = nVar;
            return this;
        }
    }

    public b() {
        this.a = n.a;
        this.f = -1L;
        this.g = -1L;
        this.h = new c();
    }

    public c a() {
        return this.h;
    }

    public n b() {
        return this.a;
    }

    public long c() {
        return this.f;
    }

    public long d() {
        return this.g;
    }

    public boolean e() {
        return this.h.c() > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f && this.g == bVar.g && this.a == bVar.a) {
            return this.h.equals(bVar.h);
        }
        return false;
    }

    public boolean f() {
        return this.d;
    }

    public boolean g() {
        return this.b;
    }

    public boolean h() {
        return this.c;
    }

    public int hashCode() {
        int hashCode = ((((((((this.a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31;
        long j = this.f;
        int i2 = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.g;
        return ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.h.hashCode();
    }

    public boolean i() {
        return this.e;
    }

    public void j(c cVar) {
        this.h = cVar;
    }

    public void k(n nVar) {
        this.a = nVar;
    }

    public void l(boolean z) {
        this.d = z;
    }

    public void m(boolean z) {
        this.b = z;
    }

    public void n(boolean z) {
        this.c = z;
    }

    public void o(boolean z) {
        this.e = z;
    }

    public void p(long j) {
        this.f = j;
    }

    public void q(long j) {
        this.g = j;
    }

    public b(a aVar) {
        this.a = n.a;
        this.f = -1L;
        this.g = -1L;
        this.h = new c();
        this.b = aVar.a;
        this.c = aVar.b;
        this.a = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        this.h = aVar.h;
        this.f = aVar.f;
        this.g = aVar.g;
    }

    public b(b bVar) {
        this.a = n.a;
        this.f = -1L;
        this.g = -1L;
        this.h = new c();
        this.b = bVar.b;
        this.c = bVar.c;
        this.a = bVar.a;
        this.d = bVar.d;
        this.e = bVar.e;
        this.h = bVar.h;
    }
}
