package com.revenuecat.purchases.ui.revenuecatui.components.video;

import Ca.K;
import Ca.o;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.AspectRatio;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VideoComponentState$marginAdjustedAspectRatio$2 extends u implements Qa.a {
    final /* synthetic */ VideoComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoComponentState$marginAdjustedAspectRatio$2(VideoComponentState videoComponentState) {
        super(0);
        this.this$0 = videoComponentState;
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
