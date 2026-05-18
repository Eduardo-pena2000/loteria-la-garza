package com.amazon.device.iap.internal.a;

import android.content.Context;
import android.os.Handler;
import com.amazon.a.a.n.a.h;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserDataResponse;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class c extends com.amazon.a.a.j.a {
    private static final String c = "c";
    private RequestId d;

    public class 1 implements Runnable {
        final /* synthetic */ Object a;
        final /* synthetic */ PurchasingListener b;
        final /* synthetic */ h c;

        public 1(Object obj, PurchasingListener purchasingListener, h hVar) {
            this.a = obj;
            this.b = purchasingListener;
            this.c = hVar;
        }

        public void run() {
            c.this.a().a("notifyListenerResult", Boolean.FALSE);
            try {
                Object obj = this.a;
                if (obj instanceof ProductDataResponse) {
                    this.b.onProductDataResponse((ProductDataResponse) obj);
                } else if (obj instanceof UserDataResponse) {
                    this.b.onUserDataResponse((UserDataResponse) obj);
                } else if (obj instanceof PurchaseUpdatesResponse) {
                    PurchaseUpdatesResponse purchaseUpdatesResponse = (PurchaseUpdatesResponse) obj;
                    this.b.onPurchaseUpdatesResponse(purchaseUpdatesResponse);
                    Object a = c.this.a().a("newCursor");
                    if (a != null && (a instanceof String)) {
                        com.amazon.device.iap.internal.util.a.a(purchaseUpdatesResponse.getUserData().getUserId(), a.toString());
                    }
                } else if (obj instanceof PurchaseResponse) {
                    this.b.onPurchaseResponse((PurchaseResponse) obj);
                } else {
                    com.amazon.device.iap.internal.util.b.b(c.f(), "Unknown response type:" + this.a.getClass().getName());
                }
                c.this.a().a("notifyListenerResult", Boolean.TRUE);
            } catch (Throwable th) {
                com.amazon.device.iap.internal.util.b.b(c.f(), "Error in sendResponse: " + th);
            }
            h hVar = this.c;
            if (hVar != null) {
                hVar.a(true);
                this.c.l();
            }
        }
    }

    public c(RequestId requestId) {
        this.d = requestId;
    }

    public static /* synthetic */ String f() {
        return c;
    }

    public void a(h hVar) {
        this.b = hVar;
    }

    public void b() {
    }

    public void c() {
    }

    public RequestId d() {
        return this.d;
    }

    public void e() {
        h hVar = this.b;
        if (hVar != null) {
            hVar.l();
        } else {
            b();
        }
    }

    public void a(Object obj) {
        a(obj, null);
    }

    public void a(Object obj, h hVar) {
        com.amazon.a.a.o.f.a(obj, "response");
        Context b = com.amazon.device.iap.internal.d.f().b();
        PurchasingListener a = com.amazon.device.iap.internal.d.f().a();
        if (b != null && a != null) {
            new Handler(b.getMainLooper()).post(new 1(obj, a, hVar));
            return;
        }
        com.amazon.device.iap.internal.util.b.a(c, "PurchasingListener is not set. Dropping response: " + obj);
    }

    public com.amazon.a.a.j.b a() {
        return this.a;
    }
}
