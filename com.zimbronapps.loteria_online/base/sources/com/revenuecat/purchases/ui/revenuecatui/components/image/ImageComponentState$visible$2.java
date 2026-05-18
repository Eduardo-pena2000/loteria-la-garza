package com.revenuecat.purchases.ui.revenuecatui.components.image;

import Qa.a;
import com.revenuecat.purchases.paywalls.components.PartialImageComponent;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedImagePartial;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ImageComponentState$visible$2 extends u implements a {
    final /* synthetic */ ImageComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageComponentState$visible$2(ImageComponentState imageComponentState) {
        super(0);
        this.this$0 = imageComponentState;
    }

    public final Boolean invoke() {
        PartialImageComponent partial;
        Boolean visible;
        PresentedImagePartial access$getPresentedPartial = ImageComponentState.access$getPresentedPartial(this.this$0);
        return Boolean.valueOf((access$getPresentedPartial == null || (partial = access$getPresentedPartial.getPartial()) == null || (visible = partial.getVisible()) == null) ? ImageComponentState.access$getStyle$p(this.this$0).getVisible() : visible.booleanValue());
    }
}
