package I;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class i {
    public static final int b = d0.c.d;
    public final d0.c a = new d0.c(new a[16], 0);

    public static final class a {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
            if (i < 0) {
                throw new IllegalArgumentException("negative start index");
            }
            if (i2 < i) {
                throw new IllegalArgumentException("end index greater than start");
            }
        }

        public final int a() {
            return this.b;
        }

        public final int b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public int hashCode() {
            return (Integer.hashCode(this.a) * 31) + Integer.hashCode(this.b);
        }

        public String toString() {
            return "Interval(start=" + this.a + ", end=" + this.b + ')';
        }
    }

    public final a a(int i, int i2) {
        a aVar = new a(i, i2);
        this.a.b(aVar);
        return aVar;
    }

    public final int b() {
        int a2 = ((a) this.a.k()).a();
        d0.c cVar = this.a;
        int m = cVar.m();
        if (m > 0) {
            Object[] l = cVar.l();
            int i = 0;
            do {
                a aVar = (a) l[i];
                if (aVar.a() > a2) {
                    a2 = aVar.a();
                }
                i++;
            } while (i < m);
        }
        return a2;
    }

    public final int c() {
        int b2 = ((a) this.a.k()).b();
        d0.c cVar = this.a;
        int m = cVar.m();
        if (m > 0) {
            Object[] l = cVar.l();
            int i = 0;
            do {
                a aVar = (a) l[i];
                if (aVar.b() < b2) {
                    b2 = aVar.b();
                }
                i++;
            } while (i < m);
        }
        if (b2 >= 0) {
            return b2;
        }
        throw new IllegalArgumentException("negative minIndex");
    }

    public final boolean d() {
        return this.a.p();
    }

    public final void e(a aVar) {
        this.a.s(aVar);
    }
}
