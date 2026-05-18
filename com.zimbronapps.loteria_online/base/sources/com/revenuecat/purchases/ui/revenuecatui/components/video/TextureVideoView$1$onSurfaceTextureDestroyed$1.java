package com.revenuecat.purchases.ui.revenuecatui.components.video;

import Ca.I;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TextureVideoView$1$onSurfaceTextureDestroyed$1 extends u implements Qa.a {
    final /* synthetic */ TextureVideoView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextureVideoView$1$onSurfaceTextureDestroyed$1(TextureVideoView textureVideoView) {
        super(0);
        this.this$0 = textureVideoView;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        invoke();
        return I.a;
    }

    public final void invoke() {
        TextureVideoView.access$getPlayer$p(this.this$0).pause();
    }
}
