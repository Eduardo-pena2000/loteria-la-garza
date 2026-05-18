package com.unity3d.ads.adplayer.model;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class OnVolumeChangeEvent implements WebViewEvent {
    private final String category = "ADVIEWER";
    private final String name = "ON_VOLUME_CHANGE";
    private final Object[] parameters;

    public OnVolumeChangeEvent(double d) {
        this.parameters = new Object[]{Double.valueOf(d)};
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
