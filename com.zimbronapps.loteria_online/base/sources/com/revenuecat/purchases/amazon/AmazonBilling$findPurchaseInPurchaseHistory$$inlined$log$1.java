package com.revenuecat.purchases.amazon;

import Da.D;
import Qa.l;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.common.LogIntent;
import java.util.Arrays;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class AmazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1 extends u implements Qa.a {
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ String $productId$inlined;
    final /* synthetic */ ProductType $productType$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1(LogIntent logIntent, String str, ProductType productType) {
        super(0);
        this.$intent = logIntent;
        this.$productId$inlined = str;
        this.$productType$inlined = productType;
    }

    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(D.n0(this.$intent.getEmojiList(), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null));
        sb.append(' ');
        String format = String.format("Querying Purchase with %s and type %s", Arrays.copyOf(new Object[]{this.$productId$inlined, this.$productType$inlined.name()}, 2));
        t.f(format, "format(...)");
        sb.append(format);
        return sb.toString();
    }
}
