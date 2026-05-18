package com.unity3d.ads.adplayer.model;

import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class OnBroadcastEvent implements WebViewEvent {
    private final String category;
    private final String name;
    private final Object[] parameters;

    public OnBroadcastEvent(String name, String str) {
        t.g(name, "name");
        this.name = name;
        this.category = "ADVIEWER";
        this.parameters = new Object[]{str};
    }

    public String getCategory() {
        return this.category;
    }

    public String getName() {
        return this.name;
    }

    public Object[] getParameters() {
        return this.parameters;
    }
}
