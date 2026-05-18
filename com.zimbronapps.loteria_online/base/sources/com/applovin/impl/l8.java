package com.applovin.impl;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class l8 {
    private final com.applovin.impl.sdk.k a;
    private final com.applovin.impl.sdk.o b;
    private WebView c;
    private boolean d;
    private final Set e = Collections.synchronizedSet(new HashSet());

    public class a extends t4 {
        private final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        public static /* synthetic */ void b(a aVar) {
            aVar.b();
        }

        public Map a() {
            return CollectionUtils.hashMap("name", "WebTrackerManagerWebViewClient");
        }

        public void onPageFinished(WebView webView, String str) {
            if (this.a) {
                l8.a(l8.this);
                if (com.applovin.impl.sdk.o.a()) {
                    l8.a(l8.this).a("WebTrackerManager", "Successfully initialized web view for postbacks");
                }
                l8.a(l8.this, true);
            }
        }

        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (webView == l8.b(l8.this)) {
                AppLovinSdkUtils.runOnUiThread(new W2(this));
            } else {
                l8.b(l8.this, webView);
            }
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }

        private /* synthetic */ void b() {
            l8.b(l8.this).destroy();
            l8.a(l8.this, (WebView) null);
        }
    }

    public l8(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        this.b = kVar.O();
    }

    public static /* synthetic */ void a(l8 l8Var, com.applovin.impl.sdk.network.e eVar, AppLovinPostbackListener appLovinPostbackListener) {
        l8Var.b(eVar, appLovinPostbackListener);
    }

    public static /* synthetic */ void b(l8 l8Var, String str) {
        l8Var.c(str);
    }

    public static /* synthetic */ void c(l8 l8Var) {
        l8Var.a();
    }

    public static /* synthetic */ void d(l8 l8Var, AppLovinPostbackListener appLovinPostbackListener, String str, boolean z, String str2, String str3) {
        l8Var.a(appLovinPostbackListener, str, z, str2, str3);
    }

    public static /* synthetic */ void e(l8 l8Var, WebView webView) {
        l8Var.b(webView);
    }

    public static /* synthetic */ com.applovin.impl.sdk.o a(l8 l8Var) {
        return l8Var.b;
    }

    public static /* synthetic */ WebView b(l8 l8Var) {
        return l8Var.c;
    }

    private /* synthetic */ void c(String str) {
        WebView a2 = a(str);
        if (a2 != null) {
            this.e.add(a2);
            AppLovinSdkUtils.runOnUiThreadDelayed(new R2(this, a2), ((Integer) this.a.a(x4.K2)).intValue());
        } else if (com.applovin.impl.sdk.o.a()) {
            this.b.b("WebTrackerManager", "Failed to fire tracker since web view could not be created");
        }
    }

    public static /* synthetic */ boolean a(l8 l8Var, boolean z) {
        l8Var.d = z;
        return z;
    }

    public static /* synthetic */ void b(l8 l8Var, WebView webView) {
        l8Var.b(webView);
    }

    public static /* synthetic */ WebView a(l8 l8Var, WebView webView) {
        l8Var.c = webView;
        return webView;
    }

    public void b() {
        AppLovinSdkUtils.runOnUiThread(new Q2(this));
    }

    private /* synthetic */ void a() {
        WebView a2 = a("<script>window.al_firePostback = function(url) {\n    setTimeout(function() {\n        var img = new Image();\n        img.src = url;\n    }, 100);\n}\n</script>", true);
        this.c = a2;
        if (a2 == null && com.applovin.impl.sdk.o.a()) {
            this.b.b("WebTrackerManager", "Failed to preload postback web view");
        }
    }

    private /* synthetic */ void b(com.applovin.impl.sdk.network.e eVar, AppLovinPostbackListener appLovinPostbackListener) {
        String appendQueryParameters = StringUtils.appendQueryParameters(eVar.f(), eVar.i(), ((Boolean) this.a.a(x4.i3)).booleanValue());
        if (this.c == null) {
            WebView a2 = a("<script>window.al_firePostback = function(url) {\n    setTimeout(function() {\n        var img = new Image();\n        img.src = url;\n    }, 100);\n}\n</script>", true);
            this.c = a2;
            if (a2 == null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.b.b("WebTrackerManager", "Failed to fire postback since web view could not be created");
                }
                appLovinPostbackListener.onPostbackFailure(appendQueryParameters, -1);
                return;
            }
        }
        if (c() && !this.d) {
            if (com.applovin.impl.sdk.o.a()) {
                this.b.b("WebTrackerManager", "Failed to fire postback since web view was not initialized in time");
            }
            Map hashMap = CollectionUtils.hashMap("top_main_method", "firePostback");
            hashMap.put("source", "webViewNotInitialized");
            hashMap.put("url", appendQueryParameters);
            this.a.D().d(d2.b1, hashMap);
            appLovinPostbackListener.onPostbackFailure(appendQueryParameters, -1);
            return;
        }
        String str = "al_firePostback('" + appendQueryParameters + "')";
        if (((Boolean) this.a.a(x4.Q2)).booleanValue()) {
            o8.a(this.c, str, this.a).a(this.a.q0().a("evaluateJavascriptPromise"), new U2(this, appLovinPostbackListener, appendQueryParameters));
        } else {
            o8.a(this.c, str);
            appLovinPostbackListener.onPostbackSuccess(appendQueryParameters);
        }
    }

    public void a(com.applovin.impl.sdk.network.e eVar, AppLovinPostbackListener appLovinPostbackListener) {
        AppLovinSdkUtils.runOnUiThread(new V2(this, eVar, appLovinPostbackListener));
    }

    private /* synthetic */ void a(AppLovinPostbackListener appLovinPostbackListener, String str, boolean z, String str2, String str3) {
        if (z) {
            appLovinPostbackListener.onPostbackSuccess(str);
            return;
        }
        appLovinPostbackListener.onPostbackFailure(str, -1);
        Map map = CollectionUtils.map("top_main_method", "firePostback");
        map.put("source", "evaluateJavascriptFailed");
        map.put("url", str);
        CollectionUtils.putStringIfValid("error_message", str3, map);
        this.a.D().d(d2.b1, map);
    }

    private boolean c() {
        return ((Boolean) this.a.a(x4.P2)).booleanValue();
    }

    private WebView a(String str) {
        return a(str, false);
    }

    private WebView a(String str, boolean z) {
        n7.b();
        WebView b = n7.b(com.applovin.impl.sdk.k.o(), "web tracker");
        if (b == null) {
            return null;
        }
        b.getSettings().setJavaScriptEnabled(true);
        b.setWebViewClient(new a(z && c()));
        b.loadData("<html><head><link rel=\"icon\" href=\"data:,\">" + str + "</head><body></body></html>", "text/html", "UTF-8");
        return b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(WebView webView) {
        if (webView == null || !this.e.remove(webView)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new T2(webView));
    }

    public void b(String str) {
        if (!AppLovinSdkUtils.isValidString(str)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.b.b("WebTrackerManager", "Failed to fire tracker due to empty script string");
            }
        } else {
            if (!str.startsWith("<script")) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.b.b("WebTrackerManager", "Failed to fire tracker due to improperly formatted script tag");
                    return;
                }
                return;
            }
            AppLovinSdkUtils.runOnUiThread(new S2(this, str));
        }
    }
}
