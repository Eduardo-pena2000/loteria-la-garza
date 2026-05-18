package com.unity3d.services.ads.api;

import com.unity3d.services.ads.webplayer.WebPlayerError;
import com.unity3d.services.ads.webplayer.WebPlayerEventBridge;
import com.unity3d.services.ads.webplayer.WebPlayerSettingsCache;
import com.unity3d.services.ads.webplayer.WebPlayerView;
import com.unity3d.services.ads.webplayer.WebPlayerViewCache;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class WebPlayer {

    public class 1 implements Runnable {
        final /* synthetic */ String val$url;
        final /* synthetic */ WebPlayerView val$webPlayerView;

        public 1(WebPlayerView webPlayerView, String str) {
            this.val$webPlayerView = webPlayerView;
            this.val$url = str;
        }

        public void run() {
            this.val$webPlayerView.loadUrl(this.val$url);
        }
    }

    public class 2 implements Runnable {
        final /* synthetic */ String val$data;
        final /* synthetic */ String val$encoding;
        final /* synthetic */ String val$mimeType;
        final /* synthetic */ WebPlayerView val$webPlayerView;

        public 2(WebPlayerView webPlayerView, String str, String str2, String str3) {
            this.val$webPlayerView = webPlayerView;
            this.val$data = str;
            this.val$mimeType = str2;
            this.val$encoding = str3;
        }

        public void run() {
            this.val$webPlayerView.loadData(this.val$data, this.val$mimeType, this.val$encoding);
        }
    }

    public class 3 implements Runnable {
        final /* synthetic */ String val$baseUrl;
        final /* synthetic */ String val$data;
        final /* synthetic */ String val$encoding;
        final /* synthetic */ String val$mimeType;
        final /* synthetic */ WebPlayerView val$webPlayerView;

        public 3(WebPlayerView webPlayerView, String str, String str2, String str3, String str4) {
            this.val$webPlayerView = webPlayerView;
            this.val$baseUrl = str;
            this.val$data = str2;
            this.val$mimeType = str3;
            this.val$encoding = str4;
        }

        public void run() {
            this.val$webPlayerView.loadDataWithBaseURL(this.val$baseUrl, this.val$data, this.val$mimeType, this.val$encoding, (String) null);
        }
    }

    public class 4 implements Runnable {
        final /* synthetic */ JSONObject val$webPlayerSettings;
        final /* synthetic */ WebPlayerView val$webPlayerView;
        final /* synthetic */ JSONObject val$webSettings;

        public 4(WebPlayerView webPlayerView, JSONObject jSONObject, JSONObject jSONObject2) {
            this.val$webPlayerView = webPlayerView;
            this.val$webSettings = jSONObject;
            this.val$webPlayerSettings = jSONObject2;
        }

        public void run() {
            this.val$webPlayerView.setSettings(this.val$webSettings, this.val$webPlayerSettings);
        }
    }

    public class 5 implements Runnable {
        final /* synthetic */ JSONObject val$eventSettings;
        final /* synthetic */ WebPlayerView val$webPlayerView;

        public 5(WebPlayerView webPlayerView, JSONObject jSONObject) {
            this.val$webPlayerView = webPlayerView;
            this.val$eventSettings = jSONObject;
        }

        public void run() {
            this.val$webPlayerView.setEventSettings(this.val$eventSettings);
        }
    }

    public class 6 implements Runnable {
        final /* synthetic */ WebPlayerView val$webPlayerView;

        public 6(WebPlayerView webPlayerView) {
            this.val$webPlayerView = webPlayerView;
        }

        public void run() {
            this.val$webPlayerView.setSettings(new JSONObject(), new JSONObject());
            this.val$webPlayerView.setEventSettings(new JSONObject());
        }
    }

    public class 7 implements Runnable {
        final /* synthetic */ String val$callId;
        final /* synthetic */ String val$viewId;
        final /* synthetic */ WebPlayerView val$webPlayerView;

        public 7(WebPlayerView webPlayerView, String str, String str2) {
            this.val$webPlayerView = webPlayerView;
            this.val$callId = str;
            this.val$viewId = str2;
        }

        public void run() {
            int[] iArr = new int[2];
            this.val$webPlayerView.getLocationOnScreen(iArr);
            WebPlayerEventBridge.sendGetFrameResponse(this.val$callId, this.val$viewId, iArr[0], iArr[1], this.val$webPlayerView.getWidth(), this.val$webPlayerView.getHeight(), this.val$webPlayerView.getAlpha());
        }
    }

    @WebViewExposed
    public static void clearSettings(String str, WebViewCallback webViewCallback) {
        WebPlayerSettingsCache webPlayerSettingsCache = WebPlayerSettingsCache.getInstance();
        webPlayerSettingsCache.removeWebSettings(str);
        webPlayerSettingsCache.removeWebPlayerSettings(str);
        webPlayerSettingsCache.removeWebPlayerEventSettings(str);
        WebPlayerView webPlayer = WebPlayerViewCache.getInstance().getWebPlayer(str);
        if (webPlayer == null) {
            webViewCallback.error(WebPlayerError.WEBPLAYER_NULL, new Object[0]);
        } else {
            Utilities.runOnUiThread(new 6(webPlayer));
            webViewCallback.invoke(new Object[0]);
        }
    }

    @WebViewExposed
    public static void getErroredSettings(String str, WebViewCallback webViewCallback) {
        WebPlayerView webPlayer = WebPlayerViewCache.getInstance().getWebPlayer(str);
        if (webPlayer == null) {
            webViewCallback.error(WebPlayerError.WEBPLAYER_NULL, new Object[0]);
            return;
        }
        Map erroredSettings = webPlayer.getErroredSettings();
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry entry : erroredSettings.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
        } catch (Exception e) {
            DeviceLog.exception("Error forming JSON object", e);
        }
        webViewCallback.invoke(jSONObject);
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void getFrame(String str, String str2, WebViewCallback webViewCallback) {
        webViewCallback.invoke(new Object[0]);
        WebPlayerView webPlayer = WebPlayerViewCache.getInstance().getWebPlayer(str2);
        if (webPlayer != null) {
            Utilities.runOnUiThread(new 7(webPlayer, str, str2));
        }
    }

    @WebViewExposed
    public static void sendEvent(JSONArray jSONArray, String str, WebViewCallback webViewCallback) {
        WebPlayerView webPlayer = WebPlayerViewCache.getInstance().getWebPlayer(str);
        if (webPlayer == null) {
            webViewCallback.error(WebPlayerError.WEBPLAYER_NULL, new Object[0]);
        } else {
            webPlayer.sendEvent(jSONArray);
            webViewCallback.invoke(new Object[0]);
        }
    }

    @WebViewExposed
    public static void setData(String str, String str2, String str3, String str4, WebViewCallback webViewCallback) {
        WebPlayerView webPlayer = WebPlayerViewCache.getInstance().getWebPlayer(str4);
        if (webPlayer == null) {
            webViewCallback.error(WebPlayerError.WEBPLAYER_NULL, new Object[0]);
        } else {
            Utilities.runOnUiThread(new 2(webPlayer, str, str2, str3));
            webViewCallback.invoke(new Object[0]);
        }
    }

    @WebViewExposed
    public static void setDataWithUrl(String str, String str2, String str3, String str4, String str5, WebViewCallback webViewCallback) {
        WebPlayerView webPlayer = WebPlayerViewCache.getInstance().getWebPlayer(str5);
        if (webPlayer == null) {
            webViewCallback.error(WebPlayerError.WEBPLAYER_NULL, new Object[0]);
        } else {
            Utilities.runOnUiThread(new 3(webPlayer, str, str2, str3, str4));
            webViewCallback.invoke(new Object[0]);
        }
    }

    @WebViewExposed
    public static void setEventSettings(JSONObject jSONObject, String str, WebViewCallback webViewCallback) {
        WebPlayerSettingsCache.getInstance().addWebPlayerEventSettings(str, jSONObject);
        WebPlayerView webPlayer = WebPlayerViewCache.getInstance().getWebPlayer(str);
        if (webPlayer == null) {
            webViewCallback.error(WebPlayerError.WEBPLAYER_NULL, new Object[0]);
        } else {
            Utilities.runOnUiThread(new 5(webPlayer, jSONObject));
            webViewCallback.invoke(new Object[0]);
        }
    }

    @WebViewExposed
    public static void setSettings(JSONObject jSONObject, JSONObject jSONObject2, String str, WebViewCallback webViewCallback) {
        WebPlayerSettingsCache.getInstance().addWebSettings(str, jSONObject);
        WebPlayerSettingsCache.getInstance().addWebPlayerSettings(str, jSONObject2);
        WebPlayerView webPlayer = WebPlayerViewCache.getInstance().getWebPlayer(str);
        if (webPlayer == null) {
            webViewCallback.error(WebPlayerError.WEBPLAYER_NULL, new Object[0]);
        } else {
            Utilities.runOnUiThread(new 4(webPlayer, jSONObject, jSONObject2));
            webViewCallback.invoke(new Object[0]);
        }
    }

    @WebViewExposed
    public static void setUrl(String str, String str2, WebViewCallback webViewCallback) {
        WebPlayerView webPlayer = WebPlayerViewCache.getInstance().getWebPlayer(str2);
        if (webPlayer == null) {
            webViewCallback.error(WebPlayerError.WEBPLAYER_NULL, new Object[0]);
        } else {
            Utilities.runOnUiThread(new 1(webPlayer, str));
            webViewCallback.invoke(new Object[0]);
        }
    }
}
