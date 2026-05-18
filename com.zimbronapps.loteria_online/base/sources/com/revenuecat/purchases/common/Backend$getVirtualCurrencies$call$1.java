package com.revenuecat.purchases.common;

import Ca.q;
import Qa.l;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.virtualcurrencies.VirtualCurrenciesFactory;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.t;
import ob.j;
import org.json.JSONException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class Backend$getVirtualCurrencies$call$1 extends Dispatcher.AsyncCall {
    final /* synthetic */ BackgroundAwareCallbackCacheKey $cacheKey;
    final /* synthetic */ Endpoint.GetVirtualCurrencies $endpoint;
    final /* synthetic */ Backend this$0;

    public Backend$getVirtualCurrencies$call$1(Backend backend, Endpoint.GetVirtualCurrencies getVirtualCurrencies, BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey) {
        this.this$0 = backend;
        this.$endpoint = getVirtualCurrencies;
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
            list = (List) backend.getVirtualCurrenciesCallbacks().remove(backgroundAwareCallbackCacheKey);
        }
        if (list != null) {
            for (q qVar : list) {
                l lVar = (l) qVar.a();
                l lVar2 = (l) qVar.b();
                if (BackendHelperKt.isSuccessful(hTTPResult)) {
                    try {
                        lVar.invoke(VirtualCurrenciesFactory.INSTANCE.buildVirtualCurrencies(hTTPResult));
                    } catch (JSONException e) {
                        PurchasesError purchasesError = ErrorsKt.toPurchasesError((Exception) e);
                        LogUtilsKt.errorLog(purchasesError);
                        lVar2.invoke(purchasesError);
                    } catch (j e2) {
                        PurchasesError purchasesError2 = ErrorsKt.toPurchasesError((Exception) e2);
                        LogUtilsKt.errorLog(purchasesError2);
                        lVar2.invoke(purchasesError2);
                    } catch (IllegalArgumentException e3) {
                        PurchasesError purchasesError3 = ErrorsKt.toPurchasesError((Exception) e3);
                        LogUtilsKt.errorLog(purchasesError3);
                        lVar2.invoke(purchasesError3);
                    }
                } else {
                    PurchasesError purchasesError4 = ErrorsKt.toPurchasesError(hTTPResult);
                    LogUtilsKt.errorLog(purchasesError4);
                    lVar2.invoke(purchasesError4);
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
            list = (List) backend.getVirtualCurrenciesCallbacks().remove(backgroundAwareCallbackCacheKey);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((l) ((q) it.next()).b()).invoke(purchasesError);
            }
        }
    }
}
