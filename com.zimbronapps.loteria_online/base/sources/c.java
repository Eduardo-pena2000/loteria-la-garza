// default package

import Da.u;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c {
    public static final a b = new a(null);
    public final Boolean a;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public final c a(List list) {
            t.g(list, "pigeonVar_list");
            return new c((Boolean) list.get(0));
        }

        public a() {
        }
    }

    public c(Boolean bool) {
        this.a = bool;
    }

    public final List a() {
        return u.e(this.a);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return j.a(a(), ((c) obj).a());
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return "IsEnabledMessage(enabled=" + this.a + ")";
    }
}
