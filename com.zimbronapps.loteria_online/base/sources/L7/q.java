package L7;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class q {
    public final E a;
    public final int b;
    public final int c;

    public q(Class cls, int i, int i2) {
        this(E.b(cls), i, i2);
    }

    public static q a(Class cls) {
        return new q(cls, 0, 2);
    }

    public static String b(int i) {
        if (i == 0) {
            return "direct";
        }
        if (i == 1) {
            return "provider";
        }
        if (i == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i);
    }

    public static q h(Class cls) {
        return new q(cls, 0, 0);
    }

    public static q i(E e) {
        return new q(e, 0, 1);
    }

    public static q j(Class cls) {
        return new q(cls, 0, 1);
    }

    public static q k(E e) {
        return new q(e, 1, 0);
    }

    public static q l(Class cls) {
        return new q(cls, 1, 0);
    }

    public static q m(E e) {
        return new q(e, 1, 1);
    }

    public static q n(Class cls) {
        return new q(cls, 1, 1);
    }

    public static q o(Class cls) {
        return new q(cls, 2, 0);
    }

    public E c() {
        return this.a;
    }

    public boolean d() {
        return this.c == 2;
    }

    public boolean e() {
        return this.c == 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.a.equals(qVar.a) && this.b == qVar.b && this.c == qVar.c;
    }

    public boolean f() {
        return this.b == 1;
    }

    public boolean g() {
        return this.b == 2;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i = this.b;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        sb.append(b(this.c));
        sb.append("}");
        return sb.toString();
    }

    public q(E e, int i, int i2) {
        this.a = (E) D.c(e, "Null dependency anInterface.");
        this.b = i;
        this.c = i2;
    }
}
