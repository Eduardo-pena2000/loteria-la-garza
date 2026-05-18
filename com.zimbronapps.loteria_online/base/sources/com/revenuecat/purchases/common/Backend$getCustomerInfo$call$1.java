package com.revenuecat.purchases.common;

import Ca.q;
import Qa.l;
import Qa.p;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.t;
import org.json.JSONException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class Backend$getCustomerInfo$call$1 extends Dispatcher.AsyncCall {
    final /* synthetic */ BackgroundAwareCallbackCacheKey $cacheKey;
    final /* synthetic */ Endpoint.GetCustomerInfo $endpoint;
    final /* synthetic */ Backend this$0;

    public Backend$getCustomerInfo$call$1(Backend backend, Endpoint.GetCustomerInfo getCustomerInfo, BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey) {
        this.this$0 = backend;
        this.$endpoint = getCustomerInfo;
        this.$cacheKey = backgroundAwareCallbackCacheKey;
    }

    public HTTPResult call() {
        return HTTPClient.performRequest$default(Backend.access$getHttpClient$p(this.this$0), Backend.access$getAppConfig$p(this.this$0).getBaseURL(), this.$endpoint, null, null, Backend.access$getBackendHelper$p(this.this$0).getAuthenticationHeaders$purchases_defaultsBc8Release(), false, Backend.access$getAppConfig$p(this.this$0).getFallbackBaseURLs(), 0, 160, null);
    }

    public void onCompletion(HTTPResult hTTPResult) {
        List<q> list;
        t.g(hTTPResult, "result");
        Backend backend = this.this$0;
        BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey = this.$cacheKey;
        synchronized (backend) {
            list = (List) backend.getCallbacks().remove(backgroundAwareCallbackCacheKey);
        }
        if (list != null) {
            for (q qVar : list) {
                l lVar = (l) qVar.a();
                p pVar = (p) qVar.b();
                try {
                    if (BackendHelperKt.isSuccessful(hTTPResult)) {
                        lVar.invoke(CustomerInfoFactory.INSTANCE.buildCustomerInfo(hTTPResult));
                    } else {
                        PurchasesError purchasesError = ErrorsKt.toPurchasesError(hTTPResult);
                        LogUtilsKt.errorLog(purchasesError);
                        pVar.invoke(purchasesError, Boolean.valueOf(RCHTTPStatusCodes.INSTANCE.isServerError(hTTPResult.getResponseCode())));
                    }
                } catch (JSONException e) {
                    PurchasesError purchasesError2 = ErrorsKt.toPurchasesError((Exception) e);
                    LogUtilsKt.errorLog(purchasesError2);
                    pVar.invoke(purchasesError2, Boolean.FALSE);
                }
            }
        }
    }

    public void onError(PurchasesError purchasesError) {
        List list;
        t.g(purchasesError, "error");
        Backend backend = this.this$0;
        BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey = this.$cacheKey;
        synchronized (backend) {
            list = (List) backend.getCallbacks().remove(backgroundAwareCallbackCacheKey);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((p) ((q) it.next()).b()).invoke(purchasesError, Boolean.FALSE);
            }
        }
    }
}
