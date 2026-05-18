package e5;

import Da.S;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class r {
    public static final a b = new a(null);
    public static final r c = new r(S.h());
    public final Map a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final r a(Map map) {
            return new r(j5.c.b(map), null);
        }

        public a() {
        }
    }

    public /* synthetic */ r(Map map, kotlin.jvm.internal.k kVar) {
        this(map);
    }

    public final Map a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && t.c(this.a, ((r) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "Tags(tags=" + this.a + ')';
    }

    public r(Map map) {
        this.a = map;
    }
}
