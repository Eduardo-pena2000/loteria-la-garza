package com.unity3d.ads.adplayer;

import Ga.e;
import fb.N;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface WebViewContainer {
    Object addJavascriptInterface(WebViewBridge webViewBridge, String str, e eVar);

    Object destroy(e eVar);

    Object evaluateJavascript(String str, e eVar);

    N getLastInputEvent();

    Object loadUrl(String str, e eVar);
}
