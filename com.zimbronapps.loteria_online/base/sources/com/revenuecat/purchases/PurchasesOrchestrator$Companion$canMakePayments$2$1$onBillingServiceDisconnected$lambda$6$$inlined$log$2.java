package com.revenuecat.purchases;

import Da.D;
import com.revenuecat.purchases.common.LogIntent;
import java.util.Arrays;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PurchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$2 extends u implements Qa.a {
    final /* synthetic */ IllegalArgumentException $e$inlined;
    final /* synthetic */ LogIntent $intent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$2(LogIntent logIntent, IllegalArgumentException illegalArgumentException) {
        super(0);
        this.$intent = logIntent;
        this.$e$inlined = illegalArgumentException;
    }

    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(D.n0(this.$intent.getEmojiList(), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Qa.l) null, 62, (Object) null));
        sb.append(' ');
        String format = String.format("Exception received when checking if device can make payments: \n%s.", Arrays.copyOf(new Object[]{this.$e$inlined.getLocalizedMessage()}, 1));
        t.f(format, "format(...)");
        sb.append(format);
        return sb.toString();
    }
}
