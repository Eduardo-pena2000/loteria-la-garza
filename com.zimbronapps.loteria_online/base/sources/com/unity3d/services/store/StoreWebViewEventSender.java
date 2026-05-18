package com.unity3d.services.store;

import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import java.util.Arrays;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class StoreWebViewEventSender {
    private final IEventSender eventSender;

    public StoreWebViewEventSender(IEventSender eventSender) {
        t.g(eventSender, "eventSender");
        this.eventSender = eventSender;
    }

    public final void send(StoreEvent event, Object... params) {
        t.g(event, "event");
        t.g(params, "params");
        this.eventSender.sendEvent(WebViewEventCategory.STORE, event, Arrays.copyOf(params, params.length));
    }
}
