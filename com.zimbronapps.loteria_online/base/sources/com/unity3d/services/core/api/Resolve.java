package com.unity3d.services.core.api;

import com.unity3d.services.core.request.IResolveHostListener;
import com.unity3d.services.core.request.ResolveHostError;
import com.unity3d.services.core.request.ResolveHostEvent;
import com.unity3d.services.core.request.WebRequestThread;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class Resolve {

    public class 1 implements IResolveHostListener {
        final /* synthetic */ String val$id;

        public 1(String str) {
            this.val$id = str;
        }

        public void onFailed(String str, ResolveHostError resolveHostError, String str2) {
            if (WebViewApp.getCurrentApp() != null) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.RESOLVE, ResolveHostEvent.FAILED, this.val$id, str, resolveHostError.name(), str2);
            }
        }

        public void onResolve(String str, String str2) {
            if (WebViewApp.getCurrentApp() != null) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.RESOLVE, ResolveHostEvent.COMPLETE, this.val$id, str, str2);
            }
        }
    }

    @WebViewExposed
    public static void resolve(String str, String str2, WebViewCallback webViewCallback) {
        if (WebRequestThread.resolve(str2, new 1(str))) {
            webViewCallback.invoke(str);
        } else {
            webViewCallback.error(ResolveHostError.INVALID_HOST, str);
        }
    }
}
