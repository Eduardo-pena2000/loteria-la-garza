package com.revenuecat.purchases;

import Ca.I;
import Qa.p;
import com.revenuecat.purchases.models.StoreTransaction;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PostTransactionWithProductDetailsHelper$postTransactions$1$2 extends u implements Qa.l {
    final /* synthetic */ boolean $allowSharingPlayStoreAccount;
    final /* synthetic */ String $appUserID;
    final /* synthetic */ PostReceiptInitiationSource $initiationSource;
    final /* synthetic */ boolean $sdkOriginated;
    final /* synthetic */ StoreTransaction $transaction;
    final /* synthetic */ p $transactionPostError;
    final /* synthetic */ p $transactionPostSuccess;
    final /* synthetic */ PostTransactionWithProductDetailsHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostTransactionWithProductDetailsHelper$postTransactions$1$2(PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper, StoreTransaction storeTransaction, boolean z, String str, PostReceiptInitiationSource postReceiptInitiationSource, boolean z2, p pVar, p pVar2) {
        super(1);
        this.this$0 = postTransactionWithProductDetailsHelper;
        this.$transaction = storeTransaction;
        this.$allowSharingPlayStoreAccount = z;
        this.$appUserID = str;
        this.$initiationSource = postReceiptInitiationSource;
        this.$sdkOriginated = z2;
        this.$transactionPostSuccess = pVar;
        this.$transactionPostError = pVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return I.a;
    }

    public final void invoke(PurchasesError purchasesError) {
        t.g(purchasesError, "it");
        PostTransactionWithProductDetailsHelper.access$getPostReceiptHelper$p(this.this$0).postTransactionAndConsumeIfNeeded(this.$transaction, null, null, this.$allowSharingPlayStoreAccount, this.$appUserID, this.$initiationSource, this.$sdkOriginated, this.$transactionPostSuccess, this.$transactionPostError);
    }
}
