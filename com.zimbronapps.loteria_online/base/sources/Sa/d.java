package sa;

import android.util.Log;
import pa.M;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public enum d {
    SMALL(M.d),
    MEDIUM(M.c);

    public final int a;

    d(int i) {
        this.a = i;
    }

    public static d b(int i) {
        if (i >= 0 && i < values().length) {
            return values()[i];
        }
        Log.w("NativeTemplateType", "Invalid template type index: " + i);
        return MEDIUM;
    }

    public int c() {
        return this.a;
    }
}
