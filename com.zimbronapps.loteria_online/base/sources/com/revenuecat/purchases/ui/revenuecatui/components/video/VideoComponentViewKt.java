package com.revenuecat.purchases.ui.revenuecatui.components.video;

import Ca.I;
import Ia.f;
import Qa.p;
import androidx.compose.ui.e;
import b0.C0;
import b0.b0;
import b0.g1;
import b0.h2;
import b0.m;
import b0.w;
import com.revenuecat.purchases.paywalls.components.properties.VideoUrls;
import com.revenuecat.purchases.storage.FileRepository;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.AspectRatio;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.AspectRatioKt;
import com.revenuecat.purchases.ui.revenuecatui.components.style.VideoComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import java.net.URI;
import java.net.URL;
import k0.v;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import u0.h;
import v0.E1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VideoComponentViewKt {

    public static final class 1 extends u implements p {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(2);
        }

        public final e invoke(e applyIfNotNull, AspectRatio it) {
            t.g(applyIfNotNull, "$this$applyIfNotNull");
            t.g(it, "it");
            return AspectRatioKt.aspectRatio(applyIfNotNull, it);
        }
    }

    public static final class 6 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ e $modifier;
        final /* synthetic */ FileRepository $repository;
        final /* synthetic */ PaywallState.Loaded.Components $state;
        final /* synthetic */ VideoComponentStyle $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 6(VideoComponentStyle videoComponentStyle, PaywallState.Loaded.Components components, e eVar, FileRepository fileRepository, int i, int i2) {
            super(2);
            this.$style = videoComponentStyle;
            this.$state = components;
            this.$modifier = eVar;
            this.$repository = fileRepository;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            VideoComponentViewKt.VideoComponentView(this.$style, this.$state, this.$modifier, this.$repository, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.components.video.VideoComponentViewKt", f = "VideoComponentView.kt", l = {183}, m = "cacheVideo")
    public static final class 1 extends Ia.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public 1(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VideoComponentViewKt.cacheVideo(null, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void VideoComponentView(com.revenuecat.purchases.ui.revenuecatui.components.style.VideoComponentStyle r45, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Components r46, androidx.compose.ui.e r47, com.revenuecat.purchases.storage.FileRepository r48, b0.m r49, int r50, int r51) {
        /*
            Method dump skipped, instructions count: 1102
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.components.video.VideoComponentViewKt.VideoComponentView(com.revenuecat.purchases.ui.revenuecatui.components.style.VideoComponentStyle, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Components, androidx.compose.ui.e, com.revenuecat.purchases.storage.FileRepository, b0.m, int, int):void");
    }

    private static final E1 VideoComponentView$lambda$3(h2 h2Var) {
        return (E1) h2Var.getValue();
    }

    private static final boolean VideoComponentView$lambda$5(C0 c0) {
        return ((Boolean) c0.getValue()).booleanValue();
    }

    private static final void VideoComponentView$lambda$6(C0 c0, boolean z) {
        c0.setValue(Boolean.valueOf(z));
    }

    private static final boolean VideoComponentView$lambda$8(C0 c0) {
        return ((Boolean) c0.getValue()).booleanValue();
    }

    private static final void VideoComponentView$lambda$9(C0 c0, boolean z) {
        c0.setValue(Boolean.valueOf(z));
    }

    public static final /* synthetic */ E1 access$VideoComponentView$lambda$3(h2 h2Var) {
        return VideoComponentView$lambda$3(h2Var);
    }

    public static final /* synthetic */ void access$VideoComponentView$lambda$6(C0 c0, boolean z) {
        VideoComponentView$lambda$6(c0, z);
    }

    public static final /* synthetic */ void access$VideoComponentView$lambda$9(C0 c0, boolean z) {
        VideoComponentView$lambda$9(c0, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object cacheVideo(java.net.URL r4, com.revenuecat.purchases.models.Checksum r5, com.revenuecat.purchases.storage.FileRepository r6, Ga.e r7) {
        /*
            boolean r0 = r7 instanceof com.revenuecat.purchases.ui.revenuecatui.components.video.VideoComponentViewKt.cacheVideo.1
            if (r0 == 0) goto L13
            r0 = r7
            com.revenuecat.purchases.ui.revenuecatui.components.video.VideoComponentViewKt$cacheVideo$1 r0 = (com.revenuecat.purchases.ui.revenuecatui.components.video.VideoComponentViewKt.cacheVideo.1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.revenuecat.purchases.ui.revenuecatui.components.video.VideoComponentViewKt$cacheVideo$1 r0 = new com.revenuecat.purchases.ui.revenuecatui.components.video.VideoComponentViewKt$cacheVideo$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.L$0
            java.net.URL r4 = (java.net.URL) r4
            Ca.t.b(r7)     // Catch: java.lang.Exception -> L2d
            goto L5b
        L2d:
            r5 = move-exception
            goto L45
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            Ca.t.b(r7)
            r0.L$0 = r4     // Catch: java.lang.Exception -> L2d
            r0.label = r3     // Catch: java.lang.Exception -> L2d
            java.lang.Object r4 = r6.generateOrGetCachedFileURL(r4, r5, r0)     // Catch: java.lang.Exception -> L2d
            if (r4 != r1) goto L5b
            return r1
        L45:
            com.revenuecat.purchases.ui.revenuecatui.helpers.Logger r6 = com.revenuecat.purchases.ui.revenuecatui.helpers.Logger.INSTANCE
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Failed to cache video: "
            r7.append(r0)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            r6.e(r4, r5)
        L5b:
            Ca.I r4 = Ca.I.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.components.video.VideoComponentViewKt.cacheVideo(java.net.URL, com.revenuecat.purchases.models.Checksum, com.revenuecat.purchases.storage.FileRepository, Ga.e):java.lang.Object");
    }

    public static final /* synthetic */ boolean isVisibleInViewport(h hVar, int i, int i2) {
        t.g(hVar, "<this>");
        return hVar.j() > 0.0f && hVar.e() > 0.0f && hVar.i() < ((float) i) && hVar.l() < ((float) i2);
    }

    private static final URI rememberVideoContentState(VideoUrls videoUrls, FileRepository fileRepository, m mVar, int i) {
        mVar.V(541496876);
        if (w.L()) {
            w.U(541496876, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.video.rememberVideoContentState (VideoComponentView.kt:140)");
        }
        Object[] objArr = {videoUrls.getUrl()};
        mVar.V(-494481958);
        int i2 = (i & 14) ^ 6;
        boolean z = true;
        boolean E = ((i2 > 4 && mVar.U(videoUrls)) || (i & 6) == 4) | mVar.E(fileRepository);
        Object C = mVar.C();
        if (E || C == m.a.a()) {
            C = new VideoComponentViewKt$rememberVideoContentState$videoUrl$1$1(videoUrls, fileRepository);
            mVar.t(C);
        }
        mVar.P();
        URI uri = (URI) k0.d.f(objArr, (v) null, (String) null, (Qa.a) C, mVar, 0, 6);
        URL url = videoUrls.getUrl();
        mVar.V(-494476975);
        if ((i2 <= 4 || !mVar.U(videoUrls)) && (i & 6) != 4) {
            z = false;
        }
        boolean E2 = mVar.E(fileRepository) | z;
        Object C2 = mVar.C();
        if (E2 || C2 == m.a.a()) {
            C2 = new VideoComponentViewKt$rememberVideoContentState$1$1(videoUrls, fileRepository, null);
            mVar.t(C2);
        }
        mVar.P();
        b0.d(url, (p) C2, mVar, 0);
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return uri;
    }

    public static final /* synthetic */ URI resolveVideoUrl(VideoUrls videoUrls, FileRepository repository) {
        URI file;
        t.g(videoUrls, "videoUrls");
        t.g(repository, "repository");
        URI file2 = repository.getFile(videoUrls.getUrl(), videoUrls.getChecksum());
        if (file2 != null) {
            return file2;
        }
        URL urlLowRes = videoUrls.getUrlLowRes();
        if (urlLowRes != null) {
            if (t.c(urlLowRes, videoUrls.getUrl())) {
                urlLowRes = null;
            }
            if (urlLowRes != null && (file = repository.getFile(urlLowRes, videoUrls.getChecksumLowRes())) != null) {
                return file;
            }
        }
        URI uri = videoUrls.getUrl().toURI();
        t.f(uri, "videoUrls.url.toURI()");
        return uri;
    }
}
