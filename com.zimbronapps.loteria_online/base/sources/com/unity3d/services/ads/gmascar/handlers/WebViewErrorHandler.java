package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.d;
import com.unity3d.scar.adapter.common.m;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import com.unity3d.services.core.webview.bridge.SharedInstances;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class WebViewErrorHandler implements d {
    private final IEventSender _eventSender;

    public WebViewErrorHandler() {
        this(SharedInstances.INSTANCE.getWebViewEventSender());
    }

    public WebViewErrorHandler(IEventSender iEventSender) {
        this._eventSender = iEventSender;
    }

    public void handleError(m mVar) {
        this._eventSender.sendEvent(WebViewEventCategory.valueOf(mVar.getDomain()), mVar.getErrorCategory(), mVar.getErrorArguments());
    }
}
