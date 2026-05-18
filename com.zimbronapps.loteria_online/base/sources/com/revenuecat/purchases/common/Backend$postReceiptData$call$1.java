package com.revenuecat.purchases.common;

import Ca.q;
import Da.S;
import Qa.l;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.common.networking.PostReceiptResponseKt;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;
import org.json.JSONException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class Backend$postReceiptData$call$1 extends Dispatcher.AsyncCall {
    final /* synthetic */ Map $body;
    final /* synthetic */ List $cacheKey;
    final /* synthetic */ Map $extraHeaders;
    final /* synthetic */ List $postFieldsToSign;
    final /* synthetic */ Backend this$0;

    public Backend$postReceiptData$call$1(Backend backend, Map map, List list, Map map2, List list2) {
        this.this$0 = backend;
        this.$body = map;
        this.$postFieldsToSign = list;
        this.$extraHeaders = map2;
        this.$cacheKey = list2;
    }

    public HTTPResult call() {
        return HTTPClient.performRequest$default(Backend.access$getHttpClient$p(this.this$0), Backend.access$getAppConfig$p(this.this$0).getBaseURL(), Endpoint.PostReceipt.INSTANCE, this.$body, this.$postFieldsToSign, S.r(Backend.access$getBackendHelper$p(this.this$0).getAuthenticationHeaders$purchases_defaultsBc8Release(), this.$extraHeaders), false, Backend.access$getAppConfig$p(this.this$0).getFallbackBaseURLs(), 0, 160, null);
    }

    public void onCompletion(HTTPResult hTTPResult) {
        List<q> list;
        t.g(hTTPResult, "result");
        Backend backend = this.this$0;
        List list2 = this.$cacheKey;
        synchronized (backend) {
            list = (List) backend.getPostReceiptCallbacks().remove(list2);
        }
        if (list != null) {
            Backend backend2 = this.this$0;
            for (q qVar : list) {
                l lVar = (l) qVar.a();
                Qa.q qVar2 = (Qa.q) qVar.b();
                try {
                    if (BackendHelperKt.isSuccessful(hTTPResult)) {
                        lVar.invoke(PostReceiptResponseKt.buildPostReceiptResponse(hTTPResult));
                    } else {
                        PurchasesError purchasesError = ErrorsKt.toPurchasesError(hTTPResult);
                        LogUtilsKt.errorLog(purchasesError);
                        qVar2.invoke(purchasesError, Backend.access$determinePostReceiptErrorHandlingBehavior(backend2, hTTPResult.getResponseCode(), purchasesError), hTTPResult.getBody());
                    }
                } catch (JSONException e) {
                    PurchasesError purchasesError2 = ErrorsKt.toPurchasesError((Exception) e);
                    LogUtilsKt.errorLog(purchasesError2);
                    qVar2.invoke(purchasesError2, PostReceiptErrorHandlingBehavior.SHOULD_NOT_CONSUME, (Object) null);
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
            list = (List) backend.getPostReceiptCallbacks().remove(list2);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Qa.q) ((q) it.next()).b()).invoke(purchasesError, PostReceiptErrorHandlingBehavior.SHOULD_NOT_CONSUME, (Object) null);
            }
        }
    }
}
