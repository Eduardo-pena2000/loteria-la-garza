package com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel;

import Ga.e;
import Qa.a;
import X.l;
import android.app.Activity;
import android.content.Context;
import b0.h2;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.customercenter.CustomActionData;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PurchaseInformation;
import fb.N;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface CustomerCenterViewModel {

    public static final class DefaultImpls {
        public static /* synthetic */ Object loadAndDisplayPromotionalOffer$default(CustomerCenterViewModel customerCenterViewModel, Context context, StoreProduct storeProduct, CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer promotionalOffer, CustomerCenterConfigData.HelpPath helpPath, PurchaseInformation purchaseInformation, e eVar, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadAndDisplayPromotionalOffer");
            }
            if ((i & 16) != 0) {
                purchaseInformation = null;
            }
            return customerCenterViewModel.loadAndDisplayPromotionalOffer(context, storeProduct, promotionalOffer, helpPath, purchaseInformation, eVar);
        }

        public static /* synthetic */ void openURL$default(CustomerCenterViewModel customerCenterViewModel, Context context, String str, CustomerCenterConfigData.HelpPath.OpenMethod openMethod, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openURL");
            }
            if ((i & 4) != 0) {
                openMethod = CustomerCenterConfigData.HelpPath.OpenMethod.EXTERNAL;
            }
            customerCenterViewModel.openURL(context, str, openMethod);
        }
    }

    void clearActionError();

    void contactSupport(Context context, String str);

    void dismissPromotionalOffer(Context context, CustomerCenterConfigData.HelpPath helpPath);

    Object dismissRestoreDialog(e eVar);

    void dismissSupportTicketSuccessSnackbar();

    h2 getActionError();

    N getState();

    Object loadAndDisplayPromotionalOffer(Context context, StoreProduct storeProduct, CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer promotionalOffer, CustomerCenterConfigData.HelpPath helpPath, PurchaseInformation purchaseInformation, e eVar);

    @InternalRevenueCatAPI
    Object loadCustomerCenter(e eVar);

    Object onAcceptedPromotionalOffer(SubscriptionOption subscriptionOption, Activity activity, e eVar);

    void onActivityResumed();

    void onActivityStarted();

    void onActivityStopped(boolean z);

    void onCustomActionSelected(CustomActionData customActionData);

    void onNavigationButtonPressed(Context context, a aVar);

    void openURL(Context context, String str, CustomerCenterConfigData.HelpPath.OpenMethod openMethod);

    void pathButtonPressed(Context context, CustomerCenterConfigData.HelpPath helpPath, PurchaseInformation purchaseInformation);

    void refreshColors(l lVar, boolean z);

    Object refreshCustomerCenter(e eVar);

    void refreshStateIfLocaleChanged();

    Object restorePurchases(e eVar);

    void selectPurchase(PurchaseInformation purchaseInformation);

    void showCreateSupportTicket();

    void showPaywall(Context context);

    void showVirtualCurrencyBalances();

    void trackImpressionIfNeeded();
}
