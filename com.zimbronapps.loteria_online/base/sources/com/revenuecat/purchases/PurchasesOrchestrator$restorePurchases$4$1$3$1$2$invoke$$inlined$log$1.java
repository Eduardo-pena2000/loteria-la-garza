package com.revenuecat.purchases;

import Da.D;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.Arrays;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PurchasesOrchestrator$restorePurchases$4$1$3$1$2$invoke$$inlined$log$1 extends u implements Qa.a {
    final /* synthetic */ PurchasesError $error$inlined;
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ StoreTransaction $purchase$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesOrchestrator$restorePurchases$4$1$3$1$2$invoke$$inlined$log$1(LogIntent logIntent, StoreTransaction storeTransaction, PurchasesError purchasesError) {
        super(0);
        this.$intent = logIntent;
        this.$purchase$inlined = storeTransaction;
        this.$error$inlined = purchasesError;
    }

    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(D.n0(this.$intent.getEmojiList(), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Qa.l) null, 62, (Object) null));
        sb.append(' ');
        String format = String.format("Error restoring purchase: %s. Error: %s", Arrays.copyOf(new Object[]{this.$purchase$inlined, this.$error$inlined}, 2));
        t.f(format, "format(...)");
        sb.append(format);
        return sb.toString();
    }
}
