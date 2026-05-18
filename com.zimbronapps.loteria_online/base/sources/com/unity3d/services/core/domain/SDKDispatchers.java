package com.unity3d.services.core.domain;

import cb.K;
import cb.e0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class SDKDispatchers implements ISDKDispatchers {
    private final K io = e0.b();
    private final K default = e0.a();
    private final K main = e0.c();

    public K getDefault() {
        return this.default;
    }

    public K getIo() {
        return this.io;
    }

    public K getMain() {
        return this.main;
    }
}
