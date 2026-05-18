package com.revenuecat.purchases;

import Da.D;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.models.PurchasingData;
import java.util.Arrays;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PurchasesOrchestrator$startPurchase$$inlined$log$1 extends u implements Qa.a {
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ PresentedOfferingContext $presentedOfferingContext$inlined;
    final /* synthetic */ PurchasingData $purchasingData$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesOrchestrator$startPurchase$$inlined$log$1(LogIntent logIntent, PurchasingData purchasingData, PresentedOfferingContext presentedOfferingContext) {
        super(0);
        this.$intent = logIntent;
        this.$purchasingData$inlined = purchasingData;
        this.$presentedOfferingContext$inlined = presentedOfferingContext;
    }

    public final String invoke() {
        String str;
        String offeringIdentifier;
        StringBuilder sb = new StringBuilder();
        sb.append(D.n0(this.$intent.getEmojiList(), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Qa.l) null, 62, (Object) null));
        sb.append(' ');
        StringBuilder sb2 = new StringBuilder();
        sb2.append(' ');
        sb2.append(this.$purchasingData$inlined);
        sb2.append(' ');
        PresentedOfferingContext presentedOfferingContext = this.$presentedOfferingContext$inlined;
        if (presentedOfferingContext == null || (offeringIdentifier = presentedOfferingContext.getOfferingIdentifier()) == null) {
            str = null;
        } else {
            str = " - offering: " + offeringIdentifier;
        }
        sb2.append(str);
        String format = String.format("Purchase started - product: %s", Arrays.copyOf(new Object[]{sb2.toString()}, 1));
        t.f(format, "format(...)");
        sb.append(format);
        return sb.toString();
    }
}
