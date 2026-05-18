package com.unity3d.ads.adplayer.model;

import com.unity3d.services.ads.offerwall.OfferwallEvent;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class OnOfferwallEvent implements WebViewEvent {
    private final String category;
    private final String name;
    private final Object[] parameters;

    public OnOfferwallEvent(OfferwallEvent offerwallEvent) {
        t.g(offerwallEvent, "offerwallEvent");
        this.category = "OFFERWALL";
        this.name = offerwallEvent.name();
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
