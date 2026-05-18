package j4;

import Da.Q;
import android.os.Bundle;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class c {
    public static Bundle a(Bundle bundle) {
        t.g(bundle, "source");
        return bundle;
    }

    public static final boolean b(Bundle bundle, String str) {
        t.g(str, "key");
        return bundle.containsKey(str);
    }

    public static final Bundle c(Bundle bundle, String str) {
        t.g(str, "key");
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        d.a(str);
        throw new Ca.i();
    }

    public static final Bundle d(Bundle bundle, String str) {
        t.g(str, "key");
        return bundle.getBundle(str);
    }

    public static final List e(Bundle bundle, String str) {
        t.g(str, "key");
        return bundle.getStringArrayList(str);
    }

    public static final boolean f(Bundle bundle) {
        return bundle.isEmpty();
    }

    public static final Map g(Bundle bundle) {
        Map d = Q.d(bundle.size());
        for (String str : bundle.keySet()) {
            t.d(str);
            d.put(str, bundle.get(str));
        }
        return Q.b(d);
    }
}
