package com.applovin.sdk;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.e8;
import com.applovin.impl.n7;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t4;
import com.applovin.impl.x4;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class AppLovinWebViewActivity extends Activity {
    public static final String EVENT_DISMISSED_VIA_BACK_BUTTON = "dismissed_via_back_button";
    public static final String INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON = "immersive_mode_on";
    public static final String INTENT_EXTRA_KEY_LOAD_URL = "load_url";
    public static final String INTENT_EXTRA_KEY_SDK_KEY = "sdk_key";
    public static final String URI_PATH_WEBVIEW_EVENT = "webview_event";
    private final AtomicBoolean a = new AtomicBoolean();
    private String b;
    private WebView c;
    private EventListener d;

    public interface EventListener {
        void onReceivedEvent(String str);
    }

    public static /* synthetic */ EventListener a(AppLovinWebViewActivity appLovinWebViewActivity) {
        return appLovinWebViewActivity.d;
    }

    public static /* synthetic */ WebView b(AppLovinWebViewActivity appLovinWebViewActivity) {
        return appLovinWebViewActivity.c;
    }

    public static /* synthetic */ AtomicBoolean c(AppLovinWebViewActivity appLovinWebViewActivity) {
        return appLovinWebViewActivity.a;
    }

    public static /* synthetic */ String d(AppLovinWebViewActivity appLovinWebViewActivity) {
        return appLovinWebViewActivity.b;
    }

    public void loadUrl(String str, EventListener eventListener) {
        this.d = eventListener;
        this.b = str;
        this.a.set(false);
        WebView webView = this.c;
        if (webView != null) {
            webView.loadUrl(str);
        }
    }

    public void onBackPressed() {
        EventListener eventListener = this.d;
        if (eventListener != null) {
            eventListener.onReceivedEvent("dismissed_via_back_button");
        }
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (TextUtils.isEmpty(getIntent().getStringExtra("sdk_key"))) {
            o.h("AppLovinWebViewActivity", "No SDK key specified");
            finish();
            return;
        }
        k a2 = AppLovinSdk.getInstance(getApplicationContext()).a();
        e8.a(findViewById(16908290), a2);
        a(a2);
        if (getIntent().getBooleanExtra("immersive_mode_on", false)) {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        }
        String stringExtra = getIntent().getStringExtra("load_url");
        if (StringUtils.isValidString(stringExtra)) {
            this.b = stringExtra;
        }
        if (StringUtils.isValidString(this.b)) {
            this.c.loadUrl(this.b);
        }
    }

    public static /* synthetic */ WebView a(AppLovinWebViewActivity appLovinWebViewActivity, WebView webView) {
        appLovinWebViewActivity.c = webView;
        return webView;
    }

    public static /* synthetic */ void a(AppLovinWebViewActivity appLovinWebViewActivity, k kVar) {
        appLovinWebViewActivity.a(kVar);
    }

    private void a(k kVar) {
        WebView b = n7.b((Context) this, "WebView Activity");
        this.c = b;
        if (b == null) {
            finish();
            return;
        }
        setContentView(b);
        WebSettings settings = this.c.getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        this.c.setVerticalScrollBarEnabled(true);
        this.c.setHorizontalScrollBarEnabled(true);
        this.c.setScrollBarStyle(33554432);
        this.c.setWebViewClient(new a(kVar));
    }

    public class a extends t4 {
        final /* synthetic */ k a;

        public a(k kVar) {
            this.a = kVar;
        }

        private /* synthetic */ void a(k kVar) {
            if (!((Boolean) kVar.a(x4.S5)).booleanValue() || !AppLovinWebViewActivity.c(AppLovinWebViewActivity.this).compareAndSet(false, true)) {
                AppLovinWebViewActivity.this.finish();
                return;
            }
            AppLovinWebViewActivity.a(AppLovinWebViewActivity.this, kVar);
            if (StringUtils.isValidString(AppLovinWebViewActivity.d(AppLovinWebViewActivity.this))) {
                AppLovinWebViewActivity.b(AppLovinWebViewActivity.this).loadUrl(AppLovinWebViewActivity.d(AppLovinWebViewActivity.this));
            }
        }

        public static /* synthetic */ void b(a aVar, k kVar) {
            aVar.a(kVar);
        }

        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (AppLovinWebViewActivity.b(AppLovinWebViewActivity.this) == webView) {
                AppLovinWebViewActivity.b(AppLovinWebViewActivity.this).destroy();
                AppLovinWebViewActivity.a(AppLovinWebViewActivity.this, (WebView) null);
                AppLovinWebViewActivity.this.runOnUiThread(new com.applovin.sdk.a(this, this.a));
            }
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            String host = parse.getHost();
            String path = parse.getPath();
            this.a.O();
            if (o.a()) {
                this.a.O().a("AppLovinWebViewActivity", "Handling url load: " + str);
            }
            if (!"applovin".equalsIgnoreCase(scheme) || !"com.applovin.sdk".equalsIgnoreCase(host) || AppLovinWebViewActivity.a(AppLovinWebViewActivity.this) == null) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            if (!path.endsWith("webview_event")) {
                return true;
            }
            Set queryParameterNames = parse.getQueryParameterNames();
            String str2 = queryParameterNames.isEmpty() ? "" : (String) queryParameterNames.toArray()[0];
            if (!StringUtils.isValidString(str2)) {
                this.a.O();
                if (!o.a()) {
                    return true;
                }
                this.a.O().b("AppLovinWebViewActivity", "Failed to parse WebView event parameter");
                return true;
            }
            String queryParameter = parse.getQueryParameter(str2);
            this.a.O();
            if (o.a()) {
                this.a.O().a("AppLovinWebViewActivity", "Parsed WebView event parameter name: " + str2 + " and value: " + queryParameter);
            }
            AppLovinWebViewActivity.a(AppLovinWebViewActivity.this).onReceivedEvent(queryParameter);
            return true;
        }

        public Map a() {
            return CollectionUtils.hashMap("name", "AppLovinWebViewActivity");
        }
    }
}
