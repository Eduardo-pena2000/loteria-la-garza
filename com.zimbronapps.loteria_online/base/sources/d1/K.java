package d1;

import android.content.Context;
import android.graphics.Typeface;
import d1.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class k implements c.a {
    public static final k a = new k();

    public Object a(Context context, c cVar, Ga.e eVar) {
        throw new UnsupportedOperationException("All preloaded fonts are blocking.");
    }

    public Typeface b(Context context, c cVar) {
        j jVar = cVar instanceof j ? (j) cVar : null;
        if (jVar != null) {
            return jVar.g(context);
        }
        return null;
    }
}
