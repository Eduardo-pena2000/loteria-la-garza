package com.revenuecat.purchases.virtualcurrencies;

import Da.D;
import Qa.a;
import com.revenuecat.purchases.common.LogIntent;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VirtualCurrencyManager$virtualCurrencies$$inlined$log$1 extends u implements a {
    final /* synthetic */ LogIntent $intent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VirtualCurrencyManager$virtualCurrencies$$inlined$log$1(LogIntent logIntent) {
        super(0);
        this.$intent = logIntent;
    }

    public final String invoke() {
        return D.n0(this.$intent.getEmojiList(), "", null, null, 0, null, null, 62, null) + " Vending VirtualCurrencies from cache.";
    }
}
