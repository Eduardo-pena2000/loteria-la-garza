package w8;

import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class e {
    public final Map a;

    public static class a {
        public Map a = new HashMap();

        public static /* synthetic */ Map a(a aVar) {
            return aVar.a;
        }

        public e b() {
            return new e(this);
        }

        public a c(String str, double d) {
            this.a.put(str, Double.toString(d));
            return this;
        }

        public a d(String str, long j) {
            this.a.put(str, Long.toString(j));
            return this;
        }

        public a e(String str, String str2) {
            this.a.put(str, str2);
            return this;
        }
    }

    public e(a aVar) {
        this.a = a.a(aVar);
    }
}
