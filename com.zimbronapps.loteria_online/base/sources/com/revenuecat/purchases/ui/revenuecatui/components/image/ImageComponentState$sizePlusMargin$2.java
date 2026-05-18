package com.revenuecat.purchases.ui.revenuecatui.components.image;

import Qa.a;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.SizeKt;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ImageComponentState$sizePlusMargin$2 extends u implements a {
    final /* synthetic */ ImageComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageComponentState$sizePlusMargin$2(ImageComponentState imageComponentState) {
        super(0);
        this.this$0 = imageComponentState;
    }

    public final Size invoke() {
        return SizeKt.addMargin(this.this$0.getSize(), this.this$0.getMargin(), ImageComponentState.access$getLayoutDirection(this.this$0));
    }
}
