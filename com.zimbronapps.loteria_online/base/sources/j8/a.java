package J8;

import G8.p;
import G8.q;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class a extends p {
    public static final q c = new a();
    public final Class a;
    public final p b;

    public class a implements q {
        public p a(G8.d dVar, N8.a aVar) {
            Class d = aVar.d();
            if (!(d instanceof GenericArrayType) && (!(d instanceof Class) || !d.isArray())) {
                return null;
            }
            Type g = I8.b.g(d);
            return new a(dVar, dVar.f(N8.a.b(g)), I8.b.k(g));
        }
    }

    public a(G8.d dVar, p pVar, Class cls) {
        this.b = new l(dVar, pVar, cls);
        this.a = cls;
    }

    public void c(O8.a aVar, Object obj) {
        if (obj == null) {
            aVar.u();
            return;
        }
        aVar.c();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.b.c(aVar, Array.get(obj, i));
        }
        aVar.g();
    }
}
