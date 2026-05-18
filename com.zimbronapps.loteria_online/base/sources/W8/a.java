package w8;

import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class a extends b {
    public final Set a;

    public a(Set set) {
        if (set == null) {
            throw new NullPointerException("Null updatedKeys");
        }
        this.a = set;
    }

    public Set b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            return this.a.equals(((b) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ConfigUpdate{updatedKeys=" + this.a + "}";
    }
}
