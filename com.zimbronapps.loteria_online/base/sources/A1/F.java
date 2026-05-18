package a1;

import android.graphics.RectF;
import android.text.SegmentFinder;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class f {
    public static final f a = new f();

    public static /* synthetic */ boolean a(Qa.p pVar, RectF rectF, RectF rectF2) {
        return b(pVar, rectF, rectF2);
    }

    public static final boolean b(Qa.p pVar, RectF rectF, RectF rectF2) {
        return ((Boolean) pVar.invoke(rectF, rectF2)).booleanValue();
    }

    public final int[] c(o0 o0Var, RectF rectF, int i, Qa.p pVar) {
        SegmentFinder a2;
        if (i == 1) {
            a2 = b1.a.a.a(new b1.j(o0Var.G(), o0Var.I()));
        } else {
            b.a();
            a2 = c.a(a.a(o0Var.G(), o0Var.H()));
        }
        return d.a(o0Var.i(), rectF, a2, new e(pVar));
    }
}
