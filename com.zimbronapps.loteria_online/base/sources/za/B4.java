package za;

import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.List;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class b4 extends k2 {

    public static class a extends WebChromeClient {
        public WebViewClient a;

        public class a extends WebViewClient {
            public final /* synthetic */ WebView a;

            public a(WebView webView) {
                this.a = webView;
            }

            public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                if (a.this.a.shouldOverrideUrlLoading(this.a, webResourceRequest)) {
                    return true;
                }
                this.a.loadUrl(webResourceRequest.getUrl().toString());
                return true;
            }
        }

        public boolean a(WebView webView, Message message, WebView webView2) {
            if (this.a == null) {
                return false;
            }
            a aVar = new a(webView);
            if (webView2 == null) {
                webView2 = new WebView(webView.getContext());
            }
            webView2.setWebViewClient(aVar);
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }

        public void b(WebViewClient webViewClient) {
            this.a = webViewClient;
        }

        public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            return a(webView, message, new WebView(webView.getContext()));
        }
    }

    public static class b extends a {
        public final b4 b;
        public boolean c = false;
        public boolean d = false;
        public boolean e = false;
        public boolean f = false;
        public boolean g = false;

        public b(b4 b4Var) {
            this.b = b4Var;
        }

        public static /* synthetic */ Ca.I c(Ca.s sVar) {
            return v(sVar);
        }

        public static /* synthetic */ Ca.I d(Ca.s sVar) {
            return n(sVar);
        }

        public static /* synthetic */ Ca.I e(b bVar, JsResult jsResult, T3 t3) {
            return bVar.r(jsResult, t3);
        }

        public static /* synthetic */ Ca.I f(Ca.s sVar) {
            return w(sVar);
        }

        public static /* synthetic */ Ca.I g(Ca.s sVar) {
            return u(sVar);
        }

        public static /* synthetic */ Ca.I h(Ca.s sVar) {
            return q(sVar);
        }

        public static /* synthetic */ Ca.I i(Ca.s sVar) {
            return o(sVar);
        }

        public static /* synthetic */ Ca.I j(Ca.s sVar) {
            return p(sVar);
        }

        public static /* synthetic */ Ca.I k(b bVar, JsResult jsResult, T3 t3) {
            return bVar.s(jsResult, t3);
        }

        public static /* synthetic */ Ca.I l(b bVar, JsPromptResult jsPromptResult, T3 t3) {
            return bVar.t(jsPromptResult, t3);
        }

        public static /* synthetic */ Ca.I m(b bVar, boolean z, ValueCallback valueCallback, T3 t3) {
            return bVar.x(z, valueCallback, t3);
        }

        public static /* synthetic */ Ca.I n(Ca.s sVar) {
            return null;
        }

        public static /* synthetic */ Ca.I o(Ca.s sVar) {
            return null;
        }

        public static /* synthetic */ Ca.I p(Ca.s sVar) {
            return null;
        }

        public static /* synthetic */ Ca.I q(Ca.s sVar) {
            return null;
        }

        public static /* synthetic */ Ca.I u(Ca.s sVar) {
            return null;
        }

        public static /* synthetic */ Ca.I v(Ca.s sVar) {
            return null;
        }

        public static /* synthetic */ Ca.I w(Ca.s sVar) {
            return null;
        }

        public void A(boolean z) {
            this.f = z;
        }

        public void B(boolean z) {
            this.g = z;
        }

        public void C(boolean z) {
            this.c = z;
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            this.b.m(this, consoleMessage, new f4());
            return this.d;
        }

        public void onGeolocationPermissionsHidePrompt() {
            this.b.o(this, new d4());
        }

        public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            this.b.q(this, str, callback, new h4());
        }

        public void onHideCustomView() {
            this.b.s(this, new m4());
        }

        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            if (!this.e) {
                return false;
            }
            this.b.u(this, webView, str, str2, T3.a(new i4(this, jsResult)));
            return true;
        }

        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            if (!this.f) {
                return false;
            }
            this.b.w(this, webView, str, str2, T3.a(new c4(this, jsResult)));
            return true;
        }

        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            if (!this.g) {
                return false;
            }
            this.b.y(this, webView, str, str2, str3, T3.a(new e4(this, jsPromptResult)));
            return true;
        }

        public void onPermissionRequest(PermissionRequest permissionRequest) {
            this.b.A(this, permissionRequest, new k4());
        }

        public void onProgressChanged(WebView webView, int i) {
            this.b.C(this, webView, i, new j4());
        }

        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            this.b.E(this, view, customViewCallback, new g4());
        }

        public boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            boolean z = this.c;
            this.b.G(this, webView, fileChooserParams, T3.a(new l4(this, z, valueCallback)));
            return z;
        }

        public final /* synthetic */ Ca.I r(JsResult jsResult, T3 t3) {
            if (!t3.d()) {
                jsResult.confirm();
                return null;
            }
            R3 l = this.b.l();
            Throwable b = t3.b();
            Objects.requireNonNull(b);
            l.Q("WebChromeClientImpl", b);
            return null;
        }

        public final /* synthetic */ Ca.I s(JsResult jsResult, T3 t3) {
            if (!t3.d()) {
                if (Boolean.TRUE.equals(t3.c())) {
                    jsResult.confirm();
                } else {
                    jsResult.cancel();
                }
                return null;
            }
            R3 l = this.b.l();
            Throwable b = t3.b();
            Objects.requireNonNull(b);
            l.Q("WebChromeClientImpl", b);
            return null;
        }

        public final /* synthetic */ Ca.I t(JsPromptResult jsPromptResult, T3 t3) {
            if (t3.d()) {
                R3 l = this.b.l();
                Throwable b = t3.b();
                Objects.requireNonNull(b);
                l.Q("WebChromeClientImpl", b);
                return null;
            }
            String str = (String) t3.c();
            if (str != null) {
                jsPromptResult.confirm(str);
            } else {
                jsPromptResult.cancel();
            }
            return null;
        }

        public final /* synthetic */ Ca.I x(boolean z, ValueCallback valueCallback, T3 t3) {
            if (t3.d()) {
                R3 l = this.b.l();
                Throwable b = t3.b();
                Objects.requireNonNull(b);
                l.Q("WebChromeClientImpl", b);
                return null;
            }
            List list = (List) t3.c();
            Objects.requireNonNull(list);
            List list2 = list;
            if (z) {
                Uri[] uriArr = new Uri[list2.size()];
                for (int i = 0; i < list2.size(); i++) {
                    uriArr[i] = Uri.parse((String) list2.get(i));
                }
                valueCallback.onReceiveValue(uriArr);
            }
            return null;
        }

        public void y(boolean z) {
            this.d = z;
        }

        public void z(boolean z) {
            this.e = z;
        }
    }

    public b4(R3 r3) {
        super(r3);
    }

    public b I() {
        return new b(this);
    }

    public void K(b bVar, boolean z) {
        bVar.y(z);
    }

    public void L(b bVar, boolean z) {
        bVar.z(z);
    }

    public void M(b bVar, boolean z) {
        bVar.A(z);
    }

    public void N(b bVar, boolean z) {
        bVar.B(z);
    }

    public void O(b bVar, boolean z) {
        bVar.C(z);
    }

    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public R3 l() {
        return (R3) super.l();
    }
}
