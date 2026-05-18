package T;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class k {
    public final a a;
    public final a b;
    public final boolean c;

    public static final class a {
        public final l1.i a;
        public final int b;
        public final long c;

        public a(l1.i iVar, int i, long j) {
            this.a = iVar;
            this.b = i;
            this.c = j;
        }

        public static /* synthetic */ a b(a aVar, l1.i iVar, int i, long j, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                iVar = aVar.a;
            }
            if ((i2 & 2) != 0) {
                i = aVar.b;
            }
            if ((i2 & 4) != 0) {
                j = aVar.c;
            }
            return aVar.a(iVar, i, j);
        }

        public final a a(l1.i iVar, int i, long j) {
            return new a(iVar, i, j);
        }

        public final int c() {
            return this.b;
        }

        public final long d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + Integer.hashCode(this.b)) * 31) + Long.hashCode(this.c);
        }

        public String toString() {
            return "AnchorInfo(direction=" + this.a + ", offset=" + this.b + ", selectableId=" + this.c + ')';
        }
    }

    public k(a aVar, a aVar2, boolean z) {
        this.a = aVar;
        this.b = aVar2;
        this.c = z;
    }

    public static /* synthetic */ k b(k kVar, a aVar, a aVar2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = kVar.a;
        }
        if ((i & 2) != 0) {
            aVar2 = kVar.b;
        }
        if ((i & 4) != 0) {
            z = kVar.c;
        }
        return kVar.a(aVar, aVar2, z);
    }

    public final k a(a aVar, a aVar2, boolean z) {
        return new k(aVar, aVar2, z);
    }

    public final a c() {
        return this.b;
    }

    public final boolean d() {
        return this.c;
    }

    public final a e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kotlin.jvm.internal.t.c(this.a, kVar.a) && kotlin.jvm.internal.t.c(this.b, kVar.b) && this.c == kVar.c;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Boolean.hashCode(this.c);
    }

    public String toString() {
        return "Selection(start=" + this.a + ", end=" + this.b + ", handlesCrossed=" + this.c + ')';
    }
}
