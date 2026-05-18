package com.revenuecat.purchases.common;

import Ca.q;
import Ca.x;
import Da.S;
import Qa.l;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.HTTPResult;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class Backend$aliasUsers$call$1 extends Dispatcher.AsyncCall {
    final /* synthetic */ List $cacheKey;
    final /* synthetic */ String $newAppUserID;
    final /* synthetic */ String $oldAppUserID;
    final /* synthetic */ Backend this$0;

    public Backend$aliasUsers$call$1(String str, String str2, Backend backend, List list) {
        this.$oldAppUserID = str;
        this.$newAppUserID = str2;
        this.this$0 = backend;
        this.$cacheKey = list;
    }

    public HTTPResult call() {
        return HTTPClient.performRequest$default(Backend.access$getHttpClient$p(this.this$0), Backend.access$getAppConfig$p(this.this$0).getBaseURL(), new Endpoint.AliasUsers(this.$oldAppUserID), S.l(new q[]{x.a("app_user_id", this.$oldAppUserID), x.a("new_app_user_id", this.$newAppUserID)}), null, Backend.access$getBackendHelper$p(this.this$0).getAuthenticationHeaders$purchases_defaultsBc8Release(), false, Backend.access$getAppConfig$p(this.this$0).getFallbackBaseURLs(), 0, 160, null);
    }

    public void onCompletion(HTTPResult hTTPResult) {
        List list;
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
            list = (List) backend.getAliasCallbacks().remove(list2);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Qa.a) ((q) it.next()).a()).invoke();
            }
        }
    }

    public void onError(PurchasesError purchasesError) {
        List list;
        t.g(purchasesError, "error");
        Backend backend = this.this$0;
        List list2 = this.$cacheKey;
        synchronized (backend) {
            list = (List) backend.getAliasCallbacks().remove(list2);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((l) ((q) it.next()).b()).invoke(purchasesError);
            }
        }
    }
}
