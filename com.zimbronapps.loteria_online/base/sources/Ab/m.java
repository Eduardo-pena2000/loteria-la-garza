package ab;

import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class m {
    public final Object a;
    public final long b;

    public /* synthetic */ m(Object obj, long j, kotlin.jvm.internal.k kVar) {
        this(obj, j);
    }

    public final Object a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final Object c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return t.c(this.a, mVar.a) && b.l(this.b, mVar.b);
    }

    public int hashCode() {
        Object obj = this.a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + b.y(this.b);
    }

    public String toString() {
        return "TimedValue(value=" + this.a + ", duration=" + b.K(this.b) + ')';
    }

    public m(Object obj, long j) {
        this.a = obj;
        this.b = j;
    }
}
