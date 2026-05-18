package com.revenuecat.purchases;

import Da.D;
import com.revenuecat.purchases.common.LogIntent;
import java.util.Arrays;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PurchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$$inlined$log$1 extends u implements Qa.a {
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ PurchasesOrchestrator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$$inlined$log$1(LogIntent logIntent, PurchasesOrchestrator purchasesOrchestrator) {
        super(0);
        this.$intent = logIntent;
        this.this$0 = purchasesOrchestrator;
    }

    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(D.n0(this.$intent.getEmojiList(), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Qa.l) null, 62, (Object) null));
        sb.append(' ');
        String format = String.format("Sync attributes and offerings rate limit reached: %d per %d seconds. Returning offerings from cache", Arrays.copyOf(new Object[]{Integer.valueOf(PurchasesOrchestrator.access$getLastSyncAttributesAndOfferingsRateLimiter$p(this.this$0).getMaxCallsInPeriod()), Long.valueOf(ab.b.s(PurchasesOrchestrator.access$getLastSyncAttributesAndOfferingsRateLimiter$p(this.this$0).getPeriodSeconds-UwyO8pc()))}, 2));
        t.f(format, "format(...)");
        sb.append(format);
        return sb.toString();
    }
}
