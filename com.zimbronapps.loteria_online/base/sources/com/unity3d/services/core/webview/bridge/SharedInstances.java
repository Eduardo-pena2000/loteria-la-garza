package com.unity3d.services.core.webview.bridge;

import com.unity3d.services.core.webview.WebViewApp;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class SharedInstances {
    public static final SharedInstances INSTANCE = new SharedInstances();
    private static final IInvocationCallbackInvoker webViewAppInvocationCallbackInvoker = new a();
    private static final INativeCallbackSubject webViewAppNativeCallbackSubject = new SharedInstances$webViewAppNativeCallbackSubject$1();
    private static final IEventSender webViewEventSender = new SharedInstances$webViewEventSender$1();
    private static final IWebViewBridge webViewBridge = new SharedInstances$webViewBridge$1();

    private SharedInstances() {
    }

    public static /* synthetic */ void a(Invocation invocation) {
        webViewAppInvocationCallbackInvoker$lambda$0(invocation);
    }

    private static final void webViewAppInvocationCallbackInvoker$lambda$0(Invocation it) {
        t.g(it, "it");
        WebViewApp.getCurrentApp().invokeCallback(it);
    }

    public final IInvocationCallbackInvoker getWebViewAppInvocationCallbackInvoker() {
        return webViewAppInvocationCallbackInvoker;
    }

    public final INativeCallbackSubject getWebViewAppNativeCallbackSubject() {
        return webViewAppNativeCallbackSubject;
    }

    public final IWebViewBridge getWebViewBridge() {
        return webViewBridge;
    }

    public final IEventSender getWebViewEventSender() {
        return webViewEventSender;
    }
}
