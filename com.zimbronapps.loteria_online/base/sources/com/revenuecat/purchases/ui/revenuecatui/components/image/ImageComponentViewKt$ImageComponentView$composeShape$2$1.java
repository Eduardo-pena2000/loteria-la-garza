package com.revenuecat.purchases.ui.revenuecatui.components.image;

import Qa.a;
import kotlin.jvm.internal.u;
import v0.E1;
import v0.t1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ImageComponentViewKt$ImageComponentView$composeShape$2$1 extends u implements a {
    final /* synthetic */ ImageComponentState $imageState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageComponentViewKt$ImageComponentView$composeShape$2$1(ImageComponentState imageComponentState) {
        super(0);
        this.$imageState = imageComponentState;
    }

    public final E1 invoke() {
        E1 shape = this.$imageState.getShape();
        return shape == null ? t1.a() : shape;
    }
}
