package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzbpd extends WebViewClient {
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.doUpdateVisitedHistory(webView, str, z);
    }

    public abstract WebViewClient getDelegate();

    public void onFormResubmission(WebView webView, Message message, Message message2) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onFormResubmission(webView, message, message2);
    }

    public void onLoadResource(WebView webView, String str) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onLoadResource(webView, str);
    }

    public void onPageCommitVisible(WebView webView, String str) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onPageCommitVisible(webView, str);
    }

    public void onPageFinished(WebView webView, String str) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onPageFinished(webView, str);
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onPageStarted(webView, str, bitmap);
    }

    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onReceivedError(webView, i, str, str2);
    }

    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onReceivedLoginRequest(webView, str, str2, str3);
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return false;
        }
        return p.a(delegate, webView, renderProcessGoneDetail);
    }

    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        o.a(delegate, webView, webResourceRequest, i, safeBrowsingResponse);
    }

    public void onScaleChanged(WebView webView, float f, float f2) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onScaleChanged(webView, f, f2);
    }

    public void onTooManyRedirects(WebView webView, Message message, Message message2) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onTooManyRedirects(webView, message, message2);
    }

    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onUnhandledKeyEvent(webView, keyEvent);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return null;
        }
        return delegate.shouldInterceptRequest(webView, webResourceRequest);
    }

    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return false;
        }
        return delegate.shouldOverrideKeyEvent(webView, keyEvent);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return false;
        }
        return delegate.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return null;
        }
        return delegate.shouldInterceptRequest(webView, str);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return false;
        }
        return delegate.shouldOverrideUrlLoading(webView, str);
    }
}
