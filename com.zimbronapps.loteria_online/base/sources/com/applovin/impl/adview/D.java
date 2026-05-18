package com.applovin.impl.adview;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
class d {
    private final com.applovin.impl.sdk.k a;
    private final WebViewRenderProcessClient b = new a();

    public class a extends WebViewRenderProcessClient {
        public a() {
        }

        public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        }

        public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
            if (webView instanceof b) {
                com.applovin.impl.sdk.ad.b currentAd = ((b) webView).getCurrentAd();
                d.a(d.this).O();
                if (com.applovin.impl.sdk.o.a()) {
                    d.a(d.this).O().b("AdWebViewRenderProcessClient", "WebView render process unresponsive for ad: " + currentAd);
                }
            }
        }
    }

    public d(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
    }

    public static /* synthetic */ com.applovin.impl.sdk.k a(d dVar) {
        return dVar.a;
    }

    public WebViewRenderProcessClient a() {
        return this.b;
    }
}
