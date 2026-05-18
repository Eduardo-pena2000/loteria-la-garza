package com.unity3d.services.core.cache;

import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CacheEventSender implements Serializable {
    private final IEventSender eventSender;

    public CacheEventSender(IEventSender eventSender) {
        t.g(eventSender, "eventSender");
        this.eventSender = eventSender;
    }

    public final boolean sendEvent(CacheEvent eventId, Object... params) {
        t.g(eventId, "eventId");
        t.g(params, "params");
        return this.eventSender.sendEvent(WebViewEventCategory.CACHE, eventId, Arrays.copyOf(params, params.length));
    }
}
