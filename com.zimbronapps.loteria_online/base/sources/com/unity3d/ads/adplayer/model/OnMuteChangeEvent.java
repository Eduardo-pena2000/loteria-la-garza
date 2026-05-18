package com.unity3d.ads.adplayer.model;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class OnMuteChangeEvent implements WebViewEvent {
    private final String category = "ADVIEWER";
    private final String name = "ON_MUTE_CHANGE";
    private final Object[] parameters;

    public OnMuteChangeEvent(boolean z) {
        this.parameters = new Object[]{Boolean.valueOf(z)};
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
