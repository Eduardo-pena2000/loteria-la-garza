package com.revenuecat.purchases.ui.revenuecatui.views;

import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.ui.revenuecatui.PaywallListener;
import com.revenuecat.purchases.ui.revenuecatui.utils.Resumable;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class OriginalTemplatePaywallFooterView$internalListener$1 implements PaywallListener {
    final /* synthetic */ OriginalTemplatePaywallFooterView this$0;

    public OriginalTemplatePaywallFooterView$internalListener$1(OriginalTemplatePaywallFooterView originalTemplatePaywallFooterView) {
        this.this$0 = originalTemplatePaywallFooterView;
    }

    public void onPurchaseCancelled() {
        PaywallListener access$getListener$p = OriginalTemplatePaywallFooterView.access$getListener$p(this.this$0);
        if (access$getListener$p != null) {
            access$getListener$p.onPurchaseCancelled();
        }
    }

    public void onPurchaseCompleted(CustomerInfo customerInfo, StoreTransaction storeTransaction) {
        t.g(customerInfo, "customerInfo");
        t.g(storeTransaction, "storeTransaction");
        PaywallListener access$getListener$p = OriginalTemplatePaywallFooterView.access$getListener$p(this.this$0);
        if (access$getListener$p != null) {
            access$getListener$p.onPurchaseCompleted(customerInfo, storeTransaction);
        }
    }

    public void onPurchaseError(PurchasesError error) {
        t.g(error, "error");
        PaywallListener access$getListener$p = OriginalTemplatePaywallFooterView.access$getListener$p(this.this$0);
        if (access$getListener$p != null) {
            access$getListener$p.onPurchaseError(error);
        }
    }

    public void onPurchasePackageInitiated(Package r1, Resumable resumable) {
        PaywallListener.DefaultImpls.onPurchasePackageInitiated(this, r1, resumable);
    }

    public void onPurchaseStarted(Package rcPackage) {
        t.g(rcPackage, "rcPackage");
        PaywallListener access$getListener$p = OriginalTemplatePaywallFooterView.access$getListener$p(this.this$0);
        if (access$getListener$p != null) {
            access$getListener$p.onPurchaseStarted(rcPackage);
        }
    }

    public void onRestoreCompleted(CustomerInfo customerInfo) {
        t.g(customerInfo, "customerInfo");
        PaywallListener access$getListener$p = OriginalTemplatePaywallFooterView.access$getListener$p(this.this$0);
        if (access$getListener$p != null) {
            access$getListener$p.onRestoreCompleted(customerInfo);
        }
    }

    public void onRestoreError(PurchasesError error) {
        t.g(error, "error");
        PaywallListener access$getListener$p = OriginalTemplatePaywallFooterView.access$getListener$p(this.this$0);
        if (access$getListener$p != null) {
            access$getListener$p.onRestoreError(error);
        }
    }

    public void onRestoreStarted() {
        PaywallListener access$getListener$p = OriginalTemplatePaywallFooterView.access$getListener$p(this.this$0);
        if (access$getListener$p != null) {
            access$getListener$p.onRestoreStarted();
        }
    }
}
