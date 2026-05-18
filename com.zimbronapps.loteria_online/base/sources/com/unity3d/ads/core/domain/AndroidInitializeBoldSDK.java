package com.unity3d.ads.core.domain;

import Ca.I;
import Ca.t;
import Ca.x;
import Da.Q;
import Da.S;
import Ga.e;
import Ha.c;
import Ia.d;
import Ia.f;
import Ia.l;
import Qa.p;
import Za.A;
import ab.j;
import ab.k;
import cb.K;
import cb.O;
import cb.c1;
import cb.i;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.ads.core.data.manager.StorageManager;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.core.data.model.exception.InitializationException;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.events.EventObservers;
import com.unity3d.ads.core.domain.om.InitializeOMSDK;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.log.DeviceLog;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import java.util.Map;
import kotlin.jvm.internal.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidInitializeBoldSDK implements InitializeBoldSDK {
    public static final Companion Companion = new Companion(null);
    public static final String MSG_GATEWAY_DENIED = "Gateway communication failure";
    public static final String MSG_NETWORK = "Network";
    public static final String MSG_TIMEOUT = "Timeout";
    public static final String MSG_UNKNOWN = "Initialization failure";
    private final CleanAssets cleanAssets;
    private final K defaultDispatcher;
    private final DiagnosticEventRepository diagnosticEventRepository;
    private final EventObservers eventObservers;
    private final GatewayClient gatewayClient;
    private final GetGameId getGameId;
    private final GetInitializationRequest getInitializeRequest;
    private final GetRequestPolicy getRequestPolicy;
    private final AndroidHandleFocusCounters handleFocusCounters;
    private final HandleGatewayInitializationResponse handleGatewayInitializationResponse;
    private final InitializeOMSDK initializeOM;
    private final ConfigurationReader legacyConfigurationReader;
    private final SDKPropertiesManager sdkPropertiesManager;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final StorageManager storageManager;
    private final TriggerInitializeListener triggerInitializeListener;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    @f(c = "com.unity3d.ads.core.domain.AndroidInitializeBoldSDK", f = "AndroidInitializeBoldSDK.kt", l = {125, 126, 129}, m = "initializationSuccess")
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
            return AndroidInitializeBoldSDK.access$initializationSuccess(AndroidInitializeBoldSDK.this, null, null, false, this);
        }
    }

    @f(c = "com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2", f = "AndroidInitializeBoldSDK.kt", l = {66, 83}, m = "invokeSuspend")
    public static final class 2 extends l implements p {
        final /* synthetic */ String $source;
        int I$0;
        long J$0;
        int label;

        @f(c = "com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2$1", f = "AndroidInitializeBoldSDK.kt", l = {67, 69, 71, 72}, m = "invokeSuspend")
        public static final class 1 extends l implements p {
            final /* synthetic */ boolean $isRetry;
            final /* synthetic */ String $source;
            int label;
            final /* synthetic */ AndroidInitializeBoldSDK this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(AndroidInitializeBoldSDK androidInitializeBoldSDK, String str, boolean z, e eVar) {
                super(2, eVar);
                this.this$0 = androidInitializeBoldSDK;
                this.$source = str;
                this.$isRetry = z;
            }

            public final e create(Object obj, e eVar) {
                return new 1(this.this$0, this.$source, this.$isRetry, eVar);
            }

            public final Object invoke(O o, e eVar) {
                return ((1) create(o, eVar)).invokeSuspend(I.a);
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0080 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0073 A[RETURN] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    java.lang.Object r0 = Ha.c.f()
                    int r1 = r12.label
                    r2 = 4
                    r3 = 3
                    r4 = 2
                    r5 = 1
                    if (r1 == 0) goto L2c
                    if (r1 == r5) goto L28
                    if (r1 == r4) goto L24
                    if (r1 == r3) goto L20
                    if (r1 != r2) goto L18
                    Ca.t.b(r13)
                    goto L81
                L18:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r0)
                    throw r13
                L20:
                    Ca.t.b(r13)
                    goto L74
                L24:
                    Ca.t.b(r13)
                    goto L52
                L28:
                    Ca.t.b(r13)
                    goto L3e
                L2c:
                    Ca.t.b(r13)
                    com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r13 = r12.this$0
                    java.lang.String r1 = r12.$source
                    boolean r6 = r12.$isRetry
                    r12.label = r5
                    java.lang.Object r13 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$initializationStart(r13, r1, r6, r12)
                    if (r13 != r0) goto L3e
                    return r0
                L3e:
                    com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r13 = r12.this$0
                    com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$checkCanInitialize(r13)
                    com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r13 = r12.this$0
                    com.unity3d.ads.core.domain.GetInitializationRequest r13 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getGetInitializeRequest$p(r13)
                    r12.label = r4
                    java.lang.Object r13 = r13.invoke(r12)
                    if (r13 != r0) goto L52
                    return r0
                L52:
                    r6 = r13
                    gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r6 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) r6
                    com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r13 = r12.this$0
                    com.unity3d.ads.core.domain.GetRequestPolicy r13 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getGetRequestPolicy$p(r13)
                    com.unity3d.ads.gatewayclient.RequestPolicy r7 = r13.invoke()
                    com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r13 = r12.this$0
                    com.unity3d.ads.gatewayclient.GatewayClient r4 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getGatewayClient$p(r13)
                    com.unity3d.ads.core.data.model.OperationType r8 = com.unity3d.ads.core.data.model.OperationType.INITIALIZATION
                    r12.label = r3
                    r5 = 0
                    r10 = 1
                    r11 = 0
                    r9 = r12
                    java.lang.Object r13 = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(r4, r5, r6, r7, r8, r9, r10, r11)
                    if (r13 != r0) goto L74
                    return r0
                L74:
                    gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse r13 = (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) r13
                    com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r1 = r12.this$0
                    r12.label = r2
                    java.lang.Object r13 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$handleResponse(r1, r13, r12)
                    if (r13 != r0) goto L81
                    return r0
                L81:
                    Ca.I r13 = Ca.I.a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.invoke.2.1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(String str, e eVar) {
            super(2, eVar);
            this.$source = str;
        }

        public final e create(Object obj, e eVar) {
            return AndroidInitializeBoldSDK.this.new 2(this.$source, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((2) create(o, eVar)).invokeSuspend(I.a);
        }

        /* JADX WARN: Type inference failed for: r5v4, types: [ab.j, ab.k$a, long] */
        public final Object invokeSuspend(Object obj) {
            long b;
            ?? b2;
            Object f = c.f();
            int i = this.label;
            try {
                if (i == 0) {
                    t.b(obj);
                    b = ab.k.a.b();
                    boolean isFirstInitAttempt = AndroidInitializeBoldSDK.access$getSessionRepository$p(AndroidInitializeBoldSDK.this).isFirstInitAttempt();
                    i = !isFirstInitAttempt ? 1 : 0;
                    1 r7 = new 1(AndroidInitializeBoldSDK.this, this.$source, !isFirstInitAttempt, null);
                    this.J$0 = b;
                    this.I$0 = i;
                    this.label = 1;
                    if (c1.c(120000L, r7, this) == f) {
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
                    i = this.I$0;
                    b = this.J$0;
                    t.b(obj);
                }
                AndroidInitializeBoldSDK androidInitializeBoldSDK = AndroidInitializeBoldSDK.this;
                b2 = k.a.b(b);
                String str = this.$source;
                boolean z = i != 0;
                this.label = 2;
                if (AndroidInitializeBoldSDK.access$initializationSuccess(androidInitializeBoldSDK, b2, str, z, this) == f) {
                    return f;
                }
                return I.a;
            } catch (Exception e) {
                InitializationException parseFrom = InitializationException.Companion.parseFrom(e);
                if (e instanceof GatewayException) {
                    AndroidInitializeBoldSDK.access$getSessionRepository$p(AndroidInitializeBoldSDK.this).setShouldInitialize(false);
                }
                AndroidInitializeBoldSDK.access$initializationFailure(AndroidInitializeBoldSDK.this, k.a.b(b2), parseFrom, this.$source, i != 0);
                return I.a;
            }
        }
    }

    public AndroidInitializeBoldSDK(K defaultDispatcher, InitializeOMSDK initializeOM, GetInitializationRequest getInitializeRequest, GetRequestPolicy getRequestPolicy, CleanAssets cleanAssets, HandleGatewayInitializationResponse handleGatewayInitializationResponse, GatewayClient gatewayClient, SessionRepository sessionRepository, EventObservers eventObservers, TriggerInitializeListener triggerInitializeListener, SendDiagnosticEvent sendDiagnosticEvent, DiagnosticEventRepository diagnosticEventRepository, StorageManager storageManager, ConfigurationReader legacyConfigurationReader, SDKPropertiesManager sdkPropertiesManager, GetGameId getGameId, AndroidHandleFocusCounters handleFocusCounters) {
        kotlin.jvm.internal.t.g(defaultDispatcher, "defaultDispatcher");
        kotlin.jvm.internal.t.g(initializeOM, "initializeOM");
        kotlin.jvm.internal.t.g(getInitializeRequest, "getInitializeRequest");
        kotlin.jvm.internal.t.g(getRequestPolicy, "getRequestPolicy");
        kotlin.jvm.internal.t.g(cleanAssets, "cleanAssets");
        kotlin.jvm.internal.t.g(handleGatewayInitializationResponse, "handleGatewayInitializationResponse");
        kotlin.jvm.internal.t.g(gatewayClient, "gatewayClient");
        kotlin.jvm.internal.t.g(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.t.g(eventObservers, "eventObservers");
        kotlin.jvm.internal.t.g(triggerInitializeListener, "triggerInitializeListener");
        kotlin.jvm.internal.t.g(sendDiagnosticEvent, "sendDiagnosticEvent");
        kotlin.jvm.internal.t.g(diagnosticEventRepository, "diagnosticEventRepository");
        kotlin.jvm.internal.t.g(storageManager, "storageManager");
        kotlin.jvm.internal.t.g(legacyConfigurationReader, "legacyConfigurationReader");
        kotlin.jvm.internal.t.g(sdkPropertiesManager, "sdkPropertiesManager");
        kotlin.jvm.internal.t.g(getGameId, "getGameId");
        kotlin.jvm.internal.t.g(handleFocusCounters, "handleFocusCounters");
        this.defaultDispatcher = defaultDispatcher;
        this.initializeOM = initializeOM;
        this.getInitializeRequest = getInitializeRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.cleanAssets = cleanAssets;
        this.handleGatewayInitializationResponse = handleGatewayInitializationResponse;
        this.gatewayClient = gatewayClient;
        this.sessionRepository = sessionRepository;
        this.eventObservers = eventObservers;
        this.triggerInitializeListener = triggerInitializeListener;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.diagnosticEventRepository = diagnosticEventRepository;
        this.storageManager = storageManager;
        this.legacyConfigurationReader = legacyConfigurationReader;
        this.sdkPropertiesManager = sdkPropertiesManager;
        this.getGameId = getGameId;
        this.handleFocusCounters = handleFocusCounters;
    }

    public static final /* synthetic */ void access$checkCanInitialize(AndroidInitializeBoldSDK androidInitializeBoldSDK) {
        androidInitializeBoldSDK.checkCanInitialize();
    }

    public static final /* synthetic */ GatewayClient access$getGatewayClient$p(AndroidInitializeBoldSDK androidInitializeBoldSDK) {
        return androidInitializeBoldSDK.gatewayClient;
    }

    public static final /* synthetic */ GetInitializationRequest access$getGetInitializeRequest$p(AndroidInitializeBoldSDK androidInitializeBoldSDK) {
        return androidInitializeBoldSDK.getInitializeRequest;
    }

    public static final /* synthetic */ GetRequestPolicy access$getGetRequestPolicy$p(AndroidInitializeBoldSDK androidInitializeBoldSDK) {
        return androidInitializeBoldSDK.getRequestPolicy;
    }

    public static final /* synthetic */ SessionRepository access$getSessionRepository$p(AndroidInitializeBoldSDK androidInitializeBoldSDK) {
        return androidInitializeBoldSDK.sessionRepository;
    }

    public static final /* synthetic */ Object access$handleResponse(AndroidInitializeBoldSDK androidInitializeBoldSDK, UniversalResponseOuterClass.UniversalResponse universalResponse, e eVar) {
        return androidInitializeBoldSDK.handleResponse(universalResponse, eVar);
    }

    public static final /* synthetic */ void access$initializationFailure(AndroidInitializeBoldSDK androidInitializeBoldSDK, j jVar, InitializationException initializationException, String str, boolean z) {
        androidInitializeBoldSDK.initializationFailure(jVar, initializationException, str, z);
    }

    public static final /* synthetic */ Object access$initializationStart(AndroidInitializeBoldSDK androidInitializeBoldSDK, String str, boolean z, e eVar) {
        return androidInitializeBoldSDK.initializationStart(str, z, eVar);
    }

    public static final /* synthetic */ Object access$initializationSuccess(AndroidInitializeBoldSDK androidInitializeBoldSDK, j jVar, String str, boolean z, e eVar) {
        return androidInitializeBoldSDK.initializationSuccess(jVar, str, z, eVar);
    }

    private final void checkCanInitialize() {
        if (!this.sessionRepository.getShouldInitialize()) {
            throw new InitializationException("Gateway communication failure", null, "gateway", "!sessionRepository.shouldInitialize", 2, null);
        }
        String invoke = this.getGameId.invoke();
        if ((invoke != null ? A.p(invoke) : null) != null) {
            return;
        }
        throw new InitializationException("gameId \"" + invoke + "\" should be a number.", null, "invalid_game_id", invoke, 2, null);
    }

    private final Map getTags(InitializationException initializationException, String str, boolean z) {
        Map c = Q.c();
        c.put("operation", OperationType.INITIALIZATION.toString());
        c.put("reason", initializationException.getReason());
        c.put("source", str);
        c.put("is_retry", String.valueOf(z));
        if (initializationException.getReasonDebug() != null) {
            c.put("reason_debug", initializationException.getReasonDebug());
        }
        return Q.b(c);
    }

    private final Object handleResponse(UniversalResponseOuterClass.UniversalResponse universalResponse, e eVar) {
        if (universalResponse.hasError()) {
            this.sessionRepository.setShouldInitialize(false);
            throw new InitializationException("Gateway communication failure", null, "gateway", universalResponse.getError().getErrorText(), 2, null);
        }
        if (!universalResponse.hasPayload()) {
            throw new InitializationException("Gateway communication failure", null, "gateway", "No payload", 2, null);
        }
        if (!universalResponse.getPayload().hasInitializationResponse()) {
            throw new InitializationException("Gateway communication failure", null, "gateway", "No initialization response", 2, null);
        }
        HandleGatewayInitializationResponse handleGatewayInitializationResponse = this.handleGatewayInitializationResponse;
        InitializationResponseOuterClass.InitializationResponse initializationResponse = universalResponse.getPayload().getInitializationResponse();
        kotlin.jvm.internal.t.f(initializationResponse, "response.payload.initializationResponse");
        Object invoke = handleGatewayInitializationResponse.invoke(initializationResponse, eVar);
        return invoke == c.f() ? invoke : I.a;
    }

    private final void initializationFailure(j jVar, InitializationException initializationException, String str, boolean z) {
        DeviceLog.debug("Unity Ads Initialization Failure: " + initializationException.getMessage());
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_initialize_task_failure_time", Double.valueOf(TimeExtensionsKt.elapsedMillis(jVar)), getTags(initializationException, str, z), null, null, null, 56, null);
        this.sessionRepository.setInitializationState(InitializationState.FAILED);
        this.sdkPropertiesManager.setInitialized(false);
        this.triggerInitializeListener.error(UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, initializationException.getMessage());
        setupDiagnosticEvents();
    }

    private final Object initializationStart(String str, boolean z, e eVar) {
        DeviceLog.debug("Unity Ads Initialization Start");
        this.sdkPropertiesManager.setInitializationTime();
        this.sdkPropertiesManager.setInitializationTimeSinceEpoch();
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_initialization_started", null, S.l(x.a("source", str), x.a("is_retry", String.valueOf(z)), x.a("kotlin_version", Ca.j.f.toString())), null, null, null, 58, null);
        this.sessionRepository.setInitializationState(InitializationState.INITIALIZING);
        Object invoke = this.eventObservers.invoke(eVar);
        return invoke == c.f() ? invoke : I.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object initializationSuccess(ab.j r18, java.lang.String r19, boolean r20, Ga.e r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r21
            boolean r2 = r1 instanceof com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.initializationSuccess.1
            if (r2 == 0) goto L17
            r2 = r1
            com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$initializationSuccess$1 r2 = (com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.initializationSuccess.1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$initializationSuccess$1 r2 = new com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$initializationSuccess$1
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = Ha.c.f()
            int r4 = r2.label
            r5 = 3
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L50
            if (r4 == r7) goto L48
            if (r4 == r6) goto L40
            if (r4 != r5) goto L38
            java.lang.Object r2 = r2.L$0
            com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r2 = (com.unity3d.ads.core.domain.AndroidInitializeBoldSDK) r2
            Ca.t.b(r1)
            goto Lbb
        L38:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L40:
            java.lang.Object r4 = r2.L$0
            com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r4 = (com.unity3d.ads.core.domain.AndroidInitializeBoldSDK) r4
            Ca.t.b(r1)
            goto La8
        L48:
            java.lang.Object r4 = r2.L$0
            com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r4 = (com.unity3d.ads.core.domain.AndroidInitializeBoldSDK) r4
            Ca.t.b(r1)
            goto L9b
        L50:
            Ca.t.b(r1)
            java.lang.String r1 = "Unity Ads Initialization Success"
            com.unity3d.services.core.log.DeviceLog.debug(r1)
            com.unity3d.ads.core.domain.SendDiagnosticEvent r8 = r0.sendDiagnosticEvent
            double r9 = com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(r18)
            java.lang.Double r10 = Ia.b.b(r9)
            java.lang.String r1 = "source"
            r4 = r19
            Ca.q r1 = Ca.x.a(r1, r4)
            java.lang.String r4 = java.lang.String.valueOf(r20)
            java.lang.String r9 = "is_retry"
            Ca.q r4 = Ca.x.a(r9, r4)
            Ca.q[] r1 = new Ca.q[]{r1, r4}
            java.util.Map r11 = Da.S.l(r1)
            r15 = 56
            r16 = 0
            java.lang.String r9 = "native_initialize_task_success_time"
            r12 = 0
            r13 = 0
            r14 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            com.unity3d.ads.core.data.manager.StorageManager r1 = r0.storageManager
            r1.hasInitialized()
            com.unity3d.ads.core.domain.om.InitializeOMSDK r1 = r0.initializeOM
            r2.L$0 = r0
            r2.label = r7
            java.lang.Object r1 = r1.invoke(r2)
            if (r1 != r3) goto L9a
            return r3
        L9a:
            r4 = r0
        L9b:
            com.unity3d.ads.core.domain.CleanAssets r1 = r4.cleanAssets
            r2.L$0 = r4
            r2.label = r6
            java.lang.Object r1 = r1.invoke(r2)
            if (r1 != r3) goto La8
            return r3
        La8:
            com.unity3d.ads.core.domain.AndroidHandleFocusCounters r1 = r4.handleFocusCounters
            r1.invoke()
            com.unity3d.ads.core.data.repository.SessionRepository r1 = r4.sessionRepository
            r2.L$0 = r4
            r2.label = r5
            java.lang.Object r1 = r1.persistNativeConfiguration(r2)
            if (r1 != r3) goto Lba
            return r3
        Lba:
            r2 = r4
        Lbb:
            com.unity3d.services.core.configuration.ConfigurationReader r1 = r2.legacyConfigurationReader
            com.unity3d.services.core.configuration.Configuration r1 = r1.getCurrentConfiguration()
            r1.deleteFromDisk()
            com.unity3d.ads.core.data.repository.SessionRepository r1 = r2.sessionRepository
            com.unity3d.ads.core.data.model.InitializationState r3 = com.unity3d.ads.core.data.model.InitializationState.INITIALIZED
            r1.setInitializationState(r3)
            com.unity3d.ads.core.data.manager.SDKPropertiesManager r1 = r2.sdkPropertiesManager
            r1.setInitialized(r7)
            com.unity3d.ads.core.domain.TriggerInitializeListener r1 = r2.triggerInitializeListener
            r1.success()
            r2.setupDiagnosticEvents()
            Ca.I r1 = Ca.I.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.initializationSuccess(ab.j, java.lang.String, boolean, Ga.e):java.lang.Object");
    }

    private final void setupDiagnosticEvents() {
        NativeConfigurationOuterClass.DiagnosticEventsConfiguration config = this.sessionRepository.getNativeConfiguration().getDiagnosticEvents();
        DiagnosticEventRepository diagnosticEventRepository = this.diagnosticEventRepository;
        kotlin.jvm.internal.t.f(config, "config");
        diagnosticEventRepository.configure(config);
    }

    public Object invoke(String str, e eVar) {
        Object g = i.g(this.defaultDispatcher, new 2(str, null), eVar);
        return g == c.f() ? g : I.a;
    }
}
