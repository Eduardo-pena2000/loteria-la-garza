package com.revenuecat.purchases;

import Ca.I;
import Ca.x;
import Da.A;
import Da.D;
import Da.Q;
import Da.S;
import Da.v;
import Da.w;
import Qa.p;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.models.GoogleStoreProduct;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PostTransactionWithProductDetailsHelper$postTransactions$1$1 extends u implements Qa.l {
    final /* synthetic */ boolean $allowSharingPlayStoreAccount;
    final /* synthetic */ String $appUserID;
    final /* synthetic */ PostReceiptInitiationSource $initiationSource;
    final /* synthetic */ boolean $sdkOriginated;
    final /* synthetic */ StoreTransaction $transaction;
    final /* synthetic */ p $transactionPostError;
    final /* synthetic */ p $transactionPostSuccess;
    final /* synthetic */ PostTransactionWithProductDetailsHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostTransactionWithProductDetailsHelper$postTransactions$1$1(StoreTransaction storeTransaction, PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper, boolean z, String str, PostReceiptInitiationSource postReceiptInitiationSource, boolean z2, p pVar, p pVar2) {
        super(1);
        this.$transaction = storeTransaction;
        this.this$0 = postTransactionWithProductDetailsHelper;
        this.$allowSharingPlayStoreAccount = z;
        this.$appUserID = str;
        this.$initiationSource = postReceiptInitiationSource;
        this.$sdkOriginated = z2;
        this.$transactionPostSuccess = pVar;
        this.$transactionPostError = pVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List) obj);
        return I.a;
    }

    public final void invoke(List list) {
        Object obj;
        StoreProduct storeProduct;
        ArrayList n;
        Object obj2;
        t.g(list, "storeProducts");
        Map map = null;
        if (this.$transaction.getType() == ProductType.SUBS && this.$transaction.getMarketplace() == null) {
            StoreTransaction storeTransaction = this.$transaction;
            Iterator it = list.iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                SubscriptionOptions subscriptionOptions = ((StoreProduct) obj2).getSubscriptionOptions();
                if (subscriptionOptions != null && !subscriptionOptions.isEmpty()) {
                    Iterator it2 = subscriptionOptions.iterator();
                    while (it2.hasNext()) {
                        if (t.c(((SubscriptionOption) it2.next()).getId(), storeTransaction.getSubscriptionOptionId())) {
                            break loop0;
                        }
                    }
                }
            }
            storeProduct = (StoreProduct) obj2;
        } else {
            StoreTransaction storeTransaction2 = this.$transaction;
            Iterator it3 = list.iterator();
            while (true) {
                if (it3.hasNext()) {
                    obj = it3.next();
                    if (t.c(((StoreProduct) obj).getId(), D.h0(storeTransaction2.getProductIds()))) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            storeProduct = (StoreProduct) obj;
        }
        StoreProduct storeProduct2 = storeProduct;
        Map subscriptionOptionIdForProductIDs = this.$transaction.getSubscriptionOptionIdForProductIDs();
        if (subscriptionOptionIdForProductIDs != null) {
            ArrayList<GoogleStoreProduct> arrayList = new ArrayList();
            for (Object obj3 : list) {
                if (obj3 instanceof GoogleStoreProduct) {
                    arrayList.add(obj3);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (GoogleStoreProduct googleStoreProduct : arrayList) {
                SubscriptionOptions<SubscriptionOption> subscriptionOptions2 = googleStoreProduct.getSubscriptionOptions();
                if (subscriptionOptions2 != null) {
                    n = new ArrayList(w.y(subscriptionOptions2, 10));
                    for (SubscriptionOption subscriptionOption : subscriptionOptions2) {
                        n.add(x.a(googleStoreProduct.getProductId() + '_' + subscriptionOption.getId(), subscriptionOption));
                    }
                } else {
                    n = v.n();
                }
                A.D(arrayList2, n);
            }
            Map x = S.x(arrayList2);
            Map c = Q.c();
            for (Map.Entry entry : subscriptionOptionIdForProductIDs.entrySet()) {
                String str = (String) entry.getKey();
                SubscriptionOption subscriptionOption2 = (SubscriptionOption) x.get(str + '_' + ((String) entry.getValue()));
                if (subscriptionOption2 != null) {
                    c.put(str, subscriptionOption2);
                }
            }
            map = Q.b(c);
        }
        Map map2 = map;
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.d("[Purchases] - " + logLevel.name(), "Store product found for transaction: " + storeProduct2);
        }
        PostTransactionWithProductDetailsHelper.access$getPostReceiptHelper$p(this.this$0).postTransactionAndConsumeIfNeeded(this.$transaction, storeProduct2, map2, this.$allowSharingPlayStoreAccount, this.$appUserID, this.$initiationSource, this.$sdkOriginated, this.$transactionPostSuccess, this.$transactionPostError);
    }
}
