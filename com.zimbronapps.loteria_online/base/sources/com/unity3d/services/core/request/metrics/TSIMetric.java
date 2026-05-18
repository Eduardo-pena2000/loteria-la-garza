package com.unity3d.services.core.request.metrics;

import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class TSIMetric {
    private static final String TSI_METRIC_COLLECTION_LATENCY = "native_device_info_collection_latency";
    private static final String TSI_METRIC_COMPRESSION_LATENCY = "native_device_info_compression_latency";
    private static final String TSI_METRIC_CONFIG_REQUEST_FAILURE = "native_config_request_failure_time";
    private static final String TSI_METRIC_CONFIG_REQUEST_SUCCESS = "native_config_request_success_time";
    private static final String TSI_METRIC_EMERGENCY_OFF = "native_emergency_switch_off";
    private static final String TSI_METRIC_INIT_STARTED = "native_initialization_started";
    private static final String TSI_METRIC_MISSING_GAME_SESSION_ID = "native_missing_game_session_id";
    private static final String TSI_METRIC_MISSING_STATE_ID = "native_missing_state_id";
    private static final String TSI_METRIC_MISSING_TOKEN = "native_missing_token";
    private static final String TSI_METRIC_PRIVACY_REQUEST_FAILURE = "native_privacy_request_failure_time";
    private static final String TSI_METRIC_PRIVACY_REQUEST_SUCCESS = "native_privacy_request_success_time";
    private static final String TSI_METRIC_PRIVACY_RESOLUTION_FAILURE = "native_privacy_resolution_request_latency_failure";
    private static final String TSI_METRIC_PRIVACY_RESOLUTION_SUCCESS = "native_privacy_resolution_request_latency_success";
    private static final String TSI_METRIC_TOKEN_ASYNC_AVAILABLE = "native_async_token_available";
    private static final String TSI_METRIC_TOKEN_ASYNC_NULL = "native_async_token_null";
    private static final String TSI_METRIC_TOKEN_AVAILABLE = "native_generated_token_available";
    private static final String TSI_METRIC_TOKEN_CONFIG = "native_token_availability_latency_config";
    private static final String TSI_METRIC_TOKEN_NULL = "native_generated_token_null";
    private static final String TSI_METRIC_TOKEN_RESOLUTION = "native_token_resolution_request_latency";
    private static final String TSI_METRIC_TOKEN_WEBVIEW = "native_token_availability_latency_webview";

    public static Metric newAsyncTokenAvailable(Map map) {
        return new Metric("native_async_token_available", null, map);
    }

    public static Metric newAsyncTokenNull(Map map) {
        return new Metric("native_async_token_null", null, map);
    }

    public static Metric newConfigRequestLatencyFailure(Long l) {
        return new Metric("native_config_request_failure_time", l);
    }

    public static Metric newConfigRequestLatencySuccess(Long l) {
        return new Metric("native_config_request_success_time", l);
    }

    public static Metric newDeviceInfoCollectionLatency(Long l) {
        return new Metric("native_device_info_collection_latency", l);
    }

    public static Metric newDeviceInfoCompressionLatency(Long l) {
        return new Metric("native_device_info_compression_latency", l);
    }

    public static Metric newEmergencySwitchOff() {
        return new Metric("native_emergency_switch_off", null);
    }

    public static Metric newInitStarted() {
        return new Metric("native_initialization_started", null);
    }

    public static Metric newMissingGameSessionId() {
        return new Metric("native_missing_game_session_id", null);
    }

    public static Metric newMissingStateId() {
        return new Metric("native_missing_state_id", null);
    }

    public static Metric newMissingToken() {
        return new Metric("native_missing_token", null);
    }

    public static Metric newNativeGeneratedTokenAvailable(Map map) {
        return new Metric("native_generated_token_available", null, map);
    }

    public static Metric newNativeGeneratedTokenNull(Map map) {
        return new Metric("native_generated_token_null", null, map);
    }

    public static Metric newPrivacyRequestLatencyFailure(Long l) {
        return new Metric("native_privacy_request_failure_time", l);
    }

    public static Metric newPrivacyRequestLatencySuccess(Long l) {
        return new Metric("native_privacy_request_success_time", l);
    }

    public static Metric newPrivacyResolutionRequestLatencyFailure(Long l) {
        return new Metric("native_privacy_resolution_request_latency_failure", l);
    }

    public static Metric newPrivacyResolutionRequestLatencySuccess(Long l) {
        return new Metric("native_privacy_resolution_request_latency_success", l);
    }

    public static Metric newTokenAvailabilityLatencyConfig(Long l, Map map) {
        return new Metric("native_token_availability_latency_config", l, map);
    }

    public static Metric newTokenAvailabilityLatencyWebview(Long l, Map map) {
        return new Metric("native_token_availability_latency_webview", l, map);
    }

    public static Metric newTokenResolutionRequestLatency(Long l, Map map) {
        return new Metric("native_token_resolution_request_latency", l, map);
    }
}
