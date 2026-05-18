package com.revenuecat.purchases.amazon.handler;

import Da.D;
import Qa.l;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.models.StoreProduct;
import java.util.Arrays;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PurchaseHandler$purchase$$inlined$log$1 extends u implements Qa.a {
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ StoreProduct $storeProduct$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseHandler$purchase$$inlined$log$1(LogIntent logIntent, StoreProduct storeProduct) {
        super(0);
        this.$intent = logIntent;
        this.$storeProduct$inlined = storeProduct;
    }

    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(D.n0(this.$intent.getEmojiList(), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null));
        sb.append(' ');
        String format = String.format("Purchasing product: %s", Arrays.copyOf(new Object[]{this.$storeProduct$inlined.getId()}, 1));
        t.f(format, "format(...)");
        sb.append(format);
        return sb.toString();
    }
}
