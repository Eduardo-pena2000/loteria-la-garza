package X;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class X {
    public final M.a a;
    public final M.a b;
    public final M.a c;
    public final M.a d;
    public final M.a e;

    public X(M.a aVar, M.a aVar2, M.a aVar3, M.a aVar4, M.a aVar5) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.d = aVar4;
        this.e = aVar5;
    }

    public final M.a a() {
        return this.e;
    }

    public final M.a b() {
        return this.a;
    }

    public final M.a c() {
        return this.d;
    }

    public final M.a d() {
        return this.c;
    }

    public final M.a e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return false;
        }
        X x = (X) obj;
        return kotlin.jvm.internal.t.c(this.a, x.a) && kotlin.jvm.internal.t.c(this.b, x.b) && kotlin.jvm.internal.t.c(this.c, x.c) && kotlin.jvm.internal.t.c(this.d, x.d) && kotlin.jvm.internal.t.c(this.e, x.e);
    }

    public int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", extraLarge=" + this.e + ')';
    }

    public /* synthetic */ X(M.a aVar, M.a aVar2, M.a aVar3, M.a aVar4, M.a aVar5, int i, kotlin.jvm.internal.k kVar) {
        this((i & 1) != 0 ? W.a.b() : aVar, (i & 2) != 0 ? W.a.e() : aVar2, (i & 4) != 0 ? W.a.d() : aVar3, (i & 8) != 0 ? W.a.c() : aVar4, (i & 16) != 0 ? W.a.a() : aVar5);
    }
}
