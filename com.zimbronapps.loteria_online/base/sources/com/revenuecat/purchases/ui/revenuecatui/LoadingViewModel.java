package com.revenuecat.purchases.ui.revenuecatui;

import Ca.I;
import Ga.e;
import X.l;
import android.app.Activity;
import b0.T1;
import b0.U1;
import b0.h2;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.paywalls.events.ExitOfferType;
import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallResult;
import com.revenuecat.purchases.ui.revenuecatui.components.PaywallAction;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResolvedOffer;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResourceProvider;
import fb.N;
import fb.P;
import fb.g;
import fb.z;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
final class LoadingViewModel implements PaywallViewModel {
    private final z _state;
    private final h2 actionError;
    private final h2 actionInProgress;
    private final h2 preloadedExitOffering;
    private final h2 purchaseCompleted;
    private final ResourceProvider resourceProvider;

    public LoadingViewModel(PaywallState state, ResourceProvider resourceProvider) {
        t.g(state, "state");
        t.g(resourceProvider, "resourceProvider");
        this.resourceProvider = resourceProvider;
        Boolean bool = Boolean.FALSE;
        this.actionInProgress = U1.i(bool, (T1) null, 2, (Object) null);
        this.actionError = U1.i((Object) null, (T1) null, 2, (Object) null);
        this.purchaseCompleted = U1.i(bool, (T1) null, 2, (Object) null);
        this.preloadedExitOffering = U1.i((Object) null, (T1) null, 2, (Object) null);
        this._state = P.a(state);
    }

    public void clearActionError() {
    }

    public void closePaywall(PaywallResult paywallResult) {
    }

    public h2 getActionError() {
        return this.actionError;
    }

    public h2 getActionInProgress() {
        return this.actionInProgress;
    }

    public h2 getPreloadedExitOffering() {
        return this.preloadedExitOffering;
    }

    public h2 getPurchaseCompleted() {
        return this.purchaseCompleted;
    }

    public ResourceProvider getResourceProvider() {
        return this.resourceProvider;
    }

    public N getState() {
        return g.b(this._state);
    }

    public String getWebCheckoutUrl(PaywallAction.External.LaunchWebCheckout launchWebCheckout) {
        t.g(launchWebCheckout, "launchWebCheckout");
        return null;
    }

    public Object handlePackagePurchase(Activity activity, Package r2, ResolvedOffer resolvedOffer, e eVar) {
        return I.a;
    }

    public Object handleRestorePurchases(e eVar) {
        return I.a;
    }

    public void invalidateCustomerInfoCache() {
    }

    public void preloadExitOffering() {
    }

    public void purchaseSelectedPackage(Activity activity) {
    }

    public void refreshStateIfColorsChanged(l colorScheme, boolean z) {
        t.g(colorScheme, "colorScheme");
    }

    public void refreshStateIfLocaleChanged() {
    }

    public void restorePurchases() {
    }

    public void selectPackage(TemplateConfiguration.PackageInfo packageToSelect) {
        t.g(packageToSelect, "packageToSelect");
    }

    public void trackExitOffer(ExitOfferType exitOfferType, String exitOfferingIdentifier) {
        t.g(exitOfferType, "exitOfferType");
        t.g(exitOfferingIdentifier, "exitOfferingIdentifier");
    }

    public void trackPaywallImpressionIfNeeded() {
    }
}
