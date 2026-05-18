package com.unity3d.services.core.webview.bridge;

import com.unity3d.services.core.webview.WebViewApp;
import java.util.Arrays;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class SharedInstances$webViewEventSender$1 implements IEventSender {
    public boolean canSend() {
        return WebViewApp.getCurrentApp() != null;
    }

    public boolean sendEvent(Enum eventCategory, Enum eventId, Object... params) {
        t.g(eventCategory, "eventCategory");
        t.g(eventId, "eventId");
        t.g(params, "params");
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            return currentApp.sendEvent(eventCategory, eventId, Arrays.copyOf(params, params.length));
        }
        return false;
    }
}
