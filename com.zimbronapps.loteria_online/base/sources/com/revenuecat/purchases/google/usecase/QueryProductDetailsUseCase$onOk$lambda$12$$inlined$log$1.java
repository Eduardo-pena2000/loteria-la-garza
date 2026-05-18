package com.revenuecat.purchases.google.usecase;

import Da.D;
import Qa.l;
import com.android.billingclient.api.UnfetchedProduct;
import com.revenuecat.purchases.common.LogIntent;
import java.util.Arrays;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class QueryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1 extends u implements Qa.a {
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ UnfetchedProduct $it$inlined;
    final /* synthetic */ QueryProductDetailsUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1(LogIntent logIntent, UnfetchedProduct unfetchedProduct, QueryProductDetailsUseCase queryProductDetailsUseCase) {
        super(0);
        this.$intent = logIntent;
        this.$it$inlined = unfetchedProduct;
        this.this$0 = queryProductDetailsUseCase;
    }

    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(D.n0(this.$intent.getEmojiList(), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null));
        sb.append(' ');
        String format = String.format("Product not found: %s - Product Type: %s, Reason: %s, Serialized doc ID: %s", Arrays.copyOf(new Object[]{this.$it$inlined.getProductId(), this.$it$inlined.getProductType(), QueryProductDetailsUseCase.access$convertUnfetchedProductStatusCodeToString(this.this$0, this.$it$inlined.getStatusCode()), this.$it$inlined.getSerializedDocid()}, 4));
        t.f(format, "format(...)");
        sb.append(format);
        return sb.toString();
    }
}
