package com.revenuecat.purchases;

import Ca.I;
import com.revenuecat.purchases.common.networking.PostReceiptResponse;
import com.revenuecat.purchases.utils.Result;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PostReceiptHelper$postRemainingCachedTransactionMetadata$1$1 extends u implements Qa.l {
    final /* synthetic */ Qa.l $onError;
    final /* synthetic */ Qa.l $onSuccess;
    final /* synthetic */ ConcurrentLinkedQueue $results;
    final /* synthetic */ List $transactionMetadataToSync;
    final /* synthetic */ PostReceiptHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostReceiptHelper$postRemainingCachedTransactionMetadata$1$1(ConcurrentLinkedQueue concurrentLinkedQueue, PostReceiptHelper postReceiptHelper, List list, Qa.l lVar, Qa.l lVar2) {
        super(1);
        this.$results = concurrentLinkedQueue;
        this.this$0 = postReceiptHelper;
        this.$transactionMetadataToSync = list;
        this.$onError = lVar;
        this.$onSuccess = lVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PostReceiptResponse) obj);
        return I.a;
    }

    public final void invoke(PostReceiptResponse postReceiptResponse) {
        t.g(postReceiptResponse, "it");
        this.$results.add(new Result.Success(postReceiptResponse.getCustomerInfo()));
        PostReceiptHelper.access$callTransactionMetadataCompletionFromResults(this.this$0, this.$transactionMetadataToSync, this.$results, this.$onError, this.$onSuccess);
    }
}
