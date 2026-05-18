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
public final class QueryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1 extends u implements Qa.a {
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ QueryProductDetailsResult $received$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1(LogIntent logIntent, QueryProductDetailsResult queryProductDetailsResult) {
        super(0);
        this.$intent = logIntent;
        this.$received$inlined = queryProductDetailsResult;
    }

    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(D.n0(this.$intent.getEmojiList(), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null));
        sb.append(' ');
        List unfetchedProductList = this.$received$inlined.getUnfetchedProductList();
        t.f(unfetchedProductList, "received.unfetchedProductList");
        String format = String.format("Missing productDetails: %s", Arrays.copyOf(new Object[]{D.n0(unfetchedProductList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, QueryProductDetailsUseCase$onOk$4$1$1.INSTANCE, 31, (Object) null)}, 1));
        t.f(format, "format(...)");
        sb.append(format);
        return sb.toString();
    }
}
