package com.unity3d.services.core.webview.bridge;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class SharedInstances$webViewBridge$1 implements IWebViewBridge {
    public void handleCallback(String str, String str2, Object[] objArr) throws Exception {
        WebViewBridge.getInstance().handleCallback(str, str2, objArr);
    }

    public void handleInvocation(String str, String str2, Object[] objArr, WebViewCallback webViewCallback) throws Exception {
        WebViewBridge.getInstance().handleInvocation(str, str2, objArr, webViewCallback);
    }
}
