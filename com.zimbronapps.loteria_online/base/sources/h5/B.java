package H5;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class b extends k {
    public final long a;
    public final z5.p b;
    public final z5.i c;

    public b(long j, z5.p pVar, z5.i iVar) {
        this.a = j;
        if (pVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.b = pVar;
        if (iVar == null) {
            throw new NullPointerException("Null event");
        }
        this.c = iVar;
    }

    public z5.i b() {
        return this.c;
    }

    public long c() {
        return this.a;
    }

    public z5.p d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.a == kVar.c() && this.b.equals(kVar.d()) && this.c.equals(kVar.b());
    }

    public int hashCode() {
        long j = this.a;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
