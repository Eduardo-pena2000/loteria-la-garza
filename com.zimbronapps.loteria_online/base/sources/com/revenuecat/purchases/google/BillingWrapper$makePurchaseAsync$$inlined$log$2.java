package com.revenuecat.purchases.google;

import Da.D;
import Qa.l;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.models.GooglePurchasingData;
import java.util.Arrays;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class BillingWrapper$makePurchaseAsync$$inlined$log$2 extends u implements Qa.a {
    final /* synthetic */ GooglePurchasingData $googlePurchasingData$inlined;
    final /* synthetic */ LogIntent $intent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingWrapper$makePurchaseAsync$$inlined$log$2(LogIntent logIntent, GooglePurchasingData googlePurchasingData) {
        super(0);
        this.$intent = logIntent;
        this.$googlePurchasingData$inlined = googlePurchasingData;
    }

    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(D.n0(this.$intent.getEmojiList(), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null));
        sb.append(' ');
        String format = String.format("Purchasing product: %s", Arrays.copyOf(new Object[]{this.$googlePurchasingData$inlined.getProductId()}, 1));
        t.f(format, "format(...)");
        sb.append(format);
        return sb.toString();
    }
}
