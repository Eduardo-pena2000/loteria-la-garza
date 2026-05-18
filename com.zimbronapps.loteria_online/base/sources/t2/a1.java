package T2;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a1 {
    public static final a1 c;
    public static final a1 d;
    public static final a1 e;
    public static final a1 f;
    public static final a1 g;
    public final long a;
    public final long b;

    static {
        a1 a1Var = new a1(0L, 0L);
        c = a1Var;
        d = new a1(Long.MAX_VALUE, Long.MAX_VALUE);
        e = new a1(Long.MAX_VALUE, 0L);
        f = new a1(0L, Long.MAX_VALUE);
        g = a1Var;
    }

    public a1(long j, long j2) {
        P2.a.a(j >= 0);
        P2.a.a(j2 >= 0);
        this.a = j;
        this.b = j2;
    }

    public long a(long j, long j2, long j3) {
        long j4 = this.a;
        if (j4 == 0 && this.b == 0) {
            return j;
        }
        long f1 = P2.K.f1(j, j4, Long.MIN_VALUE);
        long b = P2.K.b(j, this.b, Long.MAX_VALUE);
        boolean z = false;
        boolean z2 = f1 <= j2 && j2 <= b;
        if (f1 <= j3 && j3 <= b) {
            z = true;
        }
        return (z2 && z) ? Math.abs(j2 - j) <= Math.abs(j3 - j) ? j2 : j3 : z2 ? j2 : z ? j3 : f1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a1.class != obj.getClass()) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return this.a == a1Var.a && this.b == a1Var.b;
    }

    public int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
