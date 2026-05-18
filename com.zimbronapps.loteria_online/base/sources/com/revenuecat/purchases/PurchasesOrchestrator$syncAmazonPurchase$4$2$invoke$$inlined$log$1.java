package com.revenuecat.purchases;

import Da.D;
import com.revenuecat.purchases.common.LogIntent;
import java.util.Arrays;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PurchasesOrchestrator$syncAmazonPurchase$4$2$invoke$$inlined$log$1 extends u implements Qa.a {
    final /* synthetic */ String $amazonUserID$inlined;
    final /* synthetic */ PurchasesError $error$inlined;
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ String $receiptID$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesOrchestrator$syncAmazonPurchase$4$2$invoke$$inlined$log$1(LogIntent logIntent, String str, String str2, PurchasesError purchasesError) {
        super(0);
        this.$intent = logIntent;
        this.$receiptID$inlined = str;
        this.$amazonUserID$inlined = str2;
        this.$error$inlined = purchasesError;
    }

    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(D.n0(this.$intent.getEmojiList(), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Qa.l) null, 62, (Object) null));
        sb.append(' ');
        String format = String.format("Error syncing purchase %s for store user ID %s. Error: %s", Arrays.copyOf(new Object[]{this.$receiptID$inlined, this.$amazonUserID$inlined, this.$error$inlined}, 3));
        t.f(format, "format(...)");
        sb.append(format);
        return sb.toString();
    }
}
