package com.amazon.device.iap.internal;

import android.content.Context;
import android.content.Intent;
import com.amazon.a.a.o.f;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserDataRequest;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class d {
    private static String a = "d";
    private static String b = "sku";
    private static d c = new d();
    private e d;
    private Context e;
    private PurchasingListener f;
    private boolean g = false;

    private d() {
    }

    public static d f() {
        return c;
    }

    private void g() {
        if (this.f == null) {
            throw new IllegalStateException("You must register a PurchasingListener before invoking this operation");
        }
    }

    public PurchasingListener a() {
        return this.f;
    }

    public Context b() {
        return this.e;
    }

    public void c() {
        this.g = true;
    }

    public boolean d() {
        return this.g;
    }

    public boolean e() {
        g();
        return com.amazon.a.a.a(this.e.getApplicationContext());
    }

    public void a(Context context, PurchasingListener purchasingListener) {
        com.amazon.device.iap.internal.util.b.a(a, "PurchasingListener registered: " + purchasingListener);
        com.amazon.device.iap.internal.util.b.a(a, "PurchasingListener Context: " + context);
        if (purchasingListener == null || context == null) {
            throw new IllegalArgumentException("Neither PurchasingListener or its Context can be null");
        }
        this.e = context.getApplicationContext();
        e a2 = b.a().a(this.e);
        this.d = a2;
        if (a2 == null) {
            com.amazon.device.iap.internal.util.b.a(a, "requestHandler is null");
        }
        this.f = purchasingListener;
    }

    public RequestId a(UserDataRequest userDataRequest) {
        g();
        RequestId requestId = new RequestId();
        this.d.a(requestId, userDataRequest);
        return requestId;
    }

    public RequestId a(String str) {
        f.a((Object) str, b);
        g();
        RequestId requestId = new RequestId();
        this.d.a(requestId, str);
        return requestId;
    }

    public RequestId a(Set set) {
        f.a(set, "skus");
        f.a((Collection) set, "skus");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).trim().length() == 0) {
                throw new IllegalArgumentException("Empty SKU values are not allowed");
            }
        }
        if (set.size() <= 100) {
            g();
            RequestId requestId = new RequestId();
            this.d.a(requestId, new LinkedHashSet(set));
            return requestId;
        }
        throw new IllegalArgumentException(set.size() + " SKUs were provided, but no more than 100 SKUs are allowed");
    }

    public RequestId a(boolean z) {
        g();
        RequestId requestId = new RequestId();
        this.d.a(requestId, z);
        return requestId;
    }

    public void a(String str, FulfillmentResult fulfillmentResult) {
        if (!f.a(str)) {
            f.a(fulfillmentResult, "fulfillmentResult");
            g();
            this.d.a(new RequestId(), str, fulfillmentResult);
            return;
        }
        throw new IllegalArgumentException("Empty receiptId is not allowed");
    }

    public void a(Context context, Intent intent) {
        try {
            this.d.a(context, intent);
        } catch (Exception e) {
            com.amazon.device.iap.internal.util.b.b(a, "Error in onReceive: " + e);
        }
    }
}
