package com.revenuecat.purchases.common;

import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.CustomerInfoOriginalSource;
import com.revenuecat.purchases.SubscriptionInfo;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.common.responses.SubscriptionInfoResponse;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import com.revenuecat.purchases.utils.SerializationException;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.t;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CustomerInfoFactory {
    public static final CustomerInfoFactory INSTANCE = new CustomerInfoFactory();

    private CustomerInfoFactory() {
    }

    public static /* synthetic */ CustomerInfo buildCustomerInfo$default(CustomerInfoFactory customerInfoFactory, JSONObject jSONObject, Date date, VerificationResult verificationResult, CustomerInfoOriginalSource customerInfoOriginalSource, boolean z, int i, Object obj) throws JSONException {
        if ((i & 8) != 0) {
            customerInfoOriginalSource = CustomerInfoOriginalSource.MAIN;
        }
        CustomerInfoOriginalSource customerInfoOriginalSource2 = customerInfoOriginalSource;
        if ((i & 16) != 0) {
            z = false;
        }
        return customerInfoFactory.buildCustomerInfo(jSONObject, date, verificationResult, customerInfoOriginalSource2, z);
    }

    private final HashMap parseDates(JSONObject jSONObject, String str) {
        HashMap hashMap = new HashMap();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str2 = (String) keys.next();
            String optString = jSONObject.getJSONObject(str2).optString("product_plan_identifier");
            t.f(optString, "it");
            if (optString.length() <= 0) {
                optString = null;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(str2);
            if (optString != null) {
                String str3 = str2 + ':' + optString;
                if (str3 != null) {
                    str2 = str3;
                }
            }
            t.f(str2, "key");
            t.f(jSONObject2, "expirationObject");
            hashMap.put(str2, JSONObjectExtensionsKt.optDate(jSONObject2, str));
        }
        return hashMap;
    }

    private final Map parseExpirations(JSONObject jSONObject) {
        return parseDates(jSONObject, "expires_date");
    }

    private final Map parsePurchaseDates(JSONObject jSONObject) {
        return parseDates(jSONObject, "purchase_date");
    }

    public final CustomerInfo buildCustomerInfo(HTTPResult hTTPResult) throws JSONException {
        t.g(hTTPResult, "httpResult");
        return buildCustomerInfo(hTTPResult.getBody(), hTTPResult.getRequestDate(), hTTPResult.getVerificationResult(), hTTPResult.isLoadShedderResponse() ? CustomerInfoOriginalSource.LOAD_SHEDDER : CustomerInfoOriginalSource.MAIN, false);
    }

    public final Map parseSubscriptionInfos(JSONObject jSONObject, Date date) {
        t.g(jSONObject, "subscriberJSONObject");
        t.g(date, "requestDate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONObject jSONObject2 = jSONObject.getJSONObject("subscriptions");
        try {
            Iterator keys = jSONObject2.keys();
            t.f(keys, "subscriptions.keys()");
            while (keys.hasNext()) {
                String str = (String) keys.next();
                JSONObject jSONObject3 = jSONObject2.getJSONObject(str);
                tb.b defaultJson = JsonProvider.Companion.getDefaultJson();
                String jSONObject4 = jSONObject3.toString();
                t.f(jSONObject4, "subscriptionJSONObject.toString()");
                defaultJson.a();
                SubscriptionInfoResponse subscriptionInfoResponse = (SubscriptionInfoResponse) defaultJson.d(SubscriptionInfoResponse.Companion.serializer(), jSONObject4);
                t.f(str, "productId");
                linkedHashMap.put(str, new SubscriptionInfo(str, date, subscriptionInfoResponse, null, 8, null));
            }
        } catch (IllegalArgumentException e) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error deserializing subscription information. The input is not a SubscriptionInfo", e);
            Collections.emptyMap();
        } catch (SerializationException e2) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error deserializing subscription information", e2);
            Collections.emptyMap();
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.revenuecat.purchases.CustomerInfo buildCustomerInfo(org.json.JSONObject r19, java.util.Date r20, com.revenuecat.purchases.VerificationResult r21, com.revenuecat.purchases.CustomerInfoOriginalSource r22, boolean r23) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.common.CustomerInfoFactory.buildCustomerInfo(org.json.JSONObject, java.util.Date, com.revenuecat.purchases.VerificationResult, com.revenuecat.purchases.CustomerInfoOriginalSource, boolean):com.revenuecat.purchases.CustomerInfo");
    }
}
