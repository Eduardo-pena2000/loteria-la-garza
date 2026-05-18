package Oa;

import Da.D;
import java.nio.file.DirectoryStream;
import java.nio.file.Path;
import java.util.List;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class e extends b {
    public static final List a(Path path, String glob) {
        t.g(path, "<this>");
        t.g(glob, "glob");
        DirectoryStream a = c.a(path, glob);
        try {
            DirectoryStream a2 = d.a(a);
            t.d(a2);
            List L0 = D.L0(a2);
            Na.c.a(a, null);
            return L0;
        } finally {
        }
    }

    public static /* synthetic */ List b(Path path, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "*";
        }
        return a(path, str);
    }
}
