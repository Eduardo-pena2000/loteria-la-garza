package com.unity3d.services.core.webview.bridge;

import Za.E;
import android.net.Uri;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.unity3d.ads.core.extensions.JSONArrayExtensionsKt;
import com.unity3d.services.core.log.DeviceLog;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import org.json.JSONArray;
import org.json.JSONObject;
import t4.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class WebViewBridgeInterface {
    private final IInvocationCallbackInvoker webViewAppInvocationCallbackInvoker;
    private final IWebViewBridge webViewBridge;

    public WebViewBridgeInterface() {
        this(null, null, 3, null);
    }

    @JavascriptInterface
    public final void handleCallback(String callbackId, String callbackStatus, String rawParameters) {
        t.g(callbackId, "callbackId");
        t.g(callbackStatus, "callbackStatus");
        t.g(rawParameters, "rawParameters");
        DeviceLog.debug("handleCallback " + callbackId + ' ' + callbackStatus + ' ' + rawParameters);
        this.webViewBridge.handleCallback(callbackId, callbackStatus, JSONArrayExtensionsKt.toTypedArray(new JSONArray(rawParameters)));
    }

    @JavascriptInterface
    public final void handleInvocation(String data) {
        t.g(data, "data");
        DeviceLog.debug("handleInvocation " + data);
        JSONArray jSONArray = new JSONArray(data);
        Invocation invocation = new Invocation(this.webViewAppInvocationCallbackInvoker, this.webViewBridge);
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            t.e(obj, "null cannot be cast to non-null type org.json.JSONArray");
            JSONArray jSONArray2 = (JSONArray) obj;
            Object obj2 = jSONArray2.get(0);
            t.e(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = jSONArray2.get(1);
            t.e(obj3, "null cannot be cast to non-null type kotlin.String");
            Object obj4 = jSONArray2.get(2);
            t.e(obj4, "null cannot be cast to non-null type org.json.JSONArray");
            Object obj5 = jSONArray2.get(3);
            t.e(obj5, "null cannot be cast to non-null type kotlin.String");
            invocation.addInvocation((String) obj2, (String) obj3, JSONArrayExtensionsKt.toTypedArray((JSONArray) obj4), new WebViewCallback((String) obj5, invocation.getId()));
            invocation.nextInvocation();
        }
        invocation.sendInvocationCallback();
    }

    public final void onHandleCallback(WebView view, e message, Uri sourceOrigin, boolean z, t4.a replyProxy) {
        t.g(view, "view");
        t.g(message, "message");
        t.g(sourceOrigin, "sourceOrigin");
        t.g(replyProxy, "replyProxy");
        String b = message.b();
        if (!z || b == null || E.h0(b)) {
            return;
        }
        JSONObject jSONObject = new JSONObject(b);
        String callbackId = jSONObject.getString("id");
        String callbackStatus = jSONObject.getString("status");
        String rawParameters = jSONObject.getString("parameters");
        t.f(callbackId, "callbackId");
        t.f(callbackStatus, "callbackStatus");
        t.f(rawParameters, "rawParameters");
        handleCallback(callbackId, callbackStatus, rawParameters);
    }

    public final void onHandleInvocation(WebView view, e message, Uri sourceOrigin, boolean z, t4.a replyProxy) {
        t.g(view, "view");
        t.g(message, "message");
        t.g(sourceOrigin, "sourceOrigin");
        t.g(replyProxy, "replyProxy");
        String b = message.b();
        if (!z || b == null || E.h0(b)) {
            return;
        }
        handleInvocation(b);
    }

    public WebViewBridgeInterface(IWebViewBridge webViewBridge, IInvocationCallbackInvoker webViewAppInvocationCallbackInvoker) {
        t.g(webViewBridge, "webViewBridge");
        t.g(webViewAppInvocationCallbackInvoker, "webViewAppInvocationCallbackInvoker");
        this.webViewBridge = webViewBridge;
        this.webViewAppInvocationCallbackInvoker = webViewAppInvocationCallbackInvoker;
    }

    public /* synthetic */ WebViewBridgeInterface(IWebViewBridge iWebViewBridge, IInvocationCallbackInvoker iInvocationCallbackInvoker, int i, k kVar) {
        this((i & 1) != 0 ? SharedInstances.INSTANCE.getWebViewBridge() : iWebViewBridge, (i & 2) != 0 ? SharedInstances.INSTANCE.getWebViewAppInvocationCallbackInvoker() : iInvocationCallbackInvoker);
    }
}
