package j3;

import M2.G;
import M2.H;
import g3.w;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface x extends A {

    public static final class a {
        public final H a;
        public final int[] b;
        public final int c;

        public a(H h, int... iArr) {
            this(h, iArr, 0);
        }

        public a(H h, int[] iArr, int i) {
            if (iArr.length == 0) {
                P2.o.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.a = h;
            this.b = iArr;
            this.c = i;
        }
    }

    public interface b {
        x[] a(a[] aVarArr, k3.d dVar, w.b bVar, G g);
    }

    boolean a(int i, long j);

    int b();

    boolean e(int i, long j);

    void f();

    void g(float f);

    Object h();

    void m();

    int n(long j, List list);

    default boolean o(long j, h3.e eVar, List list) {
        return false;
    }

    void p(long j, long j2, long j3, List list, h3.n[] nVarArr);

    int q();

    M2.q r();

    int s();

    default void i() {
    }

    default void t() {
    }

    default void l(boolean z) {
    }
}
