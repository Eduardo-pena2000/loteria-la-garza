package com.revenuecat.purchases.ui.revenuecatui.components.image;

import Qa.a;
import com.revenuecat.purchases.paywalls.components.PartialImageComponent;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedImagePartial;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ImageComponentState$size$2 extends u implements a {
    final /* synthetic */ ImageComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageComponentState$size$2(ImageComponentState imageComponentState) {
        super(0);
        this.this$0 = imageComponentState;
    }

    public final Size invoke() {
        Size size;
        PartialImageComponent partial;
        ImageComponentState imageComponentState = this.this$0;
        PresentedImagePartial access$getPresentedPartial = ImageComponentState.access$getPresentedPartial(imageComponentState);
        if (access$getPresentedPartial == null || (partial = access$getPresentedPartial.getPartial()) == null || (size = partial.getSize()) == null) {
            size = ImageComponentState.access$getStyle$p(this.this$0).getSize();
        }
        return ImageComponentState.access$adjustForImage(imageComponentState, size, this.this$0.getImageUrls(), ImageComponentState.access$getDensity(this.this$0));
    }
}
