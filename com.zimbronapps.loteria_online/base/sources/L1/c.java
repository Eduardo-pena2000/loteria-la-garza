package l1;

import v0.A1;
import v0.h0;
import v0.r0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c implements p {
    public final A1 b;
    public final float c;

    public c(A1 a1, float f) {
        this.b = a1;
        this.c = f;
    }

    public float a() {
        return this.c;
    }

    public final A1 b() {
        return this.b;
    }

    public long e() {
        return r0.b.j();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.t.c(this.b, cVar.b) && Float.compare(this.c, cVar.c) == 0;
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + Float.hashCode(this.c);
    }

    public h0 l() {
        return this.b;
    }

    public String toString() {
        return "BrushStyle(value=" + this.b + ", alpha=" + this.c + ')';
    }
}
