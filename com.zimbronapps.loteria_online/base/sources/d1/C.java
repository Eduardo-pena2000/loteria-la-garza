package d1;

import android.content.Context;
import android.graphics.Typeface;
import d1.K;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class c implements t {
    public final int a;
    public final a b;
    public final K.d c;

    public interface a {
        Object a(Context context, c cVar, Ga.e eVar);

        Typeface b(Context context, c cVar);
    }

    public /* synthetic */ c(int i, a aVar, K.d dVar, kotlin.jvm.internal.k kVar) {
        this(i, aVar, dVar);
    }

    public final int a() {
        return this.a;
    }

    public final a d() {
        return this.b;
    }

    public final K.d e() {
        return this.c;
    }

    public c(int i, a aVar, K.d dVar) {
        this.a = i;
        this.b = aVar;
        this.c = dVar;
    }
}
