package com.revenuecat.purchases.common;

import Ca.q;
import Ca.x;
import Da.S;
import Da.v;
import Qa.l;
import Qa.p;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.HTTPResult;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class Backend$logIn$call$1 extends Dispatcher.AsyncCall {
    final /* synthetic */ String $appUserID;
    final /* synthetic */ List $cacheKey;
    final /* synthetic */ String $newAppUserID;
    final /* synthetic */ Backend this$0;

    public Backend$logIn$call$1(String str, String str2, Backend backend, List list) {
        this.$appUserID = str;
        this.$newAppUserID = str2;
        this.this$0 = backend;
        this.$cacheKey = list;
    }

    public HTTPResult call() {
        return HTTPClient.performRequest$default(Backend.access$getHttpClient$p(this.this$0), Backend.access$getAppConfig$p(this.this$0).getBaseURL(), Endpoint.LogIn.INSTANCE, S.l(new q[]{x.a("app_user_id", this.$appUserID), x.a("new_app_user_id", this.$newAppUserID)}), v.q(new q[]{x.a("app_user_id", this.$appUserID), x.a("new_app_user_id", this.$newAppUserID)}), Backend.access$getBackendHelper$p(this.this$0).getAuthenticationHeaders$purchases_defaultsBc8Release(), false, Backend.access$getAppConfig$p(this.this$0).getFallbackBaseURLs(), 0, 160, null);
    }

    public void onCompletion(HTTPResult hTTPResult) {
        List<q> list;
        t.g(hTTPResult, "result");
        if (!BackendHelperKt.isSuccessful(hTTPResult)) {
            PurchasesError purchasesError = ErrorsKt.toPurchasesError(hTTPResult);
            LogUtilsKt.errorLog(purchasesError);
            onError(purchasesError);
            return;
        }
        Backend backend = this.this$0;
        List list2 = this.$cacheKey;
        synchronized (backend) {
            list = (List) backend.getIdentifyCallbacks().remove(list2);
        }
        if (list != null) {
            for (q qVar : list) {
                p pVar = (p) qVar.a();
                l lVar = (l) qVar.b();
                boolean z = hTTPResult.getResponseCode() == 201;
                if (hTTPResult.getBody().length() > 0) {
                    pVar.invoke(CustomerInfoFactory.INSTANCE.buildCustomerInfo(hTTPResult), Boolean.valueOf(z));
                } else {
                    PurchasesError purchasesError2 = new PurchasesError(PurchasesErrorCode.UnknownError, null, 2, null);
                    LogUtilsKt.errorLog(purchasesError2);
                    lVar.invoke(purchasesError2);
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
            list = (List) backend.getIdentifyCallbacks().remove(list2);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((l) ((q) it.next()).b()).invoke(purchasesError);
            }
        }
    }
}
