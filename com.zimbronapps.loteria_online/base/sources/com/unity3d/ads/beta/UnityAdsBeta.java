package com.unity3d.ads.beta;

import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class UnityAdsBeta {
    public static final void getToken(TokenConfiguration configuration, TokenListener listener) {
        t.g(configuration, "configuration");
        t.g(listener, "listener");
    }

    public static final String getVersion() {
        return "";
    }

    public static final void initialize(InitializationConfiguration configuration, InitializationListener listener) {
        t.g(configuration, "configuration");
        t.g(listener, "listener");
    }

    public static final boolean isInitialize() {
        return true;
    }
}
