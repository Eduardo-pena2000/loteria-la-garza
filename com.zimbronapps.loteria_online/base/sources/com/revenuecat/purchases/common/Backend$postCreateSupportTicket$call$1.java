package com.revenuecat.purchases.common;

import Ca.q;
import Qa.l;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.HTTPResult;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;
import ob.j;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class Backend$postCreateSupportTicket$call$1 extends Dispatcher.AsyncCall {
    final /* synthetic */ Map $body;
    final /* synthetic */ Endpoint.PostCreateSupportTicket $endpoint;
    final /* synthetic */ String $path;
    final /* synthetic */ Backend this$0;

    public Backend$postCreateSupportTicket$call$1(Backend backend, Endpoint.PostCreateSupportTicket postCreateSupportTicket, Map map, String str) {
        this.this$0 = backend;
        this.$endpoint = postCreateSupportTicket;
        this.$body = map;
        this.$path = str;
    }

    public HTTPResult call() {
        return HTTPClient.performRequest$default(Backend.access$getHttpClient$p(this.this$0), Backend.access$getAppConfig$p(this.this$0).getBaseURL(), this.$endpoint, this.$body, null, Backend.access$getBackendHelper$p(this.this$0).getAuthenticationHeaders$purchases_defaultsBc8Release(), false, Backend.access$getAppConfig$p(this.this$0).getFallbackBaseURLs(), 0, 160, null);
    }

    public void onCompletion(HTTPResult hTTPResult) {
        List<q> list;
        t.g(hTTPResult, "result");
        Backend backend = this.this$0;
        String str = this.$path;
        synchronized (backend) {
            list = (List) backend.getCreateSupportTicketCallbacks().remove(str);
        }
        if (list != null) {
            for (q qVar : list) {
                l lVar = (l) qVar.a();
                l lVar2 = (l) qVar.b();
                if (BackendHelperKt.isSuccessful(hTTPResult)) {
                    try {
                        lVar.invoke(Boolean.valueOf(hTTPResult.getBody().optBoolean("sent", false)));
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
            list = (List) backend.getCreateSupportTicketCallbacks().remove(str);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((l) ((q) it.next()).b()).invoke(purchasesError);
            }
        }
    }
}
