package o2;

import android.os.Build;
import java.io.File;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class m {
    public static final boolean a(File file, File file2) {
        kotlin.jvm.internal.t.g(file, "<this>");
        kotlin.jvm.internal.t.g(file2, "toFile");
        return Build.VERSION.SDK_INT >= 26 ? a.a.a(file, file2) : file.renameTo(file2);
    }
}
