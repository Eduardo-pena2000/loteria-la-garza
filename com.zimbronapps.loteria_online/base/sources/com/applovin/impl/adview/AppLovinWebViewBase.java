package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Paint;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.o0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class AppLovinWebViewBase extends WebView {
    public AppLovinWebViewBase(Context context) {
        super(context);
    }

    public void applySettings(com.applovin.impl.sdk.ad.b bVar) {
        Boolean m;
        loadUrl("about:blank");
        int m0 = bVar.m0();
        if (m0 >= 0) {
            setLayerType(m0, (Paint) null);
        }
        getSettings().setMediaPlaybackRequiresUserGesture(bVar.C());
        if (bVar.D0()) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        m n0 = bVar.n0();
        if (n0 != null) {
            WebSettings settings = getSettings();
            WebSettings.PluginState b = n0.b();
            if (b != null) {
                settings.setPluginState(b);
            }
            Boolean e = n0.e();
            if (e != null) {
                settings.setAllowFileAccess(e.booleanValue());
            }
            Boolean i = n0.i();
            if (i != null) {
                settings.setLoadWithOverviewMode(i.booleanValue());
            }
            Boolean q = n0.q();
            if (q != null) {
                settings.setUseWideViewPort(q.booleanValue());
            }
            Boolean d = n0.d();
            if (d != null) {
                settings.setAllowContentAccess(d.booleanValue());
            }
            Boolean p = n0.p();
            if (p != null) {
                settings.setBuiltInZoomControls(p.booleanValue());
            }
            Boolean h = n0.h();
            if (h != null) {
                settings.setDisplayZoomControls(h.booleanValue());
            }
            Boolean l = n0.l();
            if (l != null) {
                settings.setSaveFormData(l.booleanValue());
            }
            Boolean c = n0.c();
            if (c != null) {
                settings.setGeolocationEnabled(c.booleanValue());
            }
            Boolean j = n0.j();
            if (j != null) {
                settings.setNeedInitialFocus(j.booleanValue());
            }
            Boolean f = n0.f();
            if (f != null) {
                settings.setAllowFileAccessFromFileURLs(f.booleanValue());
            }
            Boolean g = n0.g();
            if (g != null) {
                settings.setAllowUniversalAccessFromFileURLs(g.booleanValue());
            }
            Boolean o = n0.o();
            if (o != null) {
                settings.setLoadsImagesAutomatically(o.booleanValue());
            }
            Boolean n = n0.n();
            if (n != null) {
                settings.setBlockNetworkImage(n.booleanValue());
            }
            if (o0.d()) {
                Integer a = n0.a();
                if (a != null) {
                    settings.setMixedContentMode(a.intValue());
                }
                if (o0.e()) {
                    Boolean k = n0.k();
                    if (k != null) {
                        settings.setOffscreenPreRaster(k.booleanValue());
                    }
                    if (!o0.j() || (m = n0.m()) == null) {
                        return;
                    }
                    o.a(settings, m.booleanValue());
                }
            }
        }
    }
}
