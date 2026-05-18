package com.revenuecat.purchases.common.offerings;

import Ca.I;
import Da.D;
import Da.S;
import Da.Z;
import Qa.l;
import Za.E;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.HTTPResponseOriginalSource;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.OfferingParser;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.strings.OfferingStrings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import ob.j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class OfferingsFactory {
    private final AppConfig appConfig;
    private final BillingAbstract billing;
    private final Dispatcher dispatcher;
    private final OfferingParser offeringParser;

    public static final class 1 extends u implements l {
        final /* synthetic */ Set $allRequestedProductIdentifiers;
        final /* synthetic */ boolean $loadedFromDiskCache;
        final /* synthetic */ JSONObject $offeringsJSON;
        final /* synthetic */ l $onError;
        final /* synthetic */ l $onSuccess;
        final /* synthetic */ HTTPResponseOriginalSource $originalDataSource;
        final /* synthetic */ OfferingsFactory this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(Set set, OfferingsFactory offeringsFactory, JSONObject jSONObject, HTTPResponseOriginalSource hTTPResponseOriginalSource, boolean z, l lVar, l lVar2) {
            super(1);
            this.$allRequestedProductIdentifiers = set;
            this.this$0 = offeringsFactory;
            this.$offeringsJSON = jSONObject;
            this.$originalDataSource = hTTPResponseOriginalSource;
            this.$loadedFromDiskCache = z;
            this.$onError = lVar;
            this.$onSuccess = lVar2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Map) obj);
            return I.a;
        }

        public final void invoke(Map map) {
            LogHandler currentLogHandler;
            String str;
            String str2;
            t.g(map, "productsById");
            try {
                Iterable iterable = this.$allRequestedProductIdentifiers;
                ArrayList arrayList = new ArrayList();
                for (Object obj : iterable) {
                    if (!map.containsKey((String) obj)) {
                        arrayList.add(obj);
                    }
                }
                Set Q0 = D.Q0(arrayList);
                Set set = !((Collection) Q0).isEmpty() ? Q0 : null;
                if (set != null) {
                    LogIntent logIntent = LogIntent.GOOGLE_WARNING;
                    OfferingsFactory$createOfferings$1$invoke$lambda$3$$inlined$log$1 offeringsFactory$createOfferings$1$invoke$lambda$3$$inlined$log$1 = new OfferingsFactory$createOfferings$1$invoke$lambda$3$$inlined$log$1(logIntent, set);
                    switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                        case 1:
                            LogLevel logLevel = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                                str = "[Purchases] - " + logLevel.name();
                                str2 = (String) offeringsFactory$createOfferings$1$invoke$lambda$3$$inlined$log$1.invoke();
                                currentLogHandler.d(str, str2);
                                break;
                            }
                            break;
                        case 2:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsFactory$createOfferings$1$invoke$lambda$3$$inlined$log$1.invoke(), null);
                            break;
                        case 3:
                            LogLevel logLevel2 = LogLevel.WARN;
                            LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                                currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) offeringsFactory$createOfferings$1$invoke$lambda$3$$inlined$log$1.invoke());
                                break;
                            }
                            break;
                        case 4:
                            LogLevel logLevel3 = LogLevel.INFO;
                            LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                                currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) offeringsFactory$createOfferings$1$invoke$lambda$3$$inlined$log$1.invoke());
                                break;
                            }
                            break;
                        case 5:
                            LogLevel logLevel4 = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                                str = "[Purchases] - " + logLevel4.name();
                                str2 = (String) offeringsFactory$createOfferings$1$invoke$lambda$3$$inlined$log$1.invoke();
                                currentLogHandler.d(str, str2);
                                break;
                            }
                            break;
                        case 6:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsFactory$createOfferings$1$invoke$lambda$3$$inlined$log$1.invoke(), null);
                            break;
                        case 7:
                            LogLevel logLevel5 = LogLevel.INFO;
                            LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                                currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) offeringsFactory$createOfferings$1$invoke$lambda$3$$inlined$log$1.invoke());
                                break;
                            }
                            break;
                        case 8:
                            LogLevel logLevel6 = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                                str = "[Purchases] - " + logLevel6.name();
                                str2 = (String) offeringsFactory$createOfferings$1$invoke$lambda$3$$inlined$log$1.invoke();
                                currentLogHandler.d(str, str2);
                                break;
                            }
                            break;
                        case 9:
                            LogLevel logLevel7 = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                                str = "[Purchases] - " + logLevel7.name();
                                str2 = (String) offeringsFactory$createOfferings$1$invoke$lambda$3$$inlined$log$1.invoke();
                                currentLogHandler.d(str, str2);
                                break;
                            }
                            break;
                        case 10:
                            LogLevel logLevel8 = LogLevel.WARN;
                            LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                                currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) offeringsFactory$createOfferings$1$invoke$lambda$3$$inlined$log$1.invoke());
                                break;
                            }
                            break;
                        case 11:
                            LogLevel logLevel9 = LogLevel.WARN;
                            LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                                currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) offeringsFactory$createOfferings$1$invoke$lambda$3$$inlined$log$1.invoke());
                                break;
                            }
                            break;
                        case 12:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsFactory$createOfferings$1$invoke$lambda$3$$inlined$log$1.invoke(), null);
                            break;
                        case 13:
                            LogLevel logLevel10 = LogLevel.WARN;
                            LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                                currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) offeringsFactory$createOfferings$1$invoke$lambda$3$$inlined$log$1.invoke());
                                break;
                            }
                            break;
                        case 14:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsFactory$createOfferings$1$invoke$lambda$3$$inlined$log$1.invoke(), null);
                            break;
                    }
                }
                Offerings createOfferings = OfferingsFactory.access$getOfferingParser$p(this.this$0).createOfferings(this.$offeringsJSON, map, this.$originalDataSource, this.$loadedFromDiskCache);
                if (createOfferings.getAll().isEmpty()) {
                    this.$onError.invoke(new PurchasesError(PurchasesErrorCode.ConfigurationError, "There's a problem with your configuration. None of the products registered in the RevenueCat dashboard could be fetched from the Play Store.\nMore information: https://rev.cat/why-are-offerings-empty"));
                    return;
                }
                LogLevel logLevel11 = LogLevel.VERBOSE;
                LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                    String str3 = "[Purchases] - " + logLevel11.name();
                    String format = String.format("Offerings object created with %d offerings", Arrays.copyOf(new Object[]{Integer.valueOf(createOfferings.getAll().size())}, 1));
                    t.f(format, "format(...)");
                    currentLogHandler8.v(str3, format);
                }
                this.$onSuccess.invoke(new OfferingsResultData(createOfferings, this.$allRequestedProductIdentifiers, Q0));
            } catch (Exception e) {
                if (!(e instanceof JSONException ? true : e instanceof j)) {
                    throw e;
                }
                LogIntent logIntent2 = LogIntent.RC_ERROR;
                OfferingsFactory$createOfferings$1$invoke$$inlined$log$1 offeringsFactory$createOfferings$1$invoke$$inlined$log$1 = new OfferingsFactory$createOfferings$1$invoke$$inlined$log$1(logIntent2, e);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
                    case 1:
                        LogLevel logLevel12 = LogLevel.DEBUG;
                        LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                            currentLogHandler9.d("[Purchases] - " + logLevel12.name(), (String) offeringsFactory$createOfferings$1$invoke$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsFactory$createOfferings$1$invoke$$inlined$log$1.invoke(), null);
                        break;
                    case 3:
                        LogLevel logLevel13 = LogLevel.WARN;
                        LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                            currentLogHandler10.w("[Purchases] - " + logLevel13.name(), (String) offeringsFactory$createOfferings$1$invoke$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 4:
                        LogLevel logLevel14 = LogLevel.INFO;
                        LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                            currentLogHandler11.i("[Purchases] - " + logLevel14.name(), (String) offeringsFactory$createOfferings$1$invoke$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 5:
                        LogLevel logLevel15 = LogLevel.DEBUG;
                        LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                            currentLogHandler12.d("[Purchases] - " + logLevel15.name(), (String) offeringsFactory$createOfferings$1$invoke$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsFactory$createOfferings$1$invoke$$inlined$log$1.invoke(), null);
                        break;
                    case 7:
                        LogLevel logLevel16 = LogLevel.INFO;
                        LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                            currentLogHandler13.i("[Purchases] - " + logLevel16.name(), (String) offeringsFactory$createOfferings$1$invoke$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 8:
                        LogLevel logLevel17 = LogLevel.DEBUG;
                        LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                            currentLogHandler14.d("[Purchases] - " + logLevel17.name(), (String) offeringsFactory$createOfferings$1$invoke$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 9:
                        LogLevel logLevel18 = LogLevel.DEBUG;
                        LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                            currentLogHandler15.d("[Purchases] - " + logLevel18.name(), (String) offeringsFactory$createOfferings$1$invoke$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 10:
                        LogLevel logLevel19 = LogLevel.WARN;
                        LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                            currentLogHandler16.w("[Purchases] - " + logLevel19.name(), (String) offeringsFactory$createOfferings$1$invoke$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 11:
                        LogLevel logLevel20 = LogLevel.WARN;
                        LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                            currentLogHandler17.w("[Purchases] - " + logLevel20.name(), (String) offeringsFactory$createOfferings$1$invoke$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 12:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsFactory$createOfferings$1$invoke$$inlined$log$1.invoke(), null);
                        break;
                    case 13:
                        LogLevel logLevel21 = LogLevel.WARN;
                        LogHandler currentLogHandler18 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel21) <= 0) {
                            currentLogHandler18.w("[Purchases] - " + logLevel21.name(), (String) offeringsFactory$createOfferings$1$invoke$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsFactory$createOfferings$1$invoke$$inlined$log$1.invoke(), null);
                        break;
                }
                this.$onError.invoke(new PurchasesError(PurchasesErrorCode.UnexpectedBackendResponseError, e.getLocalizedMessage()));
            }
        }
    }

    public static final class 2 extends u implements l {
        final /* synthetic */ l $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(l lVar) {
            super(1);
            this.$onError = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return I.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            t.g(purchasesError, "error");
            this.$onError.invoke(purchasesError);
        }
    }

    public static final class 1 extends u implements l {
        final /* synthetic */ l $onCompleted;
        final /* synthetic */ l $onError;
        final /* synthetic */ Set $productIds;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(Set set, l lVar, l lVar2) {
            super(1);
            this.$productIds = set;
            this.$onCompleted = lVar;
            this.$onError = lVar2;
        }

        public static /* synthetic */ void a(List list, Set set, OfferingsFactory offeringsFactory, l lVar, l lVar2) {
            invoke$lambda$1(list, set, offeringsFactory, lVar, lVar2);
        }

        private static final void invoke$lambda$1(List list, Set set, OfferingsFactory offeringsFactory, l lVar, l lVar2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                String productId = ((StoreProduct) obj).getPurchasingData().getProductId();
                Object obj2 = linkedHashMap.get(productId);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(productId, obj2);
                }
                ((List) obj2).add(obj);
            }
            Map C = S.C(linkedHashMap);
            Set g = Z.g(set, C.keySet());
            if (((Collection) g).isEmpty()) {
                lVar.invoke(C);
            } else {
                OfferingsFactory.access$getBilling$p(offeringsFactory).queryProductDetailsAsync(ProductType.INAPP, g, new OfferingsFactory$getStoreProductsById$1$1$1(offeringsFactory, C, lVar), new OfferingsFactory$getStoreProductsById$1$1$2(lVar2));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List) obj);
            return I.a;
        }

        public final void invoke(List list) {
            t.g(list, "subscriptionProducts");
            Dispatcher.enqueue$default(OfferingsFactory.access$getDispatcher$p(OfferingsFactory.this), new a(list, this.$productIds, OfferingsFactory.this, this.$onCompleted, this.$onError), null, 2, null);
        }
    }

    public static final class 2 extends u implements l {
        final /* synthetic */ l $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(l lVar) {
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

    public OfferingsFactory(BillingAbstract billingAbstract, OfferingParser offeringParser, Dispatcher dispatcher, AppConfig appConfig) {
        t.g(billingAbstract, "billing");
        t.g(offeringParser, "offeringParser");
        t.g(dispatcher, "dispatcher");
        t.g(appConfig, "appConfig");
        this.billing = billingAbstract;
        this.offeringParser = offeringParser;
        this.dispatcher = dispatcher;
        this.appConfig = appConfig;
    }

    public static final /* synthetic */ BillingAbstract access$getBilling$p(OfferingsFactory offeringsFactory) {
        return offeringsFactory.billing;
    }

    public static final /* synthetic */ Dispatcher access$getDispatcher$p(OfferingsFactory offeringsFactory) {
        return offeringsFactory.dispatcher;
    }

    public static final /* synthetic */ OfferingParser access$getOfferingParser$p(OfferingsFactory offeringsFactory) {
        return offeringsFactory.offeringParser;
    }

    private final Set extractProductIdentifiers(JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONArray("offerings");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONArray jSONArray2 = jSONArray.getJSONObject(i).getJSONArray("packages");
            int length2 = jSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                String optString = jSONArray2.getJSONObject(i2).optString("platform_product_identifier");
                t.f(optString, "it");
                if (E.h0(optString)) {
                    optString = null;
                }
                if (optString != null) {
                    linkedHashSet.add(optString);
                }
            }
        }
        return linkedHashSet;
    }

    private final void getStoreProductsById(Set set, l lVar, l lVar2) {
        this.billing.queryProductDetailsAsync(ProductType.SUBS, set, new 1(set, lVar, lVar2), new 2(lVar2));
    }

    public final void createOfferings(JSONObject jSONObject, HTTPResponseOriginalSource hTTPResponseOriginalSource, boolean z, l lVar, l lVar2) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        t.g(jSONObject, "offeringsJSON");
        t.g(hTTPResponseOriginalSource, "originalDataSource");
        t.g(lVar, "onError");
        t.g(lVar2, "onSuccess");
        try {
            Set extractProductIdentifiers = extractProductIdentifiers(jSONObject);
            if (extractProductIdentifiers.isEmpty()) {
                lVar.invoke(new PurchasesError(PurchasesErrorCode.ConfigurationError, OfferingStrings.INSTANCE.getConfigurationErrorNoProductsForOfferings(this.appConfig.getApiKeyValidationResult(), this.appConfig.getStore())));
            } else {
                getStoreProductsById(extractProductIdentifiers, new 1(extractProductIdentifiers, this, jSONObject, hTTPResponseOriginalSource, z, lVar, lVar2), new 2(lVar));
            }
        } catch (JSONException e) {
            LogIntent logIntent = LogIntent.RC_ERROR;
            OfferingsFactory$createOfferings$$inlined$log$1 offeringsFactory$createOfferings$$inlined$log$1 = new OfferingsFactory$createOfferings$$inlined$log$1(logIntent, e);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str = "[Purchases] - " + logLevel.name();
                        str2 = (String) offeringsFactory$createOfferings$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsFactory$createOfferings$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) offeringsFactory$createOfferings$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) offeringsFactory$createOfferings$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (String) offeringsFactory$createOfferings$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsFactory$createOfferings$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) offeringsFactory$createOfferings$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) offeringsFactory$createOfferings$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) offeringsFactory$createOfferings$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) offeringsFactory$createOfferings$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) offeringsFactory$createOfferings$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsFactory$createOfferings$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) offeringsFactory$createOfferings$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsFactory$createOfferings$$inlined$log$1.invoke(), null);
                    break;
            }
            lVar.invoke(new PurchasesError(PurchasesErrorCode.UnexpectedBackendResponseError, e.getLocalizedMessage()));
        }
    }
}
