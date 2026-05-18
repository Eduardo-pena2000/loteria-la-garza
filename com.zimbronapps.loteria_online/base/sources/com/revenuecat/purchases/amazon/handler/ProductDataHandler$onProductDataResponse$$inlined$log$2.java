package com.revenuecat.purchases.amazon.handler;

import Da.D;
import Qa.l;
import com.amazon.device.iap.model.ProductDataResponse;
import com.revenuecat.purchases.common.LogIntent;
import java.util.Arrays;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ProductDataHandler$onProductDataResponse$$inlined$log$2 extends u implements Qa.a {
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ ProductDataResponse $response$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDataHandler$onProductDataResponse$$inlined$log$2(LogIntent logIntent, ProductDataResponse productDataResponse) {
        super(0);
        this.$intent = logIntent;
        this.$response$inlined = productDataResponse;
    }

    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(D.n0(this.$intent.getEmojiList(), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null));
        sb.append(' ');
        String format = String.format("Unavailable products: %s", Arrays.copyOf(new Object[]{this.$response$inlined.getUnavailableSkus()}, 1));
        t.f(format, "format(...)");
        sb.append(format);
        return sb.toString();
    }
}
