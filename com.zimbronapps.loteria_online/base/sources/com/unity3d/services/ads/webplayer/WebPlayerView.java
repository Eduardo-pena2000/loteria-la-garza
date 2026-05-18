package com.unity3d.services.ads.webplayer;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.ClientCertRequest;
import android.webkit.ConsoleMessage;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.HttpAuthHandler;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.misc.ViewUtilities;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class WebPlayerView extends WebView {
    private Map _erroredSettings;
    private Method _evaluateJavascript;
    private JSONObject _eventSettings;
    private Runnable _unsubscribeLayoutChange;
    private String viewId;

    public class 1 implements View.OnLayoutChangeListener {
        public 1() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            WebPlayerView.this.onLayoutChange();
        }
    }

    public class 2 implements Runnable {
        final /* synthetic */ View.OnLayoutChangeListener val$onLayoutChangeListener;

        public 2(View.OnLayoutChangeListener onLayoutChangeListener) {
            this.val$onLayoutChangeListener = onLayoutChangeListener;
        }

        public void run() {
            WebPlayerView.this.removeOnLayoutChangeListener(this.val$onLayoutChangeListener);
        }
    }

    public class JavaScriptInvocation implements Runnable {
        private String _jsString;
        private WebView _webView;

        public JavaScriptInvocation(String str, WebView webView) {
            this._jsString = str;
            this._webView = webView;
        }

        public void run() {
            if (this._jsString == null) {
                DeviceLog.error("Could not process JavaScript, the string is NULL");
                return;
            }
            try {
                WebPlayerView.access$300(WebPlayerView.this).invoke(this._webView, new Object[]{this._jsString, null});
            } catch (Exception e) {
                DeviceLog.exception("Error while processing JavaScriptString", e);
            }
        }
    }

    @TargetApi(21)
    public class WebPlayerChromeClient extends WebChromeClient {
        private WebPlayerChromeClient() {
        }

        public void onCloseWindow(WebView webView) {
            if (WebPlayerView.access$500(WebPlayerView.this, "onCloseWindow")) {
                super.onCloseWindow(webView);
            }
            if (WebPlayerView.access$600(WebPlayerView.this, "onCloseWindow")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.CLOSE_WINDOW, WebPlayerView.access$400(WebPlayerView.this));
            }
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            Boolean bool = Boolean.FALSE;
            if (WebPlayerView.access$500(WebPlayerView.this, "onConsoleMessage")) {
                bool = Boolean.valueOf(super.onConsoleMessage(consoleMessage));
            }
            if (WebPlayerView.access$600(WebPlayerView.this, "onConsoleMessage")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.CONSOLE_MESSAGE, consoleMessage != null ? consoleMessage.message() : "", WebPlayerView.access$400(WebPlayerView.this));
            }
            if (WebPlayerView.access$700(WebPlayerView.this, "onConsoleMessage")) {
                bool = (Boolean) WebPlayerView.access$800(WebPlayerView.this, "onConsoleMessage", Boolean.class, Boolean.TRUE);
            }
            return bool.booleanValue();
        }

        public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            Boolean bool = Boolean.FALSE;
            Boolean valueOf = WebPlayerView.access$500(WebPlayerView.this, "onCreateWindow") ? Boolean.valueOf(super.onCreateWindow(webView, z, z2, message)) : bool;
            if (WebPlayerView.access$600(WebPlayerView.this, "onCreateWindow")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.CREATE_WINDOW, Boolean.valueOf(z), Boolean.valueOf(z2), message, WebPlayerView.access$400(WebPlayerView.this));
            }
            if (WebPlayerView.access$700(WebPlayerView.this, "onCreateWindow")) {
                valueOf = (Boolean) WebPlayerView.access$800(WebPlayerView.this, "onCreateWindow", Boolean.class, bool);
            }
            return valueOf.booleanValue();
        }

        public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            if (WebPlayerView.access$500(WebPlayerView.this, "onGeolocationPermissionsShowPrompt")) {
                super.onGeolocationPermissionsShowPrompt(str, callback);
            }
            if (WebPlayerView.access$600(WebPlayerView.this, "onGeolocationPermissionsShowPrompt")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.GEOLOCATION_PERMISSIONS_SHOW, str, WebPlayerView.access$400(WebPlayerView.this));
            }
        }

        public void onHideCustomView() {
            if (WebPlayerView.access$500(WebPlayerView.this, "onHideCustomView")) {
                super.onHideCustomView();
            }
            if (WebPlayerView.access$600(WebPlayerView.this, "onHideCustomView")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.HIDE_CUSTOM_VIEW, WebPlayerView.access$400(WebPlayerView.this));
            }
        }

        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            Boolean bool = Boolean.FALSE;
            if (WebPlayerView.access$500(WebPlayerView.this, "onJsAlert")) {
                bool = Boolean.valueOf(super.onJsAlert(webView, str, str2, jsResult));
            }
            if (WebPlayerView.access$600(WebPlayerView.this, "onJsAlert")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.JS_ALERT, str, str2, jsResult, WebPlayerView.access$400(WebPlayerView.this));
            }
            if (WebPlayerView.access$700(WebPlayerView.this, "onJsAlert")) {
                bool = (Boolean) WebPlayerView.access$800(WebPlayerView.this, "onJsAlert", Boolean.class, Boolean.TRUE);
            }
            return bool.booleanValue();
        }

        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            Boolean bool = Boolean.FALSE;
            if (WebPlayerView.access$500(WebPlayerView.this, "onJsConfirm")) {
                bool = Boolean.valueOf(super.onJsConfirm(webView, str, str2, jsResult));
            }
            if (WebPlayerView.access$600(WebPlayerView.this, "onJsConfirm")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.JS_CONFIRM, str, str2, WebPlayerView.access$400(WebPlayerView.this));
            }
            if (WebPlayerView.access$700(WebPlayerView.this, "onJsConfirm")) {
                bool = (Boolean) WebPlayerView.access$800(WebPlayerView.this, "onJsConfirm", Boolean.class, Boolean.TRUE);
            }
            return bool.booleanValue();
        }

        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            Boolean bool = Boolean.FALSE;
            if (WebPlayerView.access$500(WebPlayerView.this, "onJsPrompt")) {
                bool = Boolean.valueOf(super.onJsPrompt(webView, str, str2, str3, jsPromptResult));
            }
            if (WebPlayerView.access$600(WebPlayerView.this, "onJsPrompt")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.JS_PROMPT, str, str2, str3, WebPlayerView.access$400(WebPlayerView.this));
            }
            if (WebPlayerView.access$700(WebPlayerView.this, "onJsPrompt")) {
                bool = (Boolean) WebPlayerView.access$800(WebPlayerView.this, "onJsPrompt", Boolean.class, Boolean.TRUE);
            }
            return bool.booleanValue();
        }

        public void onPermissionRequest(PermissionRequest permissionRequest) {
            if (WebPlayerView.access$500(WebPlayerView.this, "onPermissionRequest")) {
                super.onPermissionRequest(permissionRequest);
            }
            if (WebPlayerView.access$600(WebPlayerView.this, "onPermissionRequest")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.PERMISSION_REQUEST, (permissionRequest == null || permissionRequest.getOrigin() == null) ? "" : permissionRequest.getOrigin().toString(), WebPlayerView.access$400(WebPlayerView.this));
            }
        }

        public void onProgressChanged(WebView webView, int i) {
            if (WebPlayerView.access$500(WebPlayerView.this, "onProgressChanged")) {
                super.onProgressChanged(webView, i);
            }
            if (WebPlayerView.access$600(WebPlayerView.this, "onProgressChanged")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.PROGRESS_CHANGED, Integer.valueOf(i), WebPlayerView.access$400(WebPlayerView.this));
            }
        }

        public void onReceivedIcon(WebView webView, Bitmap bitmap) {
            if (WebPlayerView.access$500(WebPlayerView.this, "onReceivedIcon")) {
                super.onReceivedIcon(webView, bitmap);
            }
            if (WebPlayerView.access$600(WebPlayerView.this, "onReceivedIcon")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.RECEIVED_ICON, WebPlayerView.access$400(WebPlayerView.this));
            }
        }

        public void onReceivedTitle(WebView webView, String str) {
            if (WebPlayerView.access$500(WebPlayerView.this, "onReceivedTitle")) {
                super.onReceivedTitle(webView, str);
            }
            if (WebPlayerView.access$600(WebPlayerView.this, "onReceivedTitle")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.RECEIVED_TITLE, str, WebPlayerView.access$400(WebPlayerView.this));
            }
        }

        public void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
            if (WebPlayerView.access$500(WebPlayerView.this, "onReceivedTouchIconUrl")) {
                super.onReceivedTouchIconUrl(webView, str, z);
            }
            if (WebPlayerView.access$600(WebPlayerView.this, "onReceivedTouchIconUrl")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.RECEIVED_TOUCH_ICON_URL, str, Boolean.valueOf(z), WebPlayerView.access$400(WebPlayerView.this));
            }
        }

        public void onRequestFocus(WebView webView) {
            if (WebPlayerView.access$500(WebPlayerView.this, "onRequestFocus")) {
                super.onRequestFocus(webView);
            }
            if (WebPlayerView.access$600(WebPlayerView.this, "onRequestFocus")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.REQUEST_FOCUS, WebPlayerView.access$400(WebPlayerView.this));
            }
        }

        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            if (WebPlayerView.access$500(WebPlayerView.this, "onShowCustomView")) {
                super.onShowCustomView(view, customViewCallback);
            }
            if (WebPlayerView.access$600(WebPlayerView.this, "onShowCustomView")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.SHOW_CUSTOM_VIEW, WebPlayerView.access$400(WebPlayerView.this));
            }
        }

        public boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            Boolean bool = Boolean.FALSE;
            if (WebPlayerView.access$500(WebPlayerView.this, "onShowFileChooser")) {
                bool = Boolean.valueOf(super.onShowFileChooser(webView, valueCallback, fileChooserParams));
            }
            if (WebPlayerView.access$600(WebPlayerView.this, "onShowFileChooser")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.SHOW_FILE_CHOOSER, WebPlayerView.access$400(WebPlayerView.this));
            }
            if (WebPlayerView.access$700(WebPlayerView.this, "onShowFileChooser")) {
                bool = (Boolean) WebPlayerView.access$800(WebPlayerView.this, "onShowFileChooser", Boolean.class, Boolean.TRUE);
                if (bool.booleanValue()) {
                    valueCallback.onReceiveValue((Object) null);
                }
            }
            return bool.booleanValue();
        }

        public /* synthetic */ WebPlayerChromeClient(WebPlayerView webPlayerView, 1 r2) {
            this();
        }
    }

    public class WebPlayerClient extends WebViewClient {

        public class 1 implements Runnable {
            final /* synthetic */ WebView val$view;

            public 1(WebView webView) {
                this.val$view = webView;
            }

            public void run() {
                ViewUtilities.removeViewFromParent(this.val$view);
                this.val$view.destroy();
            }
        }

        private WebPlayerClient() {
        }

        public void onFormResubmission(WebView webView, Message message, Message message2) {
            if (WebPlayerView.access$500(WebPlayerView.this, "onFormResubmission")) {
                super.onFormResubmission(webView, message, message2);
            }
            if (WebPlayerView.access$600(WebPlayerView.this, "onFormResubmission")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.FORM_RESUBMISSION, WebPlayerView.access$400(WebPlayerView.this));
            }
        }

        public void onLoadResource(WebView webView, String str) {
            if (WebPlayerView.access$500(WebPlayerView.this, "onLoadResource")) {
                super.onLoadResource(webView, str);
            }
            if (WebPlayerView.access$600(WebPlayerView.this, "onLoadResource")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.LOAD_RESOUCE, str, WebPlayerView.access$400(WebPlayerView.this));
            }
        }

        public void onPageCommitVisible(WebView webView, String str) {
            if (WebPlayerView.access$500(WebPlayerView.this, "onPageCommitVisible")) {
                super.onPageCommitVisible(webView, str);
            }
            if (WebPlayerView.access$600(WebPlayerView.this, "onPageCommitVisible")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.PAGE_COMMIT_VISIBLE, str, WebPlayerView.access$400(WebPlayerView.this));
            }
        }

        public void onPageFinished(WebView webView, String str) {
            if (WebPlayerView.access$500(WebPlayerView.this, "onPageFinished")) {
                super.onPageFinished(webView, str);
            }
            if (WebPlayerView.access$600(WebPlayerView.this, "onPageFinished")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.PAGE_FINISHED, str, WebPlayerView.access$400(WebPlayerView.this));
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            if (WebPlayerView.access$500(WebPlayerView.this, "onPageStarted")) {
                super.onPageStarted(webView, str, bitmap);
            }
            if (WebPlayerView.access$600(WebPlayerView.this, "onPageStarted")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.PAGE_STARTED, str, WebPlayerView.access$400(WebPlayerView.this));
            }
        }

        @TargetApi(21)
        public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
            String str;
            int i;
            if (WebPlayerView.access$500(WebPlayerView.this, "onReceivedClientCertRequest")) {
                super.onReceivedClientCertRequest(webView, clientCertRequest);
            }
            if (WebPlayerView.access$600(WebPlayerView.this, "onReceivedClientCertRequest")) {
                if (clientCertRequest != null) {
                    str = clientCertRequest.getHost();
                    i = clientCertRequest.getPort();
                } else {
                    str = "";
                    i = -1;
                }
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.CLIENT_CERT_REQUEST, str, Integer.valueOf(i), WebPlayerView.access$400(WebPlayerView.this));
            }
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            if (WebPlayerView.access$500(WebPlayerView.this, "onReceivedError")) {
                super.onReceivedError(webView, i, str, str2);
            }
            if (WebPlayerView.access$600(WebPlayerView.this, "onReceivedError")) {
                WebPlayerEventBridge.error(WebPlayerView.access$400(WebPlayerView.this), str2, str);
            }
        }

        public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            if (WebPlayerView.access$500(WebPlayerView.this, "onReceivedHttpAuthRequest")) {
                super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            }
            if (WebPlayerView.access$600(WebPlayerView.this, "onReceivedHttpAuthRequest")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.HTTP_AUTH_REQUEST, str, str2, WebPlayerView.access$400(WebPlayerView.this));
            }
        }

        @TargetApi(21)
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            int i;
            if (WebPlayerView.access$500(WebPlayerView.this, "onReceivedHttpError")) {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            }
            if (WebPlayerView.access$600(WebPlayerView.this, "onReceivedHttpError")) {
                String str = "";
                String uri = (webResourceRequest == null || webResourceRequest.getUrl() == null) ? "" : webResourceRequest.getUrl().toString();
                if (webResourceResponse != null) {
                    int statusCode = webResourceResponse.getStatusCode();
                    String reasonPhrase = webResourceResponse.getReasonPhrase();
                    i = statusCode;
                    str = reasonPhrase;
                } else {
                    i = -1;
                }
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.HTTP_ERROR, uri, str, Integer.valueOf(i), WebPlayerView.access$400(WebPlayerView.this));
            }
        }

        public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
            if (WebPlayerView.access$500(WebPlayerView.this, "onReceivedLoginRequest")) {
                super.onReceivedLoginRequest(webView, str, str2, str3);
            }
            if (WebPlayerView.access$600(WebPlayerView.this, "onReceivedLoginRequest")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.LOGIN_REQUEST, str, str2, str3, WebPlayerView.access$400(WebPlayerView.this));
            }
        }

        @TargetApi(14)
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            if (sslError != null) {
                DeviceLog.error("Received SSL error for '%s': %s", sslError.getUrl(), sslError.toString());
            } else {
                DeviceLog.error("Received unknown SSL error: SslError was null");
            }
            if (WebPlayerView.access$600(WebPlayerView.this, "onReceivedSslError")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.SSL_ERROR, sslError != null ? sslError.getUrl() : "", WebPlayerView.access$400(WebPlayerView.this));
            }
        }

        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Utilities.runOnUiThread(new 1(webView));
            WebPlayerEventBridge.error(WebPlayerView.access$400(WebPlayerView.this), WebPlayerView.this.getUrl(), "UnityAds Sdk WebPlayer onRenderProcessGone : " + renderProcessGoneDetail.toString());
            DeviceLog.error("UnityAds Sdk WebPlayer onRenderProcessGone : " + renderProcessGoneDetail.toString());
            return true;
        }

        public void onScaleChanged(WebView webView, float f, float f2) {
            if (WebPlayerView.access$500(WebPlayerView.this, "onScaleChanged")) {
                super.onScaleChanged(webView, f, f2);
            }
            if (WebPlayerView.access$600(WebPlayerView.this, "onScaleChanged")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.SCALE_CHANGED, Float.valueOf(f), Float.valueOf(f2), WebPlayerView.access$400(WebPlayerView.this));
            }
        }

        public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
            if (WebPlayerView.access$500(WebPlayerView.this, "onUnhandledKeyEvent")) {
                super.onUnhandledKeyEvent(webView, keyEvent);
            }
            if (WebPlayerView.access$600(WebPlayerView.this, "onUnhandledKeyEvent")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.UNHANDLED_KEY_EVENT, Integer.valueOf(keyEvent.getKeyCode()), Integer.valueOf(keyEvent.getAction()), WebPlayerView.access$400(WebPlayerView.this));
            }
        }

        @TargetApi(21)
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            WebResourceResponse shouldInterceptRequest = WebPlayerView.access$500(WebPlayerView.this, "shouldInterceptRequest") ? super.shouldInterceptRequest(webView, webResourceRequest) : null;
            if (WebPlayerView.access$600(WebPlayerView.this, "shouldInterceptRequest")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.SHOULD_INTERCEPT_REQUEST, webResourceRequest.getUrl().toString(), WebPlayerView.access$400(WebPlayerView.this));
            }
            return shouldInterceptRequest;
        }

        public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
            Boolean bool = Boolean.FALSE;
            if (WebPlayerView.access$500(WebPlayerView.this, "shouldOverrideKeyEvent")) {
                bool = Boolean.valueOf(super.shouldOverrideKeyEvent(webView, keyEvent));
            }
            if (WebPlayerView.access$600(WebPlayerView.this, "shouldOverrideKeyEvent")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.SHOULD_OVERRIDE_KEY_EVENT, Integer.valueOf(keyEvent.getKeyCode()), Integer.valueOf(keyEvent.getAction()), WebPlayerView.access$400(WebPlayerView.this));
            }
            if (WebPlayerView.access$700(WebPlayerView.this, "shouldOverrideKeyEvent")) {
                bool = (Boolean) WebPlayerView.access$800(WebPlayerView.this, "shouldOverrideKeyEvent", Boolean.class, Boolean.TRUE);
            }
            return bool.booleanValue();
        }

        @TargetApi(21)
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Boolean bool = Boolean.FALSE;
            if (WebPlayerView.access$500(WebPlayerView.this, "shouldOverrideUrlLoading")) {
                bool = Boolean.valueOf(super.shouldOverrideUrlLoading(webView, webResourceRequest));
            }
            if (WebPlayerView.access$600(WebPlayerView.this, "shouldOverrideUrlLoading")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.SHOULD_OVERRIDE_URL_LOADING, webResourceRequest.getUrl().toString(), webResourceRequest.getMethod(), WebPlayerView.access$400(WebPlayerView.this));
            }
            if (WebPlayerView.access$700(WebPlayerView.this, "shouldOverrideUrlLoading")) {
                bool = (Boolean) WebPlayerView.access$800(WebPlayerView.this, "shouldOverrideUrlLoading", Boolean.class, Boolean.TRUE);
            }
            return bool.booleanValue();
        }

        public /* synthetic */ WebPlayerClient(WebPlayerView webPlayerView, 1 r2) {
            this();
        }

        @TargetApi(25)
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            String str;
            if (WebPlayerView.access$500(WebPlayerView.this, "onReceivedError")) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
            }
            if (WebPlayerView.access$600(WebPlayerView.this, "onReceivedError")) {
                String str2 = "";
                if (webResourceError == null || webResourceError.getDescription() == null) {
                    str = "";
                } else {
                    str = webResourceError.getDescription().toString();
                }
                if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
                    str2 = webResourceRequest.getUrl().toString();
                }
                WebPlayerEventBridge.error(WebPlayerView.access$400(WebPlayerView.this), str2, str);
            }
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Boolean bool = Boolean.FALSE;
            if (WebPlayerView.access$500(WebPlayerView.this, "shouldOverrideUrlLoading")) {
                bool = Boolean.valueOf(super.shouldOverrideUrlLoading(webView, str));
            }
            if (WebPlayerView.access$600(WebPlayerView.this, "shouldOverrideUrlLoading")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.SHOULD_OVERRIDE_URL_LOADING, str, WebPlayerView.access$400(WebPlayerView.this));
            }
            if (WebPlayerView.access$700(WebPlayerView.this, "shouldOverrideUrlLoading")) {
                bool = (Boolean) WebPlayerView.access$800(WebPlayerView.this, "shouldOverrideUrlLoading", Boolean.class, Boolean.TRUE);
            }
            return bool.booleanValue();
        }
    }

    public class WebPlayerDownloadListener implements DownloadListener {
        private WebPlayerDownloadListener() {
        }

        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            if (WebPlayerView.access$600(WebPlayerView.this, "onDownloadStart")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.DOWNLOAD_START, str, str2, str3, str4, Long.valueOf(j), WebPlayerView.access$400(WebPlayerView.this));
            }
        }

        public /* synthetic */ WebPlayerDownloadListener(WebPlayerView webPlayerView, 1 r2) {
            this();
        }
    }

    public WebPlayerView(Context context, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        super(context);
        this._evaluateJavascript = null;
        this._unsubscribeLayoutChange = null;
        this.viewId = str;
        WebSettings settings = getSettings();
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        try {
            this._evaluateJavascript = WebView.class.getMethod("evaluateJavascript", new Class[]{String.class, ValueCallback.class});
        } catch (NoSuchMethodException e) {
            DeviceLog.exception("Method evaluateJavascript not found", e);
            this._evaluateJavascript = null;
        }
        settings.setCacheMode(2);
        settings.setDatabaseEnabled(false);
        settings.setDomStorageEnabled(false);
        settings.setGeolocationEnabled(false);
        settings.setJavaScriptEnabled(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setPluginState(WebSettings.PluginState.OFF);
        settings.setRenderPriority(WebSettings.RenderPriority.NORMAL);
        settings.setSaveFormData(false);
        settings.setSavePassword(false);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setInitialScale(0);
        setBackgroundColor(0);
        ViewUtilities.setBackground(this, new ColorDrawable(0));
        setBackgroundResource(0);
        setSettings(jSONObject, jSONObject2);
        setWebViewClient(new WebPlayerClient(this, null));
        setWebChromeClient(new WebPlayerChromeClient(this, null));
        setDownloadListener(new WebPlayerDownloadListener(this, null));
        addJavascriptInterface(new WebPlayerBridgeInterface(str), "webplayerbridge");
        WebPlayerViewCache.getInstance().addWebPlayer(str, this);
        subscribeOnLayoutChange();
    }

    public static /* synthetic */ Method access$300(WebPlayerView webPlayerView) {
        return webPlayerView._evaluateJavascript;
    }

    public static /* synthetic */ String access$400(WebPlayerView webPlayerView) {
        return webPlayerView.viewId;
    }

    public static /* synthetic */ boolean access$500(WebPlayerView webPlayerView, String str) {
        return webPlayerView.shouldCallSuper(str);
    }

    public static /* synthetic */ boolean access$600(WebPlayerView webPlayerView, String str) {
        return webPlayerView.shouldSendEvent(str);
    }

    public static /* synthetic */ boolean access$700(WebPlayerView webPlayerView, String str) {
        return webPlayerView.hasReturnValue(str);
    }

    public static /* synthetic */ Object access$800(WebPlayerView webPlayerView, String str, Class cls, Object obj) {
        return webPlayerView.getReturnValue(str, cls, obj);
    }

    private void addErroredSetting(String str, String str2) {
        if (this._erroredSettings == null) {
            this._erroredSettings = new HashMap();
        }
        this._erroredSettings.put(str, str2);
    }

    private Object getReturnValue(String str, Class cls, Object obj) {
        try {
            JSONObject jSONObject = this._eventSettings;
            if (jSONObject != null && jSONObject.has(str) && this._eventSettings.getJSONObject(str).has("returnValue")) {
                return cls.cast(this._eventSettings.getJSONObject(str).get("returnValue"));
            }
        } catch (Exception e) {
            DeviceLog.exception("Error getting default return value", e);
        }
        return obj;
    }

    private Class[] getTypes(JSONArray jSONArray) throws JSONException, ClassNotFoundException {
        if (jSONArray == null) {
            return null;
        }
        Class[] clsArr = new Class[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            if (jSONArray.get(i) instanceof JSONObject) {
                clsArr[i] = Class.forName(((JSONObject) jSONArray.get(i)).getString("className"));
            } else {
                clsArr[i] = getPrimitiveClass(jSONArray.get(i).getClass());
            }
        }
        return clsArr;
    }

    private Object[] getValues(JSONArray jSONArray) throws JSONException, ClassNotFoundException, NoSuchMethodException {
        if (jSONArray == null) {
            return null;
        }
        Object[] objArr = new Object[jSONArray.length()];
        Object[] objArr2 = new Object[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            if (jSONArray.get(i) instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                Object obj = jSONObject.get("value");
                String string = jSONObject.getString("type");
                String string2 = jSONObject.has("className") ? jSONObject.getString("className") : null;
                if (string2 != null && string.equals("Enum")) {
                    objArr2[i] = Enum.valueOf(Class.forName(string2), (String) obj);
                }
            } else {
                objArr2[i] = jSONArray.get(i);
            }
        }
        System.arraycopy(objArr2, 0, objArr, 0, jSONArray.length());
        return objArr;
    }

    private boolean hasReturnValue(String str) {
        try {
            JSONObject jSONObject = this._eventSettings;
            if (jSONObject == null || !jSONObject.has(str)) {
                return false;
            }
            return this._eventSettings.getJSONObject(str).has("returnValue");
        } catch (Exception e) {
            DeviceLog.exception("Error getting default return value", e);
            return false;
        }
    }

    private Object setTargetSettings(Object obj, JSONObject jSONObject) {
        if (jSONObject != null) {
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray(str);
                    obj.getClass().getMethod(str, getTypes(jSONArray)).invoke(obj, getValues(jSONArray));
                } catch (Exception e) {
                    addErroredSetting(str, e.getMessage());
                    DeviceLog.exception("Setting errored", e);
                }
            }
        }
        return obj;
    }

    private boolean shouldCallSuper(String str) {
        try {
            JSONObject jSONObject = this._eventSettings;
            if (jSONObject != null && jSONObject.has(str) && this._eventSettings.getJSONObject(str).has("callSuper")) {
                return this._eventSettings.getJSONObject(str).getBoolean("callSuper");
            }
            return true;
        } catch (Exception e) {
            DeviceLog.exception("Error getting super call status", e);
            return true;
        }
    }

    private boolean shouldSendEvent(String str) {
        try {
            JSONObject jSONObject = this._eventSettings;
            if (jSONObject != null && jSONObject.has(str) && this._eventSettings.getJSONObject(str).has("sendEvent")) {
                return this._eventSettings.getJSONObject(str).getBoolean("sendEvent");
            }
            return false;
        } catch (Exception e) {
            DeviceLog.exception("Error getting send event status", e);
            return false;
        }
    }

    private void subscribeOnLayoutChange() {
        Runnable runnable = this._unsubscribeLayoutChange;
        if (runnable != null) {
            runnable.run();
        }
        1 r0 = new 1();
        addOnLayoutChangeListener(r0);
        this._unsubscribeLayoutChange = new 2(r0);
    }

    public void destroy() {
        super.destroy();
        WebPlayerViewCache.getInstance().removeWebPlayer(this.viewId);
        Runnable runnable = this._unsubscribeLayoutChange;
        if (runnable != null) {
            runnable.run();
        }
    }

    public Map getErroredSettings() {
        return this._erroredSettings;
    }

    public Class getPrimitiveClass(Class cls) {
        String name = cls.getName();
        return name.equals("java.lang.Byte") ? Byte.TYPE : name.equals("java.lang.Short") ? Short.TYPE : name.equals("java.lang.Integer") ? Integer.TYPE : name.equals("java.lang.Long") ? Long.TYPE : name.equals("java.lang.Character") ? Character.TYPE : name.equals("java.lang.Float") ? Float.TYPE : name.equals("java.lang.Double") ? Double.TYPE : name.equals("java.lang.Boolean") ? Boolean.TYPE : name.equals("java.lang.Void") ? Void.TYPE : cls;
    }

    public void invokeJavascript(String str) {
        Utilities.runOnUiThread(new JavaScriptInvocation(str, this));
    }

    public void onLayoutChange() {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        WebPlayerEventBridge.sendFrameUpdate(this.viewId, iArr[0], iArr[1], getWidth(), getHeight(), getAlpha());
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        onLayoutChange();
    }

    public void sendEvent(JSONArray jSONArray) {
        invokeJavascript("javascript:window.nativebridge.receiveEvent(" + jSONArray.toString() + ")");
    }

    public void setEventSettings(JSONObject jSONObject) {
        this._eventSettings = jSONObject;
    }

    public void setSettings(JSONObject jSONObject, JSONObject jSONObject2) {
        Map map = this._erroredSettings;
        if (map != null) {
            map.clear();
        }
        setTargetSettings(getSettings(), jSONObject);
        setTargetSettings(this, jSONObject2);
    }
}
