package za;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import za.W4;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class y4 implements Runnable {
    public final /* synthetic */ W4.a a;
    public final /* synthetic */ WebView b;
    public final /* synthetic */ SslErrorHandler c;
    public final /* synthetic */ SslError d;

    public /* synthetic */ y4(W4.a aVar, WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.a = aVar;
        this.b = webView;
        this.c = sslErrorHandler;
        this.d = sslError;
    }

    public final void run() {
        W4.a.n(this.a, this.b, this.c, this.d);
    }
}
