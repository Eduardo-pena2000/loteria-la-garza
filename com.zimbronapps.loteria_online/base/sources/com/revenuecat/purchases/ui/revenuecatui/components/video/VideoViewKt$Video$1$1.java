package com.revenuecat.purchases.ui.revenuecatui.components.video;

import Ca.I;
import Ca.t;
import Ga.e;
import Ia.f;
import Ia.l;
import Qa.p;
import b0.C0;
import cb.O;

@f(c = "com.revenuecat.purchases.ui.revenuecatui.components.video.VideoViewKt$Video$1$1", f = "VideoView.kt", l = {}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VideoViewKt$Video$1$1 extends l implements p {
    final /* synthetic */ boolean $autoPlay;
    final /* synthetic */ C0 $videoView;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoViewKt$Video$1$1(C0 c0, boolean z, e eVar) {
        super(2, eVar);
        this.$videoView = c0;
        this.$autoPlay = z;
    }

    public final e create(Object obj, e eVar) {
        return new VideoViewKt$Video$1$1(this.$videoView, this.$autoPlay, eVar);
    }

    public final Object invoke(O o, e eVar) {
        return ((VideoViewKt$Video$1$1) create(o, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Ha.c.f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t.b(obj);
        TextureVideoView textureVideoView = (TextureVideoView) this.$videoView.getValue();
        if (textureVideoView != null) {
            textureVideoView.setAutoStart(this.$autoPlay);
            textureVideoView.startIfNeeded();
        }
        return I.a;
    }
}
