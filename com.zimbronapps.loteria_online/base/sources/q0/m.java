package q0;

import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class m {
    public final int a;
    public final long b;
    public final n c;
    public final S0.f d;

    public m(int i, long j, n nVar, S0.f fVar) {
        this.a = i;
        this.b = j;
        this.c = nVar;
        this.d = fVar;
    }

    public final int a() {
        return this.a;
    }

    public final S0.f b() {
        return this.d;
    }

    public final n c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.a == mVar.a && this.b == mVar.b && this.c == mVar.c && t.c(this.d, mVar.d);
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.a) * 31) + Long.hashCode(this.b)) * 31) + this.c.hashCode()) * 31;
        S0.f fVar = this.d;
        return hashCode + (fVar == null ? 0 : fVar.hashCode());
    }

    public String toString() {
        return "ContentCaptureEvent(id=" + this.a + ", timestamp=" + this.b + ", type=" + this.c + ", structureCompat=" + this.d + ')';
    }
}
