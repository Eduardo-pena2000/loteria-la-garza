package d1;

import android.content.Context;
import android.graphics.Typeface;
import d1.K;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class j extends c {
    public final L d;
    public final int e;
    public boolean f;
    public Typeface g;

    public /* synthetic */ j(L l, int i, K.d dVar, kotlin.jvm.internal.k kVar) {
        this(l, i, dVar);
    }

    public final L b() {
        return this.d;
    }

    public final int c() {
        return this.e;
    }

    public abstract Typeface f(Context context);

    public final Typeface g(Context context) {
        if (!this.f && this.g == null) {
            this.g = f(context);
        }
        this.f = true;
        return this.g;
    }

    public final void h(Typeface typeface) {
        this.g = typeface;
    }

    public j(L l, int i, K.d dVar) {
        super(F.a.b(), k.a, dVar, null);
        this.d = l;
        this.e = i;
    }
}
