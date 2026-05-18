package com.revenuecat.purchases.hybridcommon.mappers;

import Ca.I;
import Ca.o;
import Ca.q;
import Ca.t;
import Ca.x;
import Da.S;
import Da.w;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import cb.K;
import cb.O;
import cb.Q;
import cb.i;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.amazon.AmazonStoreProduct;
import com.revenuecat.purchases.models.InstallmentsInfo;
import com.revenuecat.purchases.models.OfferPaymentMode;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class StoreProductMapperKt {
    private static final int DAYS_PER_WEEK = 7;
    private static final double MICROS_CONVERSION_METRIC = 1000000.0d;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ProductType.values().length];
            try {
                iArr[ProductType.INAPP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductType.SUBS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProductType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Period.Unit.values().length];
            try {
                iArr2[Period.Unit.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Period.Unit.WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Period.Unit.MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Period.Unit.YEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Period.Unit.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @f(c = "com.revenuecat.purchases.hybridcommon.mappers.StoreProductMapperKt$mapAsync$1", f = "StoreProductMapper.kt", l = {72}, m = "invokeSuspend")
    public static final class 1 extends l implements p {
        final /* synthetic */ Qa.l $callback;
        final /* synthetic */ List $this_mapAsync;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(Qa.l lVar, List list, e eVar) {
            super(2, eVar);
            this.$callback = lVar;
            this.$this_mapAsync = list;
        }

        public final e create(Object obj, e eVar) {
            return new 1(this.$callback, this.$this_mapAsync, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return create(o, eVar).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                K mapperDispatcher = MappersHelpersKt.getMapperDispatcher();
                StoreProductMapperKt$mapAsync$1$map$1 storeProductMapperKt$mapAsync$1$map$1 = new StoreProductMapperKt$mapAsync$1$map$1(this.$this_mapAsync, null);
                this.label = 1;
                obj = i.g(mapperDispatcher, storeProductMapperKt$mapAsync$1$map$1, this);
                if (obj == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            this.$callback.invoke((List) obj);
            return I.a;
        }
    }

    public static final /* synthetic */ List access$map(List list) {
        return map(list);
    }

    public static final Integer getGoogleFreeTrialCycles(StoreProduct storeProduct) {
        PricingPhase freePhase;
        kotlin.jvm.internal.t.g(storeProduct, "<this>");
        SubscriptionOption defaultOption = storeProduct.getDefaultOption();
        if (defaultOption == null || (freePhase = defaultOption.getFreePhase()) == null) {
            return null;
        }
        return freePhase.getBillingCycleCount();
    }

    public static final Period getGoogleFreeTrialPeriod(StoreProduct storeProduct) {
        PricingPhase freePhase;
        kotlin.jvm.internal.t.g(storeProduct, "<this>");
        SubscriptionOption defaultOption = storeProduct.getDefaultOption();
        if (defaultOption == null || (freePhase = defaultOption.getFreePhase()) == null) {
            return null;
        }
        return freePhase.getBillingPeriod();
    }

    private static final PricingPhase getGoogleIntroductoryPhase(StoreProduct storeProduct) {
        SubscriptionOption defaultOption = storeProduct.getDefaultOption();
        if (defaultOption != null) {
            return defaultOption.getIntroPhase();
        }
        return null;
    }

    public static final String getGoogleIntroductoryPrice(StoreProduct storeProduct) {
        Price price;
        kotlin.jvm.internal.t.g(storeProduct, "<this>");
        PricingPhase googleIntroductoryPhase = getGoogleIntroductoryPhase(storeProduct);
        if (googleIntroductoryPhase == null || (price = googleIntroductoryPhase.getPrice()) == null) {
            return null;
        }
        return price.getFormatted();
    }

    public static final long getGoogleIntroductoryPriceAmountMicros(StoreProduct storeProduct) {
        Price price;
        kotlin.jvm.internal.t.g(storeProduct, "<this>");
        PricingPhase googleIntroductoryPhase = getGoogleIntroductoryPhase(storeProduct);
        if (googleIntroductoryPhase == null || (price = googleIntroductoryPhase.getPrice()) == null) {
            return 0L;
        }
        return price.getAmountMicros();
    }

    public static final int getGoogleIntroductoryPriceCycles(StoreProduct storeProduct) {
        Integer billingCycleCount;
        kotlin.jvm.internal.t.g(storeProduct, "<this>");
        PricingPhase googleIntroductoryPhase = getGoogleIntroductoryPhase(storeProduct);
        if (googleIntroductoryPhase == null || (billingCycleCount = googleIntroductoryPhase.getBillingCycleCount()) == null) {
            return 0;
        }
        return billingCycleCount.intValue();
    }

    public static final Period getGoogleIntroductoryPricePeriod(StoreProduct storeProduct) {
        kotlin.jvm.internal.t.g(storeProduct, "<this>");
        PricingPhase googleIntroductoryPhase = getGoogleIntroductoryPhase(storeProduct);
        if (googleIntroductoryPhase != null) {
            return googleIntroductoryPhase.getBillingPeriod();
        }
        return null;
    }

    public static final long getPriceAmountMicros(StoreProduct storeProduct) {
        kotlin.jvm.internal.t.g(storeProduct, "<this>");
        return storeProduct.getPrice().getAmountMicros();
    }

    public static final String getPriceCurrencyCode(StoreProduct storeProduct) {
        kotlin.jvm.internal.t.g(storeProduct, "<this>");
        return storeProduct.getPrice().getCurrencyCode();
    }

    public static final String getPriceString(StoreProduct storeProduct) {
        kotlin.jvm.internal.t.g(storeProduct, "<this>");
        return storeProduct.getPrice().getFormatted();
    }

    public static final Map map(StoreProduct storeProduct) {
        ArrayList arrayList;
        kotlin.jvm.internal.t.g(storeProduct, "<this>");
        q a = x.a("identifier", storeProduct.getId());
        q a2 = x.a("description", storeProduct.getDescription());
        q a3 = x.a("title", storeProduct.getTitle());
        q a4 = x.a("price", Double.valueOf(getPriceAmountMicros(storeProduct) / 1000000.0d));
        q a5 = x.a("priceString", getPriceString(storeProduct));
        q a6 = x.a("currencyCode", getPriceCurrencyCode(storeProduct));
        q a7 = x.a("introPrice", mapIntroPrice(storeProduct));
        q a8 = x.a("discounts", (Object) null);
        q a9 = x.a("pricePerWeek", StoreProduct.pricePerWeek$default(storeProduct, null, 1, null) != null ? Double.valueOf(r13.getAmountMicros() / 1000000.0d) : null);
        q a10 = x.a("pricePerMonth", StoreProduct.pricePerMonth$default(storeProduct, null, 1, null) != null ? Double.valueOf(r14.getAmountMicros() / 1000000.0d) : null);
        q a11 = x.a("pricePerYear", StoreProduct.pricePerYear$default(storeProduct, null, 1, null) != null ? Double.valueOf(r15.getAmountMicros() / 1000000.0d) : null);
        Price pricePerWeek$default = StoreProduct.pricePerWeek$default(storeProduct, null, 1, null);
        q a12 = x.a("pricePerWeekString", pricePerWeek$default != null ? pricePerWeek$default.getFormatted() : null);
        Price pricePerMonth$default = StoreProduct.pricePerMonth$default(storeProduct, null, 1, null);
        q a13 = x.a("pricePerMonthString", pricePerMonth$default != null ? pricePerMonth$default.getFormatted() : null);
        Price pricePerYear$default = StoreProduct.pricePerYear$default(storeProduct, null, 1, null);
        q a14 = x.a("pricePerYearString", pricePerYear$default != null ? pricePerYear$default.getFormatted() : null);
        q a15 = x.a("productCategory", mapProductCategory(storeProduct).getValue());
        q a16 = x.a("productType", mapProductType(storeProduct));
        Period period = storeProduct.getPeriod();
        q a17 = x.a("subscriptionPeriod", period != null ? period.getIso8601() : null);
        SubscriptionOption defaultOption = storeProduct.getDefaultOption();
        q a18 = x.a("defaultOption", defaultOption != null ? mapSubscriptionOption(defaultOption, storeProduct) : null);
        SubscriptionOptions subscriptionOptions = storeProduct.getSubscriptionOptions();
        if (subscriptionOptions != null) {
            arrayList = new ArrayList(w.y(subscriptionOptions, 10));
            Iterator it = subscriptionOptions.iterator();
            while (it.hasNext()) {
                arrayList.add(mapSubscriptionOption((SubscriptionOption) it.next(), storeProduct));
            }
        } else {
            arrayList = null;
        }
        q a19 = x.a("subscriptionOptions", arrayList);
        PresentedOfferingContext presentedOfferingContext = storeProduct.getPresentedOfferingContext();
        q a20 = x.a("presentedOfferingIdentifier", presentedOfferingContext != null ? presentedOfferingContext.getOfferingIdentifier() : null);
        PresentedOfferingContext presentedOfferingContext2 = storeProduct.getPresentedOfferingContext();
        return S.l(new q[]{a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, x.a("presentedOfferingContext", presentedOfferingContext2 != null ? OfferingsMapperKt.map(presentedOfferingContext2) : null)});
    }

    public static final void mapAsync(List list, Qa.l lVar) {
        kotlin.jvm.internal.t.g(list, "<this>");
        kotlin.jvm.internal.t.g(lVar, "callback");
        i.d(MappersHelpersKt.getMainScope(), (Ga.i) null, (Q) null, new 1(lVar, list, null), 3, (Object) null);
    }

    public static final Map mapIntroPrice(StoreProduct storeProduct) {
        Period googleIntroductoryPricePeriod;
        Map mapPeriodForStoreProduct;
        Map mapPeriodForStoreProduct2;
        Map mapPeriodForStoreProduct3;
        kotlin.jvm.internal.t.g(storeProduct, "<this>");
        if (storeProduct instanceof AmazonStoreProduct) {
            AmazonStoreProduct amazonStoreProduct = (AmazonStoreProduct) storeProduct;
            Period freeTrialPeriod = amazonStoreProduct.getFreeTrialPeriod();
            if (freeTrialPeriod == null || (mapPeriodForStoreProduct3 = mapPeriodForStoreProduct(freeTrialPeriod)) == null) {
                return null;
            }
            q a = x.a("price", 0);
            q a2 = x.a("priceString", MappersHelpersKt.formatUsingDeviceLocale(getPriceCurrencyCode(storeProduct), 0L));
            Period freeTrialPeriod2 = amazonStoreProduct.getFreeTrialPeriod();
            return S.r(S.l(new q[]{a, a2, x.a("period", freeTrialPeriod2 != null ? freeTrialPeriod2.getIso8601() : null), x.a("cycles", 1)}), mapPeriodForStoreProduct3);
        }
        if (getGoogleFreeTrialPeriod(storeProduct) == null) {
            if (getGoogleIntroductoryPrice(storeProduct) == null || (googleIntroductoryPricePeriod = getGoogleIntroductoryPricePeriod(storeProduct)) == null || (mapPeriodForStoreProduct = mapPeriodForStoreProduct(googleIntroductoryPricePeriod)) == null) {
                return null;
            }
            q a3 = x.a("price", Double.valueOf(getGoogleIntroductoryPriceAmountMicros(storeProduct) / 1000000.0d));
            q a4 = x.a("priceString", getGoogleIntroductoryPrice(storeProduct));
            Period googleIntroductoryPricePeriod2 = getGoogleIntroductoryPricePeriod(storeProduct);
            return S.r(S.l(new q[]{a3, a4, x.a("period", googleIntroductoryPricePeriod2 != null ? googleIntroductoryPricePeriod2.getIso8601() : null), x.a("cycles", Integer.valueOf(getGoogleIntroductoryPriceCycles(storeProduct)))}), mapPeriodForStoreProduct);
        }
        Period googleFreeTrialPeriod = getGoogleFreeTrialPeriod(storeProduct);
        if (googleFreeTrialPeriod == null || (mapPeriodForStoreProduct2 = mapPeriodForStoreProduct(googleFreeTrialPeriod)) == null) {
            return null;
        }
        q a5 = x.a("price", 0);
        q a6 = x.a("priceString", MappersHelpersKt.formatUsingDeviceLocale(getPriceCurrencyCode(storeProduct), 0L));
        Period googleFreeTrialPeriod2 = getGoogleFreeTrialPeriod(storeProduct);
        q a7 = x.a("period", googleFreeTrialPeriod2 != null ? googleFreeTrialPeriod2.getIso8601() : null);
        Integer googleFreeTrialCycles = getGoogleFreeTrialCycles(storeProduct);
        return S.r(S.l(new q[]{a5, a6, a7, x.a("cycles", Integer.valueOf(googleFreeTrialCycles != null ? googleFreeTrialCycles.intValue() : 1))}), mapPeriodForStoreProduct2);
    }

    private static final Map mapPeriod(Period period) {
        Map l;
        int i = WhenMappings.$EnumSwitchMapping$1[period.getUnit().ordinal()];
        if (i == 1) {
            l = S.l(new q[]{x.a("unit", "DAY"), x.a("value", Integer.valueOf(period.getValue()))});
        } else if (i == 2) {
            l = S.l(new q[]{x.a("unit", "DAY"), x.a("value", Integer.valueOf(period.getValue() * 7))});
        } else if (i == 3) {
            l = S.l(new q[]{x.a("unit", "MONTH"), x.a("value", Integer.valueOf(period.getValue()))});
        } else if (i == 4) {
            l = S.l(new q[]{x.a("unit", "YEAR"), x.a("value", Integer.valueOf(period.getValue()))});
        } else {
            if (i != 5) {
                throw new o();
            }
            l = S.l(new q[]{x.a("unit", "DAY"), x.a("value", 0)});
        }
        return S.r(l, Da.Q.f(x.a("iso8601", period.getIso8601())));
    }

    private static final Map mapPeriodForStoreProduct(Period period) {
        int i = WhenMappings.$EnumSwitchMapping$1[period.getUnit().ordinal()];
        if (i == 1) {
            return S.l(new q[]{x.a("periodUnit", "DAY"), x.a("periodNumberOfUnits", Integer.valueOf(period.getValue()))});
        }
        if (i == 2) {
            return S.l(new q[]{x.a("periodUnit", "DAY"), x.a("periodNumberOfUnits", Integer.valueOf(period.getValue() * 7))});
        }
        if (i == 3) {
            return S.l(new q[]{x.a("periodUnit", "MONTH"), x.a("periodNumberOfUnits", Integer.valueOf(period.getValue()))});
        }
        if (i == 4) {
            return S.l(new q[]{x.a("periodUnit", "YEAR"), x.a("periodNumberOfUnits", Integer.valueOf(period.getValue()))});
        }
        if (i == 5) {
            return S.l(new q[]{x.a("periodUnit", "DAY"), x.a("periodNumberOfUnits", 0)});
        }
        throw new o();
    }

    private static final Map mapPrice(Price price) {
        return S.l(new q[]{x.a("formatted", price.getFormatted()), x.a("amountMicros", Long.valueOf(price.getAmountMicros())), x.a("currencyCode", price.getCurrencyCode())});
    }

    private static final Map mapPricingPhase(PricingPhase pricingPhase) {
        Period billingPeriod = pricingPhase.getBillingPeriod();
        q a = x.a("billingPeriod", billingPeriod != null ? mapPeriod(billingPeriod) : null);
        q a2 = x.a("recurrenceMode", pricingPhase.getRecurrenceMode().getIdentifier());
        q a3 = x.a("billingCycleCount", pricingPhase.getBillingCycleCount());
        q a4 = x.a("price", mapPrice(pricingPhase.getPrice()));
        OfferPaymentMode offerPaymentMode = pricingPhase.getOfferPaymentMode();
        return S.l(new q[]{a, a2, a3, a4, x.a("offerPaymentMode", offerPaymentMode != null ? offerPaymentMode.toString() : null)});
    }

    public static final MappedProductCategory mapProductCategory(StoreProduct storeProduct) {
        kotlin.jvm.internal.t.g(storeProduct, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[storeProduct.getType().ordinal()];
        if (i == 1) {
            return MappedProductCategory.NON_SUBSCRIPTION;
        }
        if (i == 2) {
            return MappedProductCategory.SUBSCRIPTION;
        }
        if (i == 3) {
            return MappedProductCategory.UNKNOWN;
        }
        throw new o();
    }

    public static final String mapProductType(StoreProduct storeProduct) {
        kotlin.jvm.internal.t.g(storeProduct, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[storeProduct.getType().ordinal()];
        if (i == 1) {
            return "CONSUMABLE";
        }
        if (i == 2) {
            SubscriptionOption defaultOption = storeProduct.getDefaultOption();
            return (defaultOption == null || !defaultOption.isPrepaid()) ? "AUTO_RENEWABLE_SUBSCRIPTION" : "PREPAID_SUBSCRIPTION";
        }
        if (i == 3) {
            return "UNKNOWN";
        }
        throw new o();
    }

    private static final Map mapSubscriptionOption(SubscriptionOption subscriptionOption, StoreProduct storeProduct) {
        q a = x.a("id", subscriptionOption.getId());
        q a2 = x.a("storeProductId", storeProduct.getId());
        q a3 = x.a("productId", storeProduct.getPurchasingData().getProductId());
        List pricingPhases = subscriptionOption.getPricingPhases();
        ArrayList arrayList = new ArrayList(w.y(pricingPhases, 10));
        Iterator it = pricingPhases.iterator();
        while (it.hasNext()) {
            arrayList.add(mapPricingPhase((PricingPhase) it.next()));
        }
        q a4 = x.a("pricingPhases", arrayList);
        q a5 = x.a("tags", subscriptionOption.getTags());
        q a6 = x.a("isBasePlan", Boolean.valueOf(subscriptionOption.isBasePlan()));
        Period billingPeriod = subscriptionOption.getBillingPeriod();
        q a7 = x.a("billingPeriod", billingPeriod != null ? mapPeriod(billingPeriod) : null);
        q a8 = x.a("isPrepaid", Boolean.valueOf(subscriptionOption.isPrepaid()));
        PricingPhase fullPricePhase = subscriptionOption.getFullPricePhase();
        q a9 = x.a("fullPricePhase", fullPricePhase != null ? mapPricingPhase(fullPricePhase) : null);
        PricingPhase freePhase = subscriptionOption.getFreePhase();
        q a10 = x.a("freePhase", freePhase != null ? mapPricingPhase(freePhase) : null);
        PricingPhase introPhase = subscriptionOption.getIntroPhase();
        q a11 = x.a("introPhase", introPhase != null ? mapPricingPhase(introPhase) : null);
        PresentedOfferingContext presentedOfferingContext = subscriptionOption.getPresentedOfferingContext();
        q a12 = x.a("presentedOfferingIdentifier", presentedOfferingContext != null ? presentedOfferingContext.getOfferingIdentifier() : null);
        PresentedOfferingContext presentedOfferingContext2 = subscriptionOption.getPresentedOfferingContext();
        q a13 = x.a("presentedOfferingContext", presentedOfferingContext2 != null ? OfferingsMapperKt.map(presentedOfferingContext2) : null);
        InstallmentsInfo installmentsInfo = subscriptionOption.getInstallmentsInfo();
        return S.l(new q[]{a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, x.a("installmentsInfo", installmentsInfo != null ? map(installmentsInfo) : null)});
    }

    private static final Map map(InstallmentsInfo installmentsInfo) {
        return S.l(new q[]{x.a("commitmentPaymentsCount", Integer.valueOf(installmentsInfo.getCommitmentPaymentsCount())), x.a("renewalCommitmentPaymentsCount", Integer.valueOf(installmentsInfo.getRenewalCommitmentPaymentsCount()))});
    }

    private static final List map(List list) {
        ArrayList arrayList = new ArrayList(w.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(map((StoreProduct) it.next()));
        }
        return arrayList;
    }
}
