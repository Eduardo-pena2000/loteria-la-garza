package com.revenuecat.purchases;

import Da.D;
import Qa.p;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PostTransactionWithProductDetailsHelper {
    private final BillingAbstract billing;
    private final PostReceiptHelper postReceiptHelper;

    public PostTransactionWithProductDetailsHelper(BillingAbstract billingAbstract, PostReceiptHelper postReceiptHelper) {
        t.g(billingAbstract, "billing");
        t.g(postReceiptHelper, "postReceiptHelper");
        this.billing = billingAbstract;
        this.postReceiptHelper = postReceiptHelper;
    }

    public static final /* synthetic */ PostReceiptHelper access$getPostReceiptHelper$p(PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper) {
        return postTransactionWithProductDetailsHelper.postReceiptHelper;
    }

    public static /* synthetic */ void postTransactions$default(PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper, List list, boolean z, String str, PostReceiptInitiationSource postReceiptInitiationSource, boolean z2, p pVar, p pVar2, int i, Object obj) {
        postTransactionWithProductDetailsHelper.postTransactions(list, z, str, postReceiptInitiationSource, z2, (i & 32) != 0 ? null : pVar, (i & 64) != 0 ? null : pVar2);
    }

    public final void postTransactions(List list, boolean z, String str, PostReceiptInitiationSource postReceiptInitiationSource, boolean z2, p pVar, p pVar2) {
        t.g(list, "transactions");
        t.g(str, "appUserID");
        t.g(postReceiptInitiationSource, "initiationSource");
        for (Iterator it = list.iterator(); it.hasNext(); it = it) {
            StoreTransaction storeTransaction = (StoreTransaction) it.next();
            this.billing.queryProductDetailsAsync(storeTransaction.getType(), D.Q0(storeTransaction.getProductIds()), new PostTransactionWithProductDetailsHelper$postTransactions$1$1(storeTransaction, this, z, str, postReceiptInitiationSource, z2, pVar, pVar2), new PostTransactionWithProductDetailsHelper$postTransactions$1$2(this, storeTransaction, z, str, postReceiptInitiationSource, z2, pVar, pVar2));
        }
    }
}
