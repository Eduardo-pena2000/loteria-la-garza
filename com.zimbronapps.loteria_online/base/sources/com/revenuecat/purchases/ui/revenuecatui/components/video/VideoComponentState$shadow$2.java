package com.revenuecat.purchases.ui.revenuecatui.components.video;

import com.revenuecat.purchases.ui.revenuecatui.components.PresentedVideoPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyles;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VideoComponentState$shadow$2 extends u implements Qa.a {
    final /* synthetic */ VideoComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoComponentState$shadow$2(VideoComponentState videoComponentState) {
        super(0);
        this.this$0 = videoComponentState;
    }

    public final ShadowStyles invoke() {
        ShadowStyles shadow;
        PresentedVideoPartial access$getPresentedPartial = VideoComponentState.access$getPresentedPartial(this.this$0);
        return (access$getPresentedPartial == null || (shadow = access$getPresentedPartial.getShadow()) == null) ? VideoComponentState.access$getStyle$p(this.this$0).getShadow() : shadow;
    }
}
