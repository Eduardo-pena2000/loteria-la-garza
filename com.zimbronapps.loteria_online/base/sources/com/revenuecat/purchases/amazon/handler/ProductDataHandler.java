package com.revenuecat.purchases.amazon.handler;

import Ca.I;
import Da.D;
import Da.S;
import Qa.l;
import android.os.Handler;
import com.amazon.device.iap.model.Product;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.RequestId;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.amazon.PurchasingServiceProvider;
import com.revenuecat.purchases.amazon.StoreProductConversionsKt;
import com.revenuecat.purchases.amazon.listener.ProductDataResponseListener;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.models.StoreProduct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ProductDataHandler implements ProductDataResponseListener {
    public static final Companion Companion = new Companion(null);
    private static final long GET_PRODUCT_DATA_TIMEOUT_MILLIS = 10000;
    private final Handler mainHandler;
    private final Map productDataCache;
    private final Map productDataRequests;
    private final PurchasingServiceProvider purchasingServiceProvider;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Request {
        private final String marketplace;
        private final l onError;
        private final l onReceive;
        private final List skuList;

        public Request(List list, String str, l lVar, l lVar2) {
            t.g(list, "skuList");
            t.g(str, "marketplace");
            t.g(lVar, "onReceive");
            t.g(lVar2, "onError");
            this.skuList = list;
            this.marketplace = str;
            this.onReceive = lVar;
            this.onError = lVar2;
        }

        public static /* synthetic */ Request copy$default(Request request, List list, String str, l lVar, l lVar2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = request.skuList;
            }
            if ((i & 2) != 0) {
                str = request.marketplace;
            }
            if ((i & 4) != 0) {
                lVar = request.onReceive;
            }
            if ((i & 8) != 0) {
                lVar2 = request.onError;
            }
            return request.copy(list, str, lVar, lVar2);
        }

        public final List component1() {
            return this.skuList;
        }

        public final String component2() {
            return this.marketplace;
        }

        public final l component3() {
            return this.onReceive;
        }

        public final l component4() {
            return this.onError;
        }

        public final Request copy(List list, String str, l lVar, l lVar2) {
            t.g(list, "skuList");
            t.g(str, "marketplace");
            t.g(lVar, "onReceive");
            t.g(lVar2, "onError");
            return new Request(list, str, lVar, lVar2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Request)) {
                return false;
            }
            Request request = (Request) obj;
            return t.c(this.skuList, request.skuList) && t.c(this.marketplace, request.marketplace) && t.c(this.onReceive, request.onReceive) && t.c(this.onError, request.onError);
        }

        public final String getMarketplace() {
            return this.marketplace;
        }

        public final l getOnError() {
            return this.onError;
        }

        public final l getOnReceive() {
            return this.onReceive;
        }

        public final List getSkuList() {
            return this.skuList;
        }

        public int hashCode() {
            return (((((this.skuList.hashCode() * 31) + this.marketplace.hashCode()) * 31) + this.onReceive.hashCode()) * 31) + this.onError.hashCode();
        }

        public String toString() {
            return "Request(skuList=" + this.skuList + ", marketplace=" + this.marketplace + ", onReceive=" + this.onReceive + ", onError=" + this.onError + ')';
        }
    }

    public ProductDataHandler(PurchasingServiceProvider purchasingServiceProvider, Handler handler) {
        t.g(purchasingServiceProvider, "purchasingServiceProvider");
        t.g(handler, "mainHandler");
        this.purchasingServiceProvider = purchasingServiceProvider;
        this.mainHandler = handler;
        this.productDataRequests = new LinkedHashMap();
        this.productDataCache = new LinkedHashMap();
    }

    public static /* synthetic */ void a(ProductDataHandler productDataHandler, RequestId requestId) {
        addTimeoutToProductDataRequest$lambda$12(productDataHandler, requestId);
    }

    private final void addTimeoutToProductDataRequest(RequestId requestId) {
        this.mainHandler.postDelayed(new a(this, requestId), 10000L);
    }

    private static final void addTimeoutToProductDataRequest$lambda$12(ProductDataHandler productDataHandler, RequestId requestId) {
        Request request = productDataHandler.getRequest(requestId);
        if (request == null) {
            return;
        }
        PurchasesErrorCode purchasesErrorCode = PurchasesErrorCode.UnknownError;
        String format = String.format("Timeout error trying to get Amazon product data for SKUs: %s. Please check that the SKUs are correct.", Arrays.copyOf(new Object[]{request.getSkuList().toString()}, 1));
        t.f(format, "format(...)");
        request.getOnError().invoke(new PurchasesError(purchasesErrorCode, format));
    }

    private final synchronized Request getRequest(RequestId requestId) {
        return (Request) this.productDataRequests.remove(requestId);
    }

    private final void handleSuccessfulProductDataResponse(Map map, String str, l lVar) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        LogIntent logIntent = LogIntent.DEBUG;
        ProductDataHandler$handleSuccessfulProductDataResponse$$inlined$log$1 productDataHandler$handleSuccessfulProductDataResponse$$inlined$log$1 = new ProductDataHandler$handleSuccessfulProductDataResponse$$inlined$log$1(logIntent, map);
        int[] iArr = LogWrapperKt.WhenMappings.$EnumSwitchMapping$0;
        switch (iArr[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str2 = "[Purchases] - " + logLevel.name();
                    str3 = (String) productDataHandler$handleSuccessfulProductDataResponse$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) productDataHandler$handleSuccessfulProductDataResponse$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) productDataHandler$handleSuccessfulProductDataResponse$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) productDataHandler$handleSuccessfulProductDataResponse$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str2 = "[Purchases] - " + logLevel4.name();
                    str3 = (String) productDataHandler$handleSuccessfulProductDataResponse$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) productDataHandler$handleSuccessfulProductDataResponse$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) productDataHandler$handleSuccessfulProductDataResponse$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str2 = "[Purchases] - " + logLevel6.name();
                    str3 = (String) productDataHandler$handleSuccessfulProductDataResponse$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str2 = "[Purchases] - " + logLevel7.name();
                    str3 = (String) productDataHandler$handleSuccessfulProductDataResponse$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) productDataHandler$handleSuccessfulProductDataResponse$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) productDataHandler$handleSuccessfulProductDataResponse$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) productDataHandler$handleSuccessfulProductDataResponse$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) productDataHandler$handleSuccessfulProductDataResponse$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) productDataHandler$handleSuccessfulProductDataResponse$$inlined$log$1.invoke(), null);
                break;
        }
        if (map.isEmpty()) {
            ProductDataHandler$handleSuccessfulProductDataResponse$$inlined$log$2 productDataHandler$handleSuccessfulProductDataResponse$$inlined$log$2 = new ProductDataHandler$handleSuccessfulProductDataResponse$$inlined$log$2(logIntent);
            switch (iArr[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel11 = LogLevel.DEBUG;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                        currentLogHandler8.d("[Purchases] - " + logLevel11.name(), (String) productDataHandler$handleSuccessfulProductDataResponse$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) productDataHandler$handleSuccessfulProductDataResponse$$inlined$log$2.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel12 = LogLevel.WARN;
                    LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                        currentLogHandler9.w("[Purchases] - " + logLevel12.name(), (String) productDataHandler$handleSuccessfulProductDataResponse$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel13 = LogLevel.INFO;
                    LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                        currentLogHandler10.i("[Purchases] - " + logLevel13.name(), (String) productDataHandler$handleSuccessfulProductDataResponse$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel14 = LogLevel.DEBUG;
                    LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                        currentLogHandler11.d("[Purchases] - " + logLevel14.name(), (String) productDataHandler$handleSuccessfulProductDataResponse$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) productDataHandler$handleSuccessfulProductDataResponse$$inlined$log$2.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel15 = LogLevel.INFO;
                    LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                        currentLogHandler12.i("[Purchases] - " + logLevel15.name(), (String) productDataHandler$handleSuccessfulProductDataResponse$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel16 = LogLevel.DEBUG;
                    LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                        currentLogHandler13.d("[Purchases] - " + logLevel16.name(), (String) productDataHandler$handleSuccessfulProductDataResponse$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel17 = LogLevel.DEBUG;
                    LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                        currentLogHandler14.d("[Purchases] - " + logLevel17.name(), (String) productDataHandler$handleSuccessfulProductDataResponse$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel18 = LogLevel.WARN;
                    LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                        currentLogHandler15.w("[Purchases] - " + logLevel18.name(), (String) productDataHandler$handleSuccessfulProductDataResponse$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel19 = LogLevel.WARN;
                    LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                        currentLogHandler16.w("[Purchases] - " + logLevel19.name(), (String) productDataHandler$handleSuccessfulProductDataResponse$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) productDataHandler$handleSuccessfulProductDataResponse$$inlined$log$2.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel20 = LogLevel.WARN;
                    LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                        currentLogHandler17.w("[Purchases] - " + logLevel20.name(), (String) productDataHandler$handleSuccessfulProductDataResponse$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) productDataHandler$handleSuccessfulProductDataResponse$$inlined$log$2.invoke(), null);
                    break;
            }
        }
        Iterable values = map.values();
        ArrayList arrayList = new ArrayList();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            StoreProduct storeProduct = StoreProductConversionsKt.toStoreProduct((Product) it.next(), str);
            if (storeProduct != null) {
                arrayList.add(storeProduct);
            }
        }
        lVar.invoke(arrayList);
    }

    private final void handleUnsuccessfulProductDataResponse(ProductDataResponse productDataResponse, l lVar) {
        lVar.invoke(new PurchasesError(PurchasesErrorCode.StoreProblemError, productDataResponse.getRequestStatus() == ProductDataResponse.RequestStatus.NOT_SUPPORTED ? "Couldn't fetch product data, since it's not supported." : "Error when fetching product data."));
    }

    public void getProductData(Set set, String str, l lVar, l lVar2) {
        Map z;
        LogHandler currentLogHandler;
        String str2;
        String str3;
        t.g(set, "skus");
        t.g(str, "marketplace");
        t.g(lVar, "onReceive");
        t.g(lVar2, "onError");
        LogIntent logIntent = LogIntent.DEBUG;
        ProductDataHandler$getProductData$$inlined$log$1 productDataHandler$getProductData$$inlined$log$1 = new ProductDataHandler$getProductData$$inlined$log$1(logIntent, set);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str2 = "[Purchases] - " + logLevel.name();
                    str3 = (String) productDataHandler$getProductData$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) productDataHandler$getProductData$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) productDataHandler$getProductData$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) productDataHandler$getProductData$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str2 = "[Purchases] - " + logLevel4.name();
                    str3 = (String) productDataHandler$getProductData$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) productDataHandler$getProductData$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) productDataHandler$getProductData$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str2 = "[Purchases] - " + logLevel6.name();
                    str3 = (String) productDataHandler$getProductData$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str2 = "[Purchases] - " + logLevel7.name();
                    str3 = (String) productDataHandler$getProductData$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) productDataHandler$getProductData$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) productDataHandler$getProductData$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) productDataHandler$getProductData$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) productDataHandler$getProductData$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) productDataHandler$getProductData$$inlined$log$1.invoke(), null);
                break;
        }
        synchronized (this) {
            z = S.z(this.productDataCache);
        }
        if (!z.keySet().containsAll((Collection) set)) {
            RequestId productData = this.purchasingServiceProvider.getProductData(set);
            Request request = new Request(D.L0((Iterable) set), str, lVar, lVar2);
            synchronized (this) {
                this.productDataRequests.put(productData, request);
                addTimeoutToProductDataRequest(productData);
                I i = I.a;
            }
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : z.entrySet()) {
            if (set.contains((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        handleSuccessfulProductDataResponse(linkedHashMap, str, lVar);
    }

    public final synchronized Map getProductDataCache$purchases_defaultsBc8Release() {
        return this.productDataCache;
    }

    public void onProductDataResponse(ProductDataResponse productDataResponse) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        t.g(productDataResponse, "response");
        try {
            LogIntent logIntent = LogIntent.DEBUG;
            ProductDataHandler$onProductDataResponse$$inlined$log$1 productDataHandler$onProductDataResponse$$inlined$log$1 = new ProductDataHandler$onProductDataResponse$$inlined$log$1(logIntent, productDataResponse);
            int[] iArr = LogWrapperKt.WhenMappings.$EnumSwitchMapping$0;
            switch (iArr[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str = "[Purchases] - " + logLevel.name();
                        str2 = (String) productDataHandler$onProductDataResponse$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) productDataHandler$onProductDataResponse$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) productDataHandler$onProductDataResponse$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) productDataHandler$onProductDataResponse$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (String) productDataHandler$onProductDataResponse$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) productDataHandler$onProductDataResponse$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) productDataHandler$onProductDataResponse$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) productDataHandler$onProductDataResponse$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) productDataHandler$onProductDataResponse$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) productDataHandler$onProductDataResponse$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) productDataHandler$onProductDataResponse$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) productDataHandler$onProductDataResponse$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) productDataHandler$onProductDataResponse$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) productDataHandler$onProductDataResponse$$inlined$log$1.invoke(), null);
                    break;
            }
            Collection unavailableSkus = productDataResponse.getUnavailableSkus();
            t.f(unavailableSkus, "response.unavailableSkus");
            if (!unavailableSkus.isEmpty()) {
                ProductDataHandler$onProductDataResponse$$inlined$log$2 productDataHandler$onProductDataResponse$$inlined$log$2 = new ProductDataHandler$onProductDataResponse$$inlined$log$2(logIntent, productDataResponse);
                switch (iArr[logIntent.ordinal()]) {
                    case 1:
                        LogLevel logLevel11 = LogLevel.DEBUG;
                        LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                            currentLogHandler8.d("[Purchases] - " + logLevel11.name(), (String) productDataHandler$onProductDataResponse$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) productDataHandler$onProductDataResponse$$inlined$log$2.invoke(), null);
                        break;
                    case 3:
                        LogLevel logLevel12 = LogLevel.WARN;
                        LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                            currentLogHandler9.w("[Purchases] - " + logLevel12.name(), (String) productDataHandler$onProductDataResponse$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 4:
                        LogLevel logLevel13 = LogLevel.INFO;
                        LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                            currentLogHandler10.i("[Purchases] - " + logLevel13.name(), (String) productDataHandler$onProductDataResponse$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 5:
                        LogLevel logLevel14 = LogLevel.DEBUG;
                        LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                            currentLogHandler11.d("[Purchases] - " + logLevel14.name(), (String) productDataHandler$onProductDataResponse$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) productDataHandler$onProductDataResponse$$inlined$log$2.invoke(), null);
                        break;
                    case 7:
                        LogLevel logLevel15 = LogLevel.INFO;
                        LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                            currentLogHandler12.i("[Purchases] - " + logLevel15.name(), (String) productDataHandler$onProductDataResponse$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 8:
                        LogLevel logLevel16 = LogLevel.DEBUG;
                        LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                            currentLogHandler13.d("[Purchases] - " + logLevel16.name(), (String) productDataHandler$onProductDataResponse$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 9:
                        LogLevel logLevel17 = LogLevel.DEBUG;
                        LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                            currentLogHandler14.d("[Purchases] - " + logLevel17.name(), (String) productDataHandler$onProductDataResponse$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 10:
                        LogLevel logLevel18 = LogLevel.WARN;
                        LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                            currentLogHandler15.w("[Purchases] - " + logLevel18.name(), (String) productDataHandler$onProductDataResponse$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 11:
                        LogLevel logLevel19 = LogLevel.WARN;
                        LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                            currentLogHandler16.w("[Purchases] - " + logLevel19.name(), (String) productDataHandler$onProductDataResponse$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 12:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) productDataHandler$onProductDataResponse$$inlined$log$2.invoke(), null);
                        break;
                    case 13:
                        LogLevel logLevel20 = LogLevel.WARN;
                        LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                            currentLogHandler17.w("[Purchases] - " + logLevel20.name(), (String) productDataHandler$onProductDataResponse$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) productDataHandler$onProductDataResponse$$inlined$log$2.invoke(), null);
                        break;
                }
            }
            RequestId requestId = productDataResponse.getRequestId();
            t.f(requestId, "requestId");
            Request request = getRequest(requestId);
            if (request == null) {
                return;
            }
            if (productDataResponse.getRequestStatus() != ProductDataResponse.RequestStatus.SUCCESSFUL) {
                handleUnsuccessfulProductDataResponse(productDataResponse, request.getOnError());
                return;
            }
            synchronized (this) {
                Map map = this.productDataCache;
                Map productData = productDataResponse.getProductData();
                t.f(productData, "response.productData");
                map.putAll(productData);
                I i = I.a;
            }
            Map productData2 = productDataResponse.getProductData();
            t.f(productData2, "response.productData");
            handleSuccessfulProductDataResponse(productData2, request.getMarketplace(), request.getOnReceive());
        } catch (Exception e) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Exception in onProductDataResponse", e);
            throw e;
        }
    }
}
