package com.revenuecat.purchases.common;

import Ca.q;
import Qa.p;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.events.EventsRequest;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class Backend$postEvents$call$1 extends Dispatcher.AsyncCall {
    final /* synthetic */ URL $baseURL;
    final /* synthetic */ Map $body;
    final /* synthetic */ EventsRequest $paywallEventRequest;
    final /* synthetic */ Backend this$0;

    public Backend$postEvents$call$1(Backend backend, URL url, Map map, EventsRequest eventsRequest) {
        this.this$0 = backend;
        this.$baseURL = url;
        this.$body = map;
        this.$paywallEventRequest = eventsRequest;
    }

    public HTTPResult call() {
        return HTTPClient.performRequest$default(Backend.access$getHttpClient$p(this.this$0), this.$baseURL, Endpoint.PostEvents.INSTANCE, this.$body, null, Backend.access$getBackendHelper$p(this.this$0).getAuthenticationHeaders$purchases_defaultsBc8Release(), false, Backend.access$getAppConfig$p(this.this$0).getFallbackBaseURLs(), 0, 160, null);
    }

    public void onCompletion(HTTPResult hTTPResult) {
        List<q> list;
        t.g(hTTPResult, "result");
        Backend backend = this.this$0;
        EventsRequest eventsRequest = this.$paywallEventRequest;
        synchronized (backend) {
            list = (List) backend.getPaywallEventsCallbacks().remove(eventsRequest.getCacheKey());
        }
        if (list != null) {
            for (q qVar : list) {
                Qa.a aVar = (Qa.a) qVar.a();
                p pVar = (p) qVar.b();
                if (BackendHelperKt.isSuccessful(hTTPResult)) {
                    aVar.invoke();
                } else {
                    pVar.invoke(ErrorsKt.toPurchasesError(hTTPResult), Boolean.valueOf(RCHTTPStatusCodes.INSTANCE.isSynced(hTTPResult.getResponseCode())));
                }
            }
        }
    }

    public void onError(PurchasesError purchasesError) {
        List list;
        t.g(purchasesError, "error");
        Backend backend = this.this$0;
        EventsRequest eventsRequest = this.$paywallEventRequest;
        synchronized (backend) {
            list = (List) backend.getPaywallEventsCallbacks().remove(eventsRequest.getCacheKey());
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((p) ((q) it.next()).b()).invoke(purchasesError, Boolean.FALSE);
            }
        }
    }
}
