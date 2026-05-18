package com.revenuecat.purchases.common;

import Ca.q;
import Qa.l;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.common.networking.WebBillingProductsResponse;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.t;
import ob.j;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class Backend$getWebBillingProducts$call$1 extends Dispatcher.AsyncCall {
    final /* synthetic */ Endpoint.WebBillingGetProducts $endpoint;
    final /* synthetic */ String $path;
    final /* synthetic */ Backend this$0;

    public Backend$getWebBillingProducts$call$1(Backend backend, Endpoint.WebBillingGetProducts webBillingGetProducts, String str) {
        this.this$0 = backend;
        this.$endpoint = webBillingGetProducts;
        this.$path = str;
    }

    public HTTPResult call() {
        return HTTPClient.performRequest$default(Backend.access$getHttpClient$p(this.this$0), Backend.access$getAppConfig$p(this.this$0).getBaseURL(), this.$endpoint, null, null, Backend.access$getBackendHelper$p(this.this$0).getAuthenticationHeaders$purchases_defaultsBc8Release(), false, Backend.access$getAppConfig$p(this.this$0).getFallbackBaseURLs(), 0, 160, null);
    }

    public void onCompletion(HTTPResult hTTPResult) {
        List<q> list;
        t.g(hTTPResult, "result");
        Backend backend = this.this$0;
        String str = this.$path;
        synchronized (backend) {
            list = (List) backend.getWebBillingProductsCallbacks().remove(str);
        }
        if (list != null) {
            for (q qVar : list) {
                l lVar = (l) qVar.a();
                l lVar2 = (l) qVar.b();
                if (BackendHelperKt.isSuccessful(hTTPResult)) {
                    try {
                        tb.b json$purchases_defaultsBc8Release = Backend.Companion.getJson$purchases_defaultsBc8Release();
                        String payload = hTTPResult.getPayload();
                        json$purchases_defaultsBc8Release.a();
                        lVar.invoke((WebBillingProductsResponse) json$purchases_defaultsBc8Release.d(WebBillingProductsResponse.Companion.serializer(), payload));
                    } catch (j e) {
                        PurchasesError purchasesError = ErrorsKt.toPurchasesError((Exception) e);
                        LogUtilsKt.errorLog(purchasesError);
                        lVar2.invoke(purchasesError);
                    } catch (IllegalArgumentException e2) {
                        PurchasesError purchasesError2 = ErrorsKt.toPurchasesError((Exception) e2);
                        LogUtilsKt.errorLog(purchasesError2);
                        lVar2.invoke(purchasesError2);
                    }
                } else {
                    PurchasesError purchasesError3 = ErrorsKt.toPurchasesError(hTTPResult);
                    LogUtilsKt.errorLog(purchasesError3);
                    lVar2.invoke(purchasesError3);
                }
            }
        }
    }

    public void onError(PurchasesError purchasesError) {
        List list;
        t.g(purchasesError, "error");
        Backend backend = this.this$0;
        String str = this.$path;
        synchronized (backend) {
            list = (List) backend.getWebBillingProductsCallbacks().remove(str);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((l) ((q) it.next()).b()).invoke(purchasesError);
            }
        }
    }
}
