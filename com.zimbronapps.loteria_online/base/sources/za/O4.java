package za;

import android.webkit.WebResourceError;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class o4 extends m2 {
    public o4(R3 r3) {
        super(r3);
    }

    public String b(WebResourceError webResourceError) {
        return webResourceError.getDescription().toString();
    }

    public long c(WebResourceError webResourceError) {
        return webResourceError.getErrorCode();
    }
}
