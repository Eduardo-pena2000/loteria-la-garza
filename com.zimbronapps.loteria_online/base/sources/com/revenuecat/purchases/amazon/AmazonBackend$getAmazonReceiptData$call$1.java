package com.revenuecat.purchases.amazon;

import Ca.I;
import Ca.q;
import Qa.l;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.Delay;
import com.revenuecat.purchases.common.networking.Endpoint;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class AmazonBackend$getAmazonReceiptData$call$1 extends u implements Qa.a {
    final /* synthetic */ List $cacheKey;
    final /* synthetic */ String $receiptId;
    final /* synthetic */ String $storeUserID;
    final /* synthetic */ AmazonBackend this$0;

    public static final class 1 extends u implements l {
        final /* synthetic */ List $cacheKey;
        final /* synthetic */ AmazonBackend this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(AmazonBackend amazonBackend, List list) {
            super(1);
            this.this$0 = amazonBackend;
            this.$cacheKey = list;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return I.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            List list;
            t.g(purchasesError, "error");
            AmazonBackend amazonBackend = this.this$0;
            List list2 = this.$cacheKey;
            synchronized (amazonBackend) {
                list = (List) amazonBackend.getPostAmazonReceiptCallbacks().remove(list2);
            }
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((l) ((q) it.next()).b()).invoke(purchasesError);
                }
            }
        }
    }

    public static final class 2 extends u implements Qa.q {
        final /* synthetic */ List $cacheKey;
        final /* synthetic */ AmazonBackend this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(AmazonBackend amazonBackend, List list) {
            super(3);
            this.this$0 = amazonBackend;
            this.$cacheKey = list;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((PurchasesError) obj, ((Number) obj2).intValue(), (JSONObject) obj3);
            return I.a;
        }

        public final void invoke(PurchasesError purchasesError, int i, JSONObject jSONObject) {
            List<q> list;
            t.g(jSONObject, "body");
            AmazonBackend amazonBackend = this.this$0;
            List list2 = this.$cacheKey;
            synchronized (amazonBackend) {
                list = (List) amazonBackend.getPostAmazonReceiptCallbacks().remove(list2);
            }
            if (list != null) {
                for (q qVar : list) {
                    l lVar = (l) qVar.a();
                    l lVar2 = (l) qVar.b();
                    if (purchasesError != null) {
                        lVar2.invoke(purchasesError);
                    } else {
                        lVar.invoke(jSONObject);
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmazonBackend$getAmazonReceiptData$call$1(AmazonBackend amazonBackend, String str, String str2, List list) {
        super(0);
        this.this$0 = amazonBackend;
        this.$storeUserID = str;
        this.$receiptId = str2;
        this.$cacheKey = list;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        invoke();
        return I.a;
    }

    public final void invoke() {
        AmazonBackend.access$getBackendHelper$p(this.this$0).performRequest(new Endpoint.GetAmazonReceipt(this.$storeUserID, this.$receiptId), null, null, Delay.NONE, new 1(this.this$0, this.$cacheKey), new 2(this.this$0, this.$cacheKey));
    }
}
