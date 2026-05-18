package b6;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzbpd;
import com.google.android.gms.internal.ads.zzgzy;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class f0 extends zzbpd {
    public final WebView a;
    public final b0 b;
    public final Executor c;
    public WebViewClient d;

    public f0(WebView webView, b0 b0Var, zzgzy zzgzyVar) {
        this.a = webView;
        this.b = b0Var;
        this.c = zzgzyVar;
    }

    public final /* synthetic */ void a() {
        WebViewClient j;
        try {
            R5.t.g();
            WebView webView = this.a;
            if (Build.VERSION.SDK_INT < 26) {
                if (t4.j.a("GET_WEB_VIEW_CLIENT")) {
                    try {
                        j = t4.i.j(webView);
                    } catch (RuntimeException e) {
                        R5.t.l().zzg(e, "AdUtil.getWebViewClient");
                    }
                }
                throw new IllegalStateException("getWebViewClient not supported");
            }
            j = u4.c.a(webView);
            if (j == this) {
                return;
            }
            if (j != null) {
                this.d = j;
            }
            this.a.setWebViewClient(this);
            b();
        } catch (IllegalStateException unused) {
        }
    }

    public final void b() {
        this.a.evaluateJavascript(String.format(Locale.getDefault(), (String) S5.D.c().zzd(zzbhe.zzlk), new Object[]{this.b.b()}), (ValueCallback) null);
    }

    public final boolean c() {
        if (!((Boolean) zzbjj.zza.zze()).booleanValue()) {
            return false;
        }
        Map allStackTraces = Thread.getAllStackTraces();
        if (allStackTraces == null || !allStackTraces.containsKey(Thread.currentThread())) {
            return true;
        }
        boolean z = false;
        boolean z2 = false;
        for (StackTraceElement stackTraceElement : (StackTraceElement[]) allStackTraces.get(Thread.currentThread())) {
            if (stackTraceElement.getClassName().contains(f0.class.getName())) {
                if (z && z2) {
                    return true;
                }
                z = true;
            } else if (z) {
                z2 = true;
            }
        }
        return false;
    }

    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        if (c()) {
            return;
        }
        super.doUpdateVisitedHistory(webView, str, z);
    }

    public final WebViewClient getDelegate() {
        return this.d;
    }

    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        if (c()) {
            return;
        }
        super.onFormResubmission(webView, message, message2);
    }

    public final void onLoadResource(WebView webView, String str) {
        if (c()) {
            return;
        }
        super.onLoadResource(webView, str);
    }

    public final void onPageCommitVisible(WebView webView, String str) {
        if (c()) {
            return;
        }
        super.onPageCommitVisible(webView, str);
    }

    public final void onPageFinished(WebView webView, String str) {
        if (c()) {
            return;
        }
        b();
        super.onPageFinished(webView, str);
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (c()) {
            return;
        }
        b();
        super.onPageStarted(webView, str, bitmap);
    }

    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        if (c()) {
            return;
        }
        super.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        if (c()) {
            return;
        }
        super.onReceivedError(webView, i, str, str2);
    }

    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        if (c()) {
            return;
        }
        super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (c()) {
            return;
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        if (c()) {
            return;
        }
        super.onReceivedLoginRequest(webView, str, str2, str3);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (c()) {
            return;
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (c()) {
            return false;
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        if (c()) {
            return;
        }
        super.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
    }

    public final void onScaleChanged(WebView webView, float f, float f2) {
        if (c()) {
            return;
        }
        super.onScaleChanged(webView, f, f2);
    }

    public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
        if (c()) {
            return;
        }
        super.onTooManyRedirects(webView, message, message2);
    }

    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        if (c()) {
            return;
        }
        super.onUnhandledKeyEvent(webView, keyEvent);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (c()) {
            return null;
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        if (c()) {
            return false;
        }
        return super.shouldOverrideKeyEvent(webView, keyEvent);
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (c()) {
            return false;
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    public final void zza() {
        this.c.execute(new d0(this));
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (c()) {
            return;
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (c()) {
            return null;
        }
        return super.shouldInterceptRequest(webView, str);
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (c()) {
            return false;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
