package com.revenuecat.purchases.ui.revenuecatui.components.video;

import kotlin.jvm.internal.u;
import v0.E1;
import v0.t1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VideoComponentViewKt$VideoComponentView$composeShape$2$1 extends u implements Qa.a {
    final /* synthetic */ VideoComponentState $videoState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoComponentViewKt$VideoComponentView$composeShape$2$1(VideoComponentState videoComponentState) {
        super(0);
        this.$videoState = videoComponentState;
    }

    public final E1 invoke() {
        E1 shape = this.$videoState.getShape();
        return shape == null ? t1.a() : shape;
    }
}
