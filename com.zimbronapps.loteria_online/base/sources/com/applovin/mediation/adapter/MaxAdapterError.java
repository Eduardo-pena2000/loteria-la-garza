package com.applovin.mediation.adapter;

import com.applovin.impl.mediation.MaxErrorImpl;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class MaxAdapterError extends MaxErrorImpl {
    public static final int ERROR_CODE_AD_DISPLAY_FAILED = -4205;
    public static final int ERROR_CODE_AD_EXPIRED = -5213;
    public static final int ERROR_CODE_AD_FREQUENCY_CAPPED = -5214;
    public static final int ERROR_CODE_AD_NOT_READY = -5205;
    public static final int ERROR_CODE_BAD_REQUEST = -5203;
    public static final int ERROR_CODE_INTERNAL_ERROR = -5209;
    public static final int ERROR_CODE_INVALID_CONFIGURATION = -5202;
    public static final int ERROR_CODE_INVALID_LOAD_STATE = -5201;
    public static final int ERROR_CODE_MISSING_ACTIVITY = -5601;
    public static final int ERROR_CODE_MISSING_REQUIRED_NATIVE_AD_ASSETS = -5400;
    public static final int ERROR_CODE_NOT_INITIALIZED = -5204;
    public static final int ERROR_CODE_NO_CONNECTION = -5207;
    public static final int ERROR_CODE_NO_FILL = 204;
    public static final int ERROR_CODE_REWARD_ERROR = -5302;
    public static final int ERROR_CODE_SERVER_ERROR = -5208;
    public static final int ERROR_CODE_SIGNAL_COLLECTION_NOT_SUPPORTED = -5211;
    public static final int ERROR_CODE_SIGNAL_COLLECTION_TIMEOUT = -5210;
    public static final int ERROR_CODE_TIMEOUT = -5206;
    public static final int ERROR_CODE_UNSPECIFIED = -5200;
    public static final int ERROR_CODE_WEBVIEW_ERROR = -5212;
    public static final MaxAdapterError NO_FILL = new MaxAdapterError(204, "No Fill");
    public static final MaxAdapterError UNSPECIFIED = new MaxAdapterError(-5200, "Unspecified Error");
    public static final MaxAdapterError INVALID_LOAD_STATE = new MaxAdapterError(-5201, "Invalid Load State");
    public static final MaxAdapterError INVALID_CONFIGURATION = new MaxAdapterError(-5202, "Invalid Configuration");
    public static final MaxAdapterError BAD_REQUEST = new MaxAdapterError(-5203, "Bad Request");
    public static final MaxAdapterError NOT_INITIALIZED = new MaxAdapterError(-5204, "Not Initialized");
    public static final MaxAdapterError AD_NOT_READY = new MaxAdapterError(-5205, "Ad Not Ready");
    public static final MaxAdapterError TIMEOUT = new MaxAdapterError(-5206, "Request Timed Out");
    public static final MaxAdapterError NO_CONNECTION = new MaxAdapterError(-5207, "No Connection");
    public static final MaxAdapterError SERVER_ERROR = new MaxAdapterError(-5208, "Server Error");
    public static final MaxAdapterError INTERNAL_ERROR = new MaxAdapterError(-5209, "Internal Error");
    public static final MaxAdapterError SIGNAL_COLLECTION_TIMEOUT = new MaxAdapterError(-5210, "Signal Collection Timed Out");
    public static final MaxAdapterError SIGNAL_COLLECTION_NOT_SUPPORTED = new MaxAdapterError(-5211, "Signal Collection Not Supported");
    public static final MaxAdapterError WEBVIEW_ERROR = new MaxAdapterError(-5212, "WebView Error");
    public static final MaxAdapterError AD_EXPIRED = new MaxAdapterError(-5213, "Ad Expired");
    public static final MaxAdapterError AD_FREQUENCY_CAPPED = new MaxAdapterError(-5214, "Ad Frequency Capped");
    public static final MaxAdapterError REWARD_ERROR = new MaxAdapterError(-5302, "Reward Error");
    public static final MaxAdapterError MISSING_REQUIRED_NATIVE_AD_ASSETS = new MaxAdapterError(-5400, "Missing Native Ad Assets");
    public static final MaxAdapterError MISSING_ACTIVITY = new MaxAdapterError(-5601, "Missing Activity");
    public static final MaxAdapterError AD_DISPLAY_FAILED = new MaxAdapterError(-4205, "Ad Display Failed");

    public MaxAdapterError(int i) {
        this(i, "", 0, "");
    }

    public MaxAdapterError(int i, int i2) {
        this(i, "", i2, "");
    }

    public MaxAdapterError(int i, String str) {
        this(i, str, 0, "");
    }

    public MaxAdapterError(MaxAdapterError maxAdapterError, int i, String str) {
        this(maxAdapterError.getErrorCode(), maxAdapterError.getErrorMessage(), i, str);
    }

    public MaxAdapterError(int i, String str, int i2, String str2) {
        super(i, str, i2, str2);
    }
}
