package T2;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class x0 {
    public final long a;
    public final float b;
    public final long c;

    public static final class b {
        public long a = -9223372036854775807L;
        public float b = -3.4028235E38f;
        public long c = -9223372036854775807L;

        public static /* synthetic */ long a(b bVar) {
            return bVar.a;
        }

        public static /* synthetic */ float b(b bVar) {
            return bVar.b;
        }

        public static /* synthetic */ long c(b bVar) {
            return bVar.c;
        }

        public x0 d() {
            return new x0(this, null);
        }

        public b e(long j) {
            P2.a.a(j >= 0 || j == -9223372036854775807L);
            this.c = j;
            return this;
        }

        public b f(long j) {
            this.a = j;
            return this;
        }

        public b g(float f) {
            P2.a.a(f > 0.0f || f == -3.4028235E38f);
            this.b = f;
            return this;
        }
    }

    public /* synthetic */ x0(b bVar, a aVar) {
        this(bVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return this.a == x0Var.a && this.b == x0Var.b && this.c == x0Var.c;
    }

    public int hashCode() {
        return s7.k.b(new Object[]{Long.valueOf(this.a), Float.valueOf(this.b), Long.valueOf(this.c)});
    }

    public x0(b bVar) {
        this.a = b.a(bVar);
        this.b = b.b(bVar);
        this.c = b.c(bVar);
    }
}
