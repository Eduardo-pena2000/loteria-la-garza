package com.unity3d.ads.adplayer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class WebViewAdPlayerKt {
    private static final String[] SHOW_EVENTS = {"com.unity3d.services.ads.api.AdViewer.started", "com.unity3d.services.ads.api.AdViewer.clicked", "com.unity3d.services.ads.api.AdViewer.completed", "com.unity3d.services.ads.api.AdViewer.failed", "com.unity3d.services.ads.api.AdViewer.cancelShowTimeout", "com.unity3d.services.ads.api.AdViewer.leftApplication"};
    private static final String[] LOAD_EVENTS = {"com.unity3d.services.ads.api.AdViewer.loadComplete", "com.unity3d.services.ads.api.AdViewer.loadError"};

    public static final /* synthetic */ String[] access$getLOAD_EVENTS$p() {
        return LOAD_EVENTS;
    }

    public static final /* synthetic */ String[] access$getSHOW_EVENTS$p() {
        return SHOW_EVENTS;
    }
}
