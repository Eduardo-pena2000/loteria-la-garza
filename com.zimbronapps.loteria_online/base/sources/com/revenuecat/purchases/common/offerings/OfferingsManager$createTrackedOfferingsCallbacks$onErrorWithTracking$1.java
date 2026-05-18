package com.revenuecat.purchases.common.offerings;

import Ca.I;
import Qa.l;
import Qa.p;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import java.util.Date;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class OfferingsManager$createTrackedOfferingsCallbacks$onErrorWithTracking$1 extends u implements p {
    final /* synthetic */ l $onError;
    final /* synthetic */ Date $startTime;
    final /* synthetic */ OfferingsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferingsManager$createTrackedOfferingsCallbacks$onErrorWithTracking$1(OfferingsManager offeringsManager, Date date, l lVar) {
        super(2);
        this.this$0 = offeringsManager;
        this.$startTime = date;
        this.$onError = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((PurchasesError) obj, (DiagnosticsTracker.CacheStatus) obj2);
        return I.a;
    }

    public final void invoke(PurchasesError purchasesError, DiagnosticsTracker.CacheStatus cacheStatus) {
        t.g(purchasesError, "error");
        t.g(cacheStatus, "cacheStatus");
        OfferingsManager.access$trackGetOfferingsResultIfNeeded(this.this$0, this.$startTime, cacheStatus, purchasesError, null, null);
        l lVar = this.$onError;
        if (lVar != null) {
            lVar.invoke(purchasesError);
        }
    }
}
