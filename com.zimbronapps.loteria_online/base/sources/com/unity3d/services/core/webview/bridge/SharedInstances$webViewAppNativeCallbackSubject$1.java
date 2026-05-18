package com.unity3d.services.core.webview.bridge;

import com.unity3d.services.core.webview.WebViewApp;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class SharedInstances$webViewAppNativeCallbackSubject$1 implements INativeCallbackSubject {
    public NativeCallback getCallback(String callbackId) {
        t.g(callbackId, "callbackId");
        NativeCallback callback = WebViewApp.getCurrentApp().getCallback(callbackId);
        t.f(callback, "getCurrentApp().getCallback(callbackId)");
        return callback;
    }

    public void remove(NativeCallback callback) {
        t.g(callback, "callback");
        WebViewApp.getCurrentApp().removeCallback(callback);
    }
}
