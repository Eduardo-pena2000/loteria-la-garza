package com.revenuecat.purchases.hybridcommon;

import Ca.I;
import Qa.l;
import Za.E;
import android.app.Activity;
import com.revenuecat.purchases.ListenerConversionsCommonKt;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.PurchaseParams;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.hybridcommon.mappers.PurchasesErrorKt;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.SubscriptionOption;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CommonKt$purchaseSubscriptionOption$onReceiveStoreProducts$1 extends u implements l {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ List $addOnPackages;
    final /* synthetic */ List $addOnStoreProducts;
    final /* synthetic */ List $addOnSubscriptionOptions;
    final /* synthetic */ Boolean $googleIsPersonalizedPrice;
    final /* synthetic */ String $googleOldProductId;
    final /* synthetic */ GoogleReplacementMode $googleReplacementMode;
    final /* synthetic */ OnResult $onResult;
    final /* synthetic */ String $optionIdentifier;
    final /* synthetic */ Map $presentedOfferingContext;
    final /* synthetic */ String $productIdentifier;

    public static final class 10 extends u implements l {
        final /* synthetic */ List $addOnPackages;
        final /* synthetic */ OnResult $onResult;
        final /* synthetic */ Map $presentedOfferingContext;
        final /* synthetic */ PurchaseParams.Builder $purchaseParams;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 10(Map map, OnResult onResult, List list, PurchaseParams.Builder builder) {
            super(1);
            this.$presentedOfferingContext = map;
            this.$onResult = onResult;
            this.$addOnPackages = list;
            this.$purchaseParams = builder;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Offerings) obj);
            return I.a;
        }

        public final void invoke(Offerings offerings) {
            t.g(offerings, "offerings");
            Map map = this.$presentedOfferingContext;
            if ((map != null ? CommonKt.toPresentedOfferingContext(map) : null) == null) {
                this.$onResult.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, "There is no or invalid presented offering context data provided to make this purchase"), null, 1, null));
                return;
            }
            try {
                List access$createAddOnPackages = CommonKt.access$createAddOnPackages(this.$addOnPackages, offerings);
                if (access$createAddOnPackages == null || access$createAddOnPackages.isEmpty()) {
                    access$createAddOnPackages = null;
                }
                if (access$createAddOnPackages != null) {
                    this.$purchaseParams.addOnPackages(access$createAddOnPackages);
                }
                ListenerConversionsCommonKt.purchaseWith(Purchases.Companion.getSharedInstance(), this.$purchaseParams.build(), CommonKt.access$getPurchaseErrorFunction(this.$onResult), CommonKt.access$getPurchaseCompletedFunction(this.$onResult));
            } catch (IllegalArgumentException e) {
                this.$onResult.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, e.getMessage()), null, 1, null));
            }
        }
    }

    public static final class 9 extends u implements l {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 9(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return I.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            t.g(purchasesError, "it");
            this.$onResult.onError(PurchasesErrorKt.map$default(purchasesError, null, 1, null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonKt$purchaseSubscriptionOption$onReceiveStoreProducts$1(String str, String str2, Activity activity, Map map, String str3, Boolean bool, List list, List list2, List list3, OnResult onResult, GoogleReplacementMode googleReplacementMode) {
        super(1);
        this.$productIdentifier = str;
        this.$optionIdentifier = str2;
        this.$activity = activity;
        this.$presentedOfferingContext = map;
        this.$googleOldProductId = str3;
        this.$googleIsPersonalizedPrice = bool;
        this.$addOnStoreProducts = list;
        this.$addOnSubscriptionOptions = list2;
        this.$addOnPackages = list3;
        this.$onResult = onResult;
        this.$googleReplacementMode = googleReplacementMode;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List) obj);
        return I.a;
    }

    public final void invoke(List list) {
        PresentedOfferingContext presentedOfferingContext;
        t.g(list, "storeProducts");
        SubscriptionOption access$subscriptionOptionForIdentifiers = CommonKt.access$subscriptionOptionForIdentifiers(this.$productIdentifier, this.$optionIdentifier, list);
        List list2 = null;
        if (access$subscriptionOptionForIdentifiers == null) {
            this.$onResult.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.ProductNotAvailableForPurchaseError, "Couldn't find product " + this.$productIdentifier + ':' + this.$optionIdentifier), null, 1, null));
            return;
        }
        PurchaseParams.Builder builder = new PurchaseParams.Builder(this.$activity, access$subscriptionOptionForIdentifiers);
        Map map = this.$presentedOfferingContext;
        if (map != null && (presentedOfferingContext = CommonKt.toPresentedOfferingContext(map)) != null) {
            builder.presentedOfferingContext(presentedOfferingContext);
        }
        String str = this.$googleOldProductId;
        if (str == null || E.h0(str)) {
            str = null;
        }
        if (str != null) {
            GoogleReplacementMode googleReplacementMode = this.$googleReplacementMode;
            builder.oldProductId(str);
            if (googleReplacementMode != null) {
                builder.googleReplacementMode(googleReplacementMode);
            }
        }
        Boolean bool = this.$googleIsPersonalizedPrice;
        if (bool != null) {
            builder.isPersonalizedPrice(bool.booleanValue());
        }
        List access$createAddOnStoreProducts = CommonKt.access$createAddOnStoreProducts(this.$addOnStoreProducts, list);
        if (access$createAddOnStoreProducts == null || access$createAddOnStoreProducts.isEmpty()) {
            access$createAddOnStoreProducts = null;
        }
        if (access$createAddOnStoreProducts != null) {
            builder.addOnStoreProducts(access$createAddOnStoreProducts);
        }
        List access$createAddOnSubscriptionOptions = CommonKt.access$createAddOnSubscriptionOptions(this.$addOnSubscriptionOptions, list);
        if (access$createAddOnSubscriptionOptions != null && !access$createAddOnSubscriptionOptions.isEmpty()) {
            list2 = access$createAddOnSubscriptionOptions;
        }
        if (list2 != null) {
            builder.addOnSubscriptionOptions(list2);
        }
        List list3 = this.$addOnPackages;
        if (list3 == null || list3.isEmpty()) {
            ListenerConversionsCommonKt.purchaseWith(Purchases.Companion.getSharedInstance(), builder.build(), CommonKt.access$getPurchaseErrorFunction(this.$onResult), CommonKt.access$getPurchaseCompletedFunction(this.$onResult));
        } else {
            ListenerConversionsCommonKt.getOfferingsWith(Purchases.Companion.getSharedInstance(), new 9(this.$onResult), new 10(this.$presentedOfferingContext, this.$onResult, this.$addOnPackages, builder));
        }
    }
}
