package com.revenuecat.purchases.ui.revenuecatui.components.video;

import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.SizeKt;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VideoComponentState$sizePlusMargin$2 extends u implements Qa.a {
    final /* synthetic */ VideoComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoComponentState$sizePlusMargin$2(VideoComponentState videoComponentState) {
        super(0);
        this.this$0 = videoComponentState;
    }

    public final Size invoke() {
        return SizeKt.addMargin(this.this$0.getSize(), this.this$0.getMargin(), VideoComponentState.access$getLayoutDirection(this.this$0));
    }
}
