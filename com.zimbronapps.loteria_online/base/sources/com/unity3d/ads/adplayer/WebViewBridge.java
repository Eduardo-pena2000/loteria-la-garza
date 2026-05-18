package com.unity3d.ads.adplayer;

import Ga.e;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import fb.D;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface WebViewBridge {
    D getOnInvocation();

    void handleCallback(String str, String str2, String str3);

    void handleInvocation(String str);

    Object request(String str, String str2, Object[] objArr, e eVar);

    Object sendEvent(WebViewEvent webViewEvent, e eVar);
}
