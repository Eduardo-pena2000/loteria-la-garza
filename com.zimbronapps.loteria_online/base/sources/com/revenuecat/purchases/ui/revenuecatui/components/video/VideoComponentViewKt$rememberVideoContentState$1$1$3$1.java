package com.revenuecat.purchases.ui.revenuecatui.components.video;

import Ca.I;
import Ca.t;
import Ga.e;
import Ia.f;
import Ia.l;
import Qa.p;
import cb.O;
import com.revenuecat.purchases.models.Checksum;
import com.revenuecat.purchases.paywalls.components.properties.VideoUrls;
import com.revenuecat.purchases.storage.FileRepository;
import java.net.URL;

@f(c = "com.revenuecat.purchases.ui.revenuecatui.components.video.VideoComponentViewKt$rememberVideoContentState$1$1$3$1", f = "VideoComponentView.kt", l = {150}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VideoComponentViewKt$rememberVideoContentState$1$1$3$1 extends l implements p {
    final /* synthetic */ URL $it;
    final /* synthetic */ FileRepository $repository;
    final /* synthetic */ VideoUrls $videoUrls;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoComponentViewKt$rememberVideoContentState$1$1$3$1(URL url, VideoUrls videoUrls, FileRepository fileRepository, e eVar) {
        super(2, eVar);
        this.$it = url;
        this.$videoUrls = videoUrls;
        this.$repository = fileRepository;
    }

    public final e create(Object obj, e eVar) {
        return new VideoComponentViewKt$rememberVideoContentState$1$1$3$1(this.$it, this.$videoUrls, this.$repository, eVar);
    }

    public final Object invoke(O o, e eVar) {
        return ((VideoComponentViewKt$rememberVideoContentState$1$1$3$1) create(o, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f = Ha.c.f();
        int i = this.label;
        if (i == 0) {
            t.b(obj);
            URL url = this.$it;
            Checksum checksumLowRes = this.$videoUrls.getChecksumLowRes();
            FileRepository fileRepository = this.$repository;
            this.label = 1;
            if (VideoComponentViewKt.cacheVideo(url, checksumLowRes, fileRepository, this) == f) {
                return f;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
        }
        return I.a;
    }
}
