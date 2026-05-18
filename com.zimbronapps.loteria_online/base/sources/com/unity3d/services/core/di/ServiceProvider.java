package com.unity3d.services.core.di;

import Ca.I;
import Ca.m;
import Ga.e;
import Ha.c;
import Ia.f;
import Qa.a;
import Qa.l;
import Qa.p;
import android.content.Context;
import cb.B0;
import cb.K;
import cb.L;
import cb.O;
import com.unity3d.ads.adplayer.AdPlayerScope;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.configuration.AndroidManifestIntPropertyReader;
import com.unity3d.ads.core.configuration.CommonAlternativeFlowReader;
import com.unity3d.ads.core.configuration.GameServerIdReader;
import com.unity3d.ads.core.configuration.MediationInitBlobMetadataReader;
import com.unity3d.ads.core.configuration.MediationTraitsMetadataReader;
import com.unity3d.ads.core.data.datasource.AnalyticsDataSource;
import com.unity3d.ads.core.data.datasource.AndroidAnalyticsDataSource;
import com.unity3d.ads.core.data.datasource.AndroidAppSetIdDataSource;
import com.unity3d.ads.core.data.datasource.AndroidDeveloperConsentDataSource;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidFIdDataSource;
import com.unity3d.ads.core.data.datasource.AndroidFIdExistenceDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLegacyConfigStoreDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLegacyUserConsentDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLifecycleDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLocalCacheDataSource;
import com.unity3d.ads.core.data.datasource.AndroidMediationDataSource;
import com.unity3d.ads.core.data.datasource.AndroidPrivacyDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidStoreDataSource;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import com.unity3d.ads.core.data.datasource.AndroidUnityBootConfigDataSource;
import com.unity3d.ads.core.data.datasource.AndroidUnityInfoDataSource;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.datasource.CacheDataSource;
import com.unity3d.ads.core.data.datasource.DeveloperConsentDataSource;
import com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.FIdDataSource;
import com.unity3d.ads.core.data.datasource.FIdExistenceDataSource;
import com.unity3d.ads.core.data.datasource.FetchGLInfoDataMigration;
import com.unity3d.ads.core.data.datasource.LegacyUserConsentDataSource;
import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.datasource.MediationDataSource;
import com.unity3d.ads.core.data.datasource.PrivacyDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.StoreDataSource;
import com.unity3d.ads.core.data.datasource.TcfDataSource;
import com.unity3d.ads.core.data.datasource.UnityBootConfigDataSource;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource;
import com.unity3d.ads.core.data.manager.AndroidOfferwallManager;
import com.unity3d.ads.core.data.manager.AndroidOmidManager;
import com.unity3d.ads.core.data.manager.AndroidSDKPropertiesManager;
import com.unity3d.ads.core.data.manager.AndroidScarManager;
import com.unity3d.ads.core.data.manager.AndroidStorageManager;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.manager.StorageManager;
import com.unity3d.ads.core.data.manager.TransactionEventManager;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.AndroidAdRepository;
import com.unity3d.ads.core.data.repository.AndroidCacheRepository;
import com.unity3d.ads.core.data.repository.AndroidCampaignRepository;
import com.unity3d.ads.core.data.repository.AndroidDeveloperConsentRepository;
import com.unity3d.ads.core.data.repository.AndroidDeviceInfoRepository;
import com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.AndroidLegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.AndroidMediationRepository;
import com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.AndroidSessionRepository;
import com.unity3d.ads.core.data.repository.AndroidTcfRepository;
import com.unity3d.ads.core.data.repository.AndroidTransactionEventRepository;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeveloperConsentRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.FocusRepository;
import com.unity3d.ads.core.data.repository.LegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.MediationRepository;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.OperativeEventRepository;
import com.unity3d.ads.core.data.repository.OrientationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.data.repository.TcfRepository;
import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken;
import com.unity3d.ads.core.domain.AndroidCacheWebViewAssets;
import com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest;
import com.unity3d.ads.core.domain.AndroidGenerateByteStringId;
import com.unity3d.ads.core.domain.AndroidGetAdDataRefreshRequest;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerConfigRequest;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.core.domain.AndroidGetAdRequest;
import com.unity3d.ads.core.domain.AndroidGetAdRequestPolicy;
import com.unity3d.ads.core.domain.AndroidGetClientInfo;
import com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest;
import com.unity3d.ads.core.domain.AndroidGetInitializationData;
import com.unity3d.ads.core.domain.AndroidGetInitializationRequest;
import com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload;
import com.unity3d.ads.core.domain.AndroidGetIsAdActivity;
import com.unity3d.ads.core.domain.AndroidGetLifecycleFlow;
import com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken;
import com.unity3d.ads.core.domain.AndroidGetOpenGLRendererInfo;
import com.unity3d.ads.core.domain.AndroidGetSharedDataTimestamps;
import com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData;
import com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase;
import com.unity3d.ads.core.domain.AndroidHandleFocusCounters;
import com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse;
import com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse;
import com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse;
import com.unity3d.ads.core.domain.AndroidHandleOpenUrl;
import com.unity3d.ads.core.domain.AndroidHttpClientProvider;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import com.unity3d.ads.core.domain.AndroidLoad;
import com.unity3d.ads.core.domain.AndroidRefresh;
import com.unity3d.ads.core.domain.AndroidRemoveUrlQuery;
import com.unity3d.ads.core.domain.AndroidSendDiagnosticEvent;
import com.unity3d.ads.core.domain.AndroidSendWebViewClientErrorDiagnostics;
import com.unity3d.ads.core.domain.AndroidShow;
import com.unity3d.ads.core.domain.AndroidTestDataInfo;
import com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest;
import com.unity3d.ads.core.domain.AwaitInitialization;
import com.unity3d.ads.core.domain.BuildHeaderBiddingToken;
import com.unity3d.ads.core.domain.CacheFile;
import com.unity3d.ads.core.domain.CacheWebViewAssets;
import com.unity3d.ads.core.domain.CheckForGameIdAndTestModeChanges;
import com.unity3d.ads.core.domain.CleanAssets;
import com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires;
import com.unity3d.ads.core.domain.CommonAwaitInitialization;
import com.unity3d.ads.core.domain.CommonCacheFile;
import com.unity3d.ads.core.domain.CommonCheckForGameIdAndTestModeChanges;
import com.unity3d.ads.core.domain.CommonCleanAssets;
import com.unity3d.ads.core.domain.CommonCreateFile;
import com.unity3d.ads.core.domain.CommonGetAdObject;
import com.unity3d.ads.core.domain.CommonGetAdPlayer;
import com.unity3d.ads.core.domain.CommonGetCacheDirectory;
import com.unity3d.ads.core.domain.CommonGetFileExtensionFromUrl;
import com.unity3d.ads.core.domain.CommonGetGameId;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.ads.core.domain.CommonGetInitializationState;
import com.unity3d.ads.core.domain.CommonGetIsFileCache;
import com.unity3d.ads.core.domain.CommonGetWebViewBridgeUseCase;
import com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken;
import com.unity3d.ads.core.domain.CommonSafeCallbackInvoke;
import com.unity3d.ads.core.domain.CommonSetGameId;
import com.unity3d.ads.core.domain.CommonSetInitializationState;
import com.unity3d.ads.core.domain.CommonShouldAllowInitialization;
import com.unity3d.ads.core.domain.CommonTokenNumberProvider;
import com.unity3d.ads.core.domain.CommonValidateGameId;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.ExecuteAdViewerRequest;
import com.unity3d.ads.core.domain.GetAdDataRefreshRequest;
import com.unity3d.ads.core.domain.GetAdObject;
import com.unity3d.ads.core.domain.GetAdPlayer;
import com.unity3d.ads.core.domain.GetAdPlayerConfigRequest;
import com.unity3d.ads.core.domain.GetAdRequest;
import com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetByteStringId;
import com.unity3d.ads.core.domain.GetCacheDirectory;
import com.unity3d.ads.core.domain.GetCachedAsset;
import com.unity3d.ads.core.domain.GetClientInfo;
import com.unity3d.ads.core.domain.GetFileExtensionFromUrl;
import com.unity3d.ads.core.domain.GetGameId;
import com.unity3d.ads.core.domain.GetHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetInitRequestPolicy;
import com.unity3d.ads.core.domain.GetInitializationCompletedRequest;
import com.unity3d.ads.core.domain.GetInitializationData;
import com.unity3d.ads.core.domain.GetInitializationRequest;
import com.unity3d.ads.core.domain.GetInitializationRequestPayload;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.GetIsFileCache;
import com.unity3d.ads.core.domain.GetLatestWebViewConfiguration;
import com.unity3d.ads.core.domain.GetLimitedSessionToken;
import com.unity3d.ads.core.domain.GetOpenGLRendererInfo;
import com.unity3d.ads.core.domain.GetOperativeEventRequestPolicy;
import com.unity3d.ads.core.domain.GetOtherRequestPolicy;
import com.unity3d.ads.core.domain.GetPrivacyUpdateRequest;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetSharedDataTimestamps;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.GetUniversalRequestSharedData;
import com.unity3d.ads.core.domain.GetWebViewBridgeUseCase;
import com.unity3d.ads.core.domain.HandleDebugSettings;
import com.unity3d.ads.core.domain.HandleGatewayAdResponse;
import com.unity3d.ads.core.domain.HandleGatewayInitializationResponse;
import com.unity3d.ads.core.domain.HandleGatewayUniversalResponse;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.HandleOpenUrl;
import com.unity3d.ads.core.domain.HttpClientProvider;
import com.unity3d.ads.core.domain.InitializeBoldSDK;
import com.unity3d.ads.core.domain.LegacyLoadUseCase;
import com.unity3d.ads.core.domain.LegacyShowUseCase;
import com.unity3d.ads.core.domain.Load;
import com.unity3d.ads.core.domain.Refresh;
import com.unity3d.ads.core.domain.RemoveUrlQuery;
import com.unity3d.ads.core.domain.SafeCallbackInvoke;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.SendPrivacyUpdateRequest;
import com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics;
import com.unity3d.ads.core.domain.SetGameId;
import com.unity3d.ads.core.domain.SetInitializationState;
import com.unity3d.ads.core.domain.ShouldAllowInitialization;
import com.unity3d.ads.core.domain.Show;
import com.unity3d.ads.core.domain.TokenNumberProvider;
import com.unity3d.ads.core.domain.TriggerInitializationCompletedRequest;
import com.unity3d.ads.core.domain.TriggerInitializeListener;
import com.unity3d.ads.core.domain.ValidateGameId;
import com.unity3d.ads.core.domain.attribution.AndroidAttribution;
import com.unity3d.ads.core.domain.billing.CommonProductDetailsFetcher;
import com.unity3d.ads.core.domain.billing.IsBillingClientAvailable;
import com.unity3d.ads.core.domain.billing.ProductDetailsFetcher;
import com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback;
import com.unity3d.ads.core.domain.events.AndroidGetTransactionData;
import com.unity3d.ads.core.domain.events.AndroidHandleGatewayEventResponse;
import com.unity3d.ads.core.domain.events.CommonGetTransactionRequest;
import com.unity3d.ads.core.domain.events.CommonUniversalRequestTtlValidator;
import com.unity3d.ads.core.domain.events.DiagnosticEventObserver;
import com.unity3d.ads.core.domain.events.EventObservers;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventBatchRequest;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.domain.events.GetOperativeEventRequest;
import com.unity3d.ads.core.domain.events.GetTransactionData;
import com.unity3d.ads.core.domain.events.GetTransactionRequest;
import com.unity3d.ads.core.domain.events.HandleGatewayEventResponse;
import com.unity3d.ads.core.domain.events.OperativeEventObserver;
import com.unity3d.ads.core.domain.events.TransactionEventObserver;
import com.unity3d.ads.core.domain.events.UniversalRequestEventSender;
import com.unity3d.ads.core.domain.events.UniversalRequestTtlValidator;
import com.unity3d.ads.core.domain.offerwall.GetIsOfferwallAdReady;
import com.unity3d.ads.core.domain.offerwall.LoadOfferwallAd;
import com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK;
import com.unity3d.ads.core.domain.om.AndroidOmFinishSession;
import com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred;
import com.unity3d.ads.core.domain.om.AndroidOmInteraction;
import com.unity3d.ads.core.domain.om.AndroidOmStartSession;
import com.unity3d.ads.core.domain.om.CommonGetOmData;
import com.unity3d.ads.core.domain.om.CommonIsOMActivated;
import com.unity3d.ads.core.domain.om.GetOmData;
import com.unity3d.ads.core.domain.om.InitializeOMSDK;
import com.unity3d.ads.core.domain.om.IsOMActivated;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.domain.om.OmImpressionOccurred;
import com.unity3d.ads.core.domain.privacy.DeveloperConsentFlattenerRulesUseCase;
import com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase;
import com.unity3d.ads.core.domain.privacy.LegacyUserConsentFlattenerRulesUseCase;
import com.unity3d.ads.core.domain.scar.AndroidFetchSignalsAndSendUseCase;
import com.unity3d.ads.core.domain.scar.CommonScarEventReceiver;
import com.unity3d.ads.core.domain.scar.FetchSignalsAndSendUseCase;
import com.unity3d.ads.core.domain.scar.GetAndroidTokenEventRequest;
import com.unity3d.ads.core.domain.scar.GetHbTokenEventRequest;
import com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest;
import com.unity3d.ads.core.domain.scar.HandleGetTokenRequest;
import com.unity3d.ads.core.domain.scar.LoadScarAd;
import com.unity3d.ads.core.domain.scar.ScarTimeHackFixer;
import com.unity3d.ads.core.domain.work.BackgroundWorker;
import com.unity3d.ads.core.domain.work.DiagnosticEventRequestWorkModifier;
import com.unity3d.ads.core.domain.work.DownloadPriorityQueue;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.ads.core.log.UnityLogger;
import com.unity3d.ads.core.utils.CommonCoroutineTimer;
import com.unity3d.ads.core.utils.CoroutineTimer;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.services.SDKErrorHandler;
import com.unity3d.services.ads.gmascar.GMA;
import com.unity3d.services.ads.gmascar.GMAScarAdapterBridge;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.ads.measurements.MeasurementsService;
import com.unity3d.services.ads.offerwall.OfferwallAdapterBridge;
import com.unity3d.services.ads.token.AsyncTokenStorage;
import com.unity3d.services.ads.token.InMemoryTokenStorage;
import com.unity3d.services.ads.token.TokenStorage;
import com.unity3d.services.ads.topics.TopicsService;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.device.VolumeChange;
import com.unity3d.services.core.device.VolumeChangeContentObserver;
import com.unity3d.services.core.device.VolumeChangeMonitor;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage;
import com.unity3d.services.core.domain.task.InitializeSDK;
import com.unity3d.services.core.domain.task.InitializeStateComplete;
import com.unity3d.services.core.domain.task.InitializeStateConfig;
import com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader;
import com.unity3d.services.core.domain.task.InitializeStateCreate;
import com.unity3d.services.core.domain.task.InitializeStateError;
import com.unity3d.services.core.domain.task.InitializeStateLoadCache;
import com.unity3d.services.core.domain.task.InitializeStateLoadWeb;
import com.unity3d.services.core.domain.task.InitializeStateNetworkError;
import com.unity3d.services.core.domain.task.InitializeStateReset;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.network.core.CronetEngineBuilderFactory;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.domain.CleanupDirectory;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.IEventSender;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import com.unity3d.services.store.StoreMonitor;
import com.unity3d.services.store.StoreWebViewEventSender;
import com.unity3d.services.store.core.GatewayStoreExceptionHandler;
import com.unity3d.services.store.core.StoreEventListenerFactory;
import com.unity3d.services.store.core.StoreExceptionHandler;
import com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter;
import com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapterFactory;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import o2.g;
import o2.i;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ServiceProvider implements IServiceProvider {
    public static final String CDN_CREATIVES_HOST = "cdn-creatives-cf-prd.acquire.unity3dusercontent.com";
    public static final int CDN_CREATIVES_PORT = 443;
    public static final String DATA_STORE_GATEWAY_CACHE = "gateway_cache.pb";
    public static final String DATA_STORE_GL_INFO = "glinfo.pb";
    public static final String DATA_STORE_IAP_TRANSACTION = "iap_transaction.pb";
    public static final String DATA_STORE_NATIVE_CONFIG = "native_configuration.pb";
    public static final String DATA_STORE_PRIVACY = "privacy.pb";
    public static final String DATA_STORE_PRIVACY_FSM = "privacy_fsm.pb";
    public static final String DATA_STORE_UNIVERSAL_REQUEST = "universal_request.pb";
    public static final String DATA_STORE_WEBVIEW_CONFIG = "webview_config.pb";
    public static final String DEFAULT_DISPATCHER = "default_dispatcher";
    public static final String DEV_CONSENT_PRIVACY_RULES = "dev_consent_privacy_rules";
    public static final String GATEWAY_HOST = "gateway.unityads.unity3d.com";
    public static final int GATEWAY_PORT = 443;
    public static final long HTTP_CACHE_DISK_SIZE = 20971520;
    public static final long HTTP_CLIENT_FETCH_TIMEOUT = 500;
    public static final ServiceProvider INSTANCE;
    public static final String IO_DISPATCHER = "io_dispatcher";
    public static final String LEGACY_PRIVACY_RULES = "legacy_privacy_rules";
    public static final String MAIN_DISPATCHER = "main_dispatcher";
    public static final String NAMED_AD_REQ = "ad_req";
    public static final String NAMED_GATEWAY_HTTP_CLIENT = "gateway_http_client";
    public static final String NAMED_GET_TOKEN_SCOPE = "get_token_scope";
    public static final String NAMED_INIT_REQ = "init_req";
    public static final String NAMED_INIT_SCOPE = "init_scope";
    public static final String NAMED_LOAD_SCOPE = "load_scope";
    public static final String NAMED_LOCAL = "local";
    public static final String NAMED_OFFERWALL_SCOPE = "offerwall_scope";
    public static final String NAMED_OMID_SCOPE = "omid_scope";
    public static final String NAMED_OPERATIVE_REQ = "op_event_req";
    public static final String NAMED_OTHER_REQ = "other_req";
    public static final String NAMED_PUBLIC_JOB = "public_job";
    public static final String NAMED_REMOTE = "remote";
    public static final String NAMED_SCAR_SCOPE = "scar_scope";
    public static final String NAMED_SDK = "sdk";
    public static final String NAMED_SHOW_SCOPE = "show_scope";
    public static final String NAMED_TRANSACTION_SCOPE = "transaction_scope";
    public static final String PREF_GL_INFO = "glinfo";
    public static final long SCAR_SIGNALS_FETCH_TIMEOUT = 50000;
    public static final long SCAR_VERSION_FETCH_TIMEOUT = 5000;
    private static final IServicesRegistry serviceRegistry;

    public static final class 1 extends u implements l {
        public static final 1 INSTANCE = new 1();

        public static final class 1 extends u implements a {
            public static final 1 INSTANCE = new 1();

            public 1() {
                super(0);
            }

            public final Context invoke() {
                return ClientProperties.getApplicationContext();
            }
        }

        public static final class 10 extends u implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 10(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            public final O invoke() {
                return this.$moduleInstance.transactionCoroutineScope((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", P.b(ISDKDispatchers.class))), (L) this.$this_registry.resolveService(new ServiceKey("sdk", P.b(L.class))), (B0) this.$this_registry.resolveService(new ServiceKey("public_job", P.b(B0.class))));
            }
        }

        public static final class 100 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 100(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final GetInitializationState invoke() {
                return new CommonGetInitializationState((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(SessionRepository.class))), (SDKPropertiesManager) this.$this_registry.resolveService(new ServiceKey("", P.b(SDKPropertiesManager.class))));
            }
        }

        public static final class 101 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 101(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final GetIsFileCache invoke() {
                return new CommonGetIsFileCache((CacheRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(CacheRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", P.b(SendDiagnosticEvent.class))));
            }
        }

        public static final class 102 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 102(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final SetInitializationState invoke() {
                return new CommonSetInitializationState((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(SessionRepository.class))), (SDKPropertiesManager) this.$this_registry.resolveService(new ServiceKey("", P.b(SDKPropertiesManager.class))));
            }
        }

        public static final class 103 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 103(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final GetRequestPolicy invoke() {
                return new AndroidGetAdRequestPolicy((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(SessionRepository.class))));
            }
        }

        public static final class 104 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 104(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final GetAdDataRefreshRequest invoke() {
                return new AndroidGetAdDataRefreshRequest((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", P.b(GetUniversalRequestForPayLoad.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(SessionRepository.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(DeviceInfoRepository.class))), (CampaignRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(CampaignRepository.class))));
            }
        }

        public static final class 105 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 105(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final GetAdPlayerConfigRequest invoke() {
                return new AndroidGetAdPlayerConfigRequest((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", P.b(GetUniversalRequestForPayLoad.class))));
            }
        }

        public static final class 106 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 106(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final AndroidGetAdPlayerContext invoke() {
                return new AndroidGetAdPlayerContext((DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(DeviceInfoRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(SessionRepository.class))));
            }
        }

        public static final class 107 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 107(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final GetAdRequest invoke() {
                return new AndroidGetAdRequest((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", P.b(GetUniversalRequestForPayLoad.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(SessionRepository.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(DeviceInfoRepository.class))), (CampaignRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(CampaignRepository.class))), (WebviewConfigurationDataSource) this.$this_registry.resolveService(new ServiceKey("", P.b(WebviewConfigurationDataSource.class))), (TcfRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(TcfRepository.class))));
            }
        }

        public static final class 108 extends u implements a {
            public static final 108 INSTANCE = new 108();

            public 108() {
                super(0);
            }

            public final GetHbTokenEventRequest invoke() {
                return new GetAndroidTokenEventRequest();
            }
        }

        public static final class 109 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 109(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final CommonScarEventReceiver invoke() {
                return new CommonScarEventReceiver((O) this.$this_registry.resolveService(new ServiceKey("scar_scope", P.b(O.class))));
            }
        }

        public static final class 11 extends u implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 11(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            public final O invoke() {
                return this.$moduleInstance.getTokenCoroutineScope((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", P.b(ISDKDispatchers.class))), (L) this.$this_registry.resolveService(new ServiceKey("sdk", P.b(L.class))), (B0) this.$this_registry.resolveService(new ServiceKey("public_job", P.b(B0.class))));
            }
        }

        public static final class 110 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 110(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final GMAScarAdapterBridge invoke() {
                GMAScarAdapterBridge bridge = GMA.getInstance(new GMAEventSender((IEventSender) this.$this_registry.resolveService(new ServiceKey("", P.b(CommonScarEventReceiver.class))))).getBridge();
                t.f(bridge, "getInstance(GMAEventSend…EventReceiver>())).bridge");
                return bridge;
            }
        }

        public static final class 111 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 111(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final ScarTimeHackFixer invoke() {
                return new ScarTimeHackFixer((SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", P.b(SendDiagnosticEvent.class))));
            }
        }

        public static final class 112 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 112(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final ScarManager invoke() {
                return new AndroidScarManager((CommonScarEventReceiver) this.$this_registry.resolveService(new ServiceKey("", P.b(CommonScarEventReceiver.class))), (GMAScarAdapterBridge) this.$this_registry.resolveService(new ServiceKey("", P.b(GMAScarAdapterBridge.class))), (ScarTimeHackFixer) this.$this_registry.resolveService(new ServiceKey("", P.b(ScarTimeHackFixer.class))));
            }
        }

        public static final class 113 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 113(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final FetchSignalsAndSendUseCase invoke() {
                return new AndroidFetchSignalsAndSendUseCase((O) this.$this_registry.resolveService(new ServiceKey("scar_scope", P.b(O.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(SessionRepository.class))), (ScarManager) this.$this_registry.resolveService(new ServiceKey("", P.b(ScarManager.class))), (HandleGetTokenRequest) this.$this_registry.resolveService(new ServiceKey("", P.b(HandleGetTokenRequest.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", P.b(SendDiagnosticEvent.class))));
            }
        }

        public static final class 114 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 114(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final LoadScarAd invoke() {
                return new LoadScarAd((ScarManager) this.$this_registry.resolveService(new ServiceKey("", P.b(ScarManager.class))));
            }
        }

        public static final class 115 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 115(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final HandleGetTokenRequest invoke() {
                return new HandleAndroidGetTokenRequest((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", P.b(GetUniversalRequestForPayLoad.class))), (GetHbTokenEventRequest) this.$this_registry.resolveService(new ServiceKey("", P.b(GetHbTokenEventRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey("other_req", P.b(GetRequestPolicy.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", P.b(GatewayClient.class))));
            }
        }

        public static final class 116 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 116(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final GetClientInfo invoke() {
                return new AndroidGetClientInfo((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(SessionRepository.class))), (MediationRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(MediationRepository.class))), (OmidManager) this.$this_registry.resolveService(new ServiceKey("", P.b(OmidManager.class))), (ScarManager) this.$this_registry.resolveService(new ServiceKey("", P.b(ScarManager.class))), (OfferwallManager) this.$this_registry.resolveService(new ServiceKey("", P.b(OfferwallManager.class))), (FIdExistenceDataSource) this.$this_registry.resolveService(new ServiceKey("", P.b(FIdExistenceDataSource.class))));
            }
        }

        public static final class 117 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 117(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final GetInitializationCompletedRequest invoke() {
                return new AndroidGetInitializationCompletedRequest((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", P.b(GetUniversalRequestForPayLoad.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(DeviceInfoRepository.class))));
            }
        }

        public static final class 118 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 118(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final GetInitializationRequest invoke() {
                return new AndroidGetInitializationRequest((GetInitializationRequestPayload) this.$this_registry.resolveService(new ServiceKey("", P.b(GetInitializationRequestPayload.class))), (GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", P.b(GetUniversalRequestForPayLoad.class))));
            }
        }

        public static final class 119 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 119(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final GetLimitedSessionToken invoke() {
                return new AndroidGetLimitedSessionToken((DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(DeviceInfoRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(SessionRepository.class))), (MediationRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(MediationRepository.class))));
            }
        }

        public static final class 12 extends u implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 12(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            public final O invoke() {
                return this.$moduleInstance.scarSignalsCoroutineScope((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", P.b(ISDKDispatchers.class))), (L) this.$this_registry.resolveService(new ServiceKey("sdk", P.b(L.class))), (B0) this.$this_registry.resolveService(new ServiceKey("public_job", P.b(B0.class))));
            }
        }

        public static final class 120 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 120(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final GetOpenGLRendererInfo invoke() {
                return new AndroidGetOpenGLRendererInfo((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(SessionRepository.class))));
            }
        }

        public static final class 121 extends u implements a {
            public static final 121 INSTANCE = new 121();

            public 121() {
                super(0);
            }

            public final GetSharedDataTimestamps invoke() {
                return new AndroidGetSharedDataTimestamps();
            }
        }

        public static final class 122 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 122(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final GetUniversalRequestForPayLoad invoke() {
                return new AndroidGetUniversalRequestForPayLoad((GetUniversalRequestSharedData) this.$this_registry.resolveService(new ServiceKey("", P.b(GetUniversalRequestSharedData.class))));
            }
        }

        public static final class 123 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 123(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final GetUniversalRequestSharedData invoke() {
                return new AndroidGetUniversalRequestSharedData((GetSharedDataTimestamps) this.$this_registry.resolveService(new ServiceKey("", P.b(GetSharedDataTimestamps.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(SessionRepository.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(DeviceInfoRepository.class))), (GetLimitedSessionToken) this.$this_registry.resolveService(new ServiceKey("", P.b(GetLimitedSessionToken.class))), (DeveloperConsentRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(DeveloperConsentRepository.class))));
            }
        }

        public static final class 124 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 124(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final GetCachedAsset invoke() {
                return new GetCachedAsset((CacheRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(CacheRepository.class))), (Context) this.$this_registry.resolveService(new ServiceKey("", P.b(Context.class))), (CacheWebViewAssets) this.$this_registry.resolveService(new ServiceKey("", P.b(CacheWebViewAssets.class))));
            }
        }

        public static final class 125 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 125(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final GetWebViewBridgeUseCase invoke() {
                return new CommonGetWebViewBridgeUseCase((K) this.$this_registry.resolveService(new ServiceKey("default_dispatcher", P.b(K.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", P.b(SendDiagnosticEvent.class))));
            }
        }

        public static final class 126 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 126(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final GetRequestPolicy invoke() {
                return new GetInitRequestPolicy((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(SessionRepository.class))));
            }
        }

        public static final class 127 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 127(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final GetLatestWebViewConfiguration invoke() {
                return new GetLatestWebViewConfiguration((WebviewConfigurationDataSource) this.$this_registry.resolveService(new ServiceKey("", P.b(WebviewConfigurationDataSource.class))));
            }
        }

        public static final class 128 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 128(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final GetRequestPolicy invoke() {
                return new GetOperativeEventRequestPolicy((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(SessionRepository.class))));
            }
        }

        public static final class 129 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 129(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final GetRequestPolicy invoke() {
                return new GetOtherRequestPolicy((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(SessionRepository.class))));
            }
        }

        public static final class 13 extends u implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 13(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            public final O invoke() {
                return this.$moduleInstance.offerwallSignalsCoroutineScope((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", P.b(ISDKDispatchers.class))), (L) this.$this_registry.resolveService(new ServiceKey("sdk", P.b(L.class))), (B0) this.$this_registry.resolveService(new ServiceKey("public_job", P.b(B0.class))));
            }
        }

        public static final class 130 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 130(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final GetPrivacyUpdateRequest invoke() {
                return new GetPrivacyUpdateRequest((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", P.b(GetUniversalRequestForPayLoad.class))));
            }
        }

        public static final class 131 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 131(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final HandleGatewayInitializationResponse invoke() {
                return new AndroidHandleGatewayInitializationResponse((TransactionEventManager) this.$this_registry.resolveService(new ServiceKey("", P.b(TransactionEventManager.class))), (TriggerInitializationCompletedRequest) this.$this_registry.resolveService(new ServiceKey("", P.b(TriggerInitializationCompletedRequest.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(SessionRepository.class))), (O) this.$this_registry.resolveService(new ServiceKey("init_scope", P.b(O.class))), (HandleDebugSettings) this.$this_registry.resolveService(new ServiceKey("", P.b(HandleDebugSettings.class))));
            }
        }

        public static final class 132 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 132(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final HandleGatewayUniversalResponse invoke() {
                return new AndroidHandleGatewayUniversalResponse((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(SessionRepository.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(DeviceInfoRepository.class))), (AndroidAppSetIdDataSource) this.$this_registry.resolveService(new ServiceKey("", P.b(AndroidAppSetIdDataSource.class))));
            }
        }

        public static final class 133 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 133(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final InitializeBoldSDK invoke() {
                return new AndroidInitializeBoldSDK((K) this.$this_registry.resolveService(new ServiceKey("default_dispatcher", P.b(K.class))), (InitializeOMSDK) this.$this_registry.resolveService(new ServiceKey("", P.b(InitializeOMSDK.class))), (GetInitializationRequest) this.$this_registry.resolveService(new ServiceKey("", P.b(GetInitializationRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey("init_req", P.b(GetRequestPolicy.class))), (CleanAssets) this.$this_registry.resolveService(new ServiceKey("", P.b(CleanAssets.class))), (HandleGatewayInitializationResponse) this.$this_registry.resolveService(new ServiceKey("", P.b(HandleGatewayInitializationResponse.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", P.b(GatewayClient.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(SessionRepository.class))), (EventObservers) this.$this_registry.resolveService(new ServiceKey("", P.b(EventObservers.class))), (TriggerInitializeListener) this.$this_registry.resolveService(new ServiceKey("", P.b(TriggerInitializeListener.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", P.b(SendDiagnosticEvent.class))), (DiagnosticEventRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(DiagnosticEventRepository.class))), (StorageManager) this.$this_registry.resolveService(new ServiceKey("", P.b(StorageManager.class))), (ConfigurationReader) this.$this_registry.resolveService(new ServiceKey("", P.b(ConfigurationReader.class))), (SDKPropertiesManager) this.$this_registry.resolveService(new ServiceKey("", P.b(SDKPropertiesManager.class))), (GetGameId) this.$this_registry.resolveService(new ServiceKey("", P.b(GetGameId.class))), (AndroidHandleFocusCounters) this.$this_registry.resolveService(new ServiceKey("", P.b(AndroidHandleFocusCounters.class))));
            }
        }

        public static final class 134 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 134(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final LegacyShowUseCase invoke() {
                return new LegacyShowUseCase((Show) this.$this_registry.resolveService(new ServiceKey("", P.b(Show.class))), (AdRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(AdRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", P.b(SendDiagnosticEvent.class))), (GetOperativeEventApi) this.$this_registry.resolveService(new ServiceKey("", P.b(GetOperativeEventApi.class))), (GetInitializationState) this.$this_registry.resolveService(new ServiceKey("", P.b(GetInitializationState.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(SessionRepository.class))), (SafeCallbackInvoke) this.$this_registry.resolveService(new ServiceKey("", P.b(SafeCallbackInvoke.class))));
            }
        }

        public static final class 135 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 135(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final SendPrivacyUpdateRequest invoke() {
                return new SendPrivacyUpdateRequest((GetPrivacyUpdateRequest) this.$this_registry.resolveService(new ServiceKey("", P.b(GetPrivacyUpdateRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey("other_req", P.b(GetRequestPolicy.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", P.b(GatewayClient.class))));
            }
        }

        public static final class 136 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 136(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final TriggerInitializationCompletedRequest invoke() {
                return new AndroidTriggerInitializationCompletedRequest((GetInitializationCompletedRequest) this.$this_registry.resolveService(new ServiceKey("", P.b(GetInitializationCompletedRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey("init_req", P.b(GetRequestPolicy.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", P.b(GatewayClient.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", P.b(SendDiagnosticEvent.class))));
            }
        }

        public static final class 137 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 137(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final TriggerInitializeListener invoke() {
                return new TriggerInitializeListener((K) this.$this_registry.resolveService(new ServiceKey("main_dispatcher", P.b(K.class))));
            }
        }

        public static final class 138 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 138(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final DiagnosticEventObserver invoke() {
                return new DiagnosticEventObserver((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", P.b(GetUniversalRequestForPayLoad.class))), (GetDiagnosticEventBatchRequest) this.$this_registry.resolveService(new ServiceKey("", P.b(GetDiagnosticEventBatchRequest.class))), (K) this.$this_registry.resolveService(new ServiceKey("default_dispatcher", P.b(K.class))), (DiagnosticEventRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(DiagnosticEventRepository.class))), (UniversalRequestDataSource) this.$this_registry.resolveService(new ServiceKey("", P.b(UniversalRequestDataSource.class))), (BackgroundWorker) this.$this_registry.resolveService(new ServiceKey("", P.b(BackgroundWorker.class))));
            }
        }

        public static final class 139 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 139(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final EventObservers invoke() {
                return new EventObservers((OperativeEventObserver) this.$this_registry.resolveService(new ServiceKey("", P.b(OperativeEventObserver.class))), (DiagnosticEventObserver) this.$this_registry.resolveService(new ServiceKey("", P.b(DiagnosticEventObserver.class))), (TransactionEventObserver) this.$this_registry.resolveService(new ServiceKey("", P.b(TransactionEventObserver.class))));
            }
        }

        public static final class 14 extends u implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 14(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            public final O invoke() {
                return this.$moduleInstance.omidCoroutineScope((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", P.b(ISDKDispatchers.class))), (L) this.$this_registry.resolveService(new ServiceKey("sdk", P.b(L.class))), (B0) this.$this_registry.resolveService(new ServiceKey("public_job", P.b(B0.class))));
            }
        }

        public static final class 140 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 140(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final GetTransactionData invoke() {
                return new AndroidGetTransactionData((GetByteStringId) this.$this_registry.resolveService(new ServiceKey("", P.b(GetByteStringId.class))));
            }
        }

        public static final class 141 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 141(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final GetTransactionRequest invoke() {
                return new CommonGetTransactionRequest((DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(DeviceInfoRepository.class))));
            }
        }

        public static final class 142 extends u implements a {
            public static final 142 INSTANCE = new 142();

            public 142() {
                super(0);
            }

            public final GetDiagnosticEventBatchRequest invoke() {
                return new GetDiagnosticEventBatchRequest();
            }
        }

        public static final class 143 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 143(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final GetDiagnosticEventRequest invoke() {
                return new GetDiagnosticEventRequest((GetSharedDataTimestamps) this.$this_registry.resolveService(new ServiceKey("", P.b(GetSharedDataTimestamps.class))));
            }
        }

        public static final class 144 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 144(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final GetOperativeEventApi invoke() {
                return new GetOperativeEventApi((OperativeEventRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(OperativeEventRepository.class))), (GetOperativeEventRequest) this.$this_registry.resolveService(new ServiceKey("", P.b(GetOperativeEventRequest.class))));
            }
        }

        public static final class 145 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 145(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final GetOperativeEventRequest invoke() {
                return new GetOperativeEventRequest((GetByteStringId) this.$this_registry.resolveService(new ServiceKey("", P.b(GetByteStringId.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(DeviceInfoRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(SessionRepository.class))), (CampaignRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(CampaignRepository.class))));
            }
        }

        public static final class 146 extends u implements a {
            public static final 146 INSTANCE = new 146();

            public 146() {
                super(0);
            }

            public final HandleGatewayEventResponse invoke() {
                return new AndroidHandleGatewayEventResponse();
            }
        }

        public static final class 147 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 147(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final OperativeEventObserver invoke() {
                return new OperativeEventObserver((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", P.b(GetUniversalRequestForPayLoad.class))), (K) this.$this_registry.resolveService(new ServiceKey("default_dispatcher", P.b(K.class))), (OperativeEventRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(OperativeEventRepository.class))), (UniversalRequestDataSource) this.$this_registry.resolveService(new ServiceKey("", P.b(UniversalRequestDataSource.class))), (BackgroundWorker) this.$this_registry.resolveService(new ServiceKey("", P.b(BackgroundWorker.class))));
            }
        }

        public static final class 148 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 148(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final TransactionEventObserver invoke() {
                return new TransactionEventObserver((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", P.b(GetUniversalRequestForPayLoad.class))), (K) this.$this_registry.resolveService(new ServiceKey("default_dispatcher", P.b(K.class))), (TransactionEventRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(TransactionEventRepository.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", P.b(GatewayClient.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey("other_req", P.b(GetRequestPolicy.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey("iap_transaction.pb", P.b(ByteStringDataSource.class))));
            }
        }

        public static final class 149 extends u implements a {
            public static final 149 INSTANCE = new 149();

            public 149() {
                super(0);
            }

            public final UniversalRequestTtlValidator invoke() {
                return new CommonUniversalRequestTtlValidator();
            }
        }

        public static final class 15 extends u implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 15(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            public final B0 invoke() {
                return this.$moduleInstance.publicApiJob((DiagnosticEventRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(DiagnosticEventRepository.class))));
            }
        }

        public static final class 150 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 150(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final UniversalRequestEventSender invoke() {
                return new UniversalRequestEventSender((GatewayClient) this.$this_registry.resolveService(new ServiceKey("", P.b(GatewayClient.class))), (HandleGatewayEventResponse) this.$this_registry.resolveService(new ServiceKey("", P.b(HandleGatewayEventResponse.class))), (UniversalRequestTtlValidator) this.$this_registry.resolveService(new ServiceKey("", P.b(UniversalRequestTtlValidator.class))));
            }
        }

        public static final class 151 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 151(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final OmFinishSession invoke() {
                return new AndroidOmFinishSession((OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(OpenMeasurementRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", P.b(SendDiagnosticEvent.class))));
            }
        }

        public static final class 152 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 152(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final OmImpressionOccurred invoke() {
                return new AndroidOmImpressionOccurred((OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(OpenMeasurementRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", P.b(SendDiagnosticEvent.class))));
            }
        }

        public static final class 153 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 153(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final AndroidOmInteraction invoke() {
                return new AndroidOmStartSession((OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(OpenMeasurementRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", P.b(SendDiagnosticEvent.class))));
            }
        }

        public static final class 154 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 154(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final GetOmData invoke() {
                return new CommonGetOmData((OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(OpenMeasurementRepository.class))));
            }
        }

        public static final class 155 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 155(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final IsOMActivated invoke() {
                return new CommonIsOMActivated((OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(OpenMeasurementRepository.class))));
            }
        }

        public static final class 156 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 156(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final InitializeOMSDK invoke() {
                return new AndroidInitializeOMSDK((Context) this.$this_registry.resolveService(new ServiceKey("", P.b(Context.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", P.b(SendDiagnosticEvent.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(SessionRepository.class))), (OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(OpenMeasurementRepository.class))));
            }
        }

        public static final class 157 extends u implements a {
            public static final 157 INSTANCE = new 157();

            public 157() {
                super(0);
            }

            public final FlattenerRulesUseCase invoke() {
                return new DeveloperConsentFlattenerRulesUseCase();
            }
        }

        public static final class 158 extends u implements a {
            public static final 158 INSTANCE = new 158();

            public 158() {
                super(0);
            }

            public final FlattenerRulesUseCase invoke() {
                return new LegacyUserConsentFlattenerRulesUseCase();
            }
        }

        public static final class 159 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 159(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final BackgroundWorker invoke() {
                return new BackgroundWorker((Context) this.$this_registry.resolveService(new ServiceKey("", P.b(Context.class))));
            }
        }

        public static final class 16 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 16(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final ByteStringDataSource invoke() {
                return new AndroidLegacyConfigStoreDataSource((StorageManager) this.$this_registry.resolveService(new ServiceKey("", P.b(StorageManager.class))));
            }
        }

        public static final class 160 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 160(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final DiagnosticEventRequestWorkModifier invoke() {
                return new DiagnosticEventRequestWorkModifier((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(SessionRepository.class))));
            }
        }

        public static final class 161 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 161(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final GatewayClient invoke() {
                return new CommonGatewayClient((HttpClient) this.$this_registry.resolveService(new ServiceKey("gateway_http_client", P.b(HttpClient.class))), (HandleGatewayUniversalResponse) this.$this_registry.resolveService(new ServiceKey("", P.b(HandleGatewayUniversalResponse.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", P.b(SendDiagnosticEvent.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(SessionRepository.class))));
            }
        }

        public static final class 162 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 162(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final L invoke() {
                return new SDKErrorHandler((K) this.$this_registry.resolveService(new ServiceKey("io_dispatcher", P.b(K.class))), (AlternativeFlowReader) this.$this_registry.resolveService(new ServiceKey("", P.b(AlternativeFlowReader.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", P.b(SendDiagnosticEvent.class))), (SDKMetricsSender) this.$this_registry.resolveService(new ServiceKey("", P.b(SDKMetricsSender.class))));
            }
        }

        public static final class 163 extends u implements a {
            public static final 163 INSTANCE = new 163();

            public 163() {
                super(0);
            }

            public final TokenStorage invoke() {
                return new InMemoryTokenStorage();
            }
        }

        public static final class 164 extends u implements a {
            public static final 164 INSTANCE = new 164();

            public 164() {
                super(0);
            }

            public final VolumeChange invoke() {
                return new VolumeChangeContentObserver();
            }
        }

        public static final class 165 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 165(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final ConfigFileFromLocalStorage invoke() {
                return new ConfigFileFromLocalStorage((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", P.b(ISDKDispatchers.class))));
            }
        }

        public static final class 166 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 166(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final InitializeSDK invoke() {
                return new InitializeSDK((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", P.b(ISDKDispatchers.class))), (ConfigFileFromLocalStorage) this.$this_registry.resolveService(new ServiceKey("", P.b(ConfigFileFromLocalStorage.class))), (InitializeStateReset) this.$this_registry.resolveService(new ServiceKey("", P.b(InitializeStateReset.class))), (InitializeStateError) this.$this_registry.resolveService(new ServiceKey("", P.b(InitializeStateError.class))), (InitializeStateConfig) this.$this_registry.resolveService(new ServiceKey("", P.b(InitializeStateConfig.class))), (InitializeStateCreate) this.$this_registry.resolveService(new ServiceKey("", P.b(InitializeStateCreate.class))), (InitializeStateLoadCache) this.$this_registry.resolveService(new ServiceKey("", P.b(InitializeStateLoadCache.class))), (InitializeStateLoadWeb) this.$this_registry.resolveService(new ServiceKey("", P.b(InitializeStateLoadWeb.class))), (InitializeStateComplete) this.$this_registry.resolveService(new ServiceKey("", P.b(InitializeStateComplete.class))));
            }
        }

        public static final class 167 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 167(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final InitializeStateComplete invoke() {
                return new InitializeStateComplete((i) this.$this_registry.resolveService(new ServiceKey("native_configuration.pb", P.b(i.class))), (ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", P.b(ISDKDispatchers.class))));
            }
        }

        public static final class 168 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 168(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final InitializeStateConfig invoke() {
                return new InitializeStateConfig((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", P.b(ISDKDispatchers.class))), (InitializeStateConfigWithLoader) this.$this_registry.resolveService(new ServiceKey("", P.b(InitializeStateConfigWithLoader.class))));
            }
        }

        public static final class 169 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 169(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final InitializeStateConfigWithLoader invoke() {
                return new InitializeStateConfigWithLoader((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", P.b(ISDKDispatchers.class))), (InitializeStateNetworkError) this.$this_registry.resolveService(new ServiceKey("", P.b(InitializeStateNetworkError.class))), (TokenStorage) this.$this_registry.resolveService(new ServiceKey("", P.b(TokenStorage.class))), (SDKMetricsSender) this.$this_registry.resolveService(new ServiceKey("", P.b(SDKMetricsSender.class))));
            }
        }

        public static final class 17 extends u implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 17(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            public final i invoke() {
                return this.$moduleInstance.privacyDataStore((Context) this.$this_registry.resolveService(new ServiceKey("", P.b(Context.class))), (K) this.$this_registry.resolveService(new ServiceKey("io_dispatcher", P.b(K.class))));
            }
        }

        public static final class 170 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 170(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final InitializeStateCreate invoke() {
                return new InitializeStateCreate((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", P.b(ISDKDispatchers.class))));
            }
        }

        public static final class 171 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 171(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final InitializeStateError invoke() {
                return new InitializeStateError((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", P.b(ISDKDispatchers.class))));
            }
        }

        public static final class 172 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 172(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final InitializeStateLoadCache invoke() {
                return new InitializeStateLoadCache((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", P.b(ISDKDispatchers.class))));
            }
        }

        public static final class 173 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 173(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final InitializeStateLoadWeb invoke() {
                return new InitializeStateLoadWeb((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", P.b(ISDKDispatchers.class))), (InitializeStateNetworkError) this.$this_registry.resolveService(new ServiceKey("", P.b(InitializeStateNetworkError.class))), (HttpClient) this.$this_registry.resolveService(new ServiceKey("", P.b(HttpClient.class))));
            }
        }

        public static final class 174 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 174(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final InitializeStateReset invoke() {
                return new InitializeStateReset((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", P.b(ISDKDispatchers.class))));
            }
        }

        public static final class 175 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 175(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final StoreMonitor invoke() {
                return new StoreMonitor((StoreExceptionHandler) this.$this_registry.resolveService(new ServiceKey("", P.b(StoreExceptionHandler.class))));
            }
        }

        public static final class 176 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 176(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final StoreWebViewEventSender invoke() {
                return new StoreWebViewEventSender((IEventSender) this.$this_registry.resolveService(new ServiceKey("", P.b(IEventSender.class))));
            }
        }

        public static final class 177 extends u implements a {
            public static final 177 INSTANCE = new 177();

            public 177() {
                super(0);
            }

            public final StoreExceptionHandler invoke() {
                return new GatewayStoreExceptionHandler();
            }
        }

        public static final class 178 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 178(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final StoreEventListenerFactory invoke() {
                return new StoreEventListenerFactory((StoreWebViewEventSender) this.$this_registry.resolveService(new ServiceKey("", P.b(StoreWebViewEventSender.class))));
            }
        }

        public static final class 179 extends u implements a {
            public static final 179 INSTANCE = new 179();

            public 179() {
                super(0);
            }

            public final ConfigurationReader invoke() {
                return new ConfigurationReader();
            }
        }

        public static final class 18 extends u implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 18(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            public final ByteStringDataSource invoke() {
                return this.$moduleInstance.privacyDataStore((i) this.$this_registry.resolveService(new ServiceKey("privacy.pb", P.b(i.class))));
            }
        }

        public static final class 180 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 180(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final AndroidAttribution invoke() {
                return new AndroidAttribution((Context) this.$this_registry.resolveService(new ServiceKey("", P.b(Context.class))), (ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", P.b(ISDKDispatchers.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(SessionRepository.class))));
            }
        }

        public static final class 181 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 181(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final AdPlayerScope invoke() {
                return new AdPlayerScope((K) this.$this_registry.resolveService(new ServiceKey("default_dispatcher", P.b(K.class))));
            }
        }

        public static final class 182 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 182(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final AndroidWebViewClient invoke() {
                return new AndroidWebViewClient((GetCachedAsset) this.$this_registry.resolveService(new ServiceKey("", P.b(GetCachedAsset.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", P.b(SendDiagnosticEvent.class))));
            }
        }

        public static final class 183 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 183(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final AndroidGetWebViewContainerUseCase invoke() {
                return new AndroidGetWebViewContainerUseCase((Context) this.$this_registry.resolveService(new ServiceKey("", P.b(Context.class))), (AndroidWebViewClient) this.$this_registry.resolveService(new ServiceKey("", P.b(AndroidWebViewClient.class))), (SendWebViewClientErrorDiagnostics) this.$this_registry.resolveService(new ServiceKey("", P.b(SendWebViewClientErrorDiagnostics.class))), (K) this.$this_registry.resolveService(new ServiceKey("main_dispatcher", P.b(K.class))), (K) this.$this_registry.resolveService(new ServiceKey("default_dispatcher", P.b(K.class))));
            }
        }

        public static final class 184 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 184(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final Load invoke() {
                return new AndroidLoad((K) this.$this_registry.resolveService(new ServiceKey("default_dispatcher", P.b(K.class))), (GetAdRequest) this.$this_registry.resolveService(new ServiceKey("", P.b(GetAdRequest.class))), (GetAdPlayerConfigRequest) this.$this_registry.resolveService(new ServiceKey("", P.b(GetAdPlayerConfigRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey("ad_req", P.b(GetRequestPolicy.class))), (HandleGatewayAdResponse) this.$this_registry.resolveService(new ServiceKey("", P.b(HandleGatewayAdResponse.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(SessionRepository.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", P.b(GatewayClient.class))), (AdRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(AdRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", P.b(SendDiagnosticEvent.class))));
            }
        }

        public static final class 185 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 185(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final AwaitInitialization invoke() {
                return new CommonAwaitInitialization((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(SessionRepository.class))));
            }
        }

        public static final class 186 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 186(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final GetAsyncHeaderBiddingToken invoke() {
                return new CommonInitAwaitingGetHeaderBiddingToken((GetHeaderBiddingToken) this.$this_registry.resolveService(new ServiceKey("", P.b(GetHeaderBiddingToken.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", P.b(SendDiagnosticEvent.class))), (GetInitializationState) this.$this_registry.resolveService(new ServiceKey("", P.b(GetInitializationState.class))), (AwaitInitialization) this.$this_registry.resolveService(new ServiceKey("", P.b(AwaitInitialization.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(SessionRepository.class))), (SafeCallbackInvoke) this.$this_registry.resolveService(new ServiceKey("", P.b(SafeCallbackInvoke.class))));
            }
        }

        public static final class 187 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 187(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final GetAdPlayer invoke() {
                return new CommonGetAdPlayer((DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(DeviceInfoRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(SessionRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", P.b(SendDiagnosticEvent.class))), (K) this.$this_registry.resolveService(new ServiceKey("default_dispatcher", P.b(K.class))), (O) this.$this_registry.resolveService(new ServiceKey("", P.b(AdPlayerScope.class))), (OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(OpenMeasurementRepository.class))), (ScarManager) this.$this_registry.resolveService(new ServiceKey("", P.b(ScarManager.class))), (OfferwallManager) this.$this_registry.resolveService(new ServiceKey("", P.b(OfferwallManager.class))), (AdRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(AdRepository.class))), (LifecycleDataSource) this.$this_registry.resolveService(new ServiceKey("", P.b(LifecycleDataSource.class))), (OrientationRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(OrientationRepository.class))), (Context) this.$this_registry.resolveService(new ServiceKey("", P.b(Context.class))));
            }
        }

        public static final class 188 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 188(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final CacheWebViewAssets invoke() {
                return new AndroidCacheWebViewAssets((CacheRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(CacheRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(SessionRepository.class))));
            }
        }

        public static final class 189 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 189(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final HandleGatewayAdResponse invoke() {
                return new AndroidHandleGatewayAdResponse((AdRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(AdRepository.class))), (AndroidGetWebViewContainerUseCase) this.$this_registry.resolveService(new ServiceKey("", P.b(AndroidGetWebViewContainerUseCase.class))), (GetWebViewBridgeUseCase) this.$this_registry.resolveService(new ServiceKey("", P.b(GetWebViewBridgeUseCase.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(DeviceInfoRepository.class))), (HandleInvocationsFromAdViewer) this.$this_registry.resolveService(new ServiceKey("", P.b(HandleInvocationsFromAdViewer.class))), (CampaignRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(CampaignRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", P.b(SendDiagnosticEvent.class))), (GetOperativeEventApi) this.$this_registry.resolveService(new ServiceKey("", P.b(GetOperativeEventApi.class))), (GetLatestWebViewConfiguration) this.$this_registry.resolveService(new ServiceKey("", P.b(GetLatestWebViewConfiguration.class))), (AdPlayerScope) this.$this_registry.resolveService(new ServiceKey("", P.b(AdPlayerScope.class))), (GetAdPlayer) this.$this_registry.resolveService(new ServiceKey("", P.b(GetAdPlayer.class))), (CacheWebViewAssets) this.$this_registry.resolveService(new ServiceKey("", P.b(CacheWebViewAssets.class))));
            }
        }

        public static final class 19 extends u implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 19(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            public final i invoke() {
                return this.$moduleInstance.privacyFsmDataStore((Context) this.$this_registry.resolveService(new ServiceKey("", P.b(Context.class))), (K) this.$this_registry.resolveService(new ServiceKey("io_dispatcher", P.b(K.class))));
            }
        }

        public static final class 190 extends u implements a {
            public static final 190 INSTANCE = new 190();

            public 190() {
                super(0);
            }

            public final HandleInvocationsFromAdViewer invoke() {
                return new HandleInvocationsFromAdViewer();
            }
        }

        public static final class 191 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 191(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final LegacyLoadUseCase invoke() {
                return new LegacyLoadUseCase((Load) this.$this_registry.resolveService(new ServiceKey("", P.b(Load.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", P.b(SendDiagnosticEvent.class))), (GetInitializationState) this.$this_registry.resolveService(new ServiceKey("", P.b(GetInitializationState.class))), (AwaitInitialization) this.$this_registry.resolveService(new ServiceKey("", P.b(AwaitInitialization.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(SessionRepository.class))), (AdRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(AdRepository.class))), (SafeCallbackInvoke) this.$this_registry.resolveService(new ServiceKey("", P.b(SafeCallbackInvoke.class))), (CleanUpWhenOpportunityExpires) this.$this_registry.resolveService(new ServiceKey("", P.b(CleanUpWhenOpportunityExpires.class))));
            }
        }

        public static final class 192 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 192(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final SafeCallbackInvoke invoke() {
                return new CommonSafeCallbackInvoke((K) this.$this_registry.resolveService(new ServiceKey("main_dispatcher", P.b(K.class))));
            }
        }

        public static final class 193 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 193(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final InitializeStateNetworkError invoke() {
                return new InitializeStateNetworkError((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", P.b(ISDKDispatchers.class))));
            }
        }

        public static final class 194 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 194(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final CoroutineTimer invoke() {
                return new CommonCoroutineTimer((K) this.$this_registry.resolveService(new ServiceKey("default_dispatcher", P.b(K.class))));
            }
        }

        public static final class 195 extends u implements a {
            public static final 195 INSTANCE = new 195();

            public 195() {
                super(0);
            }

            public final IEventSender invoke() {
                return SharedInstances.INSTANCE.getWebViewEventSender();
            }
        }

        public static final class 196 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 196(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final SetGameId invoke() {
                return new CommonSetGameId((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(SessionRepository.class))));
            }
        }

        public static final class 197 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 197(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final GetGameId invoke() {
                return new CommonGetGameId((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(SessionRepository.class))));
            }
        }

        public static final class 198 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 198(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final ValidateGameId invoke() {
                return new CommonValidateGameId((GetGameId) this.$this_registry.resolveService(new ServiceKey("", P.b(GetGameId.class))), (SetGameId) this.$this_registry.resolveService(new ServiceKey("", P.b(SetGameId.class))));
            }
        }

        public static final class 199 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 199(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final ShouldAllowInitialization invoke() {
                return new CommonShouldAllowInitialization((AlternativeFlowReader) this.$this_registry.resolveService(new ServiceKey("", P.b(AlternativeFlowReader.class))), (CheckForGameIdAndTestModeChanges) this.$this_registry.resolveService(new ServiceKey("", P.b(CheckForGameIdAndTestModeChanges.class))), (GetInitializationState) this.$this_registry.resolveService(new ServiceKey("", P.b(GetInitializationState.class))), (SetInitializationState) this.$this_registry.resolveService(new ServiceKey("", P.b(SetInitializationState.class))), (ValidateGameId) this.$this_registry.resolveService(new ServiceKey("", P.b(ValidateGameId.class))));
            }
        }

        public static final class 2 extends u implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 2(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            public final K invoke() {
                return this.$moduleInstance.mainDispatcher();
            }
        }

        public static final class 20 extends u implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 20(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            public final ByteStringDataSource invoke() {
                return this.$moduleInstance.privacyFsmDataStore((i) this.$this_registry.resolveService(new ServiceKey("privacy_fsm.pb", P.b(i.class))));
            }
        }

        public static final class 200 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 200(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final CheckForGameIdAndTestModeChanges invoke() {
                return new CommonCheckForGameIdAndTestModeChanges((GetGameId) this.$this_registry.resolveService(new ServiceKey("", P.b(GetGameId.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", P.b(SendDiagnosticEvent.class))));
            }
        }

        public static final class 201 extends u implements a {
            public static final 201 INSTANCE = new 201();

            public 201() {
                super(0);
            }

            public final DownloadPriorityQueue invoke() {
                return new DownloadPriorityQueue();
            }
        }

        public static final class 202 extends u implements a {
            public static final 202 INSTANCE = new 202();

            public 202() {
                super(0);
            }

            public final CleanupDirectory invoke() {
                return new CleanupDirectory();
            }
        }

        public static final class 203 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 203(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final FocusRepository invoke() {
                return new FocusRepository((AndroidGetLifecycleFlow) this.$this_registry.resolveService(new ServiceKey("", P.b(AndroidGetLifecycleFlow.class))), (K) this.$this_registry.resolveService(new ServiceKey("default_dispatcher", P.b(K.class))));
            }
        }

        public static final class 204 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 204(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final AndroidGetIsAdActivity invoke() {
                return new AndroidGetIsAdActivity((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(SessionRepository.class))));
            }
        }

        public static final class 205 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 205(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final AndroidGetLifecycleFlow invoke() {
                return new AndroidGetLifecycleFlow((Context) this.$this_registry.resolveService(new ServiceKey("", P.b(Context.class))));
            }
        }

        public static final class 206 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 206(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final AndroidHandleFocusCounters invoke() {
                return new AndroidHandleFocusCounters((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(SessionRepository.class))), (FocusRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(FocusRepository.class))), (AndroidGetIsAdActivity) this.$this_registry.resolveService(new ServiceKey("", P.b(AndroidGetIsAdActivity.class))), (K) this.$this_registry.resolveService(new ServiceKey("default_dispatcher", P.b(K.class))), null, 16, null);
            }
        }

        public static final class 207 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 207(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final OfferwallAdapterBridge invoke() {
                return new OfferwallAdapterBridge((O) this.$this_registry.resolveService(new ServiceKey("offerwall_scope", P.b(O.class))));
            }
        }

        public static final class 208 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 208(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final OfferwallManager invoke() {
                return new AndroidOfferwallManager((OfferwallAdapterBridge) this.$this_registry.resolveService(new ServiceKey("", P.b(OfferwallAdapterBridge.class))));
            }
        }

        public static final class 209 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 209(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final LoadOfferwallAd invoke() {
                return new LoadOfferwallAd((OfferwallManager) this.$this_registry.resolveService(new ServiceKey("", P.b(OfferwallManager.class))));
            }
        }

        public static final class 21 extends u implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 21(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            public final i invoke() {
                return this.$moduleInstance.nativeConfigurationDataStore((Context) this.$this_registry.resolveService(new ServiceKey("", P.b(Context.class))), (K) this.$this_registry.resolveService(new ServiceKey("io_dispatcher", P.b(K.class))));
            }
        }

        public static final class 210 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 210(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final GetIsOfferwallAdReady invoke() {
                return new GetIsOfferwallAdReady((OfferwallManager) this.$this_registry.resolveService(new ServiceKey("", P.b(OfferwallManager.class))));
            }
        }

        public static final class 211 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 211(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final FIdDataSource invoke() {
                return new AndroidFIdDataSource((Context) this.$this_registry.resolveService(new ServiceKey("", P.b(Context.class))));
            }
        }

        public static final class 212 extends u implements a {
            public static final 212 INSTANCE = new 212();

            public 212() {
                super(0);
            }

            public final FIdExistenceDataSource invoke() {
                return new AndroidFIdExistenceDataSource("com.google.firebase.analytics.FirebaseAnalytics");
            }
        }

        public static final class 213 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 213(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final CleanUpWhenOpportunityExpires invoke() {
                return new CleanUpWhenOpportunityExpires((K) this.$this_registry.resolveService(new ServiceKey("default_dispatcher", P.b(K.class))));
            }
        }

        public static final class 214 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 214(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final OrientationRepository invoke() {
                return new OrientationRepository((AndroidGetLifecycleFlow) this.$this_registry.resolveService(new ServiceKey("", P.b(AndroidGetLifecycleFlow.class))), (K) this.$this_registry.resolveService(new ServiceKey("default_dispatcher", P.b(K.class))));
            }
        }

        public static final class 215 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 215(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final AndroidAppSetIdDataSource invoke() {
                return new AndroidAppSetIdDataSource((Context) this.$this_registry.resolveService(new ServiceKey("", P.b(Context.class))));
            }
        }

        public static final class 216 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 216(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final AndroidUnityInfoDataSource invoke() {
                return new AndroidUnityInfoDataSource((Context) this.$this_registry.resolveService(new ServiceKey("", P.b(Context.class))));
            }
        }

        public static final class 217 extends u implements a {
            public static final 217 INSTANCE = new 217();

            public 217() {
                super(0);
            }

            public final HandleDebugSettings invoke() {
                return new HandleDebugSettings();
            }
        }

        public static final class 218 extends u implements a {
            public static final 218 INSTANCE = new 218();

            public 218() {
                super(0);
            }

            public final Logger invoke() {
                return new UnityLogger();
            }
        }

        public static final class 219 extends u implements a {
            public static final 219 INSTANCE = new 219();

            public 219() {
                super(0);
            }

            public final IsBillingClientAvailable invoke() {
                return new IsBillingClientAvailable();
            }
        }

        public static final class 22 extends u implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 22(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            public final ByteStringDataSource invoke() {
                return this.$moduleInstance.nativeConfigurationDataStore((i) this.$this_registry.resolveService(new ServiceKey("native_configuration.pb", P.b(i.class))));
            }
        }

        public static final class 220 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 220(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final UnityBootConfigDataSource invoke() {
                return new AndroidUnityBootConfigDataSource((Context) this.$this_registry.resolveService(new ServiceKey("", P.b(Context.class))));
            }
        }

        public static final class 23 extends u implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 23(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            public final i invoke() {
                return this.$moduleInstance.glInfoDataStore((Context) this.$this_registry.resolveService(new ServiceKey("", P.b(Context.class))), (K) this.$this_registry.resolveService(new ServiceKey("io_dispatcher", P.b(K.class))), (g) this.$this_registry.resolveService(new ServiceKey("glinfo", P.b(g.class))));
            }
        }

        public static final class 24 extends u implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 24(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            public final ByteStringDataSource invoke() {
                return this.$moduleInstance.glInfoDataStore((i) this.$this_registry.resolveService(new ServiceKey("glinfo.pb", P.b(i.class))));
            }
        }

        public static final class 25 extends u implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 25(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            public final i invoke() {
                return this.$moduleInstance.universalRequestDataStore((Context) this.$this_registry.resolveService(new ServiceKey("", P.b(Context.class))), (K) this.$this_registry.resolveService(new ServiceKey("io_dispatcher", P.b(K.class))));
            }
        }

        public static final class 26 extends u implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 26(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            public final i invoke() {
                return this.$moduleInstance.iapTransactionDataStore((Context) this.$this_registry.resolveService(new ServiceKey("", P.b(Context.class))), (K) this.$this_registry.resolveService(new ServiceKey("io_dispatcher", P.b(K.class))));
            }
        }

        public static final class 27 extends u implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 27(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            public final ByteStringDataSource invoke() {
                return this.$moduleInstance.iapTransactionDataStore((i) this.$this_registry.resolveService(new ServiceKey("iap_transaction.pb", P.b(i.class))));
            }
        }

        public static final class 28 extends u implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 28(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            public final i invoke() {
                return this.$moduleInstance.webViewConfigurationDataStore((Context) this.$this_registry.resolveService(new ServiceKey("", P.b(Context.class))), (K) this.$this_registry.resolveService(new ServiceKey("io_dispatcher", P.b(K.class))));
            }
        }

        public static final class 29 extends u implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 29(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            public final AsyncTokenStorage invoke() {
                return this.$moduleInstance.asyncTokenStorage((TokenStorage) this.$this_registry.resolveService(new ServiceKey("", P.b(TokenStorage.class))), (SDKMetricsSender) this.$this_registry.resolveService(new ServiceKey("", P.b(SDKMetricsSender.class))));
            }
        }

        public static final class 3 extends u implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 3(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            public final K invoke() {
                return this.$moduleInstance.defaultDispatcher();
            }
        }

        public static final class 30 extends u implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 30(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            public final VolumeChangeMonitor invoke() {
                return this.$moduleInstance.volumeChangeMonitor((VolumeChange) this.$this_registry.resolveService(new ServiceKey("", P.b(VolumeChange.class))));
            }
        }

        public static final class 31 extends u implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 31(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            public final JsonStorage invoke() {
                return this.$moduleInstance.publicJsonStorage();
            }
        }

        public static final class 32 extends u implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 32(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            public final JsonStorage invoke() {
                return this.$moduleInstance.privateJsonStorage();
            }
        }

        public static final class 33 extends u implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 33(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            public final JsonStorage invoke() {
                return this.$moduleInstance.memoryJsonStorage();
            }
        }

        public static final class 34 extends u implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 34(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            public final NativeConfigurationOuterClass.NativeConfiguration invoke() {
                return this.$moduleInstance.defaultNativeConfiguration();
            }
        }

        public static final class 35 extends u implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 35(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            public final MeasurementsService invoke() {
                return this.$moduleInstance.measurementService((Context) this.$this_registry.resolveService(new ServiceKey("", P.b(Context.class))), (ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", P.b(ISDKDispatchers.class))));
            }
        }

        public static final class 36 extends u implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 36(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            public final TopicsService invoke() {
                return this.$moduleInstance.topicsService((Context) this.$this_registry.resolveService(new ServiceKey("", P.b(Context.class))), (ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", P.b(ISDKDispatchers.class))));
            }
        }

        public static final class 37 extends u implements a {
            public static final 37 INSTANCE = new 37();

            public 37() {
                super(0);
            }

            public final CronetEngineBuilderFactory invoke() {
                return new CronetEngineBuilderFactory();
            }
        }

        public static final class 38 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 38(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final HttpClientProvider invoke() {
                return new AndroidHttpClientProvider((ConfigFileFromLocalStorage) this.$this_registry.resolveService(new ServiceKey("", P.b(ConfigFileFromLocalStorage.class))), (AlternativeFlowReader) this.$this_registry.resolveService(new ServiceKey("", P.b(AlternativeFlowReader.class))), (ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", P.b(ISDKDispatchers.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", P.b(SendDiagnosticEvent.class))), (Context) this.$this_registry.resolveService(new ServiceKey("", P.b(Context.class))), (CronetEngineBuilderFactory) this.$this_registry.resolveService(new ServiceKey("", P.b(CronetEngineBuilderFactory.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(SessionRepository.class))), (CleanupDirectory) this.$this_registry.resolveService(new ServiceKey("", P.b(CleanupDirectory.class))), (MediationTraitsMetadataReader) this.$this_registry.resolveService(new ServiceKey("", P.b(MediationTraitsMetadataReader.class))));
            }
        }

        public static final class 39 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            @f(c = "com.unity3d.services.core.di.ServiceProvider$initialize$1$39$1", f = "ServiceProvider.kt", l = {460}, m = "invokeSuspend")
            public static final class 1 extends Ia.l implements p {
                final /* synthetic */ ServicesRegistry $this_registry;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public 1(ServicesRegistry servicesRegistry, e eVar) {
                    super(2, eVar);
                    this.$this_registry = servicesRegistry;
                }

                public final e create(Object obj, e eVar) {
                    return new 1(this.$this_registry, eVar);
                }

                public final Object invoke(O o, e eVar) {
                    return ((1) create(o, eVar)).invokeSuspend(I.a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f = c.f();
                    int i = this.label;
                    if (i == 0) {
                        Ca.t.b(obj);
                        HttpClientProvider httpClientProvider = (HttpClientProvider) this.$this_registry.resolveService(new ServiceKey("", P.b(HttpClientProvider.class)));
                        this.label = 1;
                        obj = HttpClientProvider.DefaultImpls.invoke$default(httpClientProvider, false, this, 1, null);
                        if (obj == f) {
                            return f;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Ca.t.b(obj);
                    }
                    return obj;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 39(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final HttpClient invoke() {
                return (HttpClient) cb.i.f(null, new 1(this.$this_registry, null), 1, null);
            }
        }

        public static final class 4 extends u implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 4(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            public final K invoke() {
                return this.$moduleInstance.ioDispatcher();
            }
        }

        public static final class 40 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            @f(c = "com.unity3d.services.core.di.ServiceProvider$initialize$1$40$1", f = "ServiceProvider.kt", l = {461}, m = "invokeSuspend")
            public static final class 1 extends Ia.l implements p {
                final /* synthetic */ ServicesRegistry $this_registry;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public 1(ServicesRegistry servicesRegistry, e eVar) {
                    super(2, eVar);
                    this.$this_registry = servicesRegistry;
                }

                public final e create(Object obj, e eVar) {
                    return new 1(this.$this_registry, eVar);
                }

                public final Object invoke(O o, e eVar) {
                    return ((1) create(o, eVar)).invokeSuspend(I.a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f = c.f();
                    int i = this.label;
                    if (i == 0) {
                        Ca.t.b(obj);
                        HttpClientProvider httpClientProvider = (HttpClientProvider) this.$this_registry.resolveService(new ServiceKey("", P.b(HttpClientProvider.class)));
                        this.label = 1;
                        obj = httpClientProvider.invoke(true, this);
                        if (obj == f) {
                            return f;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Ca.t.b(obj);
                    }
                    return obj;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 40(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final HttpClient invoke() {
                return (HttpClient) cb.i.f(null, new 1(this.$this_registry, null), 1, null);
            }
        }

        public static final class 41 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 41(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final MediationTraitsMetadataReader invoke() {
                return new MediationTraitsMetadataReader((JsonStorage) this.$this_registry.resolveService(new ServiceKey("MEMORY", P.b(JsonStorage.class))));
            }
        }

        public static final class 42 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 42(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final AlternativeFlowReader invoke() {
                return new CommonAlternativeFlowReader((ConfigurationReader) this.$this_registry.resolveService(new ServiceKey("", P.b(ConfigurationReader.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(SessionRepository.class))), (MediationTraitsMetadataReader) this.$this_registry.resolveService(new ServiceKey("", P.b(MediationTraitsMetadataReader.class))));
            }
        }

        public static final class 43 extends u implements a {
            public static final 43 INSTANCE = new 43();

            public 43() {
                super(0);
            }

            public final TcfDataSource invoke() {
                return new AndroidTcfDataSource();
            }
        }

        public static final class 44 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 44(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final TcfRepository invoke() {
                return new AndroidTcfRepository((TcfDataSource) this.$this_registry.resolveService(new ServiceKey("", P.b(TcfDataSource.class))));
            }
        }

        public static final class 45 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 45(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final AndroidManifestIntPropertyReader invoke() {
                return new AndroidManifestIntPropertyReader((Context) this.$this_registry.resolveService(new ServiceKey("", P.b(Context.class))));
            }
        }

        public static final class 46 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 46(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final AndroidTestDataInfo invoke() {
                return new AndroidTestDataInfo((AndroidManifestIntPropertyReader) this.$this_registry.resolveService(new ServiceKey("", P.b(AndroidManifestIntPropertyReader.class))));
            }
        }

        public static final class 47 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 47(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final GameServerIdReader invoke() {
                return new GameServerIdReader((JsonStorage) this.$this_registry.resolveService(new ServiceKey("PUBLIC", P.b(JsonStorage.class))));
            }
        }

        public static final class 48 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 48(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final StoreDataSource invoke() {
                return new AndroidStoreDataSource((Context) this.$this_registry.resolveService(new ServiceKey("", P.b(Context.class))));
            }
        }

        public static final class 49 extends u implements a {
            public static final 49 INSTANCE = new 49();

            public 49() {
                super(0);
            }

            public final AnalyticsDataSource invoke() {
                return new AndroidAnalyticsDataSource();
            }
        }

        public static final class 5 extends u implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 5(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            public final ISDKDispatchers invoke() {
                return this.$moduleInstance.sdkDispatchers();
            }
        }

        public static final class 50 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 50(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final DeveloperConsentDataSource invoke() {
                return new AndroidDeveloperConsentDataSource((FlattenerRulesUseCase) this.$this_registry.resolveService(new ServiceKey("dev_consent_privacy_rules", P.b(FlattenerRulesUseCase.class))), (JsonStorage) this.$this_registry.resolveService(new ServiceKey("PUBLIC", P.b(JsonStorage.class))));
            }
        }

        public static final class 51 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 51(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final DynamicDeviceInfoDataSource invoke() {
                return new AndroidDynamicDeviceInfoDataSource((Context) this.$this_registry.resolveService(new ServiceKey("", P.b(Context.class))), (LifecycleDataSource) this.$this_registry.resolveService(new ServiceKey("", P.b(LifecycleDataSource.class))));
            }
        }

        public static final class 52 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 52(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final LegacyUserConsentDataSource invoke() {
                return new AndroidLegacyUserConsentDataSource((FlattenerRulesUseCase) this.$this_registry.resolveService(new ServiceKey("legacy_privacy_rules", P.b(FlattenerRulesUseCase.class))), (JsonStorage) this.$this_registry.resolveService(new ServiceKey("PRIVATE", P.b(JsonStorage.class))));
            }
        }

        public static final class 53 extends u implements a {
            public static final 53 INSTANCE = new 53();

            public 53() {
                super(0);
            }

            public final LifecycleDataSource invoke() {
                return new AndroidLifecycleDataSource();
            }
        }

        public static final class 54 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 54(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final CacheDataSource invoke() {
                return new AndroidLocalCacheDataSource((CreateFile) this.$this_registry.resolveService(new ServiceKey("", P.b(CreateFile.class))), (GetFileExtensionFromUrl) this.$this_registry.resolveService(new ServiceKey("", P.b(GetFileExtensionFromUrl.class))));
            }
        }

        public static final class 55 extends u implements a {
            public static final 55 INSTANCE = new 55();

            public 55() {
                super(0);
            }

            public final CreateFile invoke() {
                return new CommonCreateFile();
            }
        }

        public static final class 56 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 56(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final GetFileExtensionFromUrl invoke() {
                return new CommonGetFileExtensionFromUrl((RemoveUrlQuery) this.$this_registry.resolveService(new ServiceKey("", P.b(RemoveUrlQuery.class))));
            }
        }

        public static final class 57 extends u implements a {
            public static final 57 INSTANCE = new 57();

            public 57() {
                super(0);
            }

            public final RemoveUrlQuery invoke() {
                return new AndroidRemoveUrlQuery();
            }
        }

        public static final class 58 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 58(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final MediationDataSource invoke() {
                return new AndroidMediationDataSource((JsonStorage) this.$this_registry.resolveService(new ServiceKey("MEMORY", P.b(JsonStorage.class))));
            }
        }

        public static final class 59 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 59(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final PrivacyDeviceInfoDataSource invoke() {
                return new AndroidPrivacyDeviceInfoDataSource((Context) this.$this_registry.resolveService(new ServiceKey("", P.b(Context.class))), (FIdDataSource) this.$this_registry.resolveService(new ServiceKey("", P.b(FIdDataSource.class))), (AndroidAppSetIdDataSource) this.$this_registry.resolveService(new ServiceKey("", P.b(AndroidAppSetIdDataSource.class))));
            }
        }

        public static final class 6 extends u implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 6(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            public final SDKMetricsSender invoke() {
                return this.$moduleInstance.sdkMetrics();
            }
        }

        public static final class 60 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 60(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final CacheDataSource invoke() {
                return new AndroidRemoteCacheDataSource((K) this.$this_registry.resolveService(new ServiceKey("io_dispatcher", P.b(K.class))), (CreateFile) this.$this_registry.resolveService(new ServiceKey("", P.b(CreateFile.class))), (GetFileExtensionFromUrl) this.$this_registry.resolveService(new ServiceKey("", P.b(GetFileExtensionFromUrl.class))), (HttpClient) this.$this_registry.resolveService(new ServiceKey("", P.b(HttpClient.class))));
            }
        }

        public static final class 61 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 61(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final StaticDeviceInfoDataSource invoke() {
                return new AndroidStaticDeviceInfoDataSource((Context) this.$this_registry.resolveService(new ServiceKey("", P.b(Context.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey("glinfo.pb", P.b(ByteStringDataSource.class))), (AnalyticsDataSource) this.$this_registry.resolveService(new ServiceKey("", P.b(AnalyticsDataSource.class))), (StoreDataSource) this.$this_registry.resolveService(new ServiceKey("", P.b(StoreDataSource.class))), (UnityBootConfigDataSource) this.$this_registry.resolveService(new ServiceKey("", P.b(UnityBootConfigDataSource.class))));
            }
        }

        public static final class 62 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 62(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final g invoke() {
                return new FetchGLInfoDataMigration((GetOpenGLRendererInfo) this.$this_registry.resolveService(new ServiceKey("", P.b(GetOpenGLRendererInfo.class))));
            }
        }

        public static final class 63 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 63(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final UniversalRequestDataSource invoke() {
                return new UniversalRequestDataSource((i) this.$this_registry.resolveService(new ServiceKey("universal_request.pb", P.b(i.class))));
            }
        }

        public static final class 64 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 64(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final WebviewConfigurationDataSource invoke() {
                return new WebviewConfigurationDataSource((i) this.$this_registry.resolveService(new ServiceKey("webview_config.pb", P.b(i.class))));
            }
        }

        public static final class 65 extends u implements a {
            public static final 65 INSTANCE = new 65();

            public 65() {
                super(0);
            }

            public final OmidManager invoke() {
                return new AndroidOmidManager();
            }
        }

        public static final class 66 extends u implements a {
            public static final 66 INSTANCE = new 66();

            public 66() {
                super(0);
            }

            public final SDKPropertiesManager invoke() {
                return new AndroidSDKPropertiesManager();
            }
        }

        public static final class 67 extends u implements a {
            public static final 67 INSTANCE = new 67();

            public 67() {
                super(0);
            }

            public final StorageManager invoke() {
                return new AndroidStorageManager();
            }
        }

        public static final class 68 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 68(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final BillingClientAdapter invoke() {
                return new BillingClientAdapterFactory().createBillingClientAdapter((Context) this.$this_registry.resolveService(new ServiceKey("", P.b(Context.class))));
            }
        }

        public static final class 69 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 69(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final ProductDetailsFetcher invoke() {
                return new ProductDetailsFetcherWithFallback(new CommonProductDetailsFetcher((BillingClientAdapter) this.$this_registry.resolveService(new ServiceKey("", P.b(BillingClientAdapter.class))), "inapp"), new CommonProductDetailsFetcher((BillingClientAdapter) this.$this_registry.resolveService(new ServiceKey("", P.b(BillingClientAdapter.class))), "subs"));
            }
        }

        public static final class 7 extends u implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 7(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            public final O invoke() {
                return this.$moduleInstance.initCoroutineScope((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", P.b(ISDKDispatchers.class))), (L) this.$this_registry.resolveService(new ServiceKey("sdk", P.b(L.class))), (B0) this.$this_registry.resolveService(new ServiceKey("public_job", P.b(B0.class))));
            }
        }

        public static final class 70 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 70(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final TransactionEventManager invoke() {
                return new TransactionEventManager((O) this.$this_registry.resolveService(new ServiceKey("transaction_scope", P.b(O.class))), (BillingClientAdapter) this.$this_registry.resolveService(new ServiceKey("", P.b(BillingClientAdapter.class))), (GetTransactionData) this.$this_registry.resolveService(new ServiceKey("", P.b(GetTransactionData.class))), (GetTransactionRequest) this.$this_registry.resolveService(new ServiceKey("", P.b(GetTransactionRequest.class))), (TransactionEventRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(TransactionEventRepository.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey("iap_transaction.pb", P.b(ByteStringDataSource.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", P.b(SendDiagnosticEvent.class))), (IsBillingClientAvailable) this.$this_registry.resolveService(new ServiceKey("", P.b(IsBillingClientAvailable.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(SessionRepository.class))), (ProductDetailsFetcher) this.$this_registry.resolveService(new ServiceKey("", P.b(ProductDetailsFetcher.class))));
            }
        }

        public static final class 71 extends u implements a {
            public static final 71 INSTANCE = new 71();

            public 71() {
                super(0);
            }

            public final AdRepository invoke() {
                return new AndroidAdRepository();
            }
        }

        public static final class 72 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 72(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final CacheRepository invoke() {
                return new AndroidCacheRepository((K) this.$this_registry.resolveService(new ServiceKey("io_dispatcher", P.b(K.class))), (GetCacheDirectory) this.$this_registry.resolveService(new ServiceKey("", P.b(GetCacheDirectory.class))), (CacheDataSource) this.$this_registry.resolveService(new ServiceKey("local", P.b(CacheDataSource.class))), (CacheDataSource) this.$this_registry.resolveService(new ServiceKey("remote", P.b(CacheDataSource.class))), (Context) this.$this_registry.resolveService(new ServiceKey("", P.b(Context.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(SessionRepository.class))), (CleanupDirectory) this.$this_registry.resolveService(new ServiceKey("", P.b(CleanupDirectory.class))), (DownloadPriorityQueue) this.$this_registry.resolveService(new ServiceKey("", P.b(DownloadPriorityQueue.class))), (CreateFile) this.$this_registry.resolveService(new ServiceKey("", P.b(CreateFile.class))));
            }
        }

        public static final class 73 extends u implements a {
            public static final 73 INSTANCE = new 73();

            public 73() {
                super(0);
            }

            public final GetCacheDirectory invoke() {
                return new CommonGetCacheDirectory();
            }
        }

        public static final class 74 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 74(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final CampaignRepository invoke() {
                return new AndroidCampaignRepository((GetSharedDataTimestamps) this.$this_registry.resolveService(new ServiceKey("", P.b(GetSharedDataTimestamps.class))));
            }
        }

        public static final class 75 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 75(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final DeveloperConsentRepository invoke() {
                return new AndroidDeveloperConsentRepository((DeveloperConsentDataSource) this.$this_registry.resolveService(new ServiceKey("", P.b(DeveloperConsentDataSource.class))));
            }
        }

        public static final class 76 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 76(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final DeviceInfoRepository invoke() {
                return new AndroidDeviceInfoRepository((StaticDeviceInfoDataSource) this.$this_registry.resolveService(new ServiceKey("", P.b(StaticDeviceInfoDataSource.class))), (DynamicDeviceInfoDataSource) this.$this_registry.resolveService(new ServiceKey("", P.b(DynamicDeviceInfoDataSource.class))), (PrivacyDeviceInfoDataSource) this.$this_registry.resolveService(new ServiceKey("", P.b(PrivacyDeviceInfoDataSource.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(SessionRepository.class))));
            }
        }

        public static final class 77 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 77(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final DiagnosticEventRepository invoke() {
                return new AndroidDiagnosticEventRepository((CoroutineTimer) this.$this_registry.resolveService(new ServiceKey("", P.b(CoroutineTimer.class))), (GetDiagnosticEventRequest) this.$this_registry.resolveService(new ServiceKey("", P.b(GetDiagnosticEventRequest.class))), (K) this.$this_registry.resolveService(new ServiceKey("default_dispatcher", P.b(K.class))));
            }
        }

        public static final class 78 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 78(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final LegacyUserConsentRepository invoke() {
                return new AndroidLegacyUserConsentRepository((LegacyUserConsentDataSource) this.$this_registry.resolveService(new ServiceKey("", P.b(LegacyUserConsentDataSource.class))));
            }
        }

        public static final class 79 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 79(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final MediationRepository invoke() {
                return new AndroidMediationRepository((MediationDataSource) this.$this_registry.resolveService(new ServiceKey("", P.b(MediationDataSource.class))));
            }
        }

        public static final class 8 extends u implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 8(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            public final O invoke() {
                return this.$moduleInstance.loadCoroutineScope((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", P.b(ISDKDispatchers.class))), (L) this.$this_registry.resolveService(new ServiceKey("sdk", P.b(L.class))), (B0) this.$this_registry.resolveService(new ServiceKey("public_job", P.b(B0.class))));
            }
        }

        public static final class 80 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 80(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final OpenMeasurementRepository invoke() {
                return new AndroidOpenMeasurementRepository((K) this.$this_registry.resolveService(new ServiceKey("main_dispatcher", P.b(K.class))), (OmidManager) this.$this_registry.resolveService(new ServiceKey("", P.b(OmidManager.class))));
            }
        }

        public static final class 81 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 81(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final SessionRepository invoke() {
                return new AndroidSessionRepository((ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey("gateway_cache.pb", P.b(ByteStringDataSource.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey("privacy.pb", P.b(ByteStringDataSource.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey("privacy_fsm.pb", P.b(ByteStringDataSource.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey("native_configuration.pb", P.b(ByteStringDataSource.class))), (AndroidUnityInfoDataSource) this.$this_registry.resolveService(new ServiceKey("", P.b(AndroidUnityInfoDataSource.class))), (NativeConfigurationOuterClass.NativeConfiguration) this.$this_registry.resolveService(new ServiceKey("", P.b(NativeConfigurationOuterClass.NativeConfiguration.class))), (K) this.$this_registry.resolveService(new ServiceKey("io_dispatcher", P.b(K.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", P.b(SendDiagnosticEvent.class))));
            }
        }

        public static final class 82 extends u implements a {
            public static final 82 INSTANCE = new 82();

            public 82() {
                super(0);
            }

            public final TransactionEventRepository invoke() {
                return new AndroidTransactionEventRepository();
            }
        }

        public static final class 83 extends u implements a {
            public static final 83 INSTANCE = new 83();

            public 83() {
                super(0);
            }

            public final OperativeEventRepository invoke() {
                return new OperativeEventRepository();
            }
        }

        public static final class 84 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 84(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final ExecuteAdViewerRequest invoke() {
                return new AndroidExecuteAdViewerRequest((K) this.$this_registry.resolveService(new ServiceKey("io_dispatcher", P.b(K.class))), (HttpClient) this.$this_registry.resolveService(new ServiceKey("", P.b(HttpClient.class))), (GetCachedAsset) this.$this_registry.resolveService(new ServiceKey("", P.b(GetCachedAsset.class))));
            }
        }

        public static final class 85 extends u implements a {
            public static final 85 INSTANCE = new 85();

            public 85() {
                super(0);
            }

            public final GetByteStringId invoke() {
                return new AndroidGenerateByteStringId();
            }
        }

        public static final class 86 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 86(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final HandleOpenUrl invoke() {
                return new AndroidHandleOpenUrl((Context) this.$this_registry.resolveService(new ServiceKey("", P.b(Context.class))));
            }
        }

        public static final class 87 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 87(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final Refresh invoke() {
                return new AndroidRefresh((K) this.$this_registry.resolveService(new ServiceKey("default_dispatcher", P.b(K.class))), (GetAdDataRefreshRequest) this.$this_registry.resolveService(new ServiceKey("", P.b(GetAdDataRefreshRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey("ad_req", P.b(GetRequestPolicy.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", P.b(GatewayClient.class))));
            }
        }

        public static final class 88 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 88(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final SendDiagnosticEvent invoke() {
                return new AndroidSendDiagnosticEvent((DiagnosticEventRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(DiagnosticEventRepository.class))), (GetDiagnosticEventRequest) this.$this_registry.resolveService(new ServiceKey("", P.b(GetDiagnosticEventRequest.class))), (LifecycleDataSource) this.$this_registry.resolveService(new ServiceKey("", P.b(LifecycleDataSource.class))));
            }
        }

        public static final class 89 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 89(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final SendWebViewClientErrorDiagnostics invoke() {
                return new AndroidSendWebViewClientErrorDiagnostics((SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", P.b(SendDiagnosticEvent.class))));
            }
        }

        public static final class 9 extends u implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 9(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            public final O invoke() {
                return this.$moduleInstance.showCoroutineScope((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", P.b(ISDKDispatchers.class))), (L) this.$this_registry.resolveService(new ServiceKey("sdk", P.b(L.class))), (B0) this.$this_registry.resolveService(new ServiceKey("public_job", P.b(B0.class))));
            }
        }

        public static final class 90 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 90(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final Show invoke() {
                return new AndroidShow((AdRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(AdRepository.class))), (GameServerIdReader) this.$this_registry.resolveService(new ServiceKey("", P.b(GameServerIdReader.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", P.b(SendDiagnosticEvent.class))));
            }
        }

        public static final class 91 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 91(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final CacheFile invoke() {
                return new CommonCacheFile((CacheRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(CacheRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", P.b(SendDiagnosticEvent.class))));
            }
        }

        public static final class 92 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 92(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final CleanAssets invoke() {
                return new CommonCleanAssets((CacheRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(CacheRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", P.b(SendDiagnosticEvent.class))));
            }
        }

        public static final class 93 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 93(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final GetAdObject invoke() {
                return new CommonGetAdObject((AdRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(AdRepository.class))));
            }
        }

        public static final class 94 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 94(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final GetHeaderBiddingToken invoke() {
                return new CommonGetHeaderBiddingToken((BuildHeaderBiddingToken) this.$this_registry.resolveService(new ServiceKey("", P.b(BuildHeaderBiddingToken.class))), (FetchSignalsAndSendUseCase) this.$this_registry.resolveService(new ServiceKey("", P.b(FetchSignalsAndSendUseCase.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(SessionRepository.class))));
            }
        }

        public static final class 95 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 95(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final BuildHeaderBiddingToken invoke() {
                return new AndroidBuildHeaderBiddingToken((GetByteStringId) this.$this_registry.resolveService(new ServiceKey("", P.b(GetByteStringId.class))), (GetClientInfo) this.$this_registry.resolveService(new ServiceKey("", P.b(GetClientInfo.class))), (GetSharedDataTimestamps) this.$this_registry.resolveService(new ServiceKey("", P.b(GetSharedDataTimestamps.class))), (GetLimitedSessionToken) this.$this_registry.resolveService(new ServiceKey("", P.b(GetLimitedSessionToken.class))), (GetInitializationData) this.$this_registry.resolveService(new ServiceKey("", P.b(GetInitializationData.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(DeviceInfoRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(SessionRepository.class))), (CampaignRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(CampaignRepository.class))), (TcfRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(TcfRepository.class))), (AndroidTestDataInfo) this.$this_registry.resolveService(new ServiceKey("", P.b(AndroidTestDataInfo.class))), (OfferwallManager) this.$this_registry.resolveService(new ServiceKey("", P.b(OfferwallManager.class))));
            }
        }

        public static final class 96 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 96(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final TokenNumberProvider invoke() {
                return new CommonTokenNumberProvider((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(SessionRepository.class))));
            }
        }

        public static final class 97 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 97(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final GetInitializationData invoke() {
                return new AndroidGetInitializationData((GetInitializationRequestPayload) this.$this_registry.resolveService(new ServiceKey("", P.b(GetInitializationRequestPayload.class))), (GetUniversalRequestSharedData) this.$this_registry.resolveService(new ServiceKey("", P.b(GetUniversalRequestSharedData.class))));
            }
        }

        public static final class 98 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 98(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final MediationInitBlobMetadataReader invoke() {
                return new MediationInitBlobMetadataReader((JsonStorage) this.$this_registry.resolveService(new ServiceKey("MEMORY", P.b(JsonStorage.class))));
            }
        }

        public static final class 99 extends u implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 99(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            public final GetInitializationRequestPayload invoke() {
                return new AndroidGetInitializationRequestPayload((GetClientInfo) this.$this_registry.resolveService(new ServiceKey("", P.b(GetClientInfo.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(SessionRepository.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(DeviceInfoRepository.class))), (LegacyUserConsentRepository) this.$this_registry.resolveService(new ServiceKey("", P.b(LegacyUserConsentRepository.class))), (MediationInitBlobMetadataReader) this.$this_registry.resolveService(new ServiceKey("", P.b(MediationInitBlobMetadataReader.class))));
            }
        }

        public 1() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ServicesRegistry) obj);
            return I.a;
        }

        public final void invoke(ServicesRegistry registry) {
            t.g(registry, "$this$registry");
            UnityAdsModule unityAdsModule = new UnityAdsModule();
            registry.updateService(new ServiceKey("", P.b(Context.class)), m.b(1.INSTANCE));
            registry.updateService(new ServiceKey("main_dispatcher", P.b(K.class)), m.b(new 2(unityAdsModule)));
            registry.updateService(new ServiceKey("default_dispatcher", P.b(K.class)), m.b(new 3(unityAdsModule)));
            registry.updateService(new ServiceKey("io_dispatcher", P.b(K.class)), m.b(new 4(unityAdsModule)));
            registry.updateService(new ServiceKey("", P.b(ISDKDispatchers.class)), m.b(new 5(unityAdsModule)));
            registry.updateService(new ServiceKey("", P.b(SDKMetricsSender.class)), m.b(new 6(unityAdsModule)));
            registry.updateService(new ServiceKey("init_scope", P.b(O.class)), ServiceFactoryKt.factoryOf(new 7(unityAdsModule, registry)));
            registry.updateService(new ServiceKey("load_scope", P.b(O.class)), ServiceFactoryKt.factoryOf(new 8(unityAdsModule, registry)));
            registry.updateService(new ServiceKey("show_scope", P.b(O.class)), ServiceFactoryKt.factoryOf(new 9(unityAdsModule, registry)));
            registry.updateService(new ServiceKey("transaction_scope", P.b(O.class)), ServiceFactoryKt.factoryOf(new 10(unityAdsModule, registry)));
            registry.updateService(new ServiceKey("get_token_scope", P.b(O.class)), ServiceFactoryKt.factoryOf(new 11(unityAdsModule, registry)));
            registry.updateService(new ServiceKey("scar_scope", P.b(O.class)), ServiceFactoryKt.factoryOf(new 12(unityAdsModule, registry)));
            registry.updateService(new ServiceKey("offerwall_scope", P.b(O.class)), ServiceFactoryKt.factoryOf(new 13(unityAdsModule, registry)));
            registry.updateService(new ServiceKey("omid_scope", P.b(O.class)), ServiceFactoryKt.factoryOf(new 14(unityAdsModule, registry)));
            registry.updateService(new ServiceKey("public_job", P.b(B0.class)), ServiceFactoryKt.factoryOf(new 15(unityAdsModule, registry)));
            registry.updateService(new ServiceKey("gateway_cache.pb", P.b(ByteStringDataSource.class)), m.b(new 16(registry)));
            registry.updateService(new ServiceKey("privacy.pb", P.b(i.class)), m.b(new 17(unityAdsModule, registry)));
            registry.updateService(new ServiceKey("privacy.pb", P.b(ByteStringDataSource.class)), m.b(new 18(unityAdsModule, registry)));
            registry.updateService(new ServiceKey("privacy_fsm.pb", P.b(i.class)), m.b(new 19(unityAdsModule, registry)));
            registry.updateService(new ServiceKey("privacy_fsm.pb", P.b(ByteStringDataSource.class)), m.b(new 20(unityAdsModule, registry)));
            registry.updateService(new ServiceKey("native_configuration.pb", P.b(i.class)), m.b(new 21(unityAdsModule, registry)));
            registry.updateService(new ServiceKey("native_configuration.pb", P.b(ByteStringDataSource.class)), m.b(new 22(unityAdsModule, registry)));
            registry.updateService(new ServiceKey("glinfo.pb", P.b(i.class)), m.b(new 23(unityAdsModule, registry)));
            registry.updateService(new ServiceKey("glinfo.pb", P.b(ByteStringDataSource.class)), m.b(new 24(unityAdsModule, registry)));
            registry.updateService(new ServiceKey("universal_request.pb", P.b(i.class)), m.b(new 25(unityAdsModule, registry)));
            registry.updateService(new ServiceKey("iap_transaction.pb", P.b(i.class)), m.b(new 26(unityAdsModule, registry)));
            registry.updateService(new ServiceKey("iap_transaction.pb", P.b(ByteStringDataSource.class)), m.b(new 27(unityAdsModule, registry)));
            registry.updateService(new ServiceKey("webview_config.pb", P.b(i.class)), m.b(new 28(unityAdsModule, registry)));
            registry.updateService(new ServiceKey("", P.b(AsyncTokenStorage.class)), m.b(new 29(unityAdsModule, registry)));
            registry.updateService(new ServiceKey("", P.b(VolumeChangeMonitor.class)), m.b(new 30(unityAdsModule, registry)));
            registry.updateService(new ServiceKey("PUBLIC", P.b(JsonStorage.class)), m.b(new 31(unityAdsModule)));
            registry.updateService(new ServiceKey("PRIVATE", P.b(JsonStorage.class)), m.b(new 32(unityAdsModule)));
            registry.updateService(new ServiceKey("MEMORY", P.b(JsonStorage.class)), m.b(new 33(unityAdsModule)));
            registry.updateService(new ServiceKey("", P.b(NativeConfigurationOuterClass.NativeConfiguration.class)), m.b(new 34(unityAdsModule)));
            registry.updateService(new ServiceKey("", P.b(MeasurementsService.class)), m.b(new 35(unityAdsModule, registry)));
            registry.updateService(new ServiceKey("", P.b(TopicsService.class)), m.b(new 36(unityAdsModule, registry)));
            registry.updateService(new ServiceKey("", P.b(CronetEngineBuilderFactory.class)), m.b(37.INSTANCE));
            registry.updateService(new ServiceKey("", P.b(HttpClientProvider.class)), m.b(new 38(registry)));
            registry.updateService(new ServiceKey("", P.b(HttpClient.class)), m.b(new 39(registry)));
            registry.updateService(new ServiceKey("gateway_http_client", P.b(HttpClient.class)), m.b(new 40(registry)));
            registry.updateService(new ServiceKey("", P.b(MediationTraitsMetadataReader.class)), ServiceFactoryKt.factoryOf(new 41(registry)));
            registry.updateService(new ServiceKey("", P.b(AlternativeFlowReader.class)), m.b(new 42(registry)));
            registry.updateService(new ServiceKey("", P.b(TcfDataSource.class)), m.b(43.INSTANCE));
            registry.updateService(new ServiceKey("", P.b(TcfRepository.class)), m.b(new 44(registry)));
            registry.updateService(new ServiceKey("", P.b(AndroidManifestIntPropertyReader.class)), m.b(new 45(registry)));
            registry.updateService(new ServiceKey("", P.b(AndroidTestDataInfo.class)), m.b(new 46(registry)));
            registry.updateService(new ServiceKey("", P.b(GameServerIdReader.class)), m.b(new 47(registry)));
            registry.updateService(new ServiceKey("", P.b(StoreDataSource.class)), m.b(new 48(registry)));
            registry.updateService(new ServiceKey("", P.b(AnalyticsDataSource.class)), m.b(49.INSTANCE));
            registry.updateService(new ServiceKey("", P.b(DeveloperConsentDataSource.class)), m.b(new 50(registry)));
            registry.updateService(new ServiceKey("", P.b(DynamicDeviceInfoDataSource.class)), m.b(new 51(registry)));
            registry.updateService(new ServiceKey("", P.b(LegacyUserConsentDataSource.class)), m.b(new 52(registry)));
            registry.updateService(new ServiceKey("", P.b(LifecycleDataSource.class)), m.b(53.INSTANCE));
            registry.updateService(new ServiceKey("local", P.b(CacheDataSource.class)), m.b(new 54(registry)));
            registry.updateService(new ServiceKey("", P.b(CreateFile.class)), m.b(55.INSTANCE));
            registry.updateService(new ServiceKey("", P.b(GetFileExtensionFromUrl.class)), m.b(new 56(registry)));
            registry.updateService(new ServiceKey("", P.b(RemoveUrlQuery.class)), m.b(57.INSTANCE));
            registry.updateService(new ServiceKey("", P.b(MediationDataSource.class)), m.b(new 58(registry)));
            registry.updateService(new ServiceKey("", P.b(PrivacyDeviceInfoDataSource.class)), m.b(new 59(registry)));
            registry.updateService(new ServiceKey("remote", P.b(CacheDataSource.class)), m.b(new 60(registry)));
            registry.updateService(new ServiceKey("", P.b(StaticDeviceInfoDataSource.class)), m.b(new 61(registry)));
            registry.updateService(new ServiceKey("glinfo", P.b(g.class)), m.b(new 62(registry)));
            registry.updateService(new ServiceKey("", P.b(UniversalRequestDataSource.class)), m.b(new 63(registry)));
            registry.updateService(new ServiceKey("", P.b(WebviewConfigurationDataSource.class)), m.b(new 64(registry)));
            registry.updateService(new ServiceKey("", P.b(OmidManager.class)), m.b(65.INSTANCE));
            registry.updateService(new ServiceKey("", P.b(SDKPropertiesManager.class)), m.b(66.INSTANCE));
            registry.updateService(new ServiceKey("", P.b(StorageManager.class)), m.b(67.INSTANCE));
            registry.updateService(new ServiceKey("", P.b(BillingClientAdapter.class)), m.b(new 68(registry)));
            registry.updateService(new ServiceKey("", P.b(ProductDetailsFetcher.class)), m.b(new 69(registry)));
            registry.updateService(new ServiceKey("", P.b(TransactionEventManager.class)), m.b(new 70(registry)));
            registry.updateService(new ServiceKey("", P.b(AdRepository.class)), m.b(71.INSTANCE));
            registry.updateService(new ServiceKey("", P.b(CacheRepository.class)), m.b(new 72(registry)));
            registry.updateService(new ServiceKey("", P.b(GetCacheDirectory.class)), m.b(73.INSTANCE));
            registry.updateService(new ServiceKey("", P.b(CampaignRepository.class)), m.b(new 74(registry)));
            registry.updateService(new ServiceKey("", P.b(DeveloperConsentRepository.class)), m.b(new 75(registry)));
            registry.updateService(new ServiceKey("", P.b(DeviceInfoRepository.class)), m.b(new 76(registry)));
            registry.updateService(new ServiceKey("", P.b(DiagnosticEventRepository.class)), m.b(new 77(registry)));
            registry.updateService(new ServiceKey("", P.b(LegacyUserConsentRepository.class)), m.b(new 78(registry)));
            registry.updateService(new ServiceKey("", P.b(MediationRepository.class)), m.b(new 79(registry)));
            registry.updateService(new ServiceKey("", P.b(OpenMeasurementRepository.class)), m.b(new 80(registry)));
            registry.updateService(new ServiceKey("", P.b(SessionRepository.class)), m.b(new 81(registry)));
            registry.updateService(new ServiceKey("", P.b(TransactionEventRepository.class)), m.b(82.INSTANCE));
            registry.updateService(new ServiceKey("", P.b(OperativeEventRepository.class)), m.b(83.INSTANCE));
            registry.updateService(new ServiceKey("", P.b(ExecuteAdViewerRequest.class)), m.b(new 84(registry)));
            registry.updateService(new ServiceKey("", P.b(GetByteStringId.class)), m.b(85.INSTANCE));
            registry.updateService(new ServiceKey("", P.b(HandleOpenUrl.class)), m.b(new 86(registry)));
            registry.updateService(new ServiceKey("", P.b(Refresh.class)), m.b(new 87(registry)));
            registry.updateService(new ServiceKey("", P.b(SendDiagnosticEvent.class)), m.b(new 88(registry)));
            registry.updateService(new ServiceKey("", P.b(SendWebViewClientErrorDiagnostics.class)), m.b(new 89(registry)));
            registry.updateService(new ServiceKey("", P.b(Show.class)), m.b(new 90(registry)));
            registry.updateService(new ServiceKey("", P.b(CacheFile.class)), m.b(new 91(registry)));
            registry.updateService(new ServiceKey("", P.b(CleanAssets.class)), m.b(new 92(registry)));
            registry.updateService(new ServiceKey("", P.b(GetAdObject.class)), m.b(new 93(registry)));
            registry.updateService(new ServiceKey("", P.b(GetHeaderBiddingToken.class)), ServiceFactoryKt.factoryOf(new 94(registry)));
            registry.updateService(new ServiceKey("", P.b(BuildHeaderBiddingToken.class)), ServiceFactoryKt.factoryOf(new 95(registry)));
            registry.updateService(new ServiceKey("", P.b(TokenNumberProvider.class)), ServiceFactoryKt.factoryOf(new 96(registry)));
            registry.updateService(new ServiceKey("", P.b(GetInitializationData.class)), m.b(new 97(registry)));
            registry.updateService(new ServiceKey("", P.b(MediationInitBlobMetadataReader.class)), ServiceFactoryKt.factoryOf(new 98(registry)));
            registry.updateService(new ServiceKey("", P.b(GetInitializationRequestPayload.class)), m.b(new 99(registry)));
            registry.updateService(new ServiceKey("", P.b(GetInitializationState.class)), m.b(new 100(registry)));
            registry.updateService(new ServiceKey("", P.b(GetIsFileCache.class)), m.b(new 101(registry)));
            registry.updateService(new ServiceKey("", P.b(SetInitializationState.class)), m.b(new 102(registry)));
            registry.updateService(new ServiceKey("ad_req", P.b(GetRequestPolicy.class)), m.b(new 103(registry)));
            registry.updateService(new ServiceKey("", P.b(GetAdDataRefreshRequest.class)), m.b(new 104(registry)));
            registry.updateService(new ServiceKey("", P.b(GetAdPlayerConfigRequest.class)), m.b(new 105(registry)));
            registry.updateService(new ServiceKey("", P.b(AndroidGetAdPlayerContext.class)), m.b(new 106(registry)));
            registry.updateService(new ServiceKey("", P.b(GetAdRequest.class)), m.b(new 107(registry)));
            registry.updateService(new ServiceKey("", P.b(GetHbTokenEventRequest.class)), m.b(108.INSTANCE));
            registry.updateService(new ServiceKey("", P.b(CommonScarEventReceiver.class)), m.b(new 109(registry)));
            registry.updateService(new ServiceKey("", P.b(GMAScarAdapterBridge.class)), m.b(new 110(registry)));
            registry.updateService(new ServiceKey("", P.b(ScarTimeHackFixer.class)), m.b(new 111(registry)));
            registry.updateService(new ServiceKey("", P.b(ScarManager.class)), m.b(new 112(registry)));
            registry.updateService(new ServiceKey("", P.b(FetchSignalsAndSendUseCase.class)), m.b(new 113(registry)));
            registry.updateService(new ServiceKey("", P.b(LoadScarAd.class)), m.b(new 114(registry)));
            registry.updateService(new ServiceKey("", P.b(HandleGetTokenRequest.class)), m.b(new 115(registry)));
            registry.updateService(new ServiceKey("", P.b(GetClientInfo.class)), m.b(new 116(registry)));
            registry.updateService(new ServiceKey("", P.b(GetInitializationCompletedRequest.class)), m.b(new 117(registry)));
            registry.updateService(new ServiceKey("", P.b(GetInitializationRequest.class)), m.b(new 118(registry)));
            registry.updateService(new ServiceKey("", P.b(GetLimitedSessionToken.class)), m.b(new 119(registry)));
            registry.updateService(new ServiceKey("", P.b(GetOpenGLRendererInfo.class)), m.b(new 120(registry)));
            registry.updateService(new ServiceKey("", P.b(GetSharedDataTimestamps.class)), m.b(121.INSTANCE));
            registry.updateService(new ServiceKey("", P.b(GetUniversalRequestForPayLoad.class)), m.b(new 122(registry)));
            registry.updateService(new ServiceKey("", P.b(GetUniversalRequestSharedData.class)), m.b(new 123(registry)));
            registry.updateService(new ServiceKey("", P.b(GetCachedAsset.class)), m.b(new 124(registry)));
            registry.updateService(new ServiceKey("", P.b(GetWebViewBridgeUseCase.class)), m.b(new 125(registry)));
            registry.updateService(new ServiceKey("init_req", P.b(GetRequestPolicy.class)), m.b(new 126(registry)));
            registry.updateService(new ServiceKey("", P.b(GetLatestWebViewConfiguration.class)), m.b(new 127(registry)));
            registry.updateService(new ServiceKey("op_event_req", P.b(GetRequestPolicy.class)), m.b(new 128(registry)));
            registry.updateService(new ServiceKey("other_req", P.b(GetRequestPolicy.class)), m.b(new 129(registry)));
            registry.updateService(new ServiceKey("", P.b(GetPrivacyUpdateRequest.class)), m.b(new 130(registry)));
            registry.updateService(new ServiceKey("", P.b(HandleGatewayInitializationResponse.class)), m.b(new 131(registry)));
            registry.updateService(new ServiceKey("", P.b(HandleGatewayUniversalResponse.class)), m.b(new 132(registry)));
            registry.updateService(new ServiceKey("", P.b(InitializeBoldSDK.class)), m.b(new 133(registry)));
            registry.updateService(new ServiceKey("", P.b(LegacyShowUseCase.class)), ServiceFactoryKt.factoryOf(new 134(registry)));
            registry.updateService(new ServiceKey("", P.b(SendPrivacyUpdateRequest.class)), m.b(new 135(registry)));
            registry.updateService(new ServiceKey("", P.b(TriggerInitializationCompletedRequest.class)), m.b(new 136(registry)));
            registry.updateService(new ServiceKey("", P.b(TriggerInitializeListener.class)), m.b(new 137(registry)));
            registry.updateService(new ServiceKey("", P.b(DiagnosticEventObserver.class)), m.b(new 138(registry)));
            registry.updateService(new ServiceKey("", P.b(EventObservers.class)), m.b(new 139(registry)));
            registry.updateService(new ServiceKey("", P.b(GetTransactionData.class)), m.b(new 140(registry)));
            registry.updateService(new ServiceKey("", P.b(GetTransactionRequest.class)), m.b(new 141(registry)));
            registry.updateService(new ServiceKey("", P.b(GetDiagnosticEventBatchRequest.class)), m.b(142.INSTANCE));
            registry.updateService(new ServiceKey("", P.b(GetDiagnosticEventRequest.class)), m.b(new 143(registry)));
            registry.updateService(new ServiceKey("", P.b(GetOperativeEventApi.class)), m.b(new 144(registry)));
            registry.updateService(new ServiceKey("", P.b(GetOperativeEventRequest.class)), m.b(new 145(registry)));
            registry.updateService(new ServiceKey("", P.b(HandleGatewayEventResponse.class)), m.b(146.INSTANCE));
            registry.updateService(new ServiceKey("", P.b(OperativeEventObserver.class)), m.b(new 147(registry)));
            registry.updateService(new ServiceKey("", P.b(TransactionEventObserver.class)), m.b(new 148(registry)));
            registry.updateService(new ServiceKey("", P.b(UniversalRequestTtlValidator.class)), m.b(149.INSTANCE));
            registry.updateService(new ServiceKey("", P.b(UniversalRequestEventSender.class)), m.b(new 150(registry)));
            registry.updateService(new ServiceKey("", P.b(OmFinishSession.class)), m.b(new 151(registry)));
            registry.updateService(new ServiceKey("", P.b(OmImpressionOccurred.class)), m.b(new 152(registry)));
            registry.updateService(new ServiceKey("", P.b(AndroidOmInteraction.class)), m.b(new 153(registry)));
            registry.updateService(new ServiceKey("", P.b(GetOmData.class)), m.b(new 154(registry)));
            registry.updateService(new ServiceKey("", P.b(IsOMActivated.class)), m.b(new 155(registry)));
            registry.updateService(new ServiceKey("", P.b(InitializeOMSDK.class)), m.b(new 156(registry)));
            registry.updateService(new ServiceKey("dev_consent_privacy_rules", P.b(FlattenerRulesUseCase.class)), m.b(157.INSTANCE));
            registry.updateService(new ServiceKey("legacy_privacy_rules", P.b(FlattenerRulesUseCase.class)), m.b(158.INSTANCE));
            registry.updateService(new ServiceKey("", P.b(BackgroundWorker.class)), m.b(new 159(registry)));
            registry.updateService(new ServiceKey("", P.b(DiagnosticEventRequestWorkModifier.class)), m.b(new 160(registry)));
            registry.updateService(new ServiceKey("", P.b(GatewayClient.class)), m.b(new 161(registry)));
            registry.updateService(new ServiceKey("sdk", P.b(L.class)), m.b(new 162(registry)));
            registry.updateService(new ServiceKey("", P.b(TokenStorage.class)), m.b(163.INSTANCE));
            registry.updateService(new ServiceKey("", P.b(VolumeChange.class)), m.b(164.INSTANCE));
            registry.updateService(new ServiceKey("", P.b(ConfigFileFromLocalStorage.class)), m.b(new 165(registry)));
            registry.updateService(new ServiceKey("", P.b(InitializeSDK.class)), m.b(new 166(registry)));
            registry.updateService(new ServiceKey("", P.b(InitializeStateComplete.class)), m.b(new 167(registry)));
            registry.updateService(new ServiceKey("", P.b(InitializeStateConfig.class)), m.b(new 168(registry)));
            registry.updateService(new ServiceKey("", P.b(InitializeStateConfigWithLoader.class)), m.b(new 169(registry)));
            registry.updateService(new ServiceKey("", P.b(InitializeStateCreate.class)), m.b(new 170(registry)));
            registry.updateService(new ServiceKey("", P.b(InitializeStateError.class)), m.b(new 171(registry)));
            registry.updateService(new ServiceKey("", P.b(InitializeStateLoadCache.class)), m.b(new 172(registry)));
            registry.updateService(new ServiceKey("", P.b(InitializeStateLoadWeb.class)), m.b(new 173(registry)));
            registry.updateService(new ServiceKey("", P.b(InitializeStateReset.class)), m.b(new 174(registry)));
            registry.updateService(new ServiceKey("", P.b(StoreMonitor.class)), m.b(new 175(registry)));
            registry.updateService(new ServiceKey("", P.b(StoreWebViewEventSender.class)), m.b(new 176(registry)));
            registry.updateService(new ServiceKey("", P.b(StoreExceptionHandler.class)), m.b(177.INSTANCE));
            registry.updateService(new ServiceKey("", P.b(StoreEventListenerFactory.class)), m.b(new 178(registry)));
            registry.updateService(new ServiceKey("", P.b(ConfigurationReader.class)), m.b(179.INSTANCE));
            registry.updateService(new ServiceKey("", P.b(AndroidAttribution.class)), m.b(new 180(registry)));
            registry.updateService(new ServiceKey("", P.b(AdPlayerScope.class)), ServiceFactoryKt.factoryOf(new 181(registry)));
            registry.updateService(new ServiceKey("", P.b(AndroidWebViewClient.class)), ServiceFactoryKt.factoryOf(new 182(registry)));
            registry.updateService(new ServiceKey("", P.b(AndroidGetWebViewContainerUseCase.class)), ServiceFactoryKt.factoryOf(new 183(registry)));
            registry.updateService(new ServiceKey("", P.b(Load.class)), ServiceFactoryKt.factoryOf(new 184(registry)));
            registry.updateService(new ServiceKey("", P.b(AwaitInitialization.class)), ServiceFactoryKt.factoryOf(new 185(registry)));
            registry.updateService(new ServiceKey("", P.b(GetAsyncHeaderBiddingToken.class)), ServiceFactoryKt.factoryOf(new 186(registry)));
            registry.updateService(new ServiceKey("", P.b(GetAdPlayer.class)), ServiceFactoryKt.factoryOf(new 187(registry)));
            registry.updateService(new ServiceKey("", P.b(CacheWebViewAssets.class)), m.b(new 188(registry)));
            registry.updateService(new ServiceKey("", P.b(HandleGatewayAdResponse.class)), ServiceFactoryKt.factoryOf(new 189(registry)));
            registry.updateService(new ServiceKey("", P.b(HandleInvocationsFromAdViewer.class)), ServiceFactoryKt.factoryOf(190.INSTANCE));
            registry.updateService(new ServiceKey("", P.b(LegacyLoadUseCase.class)), ServiceFactoryKt.factoryOf(new 191(registry)));
            registry.updateService(new ServiceKey("", P.b(SafeCallbackInvoke.class)), m.b(new 192(registry)));
            registry.updateService(new ServiceKey("", P.b(InitializeStateNetworkError.class)), ServiceFactoryKt.factoryOf(new 193(registry)));
            registry.updateService(new ServiceKey("", P.b(CoroutineTimer.class)), ServiceFactoryKt.factoryOf(new 194(registry)));
            registry.updateService(new ServiceKey("", P.b(IEventSender.class)), m.b(195.INSTANCE));
            registry.updateService(new ServiceKey("", P.b(SetGameId.class)), m.b(new 196(registry)));
            registry.updateService(new ServiceKey("", P.b(GetGameId.class)), m.b(new 197(registry)));
            registry.updateService(new ServiceKey("", P.b(ValidateGameId.class)), m.b(new 198(registry)));
            registry.updateService(new ServiceKey("", P.b(ShouldAllowInitialization.class)), m.b(new 199(registry)));
            registry.updateService(new ServiceKey("", P.b(CheckForGameIdAndTestModeChanges.class)), m.b(new 200(registry)));
            registry.updateService(new ServiceKey("", P.b(DownloadPriorityQueue.class)), m.b(201.INSTANCE));
            registry.updateService(new ServiceKey("", P.b(CleanupDirectory.class)), m.b(202.INSTANCE));
            registry.updateService(new ServiceKey("", P.b(FocusRepository.class)), m.b(new 203(registry)));
            registry.updateService(new ServiceKey("", P.b(AndroidGetIsAdActivity.class)), m.b(new 204(registry)));
            registry.updateService(new ServiceKey("", P.b(AndroidGetLifecycleFlow.class)), m.b(new 205(registry)));
            registry.updateService(new ServiceKey("", P.b(AndroidHandleFocusCounters.class)), m.b(new 206(registry)));
            registry.updateService(new ServiceKey("", P.b(OfferwallAdapterBridge.class)), m.b(new 207(registry)));
            registry.updateService(new ServiceKey("", P.b(OfferwallManager.class)), m.b(new 208(registry)));
            registry.updateService(new ServiceKey("", P.b(LoadOfferwallAd.class)), m.b(new 209(registry)));
            registry.updateService(new ServiceKey("", P.b(GetIsOfferwallAdReady.class)), m.b(new 210(registry)));
            registry.updateService(new ServiceKey("", P.b(FIdDataSource.class)), m.b(new 211(registry)));
            registry.updateService(new ServiceKey("", P.b(FIdExistenceDataSource.class)), m.b(212.INSTANCE));
            registry.updateService(new ServiceKey("", P.b(CleanUpWhenOpportunityExpires.class)), m.b(new 213(registry)));
            registry.updateService(new ServiceKey("", P.b(OrientationRepository.class)), m.b(new 214(registry)));
            registry.updateService(new ServiceKey("", P.b(AndroidAppSetIdDataSource.class)), m.b(new 215(registry)));
            registry.updateService(new ServiceKey("", P.b(AndroidUnityInfoDataSource.class)), m.b(new 216(registry)));
            registry.updateService(new ServiceKey("", P.b(HandleDebugSettings.class)), m.b(217.INSTANCE));
            registry.updateService(new ServiceKey("", P.b(Logger.class)), m.b(218.INSTANCE));
            registry.updateService(new ServiceKey("", P.b(IsBillingClientAvailable.class)), m.b(219.INSTANCE));
            registry.updateService(new ServiceKey("", P.b(UnityBootConfigDataSource.class)), m.b(new 220(registry)));
        }
    }

    static {
        ServiceProvider serviceProvider = new ServiceProvider();
        INSTANCE = serviceProvider;
        serviceRegistry = serviceProvider.initialize();
    }

    private ServiceProvider() {
    }

    public IServicesRegistry getRegistry() {
        return serviceRegistry;
    }

    public IServicesRegistry initialize() {
        return ServicesRegistryKt.registry(1.INSTANCE);
    }
}
