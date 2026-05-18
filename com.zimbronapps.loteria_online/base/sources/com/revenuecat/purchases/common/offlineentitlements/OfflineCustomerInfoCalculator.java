package com.revenuecat.purchases.common.offlineentitlements;

import Ca.I;
import Ca.q;
import Ca.x;
import Da.A;
import Da.D;
import Da.Q;
import Da.w;
import K8.a;
import Qa.l;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.CustomerInfoOriginalSource;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.CustomerInfoFactory;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.utils.Iso8601Utils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class OfflineCustomerInfoCalculator {
    private final AppConfig appConfig;
    private final DateProvider dateProvider;
    private final DiagnosticsTracker diagnosticsTracker;
    private final PurchasedProductsFetcher purchasedProductsFetcher;

    public static final class 1 extends u implements l {
        final /* synthetic */ String $appUserID;
        final /* synthetic */ l $onError;
        final /* synthetic */ l $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(l lVar, String str, l lVar2) {
            super(1);
            this.$onError = lVar;
            this.$appUserID = str;
            this.$onSuccess = lVar2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List) obj);
            return I.a;
        }

        public final void invoke(List list) {
            t.g(list, "purchasedProducts");
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((PurchasedProduct) it.next()).getStoreTransaction().getType() == ProductType.INAPP) {
                        PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.UnsupportedError, "Offline entitlements are not supported for one time purchases. Found one time purchases. See for more info: https://rev.cat/offline-entitlements");
                        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        String format = String.format("Error computing offline CustomerInfo. Will return original error. Creation error: %s", Arrays.copyOf(new Object[]{purchasesError}, 1));
                        t.f(format, "format(...)");
                        currentLogHandler.e("[Purchases] - ERROR", format, null);
                        DiagnosticsTracker access$getDiagnosticsTracker$p = OfflineCustomerInfoCalculator.access$getDiagnosticsTracker$p(OfflineCustomerInfoCalculator.this);
                        if (access$getDiagnosticsTracker$p != null) {
                            access$getDiagnosticsTracker$p.trackErrorEnteringOfflineEntitlementsMode(purchasesError);
                        }
                        this.$onError.invoke(purchasesError);
                        return;
                    }
                }
            }
            this.$onSuccess.invoke(OfflineCustomerInfoCalculator.access$buildCustomerInfoUsingListOfPurchases(OfflineCustomerInfoCalculator.this, this.$appUserID, list));
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
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            String format = String.format("Error computing offline CustomerInfo. Will return original error. Creation error: %s", Arrays.copyOf(new Object[]{purchasesError}, 1));
            t.f(format, "format(...)");
            currentLogHandler.e("[Purchases] - ERROR", format, null);
            DiagnosticsTracker access$getDiagnosticsTracker$p = OfflineCustomerInfoCalculator.access$getDiagnosticsTracker$p(OfflineCustomerInfoCalculator.this);
            if (access$getDiagnosticsTracker$p != null) {
                access$getDiagnosticsTracker$p.trackErrorEnteringOfflineEntitlementsMode(purchasesError);
            }
            this.$onError.invoke(purchasesError);
        }
    }

    public OfflineCustomerInfoCalculator(PurchasedProductsFetcher purchasedProductsFetcher, AppConfig appConfig, DiagnosticsTracker diagnosticsTracker, DateProvider dateProvider) {
        t.g(purchasedProductsFetcher, "purchasedProductsFetcher");
        t.g(appConfig, "appConfig");
        t.g(dateProvider, "dateProvider");
        this.purchasedProductsFetcher = purchasedProductsFetcher;
        this.appConfig = appConfig;
        this.diagnosticsTracker = diagnosticsTracker;
        this.dateProvider = dateProvider;
    }

    public static final /* synthetic */ CustomerInfo access$buildCustomerInfoUsingListOfPurchases(OfflineCustomerInfoCalculator offlineCustomerInfoCalculator, String str, List list) {
        return offlineCustomerInfoCalculator.buildCustomerInfoUsingListOfPurchases(str, list);
    }

    public static final /* synthetic */ DiagnosticsTracker access$getDiagnosticsTracker$p(OfflineCustomerInfoCalculator offlineCustomerInfoCalculator) {
        return offlineCustomerInfoCalculator.diagnosticsTracker;
    }

    private final CustomerInfo buildCustomerInfoUsingListOfPurchases(String str, List list) {
        JSONObject jSONObject = new JSONObject();
        Date now = this.dateProvider.getNow();
        String format = Iso8601Utils.format(now);
        jSONObject.put("request_date", format);
        jSONObject.put("request_date_ms", now.getTime());
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("original_app_user_id", str);
        jSONObject2.put("original_application_version", "1.0");
        jSONObject2.put("entitlements", generateEntitlementsResponse(list));
        jSONObject2.put("first_seen", format);
        jSONObject2.put("original_purchase_date", calculateOriginalPurchaseDate(list));
        jSONObject2.put("non_subscriptions", new JSONObject());
        jSONObject2.put("subscriptions", generateSubscriptions(list));
        jSONObject2.put("management_url", determineManagementURL());
        I i = I.a;
        jSONObject.put("subscriber", jSONObject2);
        return CustomerInfoFactory.INSTANCE.buildCustomerInfo(jSONObject, now, VerificationResult.VERIFIED_ON_DEVICE, CustomerInfoOriginalSource.OFFLINE_ENTITLEMENTS, false);
    }

    private final String calculateOriginalPurchaseDate(List list) {
        Long valueOf;
        Iterator it = list.iterator();
        if (it.hasNext()) {
            valueOf = Long.valueOf(((PurchasedProduct) it.next()).getStoreTransaction().getPurchaseTime());
            while (it.hasNext()) {
                Long valueOf2 = Long.valueOf(((PurchasedProduct) it.next()).getStoreTransaction().getPurchaseTime());
                if (valueOf.compareTo(valueOf2) > 0) {
                    valueOf = valueOf2;
                }
            }
        } else {
            valueOf = null;
        }
        if (valueOf != null) {
            return a.a(new Date(valueOf.longValue()));
        }
        return null;
    }

    private final Object determineManagementURL() {
        String managementUrl$purchases_defaultsBc8Release = this.appConfig.getStore().getManagementUrl$purchases_defaultsBc8Release();
        if (managementUrl$purchases_defaultsBc8Release != null) {
            return managementUrl$purchases_defaultsBc8Release;
        }
        Object obj = JSONObject.NULL;
        t.f(obj, "NULL");
        return obj;
    }

    private final JSONObject generateEntitlementsResponse(List list) {
        ArrayList<q> arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PurchasedProduct purchasedProduct = (PurchasedProduct) it.next();
            List entitlements = purchasedProduct.getEntitlements();
            ArrayList arrayList2 = new ArrayList(w.y(entitlements, 10));
            Iterator it2 = entitlements.iterator();
            while (it2.hasNext()) {
                arrayList2.add(x.a((String) it2.next(), purchasedProduct));
            }
            A.D(arrayList, arrayList2);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (q qVar : arrayList) {
            String str = (String) qVar.c();
            Object obj = linkedHashMap.get(str);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(str, obj);
            }
            ((List) obj).add((PurchasedProduct) qVar.d());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(Q.e(linkedHashMap.size()));
        Iterator it3 = linkedHashMap.entrySet().iterator();
        while (true) {
            Object obj2 = null;
            if (!it3.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it3.next();
            Object key = entry.getKey();
            List list2 = (List) entry.getValue();
            Iterator it4 = list2.iterator();
            if (it4.hasNext()) {
                obj2 = it4.next();
                if (it4.hasNext()) {
                    Date expiresDate = ((PurchasedProduct) obj2).getExpiresDate();
                    long time = expiresDate != null ? expiresDate.getTime() : Long.MAX_VALUE;
                    do {
                        Object next = it4.next();
                        Date expiresDate2 = ((PurchasedProduct) next).getExpiresDate();
                        long time2 = expiresDate2 != null ? expiresDate2.getTime() : Long.MAX_VALUE;
                        if (time < time2) {
                            obj2 = next;
                            time = time2;
                        }
                    } while (it4.hasNext());
                }
            }
            PurchasedProduct purchasedProduct2 = (PurchasedProduct) obj2;
            if (purchasedProduct2 == null) {
                purchasedProduct2 = (PurchasedProduct) D.f0(list2);
            }
            linkedHashMap2.put(key, purchasedProduct2);
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            String str2 = (String) entry2.getKey();
            PurchasedProduct purchasedProduct3 = (PurchasedProduct) entry2.getValue();
            JSONObject jSONObject2 = new JSONObject();
            Date expiresDate3 = purchasedProduct3.getExpiresDate();
            jSONObject2.put("expires_date", expiresDate3 != null ? Iso8601Utils.format(expiresDate3) : null);
            jSONObject2.put("product_identifier", purchasedProduct3.getProductIdentifier());
            jSONObject2.put("purchase_date", Iso8601Utils.format(new Date(purchasedProduct3.getStoreTransaction().getPurchaseTime())));
            String basePlanId = purchasedProduct3.getBasePlanId();
            if (basePlanId != null) {
                jSONObject2.put("product_plan_identifier", basePlanId);
            }
            jSONObject.put(str2, jSONObject2);
        }
        return jSONObject;
    }

    private final JSONObject generateSubscriptions(List list) {
        String format;
        JSONObject jSONObject = new JSONObject();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PurchasedProduct purchasedProduct = (PurchasedProduct) it.next();
            String productIdentifier = purchasedProduct.getProductIdentifier();
            JSONObject jSONObject2 = new JSONObject();
            Object obj = JSONObject.NULL;
            jSONObject2.put("billing_issues_detected_at", obj);
            jSONObject2.put("is_sandbox", false);
            Date date = new Date(purchasedProduct.getStoreTransaction().getPurchaseTime());
            jSONObject2.put("original_purchase_date", Iso8601Utils.format(date));
            jSONObject2.put("purchase_date", Iso8601Utils.format(date));
            String name = this.appConfig.getStore().name();
            Locale locale = Locale.ROOT;
            String lowerCase = name.toLowerCase(locale);
            t.f(lowerCase, "toLowerCase(...)");
            jSONObject2.put("store", lowerCase);
            jSONObject2.put("unsubscribe_detected_at", obj);
            jSONObject2.put("product_plan_identifier", purchasedProduct.getBasePlanId());
            Date expiresDate = purchasedProduct.getExpiresDate();
            if (expiresDate != null && (format = Iso8601Utils.format(expiresDate)) != null) {
                obj = format;
            }
            jSONObject2.put("expires_date", obj);
            jSONObject2.put("management_url", determineManagementURL());
            String lowerCase2 = "NORMAL".toLowerCase(locale);
            t.f(lowerCase2, "toLowerCase(...)");
            jSONObject2.put("period_type", lowerCase2);
            I i = I.a;
            jSONObject.put(productIdentifier, jSONObject2);
        }
        return jSONObject;
    }

    public final void computeOfflineCustomerInfo(String str, l lVar, l lVar2) {
        t.g(str, "appUserID");
        t.g(lVar, "onSuccess");
        t.g(lVar2, "onError");
        this.purchasedProductsFetcher.queryActiveProducts(str, new 1(lVar2, str, lVar), new 2(lVar2));
    }

    public /* synthetic */ OfflineCustomerInfoCalculator(PurchasedProductsFetcher purchasedProductsFetcher, AppConfig appConfig, DiagnosticsTracker diagnosticsTracker, DateProvider dateProvider, int i, k kVar) {
        this(purchasedProductsFetcher, appConfig, diagnosticsTracker, (i & 8) != 0 ? new DefaultDateProvider() : dateProvider);
    }
}
