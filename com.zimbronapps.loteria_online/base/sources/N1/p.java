package n1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class p {
    public static final a e = new a(null);
    public static final p f = new p(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final p a() {
            return p.a();
        }

        public a() {
        }
    }

    public p(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static final /* synthetic */ p a() {
        return f;
    }

    public static /* synthetic */ p c(p pVar, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = pVar.a;
        }
        if ((i5 & 2) != 0) {
            i2 = pVar.b;
        }
        if ((i5 & 4) != 0) {
            i3 = pVar.c;
        }
        if ((i5 & 8) != 0) {
            i4 = pVar.d;
        }
        return pVar.b(i, i2, i3, i4);
    }

    public final p b(int i, int i2, int i3, int i4) {
        return new p(i, i2, i3, i4);
    }

    public final int d() {
        return this.d;
    }

    public final int e() {
        return this.d - this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.a == pVar.a && this.b == pVar.b && this.c == pVar.c && this.d == pVar.d;
    }

    public final int f() {
        return this.a;
    }

    public final int g() {
        return this.c;
    }

    public final int h() {
        return this.b;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.a) * 31) + Integer.hashCode(this.b)) * 31) + Integer.hashCode(this.c)) * 31) + Integer.hashCode(this.d);
    }

    public final long i() {
        return n.f((this.b & 4294967295L) | (this.a << 32));
    }

    public final int j() {
        return this.c - this.a;
    }

    public final boolean k() {
        return this.a >= this.c || this.b >= this.d;
    }

    public final p l(int i, int i2) {
        return new p(this.a + i, this.b + i2, this.c + i, this.d + i2);
    }

    public String toString() {
        return "IntRect.fromLTRB(" + this.a + ", " + this.b + ", " + this.c + ", " + this.d + ')';
    }
}
