package za;

import android.hardware.display.DisplayManager;
import android.view.View;
import android.view.ViewParent;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Map;
import za.b4;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class f5 extends s3 {
    public f5(R3 r3) {
        super(r3);
    }

    public static /* synthetic */ void E(Qa.l lVar, String str) {
        G(lVar, str);
    }

    public static /* synthetic */ void G(Qa.l lVar, String str) {
        T3.e(str, lVar);
    }

    public void A(WebView webView, b4.b bVar) {
        webView.setWebChromeClient(bVar);
    }

    public void B(boolean z) {
        WebView.setWebContentsDebuggingEnabled(z);
    }

    public void C(WebView webView, WebViewClient webViewClient) {
        webView.setWebViewClient(webViewClient);
    }

    public WebSettings D(WebView webView) {
        return webView.getSettings();
    }

    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public R3 i() {
        return (R3) super.i();
    }

    public void c(WebView webView, m0 m0Var) {
        webView.addJavascriptInterface(m0Var, m0Var.a);
    }

    public boolean d(WebView webView) {
        return webView.canGoBack();
    }

    public boolean e(WebView webView) {
        return webView.canGoForward();
    }

    public void f(WebView webView, boolean z) {
        webView.clearCache(z);
    }

    public void g(WebView webView) {
        webView.destroy();
    }

    public void h(WebView webView, String str, Qa.l lVar) {
        webView.evaluateJavascript(str, new c5(lVar));
    }

    public String j(WebView webView) {
        return webView.getTitle();
    }

    public String k(WebView webView) {
        return webView.getUrl();
    }

    public void l(WebView webView) {
        webView.goBack();
    }

    public void m(WebView webView) {
        webView.goForward();
    }

    public void n(WebView webView, String str, String str2, String str3) {
        webView.loadData(str, str2, str3);
    }

    public void o(WebView webView, String str, String str2, String str3, String str4, String str5) {
        webView.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    public void p(WebView webView, String str, Map map) {
        webView.loadUrl(str, map);
    }

    public WebView s() {
        Z z = new Z();
        DisplayManager displayManager = (DisplayManager) i().O().getSystemService("display");
        z.b(displayManager);
        a aVar = new a(this);
        z.a(displayManager);
        return aVar;
    }

    public void v(WebView webView, String str, byte[] bArr) {
        webView.postUrl(str, bArr);
    }

    public void w(WebView webView) {
        webView.reload();
    }

    public void x(WebView webView, String str) {
        webView.removeJavascriptInterface(str);
    }

    public void y(WebView webView, long j) {
        webView.setBackgroundColor((int) j);
    }

    public void z(WebView webView, DownloadListener downloadListener) {
        webView.setDownloadListener(downloadListener);
    }

    public static class a extends WebView implements io.flutter.plugin.platform.i {
        public final f5 a;
        public WebViewClient b;
        public b4.a c;

        public a(f5 f5Var) {
            super(f5Var.i().O());
            this.a = f5Var;
            this.b = new WebViewClient();
            this.c = new b4.a();
            setWebViewClient(this.b);
            setWebChromeClient(this.c);
        }

        public static /* synthetic */ Ca.I a(Ca.s sVar) {
            return c(sVar);
        }

        public static /* synthetic */ void b(a aVar, int i, int i2, int i3, int i4) {
            aVar.d(i, i2, i3, i4);
        }

        public static /* synthetic */ Ca.I c(Ca.s sVar) {
            return null;
        }

        public final /* synthetic */ void d(int i, int i2, int i3, int i4) {
            this.a.q(this, i, i2, i3, i4, new e5());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final R9.B e() {
            ViewParent viewParent = this;
            while (viewParent.getParent() != null) {
                viewParent = viewParent.getParent();
                if (viewParent instanceof R9.B) {
                    return (R9.B) viewParent;
                }
            }
            return null;
        }

        public WebChromeClient getWebChromeClient() {
            return this.c;
        }

        public void onAttachedToWindow() {
            R9.B e;
            super.onAttachedToWindow();
            if (!this.a.i().S(26) || (e = e()) == null) {
                return;
            }
            R9.z.a(e, 1);
        }

        public void onScrollChanged(int i, int i2, int i3, int i4) {
            super.onScrollChanged(i, i2, i3, i4);
            this.a.i().R(new d5(this, i, i2, i3, i4));
        }

        public void setWebChromeClient(WebChromeClient webChromeClient) {
            super.setWebChromeClient(webChromeClient);
            if (!(webChromeClient instanceof b4.a)) {
                throw new AssertionError("Client must be a SecureWebChromeClient.");
            }
            b4.a aVar = (b4.a) webChromeClient;
            this.c = aVar;
            aVar.b(this.b);
        }

        public void setWebViewClient(WebViewClient webViewClient) {
            super.setWebViewClient(webViewClient);
            this.b = webViewClient;
            this.c.b(webViewClient);
        }

        public void dispose() {
        }

        public View getView() {
            return this;
        }
    }
}
