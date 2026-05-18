package com.unity3d.ads.beta;

import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class UnityAdsError {
    private final int code;
    private final String message;

    public UnityAdsError(int i, String message) {
        t.g(message, "message");
        this.code = i;
        this.message = message;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }
}
