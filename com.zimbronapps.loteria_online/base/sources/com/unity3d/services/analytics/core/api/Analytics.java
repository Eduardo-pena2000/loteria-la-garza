package com.unity3d.services.analytics.core.api;

import com.unity3d.services.analytics.interfaces.AnalyticsError;
import com.unity3d.services.analytics.interfaces.IAnalytics;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class Analytics {
    public static IAnalytics analyticsInterface;

    public class 1 implements Runnable {
        final /* synthetic */ String val$extras;

        public 1(String str) {
            this.val$extras = str;
        }

        public void run() {
            Analytics.analyticsInterface.onAddExtras(this.val$extras);
        }
    }

    @WebViewExposed
    public static void addExtras(String str, WebViewCallback webViewCallback) {
        if (analyticsInterface == null) {
            webViewCallback.error(AnalyticsError.API_NOT_FOUND, str);
        } else {
            Utilities.runOnUiThread(new 1(str));
            webViewCallback.invoke(new Object[0]);
        }
    }

    public static void setAnalyticsInterface(IAnalytics iAnalytics) {
        analyticsInterface = iAnalytics;
    }
}
