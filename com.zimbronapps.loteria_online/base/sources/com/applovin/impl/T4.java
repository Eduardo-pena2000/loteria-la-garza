package com.applovin.impl;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.impl.sdk.utils.CollectionUtils;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class t4 extends WebViewClient {
    public abstract Map a();

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        Map hashMap = CollectionUtils.hashMap("top_main_method", "onRenderProcessGone");
        hashMap.putAll(a());
        if (o0.g()) {
            hashMap.put("source", com.applovin.impl.adview.F.a(renderProcessGoneDetail) ? "crash" : "non_crash");
            hashMap.put("details", "renderer_priority_at_exit=" + A6.a(renderProcessGoneDetail));
        }
        com.applovin.impl.sdk.k kVar = com.applovin.impl.sdk.k.C0;
        if (kVar != null) {
            com.applovin.impl.sdk.k.C0.D().a(d2.b1, hashMap, ((Long) kVar.a(x4.q3)).longValue());
        }
        com.applovin.impl.sdk.o.g("RenderProcessGoneHandlingWebViewClient", "onRenderProcessGone() handled");
        return true;
    }
}
