package com.revenuecat.purchases.ui.revenuecatui.components.video;

import Ca.I;
import Qa.l;
import b0.C0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VideoViewKt$Video$3$3$1 extends u implements l {
    final /* synthetic */ Qa.a $onReady;
    final /* synthetic */ C0 $videoView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoViewKt$Video$3$3$1(C0 c0, Qa.a aVar) {
        super(1);
        this.$videoView = c0;
        this.$onReady = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TextureVideoView) obj);
        return I.a;
    }

    public final void invoke(TextureVideoView view) {
        t.g(view, "view");
        this.$videoView.setValue(view);
        view.setOnReadyCallback(this.$onReady);
    }
}
