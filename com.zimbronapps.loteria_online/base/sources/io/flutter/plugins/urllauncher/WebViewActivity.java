package io.flutter.plugins.urllauncher;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class WebViewActivity extends Activity {
    public WebView c;
    public final BroadcastReceiver a = new a();
    public final WebViewClient b = new b();
    public final IntentFilter d = new IntentFilter("close action");

    public class a extends BroadcastReceiver {
        public a() {
        }

        public void onReceive(Context context, Intent intent) {
            if ("close action".equals(intent.getAction())) {
                WebViewActivity.this.finish();
            }
        }
    }

    public class b extends WebViewClient {
        public b() {
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return super.shouldOverrideUrlLoading(webView, str);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            webView.loadUrl(webResourceRequest.getUrl().toString());
            return false;
        }
    }

    public class c extends WebChromeClient {

        public class a extends WebViewClient {
            public a() {
            }

            public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                WebViewActivity.this.c.loadUrl(webResourceRequest.getUrl().toString());
                return true;
            }

            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                WebViewActivity.this.c.loadUrl(str);
                return true;
            }
        }

        public c() {
        }

        public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            a aVar = new a();
            WebView webView2 = new WebView(WebViewActivity.this.c.getContext());
            webView2.setWebViewClient(aVar);
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }
    }

    public static Intent a(Context context, String str, boolean z, boolean z2, Bundle bundle) {
        return new Intent(context, WebViewActivity.class).putExtra("url", str).putExtra("enableJavaScript", z).putExtra("enableDomStorage", z2).putExtra("com.android.browser.headers", bundle);
    }

    public static Map b(Bundle bundle) {
        if (bundle == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            hashMap.put(str, bundle.getString(str));
        }
        return hashMap;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WebView webView = new WebView(this);
        this.c = webView;
        setContentView(webView);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("url");
        boolean booleanExtra = intent.getBooleanExtra("enableJavaScript", false);
        boolean booleanExtra2 = intent.getBooleanExtra("enableDomStorage", false);
        this.c.loadUrl(stringExtra, b(intent.getBundleExtra("com.android.browser.headers")));
        this.c.getSettings().setJavaScriptEnabled(booleanExtra);
        this.c.getSettings().setDomStorageEnabled(booleanExtra2);
        this.c.setWebViewClient(this.b);
        this.c.getSettings().setSupportMultipleWindows(true);
        this.c.setWebChromeClient(new c());
        H1.a.registerReceiver(this, this.a, this.d, 2);
    }

    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.a);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !this.c.canGoBack()) {
            return super.onKeyDown(i, keyEvent);
        }
        this.c.goBack();
        return true;
    }
}
