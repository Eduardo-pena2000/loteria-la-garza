package com.unity3d.ads.adplayer;

import android.webkit.JavascriptInterface;
import com.unity3d.ads.adplayer.model.WebViewBridgeInterface;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidWebViewContainer$addJavascriptInterface$2$wrapper$1 implements WebViewBridgeInterface {
    final /* synthetic */ WebViewBridge $webViewBridgeInterface;

    public AndroidWebViewContainer$addJavascriptInterface$2$wrapper$1(WebViewBridge webViewBridge) {
        this.$webViewBridgeInterface = webViewBridge;
    }

    @JavascriptInterface
    public void handleCallback(String callbackId, String callbackStatus, String rawParameters) {
        t.g(callbackId, "callbackId");
        t.g(callbackStatus, "callbackStatus");
        t.g(rawParameters, "rawParameters");
        this.$webViewBridgeInterface.handleCallback(callbackId, callbackStatus, rawParameters);
    }

    @JavascriptInterface
    public void handleInvocation(String message) {
        t.g(message, "message");
        this.$webViewBridgeInterface.handleInvocation(message);
    }
}
