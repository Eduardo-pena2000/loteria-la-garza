package com.revenuecat.purchases.common;

import Ca.q;
import Qa.l;
import Qa.p;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class Backend$postDiagnostics$call$1 extends Dispatcher.AsyncCall {
    final /* synthetic */ Map $body;
    final /* synthetic */ List $cacheKey;
    final /* synthetic */ Backend this$0;

    public Backend$postDiagnostics$call$1(Backend backend, Map map, List list) {
        this.this$0 = backend;
        this.$body = map;
        this.$cacheKey = list;
    }

    public HTTPResult call() {
        return HTTPClient.performRequest$default(Backend.access$getHttpClient$p(this.this$0), AppConfig.Companion.getDiagnosticsURL(), Endpoint.PostDiagnostics.INSTANCE, this.$body, null, Backend.access$getBackendHelper$p(this.this$0).getAuthenticationHeaders$purchases_defaultsBc8Release(), false, Backend.access$getAppConfig$p(this.this$0).getFallbackBaseURLs(), 0, 160, null);
    }

    public void onCompletion(HTTPResult hTTPResult) {
        List<q> list;
        t.g(hTTPResult, "result");
        Backend backend = this.this$0;
        List list2 = this.$cacheKey;
        synchronized (backend) {
            list = (List) backend.getDiagnosticsCallbacks().remove(list2);
        }
        if (list != null) {
            for (q qVar : list) {
                l lVar = (l) qVar.a();
                p pVar = (p) qVar.b();
                if (BackendHelperKt.isSuccessful(hTTPResult)) {
                    lVar.invoke(hTTPResult.getBody());
                } else {
                    PurchasesError purchasesError = ErrorsKt.toPurchasesError(hTTPResult);
                    pVar.invoke(purchasesError, Boolean.valueOf(RCHTTPStatusCodes.INSTANCE.isServerError(hTTPResult.getResponseCode()) || purchasesError.getCode() == PurchasesErrorCode.NetworkError));
                }
            }
        }
    }

    public void onError(PurchasesError purchasesError) {
        List list;
        t.g(purchasesError, "error");
        Backend backend = this.this$0;
        List list2 = this.$cacheKey;
        synchronized (backend) {
            list = (List) backend.getDiagnosticsCallbacks().remove(list2);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((p) ((q) it.next()).b()).invoke(purchasesError, Boolean.valueOf(purchasesError.getCode() == PurchasesErrorCode.NetworkError));
            }
        }
    }
}
