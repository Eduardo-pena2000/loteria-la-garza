package com.unity3d.services.core.webview;

import android.net.Uri;
import com.unity3d.services.core.webview.bridge.WebViewBridgeInterface;
import t4.e;
import t4.i;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class a implements i.a {
    public final /* synthetic */ WebViewBridgeInterface a;

    public /* synthetic */ a(WebViewBridgeInterface webViewBridgeInterface) {
        this.a = webViewBridgeInterface;
    }

    public final void onPostMessage(android.webkit.WebView webView, e eVar, Uri uri, boolean z, t4.a aVar) {
        this.a.onHandleInvocation(webView, eVar, uri, z, aVar);
    }
}
