package a1;

import android.graphics.RectF;
import android.text.Layout;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class e implements Layout.TextInclusionStrategy {
    public final /* synthetic */ Qa.p a;

    public /* synthetic */ e(Qa.p pVar) {
        this.a = pVar;
    }

    public final boolean isSegmentInside(RectF rectF, RectF rectF2) {
        return f.a(this.a, rectF, rectF2);
    }
}
