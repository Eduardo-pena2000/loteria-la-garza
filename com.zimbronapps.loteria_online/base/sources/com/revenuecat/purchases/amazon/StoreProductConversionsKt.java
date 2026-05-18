package com.revenuecat.purchases.amazon;

import Da.D;
import Qa.l;
import Za.B;
import Za.E;
import com.amazon.device.iap.model.Product;
import com.amazon.device.iap.model.ProductType;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import java.math.BigDecimal;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.t;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class StoreProductConversionsKt {
    private static final Pattern pattern;

    static {
        Pattern compile = Pattern.compile("(\\d+[[\\.,\\s]\\d+]*)");
        t.f(compile, "compile(\"(\\\\d+[[\\\\.,\\\\s]\\\\d+]*)\")");
        pattern = compile;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r9.equals("SemiAnnual") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return new com.revenuecat.purchases.models.Period(6, com.revenuecat.purchases.models.Period.Unit.MONTH, "P6M");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (r9.equals("SemiAnnually") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
    
        if (r9.equals("Annually") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r9.equals("Annual") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:?, code lost:
    
        return new com.revenuecat.purchases.models.Period(1, com.revenuecat.purchases.models.Period.Unit.YEAR, "P1Y");
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.revenuecat.purchases.models.Period createPeriod(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.amazon.StoreProductConversionsKt.createPeriod(java.lang.String):com.revenuecat.purchases.models.Period");
    }

    public static final Price createPrice(String str, String str2) {
        t.g(str, "<this>");
        t.g(str2, "marketplace");
        BigDecimal parsePriceUsingRegex = parsePriceUsingRegex(str);
        if (parsePriceUsingRegex == null) {
            parsePriceUsingRegex = BigDecimal.ZERO;
        }
        t.f(parsePriceUsingRegex, "priceNumeric");
        BigDecimal multiply = parsePriceUsingRegex.multiply(new BigDecimal(1000000.0d));
        t.f(multiply, "multiply(...)");
        return new Price(str, multiply.longValue(), ISO3166Alpha2ToISO42170Converter.INSTANCE.convertOrEmpty(str2));
    }

    public static final BigDecimal parsePriceUsingRegex(String str) {
        t.g(str, "<this>");
        Matcher matcher = pattern.matcher(str);
        if ((matcher.find() ? matcher : null) == null) {
            return null;
        }
        String group = matcher.group();
        t.f(group, "dirtyPrice");
        String obj = E.j1(B.H(B.H(B.H(group, " ", "", false, 4, (Object) null), " ", "", false, 4, (Object) null), " ", "", false, 4, (Object) null)).toString();
        List M0 = E.M0(obj, new String[]{".", ","}, false, 0, 6, (Object) null);
        if (M0.size() != 1) {
            if (((String) D.p0(M0)).length() == 3) {
                obj = B.H(B.H(obj, ".", "", false, 4, (Object) null), ",", "", false, 4, (Object) null);
            } else {
                obj = D.n0(D.b0(M0, 1), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null) + '.' + ((String) D.p0(M0));
            }
        }
        return new BigDecimal(E.j1(obj).toString());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final StoreProduct toStoreProduct(Product product, String str) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        t.g(product, "<this>");
        t.g(str, "marketplace");
        if (product.getPrice() != null) {
            String price = product.getPrice();
            t.f(price, "price");
            Price createPrice = createPrice(price, str);
            String sku = product.getSku();
            t.f(sku, "sku");
            ProductType productType = product.getProductType();
            t.f(productType, "productType");
            com.revenuecat.purchases.ProductType revenueCatProductType = ProductTypeConversionsKt.toRevenueCatProductType(productType);
            String title = product.getTitle();
            t.f(title, "title");
            String title2 = product.getTitle();
            t.f(title2, "title");
            String description = product.getDescription();
            t.f(description, "description");
            String subscriptionPeriod = product.getSubscriptionPeriod();
            Period createPeriod = subscriptionPeriod != null ? createPeriod(subscriptionPeriod) : null;
            String smallIconUrl = product.getSmallIconUrl();
            t.f(smallIconUrl, "smallIconUrl");
            String freeTrialPeriod = product.getFreeTrialPeriod();
            Period createPeriod2 = freeTrialPeriod != null ? createPeriod(freeTrialPeriod) : null;
            JSONObject json = product.toJSON();
            t.f(json, "this.toJSON()");
            return new AmazonStoreProduct(sku, revenueCatProductType, title, title2, description, createPeriod, createPrice, (SubscriptionOptions) null, (SubscriptionOption) null, smallIconUrl, createPeriod2, json, (PresentedOfferingContext) null);
        }
        LogIntent logIntent = LogIntent.AMAZON_ERROR;
        StoreProductConversionsKt$toStoreProduct$$inlined$log$1 storeProductConversionsKt$toStoreProduct$$inlined$log$1 = new StoreProductConversionsKt$toStoreProduct$$inlined$log$1(logIntent, product);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str2 = "[Purchases] - " + logLevel.name();
                    str3 = (String) storeProductConversionsKt$toStoreProduct$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                }
                return null;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) storeProductConversionsKt$toStoreProduct$$inlined$log$1.invoke(), null);
                return null;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) storeProductConversionsKt$toStoreProduct$$inlined$log$1.invoke());
                }
                return null;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) storeProductConversionsKt$toStoreProduct$$inlined$log$1.invoke());
                }
                return null;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str2 = "[Purchases] - " + logLevel4.name();
                    str3 = (String) storeProductConversionsKt$toStoreProduct$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                }
                return null;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) storeProductConversionsKt$toStoreProduct$$inlined$log$1.invoke(), null);
                return null;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) storeProductConversionsKt$toStoreProduct$$inlined$log$1.invoke());
                }
                return null;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str2 = "[Purchases] - " + logLevel6.name();
                    str3 = (String) storeProductConversionsKt$toStoreProduct$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                }
                return null;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str2 = "[Purchases] - " + logLevel7.name();
                    str3 = (String) storeProductConversionsKt$toStoreProduct$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                }
                return null;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) storeProductConversionsKt$toStoreProduct$$inlined$log$1.invoke());
                }
                return null;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) storeProductConversionsKt$toStoreProduct$$inlined$log$1.invoke());
                }
                return null;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) storeProductConversionsKt$toStoreProduct$$inlined$log$1.invoke(), null);
                return null;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) storeProductConversionsKt$toStoreProduct$$inlined$log$1.invoke());
                }
                return null;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) storeProductConversionsKt$toStoreProduct$$inlined$log$1.invoke(), null);
                return null;
            default:
                return null;
        }
    }
}
