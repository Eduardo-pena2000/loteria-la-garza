package za;

import android.webkit.WebView;
import za.W4;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class u4 implements Runnable {
    public final /* synthetic */ W4.a a;
    public final /* synthetic */ WebView b;
    public final /* synthetic */ String c;

    public /* synthetic */ u4(W4.a aVar, WebView webView, String str) {
        this.a = aVar;
        this.b = webView;
        this.c = str;
    }

    public final void run() {
        W4.a.u(this.a, this.b, this.c);
    }
}
