package y;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class i {
    public final o0.e a;
    public final Qa.l b;
    public final z.G c;
    public final boolean d;

    public i(o0.e eVar, Qa.l lVar, z.G g, boolean z) {
        this.a = eVar;
        this.b = lVar;
        this.c = g;
        this.d = z;
    }

    public final o0.e a() {
        return this.a;
    }

    public final z.G b() {
        return this.c;
    }

    public final boolean c() {
        return this.d;
    }

    public final Qa.l d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.t.c(this.a, iVar.a) && kotlin.jvm.internal.t.c(this.b, iVar.b) && kotlin.jvm.internal.t.c(this.c, iVar.c) && this.d == iVar.d;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + Boolean.hashCode(this.d);
    }

    public String toString() {
        return "ChangeSize(alignment=" + this.a + ", size=" + this.b + ", animationSpec=" + this.c + ", clip=" + this.d + ')';
    }
}
