package R2;

import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class i {
    public static void a(f fVar) {
        if (fVar != null) {
            try {
                fVar.close();
            } catch (IOException unused) {
            }
        }
    }
}
