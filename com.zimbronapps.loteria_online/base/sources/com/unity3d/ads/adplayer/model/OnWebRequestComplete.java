package com.unity3d.ads.adplayer.model;

import java.util.List;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class OnWebRequestComplete implements WebViewEvent {
    private final String category;
    private final String name;
    private final Object[] parameters;

    public OnWebRequestComplete(List value) {
        t.g(value, "value");
        this.category = "REQUEST";
        this.name = "COMPLETE";
        this.parameters = value.toArray(new Object[0]);
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
