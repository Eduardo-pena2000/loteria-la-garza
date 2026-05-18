package com.revenuecat.purchases.google;

import Ca.I;
import Qa.l;
import com.revenuecat.purchases.ProductType;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class BillingWrapper$getPurchaseType$1 extends u implements l {
    final /* synthetic */ l $listener;
    final /* synthetic */ String $purchaseToken;
    final /* synthetic */ BillingWrapper this$0;

    public static final class 1 extends u implements l {
        final /* synthetic */ l $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(l lVar) {
            super(1);
            this.$listener = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return I.a;
        }

        public final void invoke(boolean z) {
            if (z) {
                this.$listener.invoke(ProductType.INAPP);
            } else {
                this.$listener.invoke(ProductType.UNKNOWN);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingWrapper$getPurchaseType$1(l lVar, BillingWrapper billingWrapper, String str) {
        super(1);
        this.$listener = lVar;
        this.this$0 = billingWrapper;
        this.$purchaseToken = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return I.a;
    }

    public final void invoke(boolean z) {
        if (z) {
            this.$listener.invoke(ProductType.SUBS);
            return;
        }
        BillingWrapper billingWrapper = this.this$0;
        String str = this.$purchaseToken;
        l lVar = this.$listener;
        BillingWrapper.access$queryPurchaseType(billingWrapper, "inapp", str, lVar, new 1(lVar));
    }
}
