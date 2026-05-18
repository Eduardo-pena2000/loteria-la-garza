package u4;

import android.net.Uri;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import t4.i;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class t implements WebMessageListenerBoundaryInterface {
    public final i.a a;

    public t(i.a aVar) {
        this.a = aVar;
    }

    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z, InvocationHandler invocationHandler2) {
        t4.e b = s.b((WebMessageBoundaryInterface) Lb.a.a(WebMessageBoundaryInterface.class, invocationHandler));
        if (b != null) {
            this.a.onPostMessage(webView, b, uri, z, m.b(invocationHandler2));
        }
    }
}
