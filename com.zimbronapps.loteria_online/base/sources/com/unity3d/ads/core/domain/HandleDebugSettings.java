package com.unity3d.ads.core.domain;

import android.webkit.WebView;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class HandleDebugSettings {
    public final void invoke(NativeConfigurationOuterClass.DebugSettings debugSettings) {
        t.g(debugSettings, "debugSettings");
        WebView.setWebContentsDebuggingEnabled(debugSettings.getWebviewInspectable());
    }
}
