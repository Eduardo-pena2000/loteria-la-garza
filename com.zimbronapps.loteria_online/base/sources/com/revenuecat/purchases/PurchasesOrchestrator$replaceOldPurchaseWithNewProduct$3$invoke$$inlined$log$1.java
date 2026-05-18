package com.revenuecat.purchases;

import Da.D;
import com.revenuecat.purchases.common.LogIntent;
import java.util.Arrays;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PurchasesOrchestrator$replaceOldPurchaseWithNewProduct$3$invoke$$inlined$log$1 extends u implements Qa.a {
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ O $previousProductId$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesOrchestrator$replaceOldPurchaseWithNewProduct$3$invoke$$inlined$log$1(LogIntent logIntent, O o) {
        super(0);
        this.$intent = logIntent;
        this.$previousProductId$inlined = o;
    }

    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(D.n0(this.$intent.getEmojiList(), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Qa.l) null, 62, (Object) null));
        sb.append(' ');
        String format = String.format("Found existing purchase for SKU: %s", Arrays.copyOf(new Object[]{this.$previousProductId$inlined.a}, 1));
        t.f(format, "format(...)");
        sb.append(format);
        return sb.toString();
    }
}
