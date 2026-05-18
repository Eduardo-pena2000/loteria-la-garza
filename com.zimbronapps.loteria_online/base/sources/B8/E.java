package B8;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class e {
    public final d a;
    public final d b;
    public final double c;

    public e(d dVar, d dVar2, double d) {
        kotlin.jvm.internal.t.g(dVar, "performance");
        kotlin.jvm.internal.t.g(dVar2, "crashlytics");
        this.a = dVar;
        this.b = dVar2;
        this.c = d;
    }

    public final d a() {
        return this.b;
    }

    public final d b() {
        return this.a;
    }

    public final double c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && this.b == eVar.b && Double.compare(this.c, eVar.c) == 0;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Double.hashCode(this.c);
    }

    public String toString() {
        return "DataCollectionStatus(performance=" + this.a + ", crashlytics=" + this.b + ", sessionSamplingRate=" + this.c + ')';
    }
}
