package com.revenuecat.purchases.hybridcommon;

import Ca.I;
import Ca.e;
import Ca.o;
import Ca.q;
import Ca.s;
import Ca.x;
import Da.D;
import Da.Q;
import Da.S;
import Da.v;
import Da.w;
import Qa.l;
import Qa.p;
import Za.B;
import Za.E;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.revenuecat.purchases.AmazonLWAConsentStatus;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.DangerousSettings;
import com.revenuecat.purchases.DebugEvent;
import com.revenuecat.purchases.EntitlementVerificationMode;
import com.revenuecat.purchases.ListenerConversionsCommonKt;
import com.revenuecat.purchases.ListenerConversionsKt;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchaseParams;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.PurchasesAreCompletedBy;
import com.revenuecat.purchases.PurchasesConfiguration;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.PurchasesException;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.WebPurchaseRedemption;
import com.revenuecat.purchases.ads.events.types.AdDisplayedData;
import com.revenuecat.purchases.ads.events.types.AdFailedToLoadData;
import com.revenuecat.purchases.ads.events.types.AdFormat;
import com.revenuecat.purchases.ads.events.types.AdLoadedData;
import com.revenuecat.purchases.ads.events.types.AdMediatorName;
import com.revenuecat.purchases.ads.events.types.AdOpenedData;
import com.revenuecat.purchases.ads.events.types.AdRevenueData;
import com.revenuecat.purchases.ads.events.types.AdRevenuePrecision;
import com.revenuecat.purchases.common.PlatformInfo;
import com.revenuecat.purchases.common.events.FeatureEvent;
import com.revenuecat.purchases.hybridcommon.PurchasableItem;
import com.revenuecat.purchases.hybridcommon.mappers.CustomerInfoMapperKt;
import com.revenuecat.purchases.hybridcommon.mappers.DebugEventMapperKt;
import com.revenuecat.purchases.hybridcommon.mappers.FeatureEventMapperKt;
import com.revenuecat.purchases.hybridcommon.mappers.LogHandlerWithMapping;
import com.revenuecat.purchases.hybridcommon.mappers.MappedProductCategory;
import com.revenuecat.purchases.hybridcommon.mappers.OfferingsMapperKt;
import com.revenuecat.purchases.hybridcommon.mappers.PurchasesErrorKt;
import com.revenuecat.purchases.hybridcommon.mappers.VirtualCurrenciesMapperKt;
import com.revenuecat.purchases.interfaces.RedeemWebPurchaseListener;
import com.revenuecat.purchases.interfaces.SyncAttributesAndOfferingsCallback;
import com.revenuecat.purchases.models.BillingFeature;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.GoogleStoreProduct;
import com.revenuecat.purchases.models.GoogleStoreProductKt;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import com.revenuecat.purchases.paywalls.events.CustomPaywallImpressionParams;
import com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CommonKt {

    public static final class 1 extends u implements l {
        final /* synthetic */ l $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(l lVar) {
            super(1);
            this.$onError = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return I.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            t.g(purchasesError, "it");
            this.$onError.invoke(purchasesError);
        }
    }

    public static final class 2 extends u implements l {
        final /* synthetic */ List $addOnStoreProducts;
        final /* synthetic */ List $addOnSubscriptionOptions;
        final /* synthetic */ p $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(List list, List list2, p pVar) {
            super(1);
            this.$addOnStoreProducts = list;
            this.$addOnSubscriptionOptions = list2;
            this.$onResult = pVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List) obj);
            return I.a;
        }

        public final void invoke(List list) {
            t.g(list, "storeProducts");
            this.$onResult.invoke(CommonKt.access$createAddOnStoreProducts(this.$addOnStoreProducts, list), CommonKt.access$createAddOnSubscriptionOptions(this.$addOnSubscriptionOptions, list));
        }
    }

    public static final class 1 extends u implements l {
        final /* synthetic */ OnResultAny $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(OnResultAny onResultAny) {
            super(1);
            this.$onResult = onResultAny;
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

    public static final class 2 extends u implements l {
        final /* synthetic */ OnResultAny $onResult;

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AmazonLWAConsentStatus.values().length];
                try {
                    iArr[AmazonLWAConsentStatus.CONSENTED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AmazonLWAConsentStatus.UNAVAILABLE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(OnResultAny onResultAny) {
            super(1);
            this.$onResult = onResultAny;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AmazonLWAConsentStatus) obj);
            return I.a;
        }

        public final void invoke(AmazonLWAConsentStatus amazonLWAConsentStatus) {
            t.g(amazonLWAConsentStatus, "it");
            OnResultAny onResultAny = this.$onResult;
            int i = WhenMappings.$EnumSwitchMapping$0[amazonLWAConsentStatus.ordinal()];
            boolean z = true;
            if (i != 1) {
                if (i != 2) {
                    throw new o();
                }
                z = false;
            }
            onResultAny.onReceived(Boolean.valueOf(z));
        }
    }

    public static final class 1 extends u implements l {
        final /* synthetic */ OnNullableResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(OnNullableResult onNullableResult) {
            super(1);
            this.$onResult = onNullableResult;
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

    public static final class 2 extends u implements l {
        final /* synthetic */ OnNullableResult $onResult;
        final /* synthetic */ String $placementIdentifier;

        public static final class 1 extends u implements l {
            final /* synthetic */ OnNullableResult $onResult;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(OnNullableResult onNullableResult) {
                super(1);
                this.$onResult = onNullableResult;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Map) obj);
                return I.a;
            }

            public final void invoke(Map map) {
                t.g(map, "map");
                this.$onResult.onReceived(map);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(String str, OnNullableResult onNullableResult) {
            super(1);
            this.$placementIdentifier = str;
            this.$onResult = onNullableResult;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Offerings) obj);
            return I.a;
        }

        public final void invoke(Offerings offerings) {
            t.g(offerings, "it");
            Offering currentOfferingForPlacement = offerings.getCurrentOfferingForPlacement(this.$placementIdentifier);
            if (currentOfferingForPlacement != null) {
                OfferingsMapperKt.mapAsync(currentOfferingForPlacement, new 1(this.$onResult));
            } else {
                this.$onResult.onReceived(null);
            }
        }
    }

    public static final class 1 extends u implements l {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(OnResult onResult) {
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

    public static final class 2 extends u implements l {
        final /* synthetic */ OnResult $onResult;

        public static final class 1 extends u implements l {
            final /* synthetic */ OnResult $onResult;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(OnResult onResult) {
                super(1);
                this.$onResult = onResult;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Map) obj);
                return I.a;
            }

            public final void invoke(Map map) {
                t.g(map, "map");
                this.$onResult.onReceived(map);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CustomerInfo) obj);
            return I.a;
        }

        public final void invoke(CustomerInfo customerInfo) {
            t.g(customerInfo, "customerInfo");
            CustomerInfoMapperKt.mapAsync(customerInfo, new 1(this.$onResult));
        }
    }

    public static final class 1 extends u implements l {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(OnResult onResult) {
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

    public static final class 2 extends u implements l {
        final /* synthetic */ OnResult $onResult;

        public static final class 1 extends u implements l {
            final /* synthetic */ OnResult $onResult;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(OnResult onResult) {
                super(1);
                this.$onResult = onResult;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Map) obj);
                return I.a;
            }

            public final void invoke(Map map) {
                t.g(map, "map");
                this.$onResult.onReceived(map);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Offerings) obj);
            return I.a;
        }

        public final void invoke(Offerings offerings) {
            t.g(offerings, "offerings");
            OfferingsMapperKt.mapAsync(offerings, new 1(this.$onResult));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(OnResult onResult) {
            super(2);
            this.$onResult = onResult;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((StoreTransaction) obj, (CustomerInfo) obj2);
            return I.a;
        }

        public final void invoke(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
            I i;
            t.g(customerInfo, "customerInfo");
            if (storeTransaction != null) {
                CustomerInfoMapperKt.mapAsync(customerInfo, new CommonKt$getPurchaseCompletedFunction$1$1$1(this.$onResult, storeTransaction));
                i = I.a;
            } else {
                i = null;
            }
            if (i == null) {
                this.$onResult.onError(new ErrorContainer(PurchasesErrorCode.UnsupportedError.getCode(), "Error purchasing. Null transaction returned from a successful non-upgrade purchase.", S.h()));
            }
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(OnResult onResult) {
            super(2);
            this.$onResult = onResult;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((PurchasesError) obj, ((Boolean) obj2).booleanValue());
            return I.a;
        }

        public final void invoke(PurchasesError purchasesError, boolean z) {
            t.g(purchasesError, "error");
            this.$onResult.onError(PurchasesErrorKt.map(purchasesError, Q.f(x.a("userCancelled", Boolean.valueOf(z)))));
        }
    }

    public static final class 1 extends u implements l {
        final /* synthetic */ l $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(l lVar) {
            super(1);
            this.$callback = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return I.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            t.g(purchasesError, "it");
            this.$callback.invoke((Object) null);
        }
    }

    public static final class 2 extends u implements l {
        final /* synthetic */ l $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(l lVar) {
            super(1);
            this.$callback = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return I.a;
        }

        public final void invoke(String str) {
            t.g(str, "it");
            this.$callback.invoke(Q.f(x.a("countryCode", str)));
        }
    }

    public static final class 1 extends u implements l {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return I.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            t.g(purchasesError, "error");
            this.$onResult.onError(PurchasesErrorKt.map$default(purchasesError, null, 1, null));
        }
    }

    public static final class 2 extends u implements l {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((VirtualCurrencies) obj);
            return I.a;
        }

        public final void invoke(VirtualCurrencies virtualCurrencies) {
            t.g(virtualCurrencies, "virtualCurrencies");
            this.$onResult.onReceived(VirtualCurrenciesMapperKt.map(virtualCurrencies));
        }
    }

    public static final class 1 extends u implements l {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(OnResult onResult) {
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

    public static final class 2 extends u implements p {
        final /* synthetic */ OnResult $onResult;

        public static final class 1 extends u implements l {
            final /* synthetic */ boolean $created;
            final /* synthetic */ OnResult $onResult;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(boolean z, OnResult onResult) {
                super(1);
                this.$created = z;
                this.$onResult = onResult;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Map) obj);
                return I.a;
            }

            public final void invoke(Map map) {
                t.g(map, "map");
                this.$onResult.onReceived(S.l(new q[]{x.a("customerInfo", map), x.a("created", Boolean.valueOf(this.$created))}));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(OnResult onResult) {
            super(2);
            this.$onResult = onResult;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((CustomerInfo) obj, ((Boolean) obj2).booleanValue());
            return I.a;
        }

        public final void invoke(CustomerInfo customerInfo, boolean z) {
            t.g(customerInfo, "customerInfo");
            CustomerInfoMapperKt.mapAsync(customerInfo, new 1(z, this.$onResult));
        }
    }

    public static final class 1 extends u implements l {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(OnResult onResult) {
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

    public static final class 2 extends u implements l {
        final /* synthetic */ OnResult $onResult;

        public static final class 1 extends u implements l {
            final /* synthetic */ OnResult $onResult;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(OnResult onResult) {
                super(1);
                this.$onResult = onResult;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Map) obj);
                return I.a;
            }

            public final void invoke(Map map) {
                t.g(map, "map");
                this.$onResult.onReceived(map);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CustomerInfo) obj);
            return I.a;
        }

        public final void invoke(CustomerInfo customerInfo) {
            t.g(customerInfo, "customerInfo");
            CustomerInfoMapperKt.mapAsync(customerInfo, new 1(this.$onResult));
        }
    }

    public static final class 1 extends u implements l {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(OnResult onResult) {
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

    public static final class 2 extends u implements l {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ List $addOnPackages;
        final /* synthetic */ List $addOnStoreProducts;
        final /* synthetic */ List $addOnSubscriptionOptions;
        final /* synthetic */ Boolean $googleIsPersonalizedPrice;
        final /* synthetic */ String $googleOldProductId;
        final /* synthetic */ GoogleReplacementMode $googleReplacementMode;
        final /* synthetic */ OnResult $onResult;
        final /* synthetic */ String $packageIdentifier;
        final /* synthetic */ Map $presentedOfferingContext;

        public static final class 2 extends u implements l {
            final /* synthetic */ OnResult $onResult;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 2(OnResult onResult) {
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

        public static final class 3 extends u implements p {
            final /* synthetic */ List $addOnPackages;
            final /* synthetic */ Offerings $offerings;
            final /* synthetic */ OnResult $onResult;
            final /* synthetic */ PurchaseParams.Builder $purchaseParams;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 3(List list, Offerings offerings, OnResult onResult, PurchaseParams.Builder builder) {
                super(2);
                this.$addOnPackages = list;
                this.$offerings = offerings;
                this.$onResult = onResult;
                this.$purchaseParams = builder;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((List) obj, (List) obj2);
                return I.a;
            }

            public final void invoke(List list, List list2) {
                if (list == null || list.isEmpty()) {
                    list = null;
                }
                if (list != null) {
                    this.$purchaseParams.addOnStoreProducts(list);
                }
                if (list2 == null || list2.isEmpty()) {
                    list2 = null;
                }
                if (list2 != null) {
                    this.$purchaseParams.addOnSubscriptionOptions(list2);
                }
                try {
                    List access$createAddOnPackages = CommonKt.access$createAddOnPackages(this.$addOnPackages, this.$offerings);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(Map map, OnResult onResult, Activity activity, String str, GoogleReplacementMode googleReplacementMode, Boolean bool, List list, List list2, List list3, String str2) {
            super(1);
            this.$presentedOfferingContext = map;
            this.$onResult = onResult;
            this.$activity = activity;
            this.$googleOldProductId = str;
            this.$googleReplacementMode = googleReplacementMode;
            this.$googleIsPersonalizedPrice = bool;
            this.$addOnStoreProducts = list;
            this.$addOnSubscriptionOptions = list2;
            this.$addOnPackages = list3;
            this.$packageIdentifier = str2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Offerings) obj);
            return I.a;
        }

        public final void invoke(Offerings offerings) {
            Package r5;
            List list;
            List list2;
            List availablePackages;
            Object obj;
            t.g(offerings, "offerings");
            PresentedOfferingContext presentedOfferingContext = CommonKt.toPresentedOfferingContext(this.$presentedOfferingContext);
            if (presentedOfferingContext == null) {
                this.$onResult.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, "There is no or invalid presented offering context data provided to make this purchase"), null, 1, null));
                return;
            }
            Offering offering = offerings.get(presentedOfferingContext.getOfferingIdentifier());
            if (offering == null || (availablePackages = offering.getAvailablePackages()) == null) {
                r5 = null;
            } else {
                String str = this.$packageIdentifier;
                Iterator it = availablePackages.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (B.z(((Package) obj).getIdentifier(), str, true)) {
                            break;
                        }
                    }
                }
                r5 = (Package) obj;
            }
            if (r5 == null) {
                this.$onResult.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.ProductNotAvailableForPurchaseError, "Couldn't find product for package " + this.$packageIdentifier), null, 1, null));
                return;
            }
            PurchaseParams.Builder builder = new PurchaseParams.Builder(this.$activity, r5);
            builder.presentedOfferingContext(presentedOfferingContext);
            String str2 = this.$googleOldProductId;
            if (str2 != null && !E.h0(str2)) {
                builder.oldProductId(this.$googleOldProductId);
                GoogleReplacementMode googleReplacementMode = this.$googleReplacementMode;
                if (googleReplacementMode != null) {
                    builder.googleReplacementMode(googleReplacementMode);
                }
            }
            Boolean bool = this.$googleIsPersonalizedPrice;
            if (bool != null) {
                builder.isPersonalizedPrice(bool.booleanValue());
            }
            List list3 = this.$addOnStoreProducts;
            if ((list3 == null || list3.isEmpty()) && (((list = this.$addOnSubscriptionOptions) == null || list.isEmpty()) && ((list2 = this.$addOnPackages) == null || list2.isEmpty()))) {
                ListenerConversionsCommonKt.purchaseWith(Purchases.Companion.getSharedInstance(), builder.build(), CommonKt.access$getPurchaseErrorFunction(this.$onResult), CommonKt.access$getPurchaseCompletedFunction(this.$onResult));
            } else {
                CommonKt.access$fetchAddOnStoreProductsAndSubscriptionOptions(this.$addOnStoreProducts, this.$addOnSubscriptionOptions, new 2(this.$onResult), new 3(this.$addOnPackages, offerings, this.$onResult, builder));
            }
        }
    }

    public static final class 1 extends u implements l {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(OnResult onResult) {
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

    public static final class 2 extends u implements l {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(OnResult onResult) {
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

    public static final class 1 extends u implements l {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(OnResult onResult) {
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

    public static final class 1 extends u implements l {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(OnResult onResult) {
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

    public static final class 2 extends u implements l {
        final /* synthetic */ OnResult $onResult;

        public static final class 1 extends u implements l {
            final /* synthetic */ OnResult $onResult;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(OnResult onResult) {
                super(1);
                this.$onResult = onResult;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Map) obj);
                return I.a;
            }

            public final void invoke(Map map) {
                t.g(map, "map");
                this.$onResult.onReceived(map);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CustomerInfo) obj);
            return I.a;
        }

        public final void invoke(CustomerInfo customerInfo) {
            t.g(customerInfo, "customerInfo");
            CustomerInfoMapperKt.mapAsync(customerInfo, new 1(this.$onResult));
        }
    }

    public static final class 1 implements SyncAttributesAndOfferingsCallback {
        final /* synthetic */ OnResult $onResult;

        public 1(OnResult onResult) {
            this.$onResult = onResult;
        }

        public void onError(PurchasesError purchasesError) {
            t.g(purchasesError, "error");
            this.$onResult.onError(PurchasesErrorKt.map$default(purchasesError, null, 1, null));
        }

        public void onSuccess(Offerings offerings) {
            t.g(offerings, "offerings");
            OfferingsMapperKt.mapAsync(offerings, new CommonKt$setAppstackAttributionParams$1$onSuccess$1(this.$onResult));
        }
    }

    public static final class 1 extends u implements l {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Map) obj);
            return I.a;
        }

        public final void invoke(Map map) {
            t.g(map, "logDetails");
            this.$onResult.onReceived(map);
        }
    }

    public static final class 1 extends u implements l {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(OnResult onResult) {
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

    public static final class 2 extends u implements l {
        final /* synthetic */ OnResult $onResult;

        public static final class 1 extends u implements l {
            final /* synthetic */ OnResult $onResult;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(OnResult onResult) {
                super(1);
                this.$onResult = onResult;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Map) obj);
                return I.a;
            }

            public final void invoke(Map map) {
                t.g(map, "map");
                this.$onResult.onReceived(map);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Offerings) obj);
            return I.a;
        }

        public final void invoke(Offerings offerings) {
            t.g(offerings, "it");
            OfferingsMapperKt.mapAsync(offerings, new 1(this.$onResult));
        }
    }

    public static final class 1 extends u implements l {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(OnResult onResult) {
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

    public static final class 2 extends u implements l {
        final /* synthetic */ OnResult $onResult;

        public static final class 1 extends u implements l {
            final /* synthetic */ OnResult $onResult;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(OnResult onResult) {
                super(1);
                this.$onResult = onResult;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Map) obj);
                return I.a;
            }

            public final void invoke(Map map) {
                t.g(map, "map");
                this.$onResult.onReceived(map);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CustomerInfo) obj);
            return I.a;
        }

        public final void invoke(CustomerInfo customerInfo) {
            t.g(customerInfo, "customerInfo");
            CustomerInfoMapperKt.mapAsync(customerInfo, new 1(this.$onResult));
        }
    }

    public static /* synthetic */ void a(l lVar, FeatureEvent featureEvent) {
        setTrackedEventListener$lambda$15(lVar, featureEvent);
    }

    public static final /* synthetic */ List access$createAddOnPackages(List list, Offerings offerings) {
        return createAddOnPackages(list, offerings);
    }

    public static final /* synthetic */ List access$createAddOnStoreProducts(List list, List list2) {
        return createAddOnStoreProducts(list, list2);
    }

    public static final /* synthetic */ List access$createAddOnSubscriptionOptions(List list, List list2) {
        return createAddOnSubscriptionOptions(list, list2);
    }

    public static final /* synthetic */ void access$fetchAddOnStoreProductsAndSubscriptionOptions(List list, List list2, l lVar, p pVar) {
        fetchAddOnStoreProductsAndSubscriptionOptions(list, list2, lVar, pVar);
    }

    public static final /* synthetic */ p access$getPurchaseCompletedFunction(OnResult onResult) {
        return getPurchaseCompletedFunction(onResult);
    }

    public static final /* synthetic */ p access$getPurchaseErrorFunction(OnResult onResult) {
        return getPurchaseErrorFunction(onResult);
    }

    public static final /* synthetic */ StoreProduct access$storeProductForProductId(String str, ProductType productType, String str2, List list) {
        return storeProductForProductId(str, productType, str2, list);
    }

    public static final /* synthetic */ SubscriptionOption access$subscriptionOptionForIdentifiers(String str, String str2, List list) {
        return subscriptionOptionForIdentifiers(str, str2, list);
    }

    public static final /* synthetic */ String access$toResultName(RedeemWebPurchaseListener.Result result) {
        return toResultName(result);
    }

    private static final List addOnProductIdsToFetch(List list, List list2) {
        ArrayList arrayList;
        Iterable iterable = null;
        if (list != null) {
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Object obj = ((Map) it.next()).get("productIdentifier");
                CharSequence charSequence = obj instanceof String ? (String) obj : null;
                String str = charSequence == null ? null : (String) D.f0(E.M0(charSequence, new String[]{":"}, false, 0, 6, (Object) null));
                if (str != null) {
                    arrayList.add(str);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = v.n();
        }
        if (list2 != null) {
            Iterable arrayList2 = new ArrayList();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                Object obj2 = ((Map) it2.next()).get("productIdentifier");
                CharSequence charSequence2 = obj2 instanceof String ? (String) obj2 : null;
                String str2 = charSequence2 == null ? null : (String) D.f0(E.M0(charSequence2, new String[]{":"}, false, 0, 6, (Object) null));
                if (str2 != null) {
                    arrayList2.add(str2);
                }
            }
            iterable = arrayList2;
        }
        if (iterable == null) {
            iterable = v.n();
        }
        return D.v0(arrayList, iterable);
    }

    public static /* synthetic */ void b(l lVar, DebugEvent debugEvent) {
        setDebugEventListener$lambda$16(lVar, debugEvent);
    }

    public static /* synthetic */ void c(OnResult onResult, RedeemWebPurchaseListener.Result result) {
        redeemWebPurchase$lambda$17(onResult, result);
    }

    public static final void canMakePayments(Context context, List list, OnResultAny onResultAny) {
        t.g(context, "context");
        t.g(list, "features");
        t.g(onResultAny, "onResult");
        List arrayList = new ArrayList();
        try {
            BillingFeature[] values = BillingFeature.values();
            ArrayList arrayList2 = new ArrayList(w.y(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(values[((Number) it.next()).intValue()]);
            }
            arrayList.addAll(arrayList2);
            Purchases.Companion.canMakePayments(context, arrayList, new d(onResultAny));
        } catch (IndexOutOfBoundsException unused) {
            onResultAny.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.UnknownError, "Invalid feature type passed to canMakePayments."), null, 1, null));
        }
    }

    private static final void canMakePayments$lambda$5(OnResultAny onResultAny, Boolean bool) {
        t.f(bool, "it");
        onResultAny.onReceived(bool);
    }

    private static final List castWildcardListToListOfStringToAnyMaps(List list) {
        LinkedHashMap linkedHashMap;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Map map = obj instanceof Map ? (Map) obj : null;
            if (map == null) {
                linkedHashMap = null;
                break;
            }
            Collection collection = (Iterable) map.keySet();
            if (!(collection instanceof Collection) || !collection.isEmpty()) {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!(it.next() instanceof String)) {
                        linkedHashMap = null;
                        break;
                    }
                }
            }
            linkedHashMap = new LinkedHashMap(Q.e(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                t.e(key, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) key, entry.getValue());
            }
            if (linkedHashMap != null) {
                arrayList.add(linkedHashMap);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047 A[LOOP:0: B:8:0x0041->B:10:0x0047, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.util.Map castWildcardMapToStringToOptionalAnyMap(java.util.Map r4) {
        /*
            r0 = 0
            if (r4 == 0) goto L60
            java.util.Set r1 = r4.keySet()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r2 = r1 instanceof java.util.Collection
            if (r2 == 0) goto L17
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L17
            goto L2a
        L17:
            java.util.Iterator r1 = r1.iterator()
        L1b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r1.next()
            boolean r2 = r2 instanceof java.lang.String
            if (r2 != 0) goto L1b
            goto L60
        L2a:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r4.size()
            int r1 = Da.Q.e(r1)
            r0.<init>(r1)
            java.util.Set r4 = r4.entrySet()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L41:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L60
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.t.e(r2, r3)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            r0.put(r2, r1)
            goto L41
        L60:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.hybridcommon.CommonKt.castWildcardMapToStringToOptionalAnyMap(java.util.Map):java.util.Map");
    }

    public static final Map checkTrialOrIntroductoryPriceEligibility(List list) {
        t.g(list, "productIdentifiers");
        ArrayList arrayList = new ArrayList(w.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(x.a((String) it.next(), S.l(new q[]{x.a("status", 0), x.a("description", "Status indeterminate.")})));
        }
        return S.x(arrayList);
    }

    public static final void configure(Context context, String str, String str2, PlatformInfo platformInfo) {
        t.g(context, "context");
        t.g(str, "apiKey");
        t.g(platformInfo, "platformInfo");
        configure$default(context, str, str2, null, platformInfo, null, null, null, null, null, null, null, null, 8168, null);
    }

    public static /* synthetic */ void configure$default(Context context, String str, String str2, String str3, PlatformInfo platformInfo, Store store, DangerousSettings dangerousSettings, Boolean bool, String str4, Boolean bool2, Boolean bool3, Boolean bool4, String str5, int i, Object obj) {
        configure(context, str, str2, (i & 8) != 0 ? null : str3, platformInfo, (i & 32) != 0 ? Store.PLAY_STORE : store, (i & 64) != 0 ? new DangerousSettings(true) : dangerousSettings, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? null : bool2, (i & 1024) != 0 ? null : bool3, (i & 2048) != 0 ? null : bool4, (i & 4096) != 0 ? null : str5);
    }

    public static final Integer convertToInt(Object obj) {
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Double) {
            return Integer.valueOf((int) ((Number) obj).doubleValue());
        }
        return null;
    }

    private static final List createAddOnPackages(List list, Offerings offerings) throws IllegalArgumentException {
        Package r2;
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            Object obj = map.get("packageIdentifier");
            String str = obj instanceof String ? (String) obj : null;
            if (str != null) {
                Object obj2 = map.get("presentedOfferingContext");
                Map map2 = obj2 instanceof Map ? (Map) obj2 : null;
                if (map2 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Map.Entry entry : map2.entrySet()) {
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        String str2 = key instanceof String ? (String) key : null;
                        q a = str2 != null ? x.a(str2, value) : null;
                        if (a != null) {
                            arrayList2.add(a);
                        }
                    }
                    Map x = S.x(arrayList2);
                    if (x != null) {
                        Object obj3 = x.get("offeringIdentifier");
                        String str3 = obj3 instanceof String ? (String) obj3 : null;
                        if (str3 == null) {
                            throw new IllegalArgumentException("Missing offeringIdentifier for add-on package " + str);
                        }
                        Offering offering = offerings.get(str3);
                        if (offering == null) {
                            throw new IllegalArgumentException("Could not find offering with identifier " + str3 + " for add-on package " + str);
                        }
                        try {
                            r2 = offering.getPackage(str);
                        } catch (NoSuchElementException unused) {
                            throw new IllegalArgumentException("Could not find package with identifier " + str + " in offering with identifier " + str3);
                        }
                    }
                }
                throw new IllegalArgumentException("Missing presentedOfferingContext for add-on package " + str);
            }
            r2 = null;
            if (r2 != null) {
                arrayList.add(r2);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.util.List createAddOnStoreProducts(java.util.List r5, java.util.List r6) {
        /*
            r0 = 0
            if (r5 == 0) goto L51
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto La
            goto L51
        La:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r5 = r5.iterator()
        L13:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L50
            java.lang.Object r2 = r5.next()
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r3 = "productIdentifier"
            java.lang.Object r3 = r2.get(r3)
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L2c
            java.lang.String r3 = (java.lang.String) r3
            goto L2d
        L2c:
            r3 = r0
        L2d:
            if (r3 != 0) goto L31
        L2f:
            r2 = r0
            goto L4a
        L31:
            java.lang.String r4 = "type"
            java.lang.Object r2 = r2.get(r4)
            boolean r4 = r2 instanceof java.lang.String
            if (r4 == 0) goto L3e
            java.lang.String r2 = (java.lang.String) r2
            goto L3f
        L3e:
            r2 = r0
        L3f:
            if (r2 != 0) goto L42
            goto L2f
        L42:
            com.revenuecat.purchases.ProductType r2 = mapStringToProductType(r2)
            com.revenuecat.purchases.models.StoreProduct r2 = storeProductForProductId(r3, r2, r0, r6)
        L4a:
            if (r2 == 0) goto L13
            r1.add(r2)
            goto L13
        L50:
            return r1
        L51:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.hybridcommon.CommonKt.createAddOnStoreProducts(java.util.List, java.util.List):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.util.List createAddOnSubscriptionOptions(java.util.List r5, java.util.List r6) {
        /*
            r0 = 0
            if (r5 == 0) goto L4d
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto La
            goto L4d
        La:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r5 = r5.iterator()
        L13:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L4c
            java.lang.Object r2 = r5.next()
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r3 = "productIdentifier"
            java.lang.Object r3 = r2.get(r3)
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L2c
            java.lang.String r3 = (java.lang.String) r3
            goto L2d
        L2c:
            r3 = r0
        L2d:
            if (r3 != 0) goto L31
        L2f:
            r2 = r0
            goto L46
        L31:
            java.lang.String r4 = "optionIdentifier"
            java.lang.Object r2 = r2.get(r4)
            boolean r4 = r2 instanceof java.lang.String
            if (r4 == 0) goto L3e
            java.lang.String r2 = (java.lang.String) r2
            goto L3f
        L3e:
            r2 = r0
        L3f:
            if (r2 != 0) goto L42
            goto L2f
        L42:
            com.revenuecat.purchases.models.SubscriptionOption r2 = subscriptionOptionForIdentifiers(r3, r2, r6)
        L46:
            if (r2 == 0) goto L13
            r1.add(r2)
            goto L13
        L4c:
            return r1
        L4d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.hybridcommon.CommonKt.createAddOnSubscriptionOptions(java.util.List, java.util.List):java.util.List");
    }

    public static /* synthetic */ void d(OnResultAny onResultAny, Boolean bool) {
        canMakePayments$lambda$5(onResultAny, bool);
    }

    public static final void errorLog(String str) {
        t.g(str, "message");
        if (Purchases.Companion.getLogLevel().compareTo(LogLevel.ERROR) <= 0) {
            Log.e("PurchasesHybridCommon", str);
        }
    }

    private static final void fetchAddOnStoreProductsAndSubscriptionOptions(List list, List list2, l lVar, p pVar) {
        List addOnProductIdsToFetch = addOnProductIdsToFetch(list, list2);
        if (addOnProductIdsToFetch.isEmpty()) {
            pVar.invoke((Object) null, (Object) null);
        } else {
            ListenerConversionsCommonKt.getProductsWith(Purchases.Companion.getSharedInstance(), addOnProductIdsToFetch, ProductType.SUBS, new 1(lVar), new 2(list, list2, pVar));
        }
    }

    public static final void getAmazonLWAConsentStatus(OnResultAny onResultAny) {
        t.g(onResultAny, "onResult");
        ListenerConversionsKt.getAmazonLWAConsentStatusWith(Purchases.Companion.getSharedInstance(), new 1(onResultAny), new 2(onResultAny));
    }

    public static final String getAppUserID() {
        return Purchases.Companion.getSharedInstance().getAppUserID();
    }

    public static final Map getCachedVirtualCurrencies() {
        VirtualCurrencies cachedVirtualCurrencies = Purchases.Companion.getSharedInstance().getCachedVirtualCurrencies();
        if (cachedVirtualCurrencies != null) {
            return VirtualCurrenciesMapperKt.map(cachedVirtualCurrencies);
        }
        return null;
    }

    public static final void getCurrentOfferingForPlacement(String str, OnNullableResult onNullableResult) {
        t.g(str, "placementIdentifier");
        t.g(onNullableResult, "onResult");
        ListenerConversionsCommonKt.getOfferingsWith(Purchases.Companion.getSharedInstance(), new 1(onNullableResult), new 2(str, onNullableResult));
    }

    public static final void getCustomerInfo(OnResult onResult) {
        t.g(onResult, "onResult");
        ListenerConversionsKt.getCustomerInfoWith(Purchases.Companion.getSharedInstance(), new 1(onResult), new 2(onResult));
    }

    public static final GoogleReplacementMode getGoogleReplacementMode(Integer num) throws InvalidReplacementModeException {
        GoogleReplacementMode googleReplacementMode = null;
        if (num != null) {
            int intValue = num.intValue();
            GoogleReplacementMode[] values = GoogleReplacementMode.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                GoogleReplacementMode googleReplacementMode2 = values[i];
                if (googleReplacementMode2.getPlayBillingClientMode() == intValue) {
                    googleReplacementMode = googleReplacementMode2;
                    break;
                }
                i++;
            }
            if (googleReplacementMode == null) {
                throw new InvalidReplacementModeException();
            }
        }
        return googleReplacementMode;
    }

    public static final void getOfferings(OnResult onResult) {
        t.g(onResult, "onResult");
        ListenerConversionsCommonKt.getOfferingsWith(Purchases.Companion.getSharedInstance(), new 1(onResult), new 2(onResult));
    }

    public static final void getProductInfo(List list, String str, OnResultList onResultList) {
        t.g(list, "productIDs");
        t.g(str, "type");
        t.g(onResultList, "onResult");
        CommonKt$getProductInfo$onError$1 commonKt$getProductInfo$onError$1 = new CommonKt$getProductInfo$onError$1(onResultList);
        CommonKt$getProductInfo$onReceived$1 commonKt$getProductInfo$onReceived$1 = new CommonKt$getProductInfo$onReceived$1(onResultList);
        ProductType mapStringToProductType = mapStringToProductType(str);
        ProductType productType = ProductType.SUBS;
        if (mapStringToProductType == productType) {
            ListenerConversionsCommonKt.getProductsWith(Purchases.Companion.getSharedInstance(), list, productType, commonKt$getProductInfo$onError$1, commonKt$getProductInfo$onReceived$1);
        } else {
            ListenerConversionsCommonKt.getProductsWith(Purchases.Companion.getSharedInstance(), list, ProductType.INAPP, commonKt$getProductInfo$onError$1, commonKt$getProductInfo$onReceived$1);
        }
    }

    public static final ErrorContainer getPromotionalOffer() {
        return new ErrorContainer(PurchasesErrorCode.UnsupportedError.getCode(), "Android platform doesn't support promotional offers", S.h());
    }

    public static final String getProxyURLString() {
        return String.valueOf(Purchases.Companion.getProxyURL());
    }

    private static final p getPurchaseCompletedFunction(OnResult onResult) {
        return new 1(onResult);
    }

    private static final p getPurchaseErrorFunction(OnResult onResult) {
        return new 1(onResult);
    }

    public static final void getStorefront(l lVar) {
        t.g(lVar, "callback");
        ListenerConversionsCommonKt.getStorefrontCountryCodeWith(Purchases.Companion.getSharedInstance(), new 1(lVar), new 2(lVar));
    }

    public static final void getVirtualCurrencies(OnResult onResult) {
        t.g(onResult, "onResult");
        ListenerConversionsKt.getVirtualCurrenciesWith(Purchases.Companion.getSharedInstance(), new 1(onResult), new 2(onResult));
    }

    public static final void invalidateCustomerInfoCache() {
        Purchases.Companion.getSharedInstance().invalidateCustomerInfoCache();
    }

    public static final void invalidateVirtualCurrenciesCache() {
        Purchases.Companion.getSharedInstance().invalidateVirtualCurrenciesCache();
    }

    public static final boolean isAnonymous() {
        return Purchases.Companion.getSharedInstance().isAnonymous();
    }

    public static final boolean isWebPurchaseRedemptionURL(String str) {
        t.g(str, "urlString");
        return toWebPurchaseRedemption(str) != null;
    }

    public static final void logIn(String str, OnResult onResult) {
        t.g(str, "appUserID");
        t.g(onResult, "onResult");
        ListenerConversionsKt.logInWith(Purchases.Companion.getSharedInstance(), str, new 1(onResult), new 2(onResult));
    }

    public static final void logOut(OnResult onResult) {
        t.g(onResult, "onResult");
        ListenerConversionsKt.logOutWith(Purchases.Companion.getSharedInstance(), new 1(onResult), new 2(onResult));
    }

    public static final ProductType mapStringToProductType(String str) {
        MappedProductCategory mappedProductCategory;
        t.g(str, "type");
        MappedProductCategory[] values = MappedProductCategory.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                mappedProductCategory = null;
                break;
            }
            mappedProductCategory = values[i];
            if (B.z(mappedProductCategory.getValue(), str, true)) {
                break;
            }
            i++;
        }
        if (mappedProductCategory != null) {
            return mappedProductCategory.getToProductType();
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        t.f(lowerCase, "toLowerCase(...)");
        if (t.c(lowerCase, "subs")) {
            return ProductType.SUBS;
        }
        if (t.c(lowerCase, "inapp")) {
            return ProductType.INAPP;
        }
        warnLog("Unrecognized product type: " + str + "... Defaulting to INAPP");
        return ProductType.INAPP;
    }

    public static final void overridePreferredLocale(String str) {
        Purchases.Companion.getSharedInstance().overridePreferredUILocale(str);
    }

    public static final void purchase(Activity activity, Map map, OnResult onResult) {
        t.g(map, "options");
        t.g(onResult, "onResult");
        Object validatePurchaseParams = validatePurchaseParams(map);
        PurchasesException e = s.e(validatePurchaseParams);
        if (e != null) {
            t.e(e, "null cannot be cast to non-null type com.revenuecat.purchases.PurchasesException");
            onResult.onError(PurchasesErrorKt.map$default(e.getError(), null, 1, null));
        }
        if (s.g(validatePurchaseParams)) {
            validatePurchaseParams = null;
        }
        CommonPurchaseParams commonPurchaseParams = (CommonPurchaseParams) validatePurchaseParams;
        if (commonPurchaseParams == null) {
            return;
        }
        PurchasableItem purchasableItem = commonPurchaseParams.getPurchasableItem();
        if (purchasableItem instanceof PurchasableItem.Product) {
            PurchasableItem.Product product = (PurchasableItem.Product) purchasableItem;
            purchaseProduct(activity, product.getProductIdentifier(), product.getType(), product.getGoogleBasePlanId(), commonPurchaseParams.getGoogleOldProductId(), commonPurchaseParams.getGoogleReplacementMode(), commonPurchaseParams.getGoogleIsPersonalizedPrice(), commonPurchaseParams.getPresentedOfferingContext(), onResult, commonPurchaseParams.getAddOnStoreProducts(), commonPurchaseParams.getAddOnSubscriptionOptions(), commonPurchaseParams.getAddOnPackages());
            return;
        }
        if (!(purchasableItem instanceof PurchasableItem.Package)) {
            if (purchasableItem instanceof PurchasableItem.SubscriptionOption) {
                PurchasableItem.SubscriptionOption subscriptionOption = (PurchasableItem.SubscriptionOption) purchasableItem;
                purchaseSubscriptionOption(activity, subscriptionOption.getProductIdentifier(), subscriptionOption.getOptionIdentifier(), commonPurchaseParams.getGoogleOldProductId(), commonPurchaseParams.getGoogleReplacementMode(), commonPurchaseParams.getGoogleIsPersonalizedPrice(), commonPurchaseParams.getPresentedOfferingContext(), onResult, commonPurchaseParams.getAddOnStoreProducts(), commonPurchaseParams.getAddOnSubscriptionOptions(), commonPurchaseParams.getAddOnPackages());
                return;
            }
            return;
        }
        String packageIdentifier = ((PurchasableItem.Package) purchasableItem).getPackageIdentifier();
        Map presentedOfferingContext = commonPurchaseParams.getPresentedOfferingContext();
        if (presentedOfferingContext == null) {
            presentedOfferingContext = S.h();
        }
        purchasePackage(activity, packageIdentifier, presentedOfferingContext, commonPurchaseParams.getGoogleOldProductId(), commonPurchaseParams.getGoogleReplacementMode(), commonPurchaseParams.getGoogleIsPersonalizedPrice(), onResult, commonPurchaseParams.getAddOnStoreProducts(), commonPurchaseParams.getAddOnSubscriptionOptions(), commonPurchaseParams.getAddOnPackages());
    }

    public static final void purchasePackage(Activity activity, String str, Map map, String str2, Integer num, Boolean bool, OnResult onResult) {
        t.g(str, "packageIdentifier");
        t.g(map, "presentedOfferingContext");
        t.g(onResult, "onResult");
        purchasePackage$default(activity, str, map, str2, num, bool, onResult, null, null, null, 896, null);
    }

    public static /* synthetic */ void purchasePackage$default(Activity activity, String str, Map map, String str2, Integer num, Boolean bool, OnResult onResult, List list, List list2, List list3, int i, Object obj) {
        purchasePackage(activity, str, map, str2, num, bool, onResult, (i & 128) != 0 ? null : list, (i & 256) != 0 ? null : list2, (i & 512) != 0 ? null : list3);
    }

    public static final void purchaseProduct(Activity activity, String str, String str2, String str3, String str4, Integer num, Boolean bool, Map map, OnResult onResult) {
        t.g(str, "productIdentifier");
        t.g(str2, "type");
        t.g(onResult, "onResult");
        purchaseProduct$default(activity, str, str2, str3, str4, num, bool, map, onResult, null, null, null, 3584, null);
    }

    public static /* synthetic */ void purchaseProduct$default(Activity activity, String str, String str2, String str3, String str4, Integer num, Boolean bool, Map map, OnResult onResult, List list, List list2, List list3, int i, Object obj) {
        purchaseProduct(activity, str, str2, str3, str4, num, bool, map, onResult, (i & 512) != 0 ? null : list, (i & 1024) != 0 ? null : list2, (i & 2048) != 0 ? null : list3);
    }

    public static final void purchaseSubscriptionOption(Activity activity, String str, String str2, String str3, Integer num, Boolean bool, Map map, OnResult onResult) {
        t.g(str, "productIdentifier");
        t.g(str2, "optionIdentifier");
        t.g(onResult, "onResult");
        purchaseSubscriptionOption$default(activity, str, str2, str3, num, bool, map, onResult, null, null, null, 1792, null);
    }

    public static /* synthetic */ void purchaseSubscriptionOption$default(Activity activity, String str, String str2, String str3, Integer num, Boolean bool, Map map, OnResult onResult, List list, List list2, List list3, int i, Object obj) {
        purchaseSubscriptionOption(activity, str, str2, str3, num, bool, map, onResult, (i & 256) != 0 ? null : list, (i & 512) != 0 ? null : list2, (i & 1024) != 0 ? null : list3);
    }

    public static final void redeemWebPurchase(String str, OnResult onResult) {
        t.g(str, "urlString");
        t.g(onResult, "onResult");
        WebPurchaseRedemption webPurchaseRedemption = toWebPurchaseRedemption(str);
        if (webPurchaseRedemption == null) {
            onResult.onError(new ErrorContainer(PurchasesErrorCode.UnsupportedError.getCode(), "Invalid URL for web purchase redemption", S.h()));
        } else {
            Purchases.Companion.getSharedInstance().redeemWebPurchase(webPurchaseRedemption, new c(onResult));
        }
    }

    private static final void redeemWebPurchase$lambda$17(OnResult onResult, RedeemWebPurchaseListener.Result result) {
        t.g(result, "result");
        if (result instanceof RedeemWebPurchaseListener.Result.Success) {
            CustomerInfoMapperKt.mapAsync(((RedeemWebPurchaseListener.Result.Success) result).getCustomerInfo(), new CommonKt$redeemWebPurchase$1$1(onResult, result));
            return;
        }
        if (result instanceof RedeemWebPurchaseListener.Result.Error) {
            onResult.onReceived(S.o(new q[]{x.a("result", toResultName(result)), x.a("error", PurchasesErrorKt.map$default(((RedeemWebPurchaseListener.Result.Error) result).getError(), null, 1, null))}));
        } else {
            if (result instanceof RedeemWebPurchaseListener.Result.Expired) {
                onResult.onReceived(S.o(new q[]{x.a("result", toResultName(result)), x.a("obfuscatedEmail", ((RedeemWebPurchaseListener.Result.Expired) result).getObfuscatedEmail())}));
                return;
            }
            if (t.c(result, RedeemWebPurchaseListener.Result.PurchaseBelongsToOtherUser.INSTANCE) ? true : t.c(result, RedeemWebPurchaseListener.Result.InvalidToken.INSTANCE)) {
                onResult.onReceived(S.o(new q[]{x.a("result", toResultName(result))}));
            }
        }
    }

    public static final void restorePurchases(OnResult onResult) {
        t.g(onResult, "onResult");
        ListenerConversionsCommonKt.restorePurchasesWith(Purchases.Companion.getSharedInstance(), new 1(onResult), new 2(onResult));
    }

    @e
    public static final void setAllowSharingAppStoreAccount(boolean z) {
        Purchases.Companion.getSharedInstance().setAllowSharingPlayStoreAccount(z);
    }

    public static final void setAppstackAttributionParams(Map map, OnResult onResult) {
        t.g(map, "data");
        t.g(onResult, "onResult");
        Map linkedHashMap = new LinkedHashMap(Q.e(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue().toString());
        }
        Purchases.Companion.getSharedInstance().setAppstackAttributionParams(linkedHashMap, new 1(onResult));
    }

    public static final void setDebugEventListener(l lVar) {
        t.g(lVar, "callback");
        Purchases.Companion.getSharedInstance().setDebugEventListener(new a(lVar));
    }

    private static final void setDebugEventListener$lambda$16(l lVar, DebugEvent debugEvent) {
        t.g(debugEvent, "event");
        lVar.invoke(DebugEventMapperKt.toMap(debugEvent));
    }

    @e
    public static final void setDebugLogsEnabled(boolean z) {
        Purchases.Companion.setDebugLogsEnabled(z);
    }

    public static final void setLogHandler(l lVar) {
        t.g(lVar, "callback");
        Purchases.Companion.setLogHandler(new LogHandlerWithMapping(lVar));
    }

    public static final void setLogHandlerWithOnResult(OnResult onResult) {
        t.g(onResult, "onResult");
        setLogHandler(new 1(onResult));
    }

    public static final void setLogLevel(String str) {
        t.g(str, "level");
        try {
            Purchases.Companion.setLogLevel(LogLevel.valueOf(str));
        } catch (IllegalArgumentException unused) {
            warnLog("Unrecognized log level: " + str);
        }
    }

    public static final void setProxyURLString(String str) {
        Purchases.Companion.setProxyURL(str != null ? new URL(str) : null);
    }

    public static final void setPurchasesAreCompletedBy(String str) {
        t.g(str, "purchasesAreCompletedBy");
        PurchasesAreCompletedBy purchasesAreCompletedBy = toPurchasesAreCompletedBy(str);
        if (purchasesAreCompletedBy != null) {
            Purchases.Companion.getSharedInstance().setPurchasesAreCompletedBy(purchasesAreCompletedBy);
        }
    }

    public static final void setTrackedEventListener(l lVar) {
        t.g(lVar, "callback");
        Purchases.Companion.getSharedInstance().setTrackedEventListener(new b(lVar));
    }

    private static final void setTrackedEventListener$lambda$15(l lVar, FeatureEvent featureEvent) {
        t.g(featureEvent, "event");
        lVar.invoke(FeatureEventMapperKt.toMap(featureEvent));
    }

    public static final void showInAppMessagesIfNeeded(Activity activity) {
        showInAppMessagesIfNeeded$default(activity, null, 2, null);
    }

    public static /* synthetic */ void showInAppMessagesIfNeeded$default(Activity activity, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            list = null;
        }
        showInAppMessagesIfNeeded(activity, list);
    }

    private static final StoreProduct storeProductForProductId(String str, ProductType productType, String str2, List list) {
        Object obj;
        Object next;
        boolean z;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                break;
            }
            next = it.next();
            StoreProduct storeProduct = (StoreProduct) next;
            z = false;
            boolean z2 = t.c(storeProduct.getId(), str) && storeProduct.getType() == productType;
            if (t.c(storeProduct.getPurchasingData().getProductId(), str)) {
                GoogleStoreProduct googleProduct = GoogleStoreProductKt.getGoogleProduct(storeProduct);
                if (t.c(googleProduct != null ? googleProduct.getBasePlanId() : null, str2) && storeProduct.getType() == productType) {
                    z = true;
                }
            }
            if (z2) {
                break;
            }
        } while (!z);
        obj = next;
        return (StoreProduct) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final SubscriptionOption subscriptionOptionForIdentifiers(String str, String str2, List list) {
        SubscriptionOption subscriptionOption;
        Iterator it = list.iterator();
        do {
            subscriptionOption = null;
            if (!it.hasNext()) {
                break;
            }
            StoreProduct storeProduct = (StoreProduct) it.next();
            SubscriptionOptions subscriptionOptions = storeProduct.getSubscriptionOptions();
            if (subscriptionOptions != null) {
                Iterator it2 = subscriptionOptions.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    SubscriptionOption subscriptionOption2 = (SubscriptionOption) next;
                    if (t.c(storeProduct.getPurchasingData().getProductId(), str) && t.c(subscriptionOption2.getId(), str2)) {
                        subscriptionOption = next;
                        break;
                    }
                }
                subscriptionOption = subscriptionOption;
            }
        } while (subscriptionOption == null);
        return subscriptionOption;
    }

    public static final void syncAttributesAndOfferingsIfNeeded(OnResult onResult) {
        t.g(onResult, "onResult");
        ListenerConversionsKt.syncAttributesAndOfferingsIfNeededWith(Purchases.Companion.getSharedInstance(), new 1(onResult), new 2(onResult));
    }

    public static final void syncPurchases() {
        Purchases.syncPurchases$default(Purchases.Companion.getSharedInstance(), null, 1, null);
    }

    public static final PresentedOfferingContext toPresentedOfferingContext(Map map) {
        t.g(map, "<this>");
        Object obj = map.get("offeringIdentifier");
        PresentedOfferingContext.TargetingContext targetingContext = null;
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            return null;
        }
        Object obj2 = map.get("placementIdentifier");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = map.get("targetingContext");
        Map map2 = obj3 instanceof Map ? (Map) obj3 : null;
        if (map2 != null) {
            Integer convertToInt = convertToInt(map2.get("revision"));
            Object obj4 = map2.get("ruleId");
            String str3 = obj4 instanceof String ? (String) obj4 : null;
            if (convertToInt != null && str3 != null) {
                targetingContext = new PresentedOfferingContext.TargetingContext(convertToInt.intValue(), str3);
            }
        }
        return new PresentedOfferingContext(str, str2, targetingContext);
    }

    private static final PurchasesAreCompletedBy toPurchasesAreCompletedBy(String str) {
        try {
            return PurchasesAreCompletedBy.valueOf(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    private static final String toResultName(RedeemWebPurchaseListener.Result result) {
        if (result instanceof RedeemWebPurchaseListener.Result.Success) {
            return "SUCCESS";
        }
        if (result instanceof RedeemWebPurchaseListener.Result.Error) {
            return "ERROR";
        }
        if (t.c(result, RedeemWebPurchaseListener.Result.PurchaseBelongsToOtherUser.INSTANCE)) {
            return "PURCHASE_BELONGS_TO_OTHER_USER";
        }
        if (t.c(result, RedeemWebPurchaseListener.Result.InvalidToken.INSTANCE)) {
            return "INVALID_TOKEN";
        }
        if (result instanceof RedeemWebPurchaseListener.Result.Expired) {
            return "EXPIRED";
        }
        throw new o();
    }

    private static final WebPurchaseRedemption toWebPurchaseRedemption(String str) {
        try {
            return Purchases.Companion.parseAsWebPurchaseRedemption(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (Throwable th) {
            errorLog("Error parsing WebPurchaseRedemption from URL: " + str + ". Error: " + th);
            return null;
        }
    }

    public static final void trackAdDisplayed(Map map) {
        t.g(map, "adData");
        Object obj = map.get("networkName");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("mediatorName");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = map.get("adFormat");
        String str3 = obj3 instanceof String ? (String) obj3 : null;
        Object obj4 = map.get("adUnitId");
        String str4 = obj4 instanceof String ? (String) obj4 : null;
        Object obj5 = map.get("impressionId");
        String str5 = obj5 instanceof String ? (String) obj5 : null;
        if (str2 == null || str3 == null || str4 == null || str5 == null) {
            errorLog("trackAdDisplayed: Missing required parameters - mediatorName, adFormat, adUnitId, or impressionId");
        } else {
            Object obj6 = map.get("placement");
            Purchases.Companion.getSharedInstance().getAdTracker().trackAdDisplayed(new AdDisplayedData(str, AdMediatorName.Companion.fromString-CJOXPJU(str2), AdFormat.Companion.fromString-XxFlno4(str3), obj6 instanceof String ? (String) obj6 : null, str4, str5, null));
        }
    }

    public static final void trackAdFailedToLoad(Map map) {
        t.g(map, "adData");
        Object obj = map.get("mediatorName");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("adFormat");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = map.get("adUnitId");
        String str3 = obj3 instanceof String ? (String) obj3 : null;
        if (str == null || str2 == null || str3 == null) {
            errorLog("trackAdFailedToLoad: Missing required parameters - mediatorName, adFormat, or adUnitId");
            return;
        }
        Object obj4 = map.get("placement");
        String str4 = obj4 instanceof String ? (String) obj4 : null;
        Object obj5 = map.get("mediatorErrorCode");
        Number number = obj5 instanceof Number ? (Number) obj5 : null;
        Purchases.Companion.getSharedInstance().getAdTracker().trackAdFailedToLoad(new AdFailedToLoadData(AdMediatorName.Companion.fromString-CJOXPJU(str), AdFormat.Companion.fromString-XxFlno4(str2), str4, str3, number != null ? Integer.valueOf(number.intValue()) : null, null));
    }

    public static final void trackAdLoaded(Map map) {
        t.g(map, "adData");
        Object obj = map.get("networkName");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("mediatorName");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = map.get("adFormat");
        String str3 = obj3 instanceof String ? (String) obj3 : null;
        Object obj4 = map.get("adUnitId");
        String str4 = obj4 instanceof String ? (String) obj4 : null;
        Object obj5 = map.get("impressionId");
        String str5 = obj5 instanceof String ? (String) obj5 : null;
        if (str2 == null || str3 == null || str4 == null || str5 == null) {
            errorLog("trackAdLoaded: Missing required parameters - mediatorName, adFormat, adUnitId, or impressionId");
        } else {
            Object obj6 = map.get("placement");
            Purchases.Companion.getSharedInstance().getAdTracker().trackAdLoaded(new AdLoadedData(str, AdMediatorName.Companion.fromString-CJOXPJU(str2), AdFormat.Companion.fromString-XxFlno4(str3), obj6 instanceof String ? (String) obj6 : null, str4, str5, null));
        }
    }

    public static final void trackAdOpened(Map map) {
        t.g(map, "adData");
        Object obj = map.get("networkName");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("mediatorName");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = map.get("adFormat");
        String str3 = obj3 instanceof String ? (String) obj3 : null;
        Object obj4 = map.get("adUnitId");
        String str4 = obj4 instanceof String ? (String) obj4 : null;
        Object obj5 = map.get("impressionId");
        String str5 = obj5 instanceof String ? (String) obj5 : null;
        if (str2 == null || str3 == null || str4 == null || str5 == null) {
            errorLog("trackAdOpened: Missing required parameters - mediatorName, adFormat, adUnitId, or impressionId");
        } else {
            Object obj6 = map.get("placement");
            Purchases.Companion.getSharedInstance().getAdTracker().trackAdOpened(new AdOpenedData(str, AdMediatorName.Companion.fromString-CJOXPJU(str2), AdFormat.Companion.fromString-XxFlno4(str3), obj6 instanceof String ? (String) obj6 : null, str4, str5, null));
        }
    }

    public static final void trackAdRevenue(Map map) {
        t.g(map, "adData");
        Object obj = map.get("networkName");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("mediatorName");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = map.get("adFormat");
        String str3 = obj3 instanceof String ? (String) obj3 : null;
        Object obj4 = map.get("adUnitId");
        String str4 = obj4 instanceof String ? (String) obj4 : null;
        Object obj5 = map.get("impressionId");
        String str5 = obj5 instanceof String ? (String) obj5 : null;
        Object obj6 = map.get("revenueMicros");
        Number number = obj6 instanceof Number ? (Number) obj6 : null;
        Long valueOf = number != null ? Long.valueOf(number.longValue()) : null;
        Object obj7 = map.get("currency");
        String str6 = obj7 instanceof String ? (String) obj7 : null;
        Object obj8 = map.get("precision");
        String str7 = obj8 instanceof String ? (String) obj8 : null;
        if (str2 == null || str3 == null || str4 == null || str5 == null || valueOf == null || str6 == null || str7 == null) {
            errorLog("trackAdRevenue: Missing required parameters - mediatorName, adFormat, adUnitId, impressionId, revenueMicros, currency, or precision");
        } else {
            Object obj9 = map.get("placement");
            Purchases.Companion.getSharedInstance().getAdTracker().trackAdRevenue(new AdRevenueData(str, AdMediatorName.Companion.fromString-CJOXPJU(str2), AdFormat.Companion.fromString-XxFlno4(str3), obj9 instanceof String ? (String) obj9 : null, str4, str5, valueOf.longValue(), str6, AdRevenuePrecision.Companion.fromString-QAIqrgA(str7), null));
        }
    }

    public static final void trackCustomPaywallImpression(Map map) {
        t.g(map, "data");
        Object obj = map.get("paywallId");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("offeringId");
        Purchases.Companion.getSharedInstance().trackCustomPaywallImpression(new CustomPaywallImpressionParams(str, obj2 instanceof String ? (String) obj2 : null));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.lang.Object validatePurchaseParams(java.util.Map r14) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.hybridcommon.CommonKt.validatePurchaseParams(java.util.Map):java.lang.Object");
    }

    public static final void warnLog(String str) {
        t.g(str, "message");
        if (Purchases.Companion.getLogLevel().compareTo(LogLevel.WARN) <= 0) {
            Log.w("PurchasesHybridCommon", str);
        }
    }

    public static final void configure(Context context, String str, String str2, String str3, PlatformInfo platformInfo) {
        t.g(context, "context");
        t.g(str, "apiKey");
        t.g(platformInfo, "platformInfo");
        configure$default(context, str, str2, str3, platformInfo, null, null, null, null, null, null, null, null, 8160, null);
    }

    public static final void purchasePackage(Activity activity, String str, Map map, String str2, Integer num, Boolean bool, OnResult onResult, List list) {
        t.g(str, "packageIdentifier");
        t.g(map, "presentedOfferingContext");
        t.g(onResult, "onResult");
        purchasePackage$default(activity, str, map, str2, num, bool, onResult, list, null, null, 768, null);
    }

    public static final void purchaseProduct(Activity activity, String str, String str2, String str3, String str4, Integer num, Boolean bool, Map map, OnResult onResult, List list) {
        t.g(str, "productIdentifier");
        t.g(str2, "type");
        t.g(onResult, "onResult");
        purchaseProduct$default(activity, str, str2, str3, str4, num, bool, map, onResult, list, null, null, 3072, null);
    }

    public static final void purchaseSubscriptionOption(Activity activity, String str, String str2, String str3, Integer num, Boolean bool, Map map, OnResult onResult, List list) {
        t.g(str, "productIdentifier");
        t.g(str2, "optionIdentifier");
        t.g(onResult, "onResult");
        purchaseSubscriptionOption$default(activity, str, str2, str3, num, bool, map, onResult, list, null, null, 1536, null);
    }

    public static final void showInAppMessagesIfNeeded(Activity activity, List list) {
        if (activity == null) {
            errorLog("showInAppMessages called with null activity");
        } else if (list == null) {
            Purchases.showInAppMessagesIfNeeded$default(Purchases.Companion.getSharedInstance(), activity, null, 2, null);
        } else {
            Purchases.Companion.getSharedInstance().showInAppMessagesIfNeeded(activity, list);
        }
    }

    public static final void syncPurchases(OnResult onResult) {
        t.g(onResult, "onResult");
        ListenerConversionsKt.syncPurchasesWith(Purchases.Companion.getSharedInstance(), new 1(onResult), new 2(onResult));
    }

    public static final void configure(Context context, String str, String str2, String str3, PlatformInfo platformInfo, Store store) {
        t.g(context, "context");
        t.g(str, "apiKey");
        t.g(platformInfo, "platformInfo");
        t.g(store, "store");
        configure$default(context, str, str2, str3, platformInfo, store, null, null, null, null, null, null, null, 8128, null);
    }

    public static final void purchasePackage(Activity activity, String str, Map map, String str2, Integer num, Boolean bool, OnResult onResult, List list, List list2) {
        t.g(str, "packageIdentifier");
        t.g(map, "presentedOfferingContext");
        t.g(onResult, "onResult");
        purchasePackage$default(activity, str, map, str2, num, bool, onResult, list, list2, null, 512, null);
    }

    public static final void purchaseProduct(Activity activity, String str, String str2, String str3, String str4, Integer num, Boolean bool, Map map, OnResult onResult, List list, List list2) {
        t.g(str, "productIdentifier");
        t.g(str2, "type");
        t.g(onResult, "onResult");
        purchaseProduct$default(activity, str, str2, str3, str4, num, bool, map, onResult, list, list2, null, 2048, null);
    }

    public static final void purchaseSubscriptionOption(Activity activity, String str, String str2, String str3, Integer num, Boolean bool, Map map, OnResult onResult, List list, List list2) {
        t.g(str, "productIdentifier");
        t.g(str2, "optionIdentifier");
        t.g(onResult, "onResult");
        purchaseSubscriptionOption$default(activity, str, str2, str3, num, bool, map, onResult, list, list2, null, 1024, null);
    }

    public static final void configure(Context context, String str, String str2, String str3, PlatformInfo platformInfo, Store store, DangerousSettings dangerousSettings) {
        t.g(context, "context");
        t.g(str, "apiKey");
        t.g(platformInfo, "platformInfo");
        t.g(store, "store");
        t.g(dangerousSettings, "dangerousSettings");
        configure$default(context, str, str2, str3, platformInfo, store, dangerousSettings, null, null, null, null, null, null, 8064, null);
    }

    public static final void purchasePackage(Activity activity, String str, Map map, String str2, Integer num, Boolean bool, OnResult onResult, List list, List list2, List list3) {
        t.g(str, "packageIdentifier");
        t.g(map, "presentedOfferingContext");
        t.g(onResult, "onResult");
        try {
            GoogleReplacementMode googleReplacementMode = getGoogleReplacementMode(num);
            if (activity != null) {
                ListenerConversionsCommonKt.getOfferingsWith(Purchases.Companion.getSharedInstance(), new 1(onResult), new 2(map, onResult, activity, str2, googleReplacementMode, bool, list, list2, list3, str));
            } else {
                onResult.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, "There is no current Activity"), null, 1, null));
            }
        } catch (InvalidReplacementModeException unused) {
            onResult.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.UnknownError, "Invalid google replacement mode passed to purchasePackage."), null, 1, null));
        }
    }

    public static final void purchaseProduct(Activity activity, String str, String str2, String str3, String str4, Integer num, Boolean bool, Map map, OnResult onResult, List list, List list2, List list3) {
        t.g(str, "productIdentifier");
        t.g(str2, "type");
        t.g(onResult, "onResult");
        try {
            GoogleReplacementMode googleReplacementMode = getGoogleReplacementMode(num);
            ProductType mapStringToProductType = mapStringToProductType(str2);
            if (activity != null) {
                CommonKt$purchaseProduct$onReceiveStoreProducts$1 commonKt$purchaseProduct$onReceiveStoreProducts$1 = new CommonKt$purchaseProduct$onReceiveStoreProducts$1(str, mapStringToProductType, str3, activity, map, str4, googleReplacementMode, bool, list, list2, list3, onResult);
                ProductType productType = ProductType.SUBS;
                if (mapStringToProductType == productType) {
                    String str5 = (String) D.f0(E.M0(str, new String[]{":"}, false, 0, 6, (Object) null));
                    ListenerConversionsCommonKt.getProductsWith(Purchases.Companion.getSharedInstance(), D.v0(Da.u.e(str5), addOnProductIdsToFetch(list, list2)), productType, new 1(onResult), commonKt$purchaseProduct$onReceiveStoreProducts$1);
                    return;
                }
                ListenerConversionsCommonKt.getProductsWith(Purchases.Companion.getSharedInstance(), Da.u.e(str), ProductType.INAPP, new 2(onResult), commonKt$purchaseProduct$onReceiveStoreProducts$1);
                return;
            }
            onResult.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, "There is no current Activity"), null, 1, null));
        } catch (InvalidReplacementModeException unused) {
            onResult.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.UnknownError, "Invalid google replacement mode passed to purchaseProduct."), null, 1, null));
        }
    }

    public static final void purchaseSubscriptionOption(Activity activity, String str, String str2, String str3, Integer num, Boolean bool, Map map, OnResult onResult, List list, List list2, List list3) {
        t.g(str, "productIdentifier");
        t.g(str2, "optionIdentifier");
        t.g(onResult, "onResult");
        Purchases.Companion companion = Purchases.Companion;
        if (companion.getSharedInstance().getStore() != Store.PLAY_STORE) {
            onResult.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.UnknownError, "purchaseSubscriptionOption() is only supported on the Play Store."), null, 1, null));
            return;
        }
        try {
            GoogleReplacementMode googleReplacementMode = getGoogleReplacementMode(num);
            if (activity != null) {
                CommonKt$purchaseSubscriptionOption$onReceiveStoreProducts$1 commonKt$purchaseSubscriptionOption$onReceiveStoreProducts$1 = new CommonKt$purchaseSubscriptionOption$onReceiveStoreProducts$1(str, str2, activity, map, str3, bool, list, list2, list3, onResult, googleReplacementMode);
                ListenerConversionsCommonKt.getProductsWith(companion.getSharedInstance(), D.v0(Da.u.e(str), addOnProductIdsToFetch(list, list2)), ProductType.SUBS, new 1(onResult), commonKt$purchaseSubscriptionOption$onReceiveStoreProducts$1);
                return;
            }
            onResult.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, "There is no current Activity"), null, 1, null));
        } catch (InvalidReplacementModeException unused) {
            onResult.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.UnknownError, "Invalid google replacement mode passed to purchaseSubscriptionOption."), null, 1, null));
        }
    }

    public static final void configure(Context context, String str, String str2, String str3, PlatformInfo platformInfo, Store store, DangerousSettings dangerousSettings, Boolean bool) {
        t.g(context, "context");
        t.g(str, "apiKey");
        t.g(platformInfo, "platformInfo");
        t.g(store, "store");
        t.g(dangerousSettings, "dangerousSettings");
        configure$default(context, str, str2, str3, platformInfo, store, dangerousSettings, bool, null, null, null, null, null, 7936, null);
    }

    public static final void configure(Context context, String str, String str2, String str3, PlatformInfo platformInfo, Store store, DangerousSettings dangerousSettings, Boolean bool, String str4) {
        t.g(context, "context");
        t.g(str, "apiKey");
        t.g(platformInfo, "platformInfo");
        t.g(store, "store");
        t.g(dangerousSettings, "dangerousSettings");
        configure$default(context, str, str2, str3, platformInfo, store, dangerousSettings, bool, str4, null, null, null, null, 7680, null);
    }

    public static final void configure(Context context, String str, String str2, String str3, PlatformInfo platformInfo, Store store, DangerousSettings dangerousSettings, Boolean bool, String str4, Boolean bool2) {
        t.g(context, "context");
        t.g(str, "apiKey");
        t.g(platformInfo, "platformInfo");
        t.g(store, "store");
        t.g(dangerousSettings, "dangerousSettings");
        configure$default(context, str, str2, str3, platformInfo, store, dangerousSettings, bool, str4, bool2, null, null, null, 7168, null);
    }

    public static final void configure(Context context, String str, String str2, String str3, PlatformInfo platformInfo, Store store, DangerousSettings dangerousSettings, Boolean bool, String str4, Boolean bool2, Boolean bool3) {
        t.g(context, "context");
        t.g(str, "apiKey");
        t.g(platformInfo, "platformInfo");
        t.g(store, "store");
        t.g(dangerousSettings, "dangerousSettings");
        configure$default(context, str, str2, str3, platformInfo, store, dangerousSettings, bool, str4, bool2, bool3, null, null, 6144, null);
    }

    public static final void configure(Context context, String str, String str2, String str3, PlatformInfo platformInfo, Store store, DangerousSettings dangerousSettings, Boolean bool, String str4, Boolean bool2, Boolean bool3, Boolean bool4) {
        t.g(context, "context");
        t.g(str, "apiKey");
        t.g(platformInfo, "platformInfo");
        t.g(store, "store");
        t.g(dangerousSettings, "dangerousSettings");
        configure$default(context, str, str2, str3, platformInfo, store, dangerousSettings, bool, str4, bool2, bool3, bool4, null, 4096, null);
    }

    public static final void configure(Context context, String str, String str2, String str3, PlatformInfo platformInfo, Store store, DangerousSettings dangerousSettings, Boolean bool, String str4, Boolean bool2, Boolean bool3, Boolean bool4, String str5) {
        PurchasesAreCompletedBy purchasesAreCompletedBy;
        t.g(context, "context");
        t.g(str, "apiKey");
        t.g(platformInfo, "platformInfo");
        t.g(store, "store");
        t.g(dangerousSettings, "dangerousSettings");
        Purchases.Companion.setPlatformInfo(platformInfo);
        PurchasesConfiguration.Builder dangerousSettings2 = new PurchasesConfiguration.Builder(context, str).appUserID(str2).store(store).dangerousSettings(dangerousSettings);
        if (str3 != null && (purchasesAreCompletedBy = toPurchasesAreCompletedBy(str3)) != null) {
            dangerousSettings2.purchasesAreCompletedBy(purchasesAreCompletedBy);
        }
        if (bool != null) {
            dangerousSettings2.showInAppMessagesAutomatically(bool.booleanValue());
        }
        if (str4 != null) {
            try {
                dangerousSettings2.entitlementVerificationMode(EntitlementVerificationMode.valueOf(str4));
            } catch (IllegalArgumentException unused) {
                warnLog("Attempted to configure with unknown verification mode: " + str4 + '.');
                I i = I.a;
            }
        }
        if (bool2 != null) {
            dangerousSettings2.pendingTransactionsForPrepaidPlansEnabled(bool2.booleanValue());
        }
        if (bool3 != null) {
            dangerousSettings2.diagnosticsEnabled(bool3.booleanValue());
        }
        if (bool4 != null) {
            dangerousSettings2.automaticDeviceIdentifierCollectionEnabled(bool4.booleanValue());
        }
        if (str5 != null) {
            dangerousSettings2.preferredUILocaleOverride(str5);
        }
        Purchases.Companion.configure(dangerousSettings2.build());
    }
}
