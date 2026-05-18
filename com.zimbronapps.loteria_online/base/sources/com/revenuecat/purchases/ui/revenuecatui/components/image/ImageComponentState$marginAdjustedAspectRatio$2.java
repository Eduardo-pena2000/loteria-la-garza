package com.revenuecat.purchases.ui.revenuecatui.components.image;

import Ca.K;
import Ca.o;
import Qa.a;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.AspectRatio;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ImageComponentState$marginAdjustedAspectRatio$2 extends u implements a {
    final /* synthetic */ ImageComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageComponentState$marginAdjustedAspectRatio$2(ImageComponentState imageComponentState) {
        super(0);
        this.this$0 = imageComponentState;
    }

    public final AspectRatio invoke() {
        Size sizePlusMargin = this.this$0.getSizePlusMargin();
        SizeConstraint.Fixed height = sizePlusMargin.getHeight();
        if (!(height instanceof SizeConstraint.Fixed)) {
            if (height instanceof SizeConstraint.Fit ? true : height instanceof SizeConstraint.Fill) {
                return null;
            }
            throw new o();
        }
        SizeConstraint.Fixed width = sizePlusMargin.getWidth();
        if (width instanceof SizeConstraint.Fit ? true : width instanceof SizeConstraint.Fill) {
            return null;
        }
        if (width instanceof SizeConstraint.Fixed) {
            return new AspectRatio(((float) K.c(width.getValue-pVg5ArA())) / ((float) K.c(height.getValue-pVg5ArA())), true);
        }
        throw new o();
    }
}
