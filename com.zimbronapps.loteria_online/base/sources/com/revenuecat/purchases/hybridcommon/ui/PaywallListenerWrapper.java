package com.revenuecat.purchases.hybridcommon.ui;

import Ca.I;
import Qa.l;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.hybridcommon.mappers.CustomerInfoMapperKt;
import com.revenuecat.purchases.hybridcommon.mappers.OfferingsMapperKt;
import com.revenuecat.purchases.hybridcommon.mappers.PurchasesErrorKt;
import com.revenuecat.purchases.hybridcommon.mappers.StoreTransactionMapperKt;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.ui.revenuecatui.PaywallListener;
import com.revenuecat.purchases.ui.revenuecatui.utils.Resumable;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class PaywallListenerWrapper implements PaywallListener {
    public static final Companion Companion = new Companion(null);
    private static final ConcurrentHashMap pendingResumeCallbacks = new ConcurrentHashMap();

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final void resumePurchasePackageInitiated(String str, boolean z) {
            t.g(str, "requestId");
            l lVar = (l) PaywallListenerWrapper.access$getPendingResumeCallbacks$cp().remove(str);
            if (lVar != null) {
                lVar.invoke(Boolean.valueOf(z));
            }
        }

        private Companion() {
        }
    }

    public static final class 1 extends u implements l {
        final /* synthetic */ Resumable $resume;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(Resumable resumable) {
            super(1);
            this.$resume = resumable;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return I.a;
        }

        public final void invoke(boolean z) {
            this.$resume.invoke(z);
        }
    }

    public static final /* synthetic */ ConcurrentHashMap access$getPendingResumeCallbacks$cp() {
        return pendingResumeCallbacks;
    }

    public static final void resumePurchasePackageInitiated(String str, boolean z) {
        Companion.resumePurchasePackageInitiated(str, z);
    }

    public void onPurchaseCancelled() {
        PaywallListener.DefaultImpls.onPurchaseCancelled(this);
    }

    public void onPurchaseCompleted(CustomerInfo customerInfo, StoreTransaction storeTransaction) {
        t.g(customerInfo, "customerInfo");
        t.g(storeTransaction, "storeTransaction");
        onPurchaseCompleted(CustomerInfoMapperKt.map(customerInfo), StoreTransactionMapperKt.map(storeTransaction));
    }

    public abstract void onPurchaseCompleted(Map map, Map map2);

    public void onPurchaseError(PurchasesError purchasesError) {
        t.g(purchasesError, "error");
        onPurchaseError(PurchasesErrorKt.map$default(purchasesError, null, 1, null).getInfo());
    }

    public abstract void onPurchaseError(Map map);

    public void onPurchasePackageInitiated(Package r4, Resumable resumable) {
        t.g(r4, "rcPackage");
        t.g(resumable, "resume");
        String uuid = UUID.randomUUID().toString();
        t.f(uuid, "randomUUID().toString()");
        pendingResumeCallbacks.put(uuid, new 1(resumable));
        onPurchasePackageInitiated(OfferingsMapperKt.map(r4), uuid);
    }

    public void onPurchaseStarted(Package r2) {
        t.g(r2, "rcPackage");
        onPurchaseStarted(OfferingsMapperKt.map(r2));
    }

    public abstract void onPurchaseStarted(Map map);

    public void onRestoreCompleted(CustomerInfo customerInfo) {
        t.g(customerInfo, "customerInfo");
        onRestoreCompleted(CustomerInfoMapperKt.map(customerInfo));
    }

    public abstract void onRestoreCompleted(Map map);

    public void onRestoreError(PurchasesError purchasesError) {
        t.g(purchasesError, "error");
        onRestoreError(PurchasesErrorKt.map$default(purchasesError, null, 1, null).getInfo());
    }

    public abstract void onRestoreError(Map map);

    public void onRestoreStarted() {
        PaywallListener.DefaultImpls.onRestoreStarted(this);
    }

    public void onPurchasePackageInitiated(Map map, String str) {
        t.g(map, "rcPackage");
        t.g(str, "requestId");
        Companion.resumePurchasePackageInitiated(str, true);
    }
}
