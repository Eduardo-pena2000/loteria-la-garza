package com.revenuecat.purchases.amazon.handler;

import Da.D;
import Qa.l;
import com.amazon.device.iap.model.PurchaseResponse;
import com.revenuecat.purchases.common.LogIntent;
import java.util.Arrays;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PurchaseHandler$onPurchaseResponse$$inlined$log$1 extends u implements Qa.a {
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ PurchaseResponse $response$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseHandler$onPurchaseResponse$$inlined$log$1(LogIntent logIntent, PurchaseResponse purchaseResponse) {
        super(0);
        this.$intent = logIntent;
        this.$response$inlined = purchaseResponse;
    }

    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(D.n0(this.$intent.getEmojiList(), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null));
        sb.append(' ');
        String format = String.format("Purchase request finished: \n %s", Arrays.copyOf(new Object[]{this.$response$inlined.toJSON().toString(1)}, 1));
        t.f(format, "format(...)");
        sb.append(format);
        return sb.toString();
    }
}
