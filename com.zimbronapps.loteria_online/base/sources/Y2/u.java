package Y2;

import U2.x1;
import Y2.m;
import Y2.t;
import android.os.Looper;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface u {
    public static final u a = new a();

    void a(Looper looper, x1 x1Var);

    int b(M2.q qVar);

    m c(t.a aVar, M2.q qVar);

    default b d(t.a aVar, M2.q qVar) {
        return b.a;
    }

    public interface b {
        public static final b a = new v();

        static /* synthetic */ void b() {
            a();
        }

        void release();

        static /* synthetic */ void a() {
        }
    }

    default void e() {
    }

    default void release() {
    }

    public class a implements u {
        public int b(M2.q qVar) {
            return qVar.r != null ? 1 : 0;
        }

        public m c(t.a aVar, M2.q qVar) {
            if (qVar.r == null) {
                return null;
            }
            return new z(new m.a(new N(1), 6001));
        }

        public void a(Looper looper, x1 x1Var) {
        }
    }
}
