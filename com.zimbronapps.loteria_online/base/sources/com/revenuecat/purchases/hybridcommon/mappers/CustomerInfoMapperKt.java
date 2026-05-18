package com.revenuecat.purchases.hybridcommon.mappers;

import Ca.I;
import Ca.q;
import Ca.t;
import Ca.x;
import Da.D;
import Da.Q;
import Da.S;
import Da.w;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import android.net.Uri;
import cb.K;
import cb.O;
import cb.i;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.SubscriptionInfo;
import com.revenuecat.purchases.models.Transaction;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CustomerInfoMapperKt {

    @f(c = "com.revenuecat.purchases.hybridcommon.mappers.CustomerInfoMapperKt$mapAsync$1", f = "CustomerInfoMapper.kt", l = {38}, m = "invokeSuspend")
    public static final class 1 extends l implements p {
        final /* synthetic */ Qa.l $callback;
        final /* synthetic */ CustomerInfo $this_mapAsync;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(Qa.l lVar, CustomerInfo customerInfo, e eVar) {
            super(2, eVar);
            this.$callback = lVar;
            this.$this_mapAsync = customerInfo;
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
                CustomerInfoMapperKt$mapAsync$1$map$1 customerInfoMapperKt$mapAsync$1$map$1 = new CustomerInfoMapperKt$mapAsync$1$map$1(this.$this_mapAsync, null);
                this.label = 1;
                obj = i.g(mapperDispatcher, customerInfoMapperKt$mapAsync$1$map$1, this);
                if (obj == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            this.$callback.invoke((Map) obj);
            return I.a;
        }
    }

    @InternalRevenueCatAPI
    public static final Map map(CustomerInfo customerInfo) {
        kotlin.jvm.internal.t.g(customerInfo, "<this>");
        q a = x.a("entitlements", EntitlementInfosMapperKt.map(customerInfo.getEntitlements()));
        q a2 = x.a("activeSubscriptions", D.L0(customerInfo.getActiveSubscriptions()));
        q a3 = x.a("allPurchasedProductIdentifiers", D.L0(customerInfo.getAllPurchasedProductIds()));
        Date latestExpirationDate = customerInfo.getLatestExpirationDate();
        q a4 = x.a("latestExpirationDate", latestExpirationDate != null ? MappersHelpersKt.toIso8601(latestExpirationDate) : null);
        Date latestExpirationDate2 = customerInfo.getLatestExpirationDate();
        q a5 = x.a("latestExpirationDateMillis", latestExpirationDate2 != null ? Long.valueOf(MappersHelpersKt.toMillis(latestExpirationDate2)) : null);
        q a6 = x.a("firstSeen", MappersHelpersKt.toIso8601(customerInfo.getFirstSeen()));
        q a7 = x.a("firstSeenMillis", Long.valueOf(MappersHelpersKt.toMillis(customerInfo.getFirstSeen())));
        q a8 = x.a("originalAppUserId", customerInfo.getOriginalAppUserId());
        q a9 = x.a("requestDate", MappersHelpersKt.toIso8601(customerInfo.getRequestDate()));
        q a10 = x.a("requestDateMillis", Long.valueOf(MappersHelpersKt.toMillis(customerInfo.getRequestDate())));
        Map allExpirationDatesByProduct = customerInfo.getAllExpirationDatesByProduct();
        LinkedHashMap linkedHashMap = new LinkedHashMap(Q.e(allExpirationDatesByProduct.size()));
        for (Map.Entry entry : allExpirationDatesByProduct.entrySet()) {
            Object key = entry.getKey();
            Date date = (Date) entry.getValue();
            linkedHashMap.put(key, date != null ? MappersHelpersKt.toIso8601(date) : null);
        }
        q a11 = x.a("allExpirationDates", linkedHashMap);
        Map allExpirationDatesByProduct2 = customerInfo.getAllExpirationDatesByProduct();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(Q.e(allExpirationDatesByProduct2.size()));
        for (Map.Entry entry2 : allExpirationDatesByProduct2.entrySet()) {
            Object key2 = entry2.getKey();
            Date date2 = (Date) entry2.getValue();
            linkedHashMap2.put(key2, date2 != null ? Long.valueOf(MappersHelpersKt.toMillis(date2)) : null);
        }
        q a12 = x.a("allExpirationDatesMillis", linkedHashMap2);
        Map allPurchaseDatesByProduct = customerInfo.getAllPurchaseDatesByProduct();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(Q.e(allPurchaseDatesByProduct.size()));
        Iterator it = allPurchaseDatesByProduct.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it.next();
            Iterator it2 = it;
            Object key3 = entry3.getKey();
            Date date3 = (Date) entry3.getValue();
            linkedHashMap3.put(key3, date3 != null ? MappersHelpersKt.toIso8601(date3) : null);
            it = it2;
        }
        q a13 = x.a("allPurchaseDates", linkedHashMap3);
        Map allPurchaseDatesByProduct2 = customerInfo.getAllPurchaseDatesByProduct();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(Q.e(allPurchaseDatesByProduct2.size()));
        Iterator it3 = allPurchaseDatesByProduct2.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry4 = (Map.Entry) it3.next();
            Iterator it4 = it3;
            Object key4 = entry4.getKey();
            Date date4 = (Date) entry4.getValue();
            linkedHashMap4.put(key4, date4 != null ? Long.valueOf(MappersHelpersKt.toMillis(date4)) : null);
            it3 = it4;
        }
        q a14 = x.a("allPurchaseDatesMillis", linkedHashMap4);
        q a15 = x.a("originalApplicationVersion", (Object) null);
        Uri managementURL = customerInfo.getManagementURL();
        q a16 = x.a("managementURL", managementURL != null ? managementURL.toString() : null);
        Date originalPurchaseDate = customerInfo.getOriginalPurchaseDate();
        q a17 = x.a("originalPurchaseDate", originalPurchaseDate != null ? MappersHelpersKt.toIso8601(originalPurchaseDate) : null);
        Date originalPurchaseDate2 = customerInfo.getOriginalPurchaseDate();
        q a18 = x.a("originalPurchaseDateMillis", originalPurchaseDate2 != null ? Long.valueOf(MappersHelpersKt.toMillis(originalPurchaseDate2)) : null);
        List nonSubscriptionTransactions = customerInfo.getNonSubscriptionTransactions();
        ArrayList arrayList = new ArrayList(w.y(nonSubscriptionTransactions, 10));
        Iterator it5 = nonSubscriptionTransactions.iterator();
        while (it5.hasNext()) {
            arrayList.add(TransactionMapperKt.map((Transaction) it5.next()));
        }
        q a19 = x.a("nonSubscriptionTransactions", arrayList);
        Map subscriptionsByProductIdentifier = customerInfo.getSubscriptionsByProductIdentifier();
        LinkedHashMap linkedHashMap5 = new LinkedHashMap(Q.e(subscriptionsByProductIdentifier.size()));
        for (Iterator it6 = subscriptionsByProductIdentifier.entrySet().iterator(); it6.hasNext(); it6 = it6) {
            Map.Entry entry5 = (Map.Entry) it6.next();
            linkedHashMap5.put(entry5.getKey(), SubscriptionInfoMapperKt.map((SubscriptionInfo) entry5.getValue()));
        }
        return S.l(new q[]{a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, x.a("subscriptionsByProductIdentifier", linkedHashMap5)});
    }

    public static final void mapAsync(CustomerInfo customerInfo, Qa.l lVar) {
        kotlin.jvm.internal.t.g(customerInfo, "<this>");
        kotlin.jvm.internal.t.g(lVar, "callback");
        i.d(MappersHelpersKt.getMainScope(), (Ga.i) null, (cb.Q) null, new 1(lVar, customerInfo, null), 3, (Object) null);
    }
}
