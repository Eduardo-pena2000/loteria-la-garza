package d1;

import android.content.Context;
import android.graphics.Typeface;
import d1.K;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class q extends c {
    public final String d;
    public final L e;
    public final int f;

    public /* synthetic */ q(String str, L l, int i, K.d dVar, kotlin.jvm.internal.k kVar) {
        this(str, l, i, dVar);
    }

    public L b() {
        return this.e;
    }

    public int c() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return p.b(this.d, qVar.d) && kotlin.jvm.internal.t.c(b(), qVar.b()) && H.f(c(), qVar.c()) && kotlin.jvm.internal.t.c(e(), qVar.e());
    }

    public final Typeface f(Context context) {
        return e0.a().a(this.d, b(), c(), e(), context);
    }

    public int hashCode() {
        return (((((p.c(this.d) * 31) + b().hashCode()) * 31) + H.g(c())) * 31) + e().hashCode();
    }

    public String toString() {
        return "Font(familyName=\"" + p.d(this.d) + "\", weight=" + b() + ", style=" + H.h(c()) + ')';
    }

    public q(String str, L l, int i, K.d dVar) {
        super(F.a.c(), S.a, dVar, null);
        this.d = str;
        this.e = l;
        this.f = i;
    }
}
