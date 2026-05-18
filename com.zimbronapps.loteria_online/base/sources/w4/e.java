package w4;

import android.util.Log;
import androidx.window.extensions.WindowExtensionsProvider;
import kotlin.jvm.internal.P;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class e {
    public static final e a = new e();
    public static final String b = P.b(e.class).e();

    public final int a() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError unused) {
            if (c.a.a() != j.b) {
                return 0;
            }
            Log.d(b, "Embedding extension version not found");
            return 0;
        } catch (UnsupportedOperationException unused2) {
            if (c.a.a() != j.b) {
                return 0;
            }
            Log.d(b, "Stub Extension");
            return 0;
        }
    }
}
