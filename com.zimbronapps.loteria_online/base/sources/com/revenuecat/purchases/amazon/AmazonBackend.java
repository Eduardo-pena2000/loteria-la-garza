package com.revenuecat.purchases.amazon;

import Ca.I;
import Ca.q;
import Ca.x;
import Da.v;
import Qa.l;
import com.revenuecat.purchases.common.BackendHelper;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class AmazonBackend {
    private final BackendHelper backendHelper;
    private volatile Map postAmazonReceiptCallbacks;

    public AmazonBackend(BackendHelper backendHelper) {
        t.g(backendHelper, "backendHelper");
        this.backendHelper = backendHelper;
        this.postAmazonReceiptCallbacks = new LinkedHashMap();
    }

    public static final /* synthetic */ BackendHelper access$getBackendHelper$p(AmazonBackend amazonBackend) {
        return amazonBackend.backendHelper;
    }

    public final void getAmazonReceiptData(String str, String str2, l lVar, l lVar2) {
        t.g(str, "receiptId");
        t.g(str2, "storeUserID");
        t.g(lVar, "onSuccess");
        t.g(lVar2, "onError");
        List s = v.s(new String[]{str, str2});
        AmazonBackend$getAmazonReceiptData$call$1 amazonBackend$getAmazonReceiptData$call$1 = new AmazonBackend$getAmazonReceiptData$call$1(this, str2, str, s);
        q a = x.a(lVar, lVar2);
        synchronized (this) {
            try {
                if (this.postAmazonReceiptCallbacks.containsKey(s)) {
                    Object obj = this.postAmazonReceiptCallbacks.get(s);
                    t.d(obj);
                    ((List) obj).add(a);
                } else {
                    this.postAmazonReceiptCallbacks.put(s, v.t(new q[]{a}));
                    amazonBackend$getAmazonReceiptData$call$1.invoke();
                    I i = I.a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized Map getPostAmazonReceiptCallbacks() {
        return this.postAmazonReceiptCallbacks;
    }

    public final synchronized void setPostAmazonReceiptCallbacks(Map map) {
        t.g(map, "<set-?>");
        this.postAmazonReceiptCallbacks = map;
    }
}
