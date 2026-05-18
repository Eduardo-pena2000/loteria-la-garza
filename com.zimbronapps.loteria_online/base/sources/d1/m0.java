package d1;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import d1.K;
import java.io.File;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class m0 {
    public static final m0 a = new m0();

    public final Typeface a(AssetManager assetManager, String str, Context context, K.d dVar) {
        if (context == null) {
            return null;
        }
        return j0.a(i0.a(l0.a(assetManager, str), c(dVar, context)));
    }

    public final Typeface b(File file, Context context, K.d dVar) {
        if (context == null) {
            return null;
        }
        return j0.a(i0.a(k0.a(file), c(dVar, context)));
    }

    public final FontVariationAxis[] c(K.d dVar, Context context) {
        n1.d a2;
        if (context != null) {
            a2 = n1.a.a(context);
        } else {
            if (dVar.a()) {
                throw new IllegalStateException("Required density, but not provided");
            }
            a2 = n1.f.a(1.0f, 1.0f);
        }
        return Y.d(dVar, a2, Y.c(context));
    }
}
