package U0;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import kotlin.jvm.internal.t;
import v0.O;
import v0.b1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class a {
    public static final b1 a(b1.a aVar, Resources resources, int i) {
        BitmapDrawable drawable = resources.getDrawable(i, (Resources.Theme) null);
        t.e(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        return O.c(drawable.getBitmap());
    }
}
