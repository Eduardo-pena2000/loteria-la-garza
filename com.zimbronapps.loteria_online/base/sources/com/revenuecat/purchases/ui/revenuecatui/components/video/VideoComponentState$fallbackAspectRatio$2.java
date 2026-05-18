package com.revenuecat.purchases.ui.revenuecatui.components.video;

import Ca.K;
import Ca.o;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.AspectRatio;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VideoComponentState$fallbackAspectRatio$2 extends u implements Qa.a {
    final /* synthetic */ VideoComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoComponentState$fallbackAspectRatio$2(VideoComponentState videoComponentState) {
        super(0);
        this.this$0 = videoComponentState;
    }

    public final AspectRatio invoke() {
        Float access$getImageAspectRatio = VideoComponentState.access$getImageAspectRatio(this.this$0);
        if (access$getImageAspectRatio == null) {
            return null;
        }
        VideoComponentState videoComponentState = this.this$0;
        float floatValue = access$getImageAspectRatio.floatValue();
        Size size = videoComponentState.getSize();
        SizeConstraint.Fixed height = size.getHeight();
        if (height instanceof SizeConstraint.Fit) {
            SizeConstraint width = size.getWidth();
            if (!(width instanceof SizeConstraint.Fit) && !(width instanceof SizeConstraint.Fill)) {
                if (width instanceof SizeConstraint.Fixed) {
                    return null;
                }
                throw new o();
            }
            return new AspectRatio(floatValue, true);
        }
        if (height instanceof SizeConstraint.Fill) {
            SizeConstraint width2 = size.getWidth();
            if (width2 instanceof SizeConstraint.Fit) {
                return new AspectRatio(floatValue, false);
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
