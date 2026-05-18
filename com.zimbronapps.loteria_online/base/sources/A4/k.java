package A4;

import Da.D;
import java.util.List;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class k {
    public final List a;

    public k(List list) {
        t.g(list, "displayFeatures");
        this.a = list;
    }

    public final List a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !t.c(k.class, obj.getClass())) {
            return false;
        }
        return t.c(this.a, ((k) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return D.n0(this.a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, (CharSequence) null, (Qa.l) null, 56, (Object) null);
    }
}
