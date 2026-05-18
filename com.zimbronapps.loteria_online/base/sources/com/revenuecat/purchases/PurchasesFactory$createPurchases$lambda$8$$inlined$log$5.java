package com.revenuecat.purchases;

import Da.D;
import com.revenuecat.purchases.common.LogIntent;
import java.util.Arrays;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PurchasesFactory$createPurchases$lambda$8$$inlined$log$5 extends u implements Qa.a {
    final /* synthetic */ PurchasesConfiguration $configuration$inlined;
    final /* synthetic */ LogIntent $intent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesFactory$createPurchases$lambda$8$$inlined$log$5(LogIntent logIntent, PurchasesConfiguration purchasesConfiguration) {
        super(0);
        this.$intent = logIntent;
        this.$configuration$inlined = purchasesConfiguration;
    }

    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(D.n0(this.$intent.getEmojiList(), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Qa.l) null, 62, (Object) null));
        sb.append(' ');
        String format = String.format("Purchases configured with response verification: %s", Arrays.copyOf(new Object[]{this.$configuration$inlined.getVerificationMode().name()}, 1));
        t.f(format, "format(...)");
        sb.append(format);
        return sb.toString();
    }
}
