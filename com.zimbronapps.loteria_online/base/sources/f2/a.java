package F2;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class a {
    public static final a b = new a(null);
    public final Map a = new LinkedHashMap();

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends a {
        public static final b c = new b();

        public Object a(c cVar) {
            t.g(cVar, "key");
            return null;
        }
    }

    public interface c {
    }

    public abstract Object a(c cVar);

    public final Map b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof a) && t.c(this.a, ((a) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "CreationExtras(extras=" + this.a + ')';
    }
}
