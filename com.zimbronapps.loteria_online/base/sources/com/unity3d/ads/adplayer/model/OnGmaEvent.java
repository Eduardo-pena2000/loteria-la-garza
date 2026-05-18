package com.unity3d.ads.adplayer.model;

import com.unity3d.scar.adapter.common.c;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class OnGmaEvent implements WebViewEvent {
    private final String category;
    private final String name;
    private final Object[] parameters;

    public OnGmaEvent(c gmaEvent) {
        t.g(gmaEvent, "gmaEvent");
        this.category = "GMA";
        this.name = gmaEvent.name();
        this.parameters = new Object[0];
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
