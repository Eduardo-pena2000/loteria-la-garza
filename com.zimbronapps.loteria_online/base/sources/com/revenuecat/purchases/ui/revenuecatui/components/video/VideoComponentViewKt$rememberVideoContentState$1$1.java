package com.revenuecat.purchases.ui.revenuecatui.components.video;

import Ca.I;
import Ca.t;
import Ga.e;
import Ia.f;
import Ia.l;
import Qa.p;
import cb.O;
import cb.i;
import com.revenuecat.purchases.models.Checksum;
import com.revenuecat.purchases.paywalls.components.properties.VideoUrls;
import com.revenuecat.purchases.storage.FileRepository;
import java.net.URL;

@f(c = "com.revenuecat.purchases.ui.revenuecatui.components.video.VideoComponentViewKt$rememberVideoContentState$1$1", f = "VideoComponentView.kt", l = {}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VideoComponentViewKt$rememberVideoContentState$1$1 extends l implements p {
    final /* synthetic */ FileRepository $repository;
    final /* synthetic */ VideoUrls $videoUrls;
    private /* synthetic */ Object L$0;
    int label;

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.components.video.VideoComponentViewKt$rememberVideoContentState$1$1$1", f = "VideoComponentView.kt", l = {148}, m = "invokeSuspend")
    public static final class 1 extends l implements p {
        final /* synthetic */ FileRepository $repository;
        final /* synthetic */ VideoUrls $videoUrls;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(VideoUrls videoUrls, FileRepository fileRepository, e eVar) {
            super(2, eVar);
            this.$videoUrls = videoUrls;
            this.$repository = fileRepository;
        }

        public final e create(Object obj, e eVar) {
            return new 1(this.$videoUrls, this.$repository, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((1) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                URL url = this.$videoUrls.getUrl();
                Checksum checksum = this.$videoUrls.getChecksum();
                FileRepository fileRepository = this.$repository;
                this.label = 1;
                if (VideoComponentViewKt.cacheVideo(url, checksum, fileRepository, this) == f) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoComponentViewKt$rememberVideoContentState$1$1(VideoUrls videoUrls, FileRepository fileRepository, e eVar) {
        super(2, eVar);
        this.$videoUrls = videoUrls;
        this.$repository = fileRepository;
    }

    public final e create(Object obj, e eVar) {
        VideoComponentViewKt$rememberVideoContentState$1$1 videoComponentViewKt$rememberVideoContentState$1$1 = new VideoComponentViewKt$rememberVideoContentState$1$1(this.$videoUrls, this.$repository, eVar);
        videoComponentViewKt$rememberVideoContentState$1$1.L$0 = obj;
        return videoComponentViewKt$rememberVideoContentState$1$1;
    }

    public final Object invoke(O o, e eVar) {
        return ((VideoComponentViewKt$rememberVideoContentState$1$1) create(o, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Ha.c.f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t.b(obj);
        O o = (O) this.L$0;
        i.d(o, null, null, new 1(this.$videoUrls, this.$repository, null), 3, null);
        URL urlLowRes = this.$videoUrls.getUrlLowRes();
        if (urlLowRes != null) {
            if (kotlin.jvm.internal.t.c(urlLowRes, this.$videoUrls.getUrl())) {
                urlLowRes = null;
            }
            if (urlLowRes != null) {
                i.d(o, null, null, new VideoComponentViewKt$rememberVideoContentState$1$1$3$1(urlLowRes, this.$videoUrls, this.$repository, null), 3, null);
            }
        }
        return I.a;
    }
}
