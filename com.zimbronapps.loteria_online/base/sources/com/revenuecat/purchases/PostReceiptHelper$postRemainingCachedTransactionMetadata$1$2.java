package com.revenuecat.purchases;

import Ca.I;
import Qa.q;
import com.revenuecat.purchases.common.PostReceiptErrorHandlingBehavior;
import com.revenuecat.purchases.utils.Result;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PostReceiptHelper$postRemainingCachedTransactionMetadata$1$2 extends u implements q {
    final /* synthetic */ Qa.l $onError;
    final /* synthetic */ Qa.l $onSuccess;
    final /* synthetic */ ConcurrentLinkedQueue $results;
    final /* synthetic */ List $transactionMetadataToSync;
    final /* synthetic */ PostReceiptHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostReceiptHelper$postRemainingCachedTransactionMetadata$1$2(ConcurrentLinkedQueue concurrentLinkedQueue, PostReceiptHelper postReceiptHelper, List list, Qa.l lVar, Qa.l lVar2) {
        super(3);
        this.$results = concurrentLinkedQueue;
        this.this$0 = postReceiptHelper;
        this.$transactionMetadataToSync = list;
        this.$onError = lVar;
        this.$onSuccess = lVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((PurchasesError) obj, (PostReceiptErrorHandlingBehavior) obj2, (JSONObject) obj3);
        return I.a;
    }

    public final void invoke(PurchasesError purchasesError, PostReceiptErrorHandlingBehavior postReceiptErrorHandlingBehavior, JSONObject jSONObject) {
        t.g(purchasesError, "backendError");
        t.g(postReceiptErrorHandlingBehavior, "<anonymous parameter 1>");
        this.$results.add(new Result.Error(purchasesError));
        PostReceiptHelper.access$callTransactionMetadataCompletionFromResults(this.this$0, this.$transactionMetadataToSync, this.$results, this.$onError, this.$onSuccess);
    }
}
