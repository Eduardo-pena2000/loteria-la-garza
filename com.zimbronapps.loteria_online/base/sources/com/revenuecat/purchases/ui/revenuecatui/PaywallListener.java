package com.revenuecat.purchases.ui.revenuecatui;

import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.ui.revenuecatui.utils.Resumable;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface PaywallListener {

    public static final class DefaultImpls {
        public static void onPurchaseCancelled(PaywallListener paywallListener) {
        }

        public static void onPurchaseCompleted(PaywallListener paywallListener, CustomerInfo customerInfo, StoreTransaction storeTransaction) {
            t.g(customerInfo, "customerInfo");
            t.g(storeTransaction, "storeTransaction");
        }

        public static void onPurchaseError(PaywallListener paywallListener, PurchasesError error) {
            t.g(error, "error");
        }

        public static void onPurchasePackageInitiated(PaywallListener paywallListener, Package rcPackage, Resumable resume) {
            t.g(rcPackage, "rcPackage");
            t.g(resume, "resume");
            Resumable.DefaultImpls.invoke$default(resume, false, 1, null);
        }

        public static void onPurchaseStarted(PaywallListener paywallListener, Package rcPackage) {
            t.g(rcPackage, "rcPackage");
        }

        public static void onRestoreCompleted(PaywallListener paywallListener, CustomerInfo customerInfo) {
            t.g(customerInfo, "customerInfo");
        }

        public static void onRestoreError(PaywallListener paywallListener, PurchasesError error) {
            t.g(error, "error");
        }

        public static void onRestoreStarted(PaywallListener paywallListener) {
        }
    }

    void onPurchaseCancelled();

    void onPurchaseCompleted(CustomerInfo customerInfo, StoreTransaction storeTransaction);

    void onPurchaseError(PurchasesError purchasesError);

    void onPurchasePackageInitiated(Package r1, Resumable resumable);

    void onPurchaseStarted(Package r1);

    void onRestoreCompleted(CustomerInfo customerInfo);

    void onRestoreError(PurchasesError purchasesError);

    void onRestoreStarted();
}
