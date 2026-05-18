package com.unity3d.ads.adplayer.model;

import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class OnPrivacyFsmChangeEvent implements WebViewEvent {
    private final String category;
    private final String name;
    private final Object[] parameters;

    public OnPrivacyFsmChangeEvent(String value) {
        t.g(value, "value");
        this.category = "ADVIEWER";
        this.name = "ON_PRIVACY_FSM_CHANGE";
        this.parameters = new Object[]{value};
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
