package za;

import android.os.Message;
import android.webkit.WebView;
import za.W4;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class w4 implements Runnable {
    public final /* synthetic */ W4.a a;
    public final /* synthetic */ WebView b;
    public final /* synthetic */ Message c;
    public final /* synthetic */ Message d;

    public /* synthetic */ w4(W4.a aVar, WebView webView, Message message, Message message2) {
        this.a = aVar;
        this.b = webView;
        this.c = message;
        this.d = message2;
    }

    public final void run() {
        W4.a.b(this.a, this.b, this.c, this.d);
    }
}
