package com.unity3d.services.ads.token;

import android.os.Handler;
import com.unity3d.services.ads.gmascar.GMA;
import com.unity3d.services.ads.gmascar.managers.IBiddingManager;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.TokenType;
import com.unity3d.services.core.device.reader.GameSessionIdReader;
import com.unity3d.services.core.device.reader.builder.DeviceInfoReaderBuilderWithExtras;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.InitializationStatusReader;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.request.metrics.TSIMetric;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class InMemoryAsyncTokenStorage implements AsyncTokenStorage {
    private DeviceInfoReaderBuilderWithExtras _deviceInfoReaderBuilderWithExtras;
    private final Handler _handler;
    private INativeTokenGenerator _nativeTokenGenerator;
    private final SDKMetricsSender _sdkMetrics;
    private TokenStorage _tokenStorage;
    private final List _tokenListeners = new LinkedList();
    private boolean _tokenAvailable = false;
    private boolean _configurationWasSet = false;
    private Configuration _configuration = new Configuration();
    private final InitializationStatusReader _initStatusReader = new InitializationStatusReader();

    public class 1 implements Runnable {
        final /* synthetic */ TokenListenerState val$state;

        public 1(TokenListenerState tokenListenerState) {
            this.val$state = tokenListenerState;
        }

        public void run() {
            InMemoryAsyncTokenStorage.access$000(InMemoryAsyncTokenStorage.this, this.val$state, null);
        }
    }

    public class 2 implements INativeTokenGeneratorListener {
        final /* synthetic */ TokenListenerState val$state;

        public class 1 implements Runnable {
            final /* synthetic */ String val$token;

            public 1(String str) {
                this.val$token = str;
            }

            public void run() {
                2 r0 = 2.this;
                InMemoryAsyncTokenStorage.access$000(InMemoryAsyncTokenStorage.this, r0.val$state, this.val$token);
            }
        }

        public 2(TokenListenerState tokenListenerState) {
            this.val$state = tokenListenerState;
        }

        public void onReady(String str) {
            InMemoryAsyncTokenStorage.access$100(InMemoryAsyncTokenStorage.this).post(new 1(str));
        }
    }

    public static /* synthetic */ class 3 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$services$core$device$TokenType;

        static {
            int[] iArr = new int[TokenType.values().length];
            $SwitchMap$com$unity3d$services$core$device$TokenType = iArr;
            try {
                iArr[TokenType.TOKEN_NATIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$unity3d$services$core$device$TokenType[TokenType.TOKEN_REMOTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public class TokenListenerState {
        public IBiddingManager biddingManager;
        public boolean invoked;
        public Runnable runnable;
        public TokenType tokenType;

        public TokenListenerState() {
        }
    }

    public InMemoryAsyncTokenStorage(INativeTokenGenerator iNativeTokenGenerator, Handler handler, SDKMetricsSender sDKMetricsSender, TokenStorage tokenStorage) {
        this._handler = handler;
        this._nativeTokenGenerator = iNativeTokenGenerator;
        this._sdkMetrics = sDKMetricsSender;
        this._tokenStorage = tokenStorage;
    }

    public static /* synthetic */ void access$000(InMemoryAsyncTokenStorage inMemoryAsyncTokenStorage, TokenListenerState tokenListenerState, String str) {
        inMemoryAsyncTokenStorage.notifyTokenReady(tokenListenerState, str);
    }

    public static /* synthetic */ Handler access$100(InMemoryAsyncTokenStorage inMemoryAsyncTokenStorage) {
        return inMemoryAsyncTokenStorage._handler;
    }

    private synchronized TokenListenerState addTimeoutHandler(IBiddingManager iBiddingManager) {
        TokenListenerState tokenListenerState;
        tokenListenerState = new TokenListenerState();
        tokenListenerState.biddingManager = iBiddingManager;
        tokenListenerState.tokenType = TokenType.TOKEN_REMOTE;
        tokenListenerState.runnable = new 1(tokenListenerState);
        this._tokenListeners.add(tokenListenerState);
        this._handler.postDelayed(tokenListenerState.runnable, this._configuration.getTokenTimeout());
        return tokenListenerState;
    }

    private Map getMetricTags() {
        HashMap hashMap = new HashMap();
        hashMap.put("state", this._initStatusReader.getInitializationStateString(SdkProperties.getCurrentInitializationState()));
        return hashMap;
    }

    private void handleTokenInvocation(TokenListenerState tokenListenerState) {
        if (tokenListenerState.invoked) {
            return;
        }
        tokenListenerState.invoked = true;
        if (this._tokenAvailable) {
            tokenListenerState.tokenType = TokenType.TOKEN_REMOTE;
            String token = this._tokenStorage.getToken();
            if (token == null || token.isEmpty()) {
                return;
            }
            notifyTokenReady(tokenListenerState, token);
            return;
        }
        tokenListenerState.tokenType = TokenType.TOKEN_NATIVE;
        if (GMA.getInstance().hasSCARBiddingSupport() && this._deviceInfoReaderBuilderWithExtras != null) {
            Map hashMap = new HashMap();
            hashMap.put("tid", tokenListenerState.biddingManager.getTokenIdentifier());
            this._deviceInfoReaderBuilderWithExtras.setExtras(hashMap);
        }
        this._nativeTokenGenerator.generateToken(new 2(tokenListenerState));
    }

    private boolean isValidConfig(Configuration configuration) {
        return configuration != null;
    }

    private synchronized void notifyListenersTokenReady() {
        String token;
        while (!this._tokenListeners.isEmpty() && (token = this._tokenStorage.getToken()) != null) {
            notifyTokenReady((TokenListenerState) this._tokenListeners.get(0), token);
        }
    }

    private synchronized void notifyTokenReady(TokenListenerState tokenListenerState, String str) {
        try {
            if (this._tokenListeners.remove(tokenListenerState)) {
                tokenListenerState.biddingManager.onUnityAdsTokenReady(tokenListenerState.tokenType == TokenType.TOKEN_REMOTE ? tokenListenerState.biddingManager.getFormattedToken(str) : str);
                try {
                    this._handler.removeCallbacks(tokenListenerState.runnable);
                } catch (Exception e) {
                    DeviceLog.exception("Failed to remove callback from a handler", e);
                }
            }
            sendTokenMetrics(str, tokenListenerState.tokenType);
        } catch (Throwable th) {
            throw th;
        }
    }

    private void sendNativeTokenMetrics(String str) {
        SDKMetricsSender sDKMetricsSender = this._sdkMetrics;
        if (sDKMetricsSender == null) {
            return;
        }
        if (str == null) {
            sDKMetricsSender.sendMetric(TSIMetric.newNativeGeneratedTokenNull(getMetricTags()));
        } else {
            sDKMetricsSender.sendMetric(TSIMetric.newNativeGeneratedTokenAvailable(getMetricTags()));
        }
    }

    private void sendRemoteTokenMetrics(String str) {
        if (this._sdkMetrics == null) {
            return;
        }
        if (str == null || str.isEmpty()) {
            this._sdkMetrics.sendMetric(TSIMetric.newAsyncTokenNull(getMetricTags()));
        } else {
            this._sdkMetrics.sendMetric(TSIMetric.newAsyncTokenAvailable(getMetricTags()));
        }
    }

    private void sendTokenMetrics(String str, TokenType tokenType) {
        int i = 3.$SwitchMap$com$unity3d$services$core$device$TokenType[tokenType.ordinal()];
        if (i == 1) {
            sendNativeTokenMetrics(str);
        } else if (i != 2) {
            DeviceLog.error("Unknown token type passed to sendTokenMetrics");
        } else {
            sendRemoteTokenMetrics(str);
        }
    }

    public synchronized void getToken(IBiddingManager iBiddingManager) {
        if (SdkProperties.getCurrentInitializationState() == SdkProperties.InitializationState.INITIALIZED_FAILED) {
            iBiddingManager.onUnityAdsTokenReady(null);
            sendTokenMetrics(null, TokenType.TOKEN_REMOTE);
        } else if (SdkProperties.getCurrentInitializationState() == SdkProperties.InitializationState.NOT_INITIALIZED) {
            iBiddingManager.onUnityAdsTokenReady(null);
            sendTokenMetrics(null, TokenType.TOKEN_REMOTE);
        } else {
            TokenListenerState addTimeoutHandler = addTimeoutHandler(iBiddingManager);
            if (this._configurationWasSet) {
                handleTokenInvocation(addTimeoutHandler);
            }
        }
    }

    public synchronized void onTokenAvailable() {
        this._tokenAvailable = true;
        if (this._configurationWasSet) {
            notifyListenersTokenReady();
        }
    }

    public synchronized void setConfiguration(Configuration configuration) {
        try {
            this._configuration = configuration;
            boolean isValidConfig = isValidConfig(configuration);
            this._configurationWasSet = isValidConfig;
            if (isValidConfig) {
                if (this._nativeTokenGenerator == null) {
                    this._deviceInfoReaderBuilderWithExtras = new DeviceInfoReaderBuilderWithExtras(new ConfigurationReader(), PrivacyConfigStorage.getInstance(), GameSessionIdReader.getInstance());
                    ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                    this._nativeTokenGenerator = new NativeTokenGenerator(newSingleThreadExecutor, this._deviceInfoReaderBuilderWithExtras);
                    if (configuration.getExperiments().shouldNativeTokenAwaitPrivacy()) {
                        this._nativeTokenGenerator = new NativeTokenGeneratorWithPrivacyAwait(newSingleThreadExecutor, this._nativeTokenGenerator, configuration.getPrivacyRequestWaitTimeout());
                    }
                }
                Iterator it = new ArrayList(this._tokenListeners).iterator();
                while (it.hasNext()) {
                    handleTokenInvocation((TokenListenerState) it.next());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
