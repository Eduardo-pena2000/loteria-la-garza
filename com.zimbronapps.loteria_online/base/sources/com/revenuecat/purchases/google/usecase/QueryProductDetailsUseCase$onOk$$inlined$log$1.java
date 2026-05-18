package com.revenuecat.purchases.google.usecase;

import Da.D;
import Qa.l;
import com.revenuecat.purchases.common.LogIntent;
import java.util.Arrays;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class QueryProductDetailsUseCase$onOk$$inlined$log$1 extends u implements Qa.a {
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ QueryProductDetailsUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryProductDetailsUseCase$onOk$$inlined$log$1(LogIntent logIntent, QueryProductDetailsUseCase queryProductDetailsUseCase) {
        super(0);
        this.$intent = logIntent;
        this.this$0 = queryProductDetailsUseCase;
    }

    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(D.n0(this.$intent.getEmojiList(), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null));
        sb.append(' ');
        String format = String.format("Products request finished for %s", Arrays.copyOf(new Object[]{D.n0(QueryProductDetailsUseCase.access$getUseCaseParams$p(this.this$0).getProductIds(), (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 63, (Object) null)}, 1));
        t.f(format, "format(...)");
        sb.append(format);
        return sb.toString();
    }
}
