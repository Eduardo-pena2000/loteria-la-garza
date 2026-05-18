package com.revenuecat.purchases.amazon;

import Da.D;
import Qa.l;
import com.amazon.device.iap.model.Product;
import com.revenuecat.purchases.common.LogIntent;
import java.util.Arrays;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class StoreProductConversionsKt$toStoreProduct$$inlined$log$1 extends u implements Qa.a {
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ Product $this_toStoreProduct$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoreProductConversionsKt$toStoreProduct$$inlined$log$1(LogIntent logIntent, Product product) {
        super(0);
        this.$intent = logIntent;
        this.$this_toStoreProduct$inlined = product;
    }

    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(D.n0(this.$intent.getEmojiList(), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null));
        sb.append(' ');
        String format = String.format("Product %s is missing a price. This is common if you're trying to load a product SKU instead of a subscription term SKU. Make sure you configure the subscription term SKUs in the RevenueCat dashboard.", Arrays.copyOf(new Object[]{this.$this_toStoreProduct$inlined.getSku()}, 1));
        t.f(format, "format(...)");
        sb.append(format);
        return sb.toString();
    }
}
