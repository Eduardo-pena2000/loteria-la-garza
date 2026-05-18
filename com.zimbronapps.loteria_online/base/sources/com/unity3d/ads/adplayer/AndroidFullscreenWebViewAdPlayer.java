package com.unity3d.ads.adplayer;

import Ca.I;
import Ca.h;
import Ca.l;
import Ca.m;
import Ca.q;
import Ca.t;
import Ca.x;
import Da.S;
import Ga.e;
import Ha.c;
import Ia.d;
import Ia.f;
import Qa.p;
import android.content.Context;
import android.content.Intent;
import cb.B0;
import cb.O;
import cb.i;
import cb.z;
import com.unity3d.ads.adplayer.DisplayMessage;
import com.unity3d.ads.core.data.datasource.VolumeSettingsChange;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.OfferwallShowEvent;
import com.unity3d.ads.core.data.model.ScarEvent;
import com.unity3d.ads.core.data.model.SessionChange;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.OrientationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.unity3d.services.banners.bridge.BannerBridge;
import fb.D;
import fb.F;
import fb.J;
import fb.g;
import fb.y;
import java.util.Map;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.n;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidFullscreenWebViewAdPlayer implements AdPlayer, FullscreenAdPlayer {
    public static final Companion Companion = new Companion(null);
    private static final y displayMessages = F.b(0, 0, null, 7, null);
    private final l adObject$delegate;
    private final AdRepository adRepository;
    private final Context context;
    private final DeviceInfoRepository deviceInfoRepository;
    private final OfferwallManager offerwallManager;
    private final OpenMeasurementRepository openMeasurementRepository;
    private final String opportunityId;
    private final OrientationRepository orientationRepository;
    private final ScarManager scarManager;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final WebViewAdPlayer webViewAdPlayer;
    private final AndroidWebViewContainer webViewContainer;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final y getDisplayMessages() {
            return AndroidFullscreenWebViewAdPlayer.access$getDisplayMessages$cp();
        }

        private Companion() {
        }
    }

    @f(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {173, 178, 182, 184}, m = "destroy")
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
            return AndroidFullscreenWebViewAdPlayer.this.destroy(this);
        }
    }

    @f(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {198, 199, 200, 201, 202, 204}, m = "invokeSuspend")
    public static final class 1 extends Ia.l implements p {
        final /* synthetic */ DisplayMessage $displayMessage;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(DisplayMessage displayMessage, e eVar) {
            super(2, eVar);
            this.$displayMessage = displayMessage;
        }

        public final e create(Object obj, e eVar) {
            return AndroidFullscreenWebViewAdPlayer.this.new 1(this.$displayMessage, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((1) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            switch (this.label) {
                case 0:
                    t.b(obj);
                    SendDiagnosticEvent access$getSendDiagnosticEvent$p = AndroidFullscreenWebViewAdPlayer.access$getSendDiagnosticEvent$p(AndroidFullscreenWebViewAdPlayer.this);
                    q a = x.a("eventType", String.valueOf(P.b(this.$displayMessage.getClass()).e()));
                    DisplayMessage displayMessage = this.$displayMessage;
                    SendDiagnosticEvent.DefaultImpls.invoke$default(access$getSendDiagnosticEvent$p, "native_show_ad_viewer_fullscreen_activity_event", null, S.l(a, x.a("content", displayMessage instanceof DisplayMessage.VisibilityChanged ? String.valueOf(((DisplayMessage.VisibilityChanged) displayMessage).isVisible()) : displayMessage instanceof DisplayMessage.FocusChanged ? String.valueOf(((DisplayMessage.FocusChanged) displayMessage).isFocused()) : "")), null, AndroidFullscreenWebViewAdPlayer.access$getAdObject(AndroidFullscreenWebViewAdPlayer.this), null, 42, null);
                    DisplayMessage displayMessage2 = this.$displayMessage;
                    if (displayMessage2 instanceof DisplayMessage.DisplayReady) {
                        WebViewAdPlayer access$getWebViewAdPlayer$p = AndroidFullscreenWebViewAdPlayer.access$getWebViewAdPlayer$p(AndroidFullscreenWebViewAdPlayer.this);
                        Map showOptions = ((DisplayMessage.DisplayReady) this.$displayMessage).getShowOptions();
                        this.label = 1;
                        if (access$getWebViewAdPlayer$p.requestShow(showOptions, this) == f) {
                            return f;
                        }
                    } else if (displayMessage2 instanceof DisplayMessage.WebViewInstanceRequest) {
                        y displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                        DisplayMessage.WebViewInstanceResponse webViewInstanceResponse = new DisplayMessage.WebViewInstanceResponse(this.$displayMessage.getOpportunityId(), AndroidFullscreenWebViewAdPlayer.this.getWebViewContainer().getWebView());
                        this.label = 2;
                        if (displayMessages.emit(webViewInstanceResponse, this) == f) {
                            return f;
                        }
                    } else if (displayMessage2 instanceof DisplayMessage.VisibilityChanged) {
                        WebViewAdPlayer access$getWebViewAdPlayer$p2 = AndroidFullscreenWebViewAdPlayer.access$getWebViewAdPlayer$p(AndroidFullscreenWebViewAdPlayer.this);
                        boolean isVisible = ((DisplayMessage.VisibilityChanged) this.$displayMessage).isVisible();
                        this.label = 3;
                        if (access$getWebViewAdPlayer$p2.sendVisibilityChange(isVisible, this) == f) {
                            return f;
                        }
                    } else if (displayMessage2 instanceof DisplayMessage.FocusChanged) {
                        WebViewAdPlayer access$getWebViewAdPlayer$p3 = AndroidFullscreenWebViewAdPlayer.access$getWebViewAdPlayer$p(AndroidFullscreenWebViewAdPlayer.this);
                        boolean isFocused = ((DisplayMessage.FocusChanged) this.$displayMessage).isFocused();
                        this.label = 4;
                        if (access$getWebViewAdPlayer$p3.sendFocusChange(isFocused, this) == f) {
                            return f;
                        }
                    } else if (displayMessage2 instanceof DisplayMessage.DisplayDestroyed) {
                        WebViewAdPlayer access$getWebViewAdPlayer$p4 = AndroidFullscreenWebViewAdPlayer.access$getWebViewAdPlayer$p(AndroidFullscreenWebViewAdPlayer.this);
                        this.label = 5;
                        if (access$getWebViewAdPlayer$p4.sendActivityDestroyed(this) == f) {
                            return f;
                        }
                    } else if (displayMessage2 instanceof DisplayMessage.DisplayError) {
                        AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer = AndroidFullscreenWebViewAdPlayer.this;
                        this.label = 6;
                        if (androidFullscreenWebViewAdPlayer.destroy(this) == f) {
                            return f;
                        }
                    }
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    t.b(obj);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return I.a;
        }
    }

    @f(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$1", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {}, m = "invokeSuspend")
    public static final class 1 extends Ia.l implements p {
        final /* synthetic */ cb.x $listenerStarted;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(cb.x xVar, e eVar) {
            super(2, eVar);
            this.$listenerStarted = xVar;
        }

        public final e create(Object obj, e eVar) {
            return new 1(this.$listenerStarted, eVar);
        }

        public final Object invoke(fb.f fVar, e eVar) {
            return ((1) create(fVar, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            cb.x xVar = this.$listenerStarted;
            I i = I.a;
            xVar.o(i);
            return i;
        }
    }

    @f(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {147, 152}, m = "invokeSuspend")
    public static final class 10 extends Ia.l implements p {
        final /* synthetic */ ShowOptions $showOptions;
        int label;

        @f(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$1", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {146}, m = "invokeSuspend")
        public static final class 1 extends Ia.l implements p {
            final /* synthetic */ ShowOptions $showOptions;
            int label;
            final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, ShowOptions showOptions, e eVar) {
                super(2, eVar);
                this.this$0 = androidFullscreenWebViewAdPlayer;
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
                    y displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                    DisplayMessage.DisplayReady displayReady = new DisplayMessage.DisplayReady(AndroidFullscreenWebViewAdPlayer.access$getOpportunityId$p(this.this$0), ((AndroidShowOptions) this.$showOptions).getUnityAdsShowOptions());
                    this.label = 1;
                    if (displayMessages.emit(displayReady, this) == f) {
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

        @f(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$2", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {}, m = "invokeSuspend")
        public static final class 2 extends Ia.l implements p {
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

            public final Object invoke(OfferwallShowEvent offerwallShowEvent, e eVar) {
                return ((2) create(offerwallShowEvent, eVar)).invokeSuspend(I.a);
            }

            public final Object invokeSuspend(Object obj) {
                c.f();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                return Ia.b.a(kotlin.jvm.internal.t.c((OfferwallShowEvent) this.L$0, OfferwallShowEvent.Show.INSTANCE));
            }
        }

        public /* synthetic */ class 4 implements fb.f, n {
            final /* synthetic */ WebViewAdPlayer $tmp0;

            public 4(WebViewAdPlayer webViewAdPlayer) {
                this.$tmp0 = webViewAdPlayer;
            }

            public final Object emit(OfferwallEvent offerwallEvent, e eVar) {
                Object sendOfferwallEvent = this.$tmp0.sendOfferwallEvent(offerwallEvent, eVar);
                return sendOfferwallEvent == c.f() ? sendOfferwallEvent : I.a;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof fb.f) && (obj instanceof n)) {
                    return kotlin.jvm.internal.t.c(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
                }
                return false;
            }

            public final h getFunctionDelegate() {
                return new kotlin.jvm.internal.q(2, this.$tmp0, WebViewAdPlayer.class, "sendOfferwallEvent", "sendOfferwallEvent(Lcom/unity3d/services/ads/offerwall/OfferwallEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 10(ShowOptions showOptions, e eVar) {
            super(2, eVar);
            this.$showOptions = showOptions;
        }

        public final e create(Object obj, e eVar) {
            return AndroidFullscreenWebViewAdPlayer.this.new 10(this.$showOptions, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((10) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                fb.e D = g.D(AndroidFullscreenWebViewAdPlayer.this.getOnOfferwallEvent(), new 1(AndroidFullscreenWebViewAdPlayer.this, this.$showOptions, null));
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
            OfferwallManager access$getOfferwallManager$p = AndroidFullscreenWebViewAdPlayer.access$getOfferwallManager$p(AndroidFullscreenWebViewAdPlayer.this);
            String offerwallPlacementName = ((AndroidShowOptions) this.$showOptions).getOfferwallPlacementName();
            if (offerwallPlacementName == null) {
                offerwallPlacementName = "";
            }
            AndroidFullscreenWebViewAdPlayer$show$10$invokeSuspend$$inlined$mapNotNull$1 androidFullscreenWebViewAdPlayer$show$10$invokeSuspend$$inlined$mapNotNull$1 = new AndroidFullscreenWebViewAdPlayer$show$10$invokeSuspend$$inlined$mapNotNull$1(g.F(access$getOfferwallManager$p.showAd(offerwallPlacementName), AndroidFullscreenWebViewAdPlayer.this.getScope(), J.a.c(), 5));
            4 r3 = new 4(AndroidFullscreenWebViewAdPlayer.access$getWebViewAdPlayer$p(AndroidFullscreenWebViewAdPlayer.this));
            this.label = 2;
            if (androidFullscreenWebViewAdPlayer$show$10$invokeSuspend$$inlined$mapNotNull$1.collect(r3, this) == f) {
                return f;
            }
            return I.a;
        }
    }

    public /* synthetic */ class 3 extends kotlin.jvm.internal.a implements p {
        public 3(Object obj) {
            super(2, obj, AndroidFullscreenWebViewAdPlayer.class, "displayEventsRouter", "displayEventsRouter(Lcom/unity3d/ads/adplayer/DisplayMessage;)Lkotlinx/coroutines/Job;", 12);
        }

        public static final /* synthetic */ Object access$getReceiver$p(3 r0) {
            return r0.receiver;
        }

        public final Object invoke(DisplayMessage displayMessage, e eVar) {
            return AndroidFullscreenWebViewAdPlayer.access$show$displayEventsRouter((AndroidFullscreenWebViewAdPlayer) access$getReceiver$p(this), displayMessage, eVar);
        }
    }

    public /* synthetic */ class 4 extends kotlin.jvm.internal.q implements p {
        public 4(Object obj) {
            super(2, obj, AndroidFullscreenWebViewAdPlayer.class, "handleVolumeSettingsChange", "handleVolumeSettingsChange(Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        public final Object invoke(VolumeSettingsChange volumeSettingsChange, e eVar) {
            return AndroidFullscreenWebViewAdPlayer.access$handleVolumeSettingsChange((AndroidFullscreenWebViewAdPlayer) this.receiver, volumeSettingsChange, eVar);
        }
    }

    @f(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$6", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {96}, m = "invokeSuspend")
    public static final class 6 extends Ia.l implements p {
        int label;

        public 6(e eVar) {
            super(2, eVar);
        }

        public final e create(Object obj, e eVar) {
            return AndroidFullscreenWebViewAdPlayer.this.new 6(eVar);
        }

        public final Object invoke(ShowEvent showEvent, e eVar) {
            return ((6) create(showEvent, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer = AndroidFullscreenWebViewAdPlayer.this;
                this.label = 1;
                if (androidFullscreenWebViewAdPlayer.destroy(this) == f) {
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

    public /* synthetic */ class 7 extends kotlin.jvm.internal.q implements p {
        public 7(Object obj) {
            super(2, obj, AndroidFullscreenWebViewAdPlayer.class, "handleSessionChange", "handleSessionChange(Lcom/unity3d/ads/core/data/model/SessionChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        public final Object invoke(SessionChange sessionChange, e eVar) {
            return AndroidFullscreenWebViewAdPlayer.access$handleSessionChange((AndroidFullscreenWebViewAdPlayer) this.receiver, sessionChange, eVar);
        }
    }

    @f(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$8", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {116}, m = "invokeSuspend")
    public static final class 8 extends Ia.l implements p {
        final /* synthetic */ Intent $intent;
        final /* synthetic */ cb.x $listenerStarted;
        int label;
        final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 8(cb.x xVar, AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, Intent intent, e eVar) {
            super(2, eVar);
            this.$listenerStarted = xVar;
            this.this$0 = androidFullscreenWebViewAdPlayer;
            this.$intent = intent;
        }

        public final e create(Object obj, e eVar) {
            return new 8(this.$listenerStarted, this.this$0, this.$intent, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((8) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                cb.x xVar = this.$listenerStarted;
                this.label = 1;
                if (xVar.await(this) == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            AndroidFullscreenWebViewAdPlayer.access$getContext$p(this.this$0).startActivity(this.$intent);
            SendDiagnosticEvent.DefaultImpls.invoke$default(AndroidFullscreenWebViewAdPlayer.access$getSendDiagnosticEvent$p(this.this$0), "native_show_ad_viewer_fullscreen_intent", null, null, null, AndroidFullscreenWebViewAdPlayer.access$getAdObject(this.this$0), null, 46, null);
            return I.a;
        }
    }

    @f(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$9", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {134, 138}, m = "invokeSuspend")
    public static final class 9 extends Ia.l implements p {
        final /* synthetic */ D $scarEvents;
        final /* synthetic */ ShowOptions $showOptions;
        int label;

        @f(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$9$1", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {133}, m = "invokeSuspend")
        public static final class 1 extends Ia.l implements p {
            final /* synthetic */ ShowOptions $showOptions;
            int label;
            final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, ShowOptions showOptions, e eVar) {
                super(2, eVar);
                this.this$0 = androidFullscreenWebViewAdPlayer;
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
                    y displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                    DisplayMessage.DisplayReady displayReady = new DisplayMessage.DisplayReady(AndroidFullscreenWebViewAdPlayer.access$getOpportunityId$p(this.this$0), ((AndroidShowOptions) this.$showOptions).getUnityAdsShowOptions());
                    this.label = 1;
                    if (displayMessages.emit(displayReady, this) == f) {
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

        @f(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$9$2", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {}, m = "invokeSuspend")
        public static final class 2 extends Ia.l implements p {
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

            public final Object emit(com.unity3d.scar.adapter.common.c cVar, e eVar) {
                Object sendGmaEvent = this.$tmp0.sendGmaEvent(cVar, eVar);
                return sendGmaEvent == c.f() ? sendGmaEvent : I.a;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof fb.f) && (obj instanceof n)) {
                    return kotlin.jvm.internal.t.c(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
                }
                return false;
            }

            public final h getFunctionDelegate() {
                return new kotlin.jvm.internal.q(2, this.$tmp0, WebViewAdPlayer.class, "sendGmaEvent", "sendGmaEvent(Lcom/unity3d/scar/adapter/common/GMAEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 9(D d, ShowOptions showOptions, e eVar) {
            super(2, eVar);
            this.$scarEvents = d;
            this.$showOptions = showOptions;
        }

        public final e create(Object obj, e eVar) {
            return AndroidFullscreenWebViewAdPlayer.this.new 9(this.$scarEvents, this.$showOptions, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((9) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                fb.e D = g.D(AndroidFullscreenWebViewAdPlayer.this.getOnScarEvent(), new 1(AndroidFullscreenWebViewAdPlayer.this, this.$showOptions, null));
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
            AndroidFullscreenWebViewAdPlayer$show$9$invokeSuspend$$inlined$mapNotNull$1 androidFullscreenWebViewAdPlayer$show$9$invokeSuspend$$inlined$mapNotNull$1 = new AndroidFullscreenWebViewAdPlayer$show$9$invokeSuspend$$inlined$mapNotNull$1(this.$scarEvents);
            4 r3 = new 4(AndroidFullscreenWebViewAdPlayer.access$getWebViewAdPlayer$p(AndroidFullscreenWebViewAdPlayer.this));
            this.label = 2;
            if (androidFullscreenWebViewAdPlayer$show$9$invokeSuspend$$inlined$mapNotNull$1.collect(r3, this) == f) {
                return f;
            }
            return I.a;
        }
    }

    public AndroidFullscreenWebViewAdPlayer(WebViewAdPlayer webViewAdPlayer, String opportunityId, AndroidWebViewContainer webViewContainer, DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, OpenMeasurementRepository openMeasurementRepository, ScarManager scarManager, OfferwallManager offerwallManager, SendDiagnosticEvent sendDiagnosticEvent, AdRepository adRepository, OrientationRepository orientationRepository, Context context) {
        kotlin.jvm.internal.t.g(webViewAdPlayer, "webViewAdPlayer");
        kotlin.jvm.internal.t.g(opportunityId, "opportunityId");
        kotlin.jvm.internal.t.g(webViewContainer, "webViewContainer");
        kotlin.jvm.internal.t.g(deviceInfoRepository, "deviceInfoRepository");
        kotlin.jvm.internal.t.g(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.t.g(openMeasurementRepository, "openMeasurementRepository");
        kotlin.jvm.internal.t.g(scarManager, "scarManager");
        kotlin.jvm.internal.t.g(offerwallManager, "offerwallManager");
        kotlin.jvm.internal.t.g(sendDiagnosticEvent, "sendDiagnosticEvent");
        kotlin.jvm.internal.t.g(adRepository, "adRepository");
        kotlin.jvm.internal.t.g(orientationRepository, "orientationRepository");
        kotlin.jvm.internal.t.g(context, "context");
        this.webViewAdPlayer = webViewAdPlayer;
        this.opportunityId = opportunityId;
        this.webViewContainer = webViewContainer;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.openMeasurementRepository = openMeasurementRepository;
        this.scarManager = scarManager;
        this.offerwallManager = offerwallManager;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.adRepository = adRepository;
        this.orientationRepository = orientationRepository;
        this.context = context;
        this.adObject$delegate = m.b(new AndroidFullscreenWebViewAdPlayer$adObject$2(this));
    }

    public static final /* synthetic */ AdObject access$getAdObject(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer) {
        return androidFullscreenWebViewAdPlayer.getAdObject();
    }

    public static final /* synthetic */ AdRepository access$getAdRepository$p(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer) {
        return androidFullscreenWebViewAdPlayer.adRepository;
    }

    public static final /* synthetic */ Context access$getContext$p(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer) {
        return androidFullscreenWebViewAdPlayer.context;
    }

    public static final /* synthetic */ y access$getDisplayMessages$cp() {
        return displayMessages;
    }

    public static final /* synthetic */ OfferwallManager access$getOfferwallManager$p(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer) {
        return androidFullscreenWebViewAdPlayer.offerwallManager;
    }

    public static final /* synthetic */ String access$getOpportunityId$p(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer) {
        return androidFullscreenWebViewAdPlayer.opportunityId;
    }

    public static final /* synthetic */ SendDiagnosticEvent access$getSendDiagnosticEvent$p(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer) {
        return androidFullscreenWebViewAdPlayer.sendDiagnosticEvent;
    }

    public static final /* synthetic */ WebViewAdPlayer access$getWebViewAdPlayer$p(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer) {
        return androidFullscreenWebViewAdPlayer.webViewAdPlayer;
    }

    public static final /* synthetic */ Object access$handleSessionChange(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, SessionChange sessionChange, e eVar) {
        return androidFullscreenWebViewAdPlayer.handleSessionChange(sessionChange, eVar);
    }

    public static final /* synthetic */ Object access$handleVolumeSettingsChange(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, VolumeSettingsChange volumeSettingsChange, e eVar) {
        return androidFullscreenWebViewAdPlayer.handleVolumeSettingsChange(volumeSettingsChange, eVar);
    }

    public static final /* synthetic */ Object access$show$displayEventsRouter(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, DisplayMessage displayMessage, e eVar) {
        return show$displayEventsRouter(androidFullscreenWebViewAdPlayer, displayMessage, eVar);
    }

    private final B0 displayEventsRouter(DisplayMessage displayMessage) {
        return i.d(getScope(), null, null, new 1(displayMessage, null), 3, null);
    }

    private final AdObject getAdObject() {
        return (AdObject) this.adObject$delegate.getValue();
    }

    private final Object handleSessionChange(SessionChange sessionChange, e eVar) {
        if (sessionChange instanceof SessionChange.UserConsentChange) {
            WebViewAdPlayer webViewAdPlayer = this.webViewAdPlayer;
            byte[] byteArray = ((SessionChange.UserConsentChange) sessionChange).getValue().toByteArray();
            kotlin.jvm.internal.t.f(byteArray, "change.value.toByteArray()");
            Object sendUserConsentChange = webViewAdPlayer.sendUserConsentChange(byteArray, eVar);
            return sendUserConsentChange == c.f() ? sendUserConsentChange : I.a;
        }
        if (!(sessionChange instanceof SessionChange.PrivacyFsmChange)) {
            return I.a;
        }
        WebViewAdPlayer webViewAdPlayer2 = this.webViewAdPlayer;
        byte[] byteArray2 = ((SessionChange.PrivacyFsmChange) sessionChange).getValue().toByteArray();
        kotlin.jvm.internal.t.f(byteArray2, "change.value.toByteArray()");
        Object sendPrivacyFsmChange = webViewAdPlayer2.sendPrivacyFsmChange(byteArray2, eVar);
        return sendPrivacyFsmChange == c.f() ? sendPrivacyFsmChange : I.a;
    }

    private final Object handleVolumeSettingsChange(VolumeSettingsChange volumeSettingsChange, e eVar) {
        if (volumeSettingsChange instanceof VolumeSettingsChange.MuteChange) {
            Object sendMuteChange = this.webViewAdPlayer.sendMuteChange(((VolumeSettingsChange.MuteChange) volumeSettingsChange).isMuted(), eVar);
            return sendMuteChange == c.f() ? sendMuteChange : I.a;
        }
        if (!(volumeSettingsChange instanceof VolumeSettingsChange.VolumeChange)) {
            return I.a;
        }
        Object sendVolumeChange = this.webViewAdPlayer.sendVolumeChange(((VolumeSettingsChange.VolumeChange) volumeSettingsChange).getVolume(), eVar);
        return sendVolumeChange == c.f() ? sendVolumeChange : I.a;
    }

    private static final /* synthetic */ Object show$displayEventsRouter(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, DisplayMessage displayMessage, e eVar) {
        androidFullscreenWebViewAdPlayer.displayEventsRouter(displayMessage);
        return I.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object destroy(Ga.e r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.destroy.1
            if (r0 == 0) goto L13
            r0 = r9
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$destroy$1 r0 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.destroy.1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$destroy$1 r0 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$destroy$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L52
            if (r2 == r6) goto L4a
            if (r2 == r5) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            Ca.t.b(r9)
            goto La0
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3a:
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r2 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer) r2
            Ca.t.b(r9)
            goto L94
        L42:
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r2 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer) r2
            Ca.t.b(r9)
            goto L85
        L4a:
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r2 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer) r2
            Ca.t.b(r9)
            goto L6a
        L52:
            Ca.t.b(r9)
            fb.y r9 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.displayMessages
            com.unity3d.ads.adplayer.DisplayMessage$DisplayFinishRequest r2 = new com.unity3d.ads.adplayer.DisplayMessage$DisplayFinishRequest
            java.lang.String r7 = r8.opportunityId
            r2.<init>(r7)
            r0.L$0 = r8
            r0.label = r6
            java.lang.Object r9 = r9.emit(r2, r0)
            if (r9 != r1) goto L69
            return r1
        L69:
            r2 = r8
        L6a:
            com.unity3d.ads.core.data.repository.OpenMeasurementRepository r9 = r2.openMeasurementRepository
            java.lang.String r6 = r2.opportunityId
            com.google.protobuf.ByteString r6 = com.google.protobuf.kotlin.ByteStringsKt.toByteStringUtf8(r6)
            boolean r9 = r9.hasSessionFinished(r6)
            if (r9 == 0) goto L85
            r0.L$0 = r2
            r0.label = r5
            r5 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r9 = cb.Z.a(r5, r0)
            if (r9 != r1) goto L85
            return r1
        L85:
            com.unity3d.ads.adplayer.AndroidWebViewContainer r9 = r2.getWebViewContainer()
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r9 = r9.destroy(r0)
            if (r9 != r1) goto L94
            return r1
        L94:
            r9 = 0
            r0.L$0 = r9
            r0.label = r3
            java.lang.Object r9 = com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.destroy(r2, r0)
            if (r9 != r1) goto La0
            return r1
        La0:
            Ca.I r9 = Ca.I.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.destroy(Ga.e):java.lang.Object");
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
        AndroidShowOptions androidShowOptions = (AndroidShowOptions) showOptions;
        boolean isScarAd = androidShowOptions.isScarAd();
        boolean isOfferwallAd = androidShowOptions.isOfferwallAd();
        cb.x b = z.b(null, 1, null);
        g.z(g.C(new AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1(g.E(displayMessages, new 1(b, null)), this), new 3(this)), getScope());
        g.z(g.C(this.deviceInfoRepository.getVolumeSettingsChange(), new 4(this)), getScope());
        g.z(g.C(new AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2(this.webViewAdPlayer.getOnShowEvent()), new 6(null)), getScope());
        g.z(g.C(this.sessionRepository.getOnChange(), new 7(this)), getScope());
        if (isScarAd || isOfferwallAd) {
            if (!isScarAd) {
                i.d(getScope(), null, null, new 10(showOptions, null), 3, null);
                return;
            }
            ScarManager scarManager = this.scarManager;
            String placementId = androidShowOptions.getPlacementId();
            if (placementId == null) {
                placementId = "";
            }
            String scarQueryId = androidShowOptions.getScarQueryId();
            i.d(getScope(), null, null, new 9(g.F(scarManager.show(placementId, scarQueryId != null ? scarQueryId : ""), getScope(), J.a.c(), 10), showOptions, null), 3, null);
            return;
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_ad_viewer_fullscreen", null, null, null, getAdObject(), null, 46, null);
        Intent intent = new Intent(this.context, FullScreenWebViewDisplay.class);
        intent.putExtra("opportunityId", this.opportunityId);
        Map unityAdsShowOptions = androidShowOptions.getUnityAdsShowOptions();
        if (unityAdsShowOptions != null) {
            intent.putExtra("showOptions", new JSONObject(unityAdsShowOptions).toString());
        }
        intent.addFlags(268500992);
        intent.putExtra("orientation", ((Number) this.orientationRepository.getResumedActivityOrientation().getValue()).intValue());
        i.d(getScope(), null, null, new 8(b, this, intent, null), 3, null);
    }

    public AndroidWebViewContainer getWebViewContainer() {
        return this.webViewContainer;
    }
}
