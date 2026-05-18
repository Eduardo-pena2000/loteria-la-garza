package com.unity3d.services.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.services.UnityAdsSDK;
import com.unity3d.services.UnityServices;
import com.unity3d.services.ads.gmascar.managers.BiddingBaseManager;
import com.unity3d.services.ads.gmascar.managers.BiddingManagerFactory;
import com.unity3d.services.ads.operation.load.LoadModule;
import com.unity3d.services.ads.operation.load.LoadOperationState;
import com.unity3d.services.ads.operation.show.ShowModule;
import com.unity3d.services.ads.operation.show.ShowOperationState;
import com.unity3d.services.ads.token.AsyncTokenStorage;
import com.unity3d.services.ads.token.TokenStorage;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.bridge.WebViewBridgeInvoker;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class UnityAdsImplementation implements IUnityAds {
    private static Configuration configuration;
    private static IUnityAds instance;
    private static final WebViewBridgeInvoker webViewBridgeInvoker = new WebViewBridgeInvoker();

    public class 1 implements Listeners {
        final /* synthetic */ IUnityAdsShowListener val$showListener;

        public 1(IUnityAdsShowListener iUnityAdsShowListener) {
            this.val$showListener = iUnityAdsShowListener;
        }

        public void onClick(String str) {
            IUnityAdsShowListener iUnityAdsShowListener = this.val$showListener;
            if (iUnityAdsShowListener != null) {
                iUnityAdsShowListener.onUnityAdsShowClick(str);
            }
        }

        public void onComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
            IUnityAdsShowListener iUnityAdsShowListener = this.val$showListener;
            if (iUnityAdsShowListener != null) {
                iUnityAdsShowListener.onUnityAdsShowComplete(str, unityAdsShowCompletionState);
            }
        }

        public void onError(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
            IUnityAdsShowListener iUnityAdsShowListener = this.val$showListener;
            if (iUnityAdsShowListener != null) {
                iUnityAdsShowListener.onUnityAdsShowFailure(str, unityAdsShowError, str2);
            }
        }

        public void onLeftApplication(String str) {
        }

        public void onStart(String str) {
            IUnityAdsShowListener iUnityAdsShowListener = this.val$showListener;
            if (iUnityAdsShowListener != null) {
                iUnityAdsShowListener.onUnityAdsShowStart(str);
            }
        }
    }

    public static /* synthetic */ void a(IUnityAdsLoadListener iUnityAdsLoadListener, String str) {
        lambda$load$1(iUnityAdsLoadListener, str);
    }

    public static /* synthetic */ void b(IUnityAdsTokenListener iUnityAdsTokenListener) {
        lambda$getToken$2(iUnityAdsTokenListener);
    }

    public static /* synthetic */ void c(IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        lambda$initialize$0(iUnityAdsInitializationListener);
    }

    public static IUnityAds getInstance() {
        if (instance == null) {
            instance = new UnityAdsImplementation();
        }
        return instance;
    }

    private void handleShowError(IUnityAdsShowListener iUnityAdsShowListener, String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
        ((SDKMetricsSender) Utilities.getService(SDKMetricsSender.class)).sendMetricWithInitState(AdOperationMetric.newAdShowFailure(unityAdsShowError, (Long) 0L));
        if (iUnityAdsShowListener == null) {
            return;
        }
        iUnityAdsShowListener.onUnityAdsShowFailure(str, unityAdsShowError, str2);
    }

    private boolean hasInvalidContext(Context context) {
        if (ClientProperties.getApplicationContext() != null) {
            return false;
        }
        if (context == null) {
            return true;
        }
        if (context instanceof Application) {
            ClientProperties.setApplicationContext(context);
            ClientProperties.setApplication((Application) context);
            return false;
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.getApplication() != null && activity.getApplicationContext() != null) {
                ClientProperties.setApplicationContext(context.getApplicationContext());
                ClientProperties.setApplication(activity.getApplication());
                return false;
            }
        }
        return true;
    }

    private static /* synthetic */ void lambda$getToken$2(IUnityAdsTokenListener iUnityAdsTokenListener) {
        iUnityAdsTokenListener.onUnityAdsTokenReady(null);
    }

    private static /* synthetic */ void lambda$initialize$0(IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        iUnityAdsInitializationListener.onInitializationFailed(UnityAds.UnityAdsInitializationError.INVALID_ARGUMENT, "Unity Ads SDK failed to initialize due to invalid context");
    }

    private static /* synthetic */ void lambda$load$1(IUnityAdsLoadListener iUnityAdsLoadListener, String str) {
        iUnityAdsLoadListener.onUnityAdsFailedToLoad(str, UnityAds.UnityAdsLoadError.INVALID_ARGUMENT, "Unity Ads SDK failed to load due to invalid context");
    }

    public static void setConfiguration(Configuration configuration2) {
        configuration = configuration2;
    }

    public boolean getDebugMode() {
        return UnityServices.getDebugMode();
    }

    public String getToken() {
        if (hasInvalidContext()) {
            DeviceLog.error("No valid Context for getting token");
            return null;
        }
        if (((AlternativeFlowReader) Utilities.getService(AlternativeFlowReader.class)).invoke()) {
            return new UnityAdsSDK().getToken();
        }
        String token = ((TokenStorage) Utilities.getService(TokenStorage.class)).getToken();
        if (token == null || token.isEmpty()) {
            return null;
        }
        Configuration configuration2 = configuration;
        if (configuration2 == null) {
            configuration2 = new ConfigurationReader().getCurrentConfiguration();
        }
        BiddingBaseManager createManager = BiddingManagerFactory.getInstance().createManager(null, configuration2.getExperiments());
        createManager.start();
        return createManager.getFormattedToken(token);
    }

    public String getVersion() {
        return UnityServices.getVersion();
    }

    public void initialize(Context context, String str, boolean z, IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        DeviceLog.entered();
        if (!hasInvalidContext(context)) {
            UnityServices.initialize(context, str, z, iUnityAdsInitializationListener);
            return;
        }
        DeviceLog.error("Error while initializing Unity Services: null context, halting Unity Ads init");
        if (iUnityAdsInitializationListener != null) {
            Utilities.wrapCustomerListener(new c(iUnityAdsInitializationListener));
        }
    }

    public boolean isInitialized() {
        return UnityServices.isInitialized();
    }

    public boolean isSupported() {
        return UnityServices.isSupported();
    }

    public void load(String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener) {
        if (hasInvalidContext()) {
            DeviceLog.error("No valid Context for loading ads");
            if (iUnityAdsLoadListener != null) {
                Utilities.wrapCustomerListener(new a(iUnityAdsLoadListener, str));
                return;
            }
            return;
        }
        if (((AlternativeFlowReader) Utilities.getService(AlternativeFlowReader.class)).invoke()) {
            new UnityAdsSDK().load(str, unityAdsLoadOptions, iUnityAdsLoadListener, null);
            return;
        }
        Configuration configuration2 = configuration;
        if (configuration2 == null) {
            configuration2 = new Configuration();
        }
        LoadModule.getInstance().executeAdOperation(webViewBridgeInvoker, new LoadOperationState(str, iUnityAdsLoadListener, unityAdsLoadOptions, configuration2));
    }

    public void setDebugMode(boolean z) {
        UnityServices.setDebugMode(z);
    }

    public void show(Activity activity, String str) {
        show(activity, str, new UnityAdsShowOptions(), null);
    }

    public void show(Activity activity, String str, IUnityAdsShowListener iUnityAdsShowListener) {
        show(activity, str, new UnityAdsShowOptions(), iUnityAdsShowListener);
    }

    public void show(Activity activity, String str, UnityAdsShowOptions unityAdsShowOptions, IUnityAdsShowListener iUnityAdsShowListener) {
        if (activity != null && !hasInvalidContext(activity)) {
            ClientProperties.setActivity(activity);
            if (((AlternativeFlowReader) Utilities.getService(AlternativeFlowReader.class)).invoke()) {
                new UnityAdsSDK().show(str, unityAdsShowOptions, new 1(iUnityAdsShowListener));
                return;
            }
            if (!isSupported()) {
                handleShowError(iUnityAdsShowListener, str, UnityAds.UnityAdsShowError.NOT_INITIALIZED, "Unity Ads is not supported for this device");
                return;
            }
            if (!isInitialized()) {
                handleShowError(iUnityAdsShowListener, str, UnityAds.UnityAdsShowError.NOT_INITIALIZED, "[UnityAds] SDK not initialized");
                return;
            }
            if (str == null) {
                handleShowError(iUnityAdsShowListener, "", UnityAds.UnityAdsShowError.INVALID_ARGUMENT, "[UnityAds] Placement ID cannot be null");
                return;
            }
            Configuration configuration2 = configuration;
            if (configuration2 == null) {
                configuration2 = new Configuration();
            }
            ShowModule.getInstance().executeAdOperation(WebViewApp.getCurrentApp(), new ShowOperationState(str, iUnityAdsShowListener, activity, unityAdsShowOptions, configuration2));
            return;
        }
        handleShowError(iUnityAdsShowListener, str, UnityAds.UnityAdsShowError.INVALID_ARGUMENT, "Activity must not be null");
    }

    private boolean hasInvalidContext() {
        return hasInvalidContext(null);
    }

    public void getToken(TokenConfiguration tokenConfiguration, IUnityAdsTokenListener iUnityAdsTokenListener) {
        if (hasInvalidContext()) {
            DeviceLog.error("No valid Context for getting token");
            if (iUnityAdsTokenListener != null) {
                iUnityAdsTokenListener.onUnityAdsTokenReady(null);
                return;
            }
            return;
        }
        if (((AlternativeFlowReader) Utilities.getService(AlternativeFlowReader.class)).invoke()) {
            new UnityAdsSDK().getToken(tokenConfiguration, iUnityAdsTokenListener);
            return;
        }
        if (iUnityAdsTokenListener == null) {
            DeviceLog.info("Please provide non-null listener to UnityAds.GetToken method");
            return;
        }
        if (ClientProperties.getApplicationContext() == null) {
            Utilities.wrapCustomerListener(new b(iUnityAdsTokenListener));
            return;
        }
        AsyncTokenStorage asyncTokenStorage = (AsyncTokenStorage) Utilities.getService(AsyncTokenStorage.class);
        Configuration configuration2 = configuration;
        if (configuration2 == null) {
            configuration2 = new ConfigurationReader().getCurrentConfiguration();
        }
        BiddingBaseManager createManager = BiddingManagerFactory.getInstance().createManager(iUnityAdsTokenListener, tokenConfiguration, configuration2.getExperiments());
        createManager.start();
        asyncTokenStorage.getToken(createManager);
    }

    public void getToken(IUnityAdsTokenListener iUnityAdsTokenListener) {
        getToken(null, iUnityAdsTokenListener);
    }
}
