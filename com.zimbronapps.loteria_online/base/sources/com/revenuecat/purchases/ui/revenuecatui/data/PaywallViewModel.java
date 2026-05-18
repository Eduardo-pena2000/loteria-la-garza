package com.revenuecat.purchases.ui.revenuecatui.data;

import Ga.e;
import X.l;
import android.app.Activity;
import b0.h2;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.paywalls.events.ExitOfferType;
import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallResult;
import com.revenuecat.purchases.ui.revenuecatui.components.PaywallAction;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResolvedOffer;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResourceProvider;
import fb.N;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface PaywallViewModel {

    public static final class DefaultImpls {
        public static /* synthetic */ void closePaywall$default(PaywallViewModel paywallViewModel, PaywallResult paywallResult, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: closePaywall");
            }
            if ((i & 1) != 0) {
                paywallResult = null;
            }
            paywallViewModel.closePaywall(paywallResult);
        }

        public static /* synthetic */ Object handlePackagePurchase$default(PaywallViewModel paywallViewModel, Activity activity, Package r2, ResolvedOffer resolvedOffer, e eVar, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handlePackagePurchase");
            }
            if ((i & 4) != 0) {
                resolvedOffer = null;
            }
            return paywallViewModel.handlePackagePurchase(activity, r2, resolvedOffer, eVar);
        }
    }

    void clearActionError();

    void closePaywall(PaywallResult paywallResult);

    h2 getActionError();

    h2 getActionInProgress();

    h2 getPreloadedExitOffering();

    h2 getPurchaseCompleted();

    ResourceProvider getResourceProvider();

    N getState();

    String getWebCheckoutUrl(PaywallAction.External.LaunchWebCheckout launchWebCheckout);

    Object handlePackagePurchase(Activity activity, Package r2, ResolvedOffer resolvedOffer, e eVar);

    Object handleRestorePurchases(e eVar);

    void invalidateCustomerInfoCache();

    void preloadExitOffering();

    void purchaseSelectedPackage(Activity activity);

    void refreshStateIfColorsChanged(l lVar, boolean z);

    void refreshStateIfLocaleChanged();

    void restorePurchases();

    void selectPackage(TemplateConfiguration.PackageInfo packageInfo);

    void trackExitOffer(ExitOfferType exitOfferType, String str);

    void trackPaywallImpressionIfNeeded();
}
