package r5;

import android.content.Context;
import java.io.File;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class c {

    public interface a {
        void a(Context context, String[] strArr, String str, File file, r5.d dVar);
    }

    public interface b {
        void a(String str);

        String b(String str);

        String c(String str);

        String[] d();

        void e(String str);
    }

    public interface c {
    }

    public interface d {
        void a(String str);
    }

    public static r5.d a(d dVar) {
        return new r5.d().h(dVar);
    }
}
