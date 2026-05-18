package G4;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class w {
    public static w d(Context context) {
        return H4.i.k(context);
    }

    public static void e(Context context, androidx.work.a aVar) {
        H4.i.e(context, aVar);
    }

    public abstract p a(String str);

    public final p b(x xVar) {
        return c(Collections.singletonList(xVar));
    }

    public abstract p c(List list);
}
