package com.revenuecat.purchases.ui.revenuecatui.components.video;

import Ca.K;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VideoComponentState$videoAspectRatio$2 extends u implements Qa.a {
    final /* synthetic */ VideoComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoComponentState$videoAspectRatio$2(VideoComponentState videoComponentState) {
        super(0);
        this.this$0 = videoComponentState;
    }

    public final Float invoke() {
        return Float.valueOf(((float) K.c(this.this$0.getVideoUrls().getWidth-pVg5ArA())) / ((float) K.c(this.this$0.getVideoUrls().getHeight-pVg5ArA())));
    }
}
