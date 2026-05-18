package W2;

import R2.j;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class h {
    public static R2.j a(X2.j jVar, String str, X2.i iVar, int i, Map map) {
        return new j.b().i(iVar.b(str)).h(iVar.a).g(iVar.b).f(b(jVar, iVar)).b(i).e(map).a();
    }

    public static String b(X2.j jVar, X2.i iVar) {
        String k = jVar.k();
        return k != null ? k : iVar.b(((X2.b) jVar.c.get(0)).a).toString();
    }
}
