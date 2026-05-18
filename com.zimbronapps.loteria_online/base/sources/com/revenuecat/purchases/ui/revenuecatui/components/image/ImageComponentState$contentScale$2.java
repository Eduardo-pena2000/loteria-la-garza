package com.revenuecat.purchases.ui.revenuecatui.components.image;

import M0.f;
import Qa.a;
import com.revenuecat.purchases.paywalls.components.PartialImageComponent;
import com.revenuecat.purchases.paywalls.components.properties.FitMode;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedImagePartial;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.FitModeKt;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ImageComponentState$contentScale$2 extends u implements a {
    final /* synthetic */ ImageComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageComponentState$contentScale$2(ImageComponentState imageComponentState) {
        super(0);
        this.this$0 = imageComponentState;
    }

    public final f invoke() {
        PartialImageComponent partial;
        FitMode fitMode;
        f contentScale;
        PresentedImagePartial access$getPresentedPartial = ImageComponentState.access$getPresentedPartial(this.this$0);
        return (access$getPresentedPartial == null || (partial = access$getPresentedPartial.getPartial()) == null || (fitMode = partial.getFitMode()) == null || (contentScale = FitModeKt.toContentScale(fitMode)) == null) ? ImageComponentState.access$getStyle$p(this.this$0).getContentScale() : contentScale;
    }
}
