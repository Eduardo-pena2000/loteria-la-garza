package com.amazon.device.iap.internal.a;

import android.content.Context;
import android.content.Intent;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserDataRequest;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class d implements com.amazon.device.iap.internal.e {
    private static final String a = "d";
    private static final String b = "response_type";
    private static final String c = "requestId";
    private static final String d = "purchase_response";

    public void a(RequestId requestId, UserDataRequest userDataRequest) {
        com.amazon.device.iap.internal.util.b.a(a, "sendGetUserData");
        new com.amazon.device.iap.internal.a.c.a(requestId, userDataRequest).e();
    }

    public void a(RequestId requestId, String str) {
        com.amazon.device.iap.internal.util.b.a(a, "sendPurchaseRequest");
        new com.amazon.device.iap.internal.a.e.d(requestId, str).e();
    }

    public void a(RequestId requestId, Set set) {
        com.amazon.device.iap.internal.util.b.a(a, "sendGetProductDataRequest");
        new com.amazon.device.iap.internal.a.a.d(requestId, set).e();
    }

    public void a(RequestId requestId, boolean z) {
        com.amazon.device.iap.internal.util.b.a(a, "sendGetPurchaseUpdates");
        new com.amazon.device.iap.internal.a.b.a(requestId, z).e();
    }

    public void a(RequestId requestId, String str, FulfillmentResult fulfillmentResult) {
        com.amazon.device.iap.internal.util.b.a(a, "sendNotifyFulfillment");
        new com.amazon.device.iap.internal.a.d.a(requestId, str, fulfillmentResult).e();
    }

    public void a(Context context, Intent intent) {
        String str = a;
        com.amazon.device.iap.internal.util.b.a(str, "handleResponse");
        String stringExtra = intent.getStringExtra("response_type");
        if (stringExtra == null) {
            com.amazon.device.iap.internal.util.b.a(str, "Invalid response type: null");
            return;
        }
        com.amazon.device.iap.internal.util.b.a(str, "Found response type: " + stringExtra);
        if ("purchase_response".equals(stringExtra)) {
            new com.amazon.device.iap.internal.a.f.d(RequestId.fromString(intent.getStringExtra("requestId"))).e();
        }
    }
}
