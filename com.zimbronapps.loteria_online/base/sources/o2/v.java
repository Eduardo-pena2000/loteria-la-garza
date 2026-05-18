package o2;

import java.io.File;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class v {
    public static final t a(File file) {
        kotlin.jvm.internal.t.g(file, "file");
        String absolutePath = file.getCanonicalFile().getAbsolutePath();
        kotlin.jvm.internal.t.f(absolutePath, "file.canonicalFile.absolutePath");
        return u.a(absolutePath);
    }
}
