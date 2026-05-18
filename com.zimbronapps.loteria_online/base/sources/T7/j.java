package t7;

import java.io.Serializable;
import java.util.Comparator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class j extends I implements Serializable {
    public final Comparator a;

    public j(Comparator comparator) {
        this.a = (Comparator) s7.m.j(comparator);
    }

    public int compare(Object obj, Object obj2) {
        return this.a.compare(obj, obj2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.a.equals(((j) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }
}
