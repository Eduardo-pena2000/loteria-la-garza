package O2;

import P2.K;
import android.os.Bundle;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class e {
    public static final String c = K.w0(0);
    public static final String d = K.w0(1);
    public final String a;
    public final int b;

    public e(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public static e a(Bundle bundle) {
        return new e((String) P2.a.e(bundle.getString(c)), bundle.getInt(d));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString(c, this.a);
        bundle.putInt(d, this.b);
        return bundle;
    }
}
