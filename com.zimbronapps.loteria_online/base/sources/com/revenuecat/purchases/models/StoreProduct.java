package com.revenuecat.purchases.models;

import Ca.e;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.utils.PriceExtensionsKt;
import java.util.Locale;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public interface StoreProduct {

    public static final class DefaultImpls {
        @Deprecated
        public static String formattedPricePerMonth(StoreProduct storeProduct, Locale locale) {
            t.g(locale, "locale");
            return StoreProduct.access$formattedPricePerMonth$jd(storeProduct, locale);
        }

        public static /* synthetic */ String formattedPricePerMonth$default(StoreProduct storeProduct, Locale locale, int i, Object obj) {
            return StoreProduct.formattedPricePerMonth$default(storeProduct, locale, i, obj);
        }

        @e
        public static /* synthetic */ void getPresentedOfferingIdentifier$annotations() {
        }

        @e
        public static /* synthetic */ void getSku$annotations() {
        }

        @Deprecated
        public static Price pricePerDay(StoreProduct storeProduct, Locale locale) {
            t.g(locale, "locale");
            return StoreProduct.access$pricePerDay$jd(storeProduct, locale);
        }

        public static /* synthetic */ Price pricePerDay$default(StoreProduct storeProduct, Locale locale, int i, Object obj) {
            return StoreProduct.pricePerDay$default(storeProduct, locale, i, obj);
        }

        @Deprecated
        public static Price pricePerMonth(StoreProduct storeProduct, Locale locale) {
            t.g(locale, "locale");
            return StoreProduct.access$pricePerMonth$jd(storeProduct, locale);
        }

        public static /* synthetic */ Price pricePerMonth$default(StoreProduct storeProduct, Locale locale, int i, Object obj) {
            return StoreProduct.pricePerMonth$default(storeProduct, locale, i, obj);
        }

        @Deprecated
        public static Price pricePerWeek(StoreProduct storeProduct, Locale locale) {
            t.g(locale, "locale");
            return StoreProduct.access$pricePerWeek$jd(storeProduct, locale);
        }

        public static /* synthetic */ Price pricePerWeek$default(StoreProduct storeProduct, Locale locale, int i, Object obj) {
            return StoreProduct.pricePerWeek$default(storeProduct, locale, i, obj);
        }

        @Deprecated
        public static Price pricePerYear(StoreProduct storeProduct, Locale locale) {
            t.g(locale, "locale");
            return StoreProduct.access$pricePerYear$jd(storeProduct, locale);
        }

        public static /* synthetic */ Price pricePerYear$default(StoreProduct storeProduct, Locale locale, int i, Object obj) {
            return StoreProduct.pricePerYear$default(storeProduct, locale, i, obj);
        }
    }

    static /* synthetic */ String access$formattedPricePerMonth$jd(StoreProduct storeProduct, Locale locale) {
        return super.formattedPricePerMonth(locale);
    }

    static /* synthetic */ Price access$pricePerDay$jd(StoreProduct storeProduct, Locale locale) {
        return super.pricePerDay(locale);
    }

    static /* synthetic */ Price access$pricePerMonth$jd(StoreProduct storeProduct, Locale locale) {
        return super.pricePerMonth(locale);
    }

    static /* synthetic */ Price access$pricePerWeek$jd(StoreProduct storeProduct, Locale locale) {
        return super.pricePerWeek(locale);
    }

    static /* synthetic */ Price access$pricePerYear$jd(StoreProduct storeProduct, Locale locale) {
        return super.pricePerYear(locale);
    }

    static /* synthetic */ String formattedPricePerMonth$default(StoreProduct storeProduct, Locale locale, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formattedPricePerMonth");
        }
        if ((i & 1) != 0) {
            locale = Locale.getDefault();
            t.f(locale, "getDefault()");
        }
        return storeProduct.formattedPricePerMonth(locale);
    }

    static /* synthetic */ Price pricePerDay$default(StoreProduct storeProduct, Locale locale, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pricePerDay");
        }
        if ((i & 1) != 0) {
            locale = Locale.getDefault();
            t.f(locale, "getDefault()");
        }
        return storeProduct.pricePerDay(locale);
    }

    static /* synthetic */ Price pricePerMonth$default(StoreProduct storeProduct, Locale locale, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pricePerMonth");
        }
        if ((i & 1) != 0) {
            locale = Locale.getDefault();
            t.f(locale, "getDefault()");
        }
        return storeProduct.pricePerMonth(locale);
    }

    static /* synthetic */ Price pricePerWeek$default(StoreProduct storeProduct, Locale locale, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pricePerWeek");
        }
        if ((i & 1) != 0) {
            locale = Locale.getDefault();
            t.f(locale, "getDefault()");
        }
        return storeProduct.pricePerWeek(locale);
    }

    static /* synthetic */ Price pricePerYear$default(StoreProduct storeProduct, Locale locale, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pricePerYear");
        }
        if ((i & 1) != 0) {
            locale = Locale.getDefault();
            t.f(locale, "getDefault()");
        }
        return storeProduct.pricePerYear(locale);
    }

    @e
    StoreProduct copyWithOfferingId(String str);

    StoreProduct copyWithPresentedOfferingContext(PresentedOfferingContext presentedOfferingContext);

    default String formattedPricePerMonth(Locale locale) {
        t.g(locale, "locale");
        Price pricePerMonth = pricePerMonth(locale);
        if (pricePerMonth != null) {
            return pricePerMonth.getFormatted();
        }
        return null;
    }

    SubscriptionOption getDefaultOption();

    String getDescription();

    String getId();

    String getName();

    Period getPeriod();

    PresentedOfferingContext getPresentedOfferingContext();

    String getPresentedOfferingIdentifier();

    Price getPrice();

    PurchasingData getPurchasingData();

    String getSku();

    SubscriptionOptions getSubscriptionOptions();

    String getTitle();

    ProductType getType();

    default Price pricePerDay(Locale locale) {
        t.g(locale, "locale");
        Period period = getPeriod();
        if (period != null) {
            return PriceExtensionsKt.pricePerDay(getPrice(), period, locale);
        }
        return null;
    }

    default Price pricePerMonth(Locale locale) {
        t.g(locale, "locale");
        Period period = getPeriod();
        if (period != null) {
            return PriceExtensionsKt.pricePerMonth(getPrice(), period, locale);
        }
        return null;
    }

    default Price pricePerWeek(Locale locale) {
        t.g(locale, "locale");
        Period period = getPeriod();
        if (period != null) {
            return PriceExtensionsKt.pricePerWeek(getPrice(), period, locale);
        }
        return null;
    }

    default Price pricePerYear(Locale locale) {
        t.g(locale, "locale");
        Period period = getPeriod();
        if (period != null) {
            return PriceExtensionsKt.pricePerYear(getPrice(), period, locale);
        }
        return null;
    }
}
