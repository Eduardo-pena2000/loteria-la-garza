package com.unity3d.ads.core.domain;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import cb.O;
import cb.i;
import com.unity3d.ads.core.data.manager.TransactionEventManager;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.core.data.repository.SessionRepository;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidHandleGatewayInitializationResponse implements HandleGatewayInitializationResponse {
    private final HandleDebugSettings handleDebugSettings;
    private final O sdkScope;
    private final SessionRepository sessionRepository;
    private final TransactionEventManager transactionEventManager;
    private final TriggerInitializationCompletedRequest triggerInitializationCompletedRequest;

    @f(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse$invoke$2", f = "AndroidHandleGatewayInitializationResponse.kt", l = {38}, m = "invokeSuspend")
    public static final class 2 extends l implements p {
        int label;

        public 2(e eVar) {
            super(2, eVar);
        }

        public final e create(Object obj, e eVar) {
            return AndroidHandleGatewayInitializationResponse.this.new 2(eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((2) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                TriggerInitializationCompletedRequest access$getTriggerInitializationCompletedRequest$p = AndroidHandleGatewayInitializationResponse.access$getTriggerInitializationCompletedRequest$p(AndroidHandleGatewayInitializationResponse.this);
                this.label = 1;
                if (access$getTriggerInitializationCompletedRequest$p.invoke(this) == f) {
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

    public AndroidHandleGatewayInitializationResponse(TransactionEventManager transactionEventManager, TriggerInitializationCompletedRequest triggerInitializationCompletedRequest, SessionRepository sessionRepository, O sdkScope, HandleDebugSettings handleDebugSettings) {
        kotlin.jvm.internal.t.g(transactionEventManager, "transactionEventManager");
        kotlin.jvm.internal.t.g(triggerInitializationCompletedRequest, "triggerInitializationCompletedRequest");
        kotlin.jvm.internal.t.g(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.t.g(sdkScope, "sdkScope");
        kotlin.jvm.internal.t.g(handleDebugSettings, "handleDebugSettings");
        this.transactionEventManager = transactionEventManager;
        this.triggerInitializationCompletedRequest = triggerInitializationCompletedRequest;
        this.sessionRepository = sessionRepository;
        this.sdkScope = sdkScope;
        this.handleDebugSettings = handleDebugSettings;
    }

    public static final /* synthetic */ TriggerInitializationCompletedRequest access$getTriggerInitializationCompletedRequest$p(AndroidHandleGatewayInitializationResponse androidHandleGatewayInitializationResponse) {
        return androidHandleGatewayInitializationResponse.triggerInitializationCompletedRequest;
    }

    public Object invoke(InitializationResponseOuterClass.InitializationResponse initializationResponse, e eVar) {
        String universalRequestUrl;
        if (initializationResponse.hasError()) {
            String errorText = initializationResponse.getError().getErrorText();
            kotlin.jvm.internal.t.f(errorText, "response.error.errorText");
            throw new GatewayException(errorText, new IllegalStateException(initializationResponse.getError().getErrorText()), "gateway_initialization", initializationResponse.getError().getErrorText());
        }
        SessionRepository sessionRepository = this.sessionRepository;
        NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration = initializationResponse.getNativeConfiguration();
        kotlin.jvm.internal.t.f(nativeConfiguration, "response.nativeConfiguration");
        sessionRepository.setNativeConfiguration(nativeConfiguration);
        if (initializationResponse.hasUniversalRequestUrl() && (universalRequestUrl = initializationResponse.getUniversalRequestUrl()) != null && universalRequestUrl.length() != 0) {
            SessionRepository sessionRepository2 = this.sessionRepository;
            String universalRequestUrl2 = initializationResponse.getUniversalRequestUrl();
            kotlin.jvm.internal.t.f(universalRequestUrl2, "response.universalRequestUrl");
            sessionRepository2.setGatewayUrl(universalRequestUrl2);
        }
        List scarEligibleFormats = this.sessionRepository.getScarEligibleFormats();
        List scarEligibleFormatsList = initializationResponse.getScarEligibleFormatsList();
        kotlin.jvm.internal.t.f(scarEligibleFormatsList, "response.scarEligibleFormatsList");
        scarEligibleFormats.addAll(scarEligibleFormatsList);
        if (initializationResponse.getTriggerInitializationCompletedRequest()) {
            i.d(this.sdkScope, null, null, new 2(null), 3, null);
        }
        if (initializationResponse.getNativeConfiguration().getEnableIapEvent()) {
            this.transactionEventManager.invoke();
        }
        if (initializationResponse.getNativeConfiguration().hasDebugSettings()) {
            HandleDebugSettings handleDebugSettings = this.handleDebugSettings;
            NativeConfigurationOuterClass.DebugSettings debugSettings = initializationResponse.getNativeConfiguration().getDebugSettings();
            kotlin.jvm.internal.t.f(debugSettings, "response.nativeConfiguration.debugSettings");
            handleDebugSettings.invoke(debugSettings);
        }
        return I.a;
    }
}
