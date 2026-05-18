package com.revenuecat.purchases.common;

import Qa.l;
import android.app.Activity;
import com.revenuecat.purchases.AmazonLWAConsentStatus;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.PostReceiptInitiationSource;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesStateProvider;
import com.revenuecat.purchases.models.PurchasingData;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.t;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class BillingAbstract {
    private final PurchasesStateProvider purchasesStateProvider;
    private volatile PurchasesUpdatedListener purchasesUpdatedListener;
    private volatile StateListener stateListener;

    public interface PurchasesUpdatedListener {
        void onPurchasesFailedToUpdate(PurchasesError purchasesError);

        void onPurchasesUpdated(List list);
    }

    public interface StateListener {
        void onConnected();
    }

    public BillingAbstract(PurchasesStateProvider purchasesStateProvider) {
        t.g(purchasesStateProvider, "purchasesStateProvider");
        this.purchasesStateProvider = purchasesStateProvider;
    }

    public static /* synthetic */ void makePurchaseAsync$default(BillingAbstract billingAbstract, Activity activity, String str, PurchasingData purchasingData, ReplaceProductInfo replaceProductInfo, PresentedOfferingContext presentedOfferingContext, Boolean bool, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: makePurchaseAsync");
        }
        if ((i & 32) != 0) {
            bool = null;
        }
        billingAbstract.makePurchaseAsync(activity, str, purchasingData, replaceProductInfo, presentedOfferingContext, bool);
    }

    public static /* synthetic */ void startConnectionOnMainThread$default(BillingAbstract billingAbstract, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startConnectionOnMainThread");
        }
        if ((i & 1) != 0) {
            j = 0;
        }
        billingAbstract.startConnectionOnMainThread(j);
    }

    public final void close() {
        this.purchasesUpdatedListener = null;
        endConnection();
    }

    public abstract void consumeAndSave(boolean z, StoreTransaction storeTransaction, boolean z2, PostReceiptInitiationSource postReceiptInitiationSource);

    public abstract void endConnection();

    public abstract void findPurchaseInPurchaseHistory(String str, ProductType productType, String str2, l lVar, l lVar2);

    public void getAmazonLWAConsentStatus(l lVar, l lVar2) {
        t.g(lVar, "onSuccess");
        t.g(lVar2, "onError");
        lVar.invoke(AmazonLWAConsentStatus.UNAVAILABLE);
    }

    public final PurchasesStateProvider getPurchasesStateProvider() {
        return this.purchasesStateProvider;
    }

    public final synchronized PurchasesUpdatedListener getPurchasesUpdatedListener() {
        return this.purchasesUpdatedListener;
    }

    public final synchronized StateListener getStateListener() {
        return this.stateListener;
    }

    public abstract void getStorefront(l lVar, l lVar2);

    public abstract boolean isConnected();

    public abstract void makePurchaseAsync(Activity activity, String str, PurchasingData purchasingData, ReplaceProductInfo replaceProductInfo, PresentedOfferingContext presentedOfferingContext, Boolean bool);

    public void normalizePurchaseData(String str, String str2, String str3, l lVar, l lVar2) {
        t.g(str, "productID");
        t.g(str2, "purchaseToken");
        t.g(str3, "storeUserID");
        t.g(lVar, "onSuccess");
        t.g(lVar2, "onError");
        lVar.invoke(str);
    }

    public abstract void queryAllPurchases(String str, l lVar, l lVar2);

    public abstract void queryProductDetailsAsync(ProductType productType, Set set, l lVar, l lVar2);

    public abstract void queryPurchases(String str, l lVar, l lVar2);

    public final void setPurchasesUpdatedListener(PurchasesUpdatedListener purchasesUpdatedListener) {
        this.purchasesUpdatedListener = purchasesUpdatedListener;
    }

    public final synchronized void setStateListener(StateListener stateListener) {
        this.stateListener = stateListener;
    }

    public abstract void showInAppMessagesIfNeeded(Activity activity, List list, Qa.a aVar);

    public abstract void startConnection();

    public abstract void startConnectionOnMainThread(long j);
}
