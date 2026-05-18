package v8;

import L7.q;
import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class h {

    public interface a {
        String a(Object obj);
    }

    public static /* synthetic */ f a(String str, a aVar, L7.d dVar) {
        return d(str, aVar, dVar);
    }

    public static L7.c b(String str, String str2) {
        return L7.c.l(f.a(str, str2), f.class);
    }

    public static L7.c c(String str, a aVar) {
        return L7.c.m(f.class).b(q.l(Context.class)).f(new g(str, aVar)).d();
    }

    public static /* synthetic */ f d(String str, a aVar, L7.d dVar) {
        return f.a(str, aVar.a((Context) dVar.a(Context.class)));
    }
}
