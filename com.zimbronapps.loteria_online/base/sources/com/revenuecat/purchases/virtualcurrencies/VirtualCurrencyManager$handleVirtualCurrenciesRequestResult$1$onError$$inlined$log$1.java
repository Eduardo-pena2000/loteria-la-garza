package com.revenuecat.purchases.virtualcurrencies;

import Da.D;
import Qa.a;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.LogIntent;
import java.util.Arrays;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VirtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onError$$inlined$log$1 extends u implements a {
    final /* synthetic */ PurchasesError $error$inlined;
    final /* synthetic */ LogIntent $intent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VirtualCurrencyManager$handleVirtualCurrenciesRequestResult$1$onError$$inlined$log$1(LogIntent logIntent, PurchasesError purchasesError) {
        super(0);
        this.$intent = logIntent;
        this.$error$inlined = purchasesError;
    }

    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(D.n0(this.$intent.getEmojiList(), "", null, null, 0, null, null, 62, null));
        sb.append(' ');
        String format = String.format("Attempt to update VirtualCurrencies from network failed. Error: %s", Arrays.copyOf(new Object[]{this.$error$inlined}, 1));
        t.f(format, "format(...)");
        sb.append(format);
        return sb.toString();
    }
}
