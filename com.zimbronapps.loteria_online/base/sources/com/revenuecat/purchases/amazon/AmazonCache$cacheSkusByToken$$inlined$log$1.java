package com.revenuecat.purchases.amazon;

import Da.D;
import Qa.l;
import com.revenuecat.purchases.common.LogIntent;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class AmazonCache$cacheSkusByToken$$inlined$log$1 extends u implements Qa.a {
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ Map $receiptsToSkus$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmazonCache$cacheSkusByToken$$inlined$log$1(LogIntent logIntent, Map map) {
        super(0);
        this.$intent = logIntent;
        this.$receiptsToSkus$inlined = map;
    }

    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(D.n0(this.$intent.getEmojiList(), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null));
        sb.append(' ');
        String format = String.format("Caching term skus for receipts: \n %s", Arrays.copyOf(new Object[]{this.$receiptsToSkus$inlined}, 1));
        t.f(format, "format(...)");
        sb.append(format);
        return sb.toString();
    }
}
