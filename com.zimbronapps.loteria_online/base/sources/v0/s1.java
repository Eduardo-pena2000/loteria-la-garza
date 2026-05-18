package v0;

import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class s1 {
    public static final Rect a(n1.p pVar) {
        return new Rect(pVar.f(), pVar.h(), pVar.g(), pVar.d());
    }

    public static final Rect b(u0.h hVar) {
        return new Rect((int) hVar.i(), (int) hVar.l(), (int) hVar.j(), (int) hVar.e());
    }

    public static final RectF c(u0.h hVar) {
        return new RectF(hVar.i(), hVar.l(), hVar.j(), hVar.e());
    }

    public static final n1.p d(Rect rect) {
        return new n1.p(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final u0.h e(Rect rect) {
        return new u0.h(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final u0.h f(RectF rectF) {
        return new u0.h(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
