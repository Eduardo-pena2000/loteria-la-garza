package com.unity3d.ads.core.domain;

import cb.K;
import cb.O;
import cb.e0;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.adplayer.CommonWebViewBridge;
import com.unity3d.ads.adplayer.WebViewBridge;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CommonGetWebViewBridgeUseCase implements GetWebViewBridgeUseCase {
    private final K dispatcher;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public CommonGetWebViewBridgeUseCase(K dispatcher, SendDiagnosticEvent sendDiagnosticEvent) {
        t.g(dispatcher, "dispatcher");
        t.g(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.dispatcher = dispatcher;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    public WebViewBridge invoke(AndroidWebViewContainer webViewContainer, O adPlayerScope) {
        t.g(webViewContainer, "webViewContainer");
        t.g(adPlayerScope, "adPlayerScope");
        return new CommonWebViewBridge(this.dispatcher, webViewContainer, adPlayerScope, this.sendDiagnosticEvent);
    }

    public /* synthetic */ CommonGetWebViewBridgeUseCase(K k, SendDiagnosticEvent sendDiagnosticEvent, int i, k kVar) {
        this((i & 1) != 0 ? e0.a() : k, sendDiagnosticEvent);
    }
}
