package M2;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class l {
    public static final l e = new b(0).e();
    public static final String f = P2.K.w0(0);
    public static final String g = P2.K.w0(1);
    public static final String h = P2.K.w0(2);
    public static final String i = P2.K.w0(3);
    public final int a;
    public final int b;
    public final int c;
    public final String d;

    public static final class b {
        public final int a;
        public int b;
        public int c;
        public String d;

        public b(int i) {
            this.a = i;
        }

        public static /* synthetic */ int a(b bVar) {
            return bVar.a;
        }

        public static /* synthetic */ int b(b bVar) {
            return bVar.b;
        }

        public static /* synthetic */ int c(b bVar) {
            return bVar.c;
        }

        public static /* synthetic */ String d(b bVar) {
            return bVar.d;
        }

        public l e() {
            P2.a.a(this.b <= this.c);
            return new l(this, null);
        }

        public b f(int i) {
            this.c = i;
            return this;
        }

        public b g(int i) {
            this.b = i;
            return this;
        }
    }

    public /* synthetic */ l(b bVar, a aVar) {
        this(bVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.a == lVar.a && this.b == lVar.b && this.c == lVar.c && P2.K.c(this.d, lVar.d);
    }

    public int hashCode() {
        int i2 = (((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31;
        String str = this.d;
        return i2 + (str == null ? 0 : str.hashCode());
    }

    public l(b bVar) {
        this.a = b.a(bVar);
        this.b = b.b(bVar);
        this.c = b.c(bVar);
        this.d = b.d(bVar);
    }
}
