package d4;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class t {
    public final long a;
    public final long b;
    public final int c;

    public t(long j, long j2, int i) {
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    public final long a() {
        return this.b;
    }

    public final long b() {
        return this.a;
    }

    public final int c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.a == tVar.a && this.b == tVar.b && this.c == tVar.c;
    }

    public int hashCode() {
        return (((Long.hashCode(this.a) * 31) + Long.hashCode(this.b)) * 31) + Integer.hashCode(this.c);
    }

    public String toString() {
        return "Topic { " + ("TaxonomyVersion=" + this.a + ", ModelVersion=" + this.b + ", TopicCode=" + this.c + " }");
    }
}
