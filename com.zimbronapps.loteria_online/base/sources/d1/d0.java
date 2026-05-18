package d1;

import android.content.Context;
import android.graphics.Typeface;
import d1.K;
import d1.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class d0 implements a0 {
    private final Typeface e(String str, L l, int i) {
        if (str.length() == 0) {
            return null;
        }
        Typeface d = d(str, l, i);
        if (kotlin.jvm.internal.t.c(d, Typeface.create(Typeface.DEFAULT, i.c(l, i))) || kotlin.jvm.internal.t.c(d, d(null, l, i))) {
            return null;
        }
        return d;
    }

    public Typeface a(String str, L l, int i, K.d dVar, Context context) {
        u.a aVar = u.b;
        return e0.c(kotlin.jvm.internal.t.c(str, aVar.d().h()) ? c(aVar.d(), l, i) : kotlin.jvm.internal.t.c(str, aVar.e().h()) ? c(aVar.e(), l, i) : kotlin.jvm.internal.t.c(str, aVar.c().h()) ? c(aVar.c(), l, i) : kotlin.jvm.internal.t.c(str, aVar.a().h()) ? c(aVar.a(), l, i) : e(str, l, i), dVar, context);
    }

    public Typeface b(L l, int i) {
        return d(null, l, i);
    }

    public Typeface c(P p, L l, int i) {
        Typeface e = e(e0.b(p.h(), l), l, i);
        return e == null ? d(p.h(), l, i) : e;
    }

    public final Typeface d(String str, L l, int i) {
        if (H.f(i, H.b.b()) && kotlin.jvm.internal.t.c(l, L.b.g()) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int c = i.c(l, i);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(c) : Typeface.create(str, c);
    }
}
