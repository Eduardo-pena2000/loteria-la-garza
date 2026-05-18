package com.unity3d.ads.adplayer.model;

import com.unity3d.services.banners.bridge.BannerBridge;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class OnScarBannerEvent implements WebViewEvent {
    private final String category;
    private final String name;
    private final Object[] parameters;

    public OnScarBannerEvent(BannerBridge.BannerEvent bannerEvent) {
        t.g(bannerEvent, "bannerEvent");
        this.category = "BANNER";
        this.name = bannerEvent.name();
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
