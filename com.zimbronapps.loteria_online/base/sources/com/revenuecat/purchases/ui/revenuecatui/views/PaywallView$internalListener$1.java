package com.revenuecat.purchases.ui.revenuecatui.views;

import Ca.I;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.ui.revenuecatui.PaywallListener;
import com.revenuecat.purchases.ui.revenuecatui.utils.Resumable;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallView$internalListener$1 implements PaywallListener {
    final /* synthetic */ PaywallView this$0;

    public PaywallView$internalListener$1(PaywallView paywallView) {
        this.this$0 = paywallView;
    }

    public void onPurchaseCancelled() {
        PaywallListener access$getListener$p = PaywallView.access$getListener$p(this.this$0);
        if (access$getListener$p != null) {
            access$getListener$p.onPurchaseCancelled();
        }
    }

    public void onPurchaseCompleted(CustomerInfo customerInfo, StoreTransaction storeTransaction) {
        t.g(customerInfo, "customerInfo");
        t.g(storeTransaction, "storeTransaction");
        PaywallListener access$getListener$p = PaywallView.access$getListener$p(this.this$0);
        if (access$getListener$p != null) {
            access$getListener$p.onPurchaseCompleted(customerInfo, storeTransaction);
        }
    }

    public void onPurchaseError(PurchasesError error) {
        t.g(error, "error");
        PaywallListener access$getListener$p = PaywallView.access$getListener$p(this.this$0);
        if (access$getListener$p != null) {
            access$getListener$p.onPurchaseError(error);
        }
    }

    public void onPurchasePackageInitiated(Package rcPackage, Resumable resume) {
        I i;
        t.g(rcPackage, "rcPackage");
        t.g(resume, "resume");
        PaywallListener access$getListener$p = PaywallView.access$getListener$p(this.this$0);
        if (access$getListener$p != null) {
            access$getListener$p.onPurchasePackageInitiated(rcPackage, resume);
            i = I.a;
        } else {
            i = null;
        }
        if (i == null) {
            Resumable.DefaultImpls.invoke$default(resume, false, 1, null);
        }
    }

    public void onPurchaseStarted(Package rcPackage) {
        t.g(rcPackage, "rcPackage");
        PaywallListener access$getListener$p = PaywallView.access$getListener$p(this.this$0);
        if (access$getListener$p != null) {
            access$getListener$p.onPurchaseStarted(rcPackage);
        }
    }

    public void onRestoreCompleted(CustomerInfo customerInfo) {
        t.g(customerInfo, "customerInfo");
        PaywallListener access$getListener$p = PaywallView.access$getListener$p(this.this$0);
        if (access$getListener$p != null) {
            access$getListener$p.onRestoreCompleted(customerInfo);
        }
    }

    public void onRestoreError(PurchasesError error) {
        t.g(error, "error");
        PaywallListener access$getListener$p = PaywallView.access$getListener$p(this.this$0);
        if (access$getListener$p != null) {
            access$getListener$p.onRestoreError(error);
        }
    }

    public void onRestoreStarted() {
        PaywallListener access$getListener$p = PaywallView.access$getListener$p(this.this$0);
        if (access$getListener$p != null) {
            access$getListener$p.onRestoreStarted();
        }
    }
}
