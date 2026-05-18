package com.unity3d.services.core.di;

import Qa.a;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import cb.A;
import cb.B0;
import cb.E0;
import cb.K;
import cb.L;
import cb.N;
import cb.O;
import cb.P;
import cb.W0;
import cb.e0;
import com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.model.ByteStringSerializer;
import com.unity3d.ads.core.data.model.UniversalRequestStoreSerializer;
import com.unity3d.ads.core.data.model.WebViewConfigurationStoreSerializer;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.extensions.ContextExtensionsKt;
import com.unity3d.services.ads.measurements.MeasurementsService;
import com.unity3d.services.ads.token.AsyncTokenStorage;
import com.unity3d.services.ads.token.InMemoryAsyncTokenStorage;
import com.unity3d.services.ads.token.TokenStorage;
import com.unity3d.services.ads.topics.TopicsService;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.device.VolumeChange;
import com.unity3d.services.core.device.VolumeChangeMonitor;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.domain.SDKDispatchers;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.request.metrics.SDKMetrics;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import gatewayprotocol.v1.AdOperationsConfigurationKt;
import gatewayprotocol.v1.DiagnosticEventsConfigurationKt;
import gatewayprotocol.v1.FeatureFlagsKt;
import gatewayprotocol.v1.NativeConfigurationKt;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.RequestPolicyKt;
import gatewayprotocol.v1.RequestRetryPolicyKt;
import gatewayprotocol.v1.RequestTimeoutPolicyKt;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import o2.g;
import o2.i;
import o2.j;
import p2.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class UnityAdsModule {

    public static final class 1 extends u implements a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(Context context) {
            super(0);
            this.$context = context;
        }

        public final File invoke() {
            return ContextExtensionsKt.unityAdsDataStoreFile(this.$context, "glinfo.pb");
        }
    }

    public static final class 1 extends u implements a {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $dataStoreFile;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(Context context, String str) {
            super(0);
            this.$context = context;
            this.$dataStoreFile = str;
        }

        public final File invoke() {
            return ContextExtensionsKt.unityAdsDataStoreFile(this.$context, this.$dataStoreFile);
        }
    }

    public static final class 1 extends u implements a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(Context context) {
            super(0);
            this.$context = context;
        }

        public final File invoke() {
            return ContextExtensionsKt.unityAdsDataStoreFile(this.$context, "universal_request.pb");
        }
    }

    public static final class 1 extends u implements a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(Context context) {
            super(0);
            this.$context = context;
        }

        public final File invoke() {
            return ContextExtensionsKt.unityAdsDataStoreFile(this.$context, "webview_config.pb");
        }
    }

    private final NativeConfigurationOuterClass.AdOperationsConfiguration getDefaultAdOperations() {
        AdOperationsConfigurationKt.Dsl.Companion companion = AdOperationsConfigurationKt.Dsl.Companion;
        NativeConfigurationOuterClass.AdOperationsConfiguration.Builder newBuilder = NativeConfigurationOuterClass.AdOperationsConfiguration.newBuilder();
        t.f(newBuilder, "newBuilder()");
        AdOperationsConfigurationKt.Dsl _create = companion._create(newBuilder);
        _create.setLoadTimeoutMs(30000);
        _create.setShowTimeoutMs(10000);
        _create.setGetTokenTimeoutMs(750);
        return _create._build();
    }

    private final NativeConfigurationOuterClass.RequestPolicy getDefaultRequestPolicy() {
        RequestPolicyKt.Dsl.Companion companion = RequestPolicyKt.Dsl.Companion;
        NativeConfigurationOuterClass.RequestPolicy.Builder newBuilder = NativeConfigurationOuterClass.RequestPolicy.newBuilder();
        t.f(newBuilder, "newBuilder()");
        RequestPolicyKt.Dsl _create = companion._create(newBuilder);
        _create.setRetryPolicy(getDefaultRequestRetryPolicy());
        _create.setTimeoutPolicy(getDefaultRequestTimeoutPolicy());
        return _create._build();
    }

    private final NativeConfigurationOuterClass.RequestRetryPolicy getDefaultRequestRetryPolicy() {
        RequestRetryPolicyKt.Dsl.Companion companion = RequestRetryPolicyKt.Dsl.Companion;
        NativeConfigurationOuterClass.RequestRetryPolicy.Builder newBuilder = NativeConfigurationOuterClass.RequestRetryPolicy.newBuilder();
        t.f(newBuilder, "newBuilder()");
        RequestRetryPolicyKt.Dsl _create = companion._create(newBuilder);
        _create.setMaxDuration(120000);
        _create.setRetryWaitBase(500);
        _create.setRetryJitterPct(0.1f);
        _create.setShouldStoreLocally(false);
        _create.setRetryMaxInterval(2500);
        _create.setRetryScalingFactor(2.0f);
        return _create._build();
    }

    private final NativeConfigurationOuterClass.RequestTimeoutPolicy getDefaultRequestTimeoutPolicy() {
        RequestTimeoutPolicyKt.Dsl.Companion companion = RequestTimeoutPolicyKt.Dsl.Companion;
        NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder newBuilder = NativeConfigurationOuterClass.RequestTimeoutPolicy.newBuilder();
        t.f(newBuilder, "newBuilder()");
        RequestTimeoutPolicyKt.Dsl _create = companion._create(newBuilder);
        _create.setConnectTimeoutMs(30000);
        _create.setReadTimeoutMs(30000);
        _create.setWriteTimeoutMs(30000);
        _create.setOverallTimeoutMs(30000);
        return _create._build();
    }

    private final ByteStringDataSource provideByteStringDataSource(i iVar) {
        return new AndroidByteStringDataSource(iVar);
    }

    private final i provideByteStringDataStore(Context context, K k, String str) {
        return j.c(j.a, new ByteStringSerializer(), (b) null, (List) null, P.a(k.plus(W0.b(null, 1, null))), new 1(context, str), 4, (Object) null);
    }

    private final JsonStorage provideJsonStorage(StorageManager.StorageType storageType) {
        if (!StorageManager.init(ClientProperties.getApplicationContext())) {
            throw new IllegalStateException("StorageManager failed to initialize");
        }
        Storage storage = StorageManager.getStorage(storageType);
        t.f(storage, "getStorage(storageType)");
        return storage;
    }

    public final Context androidContext() {
        Context applicationContext = ClientProperties.getApplicationContext();
        t.f(applicationContext, "getApplicationContext()");
        return applicationContext;
    }

    public final AsyncTokenStorage asyncTokenStorage(TokenStorage tokenStorage, SDKMetricsSender sdkMetricsSender) {
        t.g(tokenStorage, "tokenStorage");
        t.g(sdkMetricsSender, "sdkMetricsSender");
        return new InMemoryAsyncTokenStorage(null, new Handler(Looper.getMainLooper()), sdkMetricsSender, tokenStorage);
    }

    public final ByteStringDataSource auidDataStore(i dataStore) {
        t.g(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final K defaultDispatcher() {
        return e0.a();
    }

    public final NativeConfigurationOuterClass.NativeConfiguration defaultNativeConfiguration() {
        NativeConfigurationKt.Dsl.Companion companion = NativeConfigurationKt.Dsl.Companion;
        NativeConfigurationOuterClass.NativeConfiguration.Builder newBuilder = NativeConfigurationOuterClass.NativeConfiguration.newBuilder();
        t.f(newBuilder, "newBuilder()");
        NativeConfigurationKt.Dsl _create = companion._create(newBuilder);
        _create.setAdOperations(getDefaultAdOperations());
        _create.setInitPolicy(getDefaultRequestPolicy());
        _create.setAdPolicy(getDefaultRequestPolicy());
        _create.setOtherPolicy(getDefaultRequestPolicy());
        _create.setOperativeEventPolicy(getDefaultRequestPolicy());
        DiagnosticEventsConfigurationKt.Dsl.Companion companion2 = DiagnosticEventsConfigurationKt.Dsl.Companion;
        NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder newBuilder2 = NativeConfigurationOuterClass.DiagnosticEventsConfiguration.newBuilder();
        t.f(newBuilder2, "newBuilder()");
        DiagnosticEventsConfigurationKt.Dsl _create2 = companion2._create(newBuilder2);
        _create2.setEnabled(true);
        _create2.setMaxBatchSize(10);
        _create2.setMaxBatchIntervalMs(30000);
        _create2.setTtmEnabled(false);
        _create.setDiagnosticEvents(_create2._build());
        FeatureFlagsKt.Dsl.Companion companion3 = FeatureFlagsKt.Dsl.Companion;
        NativeConfigurationOuterClass.FeatureFlags.Builder newBuilder3 = NativeConfigurationOuterClass.FeatureFlags.newBuilder();
        t.f(newBuilder3, "newBuilder()");
        FeatureFlagsKt.Dsl _create3 = companion3._create(newBuilder3);
        _create3.setBoldSdkNextSessionEnabled(true);
        _create.setFeatureFlags(_create3._build());
        return _create._build();
    }

    public final ByteStringDataSource gatewayCacheDataStore(i dataStore) {
        t.g(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final i gatewayDataStore(Context context, K dispatcher) {
        t.g(context, "context");
        t.g(dispatcher, "dispatcher");
        return provideByteStringDataStore(context, dispatcher, "gateway_cache.pb");
    }

    public final O getTokenCoroutineScope(ISDKDispatchers dispatchers, L errorHandler, B0 parentJob) {
        t.g(dispatchers, "dispatchers");
        t.g(errorHandler, "errorHandler");
        t.g(parentJob, "parentJob");
        return P.a(parentJob.plus(dispatchers.getDefault()).plus(new N("get_token_scope")).plus(errorHandler));
    }

    public final i glInfoDataStore(Context context, K dispatcher, g fetchGLInfo) {
        t.g(context, "context");
        t.g(dispatcher, "dispatcher");
        t.g(fetchGLInfo, "fetchGLInfo");
        return j.c(j.a, new ByteStringSerializer(), (b) null, Da.u.e(fetchGLInfo), P.a(dispatcher.plus(W0.b(null, 1, null))), new 1(context), 2, (Object) null);
    }

    public final i iapTransactionDataStore(Context context, K dispatcher) {
        t.g(context, "context");
        t.g(dispatcher, "dispatcher");
        return provideByteStringDataStore(context, dispatcher, "iap_transaction.pb");
    }

    public final ByteStringDataSource idfiDataStore(i dataStore) {
        t.g(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final O initCoroutineScope(ISDKDispatchers dispatchers, L errorHandler, B0 parentJob) {
        t.g(dispatchers, "dispatchers");
        t.g(errorHandler, "errorHandler");
        t.g(parentJob, "parentJob");
        return P.a(parentJob.plus(dispatchers.getDefault()).plus(new N("init_scope")).plus(errorHandler));
    }

    public final K ioDispatcher() {
        return e0.b();
    }

    public final O loadCoroutineScope(ISDKDispatchers dispatchers, L errorHandler, B0 parentJob) {
        t.g(dispatchers, "dispatchers");
        t.g(errorHandler, "errorHandler");
        t.g(parentJob, "parentJob");
        return P.a(parentJob.plus(dispatchers.getDefault()).plus(new N("load_scope")).plus(errorHandler));
    }

    public final K mainDispatcher() {
        return e0.c();
    }

    public final MeasurementsService measurementService(Context context, ISDKDispatchers dispatchers) {
        t.g(context, "context");
        t.g(dispatchers, "dispatchers");
        return new MeasurementsService(context, dispatchers, SharedInstances.INSTANCE.getWebViewEventSender());
    }

    public final JsonStorage memoryJsonStorage() {
        return provideJsonStorage(StorageManager.StorageType.MEMORY);
    }

    public final i nativeConfigurationDataStore(Context context, K dispatcher) {
        t.g(context, "context");
        t.g(dispatcher, "dispatcher");
        return provideByteStringDataStore(context, dispatcher, "native_configuration.pb");
    }

    public final O offerwallSignalsCoroutineScope(ISDKDispatchers dispatchers, L errorHandler, B0 parentJob) {
        t.g(dispatchers, "dispatchers");
        t.g(errorHandler, "errorHandler");
        t.g(parentJob, "parentJob");
        return P.a(parentJob.plus(dispatchers.getDefault()).plus(new N("offerwall_scope")).plus(errorHandler));
    }

    public final O omidCoroutineScope(ISDKDispatchers dispatchers, L errorHandler, B0 parentJob) {
        t.g(dispatchers, "dispatchers");
        t.g(errorHandler, "errorHandler");
        t.g(parentJob, "parentJob");
        return P.a(parentJob.plus(dispatchers.getDefault()).plus(new N("omid_scope")).plus(errorHandler));
    }

    public final i privacyDataStore(Context context, K dispatcher) {
        t.g(context, "context");
        t.g(dispatcher, "dispatcher");
        return provideByteStringDataStore(context, dispatcher, "privacy.pb");
    }

    public final i privacyFsmDataStore(Context context, K dispatcher) {
        t.g(context, "context");
        t.g(dispatcher, "dispatcher");
        return provideByteStringDataStore(context, dispatcher, "privacy_fsm.pb");
    }

    public final JsonStorage privateJsonStorage() {
        return provideJsonStorage(StorageManager.StorageType.PRIVATE);
    }

    public final B0 publicApiJob(DiagnosticEventRepository diagnosticEventRepository) {
        t.g(diagnosticEventRepository, "diagnosticEventRepository");
        A b = E0.b(null, 1, null);
        b.invokeOnCompletion(new UnityAdsModule$publicApiJob$1$1(diagnosticEventRepository));
        return b;
    }

    public final JsonStorage publicJsonStorage() {
        return provideJsonStorage(StorageManager.StorageType.PUBLIC);
    }

    public final O scarSignalsCoroutineScope(ISDKDispatchers dispatchers, L errorHandler, B0 parentJob) {
        t.g(dispatchers, "dispatchers");
        t.g(errorHandler, "errorHandler");
        t.g(parentJob, "parentJob");
        return P.a(parentJob.plus(dispatchers.getDefault()).plus(new N("scar_scope")).plus(errorHandler));
    }

    public final ISDKDispatchers sdkDispatchers() {
        return new SDKDispatchers();
    }

    public final SDKMetricsSender sdkMetrics() {
        SDKMetricsSender sDKMetrics = SDKMetrics.getInstance();
        t.f(sDKMetrics, "getInstance()");
        return sDKMetrics;
    }

    public final O showCoroutineScope(ISDKDispatchers dispatchers, L errorHandler, B0 parentJob) {
        t.g(dispatchers, "dispatchers");
        t.g(errorHandler, "errorHandler");
        t.g(parentJob, "parentJob");
        return P.a(parentJob.plus(dispatchers.getDefault()).plus(new N("show_scope")).plus(errorHandler));
    }

    public final TopicsService topicsService(Context context, ISDKDispatchers dispatchers) {
        t.g(context, "context");
        t.g(dispatchers, "dispatchers");
        return new TopicsService(context, dispatchers, SharedInstances.INSTANCE.getWebViewEventSender());
    }

    public final O transactionCoroutineScope(ISDKDispatchers dispatchers, L errorHandler, B0 parentJob) {
        t.g(dispatchers, "dispatchers");
        t.g(errorHandler, "errorHandler");
        t.g(parentJob, "parentJob");
        return P.a(parentJob.plus(dispatchers.getDefault()).plus(new N("transaction_scope")).plus(errorHandler));
    }

    public final i universalRequestDataStore(Context context, K dispatcher) {
        t.g(context, "context");
        t.g(dispatcher, "dispatcher");
        return j.c(j.a, new UniversalRequestStoreSerializer(), (b) null, (List) null, P.a(dispatcher.plus(W0.b(null, 1, null))), new 1(context), 4, (Object) null);
    }

    public final VolumeChangeMonitor volumeChangeMonitor(VolumeChange volumeChange) {
        t.g(volumeChange, "volumeChange");
        return new VolumeChangeMonitor(SharedInstances.INSTANCE.getWebViewEventSender(), volumeChange);
    }

    public final i webViewConfigurationDataStore(Context context, K dispatcher) {
        t.g(context, "context");
        t.g(dispatcher, "dispatcher");
        return j.c(j.a, new WebViewConfigurationStoreSerializer(), (b) null, (List) null, P.a(dispatcher.plus(W0.b(null, 1, null))), new 1(context), 4, (Object) null);
    }

    public final ByteStringDataSource iapTransactionDataStore(i dataStore) {
        t.g(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final ByteStringDataSource nativeConfigurationDataStore(i dataStore) {
        t.g(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final ByteStringDataSource privacyDataStore(i dataStore) {
        t.g(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final ByteStringDataSource privacyFsmDataStore(i dataStore) {
        t.g(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final ByteStringDataSource glInfoDataStore(i dataStore) {
        t.g(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }
}
