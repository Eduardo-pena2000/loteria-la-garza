package com.revenuecat.purchases;

import Ca.I;
import com.revenuecat.purchases.interfaces.GetStorefrontCallback;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PurchasesOrchestrator$getStorefrontCountryCode$2$1 extends u implements Qa.l {
    final /* synthetic */ GetStorefrontCallback $callback;
    final /* synthetic */ PurchasesOrchestrator $this_run;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesOrchestrator$getStorefrontCountryCode$2$1(PurchasesOrchestrator purchasesOrchestrator, GetStorefrontCallback getStorefrontCallback) {
        super(1);
        this.$this_run = purchasesOrchestrator;
        this.$callback = getStorefrontCallback;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return I.a;
    }

    public final void invoke(String str) {
        t.g(str, "countryCode");
        PurchasesOrchestrator.access$setStorefrontCountryCode$p(this.$this_run, str);
        this.$callback.onReceived(str);
    }
}
