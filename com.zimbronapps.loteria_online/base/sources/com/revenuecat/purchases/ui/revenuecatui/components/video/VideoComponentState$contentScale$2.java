package com.revenuecat.purchases.ui.revenuecatui.components.video;

import M0.f;
import com.revenuecat.purchases.paywalls.components.PartialVideoComponent;
import com.revenuecat.purchases.paywalls.components.properties.FitMode;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedVideoPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.FitModeKt;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VideoComponentState$contentScale$2 extends u implements Qa.a {
    final /* synthetic */ VideoComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoComponentState$contentScale$2(VideoComponentState videoComponentState) {
        super(0);
        this.this$0 = videoComponentState;
    }

    public final f invoke() {
        PartialVideoComponent partial;
        FitMode fitMode;
        f contentScale;
        PresentedVideoPartial access$getPresentedPartial = VideoComponentState.access$getPresentedPartial(this.this$0);
        return (access$getPresentedPartial == null || (partial = access$getPresentedPartial.getPartial()) == null || (fitMode = partial.getFitMode()) == null || (contentScale = FitModeKt.toContentScale(fitMode)) == null) ? VideoComponentState.access$getStyle$p(this.this$0).getContentScale() : contentScale;
    }
}
