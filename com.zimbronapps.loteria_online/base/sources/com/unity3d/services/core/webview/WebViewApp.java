package com.unity3d.services.core.webview;

import android.content.Context;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.Looper;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebViewClient;
import com.applovin.impl.A6;
import com.applovin.impl.adview.F;
import com.unity3d.services.ads.api.AdUnit;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.configuration.IExperiments;
import com.unity3d.services.core.configuration.InitializeThread;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.misc.ViewUtilities;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.CallbackStatus;
import com.unity3d.services.core.webview.bridge.IWebViewBridge;
import com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker;
import com.unity3d.services.core.webview.bridge.Invocation;
import com.unity3d.services.core.webview.bridge.NativeCallback;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import com.unity3d.services.core.webview.bridge.WebViewBridge;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class WebViewApp implements IWebViewBridgeInvoker {
    private static final int INVOKE_JS_CHARS_LENGTH = 22;
    private static ConditionVariable _conditionVariable;
    private static WebViewApp _currentApp;
    private Configuration _configuration;
    private final HashMap _nativeCallbacks;
    private boolean _webAppLoaded;
    private WebView _webView;
    protected final IWebViewBridge _webViewBridge;
    private static final AtomicReference _initialized = new AtomicReference(Boolean.FALSE);
    private static final AtomicReference _webAppFailureMessage = new AtomicReference();
    private static final AtomicReference _webAppFailureCode = new AtomicReference();

    public class 1 extends HashMap {
        final /* synthetic */ Enum val$eventCategory;
        final /* synthetic */ Enum val$eventId;

        public 1(Enum r3, Enum r4) {
            this.val$eventCategory = r3;
            this.val$eventId = r4;
            put("src", "handleEvent");
            put("eventCategory", r3.name());
            put("eventId", r4.name());
        }
    }

    public class 2 extends HashMap {
        final /* synthetic */ String val$className;
        final /* synthetic */ String val$methodName;

        public 2(String str, String str2) {
            this.val$className = str;
            this.val$methodName = str2;
            put("src", "handleInvocation");
            put("className", str);
            put("methodName", str2);
        }
    }

    public class 3 extends HashMap {
        final /* synthetic */ Invocation val$invocation;

        public 3(Invocation invocation) {
            this.val$invocation = invocation;
            put("src", "handleCallback");
            put("invocation", invocation.toString());
        }
    }

    public class 4 implements Runnable {
        final /* synthetic */ Configuration val$configuration;

        public 4(Configuration configuration) {
            this.val$configuration = configuration;
        }

        public void run() {
            try {
                Configuration configuration = this.val$configuration;
                WebViewApp webViewApp = new WebViewApp(configuration, configuration.getExperiments().isWebAssetAdCaching(), this.val$configuration.getExperiments().isWebGestureNotRequired(), (1) null);
                webViewApp.getWebView().loadDataWithBaseURL(new WebViewUrlBuilder("file://" + SdkProperties.getLocalWebViewFile(), this.val$configuration).getUrlWithQueryString(), this.val$configuration.getWebViewData(), "text/html", "UTF-8", (String) null);
                WebViewApp.setCurrentApp(webViewApp);
            } catch (Exception e) {
                DeviceLog.error("Unity Ads SDK unable to create WebViewApp " + e.getMessage());
                WebViewApp.access$200().open();
            }
        }
    }

    public class 5 implements Runnable {
        final /* synthetic */ Configuration val$configuration;

        public 5(Configuration configuration) {
            this.val$configuration = configuration;
        }

        public void run() {
            try {
                Configuration configuration = this.val$configuration;
                WebViewApp webViewApp = new WebViewApp(configuration, true, configuration.getExperiments().isWebGestureNotRequired(), (1) null);
                webViewApp.getWebView().loadUrl(new WebViewUrlBuilder(this.val$configuration.getWebViewUrl(), this.val$configuration).getUrlWithQueryString());
                WebViewApp.setCurrentApp(webViewApp);
            } catch (Exception unused) {
                DeviceLog.error("Unity Ads SDK unable to create WebViewApp");
                WebViewApp.access$200().open();
            }
        }
    }

    public static class WebAppClient extends WebViewClient {

        public class 1 implements Runnable {
            public 1() {
            }

            public void run() {
                if (AdUnit.getAdUnitActivity() != null) {
                    AdUnit.getAdUnitActivity().finish();
                }
                if (WebViewApp.getCurrentApp() != null && WebViewApp.getCurrentApp().getWebView() != null) {
                    ViewUtilities.removeViewFromParent(WebViewApp.getCurrentApp().getWebView());
                }
                InitializeThread.reset();
            }
        }

        public class 2 extends HashMap {
            final /* synthetic */ RenderProcessGoneDetail val$detail;

            public 2(RenderProcessGoneDetail renderProcessGoneDetail) {
                this.val$detail = renderProcessGoneDetail;
                if (Build.VERSION.SDK_INT >= 26) {
                    put("dc", "" + F.a(renderProcessGoneDetail));
                    put("pae", "" + A6.a(renderProcessGoneDetail));
                }
            }
        }

        private WebAppClient() {
        }

        public void onPageFinished(android.webkit.WebView webView, String str) {
            super.onPageFinished(webView, str);
            DeviceLog.debug("Unity Ads SDK finished loading URL inside WebView: " + str);
        }

        public void onReceivedError(android.webkit.WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (webResourceRequest != null && webResourceError != null) {
                DeviceLog.error("Unity Ads SDK encountered an error (code: " + webResourceError.getErrorCode() + ")  in WebView while loading a resource " + webResourceRequest.getUrl());
                return;
            }
            if (webResourceRequest == null) {
                DeviceLog.error("Unity Ads SDK encountered an error in WebView while loading a resource");
                return;
            }
            DeviceLog.error("Unity Ads SDK encountered an error in WebView while loading a resource " + webResourceRequest.getUrl());
        }

        public boolean onRenderProcessGone(android.webkit.WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Utilities.runOnUiThread(new 1());
            DeviceLog.error("UnityAds SDK WebView render process gone with following reason : " + renderProcessGoneDetail.toString());
            ((SDKMetricsSender) Utilities.getService(SDKMetricsSender.class)).sendEvent("native_webview_render_process_gone", null, new 2(renderProcessGoneDetail));
            return true;
        }

        public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, String str) {
            DeviceLog.debug("Unity Ads SDK attempts to load URL inside WebView: " + str);
            return false;
        }

        public /* synthetic */ WebAppClient(1 r1) {
            this();
        }
    }

    public /* synthetic */ WebViewApp(Configuration configuration, boolean z, boolean z2, 1 r4) {
        this(configuration, z, z2);
    }

    public static /* synthetic */ ConditionVariable access$200() {
        return _conditionVariable;
    }

    private String buildInvokeJavascript(String str, String str2, JSONArray jSONArray) {
        String jSONArray2 = jSONArray.toString();
        StringBuilder sb = new StringBuilder(str.length() + 22 + str2.length() + jSONArray2.length());
        sb.append("javascript:window.");
        sb.append(str);
        sb.append(".");
        sb.append(str2);
        sb.append("(");
        sb.append(jSONArray2);
        sb.append(");");
        return sb.toString();
    }

    public static ErrorState create(Configuration configuration) throws IllegalThreadStateException {
        return create(configuration, false);
    }

    private static ErrorState createWithRemoteUrl(Configuration configuration) {
        if (Thread.currentThread().equals(Looper.getMainLooper().getThread())) {
            throw new IllegalThreadStateException("Cannot call create() from main thread!");
        }
        Utilities.runOnUiThread(new 5(configuration));
        ConditionVariable conditionVariable = new ConditionVariable();
        _conditionVariable = conditionVariable;
        boolean block = conditionVariable.block(configuration.getWebViewAppCreateTimeout());
        boolean z = false;
        boolean z2 = getCurrentApp() != null;
        if (z2 && getCurrentApp().isWebAppInitialized()) {
            z = true;
        }
        if (block && z2 && z) {
            return null;
        }
        return !block ? ErrorState.CreateWebviewTimeout : getCurrentApp() == null ? ErrorState.CreateWebview : getCurrentApp().getErrorStateFromWebAppCode();
    }

    public static WebViewApp getCurrentApp() {
        return _currentApp;
    }

    private void invokeJavascriptMethod(String str, String str2, JSONArray jSONArray) {
        String buildInvokeJavascript = buildInvokeJavascript(str, str2, jSONArray);
        DeviceLog.debug("Invoking javascript: %s", buildInvokeJavascript);
        getWebView().evaluateJavascript(buildInvokeJavascript, null);
    }

    public static void setCurrentApp(WebViewApp webViewApp) {
        _currentApp = webViewApp;
    }

    public void addCallback(NativeCallback nativeCallback) {
        synchronized (this._nativeCallbacks) {
            this._nativeCallbacks.put(nativeCallback.getId(), nativeCallback);
        }
    }

    public NativeCallback getCallback(String str) {
        NativeCallback nativeCallback;
        synchronized (this._nativeCallbacks) {
            nativeCallback = (NativeCallback) this._nativeCallbacks.get(str);
        }
        return nativeCallback;
    }

    public Configuration getConfiguration() {
        return this._configuration;
    }

    public ErrorState getErrorStateFromWebAppCode() {
        int webAppFailureCode = getWebAppFailureCode();
        return webAppFailureCode == 1 ? ErrorState.CreateWebviewGameIdDisabled : webAppFailureCode == 2 ? ErrorState.CreateWebviewConfigError : webAppFailureCode == 3 ? ErrorState.CreateWebviewInvalidArgument : ErrorState.CreateWebview;
    }

    public int getWebAppFailureCode() {
        return ((Integer) _webAppFailureCode.get()).intValue();
    }

    public String getWebAppFailureMessage() {
        return (String) _webAppFailureMessage.get();
    }

    public WebView getWebView() {
        return this._webView;
    }

    public boolean invokeCallback(Invocation invocation) {
        if (!isWebAppLoaded()) {
            DeviceLog.debug("invokeBatchCallback ignored because web app is not loaded");
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        ArrayList responses = invocation.getResponses();
        if (responses != null && !responses.isEmpty()) {
            Iterator it = responses.iterator();
            while (it.hasNext()) {
                ArrayList arrayList = (ArrayList) it.next();
                CallbackStatus callbackStatus = (CallbackStatus) arrayList.get(0);
                Enum r6 = (Enum) arrayList.get(1);
                Object[] objArr = (Object[]) arrayList.get(2);
                String str = (String) objArr[0];
                Object[] copyOfRange = Arrays.copyOfRange(objArr, 1, objArr.length);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(str);
                arrayList2.add(callbackStatus.toString());
                JSONArray jSONArray2 = new JSONArray();
                if (r6 != null) {
                    jSONArray2.put(r6.name());
                }
                for (Object obj : copyOfRange) {
                    jSONArray2.put(obj);
                }
                arrayList2.add(jSONArray2);
                JSONArray jSONArray3 = new JSONArray();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    jSONArray3.put(it2.next());
                }
                jSONArray.put(jSONArray3);
            }
        }
        try {
            invokeJavascriptMethod("nativebridge", "handleCallback", jSONArray);
        } catch (Error unused) {
            DeviceLog.error("Out of memory error while invoking callback to WebView");
            ((SDKMetricsSender) Utilities.getService(SDKMetricsSender.class)).sendEvent("native_webview_oom", null, new 3(invocation));
            return false;
        } catch (Exception e) {
            DeviceLog.exception("Error while invoking batch response for WebView", e);
        }
        return true;
    }

    public boolean invokeMethod(String str, String str2, Method method, Object... objArr) {
        if (!isWebAppLoaded()) {
            DeviceLog.debug("invokeMethod ignored because web app is not loaded");
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONArray.put(str2);
        if (method != null) {
            NativeCallback nativeCallback = new NativeCallback(method);
            addCallback(nativeCallback);
            jSONArray.put(nativeCallback.getId());
        } else {
            jSONArray.put((Object) null);
        }
        if (objArr != null) {
            for (Object obj : objArr) {
                jSONArray.put(obj);
            }
        }
        try {
            invokeJavascriptMethod("nativebridge", "handleInvocation", jSONArray);
            return true;
        } catch (Error unused) {
            DeviceLog.error("Out of memory error while handling invocation to WebView");
            ((SDKMetricsSender) Utilities.getService(SDKMetricsSender.class)).sendEvent("native_webview_oom", null, new 2(str, str2));
            return false;
        } catch (Exception e) {
            DeviceLog.exception("Error invoking javascript method", e);
            return false;
        }
    }

    public boolean isWebAppInitialized() {
        return ((Boolean) _initialized.get()).booleanValue();
    }

    public boolean isWebAppLoaded() {
        return this._webAppLoaded;
    }

    public void removeCallback(NativeCallback nativeCallback) {
        synchronized (this._nativeCallbacks) {
            this._nativeCallbacks.remove(nativeCallback.getId());
        }
    }

    public void resetWebViewAppInitialization() {
        this._webAppLoaded = false;
        _webAppFailureCode.set(-1);
        _webAppFailureMessage.set("");
        _initialized.set(Boolean.FALSE);
    }

    public boolean sendEvent(Enum r6, Enum r7, Object... objArr) {
        if (!isWebAppLoaded()) {
            DeviceLog.debug("sendEvent ignored because web app is not loaded");
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(r6.name());
        jSONArray.put(r7.name());
        for (Object obj : objArr) {
            jSONArray.put(obj);
        }
        try {
            invokeJavascriptMethod("nativebridge", "handleEvent", jSONArray);
            return true;
        } catch (Error unused) {
            DeviceLog.error("Out of memory error while sending event to WebView");
            ((SDKMetricsSender) Utilities.getService(SDKMetricsSender.class)).sendEvent("native_webview_oom", null, new 1(r6, r7));
            return false;
        } catch (Exception e) {
            DeviceLog.exception("Error while sending event to WebView", e);
            return false;
        }
    }

    public void setConfiguration(Configuration configuration) {
        this._configuration = configuration;
    }

    public void setWebAppFailureCode(int i) {
        _webAppFailureCode.set(Integer.valueOf(i));
    }

    public void setWebAppFailureMessage(String str) {
        _webAppFailureMessage.set(str);
    }

    public void setWebAppInitialized(boolean z) {
        _initialized.set(Boolean.valueOf(z));
        _conditionVariable.open();
    }

    public void setWebAppLoaded(boolean z) {
        this._webAppLoaded = z;
    }

    public void setWebView(WebView webView) {
        this._webView = webView;
    }

    private WebViewApp(Configuration configuration, boolean z, boolean z2) {
        this(configuration, z, z2, SharedInstances.INSTANCE.getWebViewBridge());
    }

    public static ErrorState create(Configuration configuration, boolean z) throws IllegalThreadStateException {
        DeviceLog.entered();
        if (z) {
            return createWithRemoteUrl(configuration);
        }
        if (Thread.currentThread().equals(Looper.getMainLooper().getThread())) {
            throw new IllegalThreadStateException("Cannot call create() from main thread!");
        }
        Utilities.runOnUiThread(new 4(configuration));
        ConditionVariable conditionVariable = new ConditionVariable();
        _conditionVariable = conditionVariable;
        boolean block = conditionVariable.block(configuration.getWebViewAppCreateTimeout());
        boolean z2 = false;
        boolean z3 = getCurrentApp() != null;
        if (z3 && getCurrentApp().isWebAppInitialized()) {
            z2 = true;
        }
        if (block && z3 && z2) {
            return null;
        }
        return !block ? ErrorState.CreateWebviewTimeout : getCurrentApp() == null ? ErrorState.CreateWebview : getCurrentApp().getErrorStateFromWebAppCode();
    }

    private WebViewApp(Configuration configuration, boolean z, boolean z2, IWebViewBridge iWebViewBridge) {
        WebView webView;
        this._webAppLoaded = false;
        this._nativeCallbacks = new HashMap();
        setConfiguration(configuration);
        WebViewBridge.setClassTable(getConfiguration().getWebAppApiClassList());
        IExperiments experiments = configuration.getExperiments();
        this._webViewBridge = iWebViewBridge;
        if (z) {
            webView = new WebViewWithCache(ClientProperties.getApplicationContext(), z2, experiments);
        } else {
            Context applicationContext = ClientProperties.getApplicationContext();
            SharedInstances sharedInstances = SharedInstances.INSTANCE;
            webView = new WebView(applicationContext, z2, sharedInstances.getWebViewBridge(), sharedInstances.getWebViewAppInvocationCallbackInvoker(), experiments);
        }
        this._webView = webView;
        webView.setWebViewClient(new WebAppClient(null));
    }

    public WebViewApp() {
        this._webAppLoaded = false;
        this._nativeCallbacks = new HashMap();
        WebViewBridge.setClassTable(new Class[0]);
        this._webViewBridge = SharedInstances.INSTANCE.getWebViewBridge();
        _conditionVariable = new ConditionVariable();
    }
}
