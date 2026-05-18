package com.revenuecat.purchases.ui.revenuecatui.components.video;

import Ca.K;
import com.revenuecat.purchases.paywalls.components.properties.ImageUrls;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VideoComponentState$imageAspectRatio$2 extends u implements Qa.a {
    final /* synthetic */ VideoComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoComponentState$imageAspectRatio$2(VideoComponentState videoComponentState) {
        super(0);
        this.this$0 = videoComponentState;
    }

    public final Float invoke() {
        ImageUrls fallbackUrls = this.this$0.getFallbackUrls();
        if (fallbackUrls == null) {
            return null;
        }
        return Float.valueOf(((float) K.c(fallbackUrls.getWidth-pVg5ArA())) / ((float) K.c(fallbackUrls.getHeight-pVg5ArA())));
    }
}
