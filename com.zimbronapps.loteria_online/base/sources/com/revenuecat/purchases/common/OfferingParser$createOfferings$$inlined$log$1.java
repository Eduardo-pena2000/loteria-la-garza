package com.revenuecat.purchases.common;

import Da.D;
import Qa.l;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class OfferingParser$createOfferings$$inlined$log$1 extends u implements Qa.a {
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ Map $productsById$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferingParser$createOfferings$$inlined$log$1(LogIntent logIntent, Map map) {
        super(0);
        this.$intent = logIntent;
        this.$productsById$inlined = map;
    }

    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(D.n0(this.$intent.getEmojiList(), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null));
        sb.append(' ');
        String format = String.format("Building offerings response with %d products", Arrays.copyOf(new Object[]{Integer.valueOf(this.$productsById$inlined.size())}, 1));
        t.f(format, "format(...)");
        sb.append(format);
        return sb.toString();
    }
}
