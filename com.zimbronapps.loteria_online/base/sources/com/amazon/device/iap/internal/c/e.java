package com.amazon.device.iap.internal.c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.amazon.a.a.o.f;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.internal.model.ProductBuilder;
import com.amazon.device.iap.internal.model.ProductDataResponseBuilder;
import com.amazon.device.iap.internal.model.PurchaseResponseBuilder;
import com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder;
import com.amazon.device.iap.internal.model.ReceiptBuilder;
import com.amazon.device.iap.internal.model.UserDataBuilder;
import com.amazon.device.iap.internal.model.UserDataResponseBuilder;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.Product;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserData;
import com.amazon.device.iap.model.UserDataRequest;
import com.amazon.device.iap.model.UserDataResponse;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class e implements com.amazon.device.iap.internal.e {
    private static final String a = "e";
    private static final String b = "com.amazon.sdktestclient";
    private static final String c = "com.amazon.sdktestclient.command.CommandBroker";

    public class 1 implements Runnable {
        final /* synthetic */ Object a;
        final /* synthetic */ PurchasingListener b;

        public 1(Object obj, PurchasingListener purchasingListener) {
            this.a = obj;
            this.b = purchasingListener;
        }

        public void run() {
            try {
                Object obj = this.a;
                if (obj instanceof ProductDataResponse) {
                    this.b.onProductDataResponse((ProductDataResponse) obj);
                } else if (obj instanceof UserDataResponse) {
                    this.b.onUserDataResponse((UserDataResponse) obj);
                } else if (obj instanceof PurchaseUpdatesResponse) {
                    this.b.onPurchaseUpdatesResponse((PurchaseUpdatesResponse) obj);
                } else if (obj instanceof PurchaseResponse) {
                    this.b.onPurchaseResponse((PurchaseResponse) obj);
                } else {
                    com.amazon.device.iap.internal.util.b.b(e.a(), "Unknown response type:" + this.a.getClass().getName());
                }
            } catch (Exception e) {
                com.amazon.device.iap.internal.util.b.b(e.a(), "Error in sendResponse: " + e);
            }
        }
    }

    public static /* synthetic */ String a() {
        return a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3 */
    private PurchaseUpdatesResponse b(Intent intent) {
        UserData userData;
        ArrayList arrayList;
        Exception e;
        RequestId requestId;
        boolean z;
        boolean z2;
        JSONObject jSONObject;
        PurchaseUpdatesResponse.RequestStatus requestStatus = PurchaseUpdatesResponse.RequestStatus.FAILED;
        ArrayList arrayList2 = null;
        int i = 0;
        try {
            jSONObject = new JSONObject(intent.getStringExtra("purchaseUpdatesOutput"));
            requestId = RequestId.fromString(jSONObject.optString("requestId"));
            try {
                requestStatus = PurchaseUpdatesResponse.RequestStatus.valueOf(jSONObject.optString("status"));
                z2 = jSONObject.optBoolean("isMore");
                try {
                    userData = new UserDataBuilder().setUserId(jSONObject.optString("userId")).setMarketplace(jSONObject.optString("marketplace")).build();
                } catch (Exception e2) {
                    e = e2;
                    userData = null;
                    arrayList = null;
                }
            } catch (Exception e3) {
                userData = null;
                arrayList = null;
                e = e3;
            }
            try {
                z = z2;
            } catch (Exception e4) {
                e = e4;
                arrayList = null;
                e = e;
                i = z2 ? 1 : 0;
                Log.e(a, "Error parsing purchase updates output", e);
                z2 = i;
                arrayList2 = arrayList;
                z = z2;
                return new PurchaseUpdatesResponseBuilder().setRequestId(requestId).setRequestStatus(requestStatus).setUserData(userData).setReceipts(arrayList2).setHasMore(z).build();
            }
        } catch (Exception e5) {
            userData = null;
            arrayList = null;
            e = e5;
            requestId = null;
        }
        if (requestStatus == PurchaseUpdatesResponse.RequestStatus.SUCCESSFUL) {
            arrayList = new ArrayList();
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("receipts");
                if (optJSONArray != null) {
                    while (i < optJSONArray.length()) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        try {
                            arrayList.add(a(optJSONObject));
                        } catch (Exception unused) {
                            Log.e(a, "Failed to parse receipt from json:" + optJSONObject);
                        }
                        i++;
                    }
                }
            } catch (Exception e6) {
                e = e6;
                i = z2 ? 1 : 0;
                Log.e(a, "Error parsing purchase updates output", e);
                z2 = i;
                arrayList2 = arrayList;
                z = z2;
                return new PurchaseUpdatesResponseBuilder().setRequestId(requestId).setRequestStatus(requestStatus).setUserData(userData).setReceipts(arrayList2).setHasMore(z).build();
            }
            arrayList2 = arrayList;
            z = z2;
        }
        return new PurchaseUpdatesResponseBuilder().setRequestId(requestId).setRequestStatus(requestStatus).setUserData(userData).setReceipts(arrayList2).setHasMore(z).build();
    }

    private void c(Intent intent) {
        a(d(intent));
    }

    private ProductDataResponse d(Intent intent) {
        Set set;
        Map map;
        Exception e;
        RequestId requestId;
        ProductDataResponse.RequestStatus requestStatus;
        ProductDataResponse.RequestStatus requestStatus2 = ProductDataResponse.RequestStatus.FAILED;
        Set set2 = null;
        try {
            JSONObject jSONObject = new JSONObject(intent.getStringExtra("itemDataOutput"));
            requestId = RequestId.fromString(jSONObject.optString("requestId"));
            try {
                requestStatus = ProductDataResponse.RequestStatus.valueOf(jSONObject.optString("status"));
                if (requestStatus != requestStatus2) {
                    try {
                        Set linkedHashSet = new LinkedHashSet();
                        try {
                            map = new HashMap();
                            try {
                                JSONArray optJSONArray = jSONObject.optJSONArray("unavailableSkus");
                                if (optJSONArray != null) {
                                    for (int i = 0; i < optJSONArray.length(); i++) {
                                        linkedHashSet.add(optJSONArray.getString(i));
                                    }
                                }
                                JSONObject optJSONObject = jSONObject.optJSONObject("items");
                                if (optJSONObject != null) {
                                    Iterator keys = optJSONObject.keys();
                                    while (keys.hasNext()) {
                                        String str = (String) keys.next();
                                        map.put(str, a(str, optJSONObject.optJSONObject(str)));
                                    }
                                }
                                set2 = linkedHashSet;
                            } catch (Exception e2) {
                                e = e2;
                                set = linkedHashSet;
                                requestStatus2 = requestStatus;
                                Log.e(a, "Error parsing item data output", e);
                                requestStatus = requestStatus2;
                                set2 = set;
                                return new ProductDataResponseBuilder().setRequestId(requestId).setRequestStatus(requestStatus).setProductData(map).setUnavailableSkus(set2).build();
                            }
                        } catch (Exception e3) {
                            map = null;
                            e = e3;
                        }
                    } catch (Exception e4) {
                        set = null;
                        map = null;
                        e = e4;
                    }
                } else {
                    map = null;
                }
            } catch (Exception e5) {
                map = null;
                e = e5;
                set = null;
            }
        } catch (Exception e6) {
            set = null;
            map = null;
            e = e6;
            requestId = null;
        }
        return new ProductDataResponseBuilder().setRequestId(requestId).setRequestStatus(requestStatus).setProductData(map).setUnavailableSkus(set2).build();
    }

    private void e(Intent intent) {
        JSONObject jSONObject;
        UserDataResponse f = f(intent);
        RequestId requestId = f.getRequestId();
        String stringExtra = intent.getStringExtra("userInput");
        try {
            jSONObject = new JSONObject(stringExtra);
        } catch (JSONException e) {
            Log.e(a, "Unable to parse request data: " + stringExtra, e);
            jSONObject = null;
        }
        if (requestId == null || jSONObject == null) {
            a(f);
            return;
        }
        if (!jSONObject.optBoolean("isPurchaseUpdates", false)) {
            a(f);
            return;
        }
        if (f.getUserData() == null || f.a(f.getUserData().getUserId())) {
            Log.e(a, "No Userid found in userDataResponse" + f);
            a(new PurchaseUpdatesResponseBuilder().setRequestId(requestId).setRequestStatus(PurchaseUpdatesResponse.RequestStatus.FAILED).setUserData(f.getUserData()).setReceipts(new ArrayList()).setHasMore(false).build());
            return;
        }
        Log.i(a, "sendGetPurchaseUpdates with user id" + f.getUserData().getUserId());
        a(requestId.toString(), f.getUserData().getUserId(), jSONObject.optBoolean("reset", true));
    }

    private UserDataResponse f(Intent intent) {
        RequestId requestId;
        JSONObject jSONObject;
        UserDataResponse.RequestStatus requestStatus = UserDataResponse.RequestStatus.FAILED;
        UserData userData = null;
        try {
            jSONObject = new JSONObject(intent.getStringExtra("userOutput"));
            requestId = RequestId.fromString(jSONObject.optString("requestId"));
        } catch (Exception e) {
            e = e;
            requestId = null;
        }
        try {
            requestStatus = UserDataResponse.RequestStatus.valueOf(jSONObject.optString("status"));
            if (requestStatus == UserDataResponse.RequestStatus.SUCCESSFUL) {
                String optString = jSONObject.optString("userId");
                userData = new UserDataBuilder().setUserId(optString).setMarketplace(jSONObject.optString("marketplace")).setLWAConsentStatus(jSONObject.optString("UserDataResponse.LWAConsentStatus")).build();
            }
        } catch (Exception e2) {
            e = e2;
            Log.e(a, "Error parsing userid output", e);
            return new UserDataResponseBuilder().setRequestId(requestId).setRequestStatus(requestStatus).setUserData(userData).build();
        }
        return new UserDataResponseBuilder().setRequestId(requestId).setRequestStatus(requestStatus).setUserData(userData).build();
    }

    private void g(Intent intent) {
        a(h(intent));
    }

    private PurchaseResponse h(Intent intent) {
        RequestId requestId;
        UserData userData;
        PurchaseResponse.RequestStatus requestStatus = PurchaseResponse.RequestStatus.FAILED;
        Receipt receipt = null;
        try {
            JSONObject jSONObject = new JSONObject(intent.getStringExtra("purchaseOutput"));
            requestId = RequestId.fromString(jSONObject.optString("requestId"));
            try {
                userData = new UserDataBuilder().setUserId(jSONObject.optString("userId")).setMarketplace(jSONObject.optString("marketplace")).build();
            } catch (Exception e) {
                e = e;
                userData = null;
            }
            try {
                requestStatus = PurchaseResponse.RequestStatus.safeValueOf(jSONObject.optString("purchaseStatus"));
                JSONObject optJSONObject = jSONObject.optJSONObject("receipt");
                if (optJSONObject != null) {
                    receipt = a(optJSONObject);
                }
            } catch (Exception e2) {
                e = e2;
                Log.e(a, "Error parsing purchase output", e);
                return new PurchaseResponseBuilder().setRequestId(requestId).setRequestStatus(requestStatus).setUserData(userData).setReceipt(receipt).build();
            }
        } catch (Exception e3) {
            e = e3;
            requestId = null;
            userData = null;
        }
        return new PurchaseResponseBuilder().setRequestId(requestId).setRequestStatus(requestStatus).setUserData(userData).setReceipt(receipt).build();
    }

    public void a(RequestId requestId, UserDataRequest userDataRequest) {
        com.amazon.device.iap.internal.util.b.a(a, "sendGetUserDataRequest");
        a(requestId.toString(), false, false, userDataRequest);
    }

    private void a(String str, boolean z, boolean z2, UserDataRequest userDataRequest) {
        try {
            Context b2 = com.amazon.device.iap.internal.d.f().b();
            Bundle bundle = new Bundle();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("requestId", str);
            jSONObject.put("packageName", b2.getPackageName());
            jSONObject.put("sdkVersion", "2.10.5.0");
            jSONObject.put("isPurchaseUpdates", z);
            jSONObject.put("reset", z2);
            if (userDataRequest != null) {
                jSONObject.put("UserDataRequest.fetchLWAConsentStatus", userDataRequest.getFetchLWAConsentStatus());
            }
            bundle.putString("userInput", jSONObject.toString());
            Intent a2 = a("com.amazon.testclient.iap.appUserId");
            a2.addFlags(268435456);
            a2.putExtras(bundle);
            b2.startService(a2);
        } catch (JSONException unused) {
            com.amazon.device.iap.internal.util.b.b(a, "Error in sendGetUserDataRequest.");
        }
    }

    public void a(RequestId requestId, String str) {
        com.amazon.device.iap.internal.util.b.a(a, "sendPurchaseRequest");
        try {
            Context b2 = com.amazon.device.iap.internal.d.f().b();
            boolean d = com.amazon.device.iap.internal.d.f().d();
            Bundle bundle = new Bundle();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sku", str);
            jSONObject.put("enablePendingPurchases", d);
            jSONObject.put("requestId", requestId.toString());
            jSONObject.put("packageName", b2.getPackageName());
            jSONObject.put("sdkVersion", "2.10.5.0");
            bundle.putString("purchaseInput", jSONObject.toString());
            Intent a2 = a("com.amazon.testclient.iap.purchase");
            a2.addFlags(268435456);
            a2.putExtras(bundle);
            b2.startService(a2);
        } catch (JSONException unused) {
            com.amazon.device.iap.internal.util.b.b(a, "Error in sendPurchaseRequest.");
        }
    }

    public void a(RequestId requestId, Set set) {
        com.amazon.device.iap.internal.util.b.a(a, "sendItemDataRequest");
        try {
            Context b2 = com.amazon.device.iap.internal.d.f().b();
            Bundle bundle = new Bundle();
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray(set);
            jSONObject.put("requestId", requestId.toString());
            jSONObject.put("packageName", b2.getPackageName());
            jSONObject.put("skus", jSONArray);
            jSONObject.put("sdkVersion", "2.10.5.0");
            bundle.putString("itemDataInput", jSONObject.toString());
            Intent a2 = a("com.amazon.testclient.iap.itemData");
            a2.addFlags(268435456);
            a2.putExtras(bundle);
            b2.startService(a2);
        } catch (JSONException unused) {
            com.amazon.device.iap.internal.util.b.b(a, "Error in sendItemDataRequest.");
        }
    }

    public void a(RequestId requestId, boolean z) {
        if (requestId == null) {
            requestId = new RequestId();
        }
        com.amazon.device.iap.internal.util.b.a(a, "sendPurchaseUpdatesRequest/sendGetUserData first:" + requestId);
        a(requestId.toString(), true, z, null);
    }

    public void a(RequestId requestId, String str, FulfillmentResult fulfillmentResult) {
        com.amazon.device.iap.internal.util.b.a(a, "sendNotifyPurchaseFulfilled");
        try {
            Context b2 = com.amazon.device.iap.internal.d.f().b();
            Bundle bundle = new Bundle();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("requestId", requestId.toString());
            jSONObject.put("packageName", b2.getPackageName());
            jSONObject.put("receiptId", str);
            jSONObject.put("fulfillmentResult", fulfillmentResult);
            jSONObject.put("sdkVersion", "2.10.5.0");
            bundle.putString("purchaseFulfilledInput", jSONObject.toString());
            Intent a2 = a("com.amazon.testclient.iap.purchaseFulfilled");
            a2.addFlags(268435456);
            a2.putExtras(bundle);
            b2.startService(a2);
        } catch (JSONException unused) {
            com.amazon.device.iap.internal.util.b.b(a, "Error in sendNotifyPurchaseFulfilled.");
        }
    }

    public void a(Context context, Intent intent) {
        com.amazon.device.iap.internal.util.b.a(a, "handleResponse");
        intent.setComponent(new ComponentName("com.amazon.sdktestclient", "com.amazon.sdktestclient.command.CommandBroker"));
        try {
            String string = intent.getExtras().getString("responseType");
            if (string.equalsIgnoreCase("com.amazon.testclient.iap.purchase")) {
                g(intent);
            } else if (string.equalsIgnoreCase("com.amazon.testclient.iap.appUserId")) {
                e(intent);
            } else if (string.equalsIgnoreCase("com.amazon.testclient.iap.itemData")) {
                c(intent);
            } else if (string.equalsIgnoreCase("com.amazon.testclient.iap.purchaseUpdates")) {
                a(intent);
            }
        } catch (Exception e) {
            Log.e(a, "Error handling response.", e);
        }
    }

    private Intent a(String str) {
        Intent intent = new Intent(str);
        intent.setComponent(new ComponentName("com.amazon.sdktestclient", "com.amazon.sdktestclient.command.CommandBroker"));
        return intent;
    }

    public void a(Object obj) {
        f.a(obj, "response");
        Context b2 = com.amazon.device.iap.internal.d.f().b();
        PurchasingListener a2 = com.amazon.device.iap.internal.d.f().a();
        if (b2 != null && a2 != null) {
            new Handler(b2.getMainLooper()).post(new 1(obj, a2));
            return;
        }
        com.amazon.device.iap.internal.util.b.a(a, "PurchasingListener is not set. Dropping response: " + obj);
    }

    private void a(Intent intent) throws JSONException {
        PurchaseUpdatesResponse b2 = b(intent);
        if (b2.getRequestStatus() == PurchaseUpdatesResponse.RequestStatus.SUCCESSFUL) {
            String optString = new JSONObject(intent.getStringExtra("purchaseUpdatesOutput")).optString("offset");
            Log.i(a, "Offset for PurchaseUpdatesResponse:" + optString);
            com.amazon.device.iap.internal.util.a.a(b2.getUserData().getUserId(), optString);
        }
        a(b2);
    }

    private Product a(String str, JSONObject jSONObject) throws JSONException {
        String str2;
        ProductType valueOf = ProductType.valueOf(jSONObject.optString("itemType"));
        JSONObject optJSONObject = jSONObject.optJSONObject("priceJson");
        if (optJSONObject == null || optJSONObject == JSONObject.NULL) {
            str2 = null;
        } else {
            Currency currency = Currency.getInstance(optJSONObject.optString("currency"));
            str2 = currency.getSymbol() + optJSONObject.optString("value");
        }
        String optString = jSONObject.optString("title");
        String optString2 = jSONObject.optString("description");
        String optString3 = jSONObject.optString("smallIconUrl");
        int optInt = jSONObject.optInt("coinsRewardAmount", 0);
        return new ProductBuilder().setSku(str).setProductType(valueOf).setDescription(optString2).setPrice(str2).setSmallIconUrl(optString3).setTitle(optString).setCoinsRewardAmount(optInt).setSubscriptionPeriod(jSONObject.isNull("term") ? null : jSONObject.getString("term")).setFreeTrialPeriod(jSONObject.isNull("freeTrialPeriod") ? null : jSONObject.getString("freeTrialPeriod")).setPromotions(jSONObject.isNull("promotions") ? null : a.a(jSONObject)).build();
    }

    private void a(String str, String str2, boolean z) {
        try {
            Context b2 = com.amazon.device.iap.internal.d.f().b();
            String a2 = com.amazon.device.iap.internal.util.a.a(str2);
            Log.i(a, "send PurchaseUpdates with user id:" + str2 + ";reset flag:" + z + ", local cursor:" + a2 + ", parsed from old requestId:" + str);
            Bundle bundle = new Bundle();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("requestId", str.toString());
            if (z) {
                a2 = null;
            }
            jSONObject.put("offset", a2);
            jSONObject.put("sdkVersion", "2.10.5.0");
            jSONObject.put("packageName", b2.getPackageName());
            bundle.putString("purchaseUpdatesInput", jSONObject.toString());
            Intent a3 = a("com.amazon.testclient.iap.purchaseUpdates");
            a3.addFlags(268435456);
            a3.putExtras(bundle);
            b2.startService(a3);
        } catch (JSONException unused) {
            com.amazon.device.iap.internal.util.b.b(a, "Error in sendPurchaseUpdatesRequest.");
        }
    }

    private Receipt a(JSONObject jSONObject) throws ParseException {
        String optString = jSONObject.optString("receiptId");
        String optString2 = jSONObject.optString("sku");
        ProductType valueOf = ProductType.valueOf(jSONObject.optString("itemType"));
        String optString3 = jSONObject.optString("purchaseDate");
        DateFormat dateFormat = b.ar;
        Date parse = dateFormat.parse(optString3);
        String optString4 = jSONObject.optString("cancelDate");
        Date parse2 = (optString4 == null || optString4.length() == 0) ? null : dateFormat.parse(optString4);
        String optString5 = jSONObject.optString("deferredDate");
        return new ReceiptBuilder().setReceiptId(optString).setSku(optString2).setProductType(valueOf).setPurchaseDate(parse).setCancelDate(parse2).setDeferredSku(jSONObject.optString("deferredSku", (String) null)).setDeferredDate((optString5 == null || optString5.length() == 0) ? null : dateFormat.parse(optString5)).setTermSku(jSONObject.optString("termSku", (String) null)).build();
    }
}
