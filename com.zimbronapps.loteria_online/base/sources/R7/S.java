package r7;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class s extends t {
    public final int a;
    public final long b;

    public s(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final int a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (this.a == tVar.a() && this.b == tVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        return ((int) (j ^ (j >>> 32))) ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.a + ", eventTimestamp=" + this.b + "}";
    }
}
