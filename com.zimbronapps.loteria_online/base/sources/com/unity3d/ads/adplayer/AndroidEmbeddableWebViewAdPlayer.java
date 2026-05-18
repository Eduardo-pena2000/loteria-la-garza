package com.unity3d.ads.adplayer;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.d;
import Ia.f;
import Ia.l;
import Qa.p;
import T1.Z;
import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebView;
import cb.O;
import cb.P;
import cb.i;
import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.BannerViewCache;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.banners.bridge.BannerBridge;
import com.unity3d.services.core.misc.ViewUtilities;
import fb.D;
import fb.J;
import fb.g;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidEmbeddableWebViewAdPlayer implements AdPlayer, EmbeddableAdPlayer {
    private final Context context;
    private final LifecycleDataSource lifecycleDataSource;
    private final OpenMeasurementRepository openMeasurementRepository;
    private final String opportunityId;
    private final ScarManager scarManager;
    private final WebViewAdPlayer webViewAdPlayer;
    private final AndroidWebViewContainer webViewContainer;

    @f(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer", f = "AndroidEmbeddableWebViewAdPlayer.kt", l = {125, 128, 130}, m = "destroy")
    public static final class 1 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public 1(e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidEmbeddableWebViewAdPlayer.this.destroy(this);
        }
    }

    @f(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$2", f = "AndroidEmbeddableWebViewAdPlayer.kt", l = {}, m = "invokeSuspend")
    public static final class 2 extends l implements p {
        final /* synthetic */ BannerView $bannerView;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(BannerView bannerView, e eVar) {
            super(2, eVar);
            this.$bannerView = bannerView;
        }

        public final e create(Object obj, e eVar) {
            return AndroidEmbeddableWebViewAdPlayer.this.new 2(this.$bannerView, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((2) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            AndroidEmbeddableWebViewAdPlayer.this.getWebViewContainer().getWebView().setLayoutParams(new ViewGroup.LayoutParams((int) ViewUtilities.pxFromDp(AndroidEmbeddableWebViewAdPlayer.access$getContext$p(AndroidEmbeddableWebViewAdPlayer.this), this.$bannerView.getSize().getWidth()), (int) ViewUtilities.pxFromDp(AndroidEmbeddableWebViewAdPlayer.access$getContext$p(AndroidEmbeddableWebViewAdPlayer.this), this.$bannerView.getSize().getHeight())));
            return I.a;
        }
    }

    @f(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$4", f = "AndroidEmbeddableWebViewAdPlayer.kt", l = {}, m = "invokeSuspend")
    public static final class 4 extends l implements p {
        final /* synthetic */ BannerView $bannerView;
        int label;
        final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 4(BannerView bannerView, AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer, e eVar) {
            super(2, eVar);
            this.$bannerView = bannerView;
            this.this$0 = androidEmbeddableWebViewAdPlayer;
        }

        public final e create(Object obj, e eVar) {
            return new 4(this.$bannerView, this.this$0, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((4) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            this.$bannerView.addView(this.this$0.getWebViewContainer().getWebView());
            return I.a;
        }
    }

    public AndroidEmbeddableWebViewAdPlayer(WebViewAdPlayer webViewAdPlayer, String opportunityId, AndroidWebViewContainer webViewContainer, OpenMeasurementRepository openMeasurementRepository, ScarManager scarManager, LifecycleDataSource lifecycleDataSource, Context context) {
        kotlin.jvm.internal.t.g(webViewAdPlayer, "webViewAdPlayer");
        kotlin.jvm.internal.t.g(opportunityId, "opportunityId");
        kotlin.jvm.internal.t.g(webViewContainer, "webViewContainer");
        kotlin.jvm.internal.t.g(openMeasurementRepository, "openMeasurementRepository");
        kotlin.jvm.internal.t.g(scarManager, "scarManager");
        kotlin.jvm.internal.t.g(lifecycleDataSource, "lifecycleDataSource");
        kotlin.jvm.internal.t.g(context, "context");
        this.webViewAdPlayer = webViewAdPlayer;
        this.opportunityId = opportunityId;
        this.webViewContainer = webViewContainer;
        this.openMeasurementRepository = openMeasurementRepository;
        this.scarManager = scarManager;
        this.lifecycleDataSource = lifecycleDataSource;
        this.context = context;
    }

    public static final /* synthetic */ Context access$getContext$p(AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer) {
        return androidEmbeddableWebViewAdPlayer.context;
    }

    public static final /* synthetic */ LifecycleDataSource access$getLifecycleDataSource$p(AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer) {
        return androidEmbeddableWebViewAdPlayer.lifecycleDataSource;
    }

    public static final /* synthetic */ WebViewAdPlayer access$getWebViewAdPlayer$p(AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer) {
        return androidEmbeddableWebViewAdPlayer.webViewAdPlayer;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object destroy(Ga.e r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.destroy.1
            if (r0 == 0) goto L13
            r0 = r8
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$destroy$1 r0 = (com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.destroy.1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$destroy$1 r0 = new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$destroy$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            Ca.t.b(r8)
            goto L86
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer r2 = (com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer) r2
            Ca.t.b(r8)
            goto L7a
        L3f:
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer r2 = (com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer) r2
            Ca.t.b(r8)
            goto L6b
        L47:
            Ca.t.b(r8)
            com.unity3d.ads.adplayer.WebViewAdPlayer r8 = r7.webViewAdPlayer
            r8.dispatchShowCompleted()
            com.unity3d.ads.core.data.repository.OpenMeasurementRepository r8 = r7.openMeasurementRepository
            java.lang.String r2 = r7.opportunityId
            com.google.protobuf.ByteString r2 = com.google.protobuf.kotlin.ByteStringsKt.toByteStringUtf8(r2)
            boolean r8 = r8.hasSessionFinished(r2)
            if (r8 == 0) goto L6a
            r0.L$0 = r7
            r0.label = r5
            r5 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r8 = cb.Z.a(r5, r0)
            if (r8 != r1) goto L6a
            return r1
        L6a:
            r2 = r7
        L6b:
            com.unity3d.ads.adplayer.AndroidWebViewContainer r8 = r2.getWebViewContainer()
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r8 = r8.destroy(r0)
            if (r8 != r1) goto L7a
            return r1
        L7a:
            r8 = 0
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r8 = com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.destroy(r2, r0)
            if (r8 != r1) goto L86
            return r1
        L86:
            Ca.I r8 = Ca.I.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.destroy(Ga.e):java.lang.Object");
    }

    public void dispatchShowCompleted() {
        this.webViewAdPlayer.dispatchShowCompleted();
    }

    public fb.e getOnLoadEvent() {
        return this.webViewAdPlayer.getOnLoadEvent();
    }

    public fb.e getOnOfferwallEvent() {
        return this.webViewAdPlayer.getOnOfferwallEvent();
    }

    public fb.e getOnScarEvent() {
        return this.webViewAdPlayer.getOnScarEvent();
    }

    public fb.e getOnShowEvent() {
        return this.webViewAdPlayer.getOnShowEvent();
    }

    public O getScope() {
        return this.webViewAdPlayer.getScope();
    }

    public Object onAllowedPiiChange(byte[] bArr, e eVar) {
        return this.webViewAdPlayer.onAllowedPiiChange(bArr, eVar);
    }

    public Object onBroadcastEvent(String str, e eVar) {
        return this.webViewAdPlayer.onBroadcastEvent(str, eVar);
    }

    public Object requestShow(Map map, e eVar) {
        return this.webViewAdPlayer.requestShow(map, eVar);
    }

    public Object sendActivityDestroyed(e eVar) {
        return this.webViewAdPlayer.sendActivityDestroyed(eVar);
    }

    public Object sendFocusChange(boolean z, e eVar) {
        return this.webViewAdPlayer.sendFocusChange(z, eVar);
    }

    public Object sendGmaEvent(com.unity3d.scar.adapter.common.c cVar, e eVar) {
        return this.webViewAdPlayer.sendGmaEvent(cVar, eVar);
    }

    public Object sendMuteChange(boolean z, e eVar) {
        return this.webViewAdPlayer.sendMuteChange(z, eVar);
    }

    public Object sendOfferwallEvent(OfferwallEvent offerwallEvent, e eVar) {
        return this.webViewAdPlayer.sendOfferwallEvent(offerwallEvent, eVar);
    }

    public Object sendPrivacyFsmChange(byte[] bArr, e eVar) {
        return this.webViewAdPlayer.sendPrivacyFsmChange(bArr, eVar);
    }

    public Object sendScarBannerEvent(BannerBridge.BannerEvent bannerEvent, e eVar) {
        return this.webViewAdPlayer.sendScarBannerEvent(bannerEvent, eVar);
    }

    public Object sendUserConsentChange(byte[] bArr, e eVar) {
        return this.webViewAdPlayer.sendUserConsentChange(bArr, eVar);
    }

    public Object sendVisibilityChange(boolean z, e eVar) {
        return this.webViewAdPlayer.sendVisibilityChange(z, eVar);
    }

    public Object sendVolumeChange(double d, e eVar) {
        return this.webViewAdPlayer.sendVolumeChange(d, eVar);
    }

    public void show(ShowOptions showOptions) {
        kotlin.jvm.internal.t.g(showOptions, "showOptions");
        if (!(showOptions instanceof AndroidShowOptions)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        BannerViewCache bannerViewCache = BannerViewCache.getInstance();
        BannerView bannerView = bannerViewCache.getBannerView(this.opportunityId);
        if (bannerView == null) {
            throw new IllegalStateException((bannerViewCache.isBannerViewDeleted(this.opportunityId) ? "BannerView has been deleted" : "BannerView not found").toString());
        }
        AndroidShowOptions androidShowOptions = (AndroidShowOptions) showOptions;
        if (!androidShowOptions.isScarAd()) {
            i.d(P.b(), null, null, new 2(bannerView, null), 3, null);
            WebView webView = getWebViewContainer().getWebView();
            if (Z.G(webView)) {
                i.d(access$getWebViewAdPlayer$p(this).getScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$3$1(this, showOptions, null), 3, null);
                if (Z.G(webView)) {
                    webView.addOnAttachStateChangeListener(new AndroidEmbeddableWebViewAdPlayer$show$lambda$4$$inlined$doOnDetach$1(webView, this));
                } else {
                    i.d(access$getWebViewAdPlayer$p(this).getScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$3$2$1(this, null), 3, null);
                }
            } else {
                webView.addOnAttachStateChangeListener(new AndroidEmbeddableWebViewAdPlayer$show$$inlined$doOnAttach$2(webView, this, showOptions));
            }
            i.d(P.b(), null, null, new 4(bannerView, this, null), 3, null);
            return;
        }
        String placementId = androidShowOptions.getPlacementId();
        String str = placementId == null ? "" : placementId;
        String scarQueryId = androidShowOptions.getScarQueryId();
        String str2 = scarQueryId == null ? "" : scarQueryId;
        String scarAdUnitId = androidShowOptions.getScarAdUnitId();
        String str3 = scarAdUnitId == null ? "" : scarAdUnitId;
        String scarAdString = androidShowOptions.getScarAdString();
        v9.c cVar = new v9.c(str, str2, str3, scarAdString == null ? "" : scarAdString, 0);
        ScarManager scarManager = this.scarManager;
        Context context = this.context;
        UnityBannerSize size = bannerView.getSize();
        kotlin.jvm.internal.t.f(size, "bannerView.size");
        D F = g.F(scarManager.loadBannerAd(context, bannerView, cVar, size, this.opportunityId), getScope(), J.a.c(), 10);
        if (!Z.G(bannerView)) {
            bannerView.addOnAttachStateChangeListener(new AndroidEmbeddableWebViewAdPlayer$show$$inlined$doOnAttach$1(bannerView, this, bannerView, F, showOptions));
            return;
        }
        i.d(getScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$1$1(this, F, showOptions, null), 3, null);
        if (Z.G(bannerView)) {
            bannerView.addOnAttachStateChangeListener(new AndroidEmbeddableWebViewAdPlayer$show$lambda$2$$inlined$doOnDetach$1(bannerView, this));
        } else {
            i.d(access$getWebViewAdPlayer$p(this).getScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$1$2$1(this, null), 3, null);
        }
    }

    public AndroidWebViewContainer getWebViewContainer() {
        return this.webViewContainer;
    }
}
