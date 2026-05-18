package com.unity3d.ads.core.data.repository;

import Ca.I;
import Ca.t;
import Ca.x;
import Da.Q;
import Ha.c;
import Ia.b;
import Ia.d;
import Ia.f;
import Ia.l;
import Qa.p;
import cb.K;
import cb.O;
import cb.i;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.unity3d.ads.core.data.datasource.AndroidUnityInfoDataSource;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.TokenCounters;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import fb.D;
import fb.F;
import fb.P;
import fb.e;
import fb.g;
import fb.y;
import fb.z;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.SessionCountersKt;
import gatewayprotocol.v1.SessionCountersOuterClass;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidSessionRepository implements SessionRepository {
    private final z _currentState;
    private z _gameId;
    private final z _gatewayUrl;
    private final z _headerBiddingTokenCounter;
    private final z _initializationState;
    private final z _isFirstInitAttempt;
    private final z _isTestModeEnabled;
    private y _onChange;
    private final z _sdkConfiguration;
    private final z _sessionCounters;
    private final z _sessionId;
    private final z _sessionToken;
    private final z _shouldInitialize;
    private final z _tokenCounters;
    private final ByteStringDataSource fsmDataSource;
    private final ByteStringDataSource gatewayCacheDataSource;
    private final z isInit;
    private final ByteStringDataSource nativeConfigDataSource;
    private final D onChange;
    private final e persistedNativeConfiguration;
    private final ByteStringDataSource privacyDataSource;
    private final List scarEligibleFormats;
    private final AndroidUnityInfoDataSource unityInfoDataSource;

    @f(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$1", f = "AndroidSessionRepository.kt", l = {44}, m = "invokeSuspend")
    public static final class 1 extends l implements p {
        final /* synthetic */ SendDiagnosticEvent $sendDiagnosticEvent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(SendDiagnosticEvent sendDiagnosticEvent, Ga.e eVar) {
            super(2, eVar);
            this.$sendDiagnosticEvent = sendDiagnosticEvent;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            return AndroidSessionRepository.this.new 1(this.$sendDiagnosticEvent, eVar);
        }

        public final Object invoke(O o, Ga.e eVar) {
            return ((1) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            try {
                if (i == 0) {
                    t.b(obj);
                    ByteStringDataSource access$getNativeConfigDataSource$p = AndroidSessionRepository.access$getNativeConfigDataSource$p(AndroidSessionRepository.this);
                    this.label = 1;
                    obj = access$getNativeConfigDataSource$p.get(this);
                    if (obj == f) {
                        return f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                ByteString data = ((ByteStringStoreOuterClass.ByteStringStore) obj).getData();
                if (!data.isEmpty()) {
                    z access$get_sdkConfiguration$p = AndroidSessionRepository.access$get_sdkConfiguration$p(AndroidSessionRepository.this);
                    NativeConfigurationOuterClass.NativeConfiguration parseFrom = NativeConfigurationOuterClass.NativeConfiguration.parseFrom(data);
                    kotlin.jvm.internal.t.f(parseFrom, "parseFrom(data)");
                    access$get_sdkConfiguration$p.setValue(parseFrom);
                }
            } catch (Exception e) {
                SendDiagnosticEvent sendDiagnosticEvent = this.$sendDiagnosticEvent;
                String message = e.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_initialize_missed_native_parsing", null, Q.f(x.a("debugReason", message)), null, null, null, 58, null);
            }
            AndroidSessionRepository.access$isInit$p(AndroidSessionRepository.this).setValue(b.a(true));
            return I.a;
        }
    }

    @f(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository", f = "AndroidSessionRepository.kt", l = {210}, m = "getGatewayCache")
    public static final class 1 extends d {
        int label;
        /* synthetic */ Object result;

        public 1(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidSessionRepository.this.getGatewayCache(this);
        }
    }

    @f(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository", f = "AndroidSessionRepository.kt", l = {213}, m = "getPrivacy")
    public static final class 1 extends d {
        int label;
        /* synthetic */ Object result;

        public 1(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidSessionRepository.this.getPrivacy(this);
        }
    }

    @f(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository", f = "AndroidSessionRepository.kt", l = {219}, m = "getPrivacyFsm")
    public static final class 1 extends d {
        int label;
        /* synthetic */ Object result;

        public 1(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidSessionRepository.this.getPrivacyFsm(this);
        }
    }

    @f(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository", f = "AndroidSessionRepository.kt", l = {215, 216}, m = "setPrivacy")
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
            return AndroidSessionRepository.this.setPrivacy(null, this);
        }
    }

    @f(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository", f = "AndroidSessionRepository.kt", l = {221, 222}, m = "setPrivacyFsm")
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
            return AndroidSessionRepository.this.setPrivacyFsm(null, this);
        }
    }

    public AndroidSessionRepository(ByteStringDataSource gatewayCacheDataSource, ByteStringDataSource privacyDataSource, ByteStringDataSource fsmDataSource, ByteStringDataSource nativeConfigDataSource, AndroidUnityInfoDataSource unityInfoDataSource, NativeConfigurationOuterClass.NativeConfiguration defaultNativeConfiguration, K dispatcher, SendDiagnosticEvent sendDiagnosticEvent) {
        kotlin.jvm.internal.t.g(gatewayCacheDataSource, "gatewayCacheDataSource");
        kotlin.jvm.internal.t.g(privacyDataSource, "privacyDataSource");
        kotlin.jvm.internal.t.g(fsmDataSource, "fsmDataSource");
        kotlin.jvm.internal.t.g(nativeConfigDataSource, "nativeConfigDataSource");
        kotlin.jvm.internal.t.g(unityInfoDataSource, "unityInfoDataSource");
        kotlin.jvm.internal.t.g(defaultNativeConfiguration, "defaultNativeConfiguration");
        kotlin.jvm.internal.t.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.t.g(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.gatewayCacheDataSource = gatewayCacheDataSource;
        this.privacyDataSource = privacyDataSource;
        this.fsmDataSource = fsmDataSource;
        this.nativeConfigDataSource = nativeConfigDataSource;
        this.unityInfoDataSource = unityInfoDataSource;
        z a = P.a(defaultNativeConfiguration);
        this._sdkConfiguration = a;
        z a2 = P.a(Boolean.FALSE);
        this.isInit = a2;
        i.d(cb.P.a(dispatcher), null, null, new 1(sendDiagnosticEvent, null), 3, null);
        this.persistedNativeConfiguration = new AndroidSessionRepository$special$$inlined$map$1(new AndroidSessionRepository$special$$inlined$filter$1(g.w(a, a2, new AndroidSessionRepository$persistedNativeConfiguration$1(null))));
        this.scarEligibleFormats = new ArrayList();
        y b = F.b(0, 0, null, 7, null);
        this._onChange = b;
        this.onChange = g.a(b);
        String gameId = ClientProperties.getGameId();
        this._gameId = P.a(gameId != null ? gameId : null);
        UUID randomUUID = UUID.randomUUID();
        kotlin.jvm.internal.t.f(randomUUID, "randomUUID()");
        this._sessionId = P.a(ProtobufExtensionsKt.toByteString(randomUUID));
        this._isTestModeEnabled = P.a(Boolean.valueOf(SdkProperties.isTestMode()));
        GeneratedMessageLite build = SessionCountersOuterClass.SessionCounters.newBuilder().build();
        kotlin.jvm.internal.t.f(build, "newBuilder().build()");
        this._sessionCounters = P.a(build);
        this._tokenCounters = P.a(new TokenCounters(0, 0, 0));
        ByteString EMPTY = ByteString.EMPTY;
        kotlin.jvm.internal.t.f(EMPTY, "EMPTY");
        this._sessionToken = P.a(EMPTY);
        kotlin.jvm.internal.t.f(EMPTY, "EMPTY");
        this._currentState = P.a(EMPTY);
        this._gatewayUrl = P.a("https://gateway.unityads.unity3d.com/v1");
        this._initializationState = P.a(InitializationState.NOT_INITIALIZED);
        this._headerBiddingTokenCounter = P.a(0);
        Boolean bool = Boolean.TRUE;
        this._shouldInitialize = P.a(bool);
        this._isFirstInitAttempt = P.a(bool);
    }

    public static final /* synthetic */ ByteStringDataSource access$getNativeConfigDataSource$p(AndroidSessionRepository androidSessionRepository) {
        return androidSessionRepository.nativeConfigDataSource;
    }

    public static final /* synthetic */ e access$getPersistedNativeConfiguration$p(AndroidSessionRepository androidSessionRepository) {
        return androidSessionRepository.persistedNativeConfiguration;
    }

    public static final /* synthetic */ z access$get_sdkConfiguration$p(AndroidSessionRepository androidSessionRepository) {
        return androidSessionRepository._sdkConfiguration;
    }

    public static final /* synthetic */ z access$isInit$p(AndroidSessionRepository androidSessionRepository) {
        return androidSessionRepository.isInit;
    }

    public void addTimeToGlobalAdsFocusTime(int i) {
        Object value;
        SessionCountersKt.Dsl _create;
        z zVar = this._sessionCounters;
        do {
            value = zVar.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
            GeneratedMessageLite.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            kotlin.jvm.internal.t.f(builder, "this.toBuilder()");
            _create = companion._create((SessionCountersOuterClass.SessionCounters.Builder) builder);
            _create.setGlobalAdsFocusTime(_create.getGlobalAdsFocusTime() + i);
        } while (!zVar.e(value, _create._build()));
    }

    public NativeConfigurationOuterClass.FeatureFlags getFeatureFlags() {
        NativeConfigurationOuterClass.FeatureFlags featureFlags = getNativeConfiguration().getFeatureFlags();
        kotlin.jvm.internal.t.f(featureFlags, "nativeConfiguration.featureFlags");
        return featureFlags;
    }

    public String getGameId() {
        Object value;
        String gameId;
        z zVar = this._gameId;
        do {
            value = zVar.getValue();
            gameId = ClientProperties.getGameId();
            if (gameId == null) {
                gameId = null;
            }
        } while (!zVar.e(value, gameId));
        return gameId;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object getGatewayCache(Ga.e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository.getGatewayCache.1
            if (r0 == 0) goto L13
            r0 = r5
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$getGatewayCache$1 r0 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository.getGatewayCache.1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$getGatewayCache$1 r0 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$getGatewayCache$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Ca.t.b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            Ca.t.b(r5)
            com.unity3d.ads.core.data.datasource.ByteStringDataSource r5 = r4.gatewayCacheDataSource
            r0.label = r3
            java.lang.Object r5 = r5.get(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore r5 = (com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) r5
            com.google.protobuf.ByteString r5 = r5.getData()
            java.lang.String r0 = "gatewayCacheDataSource.get().data"
            kotlin.jvm.internal.t.f(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidSessionRepository.getGatewayCache(Ga.e):java.lang.Object");
    }

    public ByteString getGatewayState() {
        return (ByteString) this._currentState.getValue();
    }

    public String getGatewayUrl() {
        return (String) this._gatewayUrl.getValue();
    }

    public int getHeaderBiddingTokenCounter() {
        Object value;
        Number number;
        z zVar = this._headerBiddingTokenCounter;
        do {
            value = zVar.getValue();
            number = (Number) value;
        } while (!zVar.e(value, Integer.valueOf(number.intValue() + 1)));
        return number.intValue();
    }

    public InitializationState getInitializationState() {
        return (InitializationState) this._initializationState.getValue();
    }

    public NativeConfigurationOuterClass.NativeConfiguration getNativeConfiguration() {
        return !((Boolean) this.isInit.getValue()).booleanValue() ? (NativeConfigurationOuterClass.NativeConfiguration) i.f(null, new AndroidSessionRepository$nativeConfiguration$1(this, null), 1, null) : (NativeConfigurationOuterClass.NativeConfiguration) this._sdkConfiguration.getValue();
    }

    public e getObserveInitializationState() {
        return this._initializationState;
    }

    public D getOnChange() {
        return this.onChange;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object getPrivacy(Ga.e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository.getPrivacy.1
            if (r0 == 0) goto L13
            r0 = r5
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacy$1 r0 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository.getPrivacy.1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacy$1 r0 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacy$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Ca.t.b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            Ca.t.b(r5)
            com.unity3d.ads.core.data.datasource.ByteStringDataSource r5 = r4.privacyDataSource
            r0.label = r3
            java.lang.Object r5 = r5.get(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore r5 = (com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) r5
            com.google.protobuf.ByteString r5 = r5.getData()
            java.lang.String r0 = "privacyDataSource.get().data"
            kotlin.jvm.internal.t.f(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidSessionRepository.getPrivacy(Ga.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object getPrivacyFsm(Ga.e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository.getPrivacyFsm.1
            if (r0 == 0) goto L13
            r0 = r5
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacyFsm$1 r0 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository.getPrivacyFsm.1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacyFsm$1 r0 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacyFsm$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Ca.t.b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            Ca.t.b(r5)
            com.unity3d.ads.core.data.datasource.ByteStringDataSource r5 = r4.fsmDataSource
            r0.label = r3
            java.lang.Object r5 = r5.get(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore r5 = (com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) r5
            com.google.protobuf.ByteString r5 = r5.getData()
            java.lang.String r0 = "fsmDataSource.get().data"
            kotlin.jvm.internal.t.f(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidSessionRepository.getPrivacyFsm(Ga.e):java.lang.Object");
    }

    public List getScarEligibleFormats() {
        return this.scarEligibleFormats;
    }

    public SessionCountersOuterClass.SessionCounters getSessionCounters() {
        return (SessionCountersOuterClass.SessionCounters) this._sessionCounters.getValue();
    }

    public ByteString getSessionId() {
        return (ByteString) this._sessionId.getValue();
    }

    public ByteString getSessionToken() {
        return (ByteString) this._sessionToken.getValue();
    }

    public boolean getShouldInitialize() {
        return ((Boolean) this._shouldInitialize.getValue()).booleanValue();
    }

    public TokenCounters getTokenCounters() {
        return (TokenCounters) this._tokenCounters.getValue();
    }

    public String getUnityInstallationId() {
        return this.unityInfoDataSource.getUnityInstallationId();
    }

    public String getUnityMegaSessionId() {
        return this.unityInfoDataSource.getUnityMegaSessionId();
    }

    public void incrementBannerImpressionCount() {
        Object value;
        SessionCountersKt.Dsl _create;
        z zVar = this._sessionCounters;
        do {
            value = zVar.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
            GeneratedMessageLite.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            kotlin.jvm.internal.t.f(builder, "this.toBuilder()");
            _create = companion._create((SessionCountersOuterClass.SessionCounters.Builder) builder);
            _create.setBannerImpressions(_create.getBannerImpressions() + 1);
        } while (!zVar.e(value, _create._build()));
    }

    public void incrementBannerLoadRequestAdmCount() {
        Object value;
        SessionCountersKt.Dsl _create;
        z zVar = this._sessionCounters;
        do {
            value = zVar.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
            GeneratedMessageLite.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            kotlin.jvm.internal.t.f(builder, "this.toBuilder()");
            _create = companion._create((SessionCountersOuterClass.SessionCounters.Builder) builder);
            _create.setBannerRequestsAdm(_create.getBannerRequestsAdm() + 1);
        } while (!zVar.e(value, _create._build()));
    }

    public void incrementBannerLoadRequestCount() {
        Object value;
        SessionCountersKt.Dsl _create;
        z zVar = this._sessionCounters;
        do {
            value = zVar.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
            GeneratedMessageLite.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            kotlin.jvm.internal.t.f(builder, "this.toBuilder()");
            _create = companion._create((SessionCountersOuterClass.SessionCounters.Builder) builder);
            _create.setBannerLoadRequests(_create.getBannerLoadRequests() + 1);
        } while (!zVar.e(value, _create._build()));
    }

    public void incrementFocusChangeCount() {
        Object value;
        SessionCountersKt.Dsl _create;
        z zVar = this._sessionCounters;
        do {
            value = zVar.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
            GeneratedMessageLite.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            kotlin.jvm.internal.t.f(builder, "this.toBuilder()");
            _create = companion._create((SessionCountersOuterClass.SessionCounters.Builder) builder);
            _create.setFocusChangeCount(_create.getFocusChangeCount() + 1);
        } while (!zVar.e(value, _create._build()));
    }

    public void incrementGlobalAdsFocusChangeCount() {
        Object value;
        SessionCountersKt.Dsl _create;
        z zVar = this._sessionCounters;
        do {
            value = zVar.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
            GeneratedMessageLite.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            kotlin.jvm.internal.t.f(builder, "this.toBuilder()");
            _create = companion._create((SessionCountersOuterClass.SessionCounters.Builder) builder);
            _create.setGlobalAdsFocusChangeCount(_create.getGlobalAdsFocusChangeCount() + 1);
        } while (!zVar.e(value, _create._build()));
    }

    public void incrementLoadRequestAdmCount() {
        Object value;
        SessionCountersKt.Dsl _create;
        z zVar = this._sessionCounters;
        do {
            value = zVar.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
            GeneratedMessageLite.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            kotlin.jvm.internal.t.f(builder, "this.toBuilder()");
            _create = companion._create((SessionCountersOuterClass.SessionCounters.Builder) builder);
            _create.setLoadRequestsAdm(_create.getLoadRequestsAdm() + 1);
        } while (!zVar.e(value, _create._build()));
    }

    public void incrementLoadRequestCount() {
        Object value;
        SessionCountersKt.Dsl _create;
        z zVar = this._sessionCounters;
        do {
            value = zVar.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
            GeneratedMessageLite.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            kotlin.jvm.internal.t.f(builder, "this.toBuilder()");
            _create = companion._create((SessionCountersOuterClass.SessionCounters.Builder) builder);
            _create.setLoadRequests(_create.getLoadRequests() + 1);
        } while (!zVar.e(value, _create._build()));
    }

    public void incrementTokenSequenceNumber() {
        Object value;
        TokenCounters tokenCounters;
        z zVar = this._tokenCounters;
        do {
            value = zVar.getValue();
            tokenCounters = (TokenCounters) value;
        } while (!zVar.e(value, TokenCounters.copy$default(tokenCounters, tokenCounters.getSeq() + 1, 0, 0, 6, null)));
    }

    public void incrementTokenStartsCount() {
        Object value;
        TokenCounters tokenCounters;
        z zVar = this._tokenCounters;
        do {
            value = zVar.getValue();
            tokenCounters = (TokenCounters) value;
        } while (!zVar.e(value, TokenCounters.copy$default(tokenCounters, 0, 0, tokenCounters.getStarts() + 1, 3, null)));
    }

    public void incrementTokenWinsCount() {
        Object value;
        TokenCounters tokenCounters;
        z zVar = this._tokenCounters;
        do {
            value = zVar.getValue();
            tokenCounters = (TokenCounters) value;
        } while (!zVar.e(value, TokenCounters.copy$default(tokenCounters, 0, tokenCounters.getWins() + 1, 0, 5, null)));
    }

    public boolean isDiagnosticsEnabled() {
        return getNativeConfiguration().getDiagnosticEvents().getEnabled();
    }

    public boolean isFirstInitAttempt() {
        Object value;
        Boolean bool;
        z zVar = this._isFirstInitAttempt;
        do {
            value = zVar.getValue();
            bool = (Boolean) value;
            bool.booleanValue();
        } while (!zVar.e(value, Boolean.FALSE));
        return bool.booleanValue();
    }

    public boolean isOmEnabled() {
        return getNativeConfiguration().getEnableOm();
    }

    public boolean isSdkInitialized() {
        return getInitializationState() == InitializationState.INITIALIZED;
    }

    public boolean isTestModeEnabled() {
        Object value;
        boolean isTestMode;
        z zVar = this._isTestModeEnabled;
        do {
            value = zVar.getValue();
            ((Boolean) value).booleanValue();
            isTestMode = SdkProperties.isTestMode();
        } while (!zVar.e(value, Boolean.valueOf(isTestMode)));
        return isTestMode;
    }

    public Object persistNativeConfiguration(Ga.e eVar) {
        ByteStringDataSource byteStringDataSource = this.nativeConfigDataSource;
        ByteString byteString = getNativeConfiguration().toByteString();
        kotlin.jvm.internal.t.f(byteString, "nativeConfiguration.toByteString()");
        Object obj = byteStringDataSource.set(byteString, eVar);
        return obj == c.f() ? obj : I.a;
    }

    public void resetTokenCounters() {
        Object value;
        z zVar = this._tokenCounters;
        do {
            value = zVar.getValue();
        } while (!zVar.e(value, new TokenCounters(0, 0, 0)));
    }

    public void setGameId(String str) {
        Object value;
        z zVar = this._gameId;
        do {
            value = zVar.getValue();
            ClientProperties.setGameId(str);
        } while (!zVar.e(value, str));
    }

    public Object setGatewayCache(ByteString byteString, Ga.e eVar) {
        Object obj = this.gatewayCacheDataSource.set(byteString, eVar);
        return obj == c.f() ? obj : I.a;
    }

    public void setGatewayState(ByteString value) {
        Object value2;
        kotlin.jvm.internal.t.g(value, "value");
        z zVar = this._currentState;
        do {
            value2 = zVar.getValue();
        } while (!zVar.e(value2, value));
    }

    public void setGatewayUrl(String value) {
        Object value2;
        kotlin.jvm.internal.t.g(value, "value");
        z zVar = this._gatewayUrl;
        do {
            value2 = zVar.getValue();
        } while (!zVar.e(value2, value));
    }

    public void setInitializationState(InitializationState value) {
        Object value2;
        kotlin.jvm.internal.t.g(value, "value");
        z zVar = this._initializationState;
        do {
            value2 = zVar.getValue();
        } while (!zVar.e(value2, value));
    }

    public void setNativeConfiguration(NativeConfigurationOuterClass.NativeConfiguration value) {
        Object value2;
        kotlin.jvm.internal.t.g(value, "value");
        z zVar = this._sdkConfiguration;
        do {
            value2 = zVar.getValue();
        } while (!zVar.e(value2, value));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object setPrivacy(com.google.protobuf.ByteString r6, Ga.e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository.setPrivacy.1
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacy$1 r0 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository.setPrivacy.1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacy$1 r0 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacy$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            Ca.t.b(r7)
            goto L68
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.L$1
            com.google.protobuf.ByteString r6 = (com.google.protobuf.ByteString) r6
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.core.data.repository.AndroidSessionRepository r2 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository) r2
            Ca.t.b(r7)
            goto L53
        L40:
            Ca.t.b(r7)
            com.unity3d.ads.core.data.datasource.ByteStringDataSource r7 = r5.privacyDataSource
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r7.set(r6, r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            r2 = r5
        L53:
            fb.y r7 = r2._onChange
            com.unity3d.ads.core.data.model.SessionChange$UserConsentChange r2 = new com.unity3d.ads.core.data.model.SessionChange$UserConsentChange
            r2.<init>(r6)
            r6 = 0
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r6 = r7.emit(r2, r0)
            if (r6 != r1) goto L68
            return r1
        L68:
            Ca.I r6 = Ca.I.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidSessionRepository.setPrivacy(com.google.protobuf.ByteString, Ga.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object setPrivacyFsm(com.google.protobuf.ByteString r6, Ga.e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository.setPrivacyFsm.1
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacyFsm$1 r0 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository.setPrivacyFsm.1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacyFsm$1 r0 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacyFsm$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            Ca.t.b(r7)
            goto L68
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.L$1
            com.google.protobuf.ByteString r6 = (com.google.protobuf.ByteString) r6
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.core.data.repository.AndroidSessionRepository r2 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository) r2
            Ca.t.b(r7)
            goto L53
        L40:
            Ca.t.b(r7)
            com.unity3d.ads.core.data.datasource.ByteStringDataSource r7 = r5.fsmDataSource
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r7.set(r6, r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            r2 = r5
        L53:
            fb.y r7 = r2._onChange
            com.unity3d.ads.core.data.model.SessionChange$PrivacyFsmChange r2 = new com.unity3d.ads.core.data.model.SessionChange$PrivacyFsmChange
            r2.<init>(r6)
            r6 = 0
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r6 = r7.emit(r2, r0)
            if (r6 != r1) goto L68
            return r1
        L68:
            Ca.I r6 = Ca.I.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidSessionRepository.setPrivacyFsm(com.google.protobuf.ByteString, Ga.e):java.lang.Object");
    }

    public void setSessionCounters(SessionCountersOuterClass.SessionCounters value) {
        Object value2;
        kotlin.jvm.internal.t.g(value, "value");
        z zVar = this._sessionCounters;
        do {
            value2 = zVar.getValue();
        } while (!zVar.e(value2, value));
    }

    public void setSessionToken(ByteString value) {
        Object value2;
        kotlin.jvm.internal.t.g(value, "value");
        z zVar = this._sessionToken;
        do {
            value2 = zVar.getValue();
        } while (!zVar.e(value2, value));
    }

    public void setShouldInitialize(boolean z) {
        Object value;
        z zVar = this._shouldInitialize;
        do {
            value = zVar.getValue();
            ((Boolean) value).booleanValue();
        } while (!zVar.e(value, Boolean.valueOf(z)));
    }

    public void setTokenCounters(TokenCounters value) {
        Object value2;
        kotlin.jvm.internal.t.g(value, "value");
        z zVar = this._tokenCounters;
        do {
            value2 = zVar.getValue();
        } while (!zVar.e(value2, value));
    }
}
