package U7;

import U7.F;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class y extends F.e.d.f {
    public final List a;

    public static final class b extends F.e.d.f.a {
        public List a;

        public F.e.d.f a() {
            List list = this.a;
            if (list != null) {
                return new y(list, null);
            }
            throw new IllegalStateException("Missing required properties: rolloutAssignments");
        }

        public F.e.d.f.a b(List list) {
            if (list == null) {
                throw new NullPointerException("Null rolloutAssignments");
            }
            this.a = list;
            return this;
        }
    }

    public /* synthetic */ y(List list, a aVar) {
        this(list);
    }

    public List b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.f) {
            return this.a.equals(((F.e.d.f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.a + "}";
    }

    public y(List list) {
        this.a = list;
    }
}
