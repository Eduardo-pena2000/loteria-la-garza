package com.revenuecat.purchases.ui.revenuecatui.activity;

import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.ui.revenuecatui.PaywallListener;
import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallResult;
import com.revenuecat.purchases.ui.revenuecatui.utils.Resumable;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallActivity$onCreate$compositeListener$1 implements PaywallListener {
    final /* synthetic */ PaywallActivityArgs $args;
    final /* synthetic */ PaywallListener $userListener;
    final /* synthetic */ PaywallActivity this$0;

    public PaywallActivity$onCreate$compositeListener$1(PaywallListener paywallListener, PaywallActivity paywallActivity, PaywallActivityArgs paywallActivityArgs) {
        this.$userListener = paywallListener;
        this.this$0 = paywallActivity;
        this.$args = paywallActivityArgs;
    }

    public void onPurchaseCancelled() {
        PaywallListener paywallListener = this.$userListener;
        if (paywallListener != null) {
            paywallListener.onPurchaseCancelled();
        }
    }

    public void onPurchaseCompleted(CustomerInfo customerInfo, StoreTransaction storeTransaction) {
        t.g(customerInfo, "customerInfo");
        t.g(storeTransaction, "storeTransaction");
        PaywallListener paywallListener = this.$userListener;
        if (paywallListener != null) {
            paywallListener.onPurchaseCompleted(customerInfo, storeTransaction);
        }
        PaywallActivity paywallActivity = this.this$0;
        paywallActivity.setResult(-1, PaywallActivity.access$createResultIntent(paywallActivity, new PaywallResult.Purchased(customerInfo)));
        this.this$0.finish();
    }

    public void onPurchaseError(PurchasesError error) {
        t.g(error, "error");
        PaywallListener paywallListener = this.$userListener;
        if (paywallListener != null) {
            paywallListener.onPurchaseError(error);
        }
        PaywallResult error2 = error.getCode() == PurchasesErrorCode.PurchaseCancelledError ? PaywallResult.Cancelled.INSTANCE : new PaywallResult.Error(error);
        PaywallActivity paywallActivity = this.this$0;
        paywallActivity.setResult(-1, PaywallActivity.access$createResultIntent(paywallActivity, error2));
    }

    public void onPurchasePackageInitiated(Package rcPackage, Resumable resume) {
        t.g(rcPackage, "rcPackage");
        t.g(resume, "resume");
        PaywallListener paywallListener = this.$userListener;
        if (paywallListener != null) {
            paywallListener.onPurchasePackageInitiated(rcPackage, resume);
        } else {
            Resumable.DefaultImpls.invoke$default(resume, false, 1, null);
        }
    }

    public void onPurchaseStarted(Package rcPackage) {
        t.g(rcPackage, "rcPackage");
        PaywallListener paywallListener = this.$userListener;
        if (paywallListener != null) {
            paywallListener.onPurchaseStarted(rcPackage);
        }
    }

    public void onRestoreCompleted(CustomerInfo customerInfo) {
        String requiredEntitlementIdentifier;
        t.g(customerInfo, "customerInfo");
        PaywallListener paywallListener = this.$userListener;
        if (paywallListener != null) {
            paywallListener.onRestoreCompleted(customerInfo);
        }
        PaywallActivity paywallActivity = this.this$0;
        paywallActivity.setResult(-1, PaywallActivity.access$createResultIntent(paywallActivity, new PaywallResult.Restored(customerInfo)));
        PaywallActivityArgs paywallActivityArgs = this.$args;
        if (paywallActivityArgs == null || (requiredEntitlementIdentifier = paywallActivityArgs.getRequiredEntitlementIdentifier()) == null || !customerInfo.getEntitlements().getActive().containsKey(requiredEntitlementIdentifier)) {
            return;
        }
        this.this$0.finish();
    }

    public void onRestoreError(PurchasesError error) {
        t.g(error, "error");
        PaywallListener paywallListener = this.$userListener;
        if (paywallListener != null) {
            paywallListener.onRestoreError(error);
        }
        PaywallActivity paywallActivity = this.this$0;
        paywallActivity.setResult(-1, PaywallActivity.access$createResultIntent(paywallActivity, new PaywallResult.Error(error)));
    }

    public void onRestoreStarted() {
        PaywallListener paywallListener = this.$userListener;
        if (paywallListener != null) {
            paywallListener.onRestoreStarted();
        }
    }
}
