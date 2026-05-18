package com.unity3d.services.ads.gmascar.utils;

import com.unity3d.scar.adapter.common.c;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import com.unity3d.services.core.webview.bridge.SharedInstances;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class GMAEventSender implements IEventSender {
    private final IEventSender _eventSender;

    public GMAEventSender() {
        this(SharedInstances.INSTANCE.getWebViewEventSender());
    }

    public boolean canSend() {
        return this._eventSender.canSend();
    }

    public void send(c cVar, Object... objArr) {
        this._eventSender.sendEvent(WebViewEventCategory.GMA, cVar, objArr);
    }

    public boolean sendEvent(Enum r2, Enum r3, Object... objArr) {
        return this._eventSender.sendEvent(r2, r3, objArr);
    }

    public void sendVersion(String str) {
        this._eventSender.sendEvent(WebViewEventCategory.INIT_GMA, c.VERSION, str);
    }

    public GMAEventSender(IEventSender iEventSender) {
        this._eventSender = iEventSender;
    }
}
