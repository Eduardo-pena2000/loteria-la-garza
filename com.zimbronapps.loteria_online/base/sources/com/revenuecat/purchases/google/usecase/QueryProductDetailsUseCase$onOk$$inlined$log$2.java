package com.revenuecat.purchases.google.usecase;

import Da.D;
import Qa.l;
import com.android.billingclient.api.QueryProductDetailsResult;
import com.revenuecat.purchases.common.LogIntent;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class QueryProductDetailsUseCase$onOk$$inlined$log$2 extends u implements Qa.a {
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ QueryProductDetailsResult $received$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryProductDetailsUseCase$onOk$$inlined$log$2(LogIntent logIntent, QueryProductDetailsResult queryProductDetailsResult) {
        super(0);
        this.$intent = logIntent;
        this.$received$inlined = queryProductDetailsResult;
    }

    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(D.n0(this.$intent.getEmojiList(), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null));
        sb.append(' ');
        List productDetailsList = this.$received$inlined.getProductDetailsList();
        t.f(productDetailsList, "received.productDetailsList");
        String format = String.format("Retrieved productDetailsList: %s", Arrays.copyOf(new Object[]{D.n0(productDetailsList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, QueryProductDetailsUseCase$onOk$2$1.INSTANCE, 31, (Object) null)}, 1));
        t.f(format, "format(...)");
        sb.append(format);
        return sb.toString();
    }
}
