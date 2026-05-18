package com.applovin.impl;

import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class o8 {
    private static /* synthetic */ void a(WebView webView) {
        ViewGroup parent = webView.getParent();
        if (parent instanceof ViewGroup) {
            parent.removeView(webView);
        }
        webView.removeAllViews();
        webView.loadUrl("about:blank");
        webView.onPause();
        webView.destroyDrawingCache();
        webView.destroy();
    }

    public static /* synthetic */ void b(WebView webView, String str, s4 s4Var) {
        a(webView, str, s4Var);
    }

    public static String c(String str, Map map) {
        String str2;
        str.hashCode();
        if (str.equals("com.applovin.external_redirect_success")) {
            str2 = "success";
        } else {
            if (!str.equals("com.applovin.external_redirect_failure")) {
                return null;
            }
            str2 = "failure";
        }
        return a("al_onExternalRedirectEvent", str2, map);
    }

    public static /* synthetic */ void d(WebView webView, String str) {
        b(webView, str);
    }

    public static /* synthetic */ void e(WebView webView, String str) {
        c(webView, str);
    }

    public static /* synthetic */ void f(WebView webView) {
        a(webView);
    }

    public static void b(WebView webView) {
        if (webView == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new R3(webView));
    }

    public static String d(String str, Map map) {
        String str2;
        str.hashCode();
        if (str.equals("com.applovin.preload_success")) {
            str2 = "success";
        } else {
            if (!str.equals("com.applovin.preload_failure")) {
                return null;
            }
            str2 = "failure";
        }
        return a("al_onPreloadEvent", str2, map);
    }

    public static String b(String str, Map map) {
        String str2;
        str.hashCode();
        switch (str) {
            case "com.applovin.custom_tabs_failure":
                str2 = "failure";
                break;
            case "com.applovin.custom_tabs_hidden":
                str2 = "hidden";
                break;
            case "com.applovin.custom_tabs_shown":
                str2 = "shown";
                break;
            default:
                return null;
        }
        return a("al_onInAppBrowserEvent", str2, map);
    }

    private static /* synthetic */ void c(WebView webView, String str) {
        webView.loadUrl(str);
    }

    private static /* synthetic */ void b(WebView webView, String str) {
        webView.evaluateJavascript(str, (ValueCallback) null);
    }

    public static String a(String str, Map map) {
        String str2;
        str.hashCode();
        if (str.equals("com.applovin.custom_intent_launch_failure")) {
            str2 = "failure";
        } else {
            if (!str.equals("com.applovin.custom_intent_launch_success")) {
                return null;
            }
            str2 = "success";
        }
        return a("al_onCustomIntentLaunchEvent", str2, map);
    }

    public static String a(Map map) {
        return a("al_onWindowInsetsInfoCollectedEvent", "success", map);
    }

    private static String a(String str, String str2, Map map) {
        JSONObject jSONObject;
        try {
            jSONObject = CollectionUtils.toJson(map);
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
        }
        return "javascript:" + str + "('" + str2 + "'," + jSONObject + ");";
    }

    public static void a(WebView webView, String str, String str2, com.applovin.impl.sdk.k kVar) {
        if (webView == null) {
            return;
        }
        try {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a(str2, "Forwarding \"" + str + "\" to WebView");
            }
            AppLovinSdkUtils.runOnUiThread(new S3(webView, str));
        } catch (Throwable th) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a(str2, "Unable to forward to WebView", th);
            }
            kVar.D().a(str2, th, (Map) CollectionUtils.hashMap("operation", str));
        }
    }

    public static void a(WebView webView, String str) {
        if (webView == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new U3(webView, str));
    }

    public static s4 a(WebView webView, String str, com.applovin.impl.sdk.k kVar) {
        s4 s4Var = new s4("evaluateJavascript");
        if (webView == null) {
            return s4Var.a("null_webview");
        }
        AppLovinSdkUtils.runOnUiThread(new Q3(webView, str, s4Var));
        Long l = (Long) kVar.a(x4.R2);
        if (l.longValue() > 0) {
            i6.a(l.longValue(), s4Var, "timed_out", "evaluateJavascriptTimeout", kVar);
        } else {
            s4Var.b(null);
        }
        return s4Var;
    }

    private static /* synthetic */ void a(WebView webView, String str, s4 s4Var) {
        Objects.requireNonNull(s4Var);
        webView.evaluateJavascript(str, new T3(s4Var));
    }
}
