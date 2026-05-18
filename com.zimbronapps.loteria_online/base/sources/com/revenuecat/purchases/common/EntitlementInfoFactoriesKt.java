package com.revenuecat.purchases.common;

import com.revenuecat.purchases.EntitlementInfo;
import com.revenuecat.purchases.EntitlementInfos;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.OwnershipType;
import com.revenuecat.purchases.PeriodType;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.utils.DateActive;
import com.revenuecat.purchases.utils.DateHelper;
import com.revenuecat.purchases.utils.EntitlementInfoHelper;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.t;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class EntitlementInfoFactoriesKt {
    public static final EntitlementInfo buildEntitlementInfo(JSONObject jSONObject, String str, JSONObject jSONObject2, Date date, VerificationResult verificationResult) {
        t.g(jSONObject, "<this>");
        t.g(str, "identifier");
        t.g(jSONObject2, "productData");
        t.g(date, "requestDate");
        t.g(verificationResult, "verificationResult");
        Date optDate = JSONObjectExtensionsKt.optDate(jSONObject, "expires_date");
        Date optDate2 = JSONObjectExtensionsKt.optDate(jSONObject2, "unsubscribe_detected_at");
        Date optDate3 = JSONObjectExtensionsKt.optDate(jSONObject2, "billing_issues_detected_at");
        PeriodType optPeriodType = optPeriodType(jSONObject2, "period_type");
        Store store = getStore(jSONObject2, "store");
        boolean isDateActive = isDateActive(str, optDate, date);
        boolean willRenew = EntitlementInfoHelper.INSTANCE.getWillRenew(store, optDate, optDate2, optDate3, optPeriodType);
        Date date2 = JSONObjectExtensionsKt.getDate(jSONObject, "purchase_date");
        Date date3 = JSONObjectExtensionsKt.getDate(jSONObject2, "original_purchase_date");
        String string = jSONObject.getString("product_identifier");
        t.f(string, "getString(EntitlementsRe…nKeys.PRODUCT_IDENTIFIER)");
        return new EntitlementInfo(str, isDateActive, willRenew, optPeriodType, date2, date3, optDate, store, string, JSONObjectExtensionsKt.optNullableString(jSONObject, "product_plan_identifier"), jSONObject2.getBoolean("is_sandbox"), optDate2, optDate3, optOwnershipType(jSONObject2, "ownership_type"), jSONObject, verificationResult);
    }

    public static final EntitlementInfos buildEntitlementInfos(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, Date date, VerificationResult verificationResult) {
        t.g(jSONObject, "<this>");
        t.g(jSONObject2, "subscriptions");
        t.g(jSONObject3, "nonSubscriptionsLatestPurchases");
        t.g(date, "requestDate");
        t.g(verificationResult, "verificationResult");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator keys = jSONObject.keys();
        t.f(keys, "keys()");
        while (keys.hasNext()) {
            String str = (String) keys.next();
            JSONObject jSONObject4 = jSONObject.getJSONObject(str);
            String optString = jSONObject4.optString("product_identifier");
            t.f(optString, "it");
            if (optString.length() <= 0) {
                optString = null;
            }
            if (optString != null) {
                if (jSONObject2.has(optString)) {
                    t.f(str, "entitlementId");
                    t.f(jSONObject4, "entitlement");
                    JSONObject jSONObject5 = jSONObject2.getJSONObject(optString);
                    t.f(jSONObject5, "subscriptions.getJSONObject(productIdentifier)");
                    linkedHashMap.put(str, buildEntitlementInfo(jSONObject4, str, jSONObject5, date, verificationResult));
                } else if (jSONObject3.has(optString)) {
                    t.f(str, "entitlementId");
                    t.f(jSONObject4, "entitlement");
                    JSONObject jSONObject6 = jSONObject3.getJSONObject(optString);
                    t.f(jSONObject6, "nonSubscriptionsLatestPu…Object(productIdentifier)");
                    linkedHashMap.put(str, buildEntitlementInfo(jSONObject4, str, jSONObject6, date, verificationResult));
                }
            }
        }
        return new EntitlementInfos(linkedHashMap, verificationResult);
    }

    public static final Store getStore(JSONObject jSONObject, String str) {
        t.g(jSONObject, "<this>");
        t.g(str, "name");
        Store.Companion companion = Store.Companion;
        String string = jSONObject.getString(str);
        t.f(string, "getString(name)");
        return companion.fromString(string);
    }

    private static final boolean isDateActive(String str, Date date, Date date2) {
        DateActive dateActive = DateHelper.Companion.isDateActive-SxA4cEA$default(DateHelper.Companion, date, date2, 0L, 4, (Object) null);
        if (!dateActive.isActive() && !dateActive.getInGracePeriod()) {
            LogLevel logLevel = LogLevel.WARN;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                String str2 = "[Purchases] - " + logLevel.name();
                String format = String.format("Entitlement %s is no longer active (expired %s) and it's outside grace period window (last updated %s)", Arrays.copyOf(new Object[]{str, date, date2}, 3));
                t.f(format, "format(...)");
                currentLogHandler.w(str2, format);
            }
        }
        return dateActive.isActive();
    }

    public static final OwnershipType optOwnershipType(JSONObject jSONObject, String str) {
        t.g(jSONObject, "<this>");
        t.g(str, "name");
        String optString = jSONObject.optString(str);
        return t.c(optString, "PURCHASED") ? OwnershipType.PURCHASED : t.c(optString, "FAMILY_SHARED") ? OwnershipType.FAMILY_SHARED : OwnershipType.UNKNOWN;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final PeriodType optPeriodType(JSONObject jSONObject, String str) {
        t.g(jSONObject, "<this>");
        t.g(str, "name");
        String optString = jSONObject.optString(str);
        if (optString != null) {
            switch (optString.hashCode()) {
                case -1039745817:
                    if (optString.equals("normal")) {
                        return PeriodType.NORMAL;
                    }
                    break;
                case -318370833:
                    if (optString.equals("prepaid")) {
                        return PeriodType.PREPAID;
                    }
                    break;
                case 100361836:
                    if (optString.equals("intro")) {
                        return PeriodType.INTRO;
                    }
                    break;
                case 110628630:
                    if (optString.equals("trial")) {
                        return PeriodType.TRIAL;
                    }
                    break;
            }
        }
        return PeriodType.NORMAL;
    }
}
