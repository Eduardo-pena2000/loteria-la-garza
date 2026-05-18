package com.unity3d.ads.adplayer;

import Ca.s;
import Da.D;
import Da.Q;
import Da.S;
import Da.v;
import Za.E;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.webkit.WebViewClientCompat;
import cb.W;
import cb.x;
import com.unity3d.ads.adplayer.model.ErrorReason;
import com.unity3d.ads.adplayer.model.WebViewClientError;
import com.unity3d.ads.core.domain.GetCachedAsset;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.IntExtensionKt;
import com.unity3d.ads.core.extensions.ViewExtensionsKt;
import fb.N;
import fb.P;
import fb.g;
import fb.z;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import t4.j;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidWebViewClient extends WebViewClientCompat {
    public static final String BLANK_PAGE = "about:blank";
    public static final Companion Companion = new Companion(null);
    private final z _isRenderProcessGone;
    private final x _onLoadFinished;
    private final GetCachedAsset getCachedAsset;
    private final N isRenderProcessGone;
    private final z loadErrors;
    private final W onLoadFinished;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final z webviewType;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public AndroidWebViewClient(GetCachedAsset getCachedAsset, SendDiagnosticEvent sendDiagnosticEvent) {
        t.g(getCachedAsset, "getCachedAsset");
        t.g(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.getCachedAsset = getCachedAsset;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.loadErrors = P.a(v.n());
        x b = cb.z.b(null, 1, null);
        this._onLoadFinished = b;
        this.onLoadFinished = b;
        z a = P.a(Boolean.FALSE);
        this._isRenderProcessGone = a;
        this.isRenderProcessGone = g.b(a);
        this.webviewType = P.a("");
    }

    public final W getOnLoadFinished() {
        return this.onLoadFinished;
    }

    public final N isRenderProcessGone() {
        return this.isRenderProcessGone;
    }

    public void onPageFinished(WebView view, String url) {
        Object value;
        t.g(view, "view");
        t.g(url, "url");
        if (t.c(url, "about:blank")) {
            z zVar = this.loadErrors;
            do {
                value = zVar.getValue();
            } while (!zVar.e(value, D.w0((List) value, new WebViewClientError(url, ErrorReason.REASON_WEB_BLANK, null, 4, null))));
        }
        super/*android.webkit.WebViewClient*/.onPageFinished(view, url);
        this._onLoadFinished.o(this.loadErrors.getValue());
    }

    public void onReceivedError(WebView view, WebResourceRequest request, t4.g error) {
        Object value;
        t.g(view, "view");
        t.g(request, "request");
        t.g(error, "error");
        super.onReceivedError(view, request, error);
        ErrorReason webResourceToErrorReason = j.a("WEB_RESOURCE_ERROR_GET_CODE") ? IntExtensionKt.webResourceToErrorReason(error.b()) : ErrorReason.REASON_UNKNOWN;
        z zVar = this.loadErrors;
        do {
            value = zVar.getValue();
        } while (!zVar.e(value, D.w0((List) value, new WebViewClientError(request.getUrl().toString(), webResourceToErrorReason, null, 4, null))));
    }

    public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
        Object value;
        t.g(view, "view");
        t.g(request, "request");
        t.g(errorResponse, "errorResponse");
        super.onReceivedHttpError(view, request, errorResponse);
        WebViewClientError webViewClientError = new WebViewClientError(request.getUrl().toString(), ErrorReason.REASON_WEB_ERROR_RECEIVED_HTTP, Integer.valueOf(errorResponse.getStatusCode()));
        z zVar = this.loadErrors;
        do {
            value = zVar.getValue();
        } while (!zVar.e(value, D.w0((List) value, webViewClientError)));
    }

    public boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        Object value;
        t.g(view, "view");
        t.g(detail, "detail");
        ViewExtensionsKt.removeViewFromParent(view);
        view.destroy();
        if (this._onLoadFinished.isCompleted()) {
            this._isRenderProcessGone.setValue(Boolean.TRUE);
            return true;
        }
        z zVar = this.loadErrors;
        do {
            value = zVar.getValue();
        } while (!zVar.e(value, D.w0((List) value, new WebViewClientError(String.valueOf(view.getUrl()), ErrorReason.REASON_WEBVIEW_RENDER_PROCESS_GONE, null, 4, null))));
        this._onLoadFinished.o(this.loadErrors.getValue());
        return true;
    }

    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        Map h;
        Object b;
        t.g(view, "view");
        t.g(request, "request");
        Uri url = request.getUrl();
        if (url == null) {
            return super/*android.webkit.WebViewClient*/.shouldInterceptRequest(view, request);
        }
        try {
            try {
                s.a aVar = s.b;
                b = s.b(url.getQueryParameter("webviewType"));
            } catch (Throwable th) {
                s.a aVar2 = s.b;
                b = s.b(Ca.t.a(th));
            }
            if (s.g(b)) {
                b = null;
            }
            String str = (String) b;
            if (str != null && !E.h0(str)) {
                this.webviewType.setValue(str);
            }
            if (t.c(url.getLastPathSegment(), "favicon.ico")) {
                return new WebResourceResponse("image/png", (String) null, (InputStream) null);
            }
            GetCachedAsset getCachedAsset = this.getCachedAsset;
            Uri url2 = request.getUrl();
            t.f(url2, "request.url");
            return getCachedAsset.invoke(url2, (String) this.webviewType.getValue());
        } catch (Throwable th2) {
            String message = th2.getMessage();
            if (message == null || (h = Q.f(Ca.x.a("reason", message))) == null) {
                h = S.h();
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "webview_could_not_handle_intercepted_url", null, h, null, null, null, 58, null);
            return super/*android.webkit.WebViewClient*/.shouldInterceptRequest(view, request);
        }
    }
}
