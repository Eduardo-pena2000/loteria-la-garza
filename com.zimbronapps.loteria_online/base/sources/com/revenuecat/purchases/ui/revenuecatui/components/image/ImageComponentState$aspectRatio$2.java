package com.revenuecat.purchases.ui.revenuecatui.components.image;

import Ca.K;
import Ca.o;
import Qa.a;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.AspectRatio;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ImageComponentState$aspectRatio$2 extends u implements a {
    final /* synthetic */ ImageComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageComponentState$aspectRatio$2(ImageComponentState imageComponentState) {
        super(0);
        this.this$0 = imageComponentState;
    }

    public final AspectRatio invoke() {
        Size size = this.this$0.getSize();
        ImageComponentState imageComponentState = this.this$0;
        SizeConstraint.Fixed height = size.getHeight();
        if (height instanceof SizeConstraint.Fit) {
            SizeConstraint width = size.getWidth();
            if (!(width instanceof SizeConstraint.Fit) && !(width instanceof SizeConstraint.Fill)) {
                if (width instanceof SizeConstraint.Fixed) {
                    return null;
                }
                throw new o();
            }
            return new AspectRatio(ImageComponentState.access$getImageAspectRatio(imageComponentState), true);
        }
        if (height instanceof SizeConstraint.Fill) {
            SizeConstraint width2 = size.getWidth();
            if (width2 instanceof SizeConstraint.Fit) {
                return new AspectRatio(ImageComponentState.access$getImageAspectRatio(imageComponentState), false);
            }
            if ((width2 instanceof SizeConstraint.Fill) || (width2 instanceof SizeConstraint.Fixed)) {
                return null;
            }
            throw new o();
        }
        if (!(height instanceof SizeConstraint.Fixed)) {
            throw new o();
        }
        SizeConstraint.Fixed width3 = size.getWidth();
        if ((width3 instanceof SizeConstraint.Fit) || (width3 instanceof SizeConstraint.Fill)) {
            return null;
        }
        if (width3 instanceof SizeConstraint.Fixed) {
            return new AspectRatio(((float) K.c(width3.getValue-pVg5ArA())) / ((float) K.c(height.getValue-pVg5ArA())), true);
        }
        throw new o();
    }
}
