package com.unity3d.services.ads.operation;

import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker;
import com.unity3d.services.core.webview.bridge.IWebViewBridgeSharedObjectStore;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface IAdModule extends IWebViewBridgeSharedObjectStore {
    void executeAdOperation(IWebViewBridgeInvoker iWebViewBridgeInvoker, Object obj);

    SDKMetricsSender getMetricSender();
}
