package com.unity3d.ads.core.domain;

import Ca.I;
import Ca.x;
import Da.Q;
import Da.S;
import Ga.e;
import Ha.c;
import Ia.b;
import Ia.d;
import Ia.f;
import Ia.l;
import Qa.p;
import Qa.q;
import Qa.t;
import ab.j;
import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.adplayer.model.ShowStatus;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.extensions.ShowStatusExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.core.log.DeviceLog;
import fb.P;
import fb.z;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.OperativeEventErrorDataKt;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.u;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class LegacyShowUseCase {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_OBJECT_ID = "objectId";
    public static final String MESSAGE_AD_OBJECT_EXPIRED = "The ad has expired";
    public static final String MESSAGE_AD_PLAYER_UNAVAILABLE = "Ad player is unavailable.";
    public static final String MESSAGE_ALREADY_SHOWING = "Can't show a new ad unit when ad unit is already open";
    public static final String MESSAGE_NO_AD_OBJECT = "No ad object found for opportunity id: ";
    public static final String MESSAGE_OPPORTUNITY_ID = "No valid opportunity id provided";
    public static final String MESSAGE_OPT_TIMEOUT = "timeout";
    public static final String MESSAGE_PLACEMENT_NOT_LOADED = "Placement %s must be Loaded before calling Show";
    public static final String MESSAGE_TIMEOUT = "[UnityAds] Timeout while trying to show ";
    public static final String MSG_OPPORTUNITY_AND_PLACEMENT_NOT_MATCHING = "[UnityAds] Object ID and Placement ID provided does not match previously loaded ad";
    private static volatile boolean isFullscreenAdShowing;
    private AdObject adObject;
    private final AdRepository adRepository;
    private final GetInitializationState getInitializationState;
    private final GetOperativeEventApi getOperativeEventApi;
    private final z hasStarted;
    private String placement;
    private final SafeCallbackInvoke safeCallbackInvoke;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final Show show;
    private final z timeoutCancellationRequested;
    private UnityAdsShowOptions unityAdsShowOptions;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    @f(c = "com.unity3d.ads.core.domain.LegacyShowUseCase", f = "LegacyShowUseCase.kt", l = {117, 122, 128, 133, 141, 146, 152, 159, 164, 195}, m = "invoke")
    public static final class 1 extends d {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public 1(e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LegacyShowUseCase.this.invoke(null, null, null, this);
        }
    }

    @f(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$2", f = "LegacyShowUseCase.kt", l = {178, 184, 185}, m = "invokeSuspend")
    public static final class 2 extends l implements p {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ boolean $isBanner;
        final /* synthetic */ String $placement;
        final /* synthetic */ t $reportShowError;
        final /* synthetic */ boolean $useTimeout;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(boolean z, AdObject adObject, boolean z2, t tVar, String str, e eVar) {
            super(2, eVar);
            this.$isBanner = z;
            this.$adObject = adObject;
            this.$useTimeout = z2;
            this.$reportShowError = tVar;
            this.$placement = str;
        }

        public final e create(Object obj, e eVar) {
            2 r8 = LegacyShowUseCase.this.new 2(this.$isBanner, this.$adObject, this.$useTimeout, this.$reportShowError, this.$placement, eVar);
            r8.L$0 = obj;
            return r8;
        }

        public final Object invoke(Qa.a aVar, e eVar) {
            return ((2) create(aVar, eVar)).invokeSuspend(I.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x00b3 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x00b4  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = Ha.c.f()
                int r1 = r10.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L32
                if (r1 == r4) goto L2a
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r0 = r10.L$0
                Qa.a r0 = (Qa.a) r0
                Ca.t.b(r11)
                goto Lb5
            L1a:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L22:
                java.lang.Object r1 = r10.L$0
                Qa.a r1 = (Qa.a) r1
                Ca.t.b(r11)
                goto L8d
            L2a:
                java.lang.Object r1 = r10.L$0
                Qa.a r1 = (Qa.a) r1
                Ca.t.b(r11)
                goto L76
            L32:
                Ca.t.b(r11)
                java.lang.Object r11 = r10.L$0
                r1 = r11
                Qa.a r1 = (Qa.a) r1
                com.unity3d.ads.core.domain.LegacyShowUseCase r11 = com.unity3d.ads.core.domain.LegacyShowUseCase.this
                fb.z r11 = com.unity3d.ads.core.domain.LegacyShowUseCase.access$getHasStarted$p(r11)
                java.lang.Object r11 = r11.getValue()
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 != 0) goto Lbb
                com.unity3d.ads.core.domain.LegacyShowUseCase r11 = com.unity3d.ads.core.domain.LegacyShowUseCase.this
                fb.z r11 = com.unity3d.ads.core.domain.LegacyShowUseCase.access$getTimeoutCancellationRequested$p(r11)
                java.lang.Object r11 = r11.getValue()
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 != 0) goto Lbb
                boolean r11 = r10.$isBanner
                if (r11 == 0) goto L63
                goto Lbb
            L63:
                com.unity3d.ads.core.domain.LegacyShowUseCase r11 = com.unity3d.ads.core.domain.LegacyShowUseCase.this
                gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorType r5 = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.OPERATIVE_EVENT_ERROR_TYPE_TIMEOUT
                com.unity3d.ads.core.data.model.AdObject r6 = r10.$adObject
                r10.L$0 = r1
                r10.label = r4
                java.lang.String r4 = "timeout"
                java.lang.Object r11 = com.unity3d.ads.core.domain.LegacyShowUseCase.access$sendOperativeError(r11, r5, r4, r6, r10)
                if (r11 != r0) goto L76
                return r0
            L76:
                boolean r11 = r10.$useTimeout
                if (r11 == 0) goto Lb8
                com.unity3d.ads.core.domain.LegacyShowUseCase r11 = com.unity3d.ads.core.domain.LegacyShowUseCase.this
                com.unity3d.ads.core.domain.Show r11 = com.unity3d.ads.core.domain.LegacyShowUseCase.access$getShow$p(r11)
                com.unity3d.ads.core.data.model.AdObject r4 = r10.$adObject
                r10.L$0 = r1
                r10.label = r3
                java.lang.Object r11 = r11.terminate(r4, r10)
                if (r11 != r0) goto L8d
                return r0
            L8d:
                Qa.t r3 = r10.$reportShowError
                com.unity3d.ads.UnityAds$UnityAdsShowError r5 = com.unity3d.ads.UnityAds.UnityAdsShowError.TIMEOUT
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r4 = "[UnityAds] Timeout while trying to show "
                r11.append(r4)
                java.lang.String r4 = r10.$placement
                r11.append(r4)
                java.lang.String r6 = r11.toString()
                r10.L$0 = r1
                r10.label = r2
                java.lang.String r4 = "timeout"
                r7 = 0
                r8 = 0
                r9 = r10
                java.lang.Object r11 = r3.invoke(r4, r5, r6, r7, r8, r9)
                if (r11 != r0) goto Lb4
                return r0
            Lb4:
                r0 = r1
            Lb5:
                r0.invoke()
            Lb8:
                Ca.I r11 = Ca.I.a
                return r11
            Lbb:
                Ca.I r11 = Ca.I.a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.LegacyShowUseCase.invoke.2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @f(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$3", f = "LegacyShowUseCase.kt", l = {190}, m = "invokeSuspend")
    public static final class 3 extends l implements q {
        final /* synthetic */ boolean $isBanner;
        final /* synthetic */ t $reportShowError;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(t tVar, boolean z, e eVar) {
            super(3, eVar);
            this.$reportShowError = tVar;
            this.$isBanner = z;
        }

        public final Object invoke(fb.f fVar, Throwable th, e eVar) {
            3 r3 = new 3(this.$reportShowError, this.$isBanner, eVar);
            r3.L$0 = th;
            return r3.invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                Ca.t.b(obj);
                Throwable th = (Throwable) this.L$0;
                t tVar = this.$reportShowError;
                UnityAds.UnityAdsShowError unityAdsShowError = UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                String shortenedStackTrace$default = ExceptionExtensionsKt.getShortenedStackTrace$default(th, 0, 1, null);
                this.label = 1;
                if (tVar.invoke("uncaught_exception", unityAdsShowError, "Internal error", null, shortenedStackTrace$default, this) == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Ca.t.b(obj);
            }
            if (!this.$isBanner) {
                LegacyShowUseCase.access$setFullscreenAdShowing$cp(false);
            }
            return I.a;
        }
    }

    public static final class 4 implements fb.f {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ Listeners $listeners;
        final /* synthetic */ String $placement;
        final /* synthetic */ t $reportShowError;
        final /* synthetic */ long $startTime;

        public 4(long j, String str, Listeners listeners, AdObject adObject, t tVar) {
            this.$startTime = j;
            this.$placement = str;
            this.$listeners = listeners;
            this.$adObject = adObject;
            this.$reportShowError = tVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:47:0x001a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(com.unity3d.ads.core.data.model.ShowEvent r19, Ga.e r20) {
            /*
                Method dump skipped, instructions count: 313
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.LegacyShowUseCase.invoke.4.emit(com.unity3d.ads.core.data.model.ShowEvent, Ga.e):java.lang.Object");
        }
    }

    public static final class 1 extends u implements Qa.a {
        final /* synthetic */ Listeners $listeners;
        final /* synthetic */ String $placement;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(Listeners listeners, String str) {
            super(0);
            this.$listeners = listeners;
            this.$placement = str;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            this.$listeners.onClick(this.$placement);
        }
    }

    public static final class 1 extends u implements Qa.a {
        final /* synthetic */ Listeners $listeners;
        final /* synthetic */ String $placement;
        final /* synthetic */ ShowStatus $status;
        final /* synthetic */ LegacyShowUseCase this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(Listeners listeners, String str, ShowStatus showStatus, LegacyShowUseCase legacyShowUseCase) {
            super(0);
            this.$listeners = listeners;
            this.$placement = str;
            this.$status = showStatus;
            this.this$0 = legacyShowUseCase;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            Listeners listeners = this.$listeners;
            String str = this.$placement;
            ShowStatus showStatus = this.$status;
            NativeConfigurationOuterClass.ShowCompletionState defaultShowCompletionState = LegacyShowUseCase.access$getSessionRepository$p(this.this$0).getNativeConfiguration().getDefaultShowCompletionState();
            kotlin.jvm.internal.t.f(defaultShowCompletionState, "sessionRepository.native…efaultShowCompletionState");
            listeners.onComplete(str, ShowStatusExtensionsKt.toUnityAdsShowCompletionState(showStatus, defaultShowCompletionState));
        }
    }

    @f(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$showError$1", f = "LegacyShowUseCase.kt", l = {}, m = "invokeSuspend")
    public static final class 1 extends l implements t {
        final /* synthetic */ Listeners $listeners;
        final /* synthetic */ String $opportunityId;
        final /* synthetic */ String $placement;
        final /* synthetic */ j $startTime;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        /* synthetic */ Object L$3;
        /* synthetic */ Object L$4;
        int label;
        final /* synthetic */ LegacyShowUseCase this$0;

        public static final class 1 extends u implements Qa.a {
            final /* synthetic */ Listeners $listeners;
            final /* synthetic */ String $message;
            final /* synthetic */ String $placement;
            final /* synthetic */ UnityAds.UnityAdsShowError $reason;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(Listeners listeners, String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
                super(0);
                this.$listeners = listeners;
                this.$placement = str;
                this.$reason = unityAdsShowError;
                this.$message = str2;
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                invoke();
                return I.a;
            }

            public final void invoke() {
                this.$listeners.onError(this.$placement, this.$reason, this.$message);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(String str, LegacyShowUseCase legacyShowUseCase, String str2, j jVar, Listeners listeners, e eVar) {
            super(6, eVar);
            this.$placement = str;
            this.this$0 = legacyShowUseCase;
            this.$opportunityId = str2;
            this.$startTime = jVar;
            this.$listeners = listeners;
        }

        public final Object invokeSuspend(Object obj) {
            c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ca.t.b(obj);
            String str = (String) this.L$0;
            UnityAds.UnityAdsShowError unityAdsShowError = (UnityAds.UnityAdsShowError) this.L$1;
            String str2 = (String) this.L$2;
            Integer num = (Integer) this.L$3;
            String str3 = (String) this.L$4;
            DeviceLog.debug("Unity Ads Show Failed for placement " + this.$placement);
            AdObject access$getAdObject$p = LegacyShowUseCase.access$getAdObject$p(this.this$0);
            if (access$getAdObject$p == null) {
                access$getAdObject$p = LegacyShowUseCase.access$getTmpAdObject(this.this$0, this.$opportunityId);
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(LegacyShowUseCase.access$getSendDiagnosticEvent$p(this.this$0), "native_show_failure_time", b.b(TimeExtensionsKt.elapsedMillis(this.$startTime)), LegacyShowUseCase.access$getTags(this.this$0, str, num, str3), null, access$getAdObject$p, null, 40, null);
            LegacyShowUseCase.access$getSafeCallbackInvoke$p(this.this$0).invoke(new 1(this.$listeners, this.$placement, unityAdsShowError, str2));
            return I.a;
        }

        public final Object invoke(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2, Integer num, String str3, e eVar) {
            1 r7 = new 1(this.$placement, this.this$0, this.$opportunityId, this.$startTime, this.$listeners, eVar);
            r7.L$0 = str;
            r7.L$1 = unityAdsShowError;
            r7.L$2 = str2;
            r7.L$3 = num;
            r7.L$4 = str3;
            return r7.invokeSuspend(I.a);
        }
    }

    public static final class 1 extends u implements Qa.a {
        final /* synthetic */ Listeners $listeners;
        final /* synthetic */ String $placement;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(Listeners listeners, String str) {
            super(0);
            this.$listeners = listeners;
            this.$placement = str;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            this.$listeners.onStart(this.$placement);
        }
    }

    public LegacyShowUseCase(Show show, AdRepository adRepository, SendDiagnosticEvent sendDiagnosticEvent, GetOperativeEventApi getOperativeEventApi, GetInitializationState getInitializationState, SessionRepository sessionRepository, SafeCallbackInvoke safeCallbackInvoke) {
        kotlin.jvm.internal.t.g(show, "show");
        kotlin.jvm.internal.t.g(adRepository, "adRepository");
        kotlin.jvm.internal.t.g(sendDiagnosticEvent, "sendDiagnosticEvent");
        kotlin.jvm.internal.t.g(getOperativeEventApi, "getOperativeEventApi");
        kotlin.jvm.internal.t.g(getInitializationState, "getInitializationState");
        kotlin.jvm.internal.t.g(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.t.g(safeCallbackInvoke, "safeCallbackInvoke");
        this.show = show;
        this.adRepository = adRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getOperativeEventApi = getOperativeEventApi;
        this.getInitializationState = getInitializationState;
        this.sessionRepository = sessionRepository;
        this.safeCallbackInvoke = safeCallbackInvoke;
        Boolean bool = Boolean.FALSE;
        this.hasStarted = P.a(bool);
        this.timeoutCancellationRequested = P.a(bool);
    }

    public static final /* synthetic */ void access$bannerLeftApplication(LegacyShowUseCase legacyShowUseCase, j jVar, String str, Listeners listeners) {
        legacyShowUseCase.bannerLeftApplication(jVar, str, listeners);
    }

    public static final /* synthetic */ void access$cancelTimeout(LegacyShowUseCase legacyShowUseCase, j jVar) {
        legacyShowUseCase.cancelTimeout(jVar);
    }

    public static final /* synthetic */ AdObject access$getAdObject$p(LegacyShowUseCase legacyShowUseCase) {
        return legacyShowUseCase.adObject;
    }

    public static final /* synthetic */ z access$getHasStarted$p(LegacyShowUseCase legacyShowUseCase) {
        return legacyShowUseCase.hasStarted;
    }

    public static final /* synthetic */ SafeCallbackInvoke access$getSafeCallbackInvoke$p(LegacyShowUseCase legacyShowUseCase) {
        return legacyShowUseCase.safeCallbackInvoke;
    }

    public static final /* synthetic */ SendDiagnosticEvent access$getSendDiagnosticEvent$p(LegacyShowUseCase legacyShowUseCase) {
        return legacyShowUseCase.sendDiagnosticEvent;
    }

    public static final /* synthetic */ SessionRepository access$getSessionRepository$p(LegacyShowUseCase legacyShowUseCase) {
        return legacyShowUseCase.sessionRepository;
    }

    public static final /* synthetic */ Show access$getShow$p(LegacyShowUseCase legacyShowUseCase) {
        return legacyShowUseCase.show;
    }

    public static final /* synthetic */ Map access$getTags(LegacyShowUseCase legacyShowUseCase, String str, Integer num, String str2) {
        return legacyShowUseCase.getTags(str, num, str2);
    }

    public static final /* synthetic */ z access$getTimeoutCancellationRequested$p(LegacyShowUseCase legacyShowUseCase) {
        return legacyShowUseCase.timeoutCancellationRequested;
    }

    public static final /* synthetic */ AdObject access$getTmpAdObject(LegacyShowUseCase legacyShowUseCase, String str) {
        return legacyShowUseCase.getTmpAdObject(str);
    }

    public static final /* synthetic */ Object access$sendOperativeError(LegacyShowUseCase legacyShowUseCase, OperativeEventRequestOuterClass.OperativeEventErrorType operativeEventErrorType, String str, AdObject adObject, e eVar) {
        return legacyShowUseCase.sendOperativeError(operativeEventErrorType, str, adObject, eVar);
    }

    public static final /* synthetic */ void access$setFullscreenAdShowing$cp(boolean z) {
        isFullscreenAdShowing = z;
    }

    public static final /* synthetic */ void access$showClicked(LegacyShowUseCase legacyShowUseCase, j jVar, String str, Listeners listeners) {
        legacyShowUseCase.showClicked(jVar, str, listeners);
    }

    public static final /* synthetic */ void access$showCompleted(LegacyShowUseCase legacyShowUseCase, j jVar, String str, ShowStatus showStatus, Listeners listeners, String str2, String str3) {
        legacyShowUseCase.showCompleted(jVar, str, showStatus, listeners, str2, str3);
    }

    public static final /* synthetic */ void access$showStarted(LegacyShowUseCase legacyShowUseCase, j jVar, String str, Listeners listeners) {
        legacyShowUseCase.showStarted(jVar, str, listeners);
    }

    private final void bannerLeftApplication(j jVar, String str, Listeners listeners) {
        DeviceLog.debug("Unity Ads Show Left Application for placement " + str);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_left_app", Double.valueOf(TimeExtensionsKt.elapsedMillis(jVar)), null, null, this.adObject, null, 44, null);
        listeners.onLeftApplication(str);
    }

    private final void cancelTimeout(j jVar) {
        this.timeoutCancellationRequested.setValue(Boolean.TRUE);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_cancel_timeout", Double.valueOf(TimeExtensionsKt.elapsedMillis(jVar)), null, null, this.adObject, null, 44, null);
    }

    private final String getOpportunityId(UnityAdsShowOptions unityAdsShowOptions) throws IllegalArgumentException {
        Object opt;
        String obj;
        JSONObject data = unityAdsShowOptions.getData();
        if (data == null || (opt = data.opt("objectId")) == null || (obj = opt.toString()) == null) {
            return null;
        }
        return UUID.fromString(obj).toString();
    }

    private final Map getTags(String str, Integer num, String str2) {
        Map o = S.o(x.a("operation", OperationType.SHOW.toString()), x.a("reason", str));
        if (num != null) {
        }
        if (str2 != null) {
            o.put("reason_debug", str2);
        }
        return o;
    }

    private final AdObject getTmpAdObject(String str) {
        UUID fromString = UUID.fromString(str);
        kotlin.jvm.internal.t.f(fromString, "fromString(opportunityId)");
        ByteString byteString = ProtobufExtensionsKt.toByteString(fromString);
        AdObject ad = this.adRepository.getAd(byteString);
        if (ad != null) {
            return ad;
        }
        String str2 = this.placement;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        ByteString EMPTY = ByteString.EMPTY;
        kotlin.jvm.internal.t.f(EMPTY, "EMPTY");
        return new AdObject(byteString, str3, EMPTY, false, null, null, null, false, null, null, null, new UnityAdsLoadOptions(), false, DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_UNSPECIFIED, null, null, 50680, null);
    }

    private final Object sendOperativeError(OperativeEventRequestOuterClass.OperativeEventErrorType operativeEventErrorType, String str, AdObject adObject, e eVar) {
        OperativeEventErrorDataKt.Dsl.Companion companion = OperativeEventErrorDataKt.Dsl.Companion;
        OperativeEventRequestOuterClass.OperativeEventErrorData.Builder newBuilder = OperativeEventRequestOuterClass.OperativeEventErrorData.newBuilder();
        kotlin.jvm.internal.t.f(newBuilder, "newBuilder()");
        OperativeEventErrorDataKt.Dsl _create = companion._create(newBuilder);
        _create.setErrorType(operativeEventErrorType);
        _create.setMessage(str);
        OperativeEventRequestOuterClass.OperativeEventErrorData _build = _create._build();
        GetOperativeEventApi getOperativeEventApi = this.getOperativeEventApi;
        OperativeEventRequestOuterClass.OperativeEventType operativeEventType = OperativeEventRequestOuterClass.OperativeEventType.OPERATIVE_EVENT_TYPE_SHOW_ERROR;
        ByteString byteString = _build.toByteString();
        kotlin.jvm.internal.t.f(byteString, "errorData.toByteString()");
        Object invoke = getOperativeEventApi.invoke(operativeEventType, adObject, byteString, eVar);
        return invoke == c.f() ? invoke : I.a;
    }

    private final void showClicked(j jVar, String str, Listeners listeners) {
        DeviceLog.debug("Unity Ads Show Clicked for placement " + str);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_clicked", Double.valueOf(TimeExtensionsKt.elapsedMillis(jVar)), null, null, this.adObject, null, 44, null);
        this.safeCallbackInvoke.invoke(new 1(listeners, str));
    }

    private final void showCompleted(j jVar, String str, ShowStatus showStatus, Listeners listeners, String str2, String str3) {
        DeviceLog.debug("Unity Ads Show Completed for placement " + str);
        Map c = Q.c();
        if (str2 != null) {
        }
        if (str3 != null) {
            c.put("reason_debug", str3);
        }
        Map b = Q.b(c);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_success_time", Double.valueOf(TimeExtensionsKt.elapsedMillis(jVar)), b, null, this.adObject, null, 40, null);
        this.safeCallbackInvoke.invoke(new 1(listeners, str, showStatus, this));
    }

    public static /* synthetic */ void showCompleted$default(LegacyShowUseCase legacyShowUseCase, j jVar, String str, ShowStatus showStatus, Listeners listeners, String str2, String str3, int i, Object obj) {
        legacyShowUseCase.showCompleted(jVar, str, showStatus, listeners, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3);
    }

    private final t showError(j jVar, String str, String str2, Listeners listeners) {
        return new 1(str, this, str2, jVar, listeners, null);
    }

    private final void showStart(String str) {
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_started", null, null, null, getTmpAdObject(str), null, 46, null);
    }

    private final void showStarted(j jVar, String str, Listeners listeners) {
        DeviceLog.debug("Unity Ads Show WV Start for placement " + str);
        this.hasStarted.setValue(Boolean.TRUE);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_wv_started", Double.valueOf(TimeExtensionsKt.elapsedMillis(jVar)), null, null, this.adObject, null, 44, null);
        this.safeCallbackInvoke.invoke(new 1(listeners, str));
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x030b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.String r26, com.unity3d.ads.UnityAdsShowOptions r27, com.unity3d.ads.core.data.model.Listeners r28, Ga.e r29) {
        /*
            Method dump skipped, instructions count: 812
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.LegacyShowUseCase.invoke(java.lang.String, com.unity3d.ads.UnityAdsShowOptions, com.unity3d.ads.core.data.model.Listeners, Ga.e):java.lang.Object");
    }
}
