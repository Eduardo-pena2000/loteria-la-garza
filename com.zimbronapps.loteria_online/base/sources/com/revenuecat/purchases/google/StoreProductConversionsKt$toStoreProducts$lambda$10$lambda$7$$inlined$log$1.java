package com.revenuecat.purchases.google;

import Da.D;
import Qa.l;
import com.android.billingclient.api.ProductDetails;
import com.revenuecat.purchases.common.LogIntent;
import java.util.Arrays;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class StoreProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1 extends u implements Qa.a {
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ ProductDetails $productDetails$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoreProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1(LogIntent logIntent, ProductDetails productDetails) {
        super(0);
        this.$intent = logIntent;
        this.$productDetails$inlined = productDetails;
    }

    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(D.n0(this.$intent.getEmojiList(), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null));
        sb.append(' ');
        String format = String.format("Error finding a price for %s.", Arrays.copyOf(new Object[]{this.$productDetails$inlined.getProductId()}, 1));
        t.f(format, "format(...)");
        sb.append(format);
        return sb.toString();
    }
}
