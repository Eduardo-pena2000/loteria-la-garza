package Y1;

import android.os.Bundle;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class i {
    public static final a h = new a(null);
    public final String a;
    public final Bundle b;
    public final Bundle c;
    public final boolean d;
    public final boolean e;
    public final Set f;
    public final int g;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public a() {
        }
    }

    public i(String str, Bundle bundle, Bundle bundle2, boolean z, boolean z2, Set set, int i) {
        kotlin.jvm.internal.t.g(str, "type");
        kotlin.jvm.internal.t.g(bundle, "requestData");
        kotlin.jvm.internal.t.g(bundle2, "candidateQueryData");
        kotlin.jvm.internal.t.g(set, "allowedProviders");
        this.a = str;
        this.b = bundle;
        this.c = bundle2;
        this.d = z;
        this.e = z2;
        this.f = set;
        this.g = i;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z2);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z2);
        bundle.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", i);
        bundle2.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", i);
    }

    public final Set a() {
        return this.f;
    }

    public final Bundle b() {
        return this.c;
    }

    public final Bundle c() {
        return this.b;
    }

    public final String d() {
        return this.a;
    }

    public final boolean e() {
        return this.d;
    }
}
