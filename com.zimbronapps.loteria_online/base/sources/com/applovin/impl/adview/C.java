package com.applovin.impl.adview;

import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.view.MotionEvent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.a8;
import com.applovin.impl.d2;
import com.applovin.impl.f2;
import com.applovin.impl.n7;
import com.applovin.impl.o7;
import com.applovin.impl.r7;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.t4;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinAdSize;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class c extends t4 {
    private final com.applovin.impl.sdk.k a;
    private final com.applovin.impl.sdk.o b;
    private final a c;

    public c(a aVar, com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        this.b = kVar.O();
        this.c = aVar;
    }

    private void b() {
        this.c.z();
    }

    private void c() {
        this.c.a();
    }

    public Map a() {
        HashMap hashMap = CollectionUtils.hashMap("name", "AdWebViewClient");
        hashMap.putAll(f2.a((AppLovinAdImpl) this.c.g()));
        return hashMap;
    }

    public a d() {
        return this.c;
    }

    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        if (com.applovin.impl.sdk.o.a()) {
            this.b.d("AdWebView", "Loaded resource: " + str);
        }
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (com.applovin.impl.sdk.o.a()) {
            this.b.d("AdWebView", "Loaded URL: " + str);
        }
        this.c.a(webView, str);
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        com.applovin.impl.sdk.ad.b g = this.c.g();
        if (com.applovin.impl.sdk.o.a()) {
            this.b.b("AdWebView", "Received HTTP error: " + webResourceResponse + "for url: " + webResourceRequest.getUrl() + " and ad: " + g);
        }
        if (n7.a(webResourceRequest.getUrl().toString(), this.a)) {
            this.a.D().a("adWebViewReceivedHttpError", webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase());
        }
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        com.applovin.impl.sdk.ad.b g = this.c.g();
        String str = "Received SSL error: " + sslError;
        if (com.applovin.impl.sdk.o.a()) {
            this.b.b("AdWebView", str + " for ad: " + g);
        }
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.render_process_gone"), null);
        com.applovin.impl.sdk.ad.b g = this.c.g();
        com.applovin.impl.sdk.o.h("AdWebView", "Render process gone for ad: " + g + ". Process did crash: " + F.a(renderProcessGoneDetail));
        boolean onRenderProcessGone = super.onRenderProcessGone(webView, renderProcessGoneDetail);
        if (((Boolean) this.a.a(x4.R5)).booleanValue()) {
            a(webView, renderProcessGoneDetail, g);
        }
        return onRenderProcessGone;
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url = webResourceRequest.getUrl();
        if (url != null) {
            return a(webView, url.toString());
        }
        if (!com.applovin.impl.sdk.o.a()) {
            return false;
        }
        this.b.b("AdWebView", "No url found for request");
        return false;
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        com.applovin.impl.sdk.ad.b g = this.c.g();
        String str3 = "Received error with error code: " + i + " with description \\'" + str + "\\' for URL: " + str2;
        if (com.applovin.impl.sdk.o.a()) {
            this.b.b("AdWebView", str3 + " for ad: " + g);
        }
        if (n7.a(str2, this.a)) {
            this.a.D().a("adWebViewReceivedError", str2, i, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(android.webkit.WebView r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 679
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.adview.c.a(android.webkit.WebView, java.lang.String):boolean");
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return a(webView, str);
    }

    private void a(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail, com.applovin.impl.sdk.ad.b bVar) {
        if (F.a(renderProcessGoneDetail) && ((Boolean) this.a.a(x4.Y5)).booleanValue()) {
            throw new RuntimeException("Render process crashed. This is likely caused by a crash in an AppLovin ad with ID: " + (bVar != null ? String.valueOf(bVar.getAdIdNumber()) : "null"));
        }
        if (webView == null || !webView.equals(this.c.f())) {
            return;
        }
        this.c.b();
        AppLovinAdSize k = this.c.k();
        if (n7.a(k)) {
            this.c.a(k);
            this.c.F();
        }
    }

    private boolean a(boolean z, com.applovin.impl.sdk.ad.b bVar, Uri uri) {
        if (z) {
            return false;
        }
        boolean Y0 = bVar.Y0();
        a(uri, Y0, bVar, this.a);
        return Y0;
    }

    private static void a(Uri uri, boolean z, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.k kVar) {
        if (kVar.c(x4.R6).contains(uri.getScheme())) {
            return;
        }
        kVar.D().d(d2.J0, a(bVar, uri, z));
    }

    private static Map a(com.applovin.impl.sdk.ad.b bVar, Uri uri, boolean z) {
        Map a = f2.a((AppLovinAdImpl) bVar);
        CollectionUtils.putStringIfValid("url", uri.toString(), a);
        CollectionUtils.putStringIfValid("is_blocked_auto_redirect", String.valueOf(z), a);
        return a;
    }

    private void a(MotionEvent motionEvent) {
        this.c.a(motionEvent);
    }

    private void a(o7 o7Var, b bVar) {
        r7 g1 = o7Var.g1();
        if (g1 != null) {
            a8.a(g1.b(), this.c.j());
            a(bVar, g1.c());
        }
    }

    private void a(b bVar, Uri uri) {
        com.applovin.impl.sdk.ad.b currentAd = bVar.getCurrentAd();
        AppLovinAdView i = this.c.i();
        if (i != null && currentAd != null) {
            if (currentAd instanceof o7) {
                ((o7) currentAd).getAdEventTracker().v();
            }
            this.c.a(currentAd, i, uri, bVar.getAndClearLastClickEvent());
        } else if (com.applovin.impl.sdk.o.a()) {
            this.b.b("AdWebView", "Attempting to track click that is null or not an ApplovinAdView instance for clickedUri = " + uri);
        }
    }

    private void a(Uri uri) {
        String str;
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("success", false);
        String queryParameter = uri.getQueryParameter("type");
        if (booleanQueryParameter) {
            str = "Tracked event: " + queryParameter;
        } else {
            str = "Failed to track event: " + queryParameter;
        }
        n7.a(str, com.applovin.impl.sdk.k.o());
    }
}
