package com.revenuecat.purchases.common;

import Ca.q;
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
public final class Backend$getOfferings$call$1 extends Dispatcher.AsyncCall {
    final /* synthetic */ BackgroundAwareCallbackCacheKey $cacheKey;
    final /* synthetic */ Endpoint.GetOfferings $endpoint;
    final /* synthetic */ Backend this$0;

    public Backend$getOfferings$call$1(Backend backend, Endpoint.GetOfferings getOfferings, BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey) {
        this.this$0 = backend;
        this.$endpoint = getOfferings;
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
            list = (List) backend.getOfferingsCallbacks().remove(backgroundAwareCallbackCacheKey);
        }
        if (list != null) {
            for (q qVar : list) {
                p pVar = (p) qVar.a();
                p pVar2 = (p) qVar.b();
                if (BackendHelperKt.isSuccessful(hTTPResult)) {
                    try {
                        pVar.invoke(hTTPResult.getBody(), HTTPResponseOriginalSourceKt.getOriginalDataSource(hTTPResult));
                    } catch (JSONException e) {
                        GetOfferingsErrorHandlingBehavior getOfferingsErrorHandlingBehavior = GetOfferingsErrorHandlingBehavior.SHOULD_FALLBACK_TO_CACHED_OFFERINGS;
                        PurchasesError purchasesError = ErrorsKt.toPurchasesError((Exception) e);
                        LogUtilsKt.errorLog(purchasesError);
                        pVar2.invoke(purchasesError, getOfferingsErrorHandlingBehavior);
                    }
                } else {
                    GetOfferingsErrorHandlingBehavior getOfferingsErrorHandlingBehavior2 = RCHTTPStatusCodes.INSTANCE.isServerError(hTTPResult.getResponseCode()) ? GetOfferingsErrorHandlingBehavior.SHOULD_FALLBACK_TO_CACHED_OFFERINGS : GetOfferingsErrorHandlingBehavior.SHOULD_NOT_FALLBACK;
                    PurchasesError purchasesError2 = ErrorsKt.toPurchasesError(hTTPResult);
                    LogUtilsKt.errorLog(purchasesError2);
                    pVar2.invoke(purchasesError2, getOfferingsErrorHandlingBehavior2);
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
            list = (List) backend.getOfferingsCallbacks().remove(backgroundAwareCallbackCacheKey);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((p) ((q) it.next()).b()).invoke(purchasesError, GetOfferingsErrorHandlingBehavior.SHOULD_FALLBACK_TO_CACHED_OFFERINGS);
            }
        }
    }
}
