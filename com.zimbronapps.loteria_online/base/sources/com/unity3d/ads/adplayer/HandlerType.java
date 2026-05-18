package com.unity3d.ads.adplayer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public enum HandlerType {
    CALLBACK("handleCallback"),
    INVOCATION("handleInvocation"),
    EVENT("handleEvent");

    private final String jsPath;

    HandlerType(String str) {
        this.jsPath = str;
    }

    public final String getJsPath() {
        return this.jsPath;
    }
}
