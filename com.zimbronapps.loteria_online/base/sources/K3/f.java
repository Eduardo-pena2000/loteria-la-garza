package k3;

import M2.y;
import j3.x;
import java.util.regex.Pattern;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class f {

    public static final class a {
        public static final Pattern a = Pattern.compile(".*-.*");

        public static String b(x xVar) {
            P2.a.a(xVar != null);
            int k = y.k(xVar.r().n);
            if (k == -1) {
                k = y.k(xVar.r().m);
            }
            if (k == 1) {
                return "a";
            }
            if (k == 2) {
                return "v";
            }
            return null;
        }

        public abstract f a();

        public abstract a c(long j);

        public abstract a d(String str);

        public abstract a e(String str);

        public abstract a f(String str);
    }

    public abstract R2.j a(R2.j jVar);
}
