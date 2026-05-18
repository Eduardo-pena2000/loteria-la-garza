package V2;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class k {
    public static final k d = new b().d();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public static final class b {
        public boolean a;
        public boolean b;
        public boolean c;

        public static /* synthetic */ boolean a(b bVar) {
            return bVar.a;
        }

        public static /* synthetic */ boolean b(b bVar) {
            return bVar.b;
        }

        public static /* synthetic */ boolean c(b bVar) {
            return bVar.c;
        }

        public k d() {
            if (this.a || !(this.b || this.c)) {
                return new k(this, null);
            }
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }

        public b e(boolean z) {
            this.a = z;
            return this;
        }

        public b f(boolean z) {
            this.b = z;
            return this;
        }

        public b g(boolean z) {
            this.c = z;
            return this;
        }
    }

    public /* synthetic */ k(b bVar, a aVar) {
        this(bVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return this.a == kVar.a && this.b == kVar.b && this.c == kVar.c;
    }

    public int hashCode() {
        return ((this.a ? 1 : 0) << 2) + ((this.b ? 1 : 0) << 1) + (this.c ? 1 : 0);
    }

    public k(b bVar) {
        this.a = b.a(bVar);
        this.b = b.b(bVar);
        this.c = b.c(bVar);
    }
}
