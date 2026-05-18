package za;

import android.webkit.ClientCertRequest;
import android.webkit.WebView;
import za.W4;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class v4 implements Runnable {
    public final /* synthetic */ W4.a a;
    public final /* synthetic */ WebView b;
    public final /* synthetic */ ClientCertRequest c;

    public /* synthetic */ v4(W4.a aVar, WebView webView, ClientCertRequest clientCertRequest) {
        this.a = aVar;
        this.b = webView;
        this.c = clientCertRequest;
    }

    public final void run() {
        W4.a.s(this.a, this.b, this.c);
    }
}
