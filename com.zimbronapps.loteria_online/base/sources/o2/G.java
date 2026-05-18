package O2;

import P2.K;
import android.os.Bundle;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class g {
    public static final String d = K.w0(0);
    public static final String e = K.w0(1);
    public static final String f = K.w0(2);
    public int a;
    public int b;
    public final int c;

    public g(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static g a(Bundle bundle) {
        return new g(bundle.getInt(d), bundle.getInt(e), bundle.getInt(f));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.a);
        bundle.putInt(e, this.b);
        bundle.putInt(f, this.c);
        return bundle;
    }
}
