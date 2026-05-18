package com.revenuecat.purchases.ui.revenuecatui.components.video;

import F.L;
import com.revenuecat.purchases.paywalls.components.PartialVideoComponent;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedVideoPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.PaddingKt;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VideoComponentState$margin$2 extends u implements Qa.a {
    final /* synthetic */ VideoComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoComponentState$margin$2(VideoComponentState videoComponentState) {
        super(0);
        this.this$0 = videoComponentState;
    }

    public final L invoke() {
        PartialVideoComponent partial;
        Padding margin;
        L paddingValues;
        PresentedVideoPartial access$getPresentedPartial = VideoComponentState.access$getPresentedPartial(this.this$0);
        return (access$getPresentedPartial == null || (partial = access$getPresentedPartial.getPartial()) == null || (margin = partial.getMargin()) == null || (paddingValues = PaddingKt.toPaddingValues(margin)) == null) ? VideoComponentState.access$getStyle$p(this.this$0).getMargin() : paddingValues;
    }
}
