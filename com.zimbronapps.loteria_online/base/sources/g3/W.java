package g3;

import U2.x1;
import android.os.Handler;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface w {

    public interface a {
    }

    public static final class b {
        public final Object a;
        public final int b;
        public final int c;
        public final long d;
        public final int e;

        public b(Object obj) {
            this(obj, -1L);
        }

        public b a(Object obj) {
            return this.a.equals(obj) ? this : new b(obj, this.b, this.c, this.d, this.e);
        }

        public boolean b() {
            return this.b != -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e;
        }

        public int hashCode() {
            return ((((((((527 + this.a.hashCode()) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
        }

        public b(Object obj, long j) {
            this(obj, -1, -1, j, -1);
        }

        public b(Object obj, long j, int i) {
            this(obj, -1, -1, j, i);
        }

        public b(Object obj, int i, int i2, long j) {
            this(obj, i, i2, j, -1);
        }

        public b(Object obj, int i, int i2, long j, int i3) {
            this.a = obj;
            this.b = i;
            this.c = i2;
            this.d = j;
            this.e = i3;
        }
    }

    public interface c {
        void a(w wVar, M2.G g);
    }

    void a(Handler handler, D d);

    void b(Handler handler, Y2.t tVar);

    void c(v vVar);

    void d(c cVar, R2.x xVar, x1 x1Var);

    M2.u f();

    void g(D d);

    void h(Y2.t tVar);

    void i(c cVar);

    void j(c cVar);

    void k(c cVar);

    v l(b bVar, k3.b bVar2, long j);

    void n();

    default boolean o() {
        return true;
    }

    default M2.G p() {
        return null;
    }

    default void e(M2.u uVar) {
    }
}
