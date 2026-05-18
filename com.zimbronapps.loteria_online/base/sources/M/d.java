package M;

import kotlin.jvm.internal.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class d implements b {
    public final float a;

    public /* synthetic */ d(float f, k kVar) {
        this(f);
    }

    public float a(long j, n1.d dVar) {
        return dVar.j1(this.a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && n1.h.i(this.a, ((d) obj).a);
    }

    public int hashCode() {
        return n1.h.k(this.a);
    }

    public String toString() {
        return "CornerSize(size = " + this.a + ".dp)";
    }

    public d(float f) {
        this.a = f;
    }
}
