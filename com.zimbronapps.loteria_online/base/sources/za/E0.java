package za;

import android.webkit.WebChromeClient;
import java.util.Arrays;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class e0 extends T0 {
    public e0(R3 r3) {
        super(r3);
    }

    public List b(WebChromeClient.FileChooserParams fileChooserParams) {
        return Arrays.asList(fileChooserParams.getAcceptTypes());
    }

    public String c(WebChromeClient.FileChooserParams fileChooserParams) {
        return fileChooserParams.getFilenameHint();
    }

    public boolean e(WebChromeClient.FileChooserParams fileChooserParams) {
        return fileChooserParams.isCaptureEnabled();
    }

    public d0 f(WebChromeClient.FileChooserParams fileChooserParams) {
        int mode = fileChooserParams.getMode();
        return mode != 0 ? mode != 1 ? mode != 3 ? d0.f : d0.e : d0.d : d0.c;
    }
}
