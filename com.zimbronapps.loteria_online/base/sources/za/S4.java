package za;

import android.webkit.WebSettings;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class s4 extends L2 {

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[p0.values().length];
            a = iArr;
            try {
                iArr[p0.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[p0.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[p0.e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public s4(R3 r3) {
        super(r3);
    }

    public String c(WebSettings webSettings) {
        return webSettings.getUserAgentString();
    }

    public void f(WebSettings webSettings, boolean z) {
        webSettings.setAllowContentAccess(z);
    }

    public void g(WebSettings webSettings, boolean z) {
        webSettings.setAllowFileAccess(z);
    }

    public void h(WebSettings webSettings, boolean z) {
        webSettings.setBuiltInZoomControls(z);
    }

    public void i(WebSettings webSettings, boolean z) {
        webSettings.setDisplayZoomControls(z);
    }

    public void j(WebSettings webSettings, boolean z) {
        webSettings.setDomStorageEnabled(z);
    }

    public void k(WebSettings webSettings, boolean z) {
        webSettings.setGeolocationEnabled(z);
    }

    public void l(WebSettings webSettings, boolean z) {
        webSettings.setJavaScriptCanOpenWindowsAutomatically(z);
    }

    public void m(WebSettings webSettings, boolean z) {
        webSettings.setJavaScriptEnabled(z);
    }

    public void n(WebSettings webSettings, boolean z) {
        webSettings.setLoadWithOverviewMode(z);
    }

    public void o(WebSettings webSettings, boolean z) {
        webSettings.setMediaPlaybackRequiresUserGesture(z);
    }

    public void p(WebSettings webSettings, p0 p0Var) {
        int i = a.a[p0Var.ordinal()];
        if (i == 1) {
            webSettings.setMixedContentMode(0);
        } else if (i == 2) {
            webSettings.setMixedContentMode(2);
        } else {
            if (i != 3) {
                return;
            }
            webSettings.setMixedContentMode(1);
        }
    }

    public void q(WebSettings webSettings, boolean z) {
        webSettings.setSupportMultipleWindows(z);
    }

    public void r(WebSettings webSettings, boolean z) {
        webSettings.setSupportZoom(z);
    }

    public void s(WebSettings webSettings, long j) {
        webSettings.setTextZoom((int) j);
    }

    public void t(WebSettings webSettings, boolean z) {
        webSettings.setUseWideViewPort(z);
    }

    public void u(WebSettings webSettings, String str) {
        webSettings.setUserAgentString(str);
    }
}
