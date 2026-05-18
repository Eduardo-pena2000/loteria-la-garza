package com.unity3d.services.store.core;

import com.unity3d.scar.adapter.common.m;
import com.unity3d.services.ads.gmascar.handlers.WebViewErrorHandler;
import com.unity3d.services.store.StoreError;
import com.unity3d.services.store.StoreEvent;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.t;
import org.json.JSONException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class WebViewStoreExceptionHandler implements StoreExceptionHandler {
    private final WebViewErrorHandler _webViewErrorHandler;

    public WebViewStoreExceptionHandler(WebViewErrorHandler _webViewErrorHandler) {
        t.g(_webViewErrorHandler, "_webViewErrorHandler");
        this._webViewErrorHandler = _webViewErrorHandler;
    }

    private final StoreError getStoreError(Exception exc) {
        return exc instanceof NoSuchMethodException ? StoreError.NO_SUCH_METHOD : exc instanceof IllegalAccessException ? StoreError.ILLEGAL_ACCESS : exc instanceof JSONException ? StoreError.JSON_ERROR : exc instanceof InvocationTargetException ? StoreError.INVOCATION_TARGET : exc instanceof ClassNotFoundException ? StoreError.CLASS_NOT_FOUND : StoreError.UNKNOWN_ERROR;
    }

    private final void sendErrorToWebView(StoreEvent storeEvent, StoreError storeError, int i, Exception exc) {
        this._webViewErrorHandler.handleError((m) new StoreWebViewError(storeEvent, exc.getMessage(), Integer.valueOf(i), storeError, exc.getMessage()));
    }

    public void handleStoreException(StoreEvent storeEvent, int i, Exception exception) {
        t.g(storeEvent, "storeEvent");
        t.g(exception, "exception");
        sendErrorToWebView(storeEvent, getStoreError(exception), i, exception);
    }
}
