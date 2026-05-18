package I0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class d {
    public final long a;
    public final long b;
    public long c;

    public /* synthetic */ d(long j, long j2, long j3, kotlin.jvm.internal.k kVar) {
        this(j, j2, j3);
    }

    public final long a() {
        return this.c;
    }

    public final long b() {
        return this.b;
    }

    public final long c() {
        return this.a;
    }

    public String toString() {
        return "HistoricalChange(uptimeMillis=" + this.a + ", position=" + u0.f.s(this.b) + ')';
    }

    public /* synthetic */ d(long j, long j2, kotlin.jvm.internal.k kVar) {
        this(j, j2);
    }

    public d(long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = u0.f.b.c();
    }

    public d(long j, long j2, long j3) {
        this(j, j2, (kotlin.jvm.internal.k) null);
        this.c = j3;
    }
}
