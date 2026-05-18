package rb;

import kotlin.jvm.internal.t;
import ob.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface f {
    d C(qb.e eVar, int i);

    void D(int i);

    void F(String str);

    vb.e a();

    d b(qb.e eVar);

    f f(qb.e eVar);

    void g(double d);

    void h(qb.e eVar, int i);

    void i(byte b);

    void l(k kVar, Object obj);

    void p(long j);

    void s();

    void t(short s);

    void u(boolean z);

    void w(float f);

    void x(char c);

    void y();

    public static final class a {
        public static d a(f fVar, qb.e descriptor, int i) {
            t.g(descriptor, "descriptor");
            return fVar.b(descriptor);
        }

        public static void c(f fVar, k serializer, Object obj) {
            t.g(serializer, "serializer");
            if (serializer.getDescriptor().b()) {
                fVar.l(serializer, obj);
            } else if (obj == null) {
                fVar.s();
            } else {
                fVar.y();
                fVar.l(serializer, obj);
            }
        }

        public static void d(f fVar, k serializer, Object obj) {
            t.g(serializer, "serializer");
            serializer.serialize(fVar, obj);
        }

        public static void b(f fVar) {
        }
    }
}
