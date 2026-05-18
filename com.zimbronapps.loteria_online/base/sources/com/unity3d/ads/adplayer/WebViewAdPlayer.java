package com.unity3d.ads.adplayer;

import Ca.I;
import Ia.d;
import Ia.f;
import Qa.l;
import Qa.p;
import android.util.Base64;
import cb.K;
import cb.L;
import cb.N;
import cb.O;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.model.OnActivityDestroyedEvent;
import com.unity3d.ads.adplayer.model.OnAllowedPiiChangeEvent;
import com.unity3d.ads.adplayer.model.OnBroadcastEvent;
import com.unity3d.ads.adplayer.model.OnFocusChangeEvent;
import com.unity3d.ads.adplayer.model.OnGmaEvent;
import com.unity3d.ads.adplayer.model.OnMuteChangeEvent;
import com.unity3d.ads.adplayer.model.OnOfferwallEvent;
import com.unity3d.ads.adplayer.model.OnPrivacyFsmChangeEvent;
import com.unity3d.ads.adplayer.model.OnScarBannerEvent;
import com.unity3d.ads.adplayer.model.OnUserConsentChangeEvent;
import com.unity3d.ads.adplayer.model.OnVisibilityChangeEvent;
import com.unity3d.ads.adplayer.model.OnVolumeChangeEvent;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.scar.adapter.common.c;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.unity3d.services.banners.bridge.BannerBridge;
import com.unity3d.services.core.device.Storage;
import fb.J;
import fb.P;
import fb.e;
import fb.g;
import fb.y;
import fb.z;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class WebViewAdPlayer implements AdPlayer {
    private final WebViewBridge bridge;
    private final DeviceInfoRepository deviceInfoRepository;
    private final K dispatcher;
    private final z isCompletedManually;
    private final e onBroadcastEvents;
    private final e onLoadEvent;
    private final e onOfferwallEvent;
    private final e onScarEvent;
    private final e onShowEvent;
    private final O scope;
    private final L scopeCancellationHandler;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final l storageEventCallback;
    private final WebViewContainer webViewContainer;

    public /* synthetic */ class 1 extends q implements p {
        public 1(Object obj) {
            super(2, obj, y.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        public final Object invoke(String str, Ga.e eVar) {
            return ((y) this.receiver).emit(str, eVar);
        }
    }

    public /* synthetic */ class 2 extends q implements p {
        public 2(Object obj) {
            super(2, obj, WebViewAdPlayer.class, "onBroadcastEvent", "onBroadcastEvent(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        public final Object invoke(String str, Ga.e eVar) {
            return ((WebViewAdPlayer) this.receiver).onBroadcastEvent(str, eVar);
        }
    }

    public static final class 2 extends u implements Qa.a {
        final /* synthetic */ byte[] $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(byte[] bArr) {
            super(0);
            this.$value = bArr;
        }

        public final WebViewEvent invoke() {
            String encodeToString = Base64.encodeToString(this.$value, 2);
            t.f(encodeToString, "encodeToString(value, Base64.NO_WRAP)");
            return new OnAllowedPiiChangeEvent(encodeToString);
        }
    }

    public static final class 2 extends u implements Qa.a {
        final /* synthetic */ String $event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(String str) {
            super(0);
            this.$event = str;
        }

        public final WebViewEvent invoke() {
            JSONObject jSONObject = new JSONObject(this.$event);
            String eventType = jSONObject.getString("eventType");
            String optString = jSONObject.optString("data");
            t.f(eventType, "eventType");
            return new OnBroadcastEvent(eventType, optString);
        }
    }

    @f(c = "com.unity3d.ads.adplayer.WebViewAdPlayer", f = "WebViewAdPlayer.kt", l = {178, 179, 194}, m = "requestShow")
    public static final class 1 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public 1(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebViewAdPlayer.this.requestShow(null, this);
        }
    }

    public static final class 2 extends u implements Qa.a {
        public static final 2 INSTANCE = new 2();

        public 2() {
            super(0);
        }

        public final WebViewEvent invoke() {
            return new OnActivityDestroyedEvent();
        }
    }

    @f(c = "com.unity3d.ads.adplayer.WebViewAdPlayer", f = "WebViewAdPlayer.kt", l = {206, 220}, m = "sendEvent")
    public static final class 1 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public 1(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebViewAdPlayer.access$sendEvent(WebViewAdPlayer.this, null, this);
        }
    }

    public static final class 2 extends u implements Qa.a {
        final /* synthetic */ boolean $isFocused;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(boolean z) {
            super(0);
            this.$isFocused = z;
        }

        public final WebViewEvent invoke() {
            return new OnFocusChangeEvent(this.$isFocused);
        }
    }

    public static final class 2 extends u implements Qa.a {
        final /* synthetic */ c $event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(c cVar) {
            super(0);
            this.$event = cVar;
        }

        public final WebViewEvent invoke() {
            return new OnGmaEvent(this.$event);
        }
    }

    public static final class 2 extends u implements Qa.a {
        final /* synthetic */ boolean $isMuted;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(boolean z) {
            super(0);
            this.$isMuted = z;
        }

        public final WebViewEvent invoke() {
            return new OnMuteChangeEvent(this.$isMuted);
        }
    }

    public static final class 2 extends u implements Qa.a {
        final /* synthetic */ OfferwallEvent $event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(OfferwallEvent offerwallEvent) {
            super(0);
            this.$event = offerwallEvent;
        }

        public final WebViewEvent invoke() {
            return new OnOfferwallEvent(this.$event);
        }
    }

    public static final class 2 extends u implements Qa.a {
        final /* synthetic */ byte[] $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(byte[] bArr) {
            super(0);
            this.$value = bArr;
        }

        public final WebViewEvent invoke() {
            String encodeToString = Base64.encodeToString(this.$value, 2);
            t.f(encodeToString, "encodeToString(value, Base64.NO_WRAP)");
            return new OnPrivacyFsmChangeEvent(encodeToString);
        }
    }

    public static final class 2 extends u implements Qa.a {
        final /* synthetic */ BannerBridge.BannerEvent $event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(BannerBridge.BannerEvent bannerEvent) {
            super(0);
            this.$event = bannerEvent;
        }

        public final WebViewEvent invoke() {
            return new OnScarBannerEvent(this.$event);
        }
    }

    public static final class 2 extends u implements Qa.a {
        final /* synthetic */ byte[] $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(byte[] bArr) {
            super(0);
            this.$value = bArr;
        }

        public final WebViewEvent invoke() {
            String encodeToString = Base64.encodeToString(this.$value, 2);
            t.f(encodeToString, "encodeToString(value, Base64.NO_WRAP)");
            return new OnUserConsentChangeEvent(encodeToString);
        }
    }

    public static final class 2 extends u implements Qa.a {
        final /* synthetic */ boolean $isVisible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(boolean z) {
            super(0);
            this.$isVisible = z;
        }

        public final WebViewEvent invoke() {
            return new OnVisibilityChangeEvent(this.$isVisible);
        }
    }

    public static final class 2 extends u implements Qa.a {
        final /* synthetic */ double $volume;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(double d) {
            super(0);
            this.$volume = d;
        }

        public final WebViewEvent invoke() {
            return new OnVolumeChangeEvent(this.$volume);
        }
    }

    public WebViewAdPlayer(WebViewBridge bridge, DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, K dispatcher, SendDiagnosticEvent sendDiagnosticEvent, WebViewContainer webViewContainer, O adPlayerScope) {
        t.g(bridge, "bridge");
        t.g(deviceInfoRepository, "deviceInfoRepository");
        t.g(sessionRepository, "sessionRepository");
        t.g(dispatcher, "dispatcher");
        t.g(sendDiagnosticEvent, "sendDiagnosticEvent");
        t.g(webViewContainer, "webViewContainer");
        t.g(adPlayerScope, "adPlayerScope");
        this.bridge = bridge;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.dispatcher = dispatcher;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.webViewContainer = webViewContainer;
        z a = P.a(Boolean.FALSE);
        this.isCompletedManually = a;
        WebViewAdPlayer$storageEventCallback$1 webViewAdPlayer$storageEventCallback$1 = new WebViewAdPlayer$storageEventCallback$1(this);
        this.storageEventCallback = webViewAdPlayer$storageEventCallback$1;
        WebViewAdPlayer$special$$inlined$CoroutineExceptionHandler$1 webViewAdPlayer$special$$inlined$CoroutineExceptionHandler$1 = new WebViewAdPlayer$special$$inlined$CoroutineExceptionHandler$1(L.O8, this);
        this.scopeCancellationHandler = webViewAdPlayer$special$$inlined$CoroutineExceptionHandler$1;
        this.scope = cb.P.h(cb.P.h(cb.P.h(adPlayerScope, dispatcher), new N("WebViewAdPlayer")), webViewAdPlayer$special$$inlined$CoroutineExceptionHandler$1);
        this.onScarEvent = new WebViewAdPlayer$special$$inlined$map$1(new WebViewAdPlayer$special$$inlined$filter$1(bridge.getOnInvocation()));
        this.onOfferwallEvent = new WebViewAdPlayer$special$$inlined$map$2(new WebViewAdPlayer$special$$inlined$filter$2(bridge.getOnInvocation()));
        this.onShowEvent = g.w(new WebViewAdPlayer$special$$inlined$map$3(new WebViewAdPlayer$special$$inlined$filter$3(bridge.getOnInvocation())), a, new WebViewAdPlayer$onShowEvent$3(null));
        this.onLoadEvent = g.I(g.F(new WebViewAdPlayer$special$$inlined$map$4(new WebViewAdPlayer$special$$inlined$filter$4(bridge.getOnInvocation())), getScope(), J.a.c(), 1), 1);
        WebViewAdPlayer$special$$inlined$map$5 webViewAdPlayer$special$$inlined$map$5 = new WebViewAdPlayer$special$$inlined$map$5(new WebViewAdPlayer$special$$inlined$filter$5(bridge.getOnInvocation()));
        this.onBroadcastEvents = webViewAdPlayer$special$$inlined$map$5;
        Storage.Companion.addStorageEventCallback(webViewAdPlayer$storageEventCallback$1);
        AdPlayer.Companion companion = AdPlayer.Companion;
        g.z(g.C(webViewAdPlayer$special$$inlined$map$5, new 1(companion.getBroadcastEventChannel())), getScope());
        g.z(g.C(companion.getBroadcastEventChannel(), new 2(this)), getScope());
    }

    public static final /* synthetic */ WebViewBridge access$getBridge$p(WebViewAdPlayer webViewAdPlayer) {
        return webViewAdPlayer.bridge;
    }

    public static final /* synthetic */ l access$getStorageEventCallback$p(WebViewAdPlayer webViewAdPlayer) {
        return webViewAdPlayer.storageEventCallback;
    }

    public static final /* synthetic */ Object access$sendEvent(WebViewAdPlayer webViewAdPlayer, Qa.a aVar, Ga.e eVar) {
        return webViewAdPlayer.sendEvent(aVar, eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object sendEvent(Qa.a r18, Ga.e r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer.sendEvent.1
            if (r2 == 0) goto L17
            r2 = r1
            com.unity3d.ads.adplayer.WebViewAdPlayer$sendEvent$1 r2 = (com.unity3d.ads.adplayer.WebViewAdPlayer.sendEvent.1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            com.unity3d.ads.adplayer.WebViewAdPlayer$sendEvent$1 r2 = new com.unity3d.ads.adplayer.WebViewAdPlayer$sendEvent$1
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = Ha.c.f()
            int r4 = r2.label
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L45
            if (r4 == r6) goto L39
            if (r4 != r5) goto L31
            Ca.t.b(r1)
            goto Lb4
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            java.lang.Object r4 = r2.L$1
            Qa.a r4 = (Qa.a) r4
            java.lang.Object r6 = r2.L$0
            com.unity3d.ads.adplayer.WebViewAdPlayer r6 = (com.unity3d.ads.adplayer.WebViewAdPlayer) r6
            Ca.t.b(r1)
            goto L5c
        L45:
            Ca.t.b(r1)
            fb.e r1 = r17.getOnLoadEvent()
            r2.L$0 = r0
            r4 = r18
            r2.L$1 = r4
            r2.label = r6
            java.lang.Object r1 = fb.g.G(r1, r2)
            if (r1 != r3) goto L5b
            return r3
        L5b:
            r6 = r0
        L5c:
            com.unity3d.ads.adplayer.model.LoadEvent r1 = (com.unity3d.ads.adplayer.model.LoadEvent) r1
            boolean r7 = r1 instanceof com.unity3d.ads.adplayer.model.LoadEvent.Error
            if (r7 == 0) goto L9e
            com.unity3d.ads.core.domain.SendDiagnosticEvent r8 = r6.sendDiagnosticEvent
            java.lang.String r2 = "reason"
            java.lang.String r3 = "adviewer"
            Ca.q r2 = Ca.x.a(r2, r3)
            com.unity3d.ads.adplayer.model.LoadEvent$Error r1 = (com.unity3d.ads.adplayer.model.LoadEvent.Error) r1
            java.lang.String r3 = r1.getMessage()
            java.lang.String r4 = "reason_debug"
            Ca.q r3 = Ca.x.a(r4, r3)
            int r1 = r1.getErrorCode()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r4 = "reason_code"
            Ca.q r1 = Ca.x.a(r4, r1)
            Ca.q[] r1 = new Ca.q[]{r2, r3, r1}
            java.util.Map r11 = Da.S.l(r1)
            r15 = 58
            r16 = 0
            java.lang.String r9 = "bridge_send_event_failed"
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            Ca.I r1 = Ca.I.a
            return r1
        L9e:
            java.lang.Object r1 = r4.invoke()
            com.unity3d.ads.adplayer.model.WebViewEvent r1 = (com.unity3d.ads.adplayer.model.WebViewEvent) r1
            com.unity3d.ads.adplayer.WebViewBridge r4 = r6.bridge
            r6 = 0
            r2.L$0 = r6
            r2.L$1 = r6
            r2.label = r5
            java.lang.Object r1 = r4.sendEvent(r1, r2)
            if (r1 != r3) goto Lb4
            return r3
        Lb4:
            Ca.I r1 = Ca.I.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer.sendEvent(Qa.a, Ga.e):java.lang.Object");
    }

    public Object destroy(Ga.e eVar) {
        return AdPlayer.DefaultImpls.destroy(this, eVar);
    }

    public void dispatchShowCompleted() {
        this.isCompletedManually.setValue(Boolean.TRUE);
    }

    public e getOnLoadEvent() {
        return this.onLoadEvent;
    }

    public e getOnOfferwallEvent() {
        return this.onOfferwallEvent;
    }

    public e getOnScarEvent() {
        return this.onScarEvent;
    }

    public e getOnShowEvent() {
        return this.onShowEvent;
    }

    public O getScope() {
        return this.scope;
    }

    public WebViewContainer getWebViewContainer() {
        return this.webViewContainer;
    }

    public Object onAllowedPiiChange(byte[] bArr, Ga.e eVar) {
        Object sendEvent = sendEvent(new 2(bArr), eVar);
        return sendEvent == Ha.c.f() ? sendEvent : I.a;
    }

    public Object onBroadcastEvent(String str, Ga.e eVar) {
        Object sendEvent = sendEvent(new 2(str), eVar);
        return sendEvent == Ha.c.f() ? sendEvent : I.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0185 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object requestShow(java.util.Map r14, Ga.e r15) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer.requestShow(java.util.Map, Ga.e):java.lang.Object");
    }

    public Object sendActivityDestroyed(Ga.e eVar) {
        Object sendEvent = sendEvent(2.INSTANCE, eVar);
        return sendEvent == Ha.c.f() ? sendEvent : I.a;
    }

    public Object sendFocusChange(boolean z, Ga.e eVar) {
        Object sendEvent = sendEvent(new 2(z), eVar);
        return sendEvent == Ha.c.f() ? sendEvent : I.a;
    }

    public Object sendGmaEvent(c cVar, Ga.e eVar) {
        Object sendEvent = sendEvent(new 2(cVar), eVar);
        return sendEvent == Ha.c.f() ? sendEvent : I.a;
    }

    public Object sendMuteChange(boolean z, Ga.e eVar) {
        Object sendEvent = sendEvent(new 2(z), eVar);
        return sendEvent == Ha.c.f() ? sendEvent : I.a;
    }

    public Object sendOfferwallEvent(OfferwallEvent offerwallEvent, Ga.e eVar) {
        Object sendEvent = sendEvent(new 2(offerwallEvent), eVar);
        return sendEvent == Ha.c.f() ? sendEvent : I.a;
    }

    public Object sendPrivacyFsmChange(byte[] bArr, Ga.e eVar) {
        Object sendEvent = sendEvent(new 2(bArr), eVar);
        return sendEvent == Ha.c.f() ? sendEvent : I.a;
    }

    public Object sendScarBannerEvent(BannerBridge.BannerEvent bannerEvent, Ga.e eVar) {
        Object sendEvent = sendEvent(new 2(bannerEvent), eVar);
        return sendEvent == Ha.c.f() ? sendEvent : I.a;
    }

    public Object sendUserConsentChange(byte[] bArr, Ga.e eVar) {
        Object sendEvent = sendEvent(new 2(bArr), eVar);
        return sendEvent == Ha.c.f() ? sendEvent : I.a;
    }

    public Object sendVisibilityChange(boolean z, Ga.e eVar) {
        Object sendEvent = sendEvent(new 2(z), eVar);
        return sendEvent == Ha.c.f() ? sendEvent : I.a;
    }

    public Object sendVolumeChange(double d, Ga.e eVar) {
        Object sendEvent = sendEvent(new 2(d), eVar);
        return sendEvent == Ha.c.f() ? sendEvent : I.a;
    }

    public void show(ShowOptions showOptions) {
        AdPlayer.DefaultImpls.show(this, showOptions);
    }
}
