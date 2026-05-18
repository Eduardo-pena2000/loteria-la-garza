package com.revenuecat.purchases.ui.revenuecatui.components.image;

import Ca.K;
import Qa.a;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ImageComponentState$imageAspectRatio$2 extends u implements a {
    final /* synthetic */ ImageComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageComponentState$imageAspectRatio$2(ImageComponentState imageComponentState) {
        super(0);
        this.this$0 = imageComponentState;
    }

    public final Float invoke() {
        return Float.valueOf(((float) K.c(this.this$0.getImageUrls().getWidth-pVg5ArA())) / ((float) K.c(this.this$0.getImageUrls().getHeight-pVg5ArA())));
    }
}
