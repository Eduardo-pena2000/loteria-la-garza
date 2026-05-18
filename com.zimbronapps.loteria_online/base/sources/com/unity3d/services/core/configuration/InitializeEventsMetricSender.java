package com.unity3d.services.core.configuration;

import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.request.metrics.TSIMetric;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class InitializeEventsMetricSender implements IInitializeEventsMetricSender, IInitializationListener {
    private static InitializeEventsMetricSender _instance;
    private long _startTime = 0;
    private long _privacyConfigStartTime = 0;
    private long _privacyConfigEndTime = 0;
    private long _configStartTime = 0;
    private long _configEndTime = 0;
    private int _configRetryCount = 0;
    private int _webviewRetryCount = 0;
    private boolean _initMetricSent = false;
    private boolean _tokenMetricSent = false;
    private final SDKMetricsSender _sdkMetricsSender = (SDKMetricsSender) Utilities.getService(SDKMetricsSender.class);

    public class 1 extends HashMap {
        public 1() {
            put("c_retry", String.valueOf(InitializeEventsMetricSender.access$000(InitializeEventsMetricSender.this)));
            put("wv_retry", String.valueOf(InitializeEventsMetricSender.access$100(InitializeEventsMetricSender.this)));
        }
    }

    private InitializeEventsMetricSender() {
        InitializationNotificationCenter.getInstance().addListener(this);
    }

    public static /* synthetic */ int access$000(InitializeEventsMetricSender initializeEventsMetricSender) {
        return initializeEventsMetricSender._configRetryCount;
    }

    public static /* synthetic */ int access$100(InitializeEventsMetricSender initializeEventsMetricSender) {
        return initializeEventsMetricSender._webviewRetryCount;
    }

    public static IInitializeEventsMetricSender getInstance() {
        if (_instance == null) {
            _instance = new InitializeEventsMetricSender();
        }
        return _instance;
    }

    private Metric getPrivacyRequestMetric(boolean z) {
        return z ? TSIMetric.newPrivacyRequestLatencySuccess(privacyConfigDuration()) : TSIMetric.newPrivacyRequestLatencyFailure(privacyConfigDuration());
    }

    private void sendConfigResolutionRequestIfNeeded(boolean z) {
        if (this._configStartTime == 0 || this._configEndTime == 0) {
            DeviceLog.debug("sendConfigResolutionRequestIfNeeded called with invalid timestamps, skipping metric");
        } else if (z) {
            sendMetric(TSIMetric.newConfigRequestLatencySuccess(configRequestDuration()));
        } else {
            sendMetric(TSIMetric.newConfigRequestLatencyFailure(configRequestDuration()));
        }
    }

    private void sendPrivacyResolutionRequestIfNeeded(boolean z) {
        if (this._privacyConfigStartTime == 0 || this._privacyConfigEndTime == 0) {
            DeviceLog.debug("sendPrivacyResolutionRequestIfNeeded called with invalid timestamps, skipping metric");
        } else {
            sendMetric(getPrivacyRequestMetric(z));
        }
    }

    private void sendTokenAvailabilityMetricWithConfig(boolean z) {
        if (this._startTime == 0) {
            DeviceLog.debug("sendTokenAvailabilityMetricWithConfig called before didInitStart, skipping metric");
            return;
        }
        Long valueOf = Long.valueOf(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this._startTime));
        Map retryTags = getRetryTags();
        sendMetric(z ? TSIMetric.newTokenAvailabilityLatencyConfig(valueOf, retryTags) : TSIMetric.newTokenAvailabilityLatencyWebview(valueOf, retryTags));
    }

    private void sendTokenResolutionRequestMetricIfNeeded() {
        if (this._configStartTime == 0) {
            DeviceLog.debug("sendTokenResolutionRequestMetricIfNeeded called before didInitStart, skipping metric");
        } else {
            sendMetric(TSIMetric.newTokenResolutionRequestLatency(tokenDuration(), getRetryTags()));
        }
    }

    public Long configRequestDuration() {
        return Long.valueOf(TimeUnit.NANOSECONDS.toMillis(this._configEndTime - this._configStartTime));
    }

    public void didConfigRequestEnd(boolean z) {
        this._configEndTime = System.nanoTime();
        sendConfigResolutionRequestIfNeeded(z);
    }

    public void didConfigRequestStart() {
        this._configStartTime = System.nanoTime();
    }

    public void didInitStart() {
        this._startTime = System.nanoTime();
        this._configRetryCount = 0;
        this._webviewRetryCount = 0;
        sendMetric(TSIMetric.newInitStarted());
    }

    public void didPrivacyConfigRequestEnd(boolean z) {
        this._privacyConfigEndTime = System.nanoTime();
        sendPrivacyResolutionRequestIfNeeded(z);
    }

    public void didPrivacyConfigRequestStart() {
        this._privacyConfigStartTime = System.nanoTime();
    }

    public Long duration() {
        return Long.valueOf(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this._startTime));
    }

    public Map getErrorStateTags(ErrorState errorState) {
        Map retryTags = getRetryTags();
        retryTags.put("stt", errorState.getMetricName());
        return retryTags;
    }

    public Map getRetryTags() {
        return new 1();
    }

    public Long initializationStartTimeStamp() {
        return Long.valueOf(this._startTime);
    }

    public void onRetryConfig() {
        this._configRetryCount++;
    }

    public void onRetryWebview() {
        this._webviewRetryCount++;
    }

    public void onSdkInitializationFailed(String str, ErrorState errorState, int i) {
        sdkInitializeFailed(str, errorState);
    }

    public void onSdkInitialized() {
        sdkDidInitialize();
    }

    public Long privacyConfigDuration() {
        return Long.valueOf(TimeUnit.NANOSECONDS.toMillis(this._privacyConfigEndTime - this._privacyConfigStartTime));
    }

    public synchronized void sdkDidInitialize() {
        if (initializationStartTimeStamp().longValue() == 0) {
            DeviceLog.debug("sdkDidInitialize called before didInitStart, skipping metric");
        }
    }

    public synchronized void sdkInitializeFailed(String str, ErrorState errorState) {
        if (this._startTime == 0) {
            DeviceLog.debug("sdkInitializeFailed called before didInitStart, skipping metric");
        }
    }

    public synchronized void sdkTokenDidBecomeAvailableWithConfig(boolean z) {
        try {
            if (!this._tokenMetricSent) {
                sendTokenAvailabilityMetricWithConfig(z);
                if (z) {
                    sendTokenResolutionRequestMetricIfNeeded();
                }
                this._tokenMetricSent = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void sendMetric(Metric metric) {
        this._sdkMetricsSender.sendMetric(metric);
    }

    public Long tokenDuration() {
        return Long.valueOf(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this._configStartTime));
    }
}
