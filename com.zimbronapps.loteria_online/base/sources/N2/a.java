package n2;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class a {
    public static final File a(Context context, String str) {
        t.g(context, "<this>");
        t.g(str, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), "datastore/" + str);
    }
}
