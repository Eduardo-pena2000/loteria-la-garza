package d1;

import android.content.Context;
import android.graphics.Typeface;
import d1.H;
import d1.K;
import d1.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c0 implements a0 {
    public Typeface a(String str, L l, int i, K.d dVar, Context context) {
        u.a aVar = u.b;
        return e0.c(kotlin.jvm.internal.t.c(str, aVar.d().h()) ? c(aVar.d(), l, i) : kotlin.jvm.internal.t.c(str, aVar.e().h()) ? c(aVar.e(), l, i) : kotlin.jvm.internal.t.c(str, aVar.c().h()) ? c(aVar.c(), l, i) : kotlin.jvm.internal.t.c(str, aVar.a().h()) ? c(aVar.a(), l, i) : e(str, l, i), dVar, context);
    }

    public Typeface b(L l, int i) {
        return d(null, l, i);
    }

    public Typeface c(P p, L l, int i) {
        return d(p.h(), l, i);
    }

    public final Typeface d(String str, L l, int i) {
        H.a aVar = H.b;
        if (H.f(i, aVar.b()) && kotlin.jvm.internal.t.c(l, L.b.g()) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return b0.a(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), l.o(), H.f(i, aVar.a()));
    }

    public final Typeface e(String str, L l, int i) {
        if (str.length() == 0) {
            return null;
        }
        Typeface d = d(str, l, i);
        if (kotlin.jvm.internal.t.c(d, p0.a.a(Typeface.DEFAULT, l.o(), H.f(i, H.b.a()))) || kotlin.jvm.internal.t.c(d, d(null, l, i))) {
            return null;
        }
        return d;
    }
}
