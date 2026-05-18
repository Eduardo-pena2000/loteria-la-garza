package T;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class u {
    public final N.l a;
    public final long b;
    public final t c;
    public final boolean d;

    public /* synthetic */ u(N.l lVar, long j, t tVar, boolean z, kotlin.jvm.internal.k kVar) {
        this(lVar, j, tVar, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.a == uVar.a && u0.f.j(this.b, uVar.b) && this.c == uVar.c && this.d == uVar.d;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + u0.f.o(this.b)) * 31) + this.c.hashCode()) * 31) + Boolean.hashCode(this.d);
    }

    public String toString() {
        return "SelectionHandleInfo(handle=" + this.a + ", position=" + u0.f.s(this.b) + ", anchor=" + this.c + ", visible=" + this.d + ')';
    }

    public u(N.l lVar, long j, t tVar, boolean z) {
        this.a = lVar;
        this.b = j;
        this.c = tVar;
        this.d = z;
    }
}
