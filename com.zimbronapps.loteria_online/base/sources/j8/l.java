package J8;

import G8.p;
import J8.j;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class l extends p {
    public final G8.d a;
    public final p b;
    public final Type c;

    public l(G8.d dVar, p pVar, Type type) {
        this.a = dVar;
        this.b = pVar;
        this.c = type;
    }

    public static Type d(Type type, Object obj) {
        return obj != null ? ((type instanceof Class) || (type instanceof TypeVariable)) ? obj.getClass() : type : type;
    }

    public static boolean e(p pVar) {
        p d;
        while ((pVar instanceof k) && (d = ((k) pVar).d()) != pVar) {
            pVar = d;
        }
        return pVar instanceof j.b;
    }

    public void c(O8.a aVar, Object obj) {
        p pVar = this.b;
        Type d = d(this.c, obj);
        if (d != this.c) {
            pVar = this.a.f(N8.a.b(d));
            if ((pVar instanceof j.b) && !e(this.b)) {
                pVar = this.b;
            }
        }
        pVar.c(aVar, obj);
    }
}
