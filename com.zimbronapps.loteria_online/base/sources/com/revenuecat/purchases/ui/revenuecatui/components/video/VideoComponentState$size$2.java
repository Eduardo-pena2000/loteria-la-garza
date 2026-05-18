package com.revenuecat.purchases.ui.revenuecatui.components.video;

import com.revenuecat.purchases.paywalls.components.PartialVideoComponent;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedVideoPartial;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VideoComponentState$size$2 extends u implements Qa.a {
    final /* synthetic */ VideoComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoComponentState$size$2(VideoComponentState videoComponentState) {
        super(0);
        this.this$0 = videoComponentState;
    }

    public final Size invoke() {
        Size size;
        PartialVideoComponent partial;
        VideoComponentState videoComponentState = this.this$0;
        PresentedVideoPartial access$getPresentedPartial = VideoComponentState.access$getPresentedPartial(videoComponentState);
        if (access$getPresentedPartial == null || (partial = access$getPresentedPartial.getPartial()) == null || (size = partial.getSize()) == null) {
            size = VideoComponentState.access$getStyle$p(this.this$0).getSize();
        }
        return VideoComponentState.access$adjustForVideo(videoComponentState, size, this.this$0.getVideoUrls(), VideoComponentState.access$getDensity(this.this$0));
    }
}
