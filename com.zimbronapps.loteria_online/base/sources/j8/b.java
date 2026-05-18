package J8;

import G8.p;
import G8.q;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class b implements q {
    public final I8.c a;

    public static final class a extends p {
        public final p a;
        public final I8.h b;

        public a(G8.d dVar, Type type, p pVar, I8.h hVar) {
            this.a = new l(dVar, pVar, type);
            this.b = hVar;
        }

        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(O8.a aVar, Collection collection) {
            if (collection == null) {
                aVar.u();
                return;
            }
            aVar.c();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                this.a.c(aVar, it.next());
            }
            aVar.g();
        }
    }

    public b(I8.c cVar) {
        this.a = cVar;
    }

    public p a(G8.d dVar, N8.a aVar) {
        Type d = aVar.d();
        Class c = aVar.c();
        if (!Collection.class.isAssignableFrom(c)) {
            return null;
        }
        Type h = I8.b.h(d, c);
        return new a(dVar, h, dVar.f(N8.a.b(h)), this.a.b(aVar));
    }
}
