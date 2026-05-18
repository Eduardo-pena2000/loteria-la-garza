package com.unity3d.services.core.webview.bridge;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface IWebViewBridge {
    void handleCallback(String str, String str2, Object[] objArr) throws Exception;

    void handleInvocation(String str, String str2, Object[] objArr, WebViewCallback webViewCallback) throws Exception;
}
