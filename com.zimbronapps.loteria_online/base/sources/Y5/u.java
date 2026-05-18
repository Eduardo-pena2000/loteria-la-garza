package y5;

import java.util.List;
import y5.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class u {

    public static abstract class a {
        public abstract u a();

        public abstract a b(o oVar);

        public abstract a c(List list);

        public abstract a d(Integer num);

        public abstract a e(String str);

        public abstract a f(x xVar);

        public abstract a g(long j);

        public abstract a h(long j);

        public a i(int i) {
            return d(Integer.valueOf(i));
        }

        public a j(String str) {
            return e(str);
        }
    }

    public static a a() {
        return new k.b();
    }

    public abstract o b();

    public abstract List c();

    public abstract Integer d();

    public abstract String e();

    public abstract x f();

    public abstract long g();

    public abstract long h();
}
