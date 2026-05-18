package v8;

import L7.q;
import java.util.Iterator;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class c implements i {
    public final String a;
    public final d b;

    public c(Set set, d dVar) {
        this.a = e(set);
        this.b = dVar;
    }

    public static /* synthetic */ i b(L7.d dVar) {
        return d(dVar);
    }

    public static L7.c c() {
        return L7.c.e(i.class).b(q.o(f.class)).f(new b()).d();
    }

    public static /* synthetic */ i d(L7.d dVar) {
        return new c(dVar.d(f.class), d.a());
    }

    public static String e(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            sb.append(fVar.b());
            sb.append('/');
            sb.append(fVar.c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public String a() {
        if (this.b.b().isEmpty()) {
            return this.a;
        }
        return this.a + ' ' + e(this.b.b());
    }
}
