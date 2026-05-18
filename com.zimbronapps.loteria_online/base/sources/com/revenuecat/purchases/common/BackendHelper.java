package com.revenuecat.purchases.common;

import Ca.x;
import Da.Q;
import Qa.l;
import Qa.q;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.HTTPResult;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class BackendHelper {
    private final String apiKey;
    private final AppConfig appConfig;
    private final Map authenticationHeaders;
    private final Dispatcher dispatcher;
    private final HTTPClient httpClient;

    public static final class 1 extends Dispatcher.AsyncCall {
        final /* synthetic */ Map $body;
        final /* synthetic */ Endpoint $endpoint;
        final /* synthetic */ q $onCompleted;
        final /* synthetic */ l $onError;
        final /* synthetic */ List $postFieldsToSign;

        public 1(Endpoint endpoint, Map map, List list, l lVar, q qVar) {
            this.$endpoint = endpoint;
            this.$body = map;
            this.$postFieldsToSign = list;
            this.$onError = lVar;
            this.$onCompleted = qVar;
        }

        public HTTPResult call() {
            return HTTPClient.performRequest$default(BackendHelper.access$getHttpClient$p(BackendHelper.this), BackendHelper.access$getAppConfig$p(BackendHelper.this).getBaseURL(), this.$endpoint, this.$body, this.$postFieldsToSign, BackendHelper.this.getAuthenticationHeaders$purchases_defaultsBc8Release(), false, BackendHelper.access$getAppConfig$p(BackendHelper.this).getFallbackBaseURLs(), 0, 160, null);
        }

        public void onCompletion(HTTPResult hTTPResult) {
            PurchasesError purchasesError;
            t.g(hTTPResult, "result");
            if (BackendHelperKt.isSuccessful(hTTPResult)) {
                purchasesError = null;
            } else {
                purchasesError = ErrorsKt.toPurchasesError(hTTPResult);
                LogUtilsKt.errorLog(purchasesError);
            }
            this.$onCompleted.invoke(purchasesError, Integer.valueOf(hTTPResult.getResponseCode()), hTTPResult.getBody());
        }

        public void onError(PurchasesError purchasesError) {
            t.g(purchasesError, "error");
            this.$onError.invoke(purchasesError);
        }
    }

    public BackendHelper(String str, Dispatcher dispatcher, AppConfig appConfig, HTTPClient hTTPClient) {
        t.g(str, "apiKey");
        t.g(dispatcher, "dispatcher");
        t.g(appConfig, "appConfig");
        t.g(hTTPClient, "httpClient");
        this.apiKey = str;
        this.dispatcher = dispatcher;
        this.appConfig = appConfig;
        this.httpClient = hTTPClient;
        this.authenticationHeaders = Q.f(x.a("Authorization", "Bearer " + str));
    }

    public static final /* synthetic */ AppConfig access$getAppConfig$p(BackendHelper backendHelper) {
        return backendHelper.appConfig;
    }

    public static final /* synthetic */ HTTPClient access$getHttpClient$p(BackendHelper backendHelper) {
        return backendHelper.httpClient;
    }

    public static /* synthetic */ void enqueue$default(BackendHelper backendHelper, Dispatcher.AsyncCall asyncCall, Dispatcher dispatcher, Delay delay, int i, Object obj) {
        if ((i & 4) != 0) {
            delay = Delay.NONE;
        }
        backendHelper.enqueue(asyncCall, dispatcher, delay);
    }

    public final void enqueue(Dispatcher.AsyncCall asyncCall, Dispatcher dispatcher, Delay delay) {
        t.g(asyncCall, "call");
        t.g(dispatcher, "dispatcher");
        t.g(delay, "delay");
        if (dispatcher.isClosed()) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Enqueuing operation in closed dispatcher.", null);
        } else {
            dispatcher.enqueue(asyncCall, delay);
        }
    }

    public final Map getAuthenticationHeaders$purchases_defaultsBc8Release() {
        return this.authenticationHeaders;
    }

    public final void performRequest(Endpoint endpoint, Map map, List list, Delay delay, l lVar, q qVar) {
        t.g(endpoint, "endpoint");
        t.g(delay, "delay");
        t.g(lVar, "onError");
        t.g(qVar, "onCompleted");
        enqueue(new 1(endpoint, map, list, lVar, qVar), this.dispatcher, delay);
    }
}
