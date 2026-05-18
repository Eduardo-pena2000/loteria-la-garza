package com.revenuecat.purchases.common;

import Qa.l;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.interfaces.RedeemWebPurchaseListener;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class Backend$postRedeemWebPurchase$call$1 extends Dispatcher.AsyncCall {
    final /* synthetic */ Map $body;
    final /* synthetic */ Endpoint.PostRedeemWebPurchase $endpoint;
    final /* synthetic */ String $path;
    final /* synthetic */ Backend this$0;

    public Backend$postRedeemWebPurchase$call$1(Backend backend, Endpoint.PostRedeemWebPurchase postRedeemWebPurchase, Map map, String str) {
        this.this$0 = backend;
        this.$endpoint = postRedeemWebPurchase;
        this.$body = map;
        this.$path = str;
    }

    public HTTPResult call() {
        return HTTPClient.performRequest$default(Backend.access$getHttpClient$p(this.this$0), Backend.access$getAppConfig$p(this.this$0).getBaseURL(), this.$endpoint, this.$body, null, Backend.access$getBackendHelper$p(this.this$0).getAuthenticationHeaders$purchases_defaultsBc8Release(), false, Backend.access$getAppConfig$p(this.this$0).getFallbackBaseURLs(), 0, 160, null);
    }

    public void onCompletion(HTTPResult hTTPResult) {
        List<l> list;
        t.g(hTTPResult, "result");
        Backend backend = this.this$0;
        String str = this.$path;
        synchronized (backend) {
            list = (List) backend.getRedeemWebPurchaseCallbacks().remove(str);
        }
        if (list != null) {
            for (l lVar : list) {
                if (BackendHelperKt.isSuccessful(hTTPResult)) {
                    lVar.invoke(new RedeemWebPurchaseListener.Result.Success(CustomerInfoFactory.INSTANCE.buildCustomerInfo(hTTPResult)));
                } else {
                    Integer backendErrorCode = hTTPResult.getBackendErrorCode();
                    int value = BackendErrorCode.BackendInvalidWebRedemptionToken.getValue();
                    if (backendErrorCode != null && backendErrorCode.intValue() == value) {
                        lVar.invoke(RedeemWebPurchaseListener.Result.InvalidToken.INSTANCE);
                    } else {
                        int value2 = BackendErrorCode.BackendExpiredWebRedemptionToken.getValue();
                        if (backendErrorCode != null && backendErrorCode.intValue() == value2) {
                            JSONObject body = hTTPResult.getBody();
                            JSONObject optJSONObject = body.optJSONObject("purchase_redemption_error_info");
                            String optString = optJSONObject != null ? optJSONObject.optString("obfuscated_email") : null;
                            if (optString == null) {
                                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error parsing expired redemption token response: " + body, null);
                                lVar.invoke(new RedeemWebPurchaseListener.Result.Error(ErrorsKt.toPurchasesError(hTTPResult)));
                            } else {
                                lVar.invoke(new RedeemWebPurchaseListener.Result.Expired(optString));
                            }
                        } else {
                            int value3 = BackendErrorCode.BackendPurchaseBelongsToOtherUser.getValue();
                            if (backendErrorCode != null && backendErrorCode.intValue() == value3) {
                                lVar.invoke(RedeemWebPurchaseListener.Result.PurchaseBelongsToOtherUser.INSTANCE);
                            } else {
                                lVar.invoke(new RedeemWebPurchaseListener.Result.Error(ErrorsKt.toPurchasesError(hTTPResult)));
                            }
                        }
                    }
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
            list = (List) backend.getRedeemWebPurchaseCallbacks().remove(str);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((l) it.next()).invoke(new RedeemWebPurchaseListener.Result.Error(purchasesError));
            }
        }
    }
}
