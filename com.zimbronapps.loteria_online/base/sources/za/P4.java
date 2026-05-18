package za;

import android.webkit.WebResourceRequest;
import java.util.Collections;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class p4 extends q2 {
    public p4(R3 r3) {
        super(r3);
    }

    public boolean c(WebResourceRequest webResourceRequest) {
        return webResourceRequest.hasGesture();
    }

    public boolean d(WebResourceRequest webResourceRequest) {
        return webResourceRequest.isForMainFrame();
    }

    public boolean e(WebResourceRequest webResourceRequest) {
        return webResourceRequest.isRedirect();
    }

    public String f(WebResourceRequest webResourceRequest) {
        return webResourceRequest.getMethod();
    }

    public Map i(WebResourceRequest webResourceRequest) {
        return webResourceRequest.getRequestHeaders() == null ? Collections.emptyMap() : webResourceRequest.getRequestHeaders();
    }

    public String j(WebResourceRequest webResourceRequest) {
        return webResourceRequest.getUrl().toString();
    }

    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public R3 b() {
        return (R3) super.b();
    }
}
