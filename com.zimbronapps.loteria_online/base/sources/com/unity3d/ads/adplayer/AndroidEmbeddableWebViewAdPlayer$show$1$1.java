package com.unity3d.ads.adplayer;

import Ca.I;
import Ca.h;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import cb.O;
import com.unity3d.ads.core.data.model.ScarEvent;
import com.unity3d.services.banners.bridge.BannerBridge;
import fb.D;
import fb.g;
import java.util.Map;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

@f(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1", f = "AndroidEmbeddableWebViewAdPlayer.kt", l = {75, 79}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidEmbeddableWebViewAdPlayer$show$1$1 extends l implements p {
    final /* synthetic */ D $scarEvents;
    final /* synthetic */ ShowOptions $showOptions;
    int label;
    final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

    @f(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$1", f = "AndroidEmbeddableWebViewAdPlayer.kt", l = {73}, m = "invokeSuspend")
    public static final class 1 extends l implements p {
        final /* synthetic */ ShowOptions $showOptions;
        int label;
        final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer, ShowOptions showOptions, e eVar) {
            super(2, eVar);
            this.this$0 = androidEmbeddableWebViewAdPlayer;
            this.$showOptions = showOptions;
        }

        public final e create(Object obj, e eVar) {
            return new 1(this.this$0, this.$showOptions, eVar);
        }

        public final Object invoke(fb.f fVar, e eVar) {
            return ((1) create(fVar, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                WebViewAdPlayer access$getWebViewAdPlayer$p = AndroidEmbeddableWebViewAdPlayer.access$getWebViewAdPlayer$p(this.this$0);
                Map unityAdsShowOptions = ((AndroidShowOptions) this.$showOptions).getUnityAdsShowOptions();
                this.label = 1;
                if (access$getWebViewAdPlayer$p.requestShow(unityAdsShowOptions, this) == f) {
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

    @f(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$2", f = "AndroidEmbeddableWebViewAdPlayer.kt", l = {}, m = "invokeSuspend")
    public static final class 2 extends l implements p {
        /* synthetic */ Object L$0;
        int label;

        public 2(e eVar) {
            super(2, eVar);
        }

        public final e create(Object obj, e eVar) {
            2 r0 = new 2(eVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(ScarEvent scarEvent, e eVar) {
            return ((2) create(scarEvent, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return Ia.b.a(kotlin.jvm.internal.t.c((ScarEvent) this.L$0, ScarEvent.Show.INSTANCE));
        }
    }

    public /* synthetic */ class 4 implements fb.f, n {
        final /* synthetic */ WebViewAdPlayer $tmp0;

        public 4(WebViewAdPlayer webViewAdPlayer) {
            this.$tmp0 = webViewAdPlayer;
        }

        public final Object emit(BannerBridge.BannerEvent bannerEvent, e eVar) {
            Object sendScarBannerEvent = this.$tmp0.sendScarBannerEvent(bannerEvent, eVar);
            return sendScarBannerEvent == c.f() ? sendScarBannerEvent : I.a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof fb.f) && (obj instanceof n)) {
                return kotlin.jvm.internal.t.c(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        public final h getFunctionDelegate() {
            return new q(2, this.$tmp0, WebViewAdPlayer.class, "sendScarBannerEvent", "sendScarBannerEvent(Lcom/unity3d/services/banners/bridge/BannerBridge$BannerEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidEmbeddableWebViewAdPlayer$show$1$1(AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer, D d, ShowOptions showOptions, e eVar) {
        super(2, eVar);
        this.this$0 = androidEmbeddableWebViewAdPlayer;
        this.$scarEvents = d;
        this.$showOptions = showOptions;
    }

    public final e create(Object obj, e eVar) {
        return new AndroidEmbeddableWebViewAdPlayer$show$1$1(this.this$0, this.$scarEvents, this.$showOptions, eVar);
    }

    public final Object invoke(O o, e eVar) {
        return ((AndroidEmbeddableWebViewAdPlayer$show$1$1) create(o, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f = c.f();
        int i = this.label;
        if (i == 0) {
            t.b(obj);
            fb.e D = g.D(this.this$0.getOnScarEvent(), new 1(this.this$0, this.$showOptions, null));
            2 r1 = new 2(null);
            this.label = 1;
            if (g.t(D, r1, this) == f) {
                return f;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                return I.a;
            }
            t.b(obj);
        }
        AndroidEmbeddableWebViewAdPlayer$show$1$1$invokeSuspend$$inlined$mapNotNull$1 androidEmbeddableWebViewAdPlayer$show$1$1$invokeSuspend$$inlined$mapNotNull$1 = new AndroidEmbeddableWebViewAdPlayer$show$1$1$invokeSuspend$$inlined$mapNotNull$1(this.$scarEvents);
        4 r3 = new 4(AndroidEmbeddableWebViewAdPlayer.access$getWebViewAdPlayer$p(this.this$0));
        this.label = 2;
        if (androidEmbeddableWebViewAdPlayer$show$1$1$invokeSuspend$$inlined$mapNotNull$1.collect(r3, this) == f) {
            return f;
        }
        return I.a;
    }
}
