// default package

import Da.u;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class d {
    public static final a b = new a(null);
    public final Boolean a;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public final d a(List list) {
            t.g(list, "pigeonVar_list");
            return new d((Boolean) list.get(0));
        }

        public a() {
        }
    }

    public d(Boolean bool) {
        this.a = bool;
    }

    public final Boolean a() {
        return this.a;
    }

    public final List b() {
        return u.e(this.a);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return j.a(b(), ((d) obj).b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return "ToggleMessage(enable=" + this.a + ")";
    }
}
