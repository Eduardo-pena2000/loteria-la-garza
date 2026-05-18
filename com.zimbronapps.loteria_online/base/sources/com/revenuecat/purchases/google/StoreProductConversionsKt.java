package com.revenuecat.purchases.google;

import Ca.I;
import Da.S;
import Da.v;
import Da.w;
import com.android.billingclient.api.ProductDetails;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.models.GoogleStoreProduct;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class StoreProductConversionsKt {
    private static final Price createOneTimeProductPrice(ProductDetails productDetails) {
        ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
        if (ProductTypeConversionsKt.toRevenueCatProductType(productDetails.getProductType()) != ProductType.INAPP || (oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails()) == null) {
            return null;
        }
        String formattedPrice = oneTimePurchaseOfferDetails.getFormattedPrice();
        t.f(formattedPrice, "it.formattedPrice");
        long priceAmountMicros = oneTimePurchaseOfferDetails.getPriceAmountMicros();
        String priceCurrencyCode = oneTimePurchaseOfferDetails.getPriceCurrencyCode();
        t.f(priceCurrencyCode, "it.priceCurrencyCode");
        return new Price(formattedPrice, priceAmountMicros, priceCurrencyCode);
    }

    public static final StoreProduct toInAppStoreProduct(ProductDetails productDetails) {
        t.g(productDetails, "<this>");
        return toStoreProduct(productDetails, v.n());
    }

    public static final GoogleStoreProduct toStoreProduct(ProductDetails productDetails, List list) {
        SubscriptionOptions subscriptionOptions;
        Price price;
        PricingPhase fullPricePhase;
        t.g(productDetails, "<this>");
        t.g(list, "offerDetails");
        if (ProductTypeConversionsKt.toRevenueCatProductType(productDetails.getProductType()) == ProductType.SUBS) {
            ArrayList arrayList = new ArrayList(w.y(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails = (ProductDetails.SubscriptionOfferDetails) it.next();
                String productId = productDetails.getProductId();
                t.f(productId, "productId");
                arrayList.add(SubscriptionOptionConversionsKt.toSubscriptionOption(subscriptionOfferDetails, productId, productDetails));
            }
            subscriptionOptions = new SubscriptionOptions(arrayList);
        } else {
            subscriptionOptions = null;
        }
        SubscriptionOption basePlan = subscriptionOptions != null ? subscriptionOptions.getBasePlan() : null;
        Price price2 = (basePlan == null || (fullPricePhase = basePlan.getFullPricePhase()) == null) ? null : fullPricePhase.getPrice();
        Price createOneTimeProductPrice = createOneTimeProductPrice(productDetails);
        if (createOneTimeProductPrice != null) {
            price = createOneTimeProductPrice;
        } else {
            if (price2 == null) {
                return null;
            }
            price = price2;
        }
        String productId2 = productDetails.getProductId();
        t.f(productId2, "productId");
        String id = basePlan != null ? basePlan.getId() : null;
        ProductType revenueCatProductType = ProductTypeConversionsKt.toRevenueCatProductType(productDetails.getProductType());
        String name = productDetails.getName();
        t.f(name, "name");
        String title = productDetails.getTitle();
        t.f(title, "title");
        String description = productDetails.getDescription();
        t.f(description, "description");
        return new GoogleStoreProduct(productId2, id, revenueCatProductType, price, name, title, description, basePlan != null ? basePlan.getBillingPeriod() : null, subscriptionOptions, subscriptionOptions != null ? subscriptionOptions.getDefaultOffer() : null, productDetails, (PresentedOfferingContext) null);
    }

    public static final List toStoreProducts(List list) {
        ArrayList n;
        LinkedHashMap h;
        LogHandler currentLogHandler;
        String str;
        String str2;
        t.g(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ProductDetails productDetails = (ProductDetails) it.next();
            List subscriptionOfferDetails = productDetails.getSubscriptionOfferDetails();
            if (subscriptionOfferDetails != null) {
                t.f(subscriptionOfferDetails, "subscriptionOfferDetails");
                n = new ArrayList();
                for (Object obj : subscriptionOfferDetails) {
                    ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails2 = (ProductDetails.SubscriptionOfferDetails) obj;
                    t.f(subscriptionOfferDetails2, "it");
                    if (SubscriptionOptionConversionsKt.isBasePlan(subscriptionOfferDetails2)) {
                        n.add(obj);
                    }
                }
            } else {
                n = v.n();
            }
            List subscriptionOfferDetails3 = productDetails.getSubscriptionOfferDetails();
            if (subscriptionOfferDetails3 != null) {
                t.f(subscriptionOfferDetails3, "subscriptionOfferDetails");
                h = new LinkedHashMap();
                for (Object obj2 : subscriptionOfferDetails3) {
                    String basePlanId = ((ProductDetails.SubscriptionOfferDetails) obj2).getBasePlanId();
                    Object obj3 = h.get(basePlanId);
                    if (obj3 == null) {
                        obj3 = new ArrayList();
                        h.put(basePlanId, obj3);
                    }
                    ((List) obj3).add(obj2);
                }
            } else {
                h = S.h();
            }
            if (n.isEmpty()) {
                n = null;
            }
            if (n != null) {
                Iterator it2 = n.iterator();
                while (it2.hasNext()) {
                    List list2 = (List) h.get(((ProductDetails.SubscriptionOfferDetails) it2.next()).getBasePlanId());
                    if (list2 == null) {
                        list2 = v.n();
                    }
                    GoogleStoreProduct storeProduct = toStoreProduct(productDetails, list2);
                    if (storeProduct != null) {
                        arrayList.add(storeProduct);
                    } else {
                        LogIntent logIntent = LogIntent.RC_ERROR;
                        StoreProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1 storeProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1 = new StoreProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1(logIntent, productDetails);
                        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                            case 1:
                                LogLevel logLevel = LogLevel.DEBUG;
                                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                                    str = "[Purchases] - " + logLevel.name();
                                    str2 = (String) storeProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1.invoke();
                                    currentLogHandler.d(str, str2);
                                    break;
                                }
                                break;
                            case 2:
                                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) storeProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1.invoke(), null);
                                break;
                            case 3:
                                LogLevel logLevel2 = LogLevel.WARN;
                                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) storeProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1.invoke());
                                    break;
                                }
                                break;
                            case 4:
                                LogLevel logLevel3 = LogLevel.INFO;
                                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) storeProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1.invoke());
                                    break;
                                }
                                break;
                            case 5:
                                LogLevel logLevel4 = LogLevel.DEBUG;
                                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                                    str = "[Purchases] - " + logLevel4.name();
                                    str2 = (String) storeProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1.invoke();
                                    currentLogHandler.d(str, str2);
                                    break;
                                }
                                break;
                            case 6:
                                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) storeProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1.invoke(), null);
                                break;
                            case 7:
                                LogLevel logLevel5 = LogLevel.INFO;
                                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) storeProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1.invoke());
                                    break;
                                }
                                break;
                            case 8:
                                LogLevel logLevel6 = LogLevel.DEBUG;
                                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                                    str = "[Purchases] - " + logLevel6.name();
                                    str2 = (String) storeProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1.invoke();
                                    currentLogHandler.d(str, str2);
                                    break;
                                }
                                break;
                            case 9:
                                LogLevel logLevel7 = LogLevel.DEBUG;
                                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                                    str = "[Purchases] - " + logLevel7.name();
                                    str2 = (String) storeProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1.invoke();
                                    currentLogHandler.d(str, str2);
                                    break;
                                }
                                break;
                            case 10:
                                LogLevel logLevel8 = LogLevel.WARN;
                                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) storeProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1.invoke());
                                    break;
                                }
                                break;
                            case 11:
                                LogLevel logLevel9 = LogLevel.WARN;
                                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) storeProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1.invoke());
                                    break;
                                }
                                break;
                            case 12:
                                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) storeProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1.invoke(), null);
                                break;
                            case 13:
                                LogLevel logLevel10 = LogLevel.WARN;
                                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) storeProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1.invoke());
                                    break;
                                }
                                break;
                            case 14:
                                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) storeProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1.invoke(), null);
                                break;
                        }
                        I i = I.a;
                    }
                }
                I i2 = I.a;
            } else {
                StoreProduct inAppStoreProduct = toInAppStoreProduct(productDetails);
                if (inAppStoreProduct != null) {
                    arrayList.add(inAppStoreProduct);
                } else {
                    LogIntent logIntent2 = LogIntent.RC_ERROR;
                    StoreProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1 storeProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1 = new StoreProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1(logIntent2, productDetails);
                    switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
                        case 1:
                            LogLevel logLevel11 = LogLevel.DEBUG;
                            LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                                currentLogHandler8.d("[Purchases] - " + logLevel11.name(), (String) storeProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1.invoke());
                                break;
                            }
                            break;
                        case 2:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) storeProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1.invoke(), null);
                            break;
                        case 3:
                            LogLevel logLevel12 = LogLevel.WARN;
                            LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                                currentLogHandler9.w("[Purchases] - " + logLevel12.name(), (String) storeProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1.invoke());
                                break;
                            }
                            break;
                        case 4:
                            LogLevel logLevel13 = LogLevel.INFO;
                            LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                                currentLogHandler10.i("[Purchases] - " + logLevel13.name(), (String) storeProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1.invoke());
                                break;
                            }
                            break;
                        case 5:
                            LogLevel logLevel14 = LogLevel.DEBUG;
                            LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                                currentLogHandler11.d("[Purchases] - " + logLevel14.name(), (String) storeProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1.invoke());
                                break;
                            }
                            break;
                        case 6:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) storeProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1.invoke(), null);
                            break;
                        case 7:
                            LogLevel logLevel15 = LogLevel.INFO;
                            LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                                currentLogHandler12.i("[Purchases] - " + logLevel15.name(), (String) storeProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1.invoke());
                                break;
                            }
                            break;
                        case 8:
                            LogLevel logLevel16 = LogLevel.DEBUG;
                            LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                                currentLogHandler13.d("[Purchases] - " + logLevel16.name(), (String) storeProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1.invoke());
                                break;
                            }
                            break;
                        case 9:
                            LogLevel logLevel17 = LogLevel.DEBUG;
                            LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                                currentLogHandler14.d("[Purchases] - " + logLevel17.name(), (String) storeProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1.invoke());
                                break;
                            }
                            break;
                        case 10:
                            LogLevel logLevel18 = LogLevel.WARN;
                            LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                                currentLogHandler15.w("[Purchases] - " + logLevel18.name(), (String) storeProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1.invoke());
                                break;
                            }
                            break;
                        case 11:
                            LogLevel logLevel19 = LogLevel.WARN;
                            LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                                currentLogHandler16.w("[Purchases] - " + logLevel19.name(), (String) storeProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1.invoke());
                                break;
                            }
                            break;
                        case 12:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) storeProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1.invoke(), null);
                            break;
                        case 13:
                            LogLevel logLevel20 = LogLevel.WARN;
                            LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                                currentLogHandler17.w("[Purchases] - " + logLevel20.name(), (String) storeProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1.invoke());
                                break;
                            }
                            break;
                        case 14:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) storeProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1.invoke(), null);
                            break;
                    }
                    I i3 = I.a;
                }
            }
        }
        return arrayList;
    }
}
