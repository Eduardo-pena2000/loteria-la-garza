package u6;

import android.os.Bundle;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class z extends A {
    public z(int i, int i2, Bundle bundle) {
        super(i, i2, bundle);
    }

    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            d(null);
        } else {
            c(new B(4, "Invalid response to one way request", null));
        }
    }

    public final boolean b() {
        return true;
    }
}
