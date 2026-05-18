package com.unity3d.services.core.webview;

import Ca.l;
import Ca.m;
import Ca.n;
import Ca.s;
import Da.X;
import T1.A0;
import T1.Z;
import Za.u;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import com.unity3d.services.core.configuration.Experiments;
import com.unity3d.services.core.configuration.IExperiments;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.misc.ViewUtilities;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker;
import com.unity3d.services.core.webview.bridge.IWebViewBridge;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import com.unity3d.services.core.webview.bridge.WebViewBridgeInterface;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import t4.i;
import t4.j;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class WebView extends android.webkit.WebView implements IServiceComponent {
    private final l sdkMetricsSender$delegate;
    private final WebViewBridgeInterface webViewBridgeInterface;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebView(Context context) {
        this(context, false, null, null, null, 30, null);
        t.g(context, "context");
    }

    public static /* synthetic */ A0 a(WebView webView, View view, A0 a0) {
        return applySafeAreaInsets$lambda$3(webView, view, a0);
    }

    private final void applySafeAreaInsets() {
        Z.g0(this, new d(this));
    }

    private static final A0 applySafeAreaInsets$lambda$3(WebView this$0, View v, A0 insets) {
        Object b;
        t.g(this$0, "this$0");
        t.g(v, "v");
        t.g(insets, "insets");
        K1.b f = insets.f(A0.l.i());
        t.f(f, "insets.getInsets(WindowI…Compat.Type.systemBars())");
        K1.b f2 = insets.f(A0.l.c());
        t.f(f2, "insets.getInsets(WindowI…pat.Type.displayCutout())");
        try {
            s.a aVar = s.b;
            b = s.b(Float.valueOf(this$0.getContext().getResources().getDisplayMetrics().density));
        } catch (Throwable th) {
            s.a aVar2 = s.b;
            b = s.b(Ca.t.a(th));
        }
        Float valueOf = Float.valueOf(1.0f);
        if (s.g(b)) {
            b = valueOf;
        }
        float floatValue = ((Number) b).floatValue();
        int applySafeAreaInsets$lambda$3$toPx = applySafeAreaInsets$lambda$3$toPx(Math.max(f.a, f2.a), floatValue);
        int applySafeAreaInsets$lambda$3$toPx2 = applySafeAreaInsets$lambda$3$toPx(Math.max(f.b, f2.b), floatValue);
        this$0.evaluateJavascript(u.j("\n                (function() {\n                    const root = document.documentElement;\n                    root.style.setProperty('--safe-area-inset-left', '" + applySafeAreaInsets$lambda$3$toPx + "px');\n                    root.style.setProperty('--safe-area-inset-right', '" + applySafeAreaInsets$lambda$3$toPx(Math.max(f.c, f2.c), floatValue) + "px');\n                    root.style.setProperty('--safe-area-inset-top', '" + applySafeAreaInsets$lambda$3$toPx2 + "px');\n                    root.style.setProperty('--safe-area-inset-bottom', '" + applySafeAreaInsets$lambda$3$toPx(Math.max(f.d, f2.d), floatValue) + "px');\n                })();\n            "), null);
        return insets;
    }

    private static final int applySafeAreaInsets$lambda$3$toPx(int i, float f) {
        return (int) (i / f);
    }

    public static /* synthetic */ void b(WebView webView, String str, ValueCallback valueCallback) {
        evaluateJavascript$lambda$1(webView, str, valueCallback);
    }

    private static final void evaluateJavascript$lambda$1(WebView this$0, String script, ValueCallback valueCallback) {
        t.g(this$0, "this$0");
        t.g(script, "$script");
        super.evaluateJavascript(script, valueCallback);
    }

    private final SDKMetricsSender getSdkMetricsSender() {
        return (SDKMetricsSender) this.sdkMetricsSender$delegate.getValue();
    }

    public void evaluateJavascript(String script, ValueCallback valueCallback) {
        t.g(script, "script");
        Utilities.runOnUiThread(new c(this, script, valueCallback));
    }

    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    public void loadUrl(String url) {
        t.g(url, "url");
        DeviceLog.debug("Loading url: " + url);
        super.loadUrl(url);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebView(Context context, boolean z) {
        this(context, z, null, null, null, 28, null);
        t.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebView(Context context, boolean z, IWebViewBridge webViewBridge) {
        this(context, z, webViewBridge, null, null, 24, null);
        t.g(context, "context");
        t.g(webViewBridge, "webViewBridge");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebView(Context context, boolean z, IWebViewBridge webViewBridge, IInvocationCallbackInvoker callbackInvoker) {
        this(context, z, webViewBridge, callbackInvoker, null, 16, null);
        t.g(context, "context");
        t.g(webViewBridge, "webViewBridge");
        t.g(callbackInvoker, "callbackInvoker");
    }

    public /* synthetic */ WebView(Context context, boolean z, IWebViewBridge iWebViewBridge, IInvocationCallbackInvoker iInvocationCallbackInvoker, IExperiments iExperiments, int i, k kVar) {
        this(context, (i & 2) != 0 ? false : z, (i & 4) != 0 ? SharedInstances.INSTANCE.getWebViewBridge() : iWebViewBridge, (i & 8) != 0 ? SharedInstances.INSTANCE.getWebViewAppInvocationCallbackInvoker() : iInvocationCallbackInvoker, (i & 16) != 0 ? new Experiments() : iExperiments);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebView(Context context, boolean z, IWebViewBridge webViewBridge, IInvocationCallbackInvoker callbackInvoker, IExperiments experiments) {
        super(context);
        t.g(context, "context");
        t.g(webViewBridge, "webViewBridge");
        t.g(callbackInvoker, "callbackInvoker");
        t.g(experiments, "experiments");
        this.sdkMetricsSender$delegate = m.a(n.c, new WebView$special$$inlined$inject$default$1(this, ""));
        WebViewBridgeInterface webViewBridgeInterface = new WebViewBridgeInterface(webViewBridge, callbackInvoker);
        this.webViewBridgeInterface = webViewBridgeInterface;
        WebSettings settings = getSettings();
        settings.setAllowFileAccessFromFileURLs(true);
        settings.setAllowUniversalAccessFromFileURLs(true);
        settings.setAllowFileAccess(true);
        settings.setBlockNetworkImage(false);
        settings.setBlockNetworkLoads(false);
        settings.setBuiltInZoomControls(false);
        settings.setCacheMode(2);
        settings.setDatabaseEnabled(false);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(false);
        settings.setEnableSmoothTransition(false);
        settings.setGeolocationEnabled(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setJavaScriptEnabled(true);
        settings.setLightTouchEnabled(false);
        settings.setLoadWithOverviewMode(false);
        settings.setLoadsImagesAutomatically(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setMixedContentMode(1);
        settings.setNeedInitialFocus(true);
        settings.setPluginState(WebSettings.PluginState.OFF);
        settings.setRenderPriority(WebSettings.RenderPriority.NORMAL);
        settings.setSaveFormData(false);
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(false);
        settings.setSupportZoom(false);
        settings.setUseWideViewPort(true);
        settings.setMediaPlaybackRequiresUserGesture(!z);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setInitialScale(0);
        setBackgroundColor(0);
        ViewUtilities.setBackground(this, new ColorDrawable(0));
        setBackgroundResource(0);
        boolean isWebMessageEnabled = experiments.isWebMessageEnabled();
        if (isWebMessageEnabled) {
            getSdkMetricsSender().sendMetric(WebViewMetricKt.webMessageListenerEnabledMetric());
        } else {
            getSdkMetricsSender().sendMetric(WebViewMetricKt.webMessageListenerDisabledMetric());
        }
        boolean a = j.a("WEB_MESSAGE_LISTENER");
        if (a) {
            getSdkMetricsSender().sendMetric(WebViewMetricKt.webMessageListenerSupportedMetric());
        } else {
            getSdkMetricsSender().sendMetric(WebViewMetricKt.webMessageListenerUnsupportedMetric());
        }
        if (isWebMessageEnabled && a) {
            i.b(this, "handleInvocation", X.a("*"), new a(webViewBridgeInterface));
            i.b(this, "handleCallback", X.a("*"), new b(webViewBridgeInterface));
        } else {
            addJavascriptInterface(webViewBridgeInterface, "webviewbridge");
        }
        applySafeAreaInsets();
    }
}
