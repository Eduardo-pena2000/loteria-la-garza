package com.revenuecat.purchases.ui.revenuecatui.components.image;

import Qa.a;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedImagePartial;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyles;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ImageComponentState$shadow$2 extends u implements a {
    final /* synthetic */ ImageComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageComponentState$shadow$2(ImageComponentState imageComponentState) {
        super(0);
        this.this$0 = imageComponentState;
    }

    public final ShadowStyles invoke() {
        ShadowStyles shadow;
        PresentedImagePartial access$getPresentedPartial = ImageComponentState.access$getPresentedPartial(this.this$0);
        return (access$getPresentedPartial == null || (shadow = access$getPresentedPartial.getShadow()) == null) ? ImageComponentState.access$getStyle$p(this.this$0).getShadow() : shadow;
    }
}
