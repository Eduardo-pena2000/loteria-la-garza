package t7;

import java.io.Serializable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class g extends I implements Serializable {
    public final s7.g a;
    public final I b;

    public g(s7.g gVar, I i) {
        this.a = (s7.g) s7.m.j(gVar);
        this.b = (I) s7.m.j(i);
    }

    public int compare(Object obj, Object obj2) {
        return this.b.compare(this.a.apply(obj), this.a.apply(obj2));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a.equals(gVar.a) && this.b.equals(gVar.b);
    }

    public int hashCode() {
        return s7.k.b(this.a, this.b);
    }

    public String toString() {
        return this.b + ".onResultOf(" + this.a + ")";
    }
}
