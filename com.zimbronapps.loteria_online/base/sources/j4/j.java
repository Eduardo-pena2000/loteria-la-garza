package j4;

import android.os.Bundle;
import java.util.List;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class j {
    public static Bundle a(Bundle bundle) {
        t.g(bundle, "source");
        return bundle;
    }

    public static final void b(Bundle bundle, Bundle bundle2) {
        t.g(bundle2, "from");
        bundle.putAll(bundle2);
    }

    public static final void c(Bundle bundle, String str, Bundle bundle2) {
        t.g(str, "key");
        t.g(bundle2, "value");
        bundle.putBundle(str, bundle2);
    }

    public static final void d(Bundle bundle, String str, List list) {
        t.g(str, "key");
        t.g(list, "value");
        bundle.putStringArrayList(str, k.a(list));
    }

    public static final void e(Bundle bundle, String str) {
        t.g(str, "key");
        bundle.remove(str);
    }
}
